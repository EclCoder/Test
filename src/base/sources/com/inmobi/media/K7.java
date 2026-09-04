package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class K7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R7 f25104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3050im f25105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(R7 r10, AbstractC3050im abstractC3050im, kl.f fVar) {
        super(2, fVar);
        this.f25104b = r10;
        this.f25105c = abstractC3050im;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new K7(this.f25104b, this.f25105c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new K7(this.f25104b, this.f25105c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25103a;
        if (i10 == 0) {
            fl.s.b(obj);
            hm.v vVar = this.f25104b.f25600m;
            AbstractC3050im abstractC3050im = this.f25105c;
            this.f25103a = 1;
            if (vVar.emit(abstractC3050im, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        return fl.g0.f38750a;
    }
}
