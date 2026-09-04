package com.bytedance.adsdk.ugeno.gjv.hn;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.gjv.dkl;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends hnj {
    public gjv(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, dkl.hnj hnjVar) {
        super(qorVar, str, hnjVar);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.hn.hnj
    public void hnj() {
        com.bytedance.adsdk.ugeno.hn.qor qorVar;
        com.bytedance.adsdk.ugeno.hn.qor qorVarHn;
        com.bytedance.adsdk.ugeno.hnj.hnj hnjVarBug;
        Map<String, String> map = this.dkl;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.dkl.get("name");
        if (TextUtils.isEmpty(str) || (qorVarHn = (qorVar = this.qor).hn(qorVar)) == null || (hnjVarBug = qorVarHn.aq(str).bug(str)) == null) {
            return;
        }
        hnjVarBug.hn();
        hnjVarBug.hnj(new com.bytedance.adsdk.ugeno.hnj.hn() { // from class: com.bytedance.adsdk.ugeno.gjv.hn.gjv.1
            @Override // com.bytedance.adsdk.ugeno.hnj.hn
            public void hn() {
                gjv.this.qor();
            }

            @Override // com.bytedance.adsdk.ugeno.hnj.hn
            public void hnj() {
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.hn.hnj
    public void hn() {
    }
}
