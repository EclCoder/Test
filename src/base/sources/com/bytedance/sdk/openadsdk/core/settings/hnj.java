package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.eum;
import com.bytedance.sdk.openadsdk.core.oj;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends ta {
    public hnj() {
        super(new ta.hnj() { // from class: com.bytedance.sdk.openadsdk.core.settings.hnj.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ta.hnj
            public void hn() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ta.hnj
            public void hnj() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ta
    protected String hnj() {
        try {
            String str = "tt_set_apm.prop";
            if (oj.hnj() == null || eum.hnj(oj.hnj())) {
                return str;
            }
            return "tt_set_apm_" + eum.qor(oj.hnj()) + ".prop";
        } catch (Throwable unused) {
            return "tt_set_apm";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sk
    public void hnj(JSONObject jSONObject) {
        sk.hnj hnjVarHn = hn();
        if (jSONObject.has("apm_url")) {
            hnjVarHn.hnj("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    hnjVarHn.hnj("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        hnjVarHn.hnj();
        sk();
    }
}
