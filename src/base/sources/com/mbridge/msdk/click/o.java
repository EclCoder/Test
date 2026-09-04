package com.mbridge.msdk.click;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f28421r = "o";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28423b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f28425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f28426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f28428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WebView f28429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f28431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28432k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f28434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f28435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f28436o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28433l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f28437p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f28438q = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f28424c = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28441c;

        a(String str, String str2, Context context) {
            this.f28439a = str;
            this.f28440b = str2;
            this.f28441c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.f28439a, this.f28440b, this.f28441c, oVar.f28427f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28445c;

        b(String str, String str2, Context context) {
            this.f28443a = str;
            this.f28444b = str2;
            this.f28445c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
                if (o.this.f28434m) {
                    o.this.f28432k = 0;
                    o.this.f();
                    return;
                }
                o.this.f28436o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    o.this.f28435n = true;
                }
                synchronized (o.f28421r) {
                    try {
                        o.this.f28427f = str;
                        if (o.this.f28426e == null || !o.this.f28426e.a(str)) {
                            o.this.h();
                        } else {
                            o.this.f28434m = true;
                            o.this.f();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            synchronized (o.f28421r) {
                o.this.f28434m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.f28426e != null) {
                o.this.f28426e.a(i10, webView.getUrl(), str, o.this.f28431j);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.f28443a) || TextUtils.isEmpty(this.f28444b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.f28445c).a(this.f28444b, this.f28443a, webView.getUrl());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.f28421r) {
                    o.this.f28434m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.f28426e != null) {
                    o.this.f28426e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.f28431j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th2) {
                q0.b(o.f28421r, th2.getMessage());
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            synchronized (o.f28421r) {
                try {
                    o oVar = o.this;
                    oVar.f28436o = true;
                    oVar.c();
                    if (o.this.f28434m) {
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    o.this.f28427f = str;
                    if (o.this.f28426e != null && o.this.f28426e.c(str)) {
                        o.this.f28434m = true;
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    if (o.this.f28430i) {
                        HashMap map = new HashMap();
                        if (o.this.f28429h.getUrl() != null) {
                            map.put("Referer", o.this.f28429h.getUrl());
                        }
                        o.this.f28429h.loadUrl(str, map);
                    } else {
                        o.this.f28429h.loadUrl(str);
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends WebChromeClient {
        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (!o.this.f28434m) {
                        o oVar = o.this;
                        if (!oVar.f28436o) {
                            oVar.g();
                        }
                    }
                    if (o.this.f28426e != null) {
                        o.this.f28426e.b(webView.getUrl());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f28433l = true;
            o.this.f28432k = 1;
            o.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f28433l = true;
            o.this.f28432k = 2;
            o.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface f {
        void a(int i10, String str, String str2, String str3);

        void a(String str, boolean z10, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public o() {
        this.f28422a = 15000;
        this.f28423b = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f28425d = gVarF;
        if (gVarF == null) {
            this.f28425d = com.mbridge.msdk.setting.h.b().a();
        }
        this.f28430i = this.f28425d.M0();
        this.f28422a = (int) this.f28425d.s0();
        this.f28423b = (int) this.f28425d.s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f28424c.removeCallbacks(this.f28437p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f28424c.removeCallbacks(this.f28438q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (f28421r) {
            try {
                try {
                    b();
                    this.f28429h.destroy();
                    f fVar = this.f28426e;
                    if (fVar != null) {
                        fVar.a(this.f28427f, this.f28433l, this.f28431j);
                    }
                } catch (Exception e10) {
                    q0.b(f28421r, e10.getMessage());
                } catch (Throwable th2) {
                    q0.b(f28421r, th2.getMessage());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (f28421r) {
            try {
                try {
                    try {
                        b();
                        f fVar = this.f28426e;
                        if (fVar != null) {
                            fVar.a(this.f28427f, this.f28433l, this.f28431j);
                        }
                    } catch (Throwable th2) {
                        q0.b(f28421r, th2.getMessage());
                    }
                } catch (Exception e10) {
                    q0.b(f28421r, e10.getMessage());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    private void i() {
        this.f28424c.postDelayed(this.f28437p, this.f28423b);
    }

    private void j() {
        this.f28424c.postDelayed(this.f28438q, this.f28422a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.f28428g = str4;
            this.f28427f = str3;
            this.f28426e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f28427f = str3;
            this.f28426e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f28427f);
        } else {
            this.f28424c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f28428g)) {
                this.f28429h.getSettings().setDefaultTextEncodingName("utf-8");
                this.f28423b = 2000;
                this.f28422a = 2000;
                q0.c(f28421r, this.f28428g);
                this.f28429h.loadDataWithBaseURL(str3, this.f28428g, "*/*", "utf-8", str3);
                return;
            }
            if (this.f28430i) {
                HashMap map = new HashMap();
                if (this.f28429h.getUrl() != null) {
                    map.put("Referer", this.f28429h.getUrl());
                }
                this.f28429h.loadUrl(str3, map);
                return;
            }
            this.f28429h.loadUrl(str3);
        } catch (Throwable th2) {
            try {
                f fVar = this.f28426e;
                if (fVar != null) {
                    fVar.a(0, this.f28427f, th2.getMessage(), this.f28431j);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.f28429h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f28429h.getSettings().setCacheMode(2);
        this.f28429h.getSettings().setLoadsImagesAutomatically(false);
        this.f28429h.setWebViewClient(new b(str2, str, context));
        this.f28429h.setWebChromeClient(new c());
    }
}
