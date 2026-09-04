package com.google.android.exoplayer2.source.rtsp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f0 implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f17987a;

    public f0(long j10) {
        this.f17987a = j10;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b.a
    public b a(int i10) {
        e0 e0Var = new e0(this.f17987a);
        e0Var.h(ya.b.a(i10 * 2));
        return e0Var;
    }
}
