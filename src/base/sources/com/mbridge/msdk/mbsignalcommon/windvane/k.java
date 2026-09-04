package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class k extends com.mbridge.msdk.mbsignalcommon.base.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f31740c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31741d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f31742e;

    private WebResourceResponse a(String str) {
        try {
            if (TextUtils.isEmpty(str) || !i.e(str)) {
                return null;
            }
            q0.c("WindVaneWebViewClient", "is image " + str);
            Bitmap bitmapB = com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(str);
            q0.c("WindVaneWebViewClient", "find image from cache " + str);
            if (bitmapB == null || bitmapB.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(i.b(str), "utf-8", com.mbridge.msdk.foundation.same.image.a.a(bitmapB));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f31740c = str;
        c cVar = this.f31742e;
        if (cVar != null) {
            cVar.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseA = a(str);
        if (webResourceResponseA == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        q0.c("WindVaneWebViewClient", "find WebResourceResponse url is " + str);
        return webResourceResponseA;
    }
}
