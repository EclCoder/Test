package com.bytedance.adsdk.hn.hnj.hn;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm extends dse<PointF> {
    private final PointF gjv;

    public dnm(List<com.bytedance.adsdk.hn.dse.hnj<PointF>> list) {
        super(list);
        this.gjv = new PointF();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public PointF hnj(com.bytedance.adsdk.hn.dse.hnj<PointF> hnjVar, float f10) {
        return hnj(hnjVar, f10, f10, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public PointF hnj(com.bytedance.adsdk.hn.dse.hnj<PointF> hnjVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = hnjVar.hnj;
        if (pointF2 == null || (pointF = hnjVar.f11946hn) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.qor != null) {
            hnjVar.dse.getClass();
            gjv();
            aq();
            throw null;
        }
        PointF pointF5 = this.gjv;
        float f13 = pointF3.x;
        float f14 = f13 + (f11 * (pointF4.x - f13));
        float f15 = pointF3.y;
        pointF5.set(f14, f15 + (f12 * (pointF4.y - f15)));
        return this.gjv;
    }
}
