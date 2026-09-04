package com.iab.omid.library.bytedance2.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f23862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f23863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f23864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f23865j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0346b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f23867a;

        RunnableC0346b() {
            this.f23867a = b.this.f23862g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23867a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f23863h = null;
        this.f23864i = map;
        this.f23865j = str2;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0346b(), Math.max(4000 - (this.f23863h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f23863h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f23862g = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    void j() {
        WebView webView = new WebView(g.b().a());
        this.f23862g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f23862g.getSettings().setAllowContentAccess(false);
        this.f23862g.getSettings().setAllowFileAccess(false);
        this.f23862g.setWebViewClient(new a());
        a(this.f23862g);
        h.a().c(this.f23862g, this.f23865j);
        for (String str : this.f23864i.keySet()) {
            h.a().c(this.f23862g, this.f23864i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f23863h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
