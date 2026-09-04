package com.bytedance.adsdk.hnj.hn.hn.hnj;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends uua {
    public aq() {
        super(com.bytedance.adsdk.hnj.hn.gjv.qor.LT_EQ);
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public Object hnj(Map<String, JSONObject> map) {
        Object objHnj;
        Object objHnj2 = this.hnj.hnj(map);
        if (objHnj2 == null || (objHnj = this.f12156hn.hnj(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.hnj.hn.sk.hnj.qor.hnj(objHnj2, (Number) objHnj)).booleanValue());
    }
}
