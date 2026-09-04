package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;

/* JADX INFO: renamed from: com.inmobi.media.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3417x0 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdQualityResult f27825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3417x0(AdQualityResult adQualityResult, kl.f fVar) {
        super(2, fVar);
        this.f27825b = adQualityResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3417x0(this.f27825b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3417x0(this.f27825b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27824a;
        if (i10 == 0) {
            fl.s.b(obj);
            H0 h10 = (H0) E0.f24683a.getValue();
            String imageLocation = this.f27825b.getImageLocation();
            this.f27824a = 1;
            Object objA = h10.f24905a.a("ad_quality_db", "image_location=?", new String[]{imageLocation}, this);
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
