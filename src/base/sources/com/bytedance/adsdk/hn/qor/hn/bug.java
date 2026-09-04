package com.bytedance.adsdk.hn.qor.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug implements qor {
    private final com.bytedance.adsdk.hn.qor.hnj.bug gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.hn f12055hn;
    private final String hnj;
    private final com.bytedance.adsdk.hn.qor.hnj.hn qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final boolean f12056sk;

    public bug(String str, com.bytedance.adsdk.hn.qor.hnj.hn hnVar, com.bytedance.adsdk.hn.qor.hnj.hn hnVar2, com.bytedance.adsdk.hn.qor.hnj.bug bugVar, boolean z10) {
        this.hnj = str;
        this.f12055hn = hnVar;
        this.qor = hnVar2;
        this.gjv = bugVar;
        this.f12056sk = z10;
    }

    public com.bytedance.adsdk.hn.qor.hnj.bug gjv() {
        return this.gjv;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn hn() {
        return this.f12055hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn qor() {
        return this.qor;
    }

    public boolean sk() {
        return this.f12056sk;
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new com.bytedance.adsdk.hn.hnj.hnj.jip(ojmVar, hnjVar, this);
    }
}
