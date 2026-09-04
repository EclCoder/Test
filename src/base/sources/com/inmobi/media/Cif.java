package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.if, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Cif extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3095kf f26751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(C3095kf c3095kf, kl.f fVar) {
        super(1, fVar);
        this.f26751b = c3095kf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Cif(this.f26751b, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Cif(this.f26751b, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26750a;
        if (i10 == 0) {
            fl.s.b(obj);
            C3095kf c3095kf = this.f26751b;
            this.f26750a = 1;
            if (c3095kf.b(this) == objF) {
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
