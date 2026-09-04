package org.aspectj.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class SoftException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f49434b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Throwable f49435a;

    static {
        boolean z10;
        try {
            Class.forName("java.nio.Buffer");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f49434b = z10;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f49435a;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Throwable th2 = this.f49435a;
        if (f49434b || th2 == null) {
            return;
        }
        printStream.print("Caused by: ");
        th2.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Throwable th2 = this.f49435a;
        if (f49434b || th2 == null) {
            return;
        }
        printWriter.print("Caused by: ");
        th2.printStackTrace(printWriter);
    }
}
