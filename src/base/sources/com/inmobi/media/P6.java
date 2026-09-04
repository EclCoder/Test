package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class P6 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q6 f25466a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P6(Q6 q10, kl.f fVar) {
        super(2, fVar);
        this.f25466a = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new P6(this.f25466a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new P6(this.f25466a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Q6 q10 = this.f25466a;
        Pc pc2 = q10.f25540f;
        InMobiAdRequestStatus status = q10.f25539e;
        pc2.getClass();
        kotlin.jvm.internal.s.h(status, "status");
        pc2.onAdLoadFailed(status);
        return fl.g0.f38750a;
    }
}
