package com.bytedance.adsdk.ugeno.gjv.hn;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.gjv.dkl;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends hnj {
    public sk(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, dkl.hnj hnjVar) {
        super(qorVar, str, hnjVar);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.hn.hnj
    public void hnj() {
        Map<String, String> map = this.dkl;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.dkl.get("id");
        if (TextUtils.isEmpty(str)) {
            hnj(this.qor);
            return;
        }
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.qor;
        com.bytedance.adsdk.ugeno.hn.qor qorVarHn = qorVar.hn(qorVar);
        if (qorVarHn == null) {
            return;
        }
        hnj(qorVarHn.sk(str));
    }

    private void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        if (qorVar == null) {
            return;
        }
        for (String str : this.dkl.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                qorVar.hnj(str, this.dkl.get(str));
            }
        }
        qorVar.hnj(this.dkl.containsKey("width"), this.dkl.containsKey("height"));
        qorVar.hn();
    }
}
