package com.google.zxing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final boolean f22454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f22455b;

    static {
        f22454a = System.getProperty("surefire.test.class.path") != null;
        f22455b = new StackTraceElement[0];
    }

    ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
