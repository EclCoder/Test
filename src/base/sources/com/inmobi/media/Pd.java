package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Pd implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rd f25482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gm.s f25483b;

    public Pd(Rd rd2, gm.s sVar) {
        this.f25482a = rd2;
        this.f25483b = sVar;
    }

    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        AbstractC3066jc abstractC3066jc = (AbstractC3066jc) obj;
        if (abstractC3066jc instanceof C3207on) {
            Rd rd2 = this.f25482a;
            C3207on c3207on = (C3207on) abstractC3066jc;
            gm.s sVar = this.f25483b;
            if (!rd2.f25638c) {
                Long l10 = rd2.f25639d;
                if (l10 != null) {
                    if (c3207on.f27148a >= l10.longValue() + rd2.f25636a.f26520b && gm.k.i(sVar.e(fl.g0.f38750a))) {
                        rd2.f25638c = true;
                        rd2.f25639d = null;
                        rd2.f25637b.set(false);
                    }
                } else {
                    rd2.f25639d = Long.valueOf(c3207on.f27148a);
                    rd2.f25637b.set(true);
                }
            }
        } else if ((abstractC3066jc instanceof Bn) || (abstractC3066jc instanceof C2974fn)) {
            Rd rd3 = this.f25482a;
            rd3.f25639d = null;
            rd3.f25637b.set(false);
        }
        return fl.g0.f38750a;
    }
}
