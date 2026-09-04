package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ea extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.jvm.internal.m f24704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Ea(tl.o oVar, kl.f fVar) {
        super(2, fVar);
        this.f24704c = (kotlin.coroutines.jvm.internal.m) oVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.m, tl.o] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Ea ea2 = new Ea(this.f24704c, fVar);
        ea2.f24703b = obj;
        return ea2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.m, tl.o] */
    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Ea ea2 = new Ea(this.f24704c, (kl.f) obj2);
        ea2.f24703b = (em.o0) obj;
        return ea2.invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.m, tl.o] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24702a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f24703b;
            ?? r10 = this.f24704c;
            this.f24702a = 1;
            if (r10.invoke(o0Var, this) == objF) {
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
