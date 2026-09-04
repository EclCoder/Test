package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Y6 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z6 f26068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y6(Z6 z10, kl.f fVar) {
        super(2, fVar);
        this.f26068c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Y6 y10 = new Y6(this.f26068c, fVar);
        y10.f26067b = obj;
        return y10;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Y6 y10 = new Y6(this.f26068c, (kl.f) obj2);
        y10.f26067b = (em.o0) obj;
        return y10.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        em.o0 o0Var;
        Object objF = ll.b.f();
        int i10 = this.f26066a;
        if (i10 == 0) {
            fl.s.b(obj);
            o0Var = (em.o0) this.f26067b;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0Var = (em.o0) this.f26067b;
            fl.s.b(obj);
        }
        while (em.p0.f(o0Var)) {
            Z6 z10 = this.f26068c;
            z10.f26128d.setValue(kotlin.coroutines.jvm.internal.b.a(z10.f26126b.getWindowVisibility() == 0));
            long j10 = this.f26068c.f26127c;
            this.f26067b = o0Var;
            this.f26066a = 1;
            if (em.y0.a(j10, this) == objF) {
                return objF;
            }
        }
        return fl.g0.f38750a;
    }
}
