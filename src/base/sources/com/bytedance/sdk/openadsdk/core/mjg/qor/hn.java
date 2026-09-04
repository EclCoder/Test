package com.bytedance.sdk.openadsdk.core.mjg.qor;

import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static void hnj(as asVar) {
        if (hqh.hn(asVar)) {
            com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void hnj(as asVar, long j10, long j11) {
        if (asVar != null) {
            if (hqh.qor(asVar) || hqh.hn(asVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j10);
                    jSONObject.put("unzip_success_time", j11);
                } catch (JSONException e10) {
                    apu.hnj("PlayableEvent", "onSuccess json error", e10);
                }
                com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void hnj(as asVar, int i10, String str) {
        if (asVar != null) {
            if (hqh.qor(asVar) || hqh.hn(asVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e10) {
                    apu.hnj("PlayableEvent", "onFail json error", e10);
                }
                com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
