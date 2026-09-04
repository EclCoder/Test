package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.l4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3110l4 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3136m4 f26923b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3110l4(C3136m4 c3136m4, kl.f fVar) {
        super(2, fVar);
        this.f26923b = c3136m4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3110l4(this.f26923b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3110l4(this.f26923b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26922a;
        if (i10 == 0) {
            fl.s.b(obj);
            C3136m4 c3136m4 = this.f26923b;
            this.f26922a = 1;
            Object objCollect = hm.g.s(new Dh(new Eh((C2929e4) c3136m4.f26973b.f27031b.getValue()), null)).collect(new C3033i4(c3136m4), this);
            if (objCollect != ll.b.f()) {
                objCollect = fl.g0.f38750a;
            }
            if (objCollect == objF) {
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
