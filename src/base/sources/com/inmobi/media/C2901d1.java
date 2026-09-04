package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;

/* JADX INFO: renamed from: com.inmobi.media.d1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2901d1 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2926e1 f26383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InteractionType f26384b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2901d1(AbstractC2926e1 abstractC2926e1, InteractionType interactionType, kl.f fVar) {
        super(2, fVar);
        this.f26383a = abstractC2926e1;
        this.f26384b = interactionType;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2901d1(this.f26383a, this.f26384b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2901d1(this.f26383a, this.f26384b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        MediaEvents mediaEvents = this.f26383a.f26433d;
        if (mediaEvents != null) {
            mediaEvents.adUserInteraction(this.f26384b);
        }
        return fl.g0.f38750a;
    }
}
