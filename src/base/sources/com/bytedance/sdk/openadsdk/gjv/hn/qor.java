package com.bytedance.sdk.openadsdk.gjv.hn;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements hn {
    hn hnj;

    @Override // com.bytedance.sdk.openadsdk.gjv.hn.hn
    public void hnj(JSONObject jSONObject, long j10) throws JSONException {
        hn hnVar = this.hnj;
        if (hnVar != null) {
            hnVar.hnj(jSONObject, j10);
        }
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j10);
    }
}
