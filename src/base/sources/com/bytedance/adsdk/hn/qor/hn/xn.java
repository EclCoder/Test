package com.bytedance.adsdk.hn.qor.hn;

import com.bytedance.adsdk.hn.hnj.hnj.eum;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn implements qor {
    private final boolean dkl;
    private final com.bytedance.adsdk.hn.qor.hnj.hn gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hnj f12088hn;
    private final String hnj;
    private final com.bytedance.adsdk.hn.qor.hnj.hn qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.hn f12089sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static hnj hnj(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i10)));
        }
    }

    public xn(String str, hnj hnjVar, com.bytedance.adsdk.hn.qor.hnj.hn hnVar, com.bytedance.adsdk.hn.qor.hnj.hn hnVar2, com.bytedance.adsdk.hn.qor.hnj.hn hnVar3, boolean z10) {
        this.hnj = str;
        this.f12088hn = hnjVar;
        this.qor = hnVar;
        this.gjv = hnVar2;
        this.f12089sk = hnVar3;
        this.dkl = z10;
    }

    public boolean dkl() {
        return this.dkl;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn gjv() {
        return this.qor;
    }

    public hnj hn() {
        return this.f12088hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn qor() {
        return this.gjv;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn sk() {
        return this.f12089sk;
    }

    public String toString() {
        return "Trim Path: {start: " + this.qor + ", end: " + this.gjv + ", offset: " + this.f12089sk + "}";
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new eum(hnjVar, this);
    }
}
