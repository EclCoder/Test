package com.bytedance.adsdk.hn.qor.hn;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements qor {
    private final com.bytedance.adsdk.hn.qor.hnj.hn aq;
    private final com.bytedance.adsdk.hn.qor.hnj.dkl dkl;
    private final String dse;
    private final com.bytedance.adsdk.hn.qor.hnj.gjv gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Path.FillType f12080hn;
    private final dse hnj;
    private final com.bytedance.adsdk.hn.qor.hnj.hn ojm;
    private final com.bytedance.adsdk.hn.qor.hnj.qor qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.dkl f12081sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final boolean f12082ta;

    public sk(String str, dse dseVar, Path.FillType fillType, com.bytedance.adsdk.hn.qor.hnj.qor qorVar, com.bytedance.adsdk.hn.qor.hnj.gjv gjvVar, com.bytedance.adsdk.hn.qor.hnj.dkl dklVar, com.bytedance.adsdk.hn.qor.hnj.dkl dklVar2, com.bytedance.adsdk.hn.qor.hnj.hn hnVar, com.bytedance.adsdk.hn.qor.hnj.hn hnVar2, boolean z10) {
        this.hnj = dseVar;
        this.f12080hn = fillType;
        this.qor = qorVar;
        this.gjv = gjvVar;
        this.f12081sk = dklVar;
        this.dkl = dklVar2;
        this.dse = str;
        this.aq = hnVar;
        this.ojm = hnVar2;
        this.f12082ta = z10;
    }

    public boolean aq() {
        return this.f12082ta;
    }

    public com.bytedance.adsdk.hn.qor.hnj.dkl dkl() {
        return this.f12081sk;
    }

    public com.bytedance.adsdk.hn.qor.hnj.dkl dse() {
        return this.dkl;
    }

    public com.bytedance.adsdk.hn.qor.hnj.qor gjv() {
        return this.qor;
    }

    public dse hn() {
        return this.hnj;
    }

    public String hnj() {
        return this.dse;
    }

    public Path.FillType qor() {
        return this.f12080hn;
    }

    public com.bytedance.adsdk.hn.qor.hnj.gjv sk() {
        return this.gjv;
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new com.bytedance.adsdk.hn.hnj.hnj.aq(ojmVar, dseVar, hnjVar, this);
    }
}
