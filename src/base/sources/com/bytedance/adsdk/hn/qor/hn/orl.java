package com.bytedance.adsdk.hn.qor.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl implements qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.orl<Float, Float> f12079hn;
    private final String hnj;

    public orl(String str, com.bytedance.adsdk.hn.qor.hnj.orl<Float, Float> orlVar) {
        this.hnj = str;
        this.f12079hn = orlVar;
    }

    public com.bytedance.adsdk.hn.qor.hnj.orl<Float, Float> hn() {
        return this.f12079hn;
    }

    public String hnj() {
        return this.hnj;
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new com.bytedance.adsdk.hn.hnj.hnj.uua(ojmVar, hnjVar, this);
    }
}
