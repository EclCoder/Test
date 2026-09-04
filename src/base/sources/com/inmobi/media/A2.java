package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.media.A2;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class A2 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3322t9 f24435a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24438d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24436b = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f24439e = new AtomicBoolean(false);

    public A2(InterfaceC3322t9 interfaceC3322t9) {
        this.f24435a = interfaceC3322t9;
    }

    public final void a(WebView view) {
        kotlin.jvm.internal.s.h(view, "view");
        this.f24439e.set(true);
        view.postDelayed(new Runnable() { // from class: yh.c
            @Override // java.lang.Runnable
            public final void run() {
                A2.a(this.f57627a);
            }
        }, 1000L);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.f24438d) {
            this.f24438d = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(detail, "detail");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Sb.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("BaseWebViewClient", "onRenderProcessGone - WebView crash detected, destroying ad ");
        }
        view.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        int i10;
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(url, "url");
        B5.f24500a.getClass();
        if (!B5.x() && -1 != (i10 = this.f24436b)) {
            if (i10 > 0) {
                this.f24436b = i10 - 1;
            } else if (!this.f24437c) {
                new Handler(Looper.getMainLooper()).post(new Oe(view));
                this.f24437c = true;
                if (view instanceof GestureDetectorOnGestureListenerC3228pi) {
                    ((GestureDetectorOnGestureListenerC3228pi) view).G();
                }
            }
        }
        WebResourceResponse webResourceResponseA = AbstractC3389vo.a(url, this.f24435a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, url) : webResourceResponseA;
    }

    public static final void a(A2 a10) {
        a10.f24439e.set(false);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(request, "request");
        InterfaceC3322t9 interfaceC3322t9 = this.f24435a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("BaseWebViewClient", "shouldInterceptRequest - url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
        }
        int i10 = this.f24436b;
        if (-1 != i10) {
            if (i10 > 0) {
                this.f24436b = i10 - 1;
            } else if (!this.f24437c) {
                new Handler(Looper.getMainLooper()).post(new Oe(view));
                this.f24437c = true;
                if (view instanceof GestureDetectorOnGestureListenerC3228pi) {
                    ((GestureDetectorOnGestureListenerC3228pi) view).G();
                }
            }
        }
        WebResourceResponse webResourceResponseA = AbstractC3389vo.a(request, this.f24435a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, request) : webResourceResponseA;
    }
}
