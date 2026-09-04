package androidx.media3.common;

import t1.a0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class IllegalSeekPositionException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f4608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4610c;

    public IllegalSeekPositionException(a0 a0Var, int i10, long j10) {
        this.f4608a = a0Var;
        this.f4609b = i10;
        this.f4610c = j10;
    }
}
