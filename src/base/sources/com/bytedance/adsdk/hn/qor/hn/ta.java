package com.bytedance.adsdk.hn.qor.hn;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta implements qor {
    private final com.bytedance.adsdk.hn.qor.hnj.hn aq;
    private final com.bytedance.adsdk.hn.qor.hnj.hn dkl;
    private final boolean dnm;
    private final com.bytedance.adsdk.hn.qor.hnj.hn dse;
    private final com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hnj f12083hn;
    private final String hnj;
    private final com.bytedance.adsdk.hn.qor.hnj.hn ojm;
    private final com.bytedance.adsdk.hn.qor.hnj.hn qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.hn f12084sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final boolean f12085ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        STAR(1),
        POLYGON(2);

        private final int qor;

        hnj(int i10) {
            this.qor = i10;
        }

        public static hnj hnj(int i10) {
            for (hnj hnjVar : values()) {
                if (hnjVar.qor == i10) {
                    return hnjVar;
                }
            }
            return null;
        }
    }

    public ta(String str, hnj hnjVar, com.bytedance.adsdk.hn.qor.hnj.hn hnVar, com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> orlVar, com.bytedance.adsdk.hn.qor.hnj.hn hnVar2, com.bytedance.adsdk.hn.qor.hnj.hn hnVar3, com.bytedance.adsdk.hn.qor.hnj.hn hnVar4, com.bytedance.adsdk.hn.qor.hnj.hn hnVar5, com.bytedance.adsdk.hn.qor.hnj.hn hnVar6, boolean z10, boolean z11) {
        this.hnj = str;
        this.f12083hn = hnjVar;
        this.qor = hnVar;
        this.gjv = orlVar;
        this.f12084sk = hnVar2;
        this.dkl = hnVar3;
        this.dse = hnVar4;
        this.aq = hnVar5;
        this.ojm = hnVar6;
        this.f12085ta = z10;
        this.dnm = z11;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn aq() {
        return this.aq;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn dkl() {
        return this.dkl;
    }

    public boolean dnm() {
        return this.dnm;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn dse() {
        return this.dse;
    }

    public com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> gjv() {
        return this.gjv;
    }

    public hnj hn() {
        return this.f12083hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn ojm() {
        return this.ojm;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn qor() {
        return this.qor;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn sk() {
        return this.f12084sk;
    }

    public boolean ta() {
        return this.f12085ta;
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new com.bytedance.adsdk.hn.hnj.hnj.mjg(ojmVar, hnjVar, this);
    }
}
