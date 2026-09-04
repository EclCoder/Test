package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.mb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3143mb extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3169nb f26992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3143mb(C3169nb c3169nb, kl.f fVar) {
        super(2, fVar);
        this.f26992a = c3169nb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3143mb(this.f26992a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3143mb(this.f26992a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C3169nb c3169nb = this.f26992a;
        c3169nb.f27050f.onAdLoadFailed(c3169nb.f27049e);
        return fl.g0.f38750a;
    }
}
