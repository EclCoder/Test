package com.mbridge.msdk.mbsignalcommon.listener;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b implements c {
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void a(WebView webView, int i10) {
        q0.a("WindVaneWebView", "readyState");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void b(WebView webView, int i10) {
        q0.a("WindVaneWebView", "loadingResourceStatus");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onPageFinished(WebView webView, String str) {
        q0.a("WindVaneWebView", "onPageFinished");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        q0.a("WindVaneWebView", "onPageStarted");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onProgressChanged(WebView webView, int i10) {
        q0.a("WindVaneWebView", "onProgressChanged");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        q0.a("WindVaneWebView", "onReceivedError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        q0.a("WindVaneWebView", "onReceivedSslError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onRenderProcessGone(WebView webView) {
        q0.a("WindVaneWebView", "onRenderProcessGone");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        q0.a("WindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }
}
