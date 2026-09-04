package com.bytedance.sdk.openadsdk.bug.hnj;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.ua;
import o4.Wz.OGoz;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class dse extends com.bytedance.sdk.component.hnj.gjv<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f13264hn;
    private final ua hnj;

    public dse(String str, ua uaVar) {
        this.hnj = uaVar;
        this.f13264hn = str;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, ua uaVar) {
        fcVar.hnj("appInfo", new dse("appInfo", uaVar));
        fcVar.hnj("adInfo", new dse("adInfo", uaVar));
        fcVar.hnj("sendLog", new dse("sendLog", uaVar));
        fcVar.hnj("playable_style", new dse("playable_style", uaVar));
        fcVar.hnj("getTemplateInfo", new dse("getTemplateInfo", uaVar));
        fcVar.hnj("getTeMaiAds", new dse("getTeMaiAds", uaVar));
        fcVar.hnj("isViewable", new dse("isViewable", uaVar));
        fcVar.hnj("getScreenSize", new dse("getScreenSize", uaVar));
        fcVar.hnj("getCloseButtonInfo", new dse("getCloseButtonInfo", uaVar));
        fcVar.hnj("getVolume", new dse("getVolume", uaVar));
        fcVar.hnj("removeLoading", new dse("removeLoading", uaVar));
        fcVar.hnj("sendReward", new dse("sendReward", uaVar));
        fcVar.hnj("subscribe_app_ad", new dse("subscribe_app_ad", uaVar));
        fcVar.hnj("download_app_ad", new dse("download_app_ad", uaVar));
        fcVar.hnj("cancel_download_app_ad", new dse("cancel_download_app_ad", uaVar));
        fcVar.hnj("unsubscribe_app_ad", new dse("unsubscribe_app_ad", uaVar));
        fcVar.hnj("landscape_click", new dse("landscape_click", uaVar));
        fcVar.hnj("clickEvent", new dse("clickEvent", uaVar));
        fcVar.hnj("renderDidFinish", new dse("renderDidFinish", uaVar));
        fcVar.hnj("dynamicTrack", new dse("dynamicTrack", uaVar));
        fcVar.hnj("skipVideo", new dse("skipVideo", uaVar));
        fcVar.hnj("muteVideo", new dse("muteVideo", uaVar));
        fcVar.hnj(OGoz.ADDJHqDYIzj, new dse("changeVideoState", uaVar));
        fcVar.hnj("getCurrentVideoState", new dse("getCurrentVideoState", uaVar));
        fcVar.hnj("send_temai_product_ids", new dse("send_temai_product_ids", uaVar));
        fcVar.hnj("getMaterialMeta", new dse("getMaterialMeta", uaVar));
        fcVar.hnj("endcard_load", new dse("endcard_load", uaVar));
        fcVar.hnj("pauseWebView", new dse("pauseWebView", uaVar));
        fcVar.hnj("pauseWebViewTimers", new dse("pauseWebViewTimers", uaVar));
        fcVar.hnj("webview_time_track", new dse("webview_time_track", uaVar));
        fcVar.hnj("openPrivacy", new dse("openPrivacy", uaVar));
        fcVar.hnj("openAdLandPageLinks", new dse("openAdLandPageLinks", uaVar));
        fcVar.hnj("getNativeSiteCustomData", new dse("getNativeSiteCustomData", uaVar));
        fcVar.hnj("close", new dse("close", uaVar));
    }

    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) {
        ua.hn hnVar = new ua.hn();
        hnVar.hnj = NotificationCompat.CATEGORY_CALL;
        hnVar.qor = this.f13264hn;
        hnVar.gjv = jSONObject;
        return this.hnj.hnj(hnVar, 3);
    }
}
