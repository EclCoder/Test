package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Td extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wd f25754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2836ae f25755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Td(Wd wd2, kl.f fVar, C2836ae c2836ae) {
        super(2, fVar);
        this.f25754c = wd2;
        this.f25755d = c2836ae;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Td td2 = new Td(this.f25754c, fVar, this.f25755d);
        td2.f25753b = obj;
        return td2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Td) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25752a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f25753b;
            Wd wd2 = this.f25754c;
            Sd sd2 = new Sd(o0Var, this.f25755d);
            this.f25752a = 1;
            if (wd2.collect(sd2, this) == objF) {
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
