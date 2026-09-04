package com.bytedance.adsdk.hn.hnj.hn;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends dse<PointF> {
    private final PathMeasure dkl;
    private ojm dse;
    private final PointF gjv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final float[] f11976sk;

    public ta(List<? extends com.bytedance.adsdk.hn.dse.hnj<PointF>> list) {
        super(list);
        this.gjv = new PointF();
        this.f11976sk = new float[2];
        this.dkl = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public PointF hnj(com.bytedance.adsdk.hn.dse.hnj<PointF> hnjVar, float f10) {
        ojm ojmVar = (ojm) hnjVar;
        Path pathHn = ojmVar.hn();
        if (pathHn == null) {
            return hnjVar.hnj;
        }
        if (this.qor != null) {
            ojmVar.dse.getClass();
            gjv();
            aq();
            throw null;
        }
        if (this.dse != ojmVar) {
            this.dkl.setPath(pathHn, false);
            this.dse = ojmVar;
        }
        PathMeasure pathMeasure = this.dkl;
        pathMeasure.getPosTan(f10 * pathMeasure.getLength(), this.f11976sk, null);
        PointF pointF = this.gjv;
        float[] fArr = this.f11976sk;
        pointF.set(fArr[0], fArr[1]);
        return this.gjv;
    }
}
