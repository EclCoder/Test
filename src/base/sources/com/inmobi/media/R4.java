package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class R4 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hm.i0 f25581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M1 f25582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R4(hm.i0 i0Var, M1 m10, kl.f fVar) {
        super(2, fVar);
        this.f25581b = i0Var;
        this.f25582c = m10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new R4(this.f25581b, this.f25582c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new R4(this.f25581b, this.f25582c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25580a;
        if (i10 == 0) {
            fl.s.b(obj);
            hm.i0 i0Var = this.f25581b;
            M1 m10 = this.f25582c;
            this.f25580a = 1;
            if (i0Var.collect(m10, this) == objF) {
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
