package com.bytedance.adsdk.hn.qor.hn;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements qor {
    private final boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> f12066hn;
    private final String hnj;
    private final com.bytedance.adsdk.hn.qor.hnj.dkl qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final boolean f12067sk;

    public hn(String str, com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> orlVar, com.bytedance.adsdk.hn.qor.hnj.dkl dklVar, boolean z10, boolean z11) {
        this.hnj = str;
        this.f12066hn = orlVar;
        this.qor = dklVar;
        this.gjv = z10;
        this.f12067sk = z11;
    }

    public boolean gjv() {
        return this.gjv;
    }

    public com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> hn() {
        return this.f12066hn;
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new com.bytedance.adsdk.hn.hnj.hnj.dkl(ojmVar, hnjVar, this);
    }

    public com.bytedance.adsdk.hn.qor.hnj.dkl qor() {
        return this.qor;
    }

    public boolean sk() {
        return this.f12067sk;
    }

    public String hnj() {
        return this.hnj;
    }
}
