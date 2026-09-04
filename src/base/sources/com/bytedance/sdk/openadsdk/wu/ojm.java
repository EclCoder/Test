package com.bytedance.sdk.openadsdk.wu;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm {
    private static void hn(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            dse.hnj("WebViewSettings", "removeJavascriptInterfacesSafe error", th2);
        }
    }

    private static void hnj(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            dse.hnj("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th2);
        }
    }

    public static void hnj(WebView webView) {
        if (webView == null) {
            return;
        }
        hn(webView);
        WebSettings settings = webView.getSettings();
        hnj(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th2) {
            dse.hnj("WebViewSettings", "setJavaScriptEnabled error", th2);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th3) {
            dse.hnj("WebViewSettings", "setSupportZoom error", th3);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        int i10 = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z10 = i10 >= 28;
        try {
            if (!z10) {
                webView.setLayerType(0, null);
            } else {
                if (z10) {
                    webView.setLayerType(2, null);
                }
                webView.getSettings().setMixedContentMode(0);
            }
        } catch (Throwable th4) {
            dse.hnj("WebViewSettings", "setLayerType error", th4);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
