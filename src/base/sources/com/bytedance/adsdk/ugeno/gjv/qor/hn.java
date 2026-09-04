package com.bytedance.adsdk.ugeno.gjv.qor;

import com.bytedance.adsdk.ugeno.gjv.dkl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends com.bytedance.adsdk.ugeno.gjv.hn.hnj {
    public hn(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, dkl.hnj hnjVar) {
        super(qorVar, str, hnjVar);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.hn.hnj
    public void hnj() {
        if (this.qor == null) {
            return;
        }
        int iHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.dkl.get("position"), 0);
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.qor;
        com.bytedance.adsdk.ugeno.hn.qor qorVarHn = qorVar.hn(qorVar);
        if (qorVarHn == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.hn.qor qorVarDkl = qorVarHn.dkl("SwiperView");
        if (qorVarDkl instanceof com.bytedance.adsdk.ugeno.hn) {
            ((com.bytedance.adsdk.ugeno.hn) qorVarDkl).hnj(iHnj);
        }
    }
}
