package com.iab.omid.library.vungle.publisher;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.internal.g;
import com.iab.omid.library.vungle.internal.h;
import com.iab.omid.library.vungle.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f24301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f24302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f24303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f24304j;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return b.this.a(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return com.iab.omid.library.vungle.webviewclient.a.a(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return com.iab.omid.library.vungle.webviewclient.a.a(str);
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.publisher.b$b, reason: collision with other inner class name */
    class C0361b extends WebViewClient {
        C0361b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return b.this.a(webView, renderProcessGoneDetail);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f24307a;

        c() {
            this.f24307a = b.this.f24301g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24307a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f24302h = null;
        this.f24303i = map;
        this.f24304j = str2;
    }

    private WebViewClient c(boolean z10) {
        return z10 ? k() : j();
    }

    private WebViewClient j() {
        return new C0361b();
    }

    private WebViewClient k() {
        return new a();
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new c(), Math.max(4000 - (this.f24302h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f24302h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f24301g = null;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        l();
    }

    void l() {
        Context contextA = g.b().a();
        WebView webView = new WebView(contextA);
        this.f24301g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f24301g.getSettings().setAllowContentAccess(false);
        this.f24301g.getSettings().setAllowFileAccess(false);
        this.f24301g.setWebViewClient(c(a(com.iab.omid.library.vungle.attestation.g.a(this.f24301g), contextA)));
        a(this.f24301g);
        h.a().c(this.f24301g, this.f24304j);
        for (String str : this.f24303i.keySet()) {
            h.a().d(this.f24301g, this.f24303i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f24302h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.vungle.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.vungle.utils.c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + " for WebView: " + webView);
        if (getWebView() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            a((WebView) null);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }

    private boolean a(boolean z10, Context context) {
        return !z10 && com.iab.omid.library.vungle.attestation.c.a(context).b();
    }
}
