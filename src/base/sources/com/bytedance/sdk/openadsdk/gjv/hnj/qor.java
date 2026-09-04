package com.bytedance.sdk.openadsdk.gjv.hnj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class qor implements com.bytedance.sdk.component.dkl.hnj.sk.qor {
    private final com.bytedance.sdk.component.dse.hn.hn hnj;

    public qor() {
        com.bytedance.sdk.component.dse.hn.hn hnVarQor = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().qor();
        this.hnj = hnVarQor;
        hnVarQor.hnj(7);
        hnVarQor.hn("track_url");
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk.qor
    public void hnj(String str) {
        this.hnj.qor(str);
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk.qor
    public void hnj(String str, String str2) {
        this.hnj.hn(str, str2);
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk.qor
    public com.bytedance.sdk.component.dkl.hnj.sk.gjv hnj() {
        return new sk(this.hnj.hnj());
    }
}
