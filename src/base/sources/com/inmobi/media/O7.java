package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class O7 extends kl.a implements em.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R7 f25402a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O7(em.l0.a aVar, R7 r10) {
        super(aVar);
        this.f25402a = r10;
    }

    @Override // em.l0
    public final void handleException(kl.j jVar, Throwable th2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f25402a.f25589b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("HtmlMediaPlayer", "Unhandled exception: " + th2.getMessage());
        }
        fl.k kVar = W9.f25935a;
        W9.a(new M2(th2));
    }
}
