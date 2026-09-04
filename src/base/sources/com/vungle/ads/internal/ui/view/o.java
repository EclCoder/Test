package com.vungle.ads.internal.ui.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import kotlinx.serialization.json.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface o {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        boolean processCommand(String str, d0 d0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void onReceivedError(String str, boolean z10);

        void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

        boolean onWebRenderingProcessGone(WebView webView, Boolean bool);
    }

    void notifyPropertiesChange(boolean z10);

    void setAdVisibility(boolean z10);

    void setConsentStatus(boolean z10, String str, String str2, String str3, String str4);

    void setErrorHandler(b bVar);

    void setMraidDelegate(a aVar);

    void setWebViewObserver(com.vungle.ads.internal.omsdk.e eVar);
}
