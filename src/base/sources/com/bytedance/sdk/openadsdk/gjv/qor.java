package com.bytedance.sdk.openadsdk.gjv;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.gm;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.vf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.fvt;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.coremedia.iso.boxes.MetaBox;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class qor {
    public static void dkl(as asVar, String str, final JSONObject jSONObject) {
        hnj(System.currentTimeMillis(), asVar, str, "click_playable_button", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.47
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                return jSONObject;
            }
        });
    }

    public static void gjv(final as asVar, final String str, final int i10) {
        hnj(System.currentTimeMillis(), asVar, str, "material_status", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.13
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trigger_type", i10);
                    jSONObject.put("image_mode", asVar.qri());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject hn(as asVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (hqh.hn(asVar) && asVar.za()) {
            try {
                jSONObject.put("is_new_playable", 1);
            } catch (Throwable th2) {
                apu.qor(th2.getMessage(), new Object[0]);
            }
        }
        hnj(jSONObject);
        hn(jSONObject);
        return jSONObject;
    }

    public static void qor(as asVar, String str, final long j10) {
        hnj(System.currentTimeMillis(), asVar, str, "load_feeling_duration", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.6
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable th2) {
                    apu.qor("TTAD.AdEvent", th2.getMessage());
                }
                jSONObject.toString();
                return jSONObject;
            }
        });
    }

    public static void sk(as asVar, final com.bytedance.sdk.openadsdk.jip.hnj.hnj hnjVar, final String str) {
        hnj(System.currentTimeMillis(), asVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.30
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                try {
                    com.bytedance.sdk.openadsdk.jip.hnj.hnj hnjVar2 = hnjVar;
                    if (hnjVar2 == null || hnjVar2.hnj() == -1) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hit_type", hnjVar.hnj());
                    jSONObject.put("hit_extra", hnjVar.hn());
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", hnjVar.qor());
                    jSONObject.put("current_url_index", hnjVar.gjv());
                    jSONObject.put("arbi_start_x", hnjVar.sk());
                    jSONObject.put("arbi_start_y", hnjVar.dkl());
                    jSONObject.put("click_duration", hnjVar.dse());
                    jSONObject.put("is_trigger_jump", hnjVar.aq());
                    jSONObject.put("click_type", String.valueOf(hnjVar.xn()));
                } catch (Throwable th2) {
                    apu.qor("TTAD.AdEvent", "onWebBehaviorClick", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void gjv(as asVar, final com.bytedance.sdk.openadsdk.jip.hnj.hnj hnjVar, final String str) {
        hnj(System.currentTimeMillis(), asVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.29
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", hnjVar.qor());
                    jSONObject.put("current_url_index", hnjVar.gjv());
                    jSONObject.put("trigger_scroll_x", hnjVar.ojm());
                    jSONObject.put("trigger_scroll_y", hnjVar.ta());
                    jSONObject.put("arbi_offset_y", hnjVar.dnm());
                    jSONObject.put("scroll_type", hnjVar.bug());
                    jSONObject.put("scroll_duration", hnjVar.orl());
                } catch (Throwable th2) {
                    apu.qor("TTAD.AdEvent", "onWebBehaviorScroll", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void hnj() {
        try {
            Class.forName(qor.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void qor(as asVar, String str, final int i10) {
        if (i10 == 200) {
            return;
        }
        hnj(System.currentTimeMillis(), asVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.8
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.dnm.hn().as());
                    return jSONObject;
                } catch (Throwable th2) {
                    apu.qor(th2.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void sk(as asVar, String str, final JSONObject jSONObject) {
        hnj(System.currentTimeMillis(), asVar, str, "click_next_ad_button", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.46
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                return jSONObject;
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class hnj {
        public static void hnj(String str, final JSONObject jSONObject, as asVar) {
            String strHnj = orp.hnj(asVar);
            if (strHnj == null) {
                return;
            }
            qor.hnj(System.currentTimeMillis(), asVar, strHnj + "_landingpage", str, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.hnj.1
                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject qor() {
                    return jSONObject;
                }
            });
        }

        public static void hnj(final int i10, final int i11, as asVar) {
            String strHnj = orp.hnj(asVar);
            if (strHnj == null) {
                return;
            }
            qor.hnj(System.currentTimeMillis(), asVar, strHnj + "_landingpage", "local_res_hit_rate", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.hnj.2
                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject qor() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("all_times", i11);
                        jSONObject.put("hit_times", i10);
                        return jSONObject;
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                        return jSONObject;
                    }
                }
            });
        }

        public static void hnj(final long j10, final as asVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            qor.hnj(System.currentTimeMillis(), asVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.hnj.3
                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject hn() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", j10);
                        return jSONObject;
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                        return jSONObject;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject hnj() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(as.f13880hn, asVar.hw() ? 1 : 0);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject qor() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(iLoader, str2);
                        jSONObject.put("url", asVar.xe());
                        jSONObject.put("channel_name", asVar.rx());
                        jSONObject.put("interceptor_status", (TextUtils.isEmpty(asVar.rx()) || iHnj <= 0) ? 0 : 1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", iHnj);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                        return jSONObject;
                    }
                }
            });
        }

        public static void hnj(final int i10, final int i11, final int i12, final int i13, final as asVar, String str, final int i14) {
            if (str == null || TextUtils.isEmpty(asVar.rx())) {
                return;
            }
            qor.hnj(System.currentTimeMillis(), asVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.hnj.4
                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject qor() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("next_url", asVar.xe());
                        jSONObject.put("channel_name", asVar.rx());
                        jSONObject.put("preload_status", i10 <= 0 ? 0 : 2);
                        jSONObject.put("first_page", i14);
                        jSONObject.put("preload_h5_type", asVar.sq());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("channel_response", i10);
                        jSONObject2.put("failResourceCount", i11);
                        jSONObject2.put("successCount", i12);
                        jSONObject2.put("failCount", i13);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void gjv(as asVar, String str, final JSONObject jSONObject) {
        hnj(System.currentTimeMillis(), asVar, str, "show_next_ad_hint", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.45
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                return jSONObject;
            }
        });
    }

    public static void hnj(as asVar, String str, final int i10) {
        hnj(System.currentTimeMillis(), asVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("preload_status", Integer.valueOf(i10));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qor(final as asVar, String str) {
        if (asVar == null || !as.qor(asVar) || asVar.fvt() == null) {
            return;
        }
        hnj(System.currentTimeMillis(), asVar, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.25
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", asVar.fvt().qor());
                    jSONObject.putOpt("id", asVar.fvt().hnj());
                    jSONObject.putOpt("md5", asVar.fvt().hn());
                    if (asVar.pwt() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(asVar.pwt().m()));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(final as asVar, String str) {
        hnj(System.currentTimeMillis(), asVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.12
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (as.qor(asVar)) {
                        if (asVar.fvt() != null) {
                            jSONObject.putOpt("url", asVar.fvt().qor());
                            jSONObject.putOpt("id", asVar.fvt().hnj());
                            jSONObject.putOpt("md5", asVar.fvt().hn());
                        }
                        if (asVar.pwt() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", asVar.pwt().d());
                        jSONObject.putOpt("style_id", asVar.ul());
                        if (asVar.pwt() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e10) {
                    apu.qor(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void hnj(final as asVar, String str, final long j10) {
        hnj(System.currentTimeMillis(), asVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.23
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (as.qor(asVar)) {
                        if (asVar.fvt() != null) {
                            jSONObject.putOpt("url", asVar.fvt().qor());
                            jSONObject.putOpt("id", asVar.fvt().hnj());
                            jSONObject.putOpt("md5", asVar.fvt().hn());
                        }
                        if (asVar.pwt() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", asVar.pwt().d());
                        jSONObject.putOpt("style_id", asVar.ul());
                        if (asVar.pwt() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e10) {
                    apu.qor(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void qor(as asVar, final com.bytedance.sdk.openadsdk.jip.hnj.hnj hnjVar, final String str) {
        hnj(System.currentTimeMillis(), asVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.28
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", hnjVar.qor());
                    jSONObject.put("current_url_index", hnjVar.gjv());
                    jSONObject.put("arbi_stay_duration", hnjVar.mjg());
                    jSONObject.put("browsing_percentage", hnjVar.fc());
                    jSONObject.put("out_focus_scene", hnjVar.jip());
                } catch (Throwable th2) {
                    apu.qor("TTAD.AdEvent", "onWebBehaviorStay", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(final as asVar, String str, final long j10, final int i10, final String str2, final String str3) {
        hnj(System.currentTimeMillis(), asVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.33
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (as.qor(asVar)) {
                        if (asVar.fvt() != null) {
                            jSONObject.putOpt("url", asVar.fvt().qor());
                            jSONObject.putOpt("id", asVar.fvt().hnj());
                            jSONObject.putOpt("md5", asVar.fvt().hn());
                        }
                        if (asVar.pwt() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", asVar.pwt().d());
                        jSONObject.putOpt("style_id", asVar.ul());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.putOpt("error_url", str3);
                        }
                        if (asVar.pwt() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_msg", str2);
                    return jSONObject;
                } catch (Exception e10) {
                    apu.qor(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void qor(as asVar, String str, String str2, final JSONObject jSONObject) {
        if (asVar == null || jSONObject == null) {
            return;
        }
        hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.35
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                return jSONObject;
            }
        });
    }

    private static void hn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectHnj = aq.hnj();
            if (jSONObjectHnj != null) {
                Iterator<String> itKeys = jSONObjectHnj.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectHnj.get(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void hnj(final as asVar, String str, final long j10, final int i10, final int i11) {
        hnj(System.currentTimeMillis(), asVar, str, TrackLoadSettingsAtom.TYPE, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.44
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", Math.min(j10, TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("interaction_method", Integer.valueOf(asVar.fr()));
                    jSONObject.put("first_page", i11);
                    jSONObject.put("preload_h5_type", asVar.sq());
                    int i12 = i10;
                    if (i12 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i12));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qor(as asVar, String str, JSONObject jSONObject) {
        if (asVar == null) {
            return;
        }
        hnj(asVar, str, -1L, jSONObject, (JSONObject) null);
    }

    public static void hnj(String str, as asVar, String str2, final Map<String, Object> map) {
        hnj(System.currentTimeMillis(), asVar, str2, str, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.48
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                try {
                    if (map == null) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @DungeonFlag
    public static void hnj(as asVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        hnj(asVar, "show", str, jSONObject, jSONObject2);
    }

    @DungeonFlag
    private static void hnj(final as asVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (asVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (asVar.cm() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            asVar.ta(true);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hnj(new com.bytedance.sdk.component.aq.hn.qor("onShow") { // from class: com.bytedance.sdk.openadsdk.gjv.qor.49
            @Override // java.lang.Runnable
            public void run() {
                final String strHnj;
                if (com.bytedance.sdk.openadsdk.core.oj.gjv().xn()) {
                    strHnj = com.bytedance.sdk.openadsdk.core.dnm.hnj.hnj.hnj((Application) com.bytedance.sdk.openadsdk.core.oj.hnj()).hnj(str2, DeviceUtils.hnj(), asVar.atw());
                } else {
                    strHnj = DevicePublicKeyStringDef.NONE;
                }
                qor.hnj(jCurrentTimeMillis, asVar, str2, str, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.49.1
                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject hn() {
                        Object obj;
                        try {
                            vf.hn(asVar);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.putOpt("log_extra", asVar.ldn());
                                float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - asVar.jfp()).floatValue();
                                if (fFloatValue <= 0.0f) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                                long jElapsedRealtime = SystemClock.elapsedRealtime() - asVar.ojm();
                                if (jElapsedRealtime > 0) {
                                    jSONObject3.put("duration", jElapsedRealtime);
                                }
                                jSONObject3.putOpt("ua_policy", Integer.valueOf(asVar.af()));
                                String strMeb = asVar.meb();
                                if (!TextUtils.isEmpty(strMeb) && !TextUtils.isEmpty(strMeb)) {
                                    try {
                                        jSONObject3.put("ttdsp_price", Math.round(Float.parseFloat(strMeb) * 100000.0f));
                                    } catch (Throwable th2) {
                                        jSONObject3.put("ttdsp_price", 0);
                                        apu.qor("TTAD.AdEvent", th2.getMessage());
                                    }
                                }
                                if (asVar.jd() == null) {
                                    return jSONObject3;
                                }
                                try {
                                    Object obj2 = asVar.jd().get(TTAdConstant.SDK_BIDDING_TYPE);
                                    if (obj2 == null || Integer.parseInt(obj2.toString()) != 2 || (obj = asVar.jd().get(BidResponsed.KEY_PRICE)) == null) {
                                        return jSONObject3;
                                    }
                                    jSONObject3.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject3;
                                } catch (Throwable th3) {
                                    apu.hnj("TTAD.AdEvent", "client bidding price error: ", th3);
                                    return jSONObject3;
                                }
                                return jSONObject3;
                            } catch (Exception unused) {
                                return jSONObject3;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject hnj() {
                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                        JSONObject jSONObject3 = jSONObject2;
                        return jSONObject3 == null ? qor.hn(asVar, new JSONObject()) : qor.hn(asVar, jSONObject3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject qor() {
                        try {
                            AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 != null) {
                                jSONObject3.put("interaction_method", asVar.fr());
                                AnonymousClass49 anonymousClass410 = AnonymousClass49.this;
                                jSONObject.put("real_interaction_method", asVar.qb());
                                jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.oj.gjv().orl(String.valueOf(asVar.atw())));
                                jSONObject.put("au_show", strHnj);
                                return jSONObject;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("interaction_method", asVar.fr());
                            jSONObject4.put("real_interaction_method", asVar.qb());
                            jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.oj.gjv().orl(String.valueOf(asVar.atw())));
                            jSONObject4.put("au_show", strHnj);
                            return jSONObject4;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                if ("show".equals(str)) {
                    if (!asVar.sz()) {
                        if (asVar.ouk()) {
                            com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(asVar.sl(), new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn("show_urls", asVar));
                        } else {
                            qor.hnj(asVar);
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        int iOptInt = jSONObject3.optInt("dynamic_show_type");
                        if (asVar.xad() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            com.bytedance.sdk.component.utils.ojm.hnj().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.49.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("auto_click", true);
                                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                                        qor.hn(asVar, str2, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject4);
                                    } catch (Exception unused) {
                                        apu.qor("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.dnm.hn().rd());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.dnm.qor.hnj(asVar, strHnj);
                }
            }
        });
    }

    public static void hn(as asVar, String str, final long j10) {
        if (asVar != null && j10 > 0 && j10 < 200000) {
            hnj(System.currentTimeMillis(), asVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.3
                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject qor() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j10);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void hn(as asVar, String str, final int i10) {
        hnj(System.currentTimeMillis(), asVar, str, "check_meta", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.7
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.dnm.hn().as());
                    return jSONObject;
                } catch (Throwable th2) {
                    apu.qor(th2.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void hn(final as asVar, String str) {
        hnj(System.currentTimeMillis(), asVar, str, "picture_click", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.14
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", asVar.iz());
                    jSONObject.put("interaction_method", asVar.fr());
                    return jSONObject;
                } catch (Throwable th2) {
                    apu.qor(th2.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void hn(as asVar, String str, String str2, final JSONObject jSONObject) {
        hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.18
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                return jSONObject;
            }
        });
    }

    private static void hnj(JSONObject jSONObject) {
        try {
            jSONObject.put("screen_scale", sq.dkl(com.bytedance.sdk.openadsdk.core.oj.hnj()));
        } catch (Throwable unused) {
        }
    }

    public static void hn(final long j10, final as asVar, String str, final String str2) {
        hnj(System.currentTimeMillis(), asVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.24
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                    return jSONObject;
                } catch (Exception e10) {
                    apu.qor(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (as.qor(asVar)) {
                        if (asVar.fvt() != null) {
                            jSONObject.putOpt("url", asVar.fvt().qor());
                            jSONObject.putOpt("id", asVar.fvt().hnj());
                            jSONObject.putOpt("md5", asVar.fvt().hn());
                        }
                        jSONObject.putOpt("from", str2);
                        if (asVar.pwt() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.put("url", asVar.pwt().d());
                        jSONObject.put("style_id", asVar.ul());
                        if (asVar.pwt() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e10) {
                    apu.qor(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void hnj(as asVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.orl.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.hnj.hn.hnj(com.bytedance.sdk.openadsdk.p000do.hnj.hnj(asVar.sl(), true), 1, asVar.sp());
    }

    public static void hn(as asVar, final com.bytedance.sdk.openadsdk.jip.hnj.hnj hnjVar, final String str) {
        hnj(System.currentTimeMillis(), asVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.27
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", hnjVar.qor());
                    jSONObject.put("current_url_index", hnjVar.gjv());
                    jSONObject.put("arbi_load_duration", hnjVar.oj());
                } catch (Throwable th2) {
                    apu.qor("TTAD.AdEvent", "onWebBehaviorLoad", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void hn(as asVar, String str, String str2, final JSONObject jSONObject, final long j10) {
        if (asVar == null || jSONObject == null) {
            return;
        }
        hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.34
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                return jSONObject;
            }
        });
    }

    public static void hn(as asVar, String str, final JSONObject jSONObject) {
        hnj(System.currentTimeMillis(), asVar, str, hn.dkl, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.37
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                return jSONObject;
            }
        });
    }

    public static void hn(as asVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        hnj(asVar, "activity_recreate", str, jSONObject, jSONObject2);
    }

    @DungeonFlag
    public static void hnj(final String str, final as asVar, final String str2, final dse dseVar) {
        if (asVar == null || dseVar == null || !dseVar.hnj()) {
            return;
        }
        hnj(System.currentTimeMillis(), asVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.50
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", str);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                try {
                    dse dseVar2 = dseVar;
                    if (dseVar2 == null || dseVar2.hn() == null) {
                        return null;
                    }
                    JSONObject jSONObjectHn = dseVar.hn();
                    if (str2.equals("open_ad")) {
                        jSONObjectHn.put("is_icon_only", asVar.nyv() ? 1 : 0);
                    }
                    return jSONObjectHn;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void hn(as asVar, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        hn(asVar, str, "download_app_ad_track", jSONObject);
    }

    public static void hnj(final as asVar, final String str, final fvt fvtVar) {
        if (asVar == null) {
            return;
        }
        final long jGjv = fvtVar.gjv();
        hnj(System.currentTimeMillis(), asVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.2
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jGjv);
                    jSONObject.put("click_time", fvtVar.hnj);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", asVar.nyv() ? 1 : 0);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(as asVar, final String str, final int i10, final String str2, final long j10, final boolean z10, final int i11, final long j11) {
        hnj(System.currentTimeMillis(), asVar, str, hn.gjv, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.4
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j10);
                    jSONObject.put("arbi_trigger_start", z10);
                    jSONObject.put("arbi_convert_count", i11);
                    jSONObject.put("loading_start_timestamp", j11);
                } catch (Throwable th2) {
                    apu.qor(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(as asVar, String str, final long j10, final boolean z10) {
        hnj(System.currentTimeMillis(), asVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.5
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                    return jSONObject;
                } catch (Throwable th2) {
                    apu.qor(th2.toString(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z10 ? 1 : 2);
                    return jSONObject;
                } catch (Throwable th2) {
                    apu.qor(th2.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void hnj(as asVar, String str, final int i10, final String str2, final int i11) {
        hnj(System.currentTimeMillis(), asVar, str, hn.hnj, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.9
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("new_index", i11);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(as asVar, final String str, final int i10, final String str2, final float f10) {
        hnj(System.currentTimeMillis(), asVar, str, hn.f14349hn, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.10
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f10);
                } catch (Throwable th2) {
                    apu.qor(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(as asVar, final String str, final int i10, final String str2, final String str3, final int i11) {
        hnj(System.currentTimeMillis(), asVar, str, hn.qor, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.11
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("load_url", str3);
                    jSONObject.put("url_flag", i11);
                } catch (Throwable th2) {
                    apu.qor(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void hnj(final String str, final as asVar, final com.bytedance.sdk.openadsdk.core.model.bug bugVar, final String str2, final boolean z10, final Map<String, Object> map, final int i10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hnj(new com.bytedance.sdk.component.aq.hn.qor("onClick") { // from class: com.bytedance.sdk.openadsdk.gjv.qor.15
            @Override // java.lang.Runnable
            public void run() {
                as asVar2 = asVar;
                if (asVar2 == null) {
                    return;
                }
                qor.hnj(jCurrentTimeMillis, asVar2, str2, str, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.15.1
                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject hn() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.bug bugVar2 = bugVar;
                            if (bugVar2 != null) {
                                JSONObject jSONObjectHnj = bugVar2.hnj();
                                jSONObjectHnj.put("is_valid", z10);
                                int i11 = i10;
                                if (i11 > 0 && i11 <= 2) {
                                    jSONObjectHnj.put("user_behavior_type", i11);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey("duration")) {
                                        jSONObject.put("duration", map.get("duration"));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!"duration".equals(entry.getKey())) {
                                            jSONObjectHnj.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectHnj.put("interaction_method", asVar.fr());
                                if (str2.equals(PvZsvNiPV.EVCIF)) {
                                    jSONObjectHnj.put("is_icon_only", asVar.nyv() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectHnj.toString());
                            }
                            jSONObject.putOpt("log_extra", asVar.ldn());
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - asVar.jfp()).floatValue();
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(asVar.af()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.orl.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj())) && CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    com.bytedance.sdk.openadsdk.gjv.hnj.hn.hnj(com.bytedance.sdk.openadsdk.p000do.hnj.hnj(asVar.xd(), true), 2, asVar.sp());
                }
                if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    vf.qor(asVar);
                }
            }
        });
    }

    public static void hnj(as asVar, String str, String str2, final JSONObject jSONObject) {
        hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.16
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!jSONObject.has("duration")) {
                        return jSONObject2;
                    }
                    jSONObject2.put("duration", jSONObject.get("duration"));
                    return jSONObject2;
                } catch (Exception e10) {
                    apu.qor("TTAD.AdEvent", e10.getMessage());
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                return jSONObject;
            }
        });
        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str2)) {
            vf.qor(asVar);
        }
    }

    public static void hnj(as asVar, String str, final String str2, final long j10, final int i10, JSONObject jSONObject, final dse dseVar) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject2 = jSONObject;
        hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.17
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("duration", j10);
                    jSONObject3.put("percent", i10);
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                dse dseVar2;
                try {
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (dseVar2 = dseVar) != null) {
                        dseVar2.hnj(jSONObject2);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void hnj(as asVar, String str, String str2, final JSONObject jSONObject, final long j10) {
        hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.19
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j10);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                return jSONObject;
            }
        });
    }

    public static void hnj(final as asVar, String str, String str2, final Map<String, Object> map) {
        hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.20
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        Object obj = map2.get("duration");
                        if (obj instanceof Long) {
                            jSONObject.put("duration", obj);
                        }
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("dp_creative_type", asVar.vz());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void hnj(long j10, as asVar, String str, String str2) {
        hnj(j10, asVar, str, str2, (com.bytedance.sdk.openadsdk.jip.hn.hn) null);
    }

    @DungeonFlag
    public static void hnj(final long j10, final as asVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.jip.hn.hn hnVar) {
        if (asVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || hnj(asVar.lu(), str2)) {
            return;
        }
        hnj(new com.bytedance.sdk.component.aq.hn.qor(str2) { // from class: com.bytedance.sdk.openadsdk.gjv.qor.21
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.jip.hn.hn hnVar2 = hnVar;
                    if (hnVar2 != null) {
                        jSONObject = hnVar2.hn();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    com.bytedance.sdk.openadsdk.jip.hn.hn hnVar3 = hnVar;
                    if (hnVar3 != null) {
                        JSONObject jSONObjectHnj = hnVar3.hnj();
                        JSONObject jSONObjectQor = hnVar.qor();
                        if (jSONObjectHnj != null) {
                            if (jSONObjectQor == null) {
                                jSONObjectQor = new JSONObject();
                            }
                            jSONObjectQor.put("pag_json_data", jSONObjectHnj.toString());
                            jSONObject.put("ad_extra_data", jSONObjectQor.toString());
                        } else if (jSONObjectQor != null) {
                            jSONObject.put("ad_extra_data", jSONObjectQor.toString());
                        }
                    }
                    jSONObject.putOpt("log_extra", asVar.ldn());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(asVar.af()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new com.bytedance.sdk.openadsdk.gjv.hnj.C0242hnj(j10, asVar).hn(str).qor(str2).sk(asVar.sp()).aq(asVar.pv()).hnj(asVar.ett()).hnj(asVar.osq()).hnj(jSONObject).dse(asVar.jp()).hnj((com.bytedance.sdk.openadsdk.gjv.hn.hnj) null);
            }
        });
    }

    public static void hnj(as asVar, String str, final String str2, final int i10) {
        hnj(System.currentTimeMillis(), asVar, str, "playable_track", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.22
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new_playable", 1);
                    jSONObject.put("is_pre_render", i10);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_event", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(as asVar, final com.bytedance.sdk.openadsdk.jip.hnj.hnj hnjVar, final String str) {
        hnj(System.currentTimeMillis(), asVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.26
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", hnjVar.qor());
                    jSONObject.put("keyword", hnjVar.uua());
                } catch (Throwable th2) {
                    apu.qor("TTAD.AdEvent", "onWebBehaviorKeyword", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(final long j10, final as asVar, String str) {
        if (asVar == null || !as.qor(asVar) || asVar.fvt() == null) {
            return;
        }
        hnj(System.currentTimeMillis(), asVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.31
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                    return jSONObject;
                } catch (Exception e10) {
                    apu.qor(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", asVar.fvt().qor());
                    jSONObject.putOpt("id", asVar.fvt().hnj());
                    jSONObject.putOpt("md5", asVar.fvt().hn());
                    if (asVar.pwt() == null) {
                        return jSONObject;
                    }
                    jSONObject.putOpt("render_type", Integer.valueOf(asVar.pwt().m()));
                    return jSONObject;
                } catch (Exception e10) {
                    apu.qor(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void hnj(as asVar, String str, String str2, final long j10, final JSONObject jSONObject) {
        if (asVar == null || jSONObject == null) {
            return;
        }
        hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.32
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j10);
                    return jSONObject2;
                } catch (Exception e10) {
                    apu.qor("TTAD.AdEvent", e10.getMessage());
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                return jSONObject;
            }
        });
    }

    public static void hnj(as asVar, String str, final JSONObject jSONObject) {
        hnj(System.currentTimeMillis(), asVar, str, hn.f14350sk, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.36
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                return jSONObject;
            }
        });
    }

    public static void hnj(String str, long j10) {
        com.bytedance.sdk.openadsdk.core.aq.qor.hnj(str, j10);
    }

    @DungeonFlag
    public static void hnj(final as asVar, final String str, final String str2, final String str3, final long j10, final long j11, final JSONObject jSONObject, final boolean z10) {
        if (asVar == null || hnj(asVar.lu(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hnj(new com.bytedance.sdk.component.aq.hn.qor("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.gjv.qor.38
            @Override // java.lang.Runnable
            public void run() {
                JSONArray jSONArrayOptJSONArray;
                String strEtt = asVar.ett();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(strOptString)) {
                            jSONObject2 = new JSONObject(strOptString);
                        }
                        if (!CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            jSONObject2.put("device", DeviceUtils.dse(com.bytedance.sdk.openadsdk.core.oj.hnj()).toString());
                        }
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            if (z10) {
                                jSONObject2.put("click_scence", 1);
                            } else if (hqh.hn(asVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (asVar.za()) {
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                }
                                jSONObjectOptJSONObject.put("is_new_playable", 1);
                                if (asVar.hjf()) {
                                    jSONObjectOptJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        if (com.bytedance.sdk.openadsdk.mjg.hnj.qor(asVar)) {
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("pag_json_data");
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONObjectOptJSONObject2 = new JSONObject();
                            }
                            jSONObjectOptJSONObject2.put("is_lp_pre_render", asVar.aj() ? 1 : 0);
                            jSONObject2.put("pag_json_data", jSONObjectOptJSONObject2.toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z10 && iOptInt == 2) {
                            strEtt = jSONObject2.optString("app_log_url");
                        }
                        int i10 = 0;
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            vf.qor(asVar);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - as.hn(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.orl.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()))) {
                                if (z10 && iOptInt == 2) {
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i10 < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i10));
                                            i10++;
                                        }
                                        com.bytedance.sdk.openadsdk.gjv.hnj.hn.hnj(com.bytedance.sdk.openadsdk.p000do.hnj.hnj(arrayList, true), 2, String.valueOf(j10));
                                    }
                                } else {
                                    as asVar2 = asVar;
                                    if (asVar2 != null) {
                                        com.bytedance.sdk.openadsdk.gjv.hnj.hn.hnj(com.bytedance.sdk.openadsdk.p000do.hnj.hnj(asVar2.xd(), true), 2, asVar.sp());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.orl.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj())) && z10 && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i10 < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i10));
                                i10++;
                            }
                            com.bytedance.sdk.openadsdk.gjv.hnj.hn.hnj(com.bytedance.sdk.openadsdk.p000do.hnj.hnj(arrayList2, true), 1, String.valueOf(j10));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new com.bytedance.sdk.openadsdk.gjv.hnj.C0242hnj(jCurrentTimeMillis, asVar).gjv(str).hn(str2).qor(str3).sk(String.valueOf(j10)).dkl(String.valueOf(j11)).hnj(strEtt).hnj(asVar.osq()).hnj(jSONObject).aq(asVar.pv()).dse(asVar.jp()).hnj((com.bytedance.sdk.openadsdk.gjv.hn.hnj) null);
            }
        });
    }

    public static void hnj(final as asVar, String str, final long j10, final JSONObject jSONObject, final JSONObject jSONObject2) {
        hnj(System.currentTimeMillis(), asVar, "open_ad", str, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.39
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    long j11 = j10;
                    if (j11 == -1) {
                        return jSONObject3;
                    }
                    jSONObject3.put("duration", j11);
                    return jSONObject3;
                } catch (Exception e10) {
                    apu.qor("TTAD.AdEvent", e10.getMessage());
                    return jSONObject3;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                try {
                    as asVar2 = asVar;
                    if (asVar2 != null) {
                        int iTa = asVar2.ta();
                        jSONObject3.putOpt("start_type", Integer.valueOf(iTa == 1 ? 1 : 2));
                        jSONObject3.putOpt("load_index", Integer.valueOf(iTa));
                        if (iTa == 1) {
                            jSONObject3.putOpt("init_to_ad_load_time", Long.valueOf(SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.core.fc.qor));
                        }
                    }
                    jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.dse.hnj.gjv()));
                    jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.dse.hnj.hn()));
                    return jSONObject3;
                } catch (Exception e10) {
                    e10.getMessage();
                    return jSONObject3;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                try {
                    JSONObject jSONObject3 = jSONObject;
                    return jSONObject3 != null ? jSONObject3 : new JSONObject();
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static void hnj(final com.bytedance.sdk.component.aq.hn.qor qorVar) {
        if (qorVar == null) {
            return;
        }
        if (ua.dkl()) {
            com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.40
                @Override // java.lang.Runnable
                public void run() {
                    ua.hn(qorVar, 10);
                }
            });
        } else if (!ua.dse()) {
            ua.hn(qorVar, 10);
        } else {
            qorVar.run();
        }
    }

    public static void hnj(final com.bytedance.sdk.openadsdk.jip.hnj.hn hnVar) {
        if (hnVar == null || hnVar.hn() == null) {
            return;
        }
        final as asVarHn = hnVar.hn();
        final int iRg = asVarHn.rg();
        if (iRg == 2 || iRg == 8 || (orp.gjv(asVarHn) && hn.hnj.gjv.equals(hnVar.hnj()))) {
            hnj(System.currentTimeMillis(), asVarHn, hnVar.qor(), "open_browser", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.41
                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject qor() {
                    JSONArray jSONArrayOptJSONArray;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iGjv = hnVar.gjv();
                        jSONObject.put("count", orp.ta(com.bytedance.sdk.openadsdk.core.oj.hnj()));
                        jSONObject.put("interceptor", iGjv);
                        jSONObject.put("success", hnVar.sk());
                        jSONObject.put("link", hnVar.hnj());
                        jSONObject.put("interaction_type", iRg);
                        jSONObject.put("real_interaction_type", hnVar.dse());
                        if (hnVar.gjv() == 9) {
                            jSONObject.put("is_act_signals_api_available", hnVar.aq());
                            jSONObject.put("is_act_signals_callback", hnVar.ojm());
                        }
                        if (!TextUtils.isEmpty(hnVar.dkl())) {
                            jSONObject.put("exception_msg", hnVar.dkl());
                        }
                        if (iGjv == 2 || iGjv == 5) {
                            String strTm = asVarHn.tm();
                            if (!TextUtils.isEmpty(strTm) && (jSONArrayOptJSONArray = new JSONObject(strTm).optJSONArray("creatives")) != null && jSONArrayOptJSONArray.length() > 0) {
                                jSONObject.put(MetaBox.TYPE, jSONArrayOptJSONArray.optJSONObject(asVarHn.qor()));
                            }
                        }
                        return jSONObject;
                    } catch (Throwable th2) {
                        apu.qor("TTAD.AdEvent", th2.getMessage());
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void hnj(JSONObject jSONObject, int i10, int i11) {
        try {
            jSONObject.put("skip_show_time", i10);
            jSONObject.put(PvZsvNiPV.jVwKJU, i11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skip_after_time", i11 - (i10 * 1000));
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    public static void hnj(as asVar, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        hn(asVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void hnj(as asVar, String str, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final int i10, final Map<String, Object> map) {
        hnj(System.currentTimeMillis(), asVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.42
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSkip", z10);
                    jSONObject.put("force", z11);
                    jSONObject.put("isFromLandingPage", z12);
                    jSONObject.put("finishing", z13);
                    jSONObject.put("from", i10);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(final as asVar, final boolean z10, String str, final String str2, final long j10, final String str3, final String str4, final int i10, final String str5) {
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        hnj(System.currentTimeMillis(), asVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.qor.43
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                as.hnj hnjVarZd;
                gm gmVarVk;
                JSONObject jSONObject = new JSONObject();
                try {
                    String str6 = str4;
                    int iHashCode = str6.hashCode();
                    if (iHashCode != -1606803861) {
                        if (iHashCode != 3107) {
                            if (iHashCode == 2989536 && str6.equals("adv3") && (gmVarVk = asVar.vk()) != null) {
                                jSONObject.putOpt("url", gmVarVk.qor());
                                jSONObject.putOpt("id", gmVarVk.hnj());
                                jSONObject.putOpt("md5", gmVarVk.hn());
                            }
                        } else if (str6.equals("ad") && (hnjVarZd = asVar.zd()) != null) {
                            jSONObject.putOpt("url", hnjVarZd.orl());
                            jSONObject.putOpt("id", hnjVarZd.gjv());
                            jSONObject.putOpt("md5", hnjVarZd.mjg());
                        }
                    } else if (str6.equals(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
                        if (z10) {
                            com.bytedance.sdk.openadsdk.core.bug.aq.hnj hnjVarOrp = asVar.orp();
                            if (hnjVarOrp != null) {
                                jSONObject.putOpt("url", hnjVarOrp.qor());
                                jSONObject.putOpt("id", hnjVarOrp.hnj());
                                jSONObject.putOpt("md5", hnjVarOrp.hn());
                            }
                        } else {
                            com.bytedance.sdk.openadsdk.core.bug.aq.hnj hnjVarFvt = asVar.fvt();
                            if (hnjVarFvt != null) {
                                jSONObject.putOpt("url", hnjVarFvt.qor());
                                jSONObject.putOpt("id", hnjVarFvt.hnj());
                                jSONObject.putOpt("md5", hnjVarFvt.hn());
                            }
                        }
                    }
                    jSONObject.put("ugen_status", str2);
                    jSONObject.put("from", str3);
                    jSONObject.put("ugen_scene", str4);
                    if ("fail".equals(str2)) {
                        jSONObject.put("error_code", i10);
                        jSONObject.put("error_msg", str5);
                        return jSONObject;
                    }
                } catch (Throwable th2) {
                    try {
                        jSONObject.put("error_code", Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE);
                        jSONObject.put("error_msg", "send template error " + th2.getMessage());
                    } catch (Throwable unused) {
                    }
                }
                return jSONObject;
            }
        });
    }

    private static boolean hnj(int i10, String str) {
        int iHn;
        try {
            Set<String> setAf = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().af();
            if ((i10 == 1 && setAf != null && setAf.contains(str)) || (iHn = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().hn(str)) == 0) {
                return true;
            }
            return iHn != 100 && ((int) ((Math.random() * 100.0d) + 1.0d)) > iHn;
        } catch (Throwable th2) {
            apu.qor("TTAD.AdEvent", th2.getMessage());
            return false;
        }
    }

    public static JSONObject hnj(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_show_order", i10);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
