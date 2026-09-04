package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3419x2 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3444y2 f27827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3050im f27828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3419x2(AbstractC3444y2 abstractC3444y2, AbstractC3050im abstractC3050im, kl.f fVar) {
        super(2, fVar);
        this.f27827a = abstractC3444y2;
        this.f27828b = abstractC3050im;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3419x2(this.f27827a, this.f27828b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3419x2(this.f27827a, this.f27828b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        AbstractC3444y2 abstractC3444y2 = this.f27827a;
        AbstractC3050im abstractC3050im = this.f27828b;
        int i10 = AbstractC3444y2.f27904h;
        abstractC3444y2.b(abstractC3050im);
        return fl.g0.f38750a;
    }
}
