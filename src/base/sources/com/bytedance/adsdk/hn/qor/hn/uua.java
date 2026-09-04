package com.bytedance.adsdk.hn.qor.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua implements qor {
    private final boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int f12087hn;
    private final String hnj;
    private final com.bytedance.adsdk.hn.qor.hnj.aq qor;

    public uua(String str, int i10, com.bytedance.adsdk.hn.qor.hnj.aq aqVar, boolean z10) {
        this.hnj = str;
        this.f12087hn = i10;
        this.qor = aqVar;
        this.gjv = z10;
    }

    public com.bytedance.adsdk.hn.qor.hnj.aq hn() {
        return this.qor;
    }

    public String hnj() {
        return this.hnj;
    }

    public boolean qor() {
        return this.gjv;
    }

    public String toString() {
        return "ShapePath{name=" + this.hnj + ", index=" + this.f12087hn + '}';
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new com.bytedance.adsdk.hn.hnj.hnj.oj(ojmVar, hnjVar, this);
    }
}
