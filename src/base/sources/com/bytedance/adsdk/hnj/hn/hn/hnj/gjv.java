package com.bytedance.adsdk.hnj.hn.hn.hnj;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends uua {
    public gjv() {
        super(com.bytedance.adsdk.hnj.hn.gjv.qor.EQ);
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public Object hnj(Map<String, JSONObject> map) {
        Object objHnj = this.hnj.hnj(map);
        Object objHnj2 = this.f12156hn.hnj(map);
        if (objHnj == null && objHnj2 == null) {
            return Boolean.TRUE;
        }
        if (objHnj == null && objHnj2 != null) {
            return Boolean.FALSE;
        }
        if (objHnj == null || objHnj2 != null) {
            return ((objHnj instanceof Number) && (objHnj2 instanceof Number)) ? Boolean.valueOf(com.bytedance.adsdk.hnj.hn.sk.hnj.hn.hnj((Number) objHnj, (Number) objHnj2)) : Boolean.valueOf(objHnj.equals(objHnj2));
        }
        return Boolean.FALSE;
    }
}
