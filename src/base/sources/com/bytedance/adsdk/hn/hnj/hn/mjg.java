package com.bytedance.adsdk.hn.hnj.hn;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg extends hnj<PointF, PointF> {
    private final hnj<Float, Float> aq;
    private final PointF dkl;
    private final PointF dse;
    protected com.bytedance.adsdk.hn.dse.hn<Float> gjv;
    private final hnj<Float, Float> ojm;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected com.bytedance.adsdk.hn.dse.hn<Float> f11971sk;

    public mjg(hnj<Float, Float> hnjVar, hnj<Float, Float> hnjVar2) {
        super(Collections.EMPTY_LIST);
        this.dkl = new PointF();
        this.dse = new PointF();
        this.aq = hnjVar;
        this.ojm = hnjVar2;
        hnj(aq());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public PointF hnj(com.bytedance.adsdk.hn.dse.hnj<PointF> hnjVar, float f10) {
        if (this.gjv != null && this.aq.qor() != null) {
            this.aq.sk();
            throw null;
        }
        if (this.f11971sk != null && this.ojm.qor() != null) {
            this.ojm.sk();
            throw null;
        }
        this.dse.set(this.dkl.x, 0.0f);
        PointF pointF = this.dse;
        pointF.set(pointF.x, this.dkl.y);
        return this.dse;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj
    /* JADX INFO: renamed from: ojm, reason: merged with bridge method [inline-methods] */
    public PointF dse() {
        return hnj(null, 0.0f);
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj
    public void hnj(float f10) {
        this.aq.hnj(f10);
        this.ojm.hnj(f10);
        this.dkl.set(this.aq.dse().floatValue(), this.ojm.dse().floatValue());
        for (int i10 = 0; i10 < this.hnj.size(); i10++) {
            this.hnj.get(i10).hnj();
        }
    }
}
