package com.bytedance.adsdk.hn.qor.hn;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm implements qor {
    private final com.bytedance.adsdk.hn.qor.hnj.hn gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> f12060hn;
    private final String hnj;
    private final com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final boolean f12061sk;

    public dnm(String str, com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> orlVar, com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> orlVar2, com.bytedance.adsdk.hn.qor.hnj.hn hnVar, boolean z10) {
        this.hnj = str;
        this.f12060hn = orlVar;
        this.qor = orlVar2;
        this.gjv = hnVar;
        this.f12061sk = z10;
    }

    public com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> gjv() {
        return this.f12060hn;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn hn() {
        return this.gjv;
    }

    public String hnj() {
        return this.hnj;
    }

    public com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> qor() {
        return this.qor;
    }

    public boolean sk() {
        return this.f12061sk;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f12060hn + ", size=" + this.qor + '}';
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new com.bytedance.adsdk.hn.hnj.hnj.fc(ojmVar, hnjVar, this);
    }
}
