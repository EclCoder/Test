package com.mbridge.msdk.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.middle.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28321c = "NativeAdvancedWebViewClient";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f28323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f28324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.mbridge.msdk.advanced.middle.a f28325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f28326h;

    public a(String str, com.mbridge.msdk.advanced.middle.a aVar, c cVar) {
        com.mbridge.msdk.foundation.same.directory.c cVar2 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC;
        this.f28322d = e.b(cVar2) != null ? e.b(cVar2) : k0.a("YkRXhr5AWBPfNgzuH7JQ+2Ha");
        this.f28323e = k0.a("Y+xgWkl2");
        this.f28324f = str;
        this.f28325g = aVar;
        this.f28326h = cVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.f28326h != null) {
            try {
                String strA = "";
                if (str.startsWith("file") && str.startsWith(this.f28322d)) {
                    strA = str.replace(com.vungle.ads.internal.model.b.FILE_SCHEME, "");
                }
                if (a(str)) {
                    strA = this.f28326h.a(URLDecoder.decode(Uri.parse(str).getQueryParameter("uri")));
                }
                if (!TextUtils.isEmpty(strA) && a(strA, this.f28322d)) {
                    q0.a("NativeAdvancedWebViewClient", "replace url : " + strA);
                    if (!strA.contains("127.0.0.1") && !strA.startsWith("http")) {
                        HashMap map = new HashMap();
                        map.put("Access-Control-Allow-Origin", "*");
                        WebResourceResponse webResourceResponse = new WebResourceResponse(MimeTypes.VIDEO_MP4, "utf-8", new FileInputStream(strA));
                        webResourceResponse.setResponseHeaders(map);
                        return webResourceResponse;
                    }
                    return null;
                }
            } catch (Throwable th2) {
                q0.b("NativeAdvancedWebViewClient", th2.getMessage());
            }
        }
        return null;
    }

    public void b() {
        if (this.f28326h != null) {
            this.f28326h = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new C0370a());
        } catch (Throwable th2) {
            q0.b("NativeAdvancedWebViewClient", "onPageStarted", th2);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f28509d && com.mbridge.msdk.click.utils.a.a(((com.mbridge.msdk.advanced.signal.b) windVaneWebView.getObject()).a().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f28507b)) {
                    return false;
                }
            } catch (Exception e10) {
                q0.b("NativeAdvancedWebViewClient", e10.getMessage());
            }
            q0.b("NativeAdvancedWebViewClient", "Use html to open url.");
            com.mbridge.msdk.advanced.middle.a aVar = this.f28325g;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable th2) {
            q0.b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th2);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webView, webResourceRequest.getUrl().toString());
    }

    private boolean a(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (scheme = uri.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.f28323e) || scheme.equals("mb-h5");
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0370a implements ValueCallback<String> {
        C0370a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }
}
