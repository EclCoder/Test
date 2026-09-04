package com.bytedance.adsdk.hn.qor.hn;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc implements qor {
    private final boolean dkl;
    private final com.bytedance.adsdk.hn.qor.hnj.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Path.FillType f12063hn;
    private final boolean hnj;
    private final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.gjv f12064sk;

    public fc(String str, boolean z10, Path.FillType fillType, com.bytedance.adsdk.hn.qor.hnj.hnj hnjVar, com.bytedance.adsdk.hn.qor.hnj.gjv gjvVar, boolean z11) {
        this.qor = str;
        this.hnj = z10;
        this.f12063hn = fillType;
        this.gjv = hnjVar;
        this.f12064sk = gjvVar;
        this.dkl = z11;
    }

    public Path.FillType gjv() {
        return this.f12063hn;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hnj hn() {
        return this.gjv;
    }

    public String hnj() {
        return this.qor;
    }

    public com.bytedance.adsdk.hn.qor.hnj.gjv qor() {
        return this.f12064sk;
    }

    public boolean sk() {
        return this.dkl;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.hnj + '}';
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new com.bytedance.adsdk.hn.hnj.hnj.dse(ojmVar, hnjVar, this);
    }
}
