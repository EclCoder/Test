package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.y7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3449y7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B7 f27925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R7 f27926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3449y7(B7 b10, kl.f fVar, R7 r10) {
        super(2, fVar);
        this.f27925c = b10;
        this.f27926d = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3449y7 c3449y7 = new C3449y7(this.f27925c, fVar, this.f27926d);
        c3449y7.f27924b = obj;
        return c3449y7;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3449y7) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27923a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f27924b;
            B7 b10 = this.f27925c;
            C3424x7 c3424x7 = new C3424x7(o0Var, this.f27926d);
            this.f27923a = 1;
            if (b10.collect(c3424x7, this) == objF) {
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
