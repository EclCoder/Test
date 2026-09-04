package ql;

import bm.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends i {
    public static final File m(File file, File target, boolean z10, int i10) throws IOException {
        s.h(file, "<this>");
        s.h(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                a.a(fileInputStream, fileOutputStream, i10);
                b.a(fileOutputStream, null);
                b.a(fileInputStream, null);
                return target;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(fileInputStream, th4);
                throw th5;
            }
        }
    }

    public static /* synthetic */ File n(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return m(file, file2, z10, i10);
    }

    public static boolean o(File file) {
        s.h(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : i.k(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    public static String p(File file) {
        s.h(file, "<this>");
        String name = file.getName();
        s.g(name, "getName(...)");
        return r.P0(name, '.', "");
    }

    public static String q(File file) {
        s.h(file, "<this>");
        String name = file.getName();
        s.g(name, "getName(...)");
        return r.T0(name, ".", null, 2, null);
    }

    public static final File r(File file, File relative) {
        s.h(file, "<this>");
        s.h(relative, "relative");
        if (g.b(relative)) {
            return relative;
        }
        String string = file.toString();
        s.g(string, "toString(...)");
        if (string.length() != 0) {
            char c10 = File.separatorChar;
            if (!r.W(string, c10, false, 2, null)) {
                return new File(string + c10 + relative);
            }
        }
        return new File(string + relative);
    }

    public static File s(File file, String relative) {
        s.h(file, "<this>");
        s.h(relative, "relative");
        return r(file, new File(relative));
    }
}
