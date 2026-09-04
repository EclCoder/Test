package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ym, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3464ym implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hm.f f27961a;

    public C3464ym(hm.f fVar) {
        this.f27961a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        C3439xm c3439xm;
        if (fVar instanceof C3439xm) {
            c3439xm = (C3439xm) fVar;
            int i10 = c3439xm.f27878b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3439xm.f27878b = i10 - Integer.MIN_VALUE;
            } else {
                c3439xm = new C3439xm(this, fVar);
            }
        } else {
            c3439xm = new C3439xm(this, fVar);
        }
        Object obj2 = c3439xm.f27877a;
        Object objF = ll.b.f();
        int i11 = c3439xm.f27878b;
        if (i11 == 0) {
            fl.s.b(obj2);
            hm.f fVar2 = this.f27961a;
            AbstractC3050im abstractC3050im = (AbstractC3050im) obj;
            if (kotlin.jvm.internal.s.c(abstractC3050im, C3490zn.f28037a) || (abstractC3050im instanceof C2999gm)) {
                c3439xm.f27878b = 1;
                if (fVar2.emit(obj, c3439xm) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj2);
        }
        return fl.g0.f38750a;
    }
}
