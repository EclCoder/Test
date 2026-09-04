package com.mbridge.msdk.mbsignalcommon.listener;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a implements c {
    public void a(Object obj) {
        q0.a("RVWindVaneWebView", "getEndScreenInfo");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void b(WebView webView, int i10) {
        q0.a("RVWindVaneWebView", "loadingResourceStatus");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onPageFinished(WebView webView, String str) {
        q0.a("RVWindVaneWebView", "onPageFinished");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        q0.a("RVWindVaneWebView", "onPageStarted");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onProgressChanged(WebView webView, int i10) {
        q0.a("RVWindVaneWebView", "onProgressChanged");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        q0.a("RVWindVaneWebView", "onReceivedError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        q0.a("RVWindVaneWebView", "onReceivedSslError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onRenderProcessGone(WebView webView) {
        q0.a("RVWindVaneWebView", "onRenderProcessGone");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        q0.a("RVWindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    public void a(WebView webView, String str, String str2, int i10, int i11) {
        q0.a("RVWindVaneWebView", "loadAds");
    }

    public void a(Object obj, String str) {
        q0.a("RVWindVaneWebView", "operateComponent");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void a(WebView webView, int i10) {
        q0.a("RVWindVaneWebView", "readyState");
    }
}
