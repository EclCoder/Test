package com.bytedance.sdk.component.dkl.hnj.qor;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.bytedance.sdk.component.dkl.hnj.dse;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.bytedance.sdk.component.dkl.hnj.hn.gjv;
import com.bytedance.sdk.component.dkl.hnj.sk;
import com.google.android.gms.ads.AdError;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.vungle.ads.internal.ui.b;
import f8.Ygx.FuoITeVPeXAj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj {
    private static final LinkedList<String> hnj = new LinkedList<>();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final LinkedList<String> f12821hn = new LinkedList<>();
    private static final LinkedList<String> qor = new LinkedList<>();
    private static final LinkedList<String> gjv = new LinkedList<>();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static final Map<String, Integer> f12822sk = new HashMap();
    private static HashMap<String, Integer> dkl = null;
    private static String dse = "upload_init";
    private static int aq = 0;
    private static int ojm = 0;

    public static long aq(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (hnjVar == null || hnjVar.dkl() == null || !hn()) {
            return 0L;
        }
        try {
            return new JSONObject(hnjVar.dkl().optString("ad_extra_data")).optLong("sdk_event_index");
        } catch (Exception e10) {
            e10.getMessage();
            return 0L;
        }
    }

    private static synchronized String dkl() {
        StringBuilder sb2;
        try {
            sb2 = new StringBuilder();
            Iterator<String> it = gjv.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(",");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    private static String dnm(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (hnjVar == null || hnjVar.dkl() == null || !hn()) {
            return null;
        }
        JSONObject jSONObjectDkl = hnjVar.dkl();
        try {
            return new JSONObject(hnjVar.gjv() == 1 ? jSONObjectDkl.optString("event_extra") : jSONObjectDkl.optString("ad_extra_data")).optString("sdk_session_id");
        } catch (JSONException e10) {
            e10.getMessage();
            return null;
        }
    }

    public static void dse(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        try {
            if (dse.dkl().fc().dse()) {
                gjv.gjv.hnj(System.currentTimeMillis() - hnjVar.dse());
                hnjVar.hn(System.currentTimeMillis());
                if (hnjVar.gjv() == 0 && dse.dkl().fc() != null && dse.dkl().fc().hnj()) {
                    String strHnj = hnj(hnjVar);
                    if (hnj(strHnj)) {
                        return;
                    }
                    JSONObject jSONObjectDkl = hnjVar.dkl();
                    String strOptString = hnjVar.dkl().optString("ad_extra_data");
                    if (TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("save_success_labels", hn(strHnj + "_" + ojm(hnjVar)));
                        jSONObjectDkl.put("ad_extra_data", jSONObject.toString());
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    if (TextUtils.isEmpty(jSONObject2.optString("save_success_labels"))) {
                        jSONObject2.put("save_success_labels", hn(strHnj + "_" + ojm(hnjVar)));
                    }
                    jSONObjectDkl.put("ad_extra_data", jSONObject2.toString());
                }
            }
        } catch (Exception unused) {
        }
    }

    private static synchronized void gjv(String str) {
        LinkedList<String> linkedList = gjv;
        if (linkedList.size() < 10) {
            linkedList.add(str);
        } else {
            linkedList.removeFirst();
            linkedList.add(str);
        }
    }

    private static synchronized String hn(String str) {
        StringBuilder sb2;
        try {
            LinkedList<String> linkedList = f12821hn;
            if (linkedList.size() >= 10) {
                linkedList.removeFirst();
                linkedList.add(str);
            } else {
                linkedList.add(str);
            }
            sb2 = new StringBuilder();
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(",");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    public static void hnj() {
        if (dkl != null) {
            return;
        }
        String[] strArr = {"first_view", "open_splash", "ad_landing_webview_init", "show_failed_topview", "adstyle_template_show", "splash_init_monitor_first", "download_video_succeed", "shake_skip", "receive", "video_over_auto", "render_time", "splash_ad", "preload_start", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "covered", "download_image_failed", "splash_init_monitor_all", "preload_success_time", "download_video_start_sdk", "download_video_count", "not_showing_reason", "download_image_succeed", "load_video_success", "launch_covered", "download_video_prepare", "download_video_start", "boarding", "ad_wap_stat", "splash_pick", "preload_fail", "should_show", "adstyle_template_fill", CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, "preload_success", "show_failed", "stop_showing_monitor", "download_video_no_download", "track_url", "download_creative_duration", "adstyle_template_render", "download_video_count_splash_sdk", "landing_preload_finish", "adstyle_template_load", "load_ad_duration", "client_false_show", "client_false", "download_video_failed", "data_invalid", "topview_boarding", "topview_start_download", "topview_show_confirmed", "splash_start_download", "topview_show_rejected", "splash_no_download", "redownload_video_count", "topview_other_show", "topview_no_download", "ad_selected", "invalid_model", "topview_deliver", "ad_no_selected", "topview_ad_download_retry_label", b.REQUEST_KEY_EXTRA, "response", "parse_finished", "front_performance", "ad_resp", "ad_resp_nodata", "preload_finish", "transit_show", "splash_switch", "block_splash_F2", "render_picture_time", "network_type", "play_start_error", "load_video_error", "render_picture_timeout", "py_loading_success", "download_status", "first_screen_load_finish", "landing_preload_failed", "data_received", "preload_result", "show_result", "reponse", "valid_time", "brand_satefy_context", "topview_ad_link_fail_label", "end_feed_request", "start_feed_request", "set_feed_data", "delayinstall_conflict_with_back_dialog", "clean_fetch_apk_head_failed", "cleanspace_download_after_quite_clean", "fps_too_low", "open_policy", "landing_perf_stats", "preload_topview", "show_effect_start", "dislike_monitor", "hour_show", "hour_skip", jyeoXJ.cxayUcXfcIEkeV, "click_sound_switch", "enter_loft", "download_resume", "install_view_result", "contiguous_ad_event", "contiguous_ad_remove_event", "report_monitor", "open_landing_blank", "dynamic_ad", "report_load_failed", "ad_download_failed", "download_video_start_first_sdk", "splash_receive", "video_play", "clean_fetch_apk_head_switch_close", "label_external_permission", "pause_reserve_wifi_switch_status", "landing_download_dialog_show", "download_connect", "download_uncompleted", "pause_reserve_wifi_dialog_show", "download_io", "pause_reserve_wifi_confirm", "skvc_load_time", "segment_io", "click_no", "pause_reserve_wifi_cancel_on_wifi", "udp_stop", "mma_url", "error_save_sp", "download_notification_try_show", "ttd_pref_monitor", "item_above_the_fold_stay_time", "ttdownloader_unity", "bdad_query_log", "bdad_load_finish", "bdad_load", "bdad_load_fail", AdError.UNDEFINED_DOMAIN, "valid_stock", "show_filter", "splash_pk_result", "endcard_page_info", "page_on_create", "statistics_feed_docker", "show_search_card_word", "ad_new_video_render_start_label", "ad_new_video_play_start_label", "ad_new_video_ad_patch_data_set_null_label", "ad_new_video_ad_patch_play_label", "ad_new_video_ad_patch_render_label", "debug_touch_start", "try_second_request", "egg_unzip_success", "tap_2", "anti_0_result", "anti_2_result", "egg_unzip_no_start", "preload_no_start", "bind_impression_212202", "guide_auth_dialog_cancel", "show_im_entry", "sub_reco_impression_v2", "sync_request_log_mask", "no_send_sync_request", "load_timeout", "send_sync_request", "sync_request_not_show", "show_subv_tt_video_food", "track", "custom_event", "rd_landing_page_stat", FuoITeVPeXAj.yhr, "showlimit", "upload_result", "debug_othershow", "debug_otherclick", "ad_show_time", dmHT.RzotPppNngFZ, "union_send_duplicate", "mnpl_js_finish_load", "mnpl_resource_finish_load", "mnpl_material_render_timeout", "mnpl_render_timing", "mnpl_vedio_interactive_timegap", "click_non_rectify_area", "start_impression", "end_impression", "picture_render_time", "splash_stop_show", "skip_post", "skan_show_start", "skan_show_end", "load_video_start", "rifle_ad_monitor", "download_video_redownload", "splash_video_quality", "splash_video_end", "splash_video_pause", "splash_video_failed", "adtrace_start_clear", "adtrace_clear_past_data", "adtrace_end_clear", "adtrace_write_success", "adtrace_write_failed", "adtrace_read_result", "adtrace_read_success", "adtrace_read_failed", "pick_model", "cache_model", "adtrace_reparse_file", "deeplink_failed_all", "ad_live_degenerate", "ad_live_miss", "live_play_fail", "sko_show_success", "sko_show_fail", "commerce_apps_open", "commerce_apps_jump", "pic_card_show", "live_ad_card_render_finish", "adtrace_select", "received_card_status", "live_ad_page_load_success", "mp_download_result", "download_video_cancel", "jump_count", "adtrace_try_show", "show_cart_entrance", "live_ad_page_load_fail", "click_interacted", "pop_up", "pop_up_cancel", "stream_loadtime", "mnpl_guide_comp_render", "thirdquartile", "customer_feed_pause", "customer_play_start", "customer_feed_break", "click_area_log", "customer_feed_continue", "customer_feed_play", "mnpl_resource_start_preload", "mnpl_resource_finish_preload", "customer_feed_over", "get_preload_ad", "web_inspect_status", "web_report_status", "preload_begin", "preload_end", "open_begin", "open_end", "pangle_live_sdk_monitor", "success", "rifle_load_state", "rifle_uri_load_state", "component_init", "component_release", "ad_lynx_download_sendAdLog", "dynamic2_render", "lynx_card_show", "pop_up_download", "live_shelf_commodity_show", "unity_fe_click", "enter_ads_explain", "adx_ads_switch", "personal_ads_switch", "qc_product_picture_cancel", "qc_product_picture_save", "qc_product_picture_press", "qc_product_detail_show", "qc_price_instruction_click", "qc_edit_sku_num_click", "service_description_page_duration", "enter_business_qualification_page ", QGbBllacZSmHKn.LSuYWtQhpzRbASB, "order_words_fe", "qc_payment_mode_show", "qc_click_ali_pay", "qc_district_addr_click", "qc_auto_information_add", "qc_dial_consult_cancel_btn_click", "qc_dial_consult_show", "qc_maomadeng_click", "qc_maomadeng_show", "slide_product_big_picture", "qc_service_description_close", "appstore_manager_request", "preload_video_result", "preload_video_start", "adtrace_bind", "topview_ad_link_match_event", "skip_leisure_interact_render", "click_start_download", "ad_lynx_landing_page_exception", "lynx_page_res_download_monitor_event", "live_fail", "live_over", "render_live_picture_success", "render_live_picture_fail", "live_play_success", "live_play_close", "item_play_pver", "ad_gap_info", "item_play_over", "has_period_first_chance", "enter_live_auto", "mnpl_material_video_scene_show", "ad_rerank", "in_web_click", "post_request_failed", "destroy", "bidding_load", UHbHibBvYxKnPE.PwrdnaXcHqW, "in_web_scroll", "tobsdk_livesdk_live_show", "xigua_ad_rerank", "applink_unity", "top_ad_show", "top_button_show", "skip_button_show", "skip_click", "shake_show", "skip_result", "show_personal_compliance_button_click", "personal_compliance_click", "ad_click_result", "ad_preload_video", "popup_show", "topview_feed_down", "qr_scan", "qr_show", "topview_popup_show", "topview_feed_over", "topview_feed_show", "feed_down", "engine_ad_send", "permission_click", "policy_click", "download_start_click", "mini_playable_style_report", "load_detect", "aweme_show_info", "click_convert_anchor_detail_page", "click_anchor_gift_button", "show_anchor_gift_page", mDXVAtwcaFMHJ.VVXhECXLhtsIMV, "show_anchor_gift_card", "anchor_convert_button", "show_anchor_page", "search_result_click", "sdk_session_launch", "not_use_app_link_sdk", "click_ios_check", "auto_open", "bind_click_area", "page_load", "show_finish", "next_fresh", "play_ready", "splash_pk_time", "unshow", "feed_show_failed", "othershow_cancel", "lu_cache", "realtime_splash_result", "channel_override_result", "internal_jump_live_status", "mnpl_video_play_backward", "splash_enter_foreground", "splash_enter_background", "button_light", "long_press", "webview_material_missing_key_error", "live_life_project_click_card", "mnpl_click_event", "show_anchor_convert_button", "bdar_log_info", "bdar_ad_request", "bdar_lynx_template_load_time", "bdar_lynx_fallback", "bdar_fetch_template_data", "bdar_lynx_render_time", "bdar_video_play_effective", "bdar_video_first_frame", "bdar_lynx_jsb_error", "invalidate_back_url_monitor_event", "lynx_page_plugin_exception_event", "live_custom_interaction", "pinch", "if_splash_card", "splash_card_show", "card_show_fail", "splash_card_click", "splash_card_close", "wind_icon_click", "excluded", "show_error", "toutiao_ad_receive", "show_ad", "toutiao_ad_excluded", "close_card", "lynx_status", "qpon_join", "apk_download_user", "comment_key_word_show", "v3_show_ad", "show_wish_button", "enterSection", "single_comment_show", "enter_product_detail", "xigua_ad_request", "qpon_apply", "splash_total_duration", "splash_render_duration", "download_template_duration", "homepage_hot", "homepage_follow", "homepage_fresh", "video_play_success", "general_search", "video_render_cost", "single_ad_render_cost", "unexpected_accurate_pause", "mnpl_interact_skip", "web_report_request_url", "web_report_init_status", "first_request", "video_ended", "mnpl_script_error", "open_wechat_failed_shake", "open_wechat_shacke", "open_wechat_success_shake", "options_popup", "close_pers_ads_type", "check_closed_type", "ad_guide_panel", "learn_ads", "learn_adx_ads", "learn_pers_ads", "resume_closed_type", "twist", "open_wechat_shake"};
        dkl = new HashMap<>(446);
        for (int i10 = 0; i10 < 446; i10++) {
            dkl.put(strArr[i10], 1);
        }
    }

    public static long ojm(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (hnjVar == null || hnjVar.dkl() == null || !hn()) {
            return 0L;
        }
        try {
            return new JSONObject(hnjVar.dkl().optString("ad_extra_data")).optLong("sdk_event_valid_index");
        } catch (Exception e10) {
            e10.getMessage();
            return 0L;
        }
    }

    private static synchronized String qor(String str) {
        StringBuilder sb2;
        try {
            LinkedList<String> linkedList = qor;
            if (linkedList.size() >= 10) {
                linkedList.removeFirst();
                linkedList.add(str);
            } else {
                linkedList.add(str);
            }
            sb2 = new StringBuilder();
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(",");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    public static String sk(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (hnjVar == null || hnjVar.dkl() == null || qor()) {
            return null;
        }
        String strOptString = hnjVar.dkl().optString("log_extra");
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                return new JSONObject(strOptString).optString("req_id");
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static void ta(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        try {
            if (hn()) {
                sk skVarFc = dse.dkl().fc();
                if (!TextUtils.isEmpty(hnjVar.qor())) {
                    hn.hnj(gjv.gjv.izk(), 1);
                }
                if (skVarFc == null || !skVarFc.hn()) {
                    return;
                }
                if (hnjVar.gjv() == 1) {
                    hn(hnjVar);
                    qor(hnjVar);
                    hnjVar.qor();
                    dnm(hnjVar);
                    return;
                }
                if (hnjVar.gjv() == 0) {
                    if (hnjVar.hn() != 3) {
                        if (ojm(hnjVar) != 0) {
                            hnj(hnjVar);
                        } else {
                            hnj(hnjVar);
                        }
                        aq(hnjVar);
                        hnjVar.qor();
                        dnm(hnjVar);
                        return;
                    }
                    if (hnjVar.dkl() != null) {
                        hnjVar.dkl().optString(NotificationCompat.CATEGORY_EVENT);
                        aq(hnjVar);
                        ojm(hnjVar);
                        hnjVar.qor();
                        dnm(hnjVar);
                    }
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public static void dkl(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        try {
            if (hnjVar.gjv() == 0 && dse.dkl().fc() != null && dse.dkl().fc().hnj()) {
                JSONObject jSONObjectDkl = hnjVar.dkl();
                String strHnj = hnj(hnjVar);
                if (hnj(strHnj)) {
                    return;
                }
                sk(hnjVar);
                String strOptString = jSONObjectDkl.optString("ad_extra_data");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject = new JSONObject(strOptString);
                    if (TextUtils.isEmpty(jSONObject.optString("will_send_labels"))) {
                        jSONObject.put("will_send_labels", qor(strHnj + "_" + ojm(hnjVar)));
                        jSONObject.put("send_success_valid_labels", dkl());
                    }
                    jSONObjectDkl.put("ad_extra_data", jSONObject.toString());
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("will_send_labels", qor(strHnj + "_" + ojm(hnjVar)));
                jSONObject2.put("send_success_valid_labels", dkl());
                jSONObjectDkl.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public static synchronized int gjv(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (hnjVar != null) {
            if (hnjVar.dkl() != null) {
                if (!hn()) {
                    return 0;
                }
                try {
                    return new JSONObject(hnjVar.dkl().optString("ad_extra_data")).optInt("sdk_event_self_count");
                } catch (Exception unused) {
                    return 0;
                }
            }
        }
        return 0;
    }

    public static String hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (hnjVar == null || hnjVar.dkl() == null || qor()) {
            return null;
        }
        if (hnjVar.hn() == 3) {
            return hnjVar.dkl().optString(NotificationCompat.CATEGORY_EVENT);
        }
        return hnjVar.dkl().optString("label");
    }

    public static boolean sk() {
        return hn() || gjv();
    }

    public static String hn(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (hnjVar == null || hnjVar.dkl() == null || qor()) {
            return null;
        }
        return hnjVar.dkl().optString("type");
    }

    public static int qor(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (hnjVar == null || hnjVar.dkl() == null || !hn()) {
            return -1;
        }
        try {
            return new JSONObject(hnjVar.dkl().optString("event_extra")).optInt("stats_index");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public static boolean hnj(String str) {
        HashMap<String, Integer> map = dkl;
        if (map == null || str == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public static boolean hn() {
        sk skVarFc = dse.dkl().fc();
        return skVarFc != null && skVarFc.dkl() == 0;
    }

    public static void hnj(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, int i10) {
        try {
            if (dse.dkl().fc().dse()) {
                for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar : list) {
                    if (hnjVar != null && hnjVar.aq() != 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - hnjVar.aq();
                        com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj hnjVar2 = gjv.gjv;
                        hnjVar2.pv().incrementAndGet();
                        hnjVar2.zt().getAndAdd(jCurrentTimeMillis);
                        hnjVar.qor(System.currentTimeMillis());
                    }
                    if (hnjVar != null) {
                        dkl(hnjVar);
                    }
                }
                gjv.gjv.lu().getAndAdd(list.size());
            }
        } catch (Exception unused) {
        }
    }

    public static boolean qor() {
        sk skVarFc = dse.dkl().fc();
        return skVarFc != null && skVarFc.dkl() == 2;
    }

    public static boolean gjv() {
        sk skVarFc = dse.dkl().fc();
        return skVarFc != null && skVarFc.dkl() == 1;
    }

    public static void hnj(JSONObject jSONObject, com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hnj hnjVar) {
        sk skVarFc = dse.dkl().fc();
        if (skVarFc != null && skVarFc.hn() && sk()) {
            jSONObject.optString("label");
            hnjVar.sk();
        }
    }

    public static void hnj(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, int i10, String str) {
        sk skVarFc = dse.dkl().fc();
        if (skVarFc == null || !skVarFc.hn() || list == null || qor()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar : list) {
            if (hnjVar.gjv() == 0) {
                JSONObject jSONObjectDkl = hnjVar.dkl();
                String strHnj = hnj(hnjVar);
                if (hnjVar.hn() == 3) {
                    if (jSONObjectDkl != null) {
                        strHnj = jSONObjectDkl.optString(NotificationCompat.CATEGORY_EVENT);
                    }
                    sb2.append(" [v3:");
                    sb2.append(strHnj);
                    sb2.append("] ");
                } else {
                    long jAq = aq(hnjVar);
                    long jOjm = ojm(hnjVar);
                    int iGjv = gjv(hnjVar);
                    sb2.append(" [");
                    sb2.append(jAq);
                    sb2.append("_");
                    sb2.append(strHnj);
                    if (jOjm != 0) {
                        sb2.append("_");
                        sb2.append(jOjm);
                    }
                    if (iGjv == 0) {
                        sb2.append("] ");
                    } else {
                        sb2.append("_");
                        sb2.append(iGjv);
                        sb2.append("] ");
                    }
                }
                z10 = true;
            } else if (hnjVar.gjv() == 1) {
                String strHn = hn(hnjVar);
                int iQor = qor(hnjVar);
                sb2.append(" [");
                sb2.append(iQor);
                sb2.append("_");
                sb2.append(strHn);
                sb2.append("] ");
            }
        }
        if (z10) {
            hnj(i10);
            list.size();
        } else {
            hnj(i10);
            list.size();
        }
    }

    public static String hnj(int i10) {
        switch (i10) {
            case 1:
                return obFGmWgqyy.dpGvADsFWLucs;
            case 2:
                return "flush memory db";
            case 3:
                return "flush memory";
            case 4:
                return "new event";
            case 5:
                return "server busy";
            case 6:
                return "empty message";
            case 7:
                return "net error";
            default:
                return "default";
        }
    }

    private static void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar, String str, sk skVar) {
        String strHnj = hnj(hnjVar);
        if (hnj(strHnj)) {
            return;
        }
        String strSk = sk(hnjVar);
        if (hnjVar.gjv() == 0 && skVar.hnj()) {
            gjv(strHnj + "_" + ojm(hnjVar) + "_" + strSk + "_" + str);
        }
    }

    public static void hnj(boolean z10, int i10, com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        sk skVarFc = dse.dkl().fc();
        if (qor() || skVarFc == null || !skVarFc.hn()) {
            return;
        }
        hnj(i10);
        TextUtils.isEmpty(hn(hnjVar));
        TextUtils.isEmpty(hnj(hnjVar));
    }

    public static void hnj(int i10, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, long j10) {
        if (dse.dkl().fc().dse()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j10;
            if (i10 == 200) {
                com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj hnjVar = gjv.gjv;
                hnjVar.hkr().getAndAdd(jCurrentTimeMillis);
                hnjVar.dy().incrementAndGet();
                hnjVar.qb().getAndAdd(list.size());
                hnjVar.ff().getAndAdd(list.size());
                return;
            }
            if (i10 == -1) {
                gjv.gjv.fr().getAndAdd(list.size());
            } else {
                gjv.gjv.pnz().getAndAdd(list.size());
            }
            com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj hnjVar2 = gjv.gjv;
            hnjVar2.tll().getAndAdd(jCurrentTimeMillis);
            hnjVar2.idl().incrementAndGet();
        }
    }

    public static void hnj(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, String str) {
        try {
            sk skVarFc = dse.dkl().fc();
            if (skVarFc == null || !skVarFc.dse() || list == null) {
                return;
            }
            for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar : list) {
                if (hnjVar != null) {
                    hnj(hnjVar, str, skVarFc);
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }
}
