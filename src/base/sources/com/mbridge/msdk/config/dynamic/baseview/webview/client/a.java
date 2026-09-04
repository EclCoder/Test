package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29432a = "MBWebChromeClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.webview.listener.a f29433b;

    public void a(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        this.f29433b = aVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f29433b;
        if (aVar != null) {
            aVar.onProgressChanged(webView, i10);
        }
    }
}
