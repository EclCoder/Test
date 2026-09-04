package com.bytedance.adsdk.hn.qor.hnj;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm implements orl<PointF, PointF> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hn f12095hn;
    private final hn hnj;

    public ojm(hn hnVar, hn hnVar2) {
        this.hnj = hnVar;
        this.f12095hn = hnVar2;
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.orl
    public boolean hn() {
        return this.hnj.hn() && this.f12095hn.hn();
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.orl
    public com.bytedance.adsdk.hn.hnj.hn.hnj<PointF, PointF> hnj() {
        return new com.bytedance.adsdk.hn.hnj.hn.mjg(this.hnj.hnj(), this.f12095hn.hnj());
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.orl
    public List<com.bytedance.adsdk.hn.dse.hnj<PointF>> qor() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
