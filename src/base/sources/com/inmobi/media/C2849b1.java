package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;

/* JADX INFO: renamed from: com.inmobi.media.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2849b1 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2926e1 f26242a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2849b1(AbstractC2926e1 abstractC2926e1, kl.f fVar) {
        super(2, fVar);
        this.f26242a = abstractC2926e1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2849b1(this.f26242a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2849b1(this.f26242a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        try {
            AdSession adSession = this.f26242a.f26432c;
            if (adSession != null) {
                adSession.start();
            }
        } catch (Exception e10) {
            AbstractC2926e1 abstractC2926e1 = this.f26242a;
            abstractC2926e1.f26432c = null;
            InterfaceC3322t9 interfaceC3322t9 = abstractC2926e1.f26431b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a(AbstractC2926e1.f26429f, "AdSession start error " + e10);
            }
        }
        return fl.g0.f38750a;
    }
}
