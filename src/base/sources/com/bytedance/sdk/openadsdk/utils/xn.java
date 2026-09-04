package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn {
    public static void hnj(Uri uri, com.bytedance.sdk.openadsdk.core.ua uaVar) {
        if (uaVar == null || !uaVar.hnj(uri)) {
            return;
        }
        try {
            uaVar.hn(uri);
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static String hnj(WebView webView, int i10) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i10;
    }
}
