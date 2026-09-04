package com.google.android.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ExoTimeoutException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16417a;

    public ExoTimeoutException(int i10) {
        super(a(i10));
        this.f16417a = i10;
    }

    private static String a(int i10) {
        if (i10 == 1) {
            return "Player release timed out.";
        }
        if (i10 != 2) {
            return i10 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
