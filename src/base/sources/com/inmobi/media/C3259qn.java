package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.qn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3259qn extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hm.v f27348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3310sn f27349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3259qn(hm.v vVar, kl.f fVar, C3310sn c3310sn) {
        super(2, fVar);
        this.f27348c = vVar;
        this.f27349d = c3310sn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3259qn c3259qn = new C3259qn(this.f27348c, fVar, this.f27349d);
        c3259qn.f27347b = obj;
        return c3259qn;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3259qn) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27346a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f27347b;
            hm.v vVar = this.f27348c;
            C3233pn c3233pn = new C3233pn(o0Var, this.f27349d);
            this.f27346a = 1;
            if (vVar.collect(c3233pn, this) == objF) {
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
