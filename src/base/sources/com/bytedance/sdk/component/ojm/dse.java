package com.bytedance.sdk.component.ojm;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends WebViewClient {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hnj.InterfaceC0193hnj f12925hn;
    private final WebViewClient hnj;
    private final List<String> qor;

    public dse(hnj.InterfaceC0193hnj interfaceC0193hnj, WebViewClient webViewClient, List<String> list) {
        this.f12925hn = interfaceC0193hnj;
        this.hnj = webViewClient;
        this.qor = list;
    }

    private int hnj(WebView webView) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                return webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.hnj.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        hnj.InterfaceC0193hnj interfaceC0193hnj = this.f12925hn;
        if (interfaceC0193hnj != null) {
            interfaceC0193hnj.hnj(hnj(webView));
        }
        this.hnj.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.hnj.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.hnj.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.hnj.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return Build.VERSION.SDK_INT >= 26 ? this.hnj.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.hnj.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        hnj.InterfaceC0193hnj interfaceC0193hnj = this.f12925hn;
        if (interfaceC0193hnj != null) {
            interfaceC0193hnj.hnj();
        }
        return this.hnj.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.hnj.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        hnj.InterfaceC0193hnj interfaceC0193hnj;
        if (hn.hnj(this.qor, webResourceRequest.getUrl().toString()) && (interfaceC0193hnj = this.f12925hn) != null) {
            interfaceC0193hnj.hnj();
        }
        return this.hnj.shouldInterceptRequest(webView, webResourceRequest);
    }
}
