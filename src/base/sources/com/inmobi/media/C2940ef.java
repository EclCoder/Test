package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ef, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2940ef extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3095kf f26492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2940ef(C3095kf c3095kf, kl.f fVar) {
        super(2, fVar);
        this.f26492c = c3095kf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C2940ef c2940ef = new C2940ef(this.f26492c, fVar);
        c2940ef.f26491b = obj;
        return c2940ef;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        C2940ef c2940ef = new C2940ef(this.f26492c, (kl.f) obj2);
        c2940ef.f26491b = (C2967fg) obj;
        return c2940ef.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26490a;
        if (i10 == 0) {
            fl.s.b(obj);
            C2967fg c2967fg = (C2967fg) this.f26491b;
            C3095kf c3095kf = this.f26492c;
            this.f26490a = 1;
            Object objA = c3095kf.f26681b.a(c2967fg, this);
            if (objA != ll.b.f()) {
                objA = fl.g0.f38750a;
            }
            if (objA == objF) {
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
