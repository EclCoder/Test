package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3091kb extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3117lb f26854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3091kb(C3117lb c3117lb, kl.f fVar) {
        super(2, fVar);
        this.f26854a = c3117lb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3091kb(this.f26854a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3091kb(this.f26854a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C3117lb c3117lb = this.f26854a;
        Pc pc2 = c3117lb.f26938f;
        InMobiAdRequestStatus status = c3117lb.f26937e;
        pc2.getClass();
        kotlin.jvm.internal.s.h(status, "status");
        pc2.onAdLoadFailed(status);
        return fl.g0.f38750a;
    }
}
