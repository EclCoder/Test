package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.pm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3232pm extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hm.w f27283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fm f27284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3232pm(hm.w wVar, kl.f fVar, Fm fm2) {
        super(2, fVar);
        this.f27283c = wVar;
        this.f27284d = fm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3232pm c3232pm = new C3232pm(this.f27283c, fVar, this.f27284d);
        c3232pm.f27282b = obj;
        return c3232pm;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3232pm) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27281a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f27282b;
            hm.w wVar = this.f27283c;
            C3206om c3206om = new C3206om(o0Var, this.f27284d);
            this.f27281a = 1;
            if (wVar.collect(c3206om, this) == objF) {
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
