package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class En extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3155mn f24737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Gn f24738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public En(C3155mn c3155mn, kl.f fVar, Gn gn2) {
        super(2, fVar);
        this.f24737c = c3155mn;
        this.f24738d = gn2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        En en2 = new En(this.f24737c, fVar, this.f24738d);
        en2.f24736b = obj;
        return en2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((En) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24735a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f24736b;
            C3155mn c3155mn = this.f24737c;
            Dn dn2 = new Dn(o0Var, this.f24738d);
            this.f24735a = 1;
            if (c3155mn.collect(dn2, this) == objF) {
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
