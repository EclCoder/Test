package com.bytedance.sdk.openadsdk.core.aq;

import com.bytedance.sdk.component.dse.hn.gjv;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.wu;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private static JSONObject hn(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void hnj(String str, long j10) {
        JSONObject jSONObjectHn = hn(str, j10);
        gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
        gjvVarHn.qor(orp.gjv("/api/ad/union/sdk/stats/"));
        gjvVarHn.sk(jSONObjectHn.toString());
        gjvVarHn.hnj(6);
        gjvVarHn.hn("uploadFrequentEvent");
        gjvVarHn.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.aq.qor.1
            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
            }

            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                iOException.getMessage();
                if (qorVar != null) {
                    wu.hnj(qorVar.sk());
                }
            }
        });
    }
}
