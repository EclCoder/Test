package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Cd extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fd f24595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ld f24596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cd(Fd fd2, kl.f fVar, Ld ld2) {
        super(2, fVar);
        this.f24595c = fd2;
        this.f24596d = ld2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Cd cd2 = new Cd(this.f24595c, fVar, this.f24596d);
        cd2.f24594b = obj;
        return cd2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Cd) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24593a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f24594b;
            Fd fd2 = this.f24595c;
            Bd bd2 = new Bd(o0Var, this.f24596d);
            this.f24593a = 1;
            if (fd2.collect(bd2, this) == objF) {
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
