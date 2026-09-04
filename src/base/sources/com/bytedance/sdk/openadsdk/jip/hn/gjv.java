package com.bytedance.sdk.openadsdk.jip.hn;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public final JSONObject f14540hn;
        public final String hnj;

        public hnj(String str, JSONObject jSONObject) {
            this.hnj = str;
            this.f14540hn = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device_info");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put("gaid", com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hn());
                    jSONObject.put("device_info", jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static qor hnj() {
        return sk.hnj();
    }
}
