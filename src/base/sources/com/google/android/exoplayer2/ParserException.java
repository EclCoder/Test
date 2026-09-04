package com.google.android.exoplayer2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ParserException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16422b;

    protected ParserException(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f16421a = z10;
        this.f16422b = i10;
    }

    public static ParserException a(String str, Throwable th2) {
        return new ParserException(str, th2, true, 1);
    }

    public static ParserException b(String str, Throwable th2) {
        return new ParserException(str, th2, true, 0);
    }

    public static ParserException c(String str, Throwable th2) {
        return new ParserException(str, th2, true, 4);
    }

    public static ParserException d(String str, Throwable th2) {
        return new ParserException(str, th2, false, 4);
    }

    public static ParserException e(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f16421a + ", dataType=" + this.f16422b + "}";
    }
}
