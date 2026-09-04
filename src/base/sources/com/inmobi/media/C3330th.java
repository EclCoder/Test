package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;

/* JADX INFO: renamed from: com.inmobi.media.th, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3330th extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3356uh f27557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3330th(C3356uh c3356uh, kl.f fVar) {
        super(2, fVar);
        this.f27557b = c3356uh;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3330th(this.f27557b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3330th(this.f27557b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27556a;
        if (i10 == 0) {
            fl.s.b(obj);
            H0 h10 = (H0) E0.f24683a.getValue();
            AdQualityResult adQualityResult = this.f27557b.f27630a;
            this.f27556a = 1;
            if (h10.a(adQualityResult, this) == objF) {
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
