package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import c1.pGX.geAgcEazw;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.eum;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.gm;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.api.client.http.HttpStatusCodes;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.vungle.ads.internal.signals.b;
import f8.Ygx.FuoITeVPeXAj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class aq extends ta {
    static final ArrayList<String> gjv = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    public boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Set<String> f14174sk;

    public aq(ta.hnj hnjVar) {
        super(hnjVar);
        this.f14174sk = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ta
    protected String hnj() {
        try {
            String str = "tt_sdk_settings_sr.prop";
            if (oj.hnj() == null || eum.hnj(oj.hnj())) {
                return str;
            }
            return "tt_sdk_settings_sr_" + eum.qor(oj.hnj()) + ".prop";
        } catch (Throwable unused) {
            return "tt_sdk_settings_sr";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.sk
    public void hnj(JSONObject jSONObject) throws Throwable {
        int iOptInt;
        sk.hnj hnjVarHn = hn();
        JSONObject jSONObjectDkl = dnm.hn().dkl();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("digest");
        this.qor = (jSONObjectOptJSONObject == null || jSONObjectDkl == null || !jSONObjectOptJSONObject.toString().equals(jSONObjectDkl.toString())) ? false : true;
        if (jSONObjectOptJSONObject != null) {
            hnjVarHn.hnj("digest", jSONObjectOptJSONObject.toString());
        } else {
            hnjVarHn.hnj("digest");
        }
        hnjVarHn.hnj(FuoITeVPeXAj.LSoglihFdyvF, jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long jOptLong = jSONObject.optLong("req_inter_min", 10L) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            if (jOptLong < 0 || jOptLong > b.TWENTY_FOUR_HOURS_MILLIS) {
                jOptLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            hnjVarHn.hnj("req_inter_min", jOptLong);
        }
        if (jSONObject.has("lp_new_style")) {
            hnjVarHn.hnj("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int iOptInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (iOptInt2 < 0 || iOptInt2 > 100) {
                iOptInt2 = 30;
            }
            hnjVarHn.hnj("blank_detect_rate", iOptInt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has("duration")) {
                hnjVarHn.hnj("duration", jSONObjectOptJSONObject2.optLong("duration") * 1000);
            }
            if (jSONObjectOptJSONObject2.has("max")) {
                hnjVarHn.hnj("max", jSONObjectOptJSONObject2.optInt("max"));
            }
        }
        if (jSONObject.has("vbtt")) {
            hnjVarHn.hnj("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("abtest");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("version")) {
                hnjVarHn.hnj("ab_test_version", jSONObjectOptJSONObject3.optString("version"));
            }
            if (jSONObjectOptJSONObject3.has("param")) {
                hnjVarHn.hnj("ab_test_param", jSONObjectOptJSONObject3.optString("param"));
            }
        } else {
            dnm.hn().aq();
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("global_rate")) {
            hnjVarHn.hnj("global_rate", (float) jSONObjectOptJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            hnjVarHn.hnj("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            hnjVarHn.hnj("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            hnjVarHn.hnj("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("settings_url")) {
            hnjVarHn.hnj("settings_url", jSONObject.optString("settings_url"));
        }
        if (jSONObject.has("app_log_url")) {
            hnjVarHn.hnj("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            hnjVarHn.hnj("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            hnjVarHn.hnj("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            hnjVarHn.hnj("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            hnjVarHn.hnj("dc", jSONObject.optString("dc"));
        }
        dnm.hn().hnj(jSONObject, hnjVarHn);
        if (jSONObject.has("if_both_open")) {
            hnjVarHn.hnj("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            hnjVarHn.hnj("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            hnjVarHn.hnj("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            hnjVarHn.hnj("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        if (jSONObject.has("target_region")) {
            hnjVarHn.hnj("target_region", jSONObject.optString("target_region", ""));
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (jSONObjectOptJSONObject5 != null) {
            if (jSONObjectOptJSONObject5.has("force_language")) {
                String strOptString = jSONObjectOptJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(strOptString) && gjv.contains(strOptString)) {
                    hnjVarHn.hnj("force_language", strOptString);
                }
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                hnjVarHn.hnj("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject5.optInt("fetch_tpl_timeout_ctrl", AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_second")) {
                hnjVarHn.hnj("fetch_tpl_second", jSONObjectOptJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (jSONObjectOptJSONObject5.has("support_gzip")) {
                hnjVarHn.hnj("support_gzip", jSONObjectOptJSONObject5.optBoolean("support_gzip", false));
            }
            if (jSONObjectOptJSONObject5.has("aes_key")) {
                hnjVarHn.hnj("aes_key", jSONObjectOptJSONObject5.optString("aes_key"));
            }
            if (jSONObjectOptJSONObject5.has("support_rtl")) {
                hnjVarHn.hnj("support_rtl", jSONObjectOptJSONObject5.optBoolean("support_rtl", false));
            }
            if (jSONObjectOptJSONObject5.has("ad_revenue_enable")) {
                hnjVarHn.hnj("ad_revenue_enable", jSONObjectOptJSONObject5.optBoolean("ad_revenue_enable", true));
            }
            if (jSONObjectOptJSONObject5.has("gecko_hosts")) {
                try {
                    this.f14174sk.clear();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("gecko_hosts");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            this.f14174sk.add(jSONArrayOptJSONArray.getString(i10));
                        }
                    }
                    this.f14174sk = hnj(this.f14174sk);
                    hnjVarHn.hnj("gecko_hosts", jSONArrayOptJSONArray.toString());
                } catch (Throwable th2) {
                    apu.qor("GeckoLog: settings json error ".concat(String.valueOf(th2)), new Object[0]);
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            hnjVarHn.hnj("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        qor.hnj(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject6 != null) {
            if (jSONObjectOptJSONObject6.has("ad_enable")) {
                hnjVarHn.hnj("privacy_ad_enable", jSONObjectOptJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("personalized_ad")) {
                hnjVarHn.hnj("privacy_personalized_ad", jSONObjectOptJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("sladar_enable")) {
                hnjVarHn.hnj("privacy_sladar_enable", jSONObjectOptJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("app_log_enable")) {
                hnjVarHn.hnj("privacy_app_log_enable", jSONObjectOptJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("debug_unlock")) {
                hnjVarHn.hnj("privacy_debug_unlock", jSONObjectOptJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                String strOptString2 = jSONObjectOptJSONObject6.optString(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, "");
                if (!TextUtils.isEmpty(strOptString2)) {
                    hnjVarHn.hnj("privacy_fields_allowed", strOptString2);
                } else {
                    hnjVarHn.hnj("privacy_fields_allowed");
                }
            }
            if (jSONObjectOptJSONObject6.has("app_reg")) {
                int iOptInt3 = jSONObjectOptJSONObject6.optInt("app_reg", -1);
                if (iOptInt3 == 0 && gm.hnj().gjv() == 1 && com.bytedance.sdk.openadsdk.as.sk.hnj("app_register_alert_enable", false)) {
                    ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.aq.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(oj.hnj(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                hnjVarHn.hnj("privacy_app_reg", iOptInt3 == 1);
                com.bytedance.sdk.openadsdk.core.ta.hn.hnj().hnj(iOptInt3);
            }
        }
        if (jSONObject.has("video_cache_config")) {
            hnjVarHn.hnj("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (iOptInt4 != 0 && iOptInt4 != 1) {
                iOptInt4 = 0;
            }
            hnjVarHn.hnj("loadedCallbackOpportunity", iOptInt4);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int iOptInt5 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (iOptInt5 < 0 || iOptInt5 > 3) {
                iOptInt5 = 0;
            }
            hnjVarHn.hnj("splash_video_load_strategy", iOptInt5);
        }
        if (jSONObject.has("user_compliance_status")) {
            com.bytedance.sdk.openadsdk.core.ta.hn.hnj().hn(jSONObject.optInt("user_compliance_status", -1));
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            com.bytedance.sdk.openadsdk.core.ta.hn.hnj().hnj(jSONObject.optString(UoyZyZEcGYBpIg.CQa, ""));
        }
        if (jSONObject.has("allow_req_time")) {
            com.bytedance.sdk.openadsdk.core.ta.hn.hnj().hnj(jSONObject.optLong("allow_req_time", com.bytedance.sdk.openadsdk.core.ta.hn.hnj.longValue()));
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            hnjVarHn.hnj("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (jSONObjectOptJSONObject7 != null) {
            if (jSONObjectOptJSONObject7.has("bus_con_sec_type")) {
                hnjVarHn.hnj("bus_con_sec_type", jSONObjectOptJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_adshow_check_enable")) {
                hnjVarHn.hnj("bus_con_adshow_check_enable", jSONObjectOptJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_token_thread_count")) {
                hnjVarHn.hnj("bus_con_token_thread_count", jSONObjectOptJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_video_keep_screen_on")) {
                hnjVarHn.hnj("bus_con_video_keep_screen_on", jSONObjectOptJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_auto_click_delay")) {
                hnjVarHn.hnj("bus_con_auto_click_delay", jSONObjectOptJSONObject7.optInt("bus_con_auto_click_delay", AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_express_host")) {
                hnjVarHn.hnj("bus_con_express_host", jSONObjectOptJSONObject7.optString("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_check_clz")) {
                hnjVarHn.hnj("bus_con_check_clz", jSONObjectOptJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_url_check")) {
                hnjVarHn.hnj("bus_con_url_check", jSONObjectOptJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_behavior_count")) {
                hnjVarHn.hnj("bus_con_behavior_count", jSONObjectOptJSONObject7.optInt("bus_con_behavior_count", HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES));
            }
            String str = dnm.hnj;
            if (jSONObjectOptJSONObject7.has(str)) {
                hnjVarHn.hnj(str, jSONObjectOptJSONObject7.optBoolean(str, false));
            }
            String str2 = dnm.f14177hn;
            if (jSONObjectOptJSONObject7.has(str2)) {
                hnjVarHn.hnj(str2, jSONObjectOptJSONObject7.optInt(str2, 10000));
            }
            String str3 = dnm.qor;
            if (jSONObjectOptJSONObject7.has(str3)) {
                hnjVarHn.hnj(str3, (float) jSONObjectOptJSONObject7.optDouble(str3, 1.0d));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_slide_num")) {
                int iOptInt6 = jSONObjectOptJSONObject7.optInt("bus_con_slide_num", 2);
                if (iOptInt6 <= 0) {
                    iOptInt6 = 2;
                }
                hnjVarHn.hnj(geAgcEazw.yRLEEqDgbRenE, iOptInt6);
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject8 != null) {
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_send")) {
                        String strOptString3 = jSONObjectOptJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            hnjVarHn.hnj("perf_con_applog_send", strOptString3);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_apm_native")) {
                        hnjVarHn.hnj("perf_con_apm_native", jSONObjectOptJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache")) {
                        hnjVarHn.hnj("perf_con_webview_preload_cache", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        hnjVarHn.hnj("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count")) {
                        hnjVarHn.hnj("perf_con_webview_cache_count", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        hnjVarHn.hnj("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_stack_size") && (iOptInt = jSONObjectOptJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && iOptInt <= 0) {
                        hnjVarHn.hnj("perf_con_thread_stack_size", iOptInt);
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_pool_config")) {
                        String strOptString4 = jSONObjectOptJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            hnjVarHn.hnj("perf_con_thread_pool_config", strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_is_new_net_thread")) {
                        hnjVarHn.hnj("perf_con_is_new_net_thread", jSONObjectOptJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_expire_time")) {
                        hnjVarHn.hnj("perf_con_adlog_expire_time", jSONObjectOptJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        hnjVarHn.hnj("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        hnjVarHn.hnj("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_rate")) {
                        hnjVarHn.hnj("perf_con_applog_rate", jSONObjectOptJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_track_url_strategy")) {
                        hnjVarHn.hnj("perf_con_track_url_strategy", jSONObjectOptJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drawable_code")) {
                        hnjVarHn.hnj("perf_con_drawable_code", jSONObjectOptJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        hnjVarHn.hnj("perf_con_close_button_delay_check_time", jSONObjectOptJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        hnjVarHn.hnj("perf_con_drop2rt_skip_label_list", jSONObjectOptJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_sync_gaid")) {
                        hnjVarHn.hnj("perf_con_sync_gaid", jSONObjectOptJSONObject8.optInt("perf_con_sync_gaid"));
                    }
                }
            } catch (Throwable th3) {
                apu.qor("SettingsDefaultRepository", th3.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", jSONObjectOptJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e10) {
            apu.qor("SettingsDefaultRepository", "coreSettingJson", e10.getMessage());
        }
        hnjVarHn.hnj("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            hnjVarHn.hnj("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        if (jSONObject.has("token_enable")) {
            hnjVarHn.hnj("token_enable", jSONObject.optInt("token_enable"));
        }
        if (jSONObject.has("token_adx_ids")) {
            String strOptString5 = jSONObject.optString("token_adx_ids", "");
            if (!TextUtils.isEmpty(strOptString5)) {
                hnjVarHn.hnj("token_adx_ids", strOptString5);
            } else {
                hnjVarHn.hnj("token_adx_ids");
            }
        }
        if (jSONObject.has("ads_url_backup")) {
            String strOptString6 = jSONObject.optString("ads_url_backup", "");
            if (!TextUtils.isEmpty(strOptString6)) {
                hnjVarHn.hnj("ads_url_backup", strOptString6);
            } else {
                hnjVarHn.hnj("ads_url_backup");
            }
        }
        hnjVarHn.hnj();
        dnm.hn().orp();
        sk();
    }

    public static Set<String> hnj(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
