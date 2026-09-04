package com.bytedance.sdk.openadsdk.bug.hnj;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.ua;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends com.bytedance.sdk.component.hnj.oj<JSONObject, JSONObject> {
    public static final HashSet<String> hnj = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", "isViewable", "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", "muteVideo", "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", "close"));

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final ua f13262hn;

    public aq(ua uaVar) {
        this.f13262hn = uaVar;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, ua uaVar) {
        fcVar.hnj(hnj, new aq(uaVar));
    }

    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) {
        ua.hn hnVar = new ua.hn();
        hnVar.hnj = NotificationCompat.CATEGORY_CALL;
        hnVar.qor = str;
        hnVar.gjv = jSONObject;
        return this.f13262hn.hnj(hnVar, 3);
    }
}
