package com.bytedance.sdk.openadsdk.core.ojm;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm {
    public static void hnj(String str, int i10, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.ojm.hnj(i10);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            com.bytedance.sdk.openadsdk.core.model.as.hnj hnjVarZd = asVar.zd();
            if (hnjVarZd != null) {
                jSONObject.put("tpl_id", hnjVarZd.gjv());
                if ("Web".equals(str)) {
                    if (hnjVarZd.bug()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (asVar.vk() != null) {
                jSONObject.put("tpl_id", asVar.vk().hnj());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.jip.gjv.hnj().hnj(com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj(hnj(str3)).qor(str4).sk(asVar != null ? asVar.jp() : "").hn(i10).hn(jSONObject.toString()).dkl(str2));
    }

    private static int hnj(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}
