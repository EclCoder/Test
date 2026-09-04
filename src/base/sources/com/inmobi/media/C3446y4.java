package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.y4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3446y4 extends gn.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Hi f27907a;

    public C3446y4(Hi hi2) {
        this.f27907a = hi2;
    }

    @Override // gn.e0
    public final gn.a0 contentType() {
        return gn.a0.f(this.f27907a.a());
    }

    @Override // gn.e0
    public final void writeTo(xn.f sink) {
        kotlin.jvm.internal.s.h(sink, "sink");
        this.f27907a.a(sink);
    }
}
