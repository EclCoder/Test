package com.bytedance.adsdk.hn.hnj.hn;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends com.bytedance.adsdk.hn.dse.hnj<PointF> {
    private final com.bytedance.adsdk.hn.dse.hnj<PointF> dnm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private Path f11972ta;

    public ojm(com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.dse.hnj<PointF> hnjVar) {
        super(dseVar, hnjVar.hnj, hnjVar.f11946hn, hnjVar.qor, hnjVar.gjv, hnjVar.f11947sk, hnjVar.dkl, hnjVar.dse);
        this.dnm = hnjVar;
        hnj();
    }

    Path hn() {
        return this.f11972ta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void hnj() {
        T t10;
        T t11;
        T t12 = this.f11946hn;
        boolean z10 = (t12 == 0 || (t11 = this.hnj) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.hnj;
        if (t13 == 0 || (t10 = this.f11946hn) == 0 || z10) {
            return;
        }
        com.bytedance.adsdk.hn.dse.hnj<PointF> hnjVar = this.dnm;
        this.f11972ta = com.bytedance.adsdk.hn.dkl.dkl.hnj((PointF) t13, (PointF) t10, hnjVar.aq, hnjVar.ojm);
    }
}
