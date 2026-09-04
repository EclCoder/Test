package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class He extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ie f24943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdSessionConfiguration f24944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSessionContext f24945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public He(Ie ie2, AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, kl.f fVar) {
        super(2, fVar);
        this.f24943a = ie2;
        this.f24944b = adSessionConfiguration;
        this.f24945c = adSessionContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new He(this.f24943a, this.f24944b, this.f24945c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((He) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Ie ie2 = this.f24943a;
        AdSessionConfiguration adSessionConfiguration = this.f24944b;
        kotlin.jvm.internal.s.e(adSessionConfiguration);
        AdSessionContext adSessionContext = this.f24945c;
        int i10 = Ie.f25005i;
        ie2.a(adSessionConfiguration, adSessionContext);
        this.f24943a.b();
        this.f24943a.c();
        return fl.g0.f38750a;
    }
}
