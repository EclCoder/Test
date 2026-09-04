package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3159n1 extends kl.a implements em.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3185o1 f27024a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3159n1(em.l0.a aVar, C3185o1 c3185o1) {
        super(aVar);
        this.f27024a = c3185o1;
    }

    @Override // em.l0
    public final void handleException(kl.j jVar, Throwable th2) {
        C3348u9 c3348u9 = this.f27024a.f27105c;
        if (c3348u9 != null) {
            c3348u9.b("AdUnitManager", "Exception: " + fl.e.b(th2));
        }
        fl.k kVar = W9.f25935a;
        W9.a(new M2(th2));
    }
}
