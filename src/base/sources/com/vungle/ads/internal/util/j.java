package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.vungle.ads.AssetFailedToDeleteError;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    private static final String TAG = "FileUtility";
    public static final j INSTANCE = new j();
    private static a objectInputStreamProvider = new a() { // from class: com.vungle.ads.internal.util.i
        @Override // com.vungle.ads.internal.util.j.a
        public final ObjectInputStream provideObjectInputStream(InputStream inputStream) {
            return j.m178objectInputStreamProvider$lambda0(inputStream);
        }
    };
    private static final List<Class<?>> allowedClasses = gl.r.o(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface a {
        ObjectInputStream provideObjectInputStream(InputStream inputStream);
    }

    private j() {
    }

    public static /* synthetic */ void delete$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        delete(file, set);
    }

    public static final void deleteAndLogIfFailed(File file) {
        kotlin.jvm.internal.s.h(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else {
                if (file.delete()) {
                    return;
                }
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e10) {
            new AssetFailedToDeleteError("Failed to delete " + file.getName() + " with error :" + e10.getMessage()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public static final void deleteContents(File folder, Set<String> set) {
        kotlin.jvm.internal.s.h(folder, "folder");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            delete(file, set);
        }
    }

    public static /* synthetic */ void deleteContents$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        deleteContents(file, set);
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("|  ");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String guessFileName$default(j jVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return jVar.guessFileName(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m178objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new v(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(File file) {
    }

    private final void printFile(File file, int i10, StringBuilder sb2) {
        sb2.append(getIndentString(i10));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0028: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:41), block:B:11:0x0028 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vungle.ads.internal.util.j] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.j] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vungle.ads.internal.util.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vungle.ads.internal.util.j$a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final <T> T readSerializable(File file) {
        Closeable closeable;
        ObjectInputStream objectInputStreamProvideObjectInputStream;
        ?? r10;
        kotlin.jvm.internal.s.h(file, "file");
        ?? Exists = file.exists();
        Closeable closeable2 = null;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
                try {
                    objectInputStreamProvideObjectInputStream = objectInputStreamProvider.provideObjectInputStream(Exists);
                    try {
                        T t10 = (T) objectInputStreamProvideObjectInputStream.readObject();
                        ?? r11 = INSTANCE;
                        r11.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r11.closeQuietly(Exists);
                        return t10;
                    } catch (IOException e10) {
                        e = e10;
                        q.Companion.e(TAG, "IOException: " + e.getMessage());
                        r10 = Exists;
                        ?? r12 = INSTANCE;
                        r12.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r12.closeQuietly(r10);
                        try {
                            delete$default(file, null, 2, null);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e11) {
                        e = e11;
                        q.Companion.e(TAG, "ClassNotFoundException: " + e.getMessage());
                        r10 = Exists;
                        ?? r13 = INSTANCE;
                        r13.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r13.closeQuietly(r10);
                        delete$default(file, null, 2, null);
                        return null;
                    } catch (Exception e12) {
                        e = e12;
                        q.Companion.e(TAG, "cannot read serializable " + e.getMessage());
                        r10 = Exists;
                        ?? r14 = INSTANCE;
                        r14.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r14.closeQuietly(r10);
                        delete$default(file, null, 2, null);
                        return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e14) {
                    e = e14;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e15) {
                    e = e15;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    ?? r15 = INSTANCE;
                    r15.closeQuietly(closeable2);
                    r15.closeQuietly(Exists);
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (ClassNotFoundException e17) {
                e = e17;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Exception e18) {
                e = e18;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                Exists = 0;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable2 = closeable;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void writeSerializable(File file, Serializable serializable) {
        OutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        kotlin.jvm.internal.s.h(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream.writeObject(serializable);
                    objectOutputStream.reset();
                    j jVar = INSTANCE;
                    jVar.closeQuietly(objectOutputStream);
                    jVar.closeQuietly(fileOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    outputStream = fileOutputStream;
                    try {
                        q.Companion.e(TAG, String.valueOf(e.getMessage()));
                        j jVar2 = INSTANCE;
                        jVar2.closeQuietly(objectOutputStream);
                        jVar2.closeQuietly(outputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = outputStream;
                        outputStream = objectOutputStream;
                        j jVar3 = INSTANCE;
                        jVar3.closeQuietly(outputStream);
                        jVar3.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = objectOutputStream;
                    j jVar4 = INSTANCE;
                    jVar4.closeQuietly(outputStream);
                    jVar4.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                objectOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                j jVar5 = INSTANCE;
                jVar5.closeQuietly(outputStream);
                jVar5.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            objectOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    public final a getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final String guessFileName(String url, String str) {
        kotlin.jvm.internal.s.h(url, "url");
        String strGuessFileName = URLUtil.guessFileName(url, null, str);
        kotlin.jvm.internal.s.g(strGuessFileName, "guessFileName(url, null, ext)");
        return strGuessFileName;
    }

    public final boolean isValidUrl(String str) {
        if (str != null) {
            try {
                if (!bm.r.h0(str) && gn.y.f39776j.d(str) != null) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final String readString(File file) {
        kotlin.jvm.internal.s.h(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return ql.f.f(file, null, 1, null);
        } catch (IOException e10) {
            q.Companion.e(TAG, "IOException: " + e10.getMessage());
            return null;
        } catch (Exception e11) {
            q.Companion.e(TAG, "cannot read string " + e11.getMessage());
            return null;
        }
    }

    public final void setObjectInputStreamProvider(a aVar) {
        kotlin.jvm.internal.s.h(aVar, "<set-?>");
        objectInputStreamProvider = aVar;
    }

    public final long size(File file) {
        long size = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                for (File file2 : fileArrListFiles) {
                    size += size(file2);
                }
            }
        }
        return size;
    }

    public final void writeString(File file, String str) {
        kotlin.jvm.internal.s.h(file, "file");
        if (str == null) {
            return;
        }
        try {
            ql.f.g(file, str, bm.d.f9079b);
        } catch (IOException e10) {
            q.Companion.e(TAG, String.valueOf(e10.getMessage()));
        }
    }

    public static final void delete(File file, Set<String> set) {
        String str = mDXVAtwcaFMHJ.XnWBywaYHujB;
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        if (set != null && set.contains(file.getName())) {
                            q.Companion.d(TAG, "Skipping deletion of directory: " + file.getName());
                            return;
                        }
                        deleteContents(file, set);
                    }
                    if (set != null && set.contains(file.getName())) {
                        q.Companion.d(TAG, "Skipping deletion of file: " + file.getName());
                        return;
                    }
                    if (file.delete()) {
                        return;
                    }
                    q.Companion.d(TAG, str + file);
                }
            } catch (Exception e10) {
                q.Companion.e(TAG, str + e10.getLocalizedMessage());
            }
        }
    }

    private final void printDirectoryTree(File file, int i10, StringBuilder sb2) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        sb2.append(getIndentString(i10));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append("/\n");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                printDirectoryTree(file2, i10 + 1, sb2);
            } else {
                kotlin.jvm.internal.s.g(file2, "file");
                printFile(file2, i10 + 1, sb2);
            }
        }
    }
}
