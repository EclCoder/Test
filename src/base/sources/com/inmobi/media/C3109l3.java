package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.l3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3109l3 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f26918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.k0 f26919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3135m3 f26920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V2 f26921d;

    public C3109l3(AtomicBoolean atomicBoolean, kotlin.jvm.internal.k0 k0Var, C3135m3 c3135m3, V2 v10) {
        this.f26918a = atomicBoolean;
        this.f26919b = k0Var;
        this.f26920c = c3135m3;
        this.f26921d = v10;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C3135m3.a(this.f26918a, this.f26919b, this.f26920c, this.f26921d, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(description, "description");
        kotlin.jvm.internal.s.h(failingUrl, "failingUrl");
        C3135m3.a(this.f26918a, this.f26919b, this.f26920c, this.f26921d, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(errorResponse, "errorResponse");
        C3135m3.a(this.f26918a, this.f26919b, this.f26920c, this.f26921d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(detail, "detail");
        C3135m3.a(this.f26918a, this.f26919b, this.f26920c, this.f26921d, false);
        return Fo.a(view, detail, "click_mgr");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(request, "request");
        return (this.f26921d.f25872d || kotlin.jvm.internal.s.c(request.getUrl().toString(), this.f26921d.f25870b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(error, "error");
        C3135m3.a(this.f26918a, this.f26919b, this.f26920c, this.f26921d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(url, "url");
        V2 v10 = this.f26921d;
        return (v10.f25872d || kotlin.jvm.internal.s.c(url, v10.f25870b)) ? false : true;
    }
}
