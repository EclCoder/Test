package com.bytedance.adsdk.ugeno.gjv.gjv;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends qor {
    public dse(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(String.valueOf(objArr[0]), 0);
            Map<String, String> map = this.f12244sk;
            if (map == null || map.isEmpty() || iHnj == com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("type"), 0)) {
                this.hnj.hnj(this.f12243hn, this.dkl, this.qor.hn());
            }
        }
        return false;
    }
}
