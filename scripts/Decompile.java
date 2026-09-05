import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.app.util.headless.HeadlessScript;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;
import ghidra.program.model.listing.Program;
import ghidra.program.model.listing.FunctionManager;
import ghidra.program.model.address.Address;
import ghidra.program.model.mem.Memory;
import ghidra.program.model.mem.MemoryBlock;
import ghidra.util.task.ConsoleTaskMonitor;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Decompile extends HeadlessScript {

    /*
     * ============================================================
     * Function information
     * ============================================================
     */

    private static class FunctionInfo {

        Function function;
        int index;

        boolean staticJni;
        boolean dynamicJni;

        FunctionInfo(
            Function function,
            int index,
            boolean staticJni,
            boolean dynamicJni
        ) {
            this.function = function;
            this.index = index;
            this.staticJni = staticJni;
            this.dynamicJni = dynamicJni;
        }

        boolean isJni() {
            return staticJni || dynamicJni;
        }

        String getJniType() {

            if (staticJni && dynamicJni) {
                return "YES / DYNAMIC";
            }

            if (staticJni) {
                return "YES";
            }

            if (dynamicJni) {
                return "DYNAMIC";
            }

            return "NO";
        }
    }


    /*
     * ============================================================
     * Dynamic JNI information
     * ============================================================
     */

    private static class DynamicJniInfo {

        String methodName;
        String signature;

        Address nativeAddress;
        Function nativeFunction;

        DynamicJniInfo(
            String methodName,
            String signature,
            Address nativeAddress,
            Function nativeFunction
        ) {
            this.methodName = methodName;
            this.signature = signature;
            this.nativeAddress = nativeAddress;
            this.nativeFunction = nativeFunction;
        }
    }


    /*
     * ============================================================
     * Static JNI detection
     * ============================================================
     */

    private boolean isStaticJni(Function function) {

        String name = function.getName();

        if (name.startsWith("Java_")) {
            return true;
        }

        if (name.equals("JNI_OnLoad")) {
            return true;
        }

        return false;
    }


    /*
     * ============================================================
     * Read native pointer from memory.
     * Supports ARM32 / ARM64 and other pointer sizes.
     * ============================================================
     */

    private Address readPointer(
        Program program,
        Address address
    ) throws Exception {

        Memory memory =
            program.getMemory();

        int pointerSize =
            program.getDefaultPointerSize();

        long value;

        if (pointerSize == 4) {

            value =
                Integer.toUnsignedLong(
                    memory.getInt(address)
                );

        } else if (pointerSize == 8) {

            value =
                memory.getLong(address);

        } else {

            return null;
        }

        if (value == 0) {
            return null;
        }

        try {

            return program.getAddressFactory()
                .getDefaultAddressSpace()
                .getAddress(value);

        } catch (Exception e) {

            return null;
        }
    }


    /*
     * ============================================================
     * Read null-terminated ASCII string.
     * ============================================================
     */

    private String readAsciiString(
        Program program,
        Address address
    ) {

        if (address == null) {
            return null;
        }

        Memory memory =
            program.getMemory();

        StringBuilder sb =
            new StringBuilder();

        try {

            for (int i = 0; i < 1024; i++) {

                byte b =
                    memory.getByte(
                        address.add(i)
                    );

                if (b == 0) {
                    break;
                }

                /*
                 * JNI strings are normally ASCII/UTF-8.
                 * Reject obvious binary data.
                 */

                int c =
                    b & 0xff;

                if (c < 0x20 || c > 0x7e) {
                    return null;
                }

                sb.append(
                    (char)c
                );
            }

        } catch (Exception e) {

            return null;
        }

        if (sb.length() == 0) {
            return null;
        }

        return sb.toString();
    }


    /*
     * ============================================================
     * Basic JNI method name validation.
     * ============================================================
     */

    private boolean looksLikeJniMethodName(
        String name
    ) {

        if (name == null || name.length() == 0) {
            return false;
        }

        /*
         * JNI method names are normally identifiers.
         *
         * Examples:
         * checkLicense
         * nativeInit
         * verify
         * a
         */

        for (int i = 0; i < name.length(); i++) {

            char c =
                name.charAt(i);

            if (
                Character.isLetterOrDigit(c)
                || c == '_'
                || c == '$'
                || c == '<'
                || c == '>'
            ) {
                continue;
            }

            return false;
        }

        return true;
    }


    /*
     * ============================================================
     * Basic JNI signature validation.
     * ============================================================
     */

    private boolean looksLikeJniSignature(
        String signature
    ) {

        if (signature == null) {
            return false;
        }

        if (signature.length() < 3) {
            return false;
        }

        /*
         * Normal JNI signatures start with '('.
         */

        if (!signature.startsWith("(")) {
            return false;
        }

        /*
         * Must contain ')' separating arguments
         * and return type.
         */

        int close =
            signature.indexOf(')');

        if (close < 0) {
            return false;
        }

        if (close == signature.length() - 1) {
            return false;
        }

        return true;
    }


    /*
     * ============================================================
     * Check whether address belongs to a known function.
     * ============================================================
     */

    private Function getFunctionAt(
        Program program,
        Address address
    ) {

        if (address == null) {
            return null;
        }

        return program.getFunctionManager()
            .getFunctionAt(address);
    }


    /*
     * ============================================================
     * Scan memory for structures resembling:
     *
     * struct JNINativeMethod {
     *     char *name;
     *     char *signature;
     *     void *fnPtr;
     * };
     *
     * This is a heuristic detector.
     * ============================================================
     */

    private List<DynamicJniInfo> findDynamicJniMethods(
        Program program
    ) {

        List<DynamicJniInfo> result =
            new ArrayList<>();

        Memory memory =
            program.getMemory();

        int pointerSize =
            program.getDefaultPointerSize();


        /*
         * Avoid reporting the same native address
         * multiple times.
         */

        Set<String> seen =
            new HashSet<>();


        MemoryBlock[] blocks =
            memory.getBlocks();


        for (MemoryBlock block : blocks) {

            /*
             * Only initialized memory.
             */

            if (!block.isInitialized()) {
                continue;
            }

            /*
             * Usually JNINativeMethod arrays are in
             * readable data / rodata sections.
             *
             * Skip executable blocks.
             */

            if (block.isExecute()) {
                continue;
            }


            Address start =
                block.getStart();

            Address end =
                block.getEnd();


            /*
             * Iterate at pointer alignment.
             */

            Address current =
                start;

            while (
                current.compareTo(end) <= 0
            ) {

                try {

                    /*
                     * Need three complete pointers.
                     */

                    Address p1 =
                        readPointer(
                            program,
                            current
                        );

                    if (p1 == null) {
                        current =
                            current.add(pointerSize);
                        continue;
                    }


                    Address p2 =
                        readPointer(
                            program,
                            current.add(pointerSize)
                        );

                    if (p2 == null) {
                        current =
                            current.add(pointerSize);
                        continue;
                    }


                    Address p3 =
                        readPointer(
                            program,
                            current.add(
                                pointerSize * 2
                            )
                        );

                    if (p3 == null) {
                        current =
                            current.add(pointerSize);
                        continue;
                    }


                    /*
                     * First pointer = method name.
                     */

                    String methodName =
                        readAsciiString(
                            program,
                            p1
                        );

                    if (
                        !looksLikeJniMethodName(
                            methodName
                        )
                    ) {

                        current =
                            current.add(pointerSize);

                        continue;
                    }


                    /*
                     * Second pointer = JNI signature.
                     */

                    String signature =
                        readAsciiString(
                            program,
                            p2
                        );

                    if (
                        !looksLikeJniSignature(
                            signature
                        )
                    ) {

                        current =
                            current.add(pointerSize);

                        continue;
                    }


                    /*
                     * Third pointer = native function.
                     */

                    Function nativeFunction =
                        getFunctionAt(
                            program,
                            p3
                        );

                    if (nativeFunction == null) {

                        /*
                         * On ARM, function pointers can
                         * sometimes have Thumb bit set.
                         *
                         * Try address - 1.
                         */

                        try {

                            Address thumbAddress =
                                program
                                    .getAddressFactory()
                                    .getDefaultAddressSpace()
                                    .getAddress(
                                        p3.getOffset() & ~1L
                                    );

                            nativeFunction =
                                getFunctionAt(
                                    program,
                                    thumbAddress
                                );

                            if (
                                nativeFunction != null
                            ) {
                                p3 =
                                    thumbAddress;
                            }

                        } catch (Exception ignored) {
                        }
                    }


                    if (nativeFunction == null) {

                        current =
                            current.add(pointerSize);

                        continue;
                    }


                    /*
                     * Don't duplicate entries.
                     */

                    String key =
                        methodName
                        + "\n"
                        + signature
                        + "\n"
                        + p3;


                    if (!seen.contains(key)) {

                        seen.add(key);

                        result.add(
                            new DynamicJniInfo(
                                methodName,
                                signature,
                                p3,
                                nativeFunction
                            )
                        );
                    }

                } catch (Exception ignored) {

                    /*
                     * Bad memory access or malformed
                     * structure. Continue scanning.
                     */
                }


                current =
                    current.add(pointerSize);
            }
        }


        return result;
    }


    /*
     * ============================================================
     * Main
     * ============================================================
     */

    @Override
    public void run() throws Exception {

        final Program program =
            currentProgram;

        String[] args =
            getScriptArgs();


        /*
         * --------------------------------------------------------
         * Arguments
         *
         * arg 1 = functions per file
         * arg 2 = output directory
         * arg 3 = worker count
         * --------------------------------------------------------
         */

        int functionsPerFile = 20;

        String outputDir =
            "decompiled";

        int workerCount = 3;


        if (args.length >= 1) {

            functionsPerFile =
                Integer.parseInt(args[0]);

            if (functionsPerFile <= 0) {
                throw new IllegalArgumentException(
                    "functionsPerFile must be > 0"
                );
            }
        }


        if (args.length >= 2) {

            outputDir =
                args[1];
        }


        if (args.length >= 3) {

            workerCount =
                Integer.parseInt(args[2]);

            if (workerCount <= 0) {
                throw new IllegalArgumentException(
                    "workerCount must be > 0"
                );
            }
        }


        /*
         * --------------------------------------------------------
         * Output directory
         * --------------------------------------------------------
         */

        final File dir =
            new File(outputDir);

        if (!dir.exists()) {

            if (!dir.mkdirs()) {

                throw new Exception(
                    "Cannot create output directory: "
                    + dir.getAbsolutePath()
                );
            }
        }


        println(
            "============================================"
        );

        println(
            "Ghidra Native Decompiler"
        );

        println(
            "Program: "
            + program.getName()
        );

        println(
            "Functions/file: "
            + functionsPerFile
        );

        println(
            "Workers: "
            + workerCount
        );

        println(
            "Output: "
            + dir.getAbsolutePath()
        );

        println(
            "============================================"
        );


        /*
         * --------------------------------------------------------
         * Dynamic JNI scan
         * --------------------------------------------------------
         */

        println(
            "Scanning for JNINativeMethod tables..."
        );

        final List<DynamicJniInfo> dynamicMethods =
            findDynamicJniMethods(program);


        println(
            "Potential dynamic JNI methods: "
            + dynamicMethods.size()
        );


        /*
         * --------------------------------------------------------
         * Build set of dynamic JNI native addresses
         * --------------------------------------------------------
         */

        final Set<Address> dynamicJniAddresses =
            new HashSet<>();


        for (
            DynamicJniInfo info :
            dynamicMethods
        ) {

            dynamicJniAddresses.add(
                info.nativeAddress
            );
        }


        /*
         * --------------------------------------------------------
         * Collect functions
         * --------------------------------------------------------
         */

        final List<FunctionInfo> functions =
            new ArrayList<>();

        FunctionIterator iterator =
            program.getFunctionManager()
                .getFunctions(true);

        int index = 1;

        while (iterator.hasNext()) {

            Function function =
                iterator.next();

            boolean staticJni =
                isStaticJni(function);

            boolean dynamicJni =
                dynamicJniAddresses.contains(
                    function.getEntryPoint()
                );

            functions.add(
                new FunctionInfo(
                    function,
                    index,
                    staticJni,
                    dynamicJni
                )
            );

            index++;
        }


        /*
         * --------------------------------------------------------
         * Create batches
         * --------------------------------------------------------
         */

        final List<List<FunctionInfo>> batches =
            new ArrayList<>();

        for (
            int start = 0;
            start < functions.size();
            start += functionsPerFile
        ) {

            int end =
                Math.min(
                    start + functionsPerFile,
                    functions.size()
                );

            List<FunctionInfo> batch =
                new ArrayList<>(
                    functions.subList(
                        start,
                        end
                    )
                );

            batches.add(batch);
        }


        println(
            "Total functions: "
            + functions.size()
        );

        println(
            "Total batches: "
            + batches.size()
        );


        /*
         * --------------------------------------------------------
         * JNI index
         * --------------------------------------------------------
         */

        final List<String> jniEntries =
            Collections.synchronizedList(
                new ArrayList<String>()
            );


        /*
         * --------------------------------------------------------
         * Worker pool
         * --------------------------------------------------------
         */

        ExecutorService executor =
            Executors.newFixedThreadPool(
                workerCount
            );


        for (
            int batchIndex = 0;
            batchIndex < batches.size();
            batchIndex++
        ) {

            final int currentBatch =
                batchIndex;

            final List<FunctionInfo> batch =
                batches.get(batchIndex);


            executor.submit(
                new Runnable() {

                    @Override
                    public void run() {

                        DecompInterface decompiler =
                            new DecompInterface();

                        try {

                            if (!decompiler.openProgram(
                                    program)) {

                                throw new RuntimeException(
                                    "Worker could not open program"
                                );
                            }


                            String filename =
                                String.format(
                                    "part_%03d.c",
                                    currentBatch + 1
                                );


                            File outputFile =
                                new File(
                                    dir,
                                    filename
                                );


                            System.out.println(
                                "[Worker "
                                + Thread.currentThread().getId()
                                + "] Starting "
                                + filename
                                + " ("
                                + batch.size()
                                + " functions)"
                            );


                            PrintWriter writer =
                                new PrintWriter(
                                    outputFile
                                );


                            try {

                                writer.println(
                                    "// ============================================================"
                                );

                                writer.println(
                                    "// Decompiled by Ghidra"
                                );

                                writer.println(
                                    "// Program: "
                                    + program.getName()
                                );

                                writer.println(
                                    "// Functions: "
                                    + batch.get(0).index
                                    + "-"
                                    + batch.get(
                                        batch.size() - 1
                                    ).index
                                );

                                writer.println(
                                    "// ============================================================"
                                );

                                writer.println();


                                for (
                                    FunctionInfo info :
                                    batch
                                ) {

                                    Function function =
                                        info.function;


                                    writer.println(
                                        "// ============================================================"
                                    );

                                    writer.println(
                                        "// Function #"
                                        + info.index
                                    );

                                    writer.println(
                                        "// Name: "
                                        + function.getName()
                                    );

                                    writer.println(
                                        "// Address: "
                                        + function.getEntryPoint()
                                    );

                                    writer.println(
                                        "// JNI: "
                                        + info.getJniType()
                                    );

                                    writer.println(
                                        "// ============================================================"
                                    );

                                    writer.println();


                                    DecompileResults result =
                                        decompiler.decompileFunction(
                                            function,
                                            60,
                                            new ConsoleTaskMonitor()
                                        );


                                    if (
                                        result.decompileCompleted()
                                        &&
                                        result.getDecompiledFunction()
                                            != null
                                    ) {

                                        writer.println(
                                            result
                                                .getDecompiledFunction()
                                                .getC()
                                        );

                                    } else {

                                        writer.println(
                                            "/*"
                                        );

                                        writer.println(
                                            " * DECOMPILATION FAILED"
                                        );

                                        writer.println(
                                            " * Function: "
                                            + function.getName()
                                        );

                                        writer.println(
                                            " * Address: "
                                            + function.getEntryPoint()
                                        );

                                        writer.println(
                                            " */"
                                        );
                                    }


                                    writer.println();
                                    writer.println();


                                    /*
                                     * JNI index
                                     */

                                    if (info.isJni()) {

                                        String entry =
                                            function.getName()
                                            + "\n"
                                            + "  Address: "
                                            + function.getEntryPoint()
                                            + "\n"
                                            + "  Function #: "
                                            + info.index
                                            + "\n"
                                            + "  File: "
                                            + filename
                                            + "\n"
                                            + "  JNI: "
                                            + info.getJniType()
                                            + "\n";

                                        jniEntries.add(
                                            entry
                                        );
                                    }
                                }

                            } finally {

                                writer.close();
                            }


                            System.out.println(
                                "[Worker "
                                + Thread.currentThread().getId()
                                + "] Finished "
                                + filename
                            );

                        } catch (Exception e) {

                            System.err.println(
                                "[Worker "
                                + Thread.currentThread().getId()
                                + "] ERROR: "
                                + e.getMessage()
                            );

                            e.printStackTrace();

                        } finally {

                            decompiler.dispose();
                        }
                    }
                }
            );
        }


        /*
         * --------------------------------------------------------
         * Wait for workers
         * --------------------------------------------------------
         */

        executor.shutdown();

        boolean finished =
            executor.awaitTermination(
                7,
                TimeUnit.DAYS
            );


        if (!finished) {

            executor.shutdownNow();

            throw new Exception(
                "Workers did not finish in time."
            );
        }


        /*
         * --------------------------------------------------------
         * Sort normal JNI entries
         * --------------------------------------------------------
         */

        Collections.sort(
            jniEntries
        );


        /*
         * --------------------------------------------------------
         * Write JNI index
         * --------------------------------------------------------
 */

        File jniFile =
            new File(
                dir,
                "jni_functions.txt"
            );


        PrintWriter jniWriter =
            new PrintWriter(jniFile);


        try {

            jniWriter.println(
                "JNI FUNCTIONS"
            );

            jniWriter.println(
                "============="
            );

            jniWriter.println();


            /*
             * Static JNI
             */

            jniWriter.println(
                "STATIC JNI"
            );

            jniWriter.println(
                "----------"
            );

            jniWriter.println();

            for (
                FunctionInfo info :
                functions
            ) {

                if (!info.staticJni) {
                    continue;
                }

                String filename =
                    String.format(
                        "part_%03d.c",
                        (info.index - 1)
                        / functionsPerFile
                        + 1
                    );

                jniWriter.println(
                    info.function.getName()
                );

                jniWriter.println(
                    "  Address: "
                    + info.function.getEntryPoint()
                );

                jniWriter.println(
                    "  Function #: "
                    + info.index
                );

                jniWriter.println(
                    "  File: "
                    + filename
                );

                jniWriter.println(
                    "  JNI: YES"
                );

                jniWriter.println();
            }


            /*
             * Dynamic JNI
             */

            jniWriter.println(
                "DYNAMIC JNI"
            );

            jniWriter.println(
                "-----------"
            );

            jniWriter.println();


            if (dynamicMethods.isEmpty()) {

                jniWriter.println(
                    "No dynamic JNI methods detected."
                );

                jniWriter.println();

            } else {

                for (
                    DynamicJniInfo info :
                    dynamicMethods
                ) {

                    Function nativeFunction =
                        info.nativeFunction;


                    int functionNumber = -1;

                    String filename =
                        "UNKNOWN";


                    for (
                        FunctionInfo fi :
                        functions
                    ) {

                        if (
                            fi.function
                                .getEntryPoint()
                                .equals(
                                    info.nativeAddress
                                )
                        ) {

                            functionNumber =
                                fi.index;

                            filename =
                                String.format(
                                    "part_%03d.c",
                                    (fi.index - 1)
                                    / functionsPerFile
                                    + 1
                                );

                            break;
                        }
                    }


                    jniWriter.println(
                        "Java method: "
                        + info.methodName
                    );

                    jniWriter.println(
                        "Signature: "
                        + info.signature
                    );

                    jniWriter.println(
                        "Native: "
                        + nativeFunction.getName()
                    );

                    jniWriter.println(
                        "Address: "
                        + info.nativeAddress
                    );

                    if (functionNumber >= 0) {

                        jniWriter.println(
                            "Function #: "
                            + functionNumber
                        );
                    }

                    jniWriter.println(
                        "File: "
                        + filename
                    );

                    jniWriter.println(
                        "JNI: DYNAMIC"
                    );

                    jniWriter.println();

                }
            }


            /*
             * Summary
             */

            jniWriter.println(
                "SUMMARY"
            );

            jniWriter.println(
                "-------"
            );

            jniWriter.println();

            int staticCount = 0;

            for (
                FunctionInfo info :
                functions
            ) {

                if (info.staticJni) {
                    staticCount++;
                }
            }

            jniWriter.println(
                "Static JNI functions: "
                + staticCount
            );

            jniWriter.println(
                "Dynamic JNI methods: "
                + dynamicMethods.size()
            );

            jniWriter.println();

        } finally {

            jniWriter.close();
        }


        /*
         * --------------------------------------------------------
         * Finished
         * --------------------------------------------------------
         */

        println(
            "============================================"
        );

        println(
            "Finished."
        );

        println(
            "Functions: "
            + functions.size()
        );

        println(
            "Batches: "
            + batches.size()
        );

        println(
            "Workers: "
            + workerCount
        );

        println(
            "Static JNI: "
            + functions.stream()
                .filter(f -> f.staticJni)
                .count()
        );

        println(
            "Dynamic JNI methods: "
            + dynamicMethods.size()
        );

        println(
            "Output: "
            + dir.getAbsolutePath()
        );

        println(
            "============================================"
        );
    }
}