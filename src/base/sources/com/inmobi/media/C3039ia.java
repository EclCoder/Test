package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ia, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3039ia extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3453yb f26735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3039ia(C3453yb c3453yb, kl.f fVar) {
        super(2, fVar);
        this.f26735b = c3453yb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3039ia(this.f26735b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3039ia(this.f26735b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26734a;
        if (i10 == 0) {
            fl.s.b(obj);
            Fb fb2 = (Fb) Gb.f24849a.getValue();
            C3453yb c3453yb = this.f26735b;
            this.f26734a = 1;
            if (fb2.b(c3453yb, this) == objF) {
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
