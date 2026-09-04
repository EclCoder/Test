package com.bytedance.adsdk.hn.hnj.hn;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends dse<com.bytedance.adsdk.hn.qor.hn.gjv> {
    private final com.bytedance.adsdk.hn.qor.hn.gjv gjv;

    public sk(List<com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.qor.hn.gjv>> list) {
        super(list);
        com.bytedance.adsdk.hn.qor.hn.gjv gjvVar = list.get(0).hnj;
        int iQor = gjvVar != null ? gjvVar.qor() : 0;
        this.gjv = new com.bytedance.adsdk.hn.qor.hn.gjv(new float[iQor], new int[iQor]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.hn.qor.hn.gjv hnj(com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.qor.hn.gjv> hnjVar, float f10) {
        this.gjv.hnj(hnjVar.hnj, hnjVar.f11946hn, f10);
        return this.gjv;
    }
}
