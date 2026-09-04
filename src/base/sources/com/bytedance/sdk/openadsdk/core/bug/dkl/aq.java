package com.bytedance.sdk.openadsdk.core.bug.dkl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {
    public void hnj(String str, as asVar, String str2, Map<String, String> map) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                String str3 = map.get("label");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                String strLdn = asVar.ldn();
                if (!"sendLogExtra".equals(str) || TextUtils.isEmpty(strLdn)) {
                    jSONObject.put("log_extra", strLdn);
                } else {
                    JSONObject jSONObject2 = new JSONObject(strLdn);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!"label".equals(entry.getKey())) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("log_extra", jSONObject2.toString());
                }
                JSONObject jSONObject3 = new JSONObject();
                if ("sendAdExtra".equals(str)) {
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        if (!"label".equals(entry2.getKey())) {
                            jSONObject3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                jSONObject.put("ad_extra_data", jSONObject3.toString());
                jSONObject.putOpt("ua_policy", Integer.valueOf(asVar.af()));
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, "app_union", str2, str3, Long.parseLong(asVar.sp()), 0L, jSONObject, apu.dse(asVar));
            } catch (Throwable unused) {
            }
        }
    }
}
