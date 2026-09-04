package com.bytedance.sdk.openadsdk.component.gjv;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.pty;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.gjv.qor;
import com.bytedance.sdk.openadsdk.jip.gjv;
import com.bytedance.sdk.openadsdk.jip.hn;
import com.bytedance.sdk.openadsdk.utils.fvt;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.coremedia.iso.boxes.FreeSpaceBox;
import org.json.JSONException;
import org.json.JSONObject;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj {
    public static void hn(as asVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", as.sk(asVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e10) {
            apu.hnj("TTAppOpenAdReport", "reportCacheLoss json error", e10);
        }
        qor.qor(asVar, "cache_loss", jSONObject);
    }

    public static void hnj(final int i10, final int i11, final pty ptyVar) {
        gjv.hnj("openad_load_ad_timeout", false, new hn() { // from class: com.bytedance.sdk.openadsdk.component.gjv.hnj.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i10);
                jSONObject.put("user_timeout_time", i11);
                pty ptyVar2 = ptyVar;
                if (ptyVar2 != null) {
                    jSONObject.put("start_type", ptyVar2.ta() == 1);
                    jSONObject.put("load_index", ptyVar.ta());
                }
                jSONObject.put("start_type_backup", com.bytedance.sdk.openadsdk.component.dse.hnj.gjv());
                jSONObject.put("app_running_time", com.bytedance.sdk.openadsdk.component.dse.hnj.hn());
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("openad_load_ad_timeout").hn(jSONObject.toString());
            }
        });
    }

    public static void hnj(as asVar, int i10, int i11, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            hnj(jSONObject, asVar);
            jSONObject.put("openad_creative_type", as.sk(asVar) ? "video_normal_ad" : Saucuwx.nZjpOngIgddJYjP);
            jSONObject.put("total_time", f10);
            qor.hnj(jSONObject, i11, i10);
        } catch (JSONException e10) {
            apu.hnj("TTAppOpenAdReport", "reportSkip json error", e10);
        }
        qor.hnj(asVar, FreeSpaceBox.TYPE, i10, jSONObject, (JSONObject) null);
    }

    public static void hn(as asVar, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", asVar.pwt().G());
            jSONObject.put("video_duration", asVar.pwt().e());
            jSONObject.put("order", z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        qor.hnj(asVar, "download_video_duration", j10, jSONObject, (JSONObject) null);
    }

    public static void hnj(as asVar, long j10, float f10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            hnj(jSONObject, asVar);
            jSONObject.put("openad_creative_type", as.sk(asVar) ? "video_normal_ad" : "image_normal_ad");
            if (z10) {
                double d10 = f10;
                jSONObject.put("video_duration", d10);
                jSONObject.put("video_percent", (int) (((j10 * 1.0d) / 10.0d) / d10));
            } else {
                jSONObject.put("image_duration", f10);
            }
        } catch (JSONException e10) {
            apu.hnj("TTAppOpenAdReport", "reportDestroy json error", e10);
        }
        qor.qor(asVar, "destroy", jSONObject);
    }

    public static void hnj(as asVar) {
        qor.qor(asVar, "cache_expire", (JSONObject) null);
    }

    public static void hnj(final String str, final int i10, final int i11, final boolean z10) {
        ua.hn(new com.bytedance.sdk.component.aq.hn.qor("opencache") { // from class: com.bytedance.sdk.openadsdk.component.gjv.hnj.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.hnj hnjVarHn;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = oj.qor().hnj(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (hnjVarHn = com.bytedance.sdk.openadsdk.core.model.hnj.hn(jSONObject)) == null || !hnjVarHn.sk()) {
                        return;
                    }
                    hnj.hnj(hnjVarHn.dkl(), i10, i11, z10);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void hnj(as asVar, int i10, int i11, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cache_lib", i10);
            jSONObject.put("cache_replace", z10 ? 1 : 0);
            jSONObject.put("cache_refresh_scene", i11);
            if (i11 == 0) {
                jSONObject.put("cache_preload", 0);
            } else {
                jSONObject.put("cache_preload", 1);
            }
            jSONObject.put("aoa_cache_count", com.bytedance.sdk.openadsdk.component.dse.hnj.aq());
            qor.hnj(asVar, "cache_refresh", -1L, (JSONObject) null, jSONObject);
        } catch (JSONException e10) {
            apu.hnj("TTAppOpenAdReport", "reportCacheRefresh json error", e10);
        }
    }

    public static void hnj(as asVar, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order", z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        qor.hnj(asVar, "download_image_duration", j10, jSONObject, (JSONObject) null);
    }

    public static void hnj(as asVar, int i10, pty ptyVar) {
        JSONObject jSONObject = new JSONObject();
        long jDkl = 0;
        try {
            jSONObject.put("openad_creative_type", as.sk(asVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i10);
            if (ptyVar != null) {
                ptyVar.hn(fvt.hn());
                hnj(jSONObject, asVar);
                jSONObject.put("client_start_time", ptyVar.hn());
                jSONObject.put("sever_time", ptyVar.gjv());
                jSONObject.put("network_time", ptyVar.qor());
                jSONObject.put("client_end_time", ptyVar.sk());
                jSONObject.put("download_resource_duration", ptyVar.dse());
                jSONObject.put("resource_source", ptyVar.aq());
                jSONObject.put("is_bidding", ptyVar.hnj ? 1 : 0);
                if (ptyVar.hnj) {
                    jSONObject.put("load_wait_time", ptyVar.f13986hn);
                }
                jDkl = ptyVar.dkl();
            }
        } catch (JSONException e10) {
            apu.hnj("TTAppOpenAdReport", "reportLoadNetDuration json error", e10);
        }
        qor.hnj(asVar, "load_net_duration", jDkl, jSONObject, (JSONObject) null);
    }

    public static void hnj(as asVar, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            hnj(jSONObject, asVar);
            jSONObject.put("openad_creative_type", as.sk(asVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            apu.qor("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        qor.hnj(asVar, "load_cache_duration", j10, jSONObject, (JSONObject) null);
    }

    public static void hnj(final pty ptyVar, final int i10, final int i11) {
        if (ptyVar != null) {
            gjv.hnj("app_running_time", false, new hn() { // from class: com.bytedance.sdk.openadsdk.component.gjv.hnj.3
                @Override // com.bytedance.sdk.openadsdk.jip.hn
                public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_running_time", ptyVar.ojm());
                    jSONObject.put("loaded_app_running_time", com.bytedance.sdk.openadsdk.component.dse.hnj.hn());
                    jSONObject.put("load_time", ptyVar.hnj().gjv());
                    jSONObject.put("load_from", i10);
                    jSONObject.put("load_result", i11);
                    int iTa = ptyVar.ta();
                    jSONObject.put("load_index", iTa);
                    if (iTa == 1) {
                        jSONObject.put("init_to_ad_load_time", SystemClock.elapsedRealtime() - fc.qor);
                    }
                    return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("app_running_time").hn(jSONObject.toString());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static void hnj(JSONObject jSONObject, as asVar) {
        int i10;
        if (asVar != null) {
            try {
                if (asVar.nyv()) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            } catch (JSONException e10) {
                apu.qor("TTAppOpenAdReport", e10.getMessage());
                return;
            }
        } else {
            i10 = 0;
        }
        jSONObject.put("is_icon_only", i10);
    }
}
