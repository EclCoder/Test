package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class N7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R7 f25323a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N7(kl.f fVar, R7 r10) {
        super(2, fVar);
        this.f25323a = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new N7(fVar, this.f25323a);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new N7((kl.f) obj2, this.f25323a).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        R7 r10 = this.f25323a;
        r10.f25601n.addView(r10.f25602o, 0);
        return fl.g0.f38750a;
    }
}
