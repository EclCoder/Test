package com.google.zxing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FormatException f22452c;

    static {
        FormatException formatException = new FormatException();
        f22452c = formatException;
        formatException.setStackTrace(ReaderException.f22455b);
    }

    private FormatException() {
    }

    public static FormatException d() {
        return ReaderException.f22454a ? new FormatException() : f22452c;
    }
}
