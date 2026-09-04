package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class O4 extends WebViewClient {
    public boolean A00 = false;
    public final C1470No A01;
    public final O3 A02;
    public final boolean A03;

    public O4(C1470No c1470No, O3 o10, boolean z10) {
        this.A01 = c1470No;
        this.A02 = o10;
        this.A03 = z10;
    }

    private void A00() {
        if (this.A03) {
            this.A02.AFF(AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        if (this.A02 != null) {
            this.A02.AFG();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        new Handler().postDelayed(new C2338j5(this), this.A01.A0F());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        A03();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1844ay.A0D(AbstractC1610Td.A2g);
        A00();
        return true;
    }
}
