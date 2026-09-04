package com.bytedance.adsdk.hnj.hn.hn.hnj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class uua implements com.bytedance.adsdk.hnj.hn.hn.hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected com.bytedance.adsdk.hnj.hn.hn.hnj f12156hn;
    protected com.bytedance.adsdk.hnj.hn.hn.hnj hnj;
    protected com.bytedance.adsdk.hnj.hn.gjv.qor qor;

    protected uua(com.bytedance.adsdk.hnj.hn.gjv.qor qorVar) {
        this.qor = qorVar;
    }

    public void hn(com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar) {
        this.f12156hn = hnjVar;
    }

    public void hnj(com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar) {
        this.hnj = hnjVar;
    }

    public String toString() {
        return hn();
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public String hn() {
        return this.hnj.hn() + this.qor.hnj() + this.f12156hn.hn();
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public com.bytedance.adsdk.hnj.hn.gjv.sk hnj() {
        return com.bytedance.adsdk.hnj.hn.gjv.dkl.OPERATOR_RESULT;
    }
}
