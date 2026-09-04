package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Qn extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hm.w f25573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Sn f25574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qn(hm.w wVar, kl.f fVar, Sn sn2) {
        super(2, fVar);
        this.f25573c = wVar;
        this.f25574d = sn2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Qn qn2 = new Qn(this.f25573c, fVar, this.f25574d);
        qn2.f25572b = obj;
        return qn2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Qn) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25571a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f25572b;
            hm.w wVar = this.f25573c;
            Pn pn2 = new Pn(o0Var, this.f25574d);
            this.f25571a = 1;
            if (wVar.collect(pn2, this) == objF) {
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
