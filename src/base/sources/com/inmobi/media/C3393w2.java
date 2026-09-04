package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;

/* JADX INFO: renamed from: com.inmobi.media.w2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3393w2 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3444y2 f27756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastProperties f27757b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3393w2(AbstractC3444y2 abstractC3444y2, VastProperties vastProperties, kl.f fVar) {
        super(2, fVar);
        this.f27756a = abstractC3444y2;
        this.f27757b = vastProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3393w2(this.f27756a, this.f27757b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3393w2(this.f27756a, this.f27757b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        AdEvents adEvents = this.f27756a.f26434e;
        if (adEvents != null) {
            adEvents.loaded(this.f27757b);
        }
        return fl.g0.f38750a;
    }
}
