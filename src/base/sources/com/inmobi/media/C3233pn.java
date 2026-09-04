package com.inmobi.media;

import android.widget.ProgressBar;

/* JADX INFO: renamed from: com.inmobi.media.pn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3233pn implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3310sn f27285a;

    public C3233pn(em.o0 o0Var, C3310sn c3310sn) {
        this.f27285a = c3310sn;
    }

    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        ProgressBar progressBar;
        AbstractC3050im abstractC3050im = (AbstractC3050im) obj;
        C3310sn c3310sn = this.f27285a;
        c3310sn.getClass();
        if (abstractC3050im instanceof Bn) {
            ProgressBar progressBar2 = c3310sn.f27489e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (abstractC3050im instanceof C3207on) {
            int i10 = ((C3207on) abstractC3050im).f27149b;
            ProgressBar progressBar3 = c3310sn.f27489e;
            if (progressBar3 != null) {
                L6.a(c3310sn.f27490f);
                c3310sn.f27490f = T4.a(c3310sn.f27485a, new C3284rn(progressBar3, c3310sn, i10, null));
            }
        } else if ((abstractC3050im instanceof C2999gm) && c3310sn.f27487c.f25419b && (progressBar = c3310sn.f27489e) != null) {
            progressBar.setVisibility(8);
        }
        return fl.g0.f38750a;
    }
}
