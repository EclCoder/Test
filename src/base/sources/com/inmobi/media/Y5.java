package com.inmobi.media;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.Y5;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Y5 extends A2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f26058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tl.a f26059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function1 f26060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tl.o f26061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final O8 f26062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2988gb f26063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2936eb f26064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3022hj f26065m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5(String api, tl.a onUserLandingCompleted, Function1 onLpLifecycleEvent, tl.o fireLandingPageTracker, InterfaceC3322t9 interfaceC3322t9, O8 o10, long j10) {
        super(interfaceC3322t9);
        kotlin.jvm.internal.s.h(api, "api");
        kotlin.jvm.internal.s.h(onUserLandingCompleted, "onUserLandingCompleted");
        kotlin.jvm.internal.s.h(onLpLifecycleEvent, "onLpLifecycleEvent");
        kotlin.jvm.internal.s.h(fireLandingPageTracker, "fireLandingPageTracker");
        this.f26058f = api;
        this.f26059g = onUserLandingCompleted;
        this.f26060h = onLpLifecycleEvent;
        this.f26061i = fireLandingPageTracker;
        this.f26062j = o10;
        this.f26065m = new C3022hj(j10, interfaceC3322t9, new Function1() { // from class: yh.p6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y5.a(this.f57878a, (String) obj);
            }
        });
    }

    public final boolean a(WebView webView, String str) {
        String url;
        Integer num;
        int i10;
        X5 x10;
        InterfaceC3282rl userLeftApplicationListener;
        if (this.f24439e.get()) {
            return true;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("EmbeddedBrowserViewClient", "onShouldOverrideUrlLoading: " + str);
        }
        C3022hj c3022hj = this.f26065m;
        if (!c3022hj.f26692f) {
            c3022hj.f26693g = EnumC2970fj.REDIRECTING;
        }
        c3022hj.f26694h = true;
        c3022hj.a();
        if (webView instanceof AbstractC3469z2) {
            url = str;
            C2859bb c2859bbA = C2885cb.a(((AbstractC3469z2) webView).getLandingPageHandler(), this.f26058f, (String) null, url, this.f26063k, 16);
            num = c2859bbA.f26256b;
            i10 = c2859bbA.f26255a;
        } else {
            url = str;
            num = null;
            i10 = 0;
        }
        if (i10 == 0) {
            C3022hj c3022hj2 = this.f26065m;
            c3022hj2.getClass();
            c3022hj2.f26693g = EnumC2970fj.RESOLVE_IN_WEB_VIEW;
            return false;
        }
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                return false;
            }
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 10);
            C2936eb c2936eb = this.f26064l;
            if (c2936eb != null) {
                c2936eb.a(3, false, url, numValueOf);
            }
            return true;
        }
        C3022hj c3022hj3 = this.f26065m;
        c3022hj3.getClass();
        c3022hj3.f26693g = EnumC2970fj.EXTERNAL;
        boolean z10 = webView instanceof Z5;
        if (z10) {
            ViewParent parent = ((Z5) webView).getParent();
            if ((parent instanceof U5) && (userLeftApplicationListener = ((U5) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        Function1 function1 = this.f26060h;
        Vh vh2 = GestureDetectorOnGestureListenerC3228pi.f27208g1;
        String str2 = this.f26058f;
        vh2.getClass();
        function1.invoke(Vh.a(str2, "onNavigatingAway"));
        a(webView);
        kotlin.jvm.internal.s.h(url, "url");
        Uri uri = Uri.parse(url);
        kotlin.jvm.internal.s.g(uri, "Uri.parse(this)");
        if (!B3.a(uri) || kotlin.jvm.internal.s.c("play.google.com", uri.getHost()) || kotlin.jvm.internal.s.c("market.android.com", uri.getHost()) || kotlin.jvm.internal.s.c("market", uri.getScheme())) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (z10) {
                ViewParent parent2 = ((Z5) webView).getParent();
                if ((parent2 instanceof U5) && (x10 = ((U5) parent2).f25808d) != null) {
                    R8.a(((Q8) x10).f25543a);
                }
            }
            O8 o10 = this.f26062j;
            if (o10 != null) {
                ((C2918di) o10).f26414a.x();
            }
        }
        a(this, 2, false, url, 8);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        String str2;
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("EmbeddedBrowserViewClient", "onPageCommitVisible: " + str);
        }
        C3022hj c3022hj = this.f26065m;
        if (c3022hj.f26692f || c3022hj.f26687a <= 0) {
            str2 = str;
        } else {
            long j10 = c3022hj.f26691e;
            c3022hj.a();
            em.o0 o0Var = c3022hj.f26690d;
            C2996gj c2996gj = new C2996gj(c3022hj, j10, str, webView, null);
            str2 = str;
            c3022hj.f26695i = em.k.d(o0Var, null, null, c2996gj, 3, null);
        }
        a(this, 4, true, str2, 8);
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("EmbeddedBrowserViewClient", "onPageFinished: " + str);
        }
        a(this, 2, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C3022hj c3022hj = this.f26065m;
        if (!c3022hj.f26692f && c3022hj.f26687a > 0) {
            c3022hj.f26691e++;
            c3022hj.f26692f = false;
            c3022hj.f26693g = EnumC2970fj.LOADING;
            c3022hj.f26694h = false;
            c3022hj.a();
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("EmbeddedBrowserViewClient", "onPageStarted: " + str);
        }
        Function1 function1 = this.f26060h;
        Vh vh2 = GestureDetectorOnGestureListenerC3228pi.f27208g1;
        String str2 = this.f26058f;
        vh2.getClass();
        function1.invoke(Vh.a(str2, "onPageStart"));
        a(this, 1, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(description, "description");
        kotlin.jvm.internal.s.h(failingUrl, "failingUrl");
        Integer numValueOf = Integer.valueOf(i10);
        C2936eb c2936eb = this.f26064l;
        if (c2936eb != null) {
            c2936eb.a(3, false, failingUrl, numValueOf);
        }
        C3022hj c3022hj = this.f26065m;
        c3022hj.getClass();
        kotlin.jvm.internal.s.h("RECEIVED_ERROR", "reason");
        c3022hj.a("RECEIVED_ERROR", failingUrl);
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("EmbeddedBrowserViewClient", "onReceivedError: " + failingUrl);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        C3022hj c3022hj = this.f26065m;
        String string = webResourceRequest.getUrl().toString();
        c3022hj.getClass();
        kotlin.jvm.internal.s.h("RECEIVED_HTTP_ERROR", "reason");
        c3022hj.a("RECEIVED_HTTP_ERROR", string);
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(detail, "detail");
        boolean zOnRenderProcessGone = super.onRenderProcessGone(view, detail);
        if (Build.VERSION.SDK_INT >= 26) {
            C2936eb c2936eb = this.f26064l;
            if (c2936eb != null) {
                c2936eb.a(3, true, null, 8007);
            }
            Map mapM = gl.l0.m(fl.w.a("source", "embedded_browser"), fl.w.a("isCrashed", Boolean.valueOf(detail.didCrash())));
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("WebViewRenderProcessGoneEvent", mapM, EnumC3281rk.SDK);
        }
        C3022hj c3022hj = this.f26065m;
        String url = view.getUrl();
        c3022hj.getClass();
        kotlin.jvm.internal.s.h("RENDER_PROCESS_GONE", "reason");
        c3022hj.a("RENDER_PROCESS_GONE", url);
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string;
        Uri url;
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        B5.f24500a.getClass();
        if (!B5.x()) {
            return false;
        }
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            string = "";
        }
        if (webView == null || string.length() <= 0) {
            return false;
        }
        return a(webView, string);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(error, "error");
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("EmbeddedBrowserViewClient", "onReceivedError: " + request.getUrl());
        }
        if (request.isForMainFrame()) {
            Integer numValueOf = Integer.valueOf(error.getErrorCode());
            String string = request.getUrl().toString();
            C2936eb c2936eb = this.f26064l;
            if (c2936eb != null) {
                c2936eb.a(3, true, string, numValueOf);
            }
            C3022hj c3022hj = this.f26065m;
            String string2 = request.getUrl().toString();
            c3022hj.getClass();
            kotlin.jvm.internal.s.h("RECEIVED_ERROR", "reason");
            c3022hj.a("RECEIVED_ERROR", string2);
        }
    }

    public static final fl.g0 a(Y5 y10, String reason) {
        kotlin.jvm.internal.s.h(reason, "reason");
        O8 o10 = y10.f26062j;
        if (o10 != null) {
            C2918di c2918di = (C2918di) o10;
            kotlin.jvm.internal.s.h(reason, "reason");
            if (c2918di.f26414a.getFullScreenActivity() instanceof InMobiAdActivity) {
                Activity fullScreenActivity = c2918di.f26414a.getFullScreenActivity();
                kotlin.jvm.internal.s.f(fullScreenActivity, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) fullScreenActivity).a(reason);
            }
        }
        return fl.g0.f38750a;
    }

    public static void a(Y5 y10, int i10, boolean z10, String str, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        C2936eb c2936eb = y10.f26064l;
        if (c2936eb != null) {
            c2936eb.a(i10, z10, str, null);
        }
    }
}
