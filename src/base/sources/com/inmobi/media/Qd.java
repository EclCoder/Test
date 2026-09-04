package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Qd extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rd f25556c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qd(Rd rd2, kl.f fVar) {
        super(2, fVar);
        this.f25556c = rd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Qd qd2 = new Qd(this.f25556c, fVar);
        qd2.f25555b = obj;
        return qd2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Qd qd2 = new Qd(this.f25556c, (kl.f) obj2);
        qd2.f25555b = (gm.s) obj;
        return qd2.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25554a;
        if (i10 == 0) {
            fl.s.b(obj);
            gm.s sVar = (gm.s) this.f25555b;
            Rd rd2 = this.f25556c;
            hm.v vVar = rd2.f25636a.f26519a;
            Pd pd2 = new Pd(rd2, sVar);
            this.f25554a = 1;
            if (vVar.collect(pd2, this) == objF) {
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
