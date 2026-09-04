import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;

public class ghidra_decompile extends GhidraScript {

    @Override
    public void run() throws Exception {

        String[] args = getScriptArgs();

        if (args.length < 1) {
            println("Usage:");
            println("  -postScript ghidra_decompile.java <output-directory>");
            return;
        }

        File outputDir = new File(args[0]);
        File functionsDir = new File(outputDir, "functions");

        if (!functionsDir.exists() && !functionsDir.mkdirs()) {
            printerr("Failed to create: " + functionsDir);
            return;
        }

        File indexFile = new File(outputDir, "index.txt");

        println("Input : " + currentProgram.getExecutablePath());
        println("Output: " + outputDir.getAbsolutePath());

        DecompInterface decompiler = new DecompInterface();
        decompiler.setSimplificationStyle("decompile");

        if (!decompiler.openProgram(currentProgram)) {
            printerr("Failed to initialize Ghidra decompiler.");
            return;
        }

        int total =
            currentProgram
                .getFunctionManager()
                .getFunctionCount();

        int count = 0;
        int success = 0;
        int failed = 0;
        int skipped = 0;

        List<String> indexEntries = new ArrayList<>();

        try (PrintWriter index = new PrintWriter(indexFile)) {

            index.println("# libpairipcore.so function index");
            index.println("# Address<TAB>Function<TAB>File");
            index.println();

            FunctionIterator functions =
                currentProgram
                    .getFunctionManager()
                    .getFunctions(true);

            while (functions.hasNext() && !monitor.isCancelled()) {

                Function function = functions.next();
                count++;

                Address address = function.getEntryPoint();
                String addressString = address.toString();

                String functionName = function.getName();

                println(
                    "[" + count + "/" + total + "] "
                    + addressString + " "
                    + functionName
                );

                /*
                 * External functions have no actual code inside the
                 * imported binary. Skip them.
                 */
                if (function.isExternal()) {
                    skipped++;
                    continue;
                }

                /*
                 * Sanitize function name so it is safe as a filename.
                 */
                String safeName =
                    functionName
                        .replaceAll("[\\\\/:*?\"<>|]", "_")
                        .replaceAll("\\s+", "_");

                /*
                 * Keep the address in the filename so duplicate or
                 * automatically generated names cannot collide.
                 */
                String fileName =
                    addressString + "_" + safeName + ".c";

                File outputFile =
                    new File(functionsDir, fileName);

                DecompileResults result =
                    decompiler.decompileFunction(
                        function,
                        60,
                        monitor
                    );

                if (
                    result != null
                    && result.decompileCompleted()
                    && result.getDecompiledFunction() != null
                ) {

                    try (PrintWriter out =
                            new PrintWriter(outputFile)) {

                        out.println("/*");
                        out.println(" * Ghidra decompilation");
                        out.println(" *");
                        out.println(" * Binary   : "
                            + currentProgram.getName());
                        out.println(" * Function : "
                            + functionName);
                        out.println(" * Address  : "
                            + addressString);
                        out.println(" *");
                        out.println(" * WARNING:");
                        out.println(" * This is C-like pseudocode generated");
                        out.println(" * by Ghidra. It is NOT the original");
                        out.println(" * C/C++ source code.");
                        out.println(" */");
                        out.println();

                        out.println(
                            result
                                .getDecompiledFunction()
                                .getC()
                        );
                    }

                    index.println(
                        addressString
                        + "\t"
                        + functionName
                        + "\t"
                        + "functions/" + fileName
                    );

                    success++;

                } else {

                    failed++;

                    index.println(
                        addressString
                        + "\t"
                        + functionName
                        + "\t"
                        + "[DECOMPILE FAILED]"
                    );
                }
            }
        }

        decompiler.dispose();

        println("");
        println("========================================");
        println("Decompilation finished");
        println("========================================");
        println("Functions : " + total);
        println("Succeeded : " + success);
        println("Failed    : " + failed);
        println("Skipped   : " + skipped);
        println("Output    : " + outputDir.getAbsolutePath());
        println("Index     : " + indexFile.getAbsolutePath());
        println("========================================");
    }
}