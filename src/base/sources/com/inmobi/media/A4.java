package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class A4 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gn.b0 f24453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gn.d0 f24454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(gn.b0 b0Var, gn.d0 d0Var, kl.f fVar) {
        super(2, fVar);
        this.f24453b = b0Var;
        this.f24454c = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new A4(this.f24453b, this.f24454c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new A4(this.f24453b, this.f24454c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24452a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return obj;
        }
        fl.s.b(obj);
        gn.e eVarA = this.f24453b.a(this.f24454c);
        kotlin.jvm.internal.s.g(eVarA, "newCall(...)");
        this.f24452a = 1;
        em.q qVar = new em.q(ll.b.c(this), 1);
        qVar.H();
        qVar.i(new C3334tl(eVarA));
        eVarA.a(new C3360ul(qVar));
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(this);
        }
        return objB == objF ? objF : objB;
    }
}
