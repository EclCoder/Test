package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn {
    public static void hnj(Context context, boolean z10, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.as asVar, String str, int i10, WebView webView, com.bytedance.sdk.openadsdk.core.widget.sk skVar) {
        int iOptInt = jSONObject.optInt("landingStyle");
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("fallback_url");
        String strOptString3 = jSONObject.optString(CampaignEx.JSON_KEY_TITLE, "");
        boolean z11 = false;
        boolean z12 = jSONObject.optInt("only_loading", 0) == 1;
        try {
            jSONObject.put("is_activity", z10);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (iOptInt == 0) {
            if (webView != null) {
                webView.loadUrl(strOptString);
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str, -1, (JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            com.bytedance.sdk.openadsdk.jip.hnj.hn hnVar = new com.bytedance.sdk.openadsdk.jip.hnj.hn();
            hnVar.hnj(com.bytedance.sdk.openadsdk.gjv.hn.hnj.f14352hn);
            hnVar.hnj(asVar);
            hnVar.hn(str);
            hnVar.hnj(-1);
            hnVar.hnj(false);
            hnVar.hn(asVar.rg());
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnVar);
            com.bytedance.sdk.openadsdk.utils.as.hnj(context, strOptString, asVar, com.bytedance.sdk.openadsdk.gjv.hn.hnj.f14352hn, true);
        } else {
            if (iOptInt != 2) {
                if (iOptInt == 3) {
                    apu apuVar = new apu(asVar);
                    apuVar.hnj(strOptString3);
                    apuVar.hnj(z12);
                    orp.hnj(context, strOptString, asVar, i10, str, false, apuVar);
                }
                if (skVar == null && z11) {
                    skVar.hnj();
                    return;
                }
            }
            if (!com.bytedance.sdk.openadsdk.utils.as.hnj(context, strOptString, asVar, str)) {
                com.bytedance.sdk.openadsdk.jip.hnj.hn hnVar2 = new com.bytedance.sdk.openadsdk.jip.hnj.hn();
                hnVar2.hnj(com.bytedance.sdk.openadsdk.gjv.hn.hnj.f14352hn);
                hnVar2.hnj(asVar);
                hnVar2.hn(str);
                hnVar2.hnj(-1);
                hnVar2.hnj(false);
                hnVar2.hn(asVar.rg());
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnVar2);
                HashMap map = new HashMap();
                map.put("deeplink_url", strOptString);
                map.put("fallback_url", strOptString2);
                map.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.utils.as.hnj(context, strOptString2, asVar, com.bytedance.sdk.openadsdk.gjv.hn.hnj.f14352hn, true);
            }
        }
        z11 = true;
        if (skVar == null) {
        }
    }
}
