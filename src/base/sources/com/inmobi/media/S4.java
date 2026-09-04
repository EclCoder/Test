package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class S4 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hm.v f25670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3066jc f25671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S4(hm.v vVar, AbstractC3066jc abstractC3066jc, kl.f fVar) {
        super(2, fVar);
        this.f25670b = vVar;
        this.f25671c = abstractC3066jc;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new S4(this.f25670b, this.f25671c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new S4(this.f25670b, this.f25671c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25669a;
        if (i10 == 0) {
            fl.s.b(obj);
            hm.v vVar = this.f25670b;
            AbstractC3066jc abstractC3066jc = this.f25671c;
            this.f25669a = 1;
            if (vVar.emit(abstractC3066jc, this) == objF) {
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
