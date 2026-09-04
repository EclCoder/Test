package com.bytedance.sdk.openadsdk.gjv;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {
    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject hn(as asVar, String str, int i10, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("error_msg", str);
            }
            int i11 = 1;
            jSONObject2.put("ad_show_order", i10 + 1);
            jSONObject2.put("interaction_method", asVar.fr());
            jSONObject2.put("real_interaction_method", asVar.qb());
            jSONObject2.put("give_up_reward", asVar.jip() ? 1 : 2);
            if (!asVar.ff()) {
                i11 = 2;
            }
            jSONObject2.put("has_reward", i11);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONObject2;
    }

    public static void hnj(as asVar, String str, String str2, String str3) {
        hnj(asVar, str, str2, str3, null);
    }

    public static void hnj(as asVar, String str, String str2, String str3, JSONObject jSONObject) {
        hnj(asVar, str, str2, str3, jSONObject, 0);
    }

    public static void hnj(final as asVar, String str, String str2, final String str3, final JSONObject jSONObject, final int i10) {
        if (asVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        qor.hnj(System.currentTimeMillis(), asVar, str2, str, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.ta.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                if (jSONObject == null) {
                    return super.hn();
                }
                long jUua = asVar.uua();
                if (jUua < 0) {
                    long jOjm = asVar.ojm();
                    if (jOjm > 0) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - jOjm;
                        if (jElapsedRealtime > 0) {
                            jUua = jElapsedRealtime;
                        }
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", jUua);
                    return jSONObject2;
                } catch (Exception e10) {
                    apu.qor(e10.getMessage(), new Object[0]);
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                return ta.hn(asVar, str3, i10, jSONObject);
            }
        });
    }

    public static void hnj(String str, boolean z10, boolean z11, as asVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("has_close_invoke", z10 ? 1 : 2);
            jSONObject.put("has_show_invoke", z11 ? 1 : 2);
            hnj(asVar, str, asVar != null ? asVar.sk() : null, null, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void hnj(as asVar, String str, int i10) {
        hnj(asVar, "close".equals(str) ? "close_listen_empty" : "show_listen_empty", asVar != null ? asVar.sk() : null, null, null, i10);
    }
}
