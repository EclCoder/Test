package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.jo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3078jo extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3104ko f26828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3078jo(AbstractC3104ko abstractC3104ko, kl.f fVar) {
        super(2, fVar);
        this.f26828b = abstractC3104ko;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3078jo(this.f26828b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3078jo(this.f26828b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26827a;
        if (i10 == 0) {
            fl.s.b(obj);
            long jC = this.f26828b.c();
            this.f26827a = 1;
            if (em.y0.a(jC, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        ((Runnable) this.f26828b.f26884j.getValue()).run();
        return fl.g0.f38750a;
    }
}
