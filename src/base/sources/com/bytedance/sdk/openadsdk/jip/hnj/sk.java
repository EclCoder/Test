package com.bytedance.sdk.openadsdk.jip.hnj;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    public static void hnj(final String str, final String str2, final int i10, final String str3, final String str4, final List<String> list) {
        com.bytedance.sdk.openadsdk.jip.gjv.hnj(str, false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.jip.hnj.sk.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                String str5 = str4;
                if (str5 != null) {
                    jSONObject.put("error_url", str5);
                }
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    jSONObject.put("back_up_url", list.toString());
                }
                jSONObject.put("error_code", i10);
                jSONObject.put("error_msg", str3);
                return gjv.hn().hnj(str).hn(jSONObject.toString());
            }
        });
    }
}
