package com.bytedance.sdk.openadsdk.gjv.hnj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class sk implements com.bytedance.sdk.component.dkl.hnj.sk.gjv {
    private final com.bytedance.sdk.component.dse.hn hnj;

    public sk(com.bytedance.sdk.component.dse.hn hnVar) {
        this.hnj = hnVar;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk.gjv
    public int hn() {
        com.bytedance.sdk.component.dse.hn hnVar = this.hnj;
        if (hnVar != null) {
            return hnVar.hnj();
        }
        return -1;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk.gjv
    public boolean hnj() {
        com.bytedance.sdk.component.dse.hn hnVar = this.hnj;
        if (hnVar != null) {
            return hnVar.dkl();
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk.gjv
    public String qor() {
        com.bytedance.sdk.component.dse.hn hnVar = this.hnj;
        return hnVar != null ? hnVar.hn() : "";
    }
}
