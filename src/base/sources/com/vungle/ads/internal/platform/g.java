package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.vungle.ads.internal.util.q;
import fl.r;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static final g INSTANCE = new g();
    private static final String TAG = "WebViewUtil";

    private g() {
    }

    public final void applyWebSettings(WebView webView, com.vungle.ads.internal.model.b.WebViewSettings webViewSettings) {
        Boolean allowUniversalAccessFromFileUrls;
        Boolean allowFileAccessFromFileUrls;
        s.h(webView, "webView");
        WebSettings settings = webView.getSettings();
        s.g(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((webViewSettings == null || (allowFileAccessFromFileUrls = webViewSettings.getAllowFileAccessFromFileUrls()) == null) ? false : allowFileAccessFromFileUrls.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((webViewSettings == null || (allowUniversalAccessFromFileUrls = webViewSettings.getAllowUniversalAccessFromFileUrls()) == null) ? false : allowUniversalAccessFromFileUrls.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    public final void getUserAgent(Context context, m0.a consumer) {
        Object objB;
        s.h(context, "context");
        s.h(consumer, "consumer");
        try {
            r.a aVar = r.f38769b;
            objB = r.b(WebSettings.getDefaultUserAgent(context));
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        if (r.i(objB)) {
            consumer.accept((String) objB);
        }
        Throwable thE = r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "Failed to get user agent", thE);
            consumer.accept(null);
        }
    }
}
