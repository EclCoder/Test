package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.qi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3254qi extends A2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3485zi f27341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function1 f27342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f27344i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3254qi(C3485zi c3485zi, InterfaceC3322t9 interfaceC3322t9, Function1 onRenderViewProcessGone) {
        super(interfaceC3322t9);
        kotlin.jvm.internal.s.h(onRenderViewProcessGone, "onRenderViewProcessGone");
        this.f27341f = c3485zi;
        this.f27342g = onRenderViewProcessGone;
        this.f27344i = "redirect";
    }

    public final boolean a(WebView webView, String str) {
        boolean z10;
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("RenderViewClient", "onShouldOverrideUrlLoading  - url - " + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3228pi) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) webView;
            z10 = true;
            if (!gestureDetectorOnGestureListenerC3228pi.a()) {
                gestureDetectorOnGestureListenerC3228pi.a(this.f27344i);
                return true;
            }
            InterfaceC3322t9 interfaceC3322t10 = this.f24435a;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("RenderViewClient", "Placement type:  " + ((int) gestureDetectorOnGestureListenerC3228pi.getPlacementType()) + "  url:" + str);
            }
            a(gestureDetectorOnGestureListenerC3228pi, str);
        } else {
            z10 = false;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24435a;
        if (interfaceC3322t11 != null) {
            ((C3348u9) interfaceC3322t11).a("RenderViewClient", "Override URL loading :" + str + " returned " + z10);
        }
        return z10;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("RenderViewClient", "Resource loading:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3228pi) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) webView;
            String url = gestureDetectorOnGestureListenerC3228pi.getUrl();
            if (str == null || url == null || bm.r.N(url, "file:", false, 2, null)) {
                return;
            }
            a(gestureDetectorOnGestureListenerC3228pi);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Ph ph2;
        C3485zi c3485zi = this.f27341f;
        if (c3485zi != null) {
            Map mapA = c3485zi.a();
            long j10 = c3485zi.f28025c;
            em.o0 o0Var = AbstractC3488zl.f28033a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3485zi.a("PageStarted");
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b(strA, mapA, EnumC3281rk.SDK);
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("RenderViewClient", "Page load started:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3228pi) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24435a;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("RenderViewClient", "Page load started renderview: " + ((GestureDetectorOnGestureListenerC3228pi) webView).getMarkupType());
            }
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) webView;
            a(gestureDetectorOnGestureListenerC3228pi);
            gestureDetectorOnGestureListenerC3228pi.setAndUpdateViewState("Loading");
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24435a;
        if (interfaceC3322t11 != null) {
            ((C3348u9) interfaceC3322t11).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        InterfaceC3322t9 interfaceC3322t12 = this.f24435a;
        if (interfaceC3322t12 == null || (ph2 = ((C3348u9) interfaceC3322t12).f27613a) == null) {
            return;
        }
        ph2.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(description, "description");
        kotlin.jvm.internal.s.h(failingUrl, "failingUrl");
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("RenderViewClient", "OnReceivedError - errorCode - " + i10 + ", description - " + description + ", url - " + failingUrl);
        }
        super.onReceivedError(view, i10, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("RenderViewClient", "ReceivedHttpError - error - " + (webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null) + ", statusCode - " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null) + " url - " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " isMainFrame - " + (webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("RenderViewClient", "onReceivedSSLError - error - " + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null) + " - url - " + (sslError != null ? sslError.getUrl() : null));
        }
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(detail, "detail");
        if (Build.VERSION.SDK_INT >= 26) {
            InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).c("RenderViewClient", "onRenderProcessGone detail did crash- " + detail.didCrash() + " priority - " + detail.rendererPriorityAtExit());
            }
            this.f27342g.invoke(Boolean.valueOf(detail.didCrash()));
        } else {
            InterfaceC3322t9 interfaceC3322t10 = this.f24435a;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).c("RenderViewClient", "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(view, detail);
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(request, "request");
        WebResourceResponse webResourceResponseA = AbstractC3389vo.a(request, this.f24435a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, request) : webResourceResponseA;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(request, "request");
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        B5.f24500a.getClass();
        if (!B5.x()) {
            return false;
        }
        String string = request.getUrl().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return a(view, string);
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Ph ph2;
        C3485zi c3485zi = this.f27341f;
        if (c3485zi != null) {
            Map mapA = c3485zi.a();
            long j10 = c3485zi.f28025c;
            em.o0 o0Var = AbstractC3488zl.f28033a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3485zi.a("WebViewLoadFinished");
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b(strA, mapA, EnumC3281rk.SDK);
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        String str2 = KPtaxpyICj.BczT;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a(str2, "Page load finished:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3228pi) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) webView;
            a(gestureDetectorOnGestureListenerC3228pi);
            if (kotlin.jvm.internal.s.c("Loading", gestureDetectorOnGestureListenerC3228pi.A)) {
                gestureDetectorOnGestureListenerC3228pi.h("window.imaiview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC3228pi.h("window.mraidview.broadcastEvent('ready');");
                em.k.d(H9.f24930c, null, null, new C3150mi(gestureDetectorOnGestureListenerC3228pi, null), 3, null);
            }
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24435a;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a(str2, "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24435a;
        if (interfaceC3322t11 == null || (ph2 = ((C3348u9) interfaceC3322t11).f27613a) == null) {
            return;
        }
        ph2.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(error, "error");
        super.onReceivedError(view, request, error);
        B5.f24500a.getClass();
        if (B5.z()) {
            InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
            if (interfaceC3322t9 != null) {
                int errorCode = error.getErrorCode();
                CharSequence description = error.getDescription();
                ((C3348u9) interfaceC3322t9).b("RenderViewClient", "OnReceivedError - errorCode - " + errorCode + ", description - " + ((Object) description) + ", url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24435a;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).b("RenderViewClient", "OnReceivedError ");
        }
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(url, "url");
        WebResourceResponse webResourceResponseA = AbstractC3389vo.a(url, this.f24435a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, url) : webResourceResponseA;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(url, "url");
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("RenderViewClient", "shouldOverrideUrlLoading Called " + url);
        }
        return a(view, url);
    }

    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("RenderViewClient", "Override URL loading :" + str);
        }
        gestureDetectorOnGestureListenerC3228pi.s();
        C2859bb c2859bbA = C2885cb.a(gestureDetectorOnGestureListenerC3228pi.getLandingPageHandler(), this.f27344i, (String) null, str, (C2988gb) null, 24);
        InterfaceC3322t9 interfaceC3322t10 = this.f24435a;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a("RenderViewClient", "Current Index :" + gestureDetectorOnGestureListenerC3228pi.copyBackForwardList().getCurrentIndex() + " Original Url :" + gestureDetectorOnGestureListenerC3228pi.getOriginalUrl() + " URL: " + str);
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24435a;
        if (interfaceC3322t11 != null) {
            ((C3348u9) interfaceC3322t11).c("RenderViewClient", "landingPage process result - " + c2859bbA.f26255a);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        if (this.f27343h || gestureDetectorOnGestureListenerC3228pi.f27223e) {
            return;
        }
        this.f27343h = true;
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        gestureDetectorOnGestureListenerC3228pi.h(gestureDetectorOnGestureListenerC3228pi.getMraidJsString());
    }
}
