package com.bytedance.adsdk.ugeno.gjv.hn;

import com.bytedance.adsdk.ugeno.gjv.dkl;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends hnj {
    private List<com.bytedance.adsdk.ugeno.gjv.hnj.gjv> ojm;

    public hn(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, dkl.hnj hnjVar) {
        super(qorVar, str, hnjVar);
        this.ojm = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.hn.hnj
    public void hnj() {
        com.bytedance.adsdk.ugeno.gjv.hnj.qor qorVarHnj;
        Map<String, String> map = this.dkl;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.dkl.get("name");
        com.bytedance.adsdk.ugeno.gjv.hnj.hnj hnjVarFf = this.qor.ff();
        if (hnjVarFf == null || (qorVarHnj = hnjVarFf.hnj(str)) == null) {
            return;
        }
        qorVarHnj.hnj(str);
    }
}
