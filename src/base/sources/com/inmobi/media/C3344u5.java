package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3344u5 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3370v5 f27597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3344u5(C3370v5 c3370v5, kl.f fVar) {
        super(2, fVar);
        this.f27597b = c3370v5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3344u5(this.f27597b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3344u5(this.f27597b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27596a;
        if (i10 == 0) {
            fl.s.b(obj);
            AbstractC3288s1 abstractC3288s1 = this.f27597b.f27682b;
            if (abstractC3288s1 != null) {
                abstractC3288s1.a();
            }
            Nc nc2 = this.f27597b.f27681a;
            if (nc2 != null) {
                this.f27596a = 1;
                if (nc2.a(this) == objF) {
                    return objF;
                }
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
