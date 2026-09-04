package com.bytedance.adsdk.hn.qor.hnj;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements orl<PointF, PointF> {
    private final List<com.bytedance.adsdk.hn.dse.hnj<PointF>> hnj;

    public sk(List<com.bytedance.adsdk.hn.dse.hnj<PointF>> list) {
        this.hnj = list;
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.orl
    public boolean hn() {
        return this.hnj.size() == 1 && this.hnj.get(0).sk();
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.orl
    public com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnj() {
        return this.hnj.get(0).sk() ? new com.bytedance.adsdk.hn.hnj.hn.dnm(this.hnj) : new com.bytedance.adsdk.hn.hnj.hn.ta(this.hnj);
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.orl
    public List<com.bytedance.adsdk.hn.dse.hnj<PointF>> qor() {
        return this.hnj;
    }
}
