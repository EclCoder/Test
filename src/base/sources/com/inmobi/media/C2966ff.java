package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ff, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2966ff extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3095kf f26554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Zf f26555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2966ff(C3095kf c3095kf, Zf zf2, kl.f fVar) {
        super(2, fVar);
        this.f26554b = c3095kf;
        this.f26555c = zf2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2966ff(this.f26554b, this.f26555c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2966ff(this.f26554b, this.f26555c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26553a;
        if (i10 == 0) {
            fl.s.b(obj);
            C3095kf c3095kf = this.f26554b;
            Zf zf2 = this.f26555c;
            C2940ef c2940ef = new C2940ef(c3095kf, null);
            this.f26553a = 1;
            if (c3095kf.a(zf2, c2940ef, this) == objF) {
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
