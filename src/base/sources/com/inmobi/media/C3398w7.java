package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.w7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3398w7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R7 f27762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3398w7(kl.f fVar, R7 r10) {
        super(2, fVar);
        this.f27762a = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3398w7(fVar, this.f27762a);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3398w7((kl.f) obj2, this.f27762a).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        R7 r10 = this.f27762a;
        r10.f25603p.q(r10.B);
        return fl.g0.f38750a;
    }
}
