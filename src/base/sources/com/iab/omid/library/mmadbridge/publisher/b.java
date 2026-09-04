package com.iab.omid.library.mmadbridge.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.iab.omid.library.mmadbridge.internal.g;
import com.iab.omid.library.mmadbridge.internal.h;
import com.iab.omid.library.mmadbridge.utils.c;
import com.iab.omid.library.mmadbridge.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f24137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f24138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f24139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f24140j;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0355b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f24142a;

        RunnableC0355b() {
            this.f24142a = b.this.f24137g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24142a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f24138h = null;
        this.f24139i = map;
        this.f24140j = str2;
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0355b(), Math.max(4000 - (this.f24138h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f24138h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f24137g = null;
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    void j() {
        WebView webView = new WebView(g.b().a());
        this.f24137g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f24137g.getSettings().setAllowContentAccess(false);
        this.f24137g.getSettings().setAllowFileAccess(false);
        this.f24137g.setWebViewClient(new a());
        a(this.f24137g);
        h.a().c(this.f24137g, this.f24140j);
        for (String str : this.f24139i.keySet()) {
            h.a().d(this.f24137g, this.f24139i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f24138h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.mmadbridge.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
