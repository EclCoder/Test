package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.d0;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.m;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.ui.view.o;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.r;
import com.vungle.ads.internal.util.y;
import com.vungle.ads.x;
import fl.g0;
import fl.w;
import gl.l0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.e0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends WebViewClient implements o, r {
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";
    public static final a Companion = new a(null);
    private static final String TAG = "VungleWebClient";
    private final com.vungle.ads.internal.model.b advertisement;
    private final fl.k blackScreenDetector$delegate;
    private boolean collectConsent;
    private final m delegate;
    private o.b errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private final Long loadDuration;
    private WebView loadedWebView;
    private o.a mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final x partialDownloadErrorMetric;
    private final x partialDownloadMetric;
    private final Placement placement;
    private final com.vungle.ads.internal.platform.f platform;
    private boolean ready;
    private final d0 skippedUrlMetric;
    private com.vungle.ads.internal.omsdk.e webViewObserver;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends WebViewRenderProcessClient {
        private o.b errorHandler;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends t implements tl.a {
            final /* synthetic */ WebView $webView;
            final /* synthetic */ WebViewRenderProcess $webViewRenderProcess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WebView webView, WebViewRenderProcess webViewRenderProcess) {
                super(0);
                this.$webView = webView;
                this.$webViewRenderProcess = webViewRenderProcess;
            }

            @Override // tl.a
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onRenderProcessUnresponsive(Title = ");
                sb2.append(this.$webView.getTitle());
                sb2.append(", URL = ");
                sb2.append(this.$webView.getOriginalUrl());
                sb2.append(", (webViewRenderProcess != null) = ");
                sb2.append(this.$webViewRenderProcess != null);
                return sb2.toString();
            }
        }

        public b(o.b bVar) {
            this.errorHandler = bVar;
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            s.h(webView, "webView");
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            s.h(webView, "webView");
            q.Companion.w(i.TAG, new a(webView, webViewRenderProcess));
            o.b bVar = this.errorHandler;
            if (bVar != null) {
                bVar.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends t implements tl.a {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        @Override // tl.a
        public final com.vungle.ads.internal.util.c invoke() {
            return new com.vungle.ads.internal.util.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends t implements tl.o {
        d() {
            super(2);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            invoke(((Number) obj).intValue(), (String) obj2);
            return g0.f38750a;
        }

        public final void invoke(int i10, String errorMessage) throws Throwable {
            s.h(errorMessage, "errorMessage");
            i.this.notifyBlackScreenResult(i10, errorMessage);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends t implements tl.a {
        public static final e INSTANCE = new e();

        e() {
            super(0);
        }

        @Override // tl.a
        public final String invoke() {
            return "onPageFinished.";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends t implements tl.a {
        final /* synthetic */ WebView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(WebView webView) {
            super(0);
            this.$view = webView;
        }

        @Override // tl.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRenderProcessGone url: ");
            WebView webView = this.$view;
            sb2.append(webView != null ? webView.getUrl() : null);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g extends t implements tl.a {
        final /* synthetic */ RenderProcessGoneDetail $detail;
        final /* synthetic */ WebView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            super(0);
            this.$view = webView;
            this.$detail = renderProcessGoneDetail;
        }

        @Override // tl.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRenderProcessGone url: ");
            WebView webView = this.$view;
            sb2.append(webView != null ? webView.getUrl() : null);
            sb2.append(", did crash: ");
            RenderProcessGoneDetail renderProcessGoneDetail = this.$detail;
            sb2.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class h extends t implements tl.a {
        final /* synthetic */ String $injectJs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(0);
            this.$injectJs = str;
        }

        @Override // tl.a
        public final String invoke() {
            return "mraid Injecting JS " + this.$injectJs;
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0534i extends t implements tl.a {
        final /* synthetic */ String $injectJs;
        final /* synthetic */ WebView $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0534i(WebView webView, String str) {
            super(0);
            this.$webView = webView;
            this.$injectJs = str;
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m159invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m159invoke() {
            WebView webView = this.$webView;
            if (webView != null) {
                webView.evaluateJavascript(this.$injectJs, null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class j extends t implements tl.a {
        public static final j INSTANCE = new j();

        j() {
            super(0);
        }

        @Override // tl.a
        public final String invoke() {
            return "shouldInterceptRequest called but partial download is disabled.";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class k extends t implements tl.a {
        final /* synthetic */ String $rangeHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(0);
            this.$rangeHeader = str;
        }

        @Override // tl.a
        public final String invoke() {
            return "Requested range exceeds cached file: " + this.$rangeHeader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class l extends t implements tl.a {
        final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str) {
            super(0);
            this.$url = str;
        }

        @Override // tl.a
        public final String invoke() {
            return "skipped url: " + this.$url;
        }
    }

    public /* synthetic */ i(com.vungle.ads.internal.model.b bVar, Placement placement, ExecutorService executorService, com.vungle.ads.internal.platform.f fVar, m mVar, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, placement, executorService, (i10 & 8) != 0 ? null : fVar, (i10 & 16) != 0 ? null : mVar, (i10 & 32) != 0 ? null : l10);
    }

    private final com.vungle.ads.internal.util.c getBlackScreenDetector() {
        return (com.vungle.ads.internal.util.c) this.blackScreenDetector$delegate.getValue();
    }

    private final void handleWebViewError(String str, String str2, boolean z10) {
        String str3 = str2 + ' ' + str;
        o.b bVar = this.errorHandler;
        if (bVar != null) {
            bVar.onReceivedError(str3, z10);
        }
    }

    private final boolean isCriticalAsset(String str) {
        if (str.length() > 0) {
            return this.advertisement.isCriticalAsset(str);
        }
        return false;
    }

    public static /* synthetic */ void notifyBlackScreenResult$default(i iVar, int i10, String str, int i11, Object obj) throws Throwable {
        if ((i11 & 2) != 0) {
            str = "";
        }
        iVar.notifyBlackScreenResult(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-19, reason: not valid java name */
    public static final void m154notifyPropertiesChange$lambda19(boolean z10, i this$0) {
        s.h(this$0, "this$0");
        e0 e0Var = new e0();
        kotlinx.serialization.json.j.c(e0Var, "placementType", this$0.advertisement.templateType());
        Boolean bool = this$0.isViewable;
        if (bool != null) {
            kotlinx.serialization.json.j.a(e0Var, "isViewable", bool);
        }
        kotlinx.serialization.json.j.c(e0Var, "os", "android");
        kotlinx.serialization.json.j.c(e0Var, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        kotlinx.serialization.json.j.a(e0Var, "incentivized", Boolean.valueOf(this$0.placement.isRewardedVideo()));
        com.vungle.ads.internal.platform.f fVar = this$0.platform;
        if (fVar != null) {
            kotlinx.serialization.json.j.a(e0Var, "isSilent", Boolean.valueOf(fVar.isSilentModeEnabled()));
        }
        if (this$0.loadDuration != null) {
            kotlinx.serialization.json.j.b(e0Var, "timeLoaded", this$0.loadDuration);
        }
        if (this$0.collectConsent) {
            kotlinx.serialization.json.j.a(e0Var, "consentRequired", Boolean.TRUE);
            kotlinx.serialization.json.j.c(e0Var, "consentTitleText", this$0.gdprTitle);
            kotlinx.serialization.json.j.c(e0Var, "consentBodyText", this$0.gdprBody);
            kotlinx.serialization.json.j.c(e0Var, "consentAcceptButtonText", this$0.gdprAccept);
            kotlinx.serialization.json.j.c(e0Var, "consentDenyButtonText", this$0.gdprDeny);
        } else {
            kotlinx.serialization.json.j.a(e0Var, "consentRequired", Boolean.FALSE);
        }
        kotlinx.serialization.json.j.c(e0Var, "sdkVersion", "7.7.2");
        String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + e0Var.a() + ',' + z10 + ')';
        WebView webView = this$0.loadedWebView;
        if (webView != null) {
            this$0.runJavascriptOnWebView(webView, str);
        }
    }

    private final void runJavascriptOnWebView(WebView webView, String str) {
        try {
            q.Companion.w(TAG, new h(str));
            y.INSTANCE.runOnUiThread(new C0534i(webView, str));
        } catch (Throwable th2) {
            new EvaluateJsError("Evaluate js failed " + th2.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-10$lambda-9, reason: not valid java name */
    public static final void m155shouldOverrideUrlLoading$lambda11$lambda10$lambda9(o.a it, String command, kotlinx.serialization.json.d0 args, i this$0, WebView webView) {
        s.h(it, "$it");
        s.h(command, "$command");
        s.h(args, "$args");
        s.h(this$0, "this$0");
        if (it.processCommand(command, args)) {
            this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-5, reason: not valid java name */
    public static final void m156shouldOverrideUrlLoading$lambda11$lambda5(i this$0, WebView webView) {
        s.h(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.advertisement.createMRAIDArgs() + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-6, reason: not valid java name */
    public static final void m157shouldOverrideUrlLoading$lambda11$lambda6(i this$0, WebView webView) {
        s.h(this$0, "this$0");
        m mVar = this$0.delegate;
        if (mVar != null) {
            mVar.onAdReadyToPlay();
        }
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-7, reason: not valid java name */
    public static final void m158shouldOverrideUrlLoading$lambda11$lambda7(i this$0, WebView webView) {
        s.h(this$0, "this$0");
        m mVar = this$0.delegate;
        if (mVar != null) {
            mVar.onAdFailedToPlay();
        }
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    public final o.b getErrorHandler$vungle_ads_release() {
        return this.errorHandler;
    }

    public final String getGdprAccept$vungle_ads_release() {
        return this.gdprAccept;
    }

    public final String getGdprBody$vungle_ads_release() {
        return this.gdprBody;
    }

    public final String getGdprDeny$vungle_ads_release() {
        return this.gdprDeny;
    }

    public final String getGdprTitle$vungle_ads_release() {
        return this.gdprTitle;
    }

    public final WebView getLoadedWebView$vungle_ads_release() {
        return this.loadedWebView;
    }

    public final o.a getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    public final com.vungle.ads.internal.omsdk.e getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    public final void handleBlackScreenDetection(int i10) {
        getBlackScreenDetector().start(this.loadedWebView, i10, new d());
    }

    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    public final void notifyBlackScreenResult(int i10, String errorMessage) throws Throwable {
        s.h(errorMessage, "errorMessage");
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + i10 + ')');
        }
        q.Companion.d(TAG, "Returning black screen result: " + i10 + '%');
        if (i10 >= 0) {
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, Sdk$SDKMetric.b.BLACK_SCREEN_IS_DETECTED, i10, this.advertisement.getLogEntry(), null, 8, null);
        } else {
            com.vungle.ads.g.INSTANCE.logError$vungle_ads_release(Sdk$SDKError.b.BLACK_SCREEN_DETECTION_ERROR, errorMessage, this.advertisement.getLogEntry());
        }
    }

    public final void notifyDiskAvailableSize(long j10, long j11) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j10 + '-' + j11 + ')');
        }
    }

    public final void notifyPresentAppStoreFailed() {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
    }

    @Override // com.vungle.ads.internal.ui.view.o
    public void notifyPropertiesChange(final boolean z10) {
        this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                i.m154notifyPropertiesChange$lambda19(z10, this);
            }
        });
    }

    @Override // com.vungle.ads.internal.util.r
    public void notifySilentModeChange(boolean z10) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            e0 e0Var = new e0();
            kotlinx.serialization.json.j.a(e0Var, "isSilent", Boolean.valueOf(z10));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + e0Var.a() + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        q.Companion.w(TAG, e.INSTANCE);
        if (webView == null) {
            return;
        }
        this.loadedWebView = webView;
        webView.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new b(this.errorHandler));
        }
        com.vungle.ads.internal.omsdk.e eVar = this.webViewObserver;
        if (eVar != null) {
            eVar.onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String description, String failingUrl) {
        s.h(description, "description");
        s.h(failingUrl, "failingUrl");
        super.onReceivedError(webView, i10, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String strValueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = false;
        boolean z11 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        q.Companion.e(TAG, "Http Error desc " + strValueOf + ' ' + z11 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z11) {
            z10 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z10);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            q.Companion.w(TAG, new f(webView));
            o.b bVar = this.errorHandler;
            if (bVar != null) {
                return bVar.onWebRenderingProcessGone(webView, Boolean.TRUE);
            }
            return true;
        }
        q.Companion.w(TAG, new g(webView, renderProcessGoneDetail));
        o.b bVar2 = this.errorHandler;
        if (bVar2 != null) {
            return bVar2.onWebRenderingProcessGone(webView, renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        }
        return true;
    }

    public final fl.q parseRange$vungle_ads_release(String str, long j10) {
        Object objB;
        fl.q qVar;
        try {
            fl.r.a aVar = fl.r.f38769b;
            if (str == null || !bm.r.N(str, "bytes=", false, 2, null)) {
                qVar = new fl.q(0L, null);
            } else {
                List listF0 = bm.r.F0(bm.r.y0(str, "bytes="), new String[]{"-"}, false, 0, 6, null);
                String str2 = (String) gl.r.e0(listF0, 0);
                Long lS = str2 != null ? bm.r.s(str2) : null;
                String str3 = (String) gl.r.e0(listF0, 1);
                Long lS2 = str3 != null ? bm.r.s(str3) : null;
                if (lS == null) {
                    if (lS2 == null) {
                        lS = 0L;
                    } else {
                        lS = Long.valueOf(j10 - lS2.longValue());
                        lS2 = null;
                    }
                }
                qVar = new fl.q(lS, lS2);
            }
            objB = fl.r.b(qVar);
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        if (fl.r.e(objB) != null) {
            objB = new fl.q(0L, null);
        }
        return (fl.q) objB;
    }

    @Override // com.vungle.ads.internal.ui.view.o
    public void setAdVisibility(boolean z10) {
        this.isViewable = Boolean.valueOf(z10);
        WebView webView = this.loadedWebView;
        if (webView != null) {
            e0 e0Var = new e0();
            kotlinx.serialization.json.j.a(e0Var, "isViewable", Boolean.valueOf(z10));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + e0Var.a() + ')');
        }
    }

    public final void setCollectConsent$vungle_ads_release(boolean z10) {
        this.collectConsent = z10;
    }

    @Override // com.vungle.ads.internal.ui.view.o
    public void setConsentStatus(boolean z10, String str, String str2, String str3, String str4) {
        this.collectConsent = z10;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // com.vungle.ads.internal.ui.view.o
    public void setErrorHandler(o.b errorHandler) {
        s.h(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(o.b bVar) {
        this.errorHandler = bVar;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.ui.view.o
    public void setMraidDelegate(o.a aVar) {
        this.mraidDelegate = aVar;
    }

    public final void setMraidDelegate$vungle_ads_release(o.a aVar) {
        this.mraidDelegate = aVar;
    }

    public final void setReady$vungle_ads_release(boolean z10) {
        this.ready = z10;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.o
    public void setWebViewObserver(com.vungle.ads.internal.omsdk.e eVar) {
        this.webViewObserver = eVar;
    }

    public final void setWebViewObserver$vungle_ads_release(com.vungle.ads.internal.omsdk.e eVar) {
        this.webViewObserver = eVar;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return null;
        }
        String scheme = url.getScheme();
        if (scheme != null) {
            Locale ROOT = Locale.ROOT;
            s.g(ROOT, "ROOT");
            String lowerCase = scheme.toLowerCase(ROOT);
            s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null) {
                if (!s.c(lowerCase, "http") && !s.c(lowerCase, "https")) {
                    return null;
                }
                if (!this.advertisement.isPartialDownloadEnabled()) {
                    q.Companion.w(TAG, j.INSTANCE);
                    return null;
                }
                String string = url.toString();
                s.g(string, "uri.toString()");
                com.vungle.ads.internal.model.a localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(string);
                String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
                if (localPath == null || localPath.length() == 0) {
                    return null;
                }
                File file = new File(localPath);
                if (!file.exists()) {
                    return null;
                }
                long contentLength = localPartialDownloadAssets.getContentLength();
                if (contentLength <= 0) {
                    return null;
                }
                long length = file.length();
                String str = webResourceRequest.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
                this.partialDownloadMetric.setMeta(str + " cached:" + length + ' ' + string);
                com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                fl.q range$vungle_ads_release = parseRange$vungle_ads_release(str, contentLength);
                localPartialDownloadAssets.setRangeStart(((Number) range$vungle_ads_release.h()).longValue());
                localPartialDownloadAssets.setRangeEnd((Long) range$vungle_ads_release.i());
                long jLongValue = ((Number) range$vungle_ads_release.d()).longValue();
                Long l10 = (Long) range$vungle_ads_release.g();
                long j10 = length - jLongValue;
                q.a aVar = q.Companion;
                aVar.i(TAG, ">>request: " + url + " rangeStart=" + jLongValue + " rangeEnd=" + l10 + " cachedFileLength=" + length + " availableBytes=" + j10 + " contentLength=" + contentLength + ' ');
                if (j10 <= 0) {
                    aVar.w(TAG, new k(str));
                    localPartialDownloadAssets.waitForDownload();
                    length = file.length();
                }
                long jLongValue2 = l10 != null ? l10.longValue() : length - 1;
                long j11 = (jLongValue2 - jLongValue) + 1;
                try {
                    fl.r.a aVar2 = fl.r.f38769b;
                    FileInputStream fileInputStream = new FileInputStream(file);
                    WebResourceResponse webResourceResponse = new WebResourceResponse(localPartialDownloadAssets.getMimeType(), C.UTF8_NAME, Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE, "Partial Content", l0.l(w.a("Content-Type", localPartialDownloadAssets.getMimeType()), w.a("Accept-Ranges", "bytes"), w.a("Content-Length", String.valueOf(j11)), w.a("Content-Range", "bytes " + jLongValue + '-' + jLongValue2 + '/' + contentLength)), new BufferedInputStream(fileInputStream, UserVerificationMethods.USER_VERIFY_ALL));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("<<Return:");
                    sb2.append(webResourceResponse.getResponseHeaders());
                    aVar.i(TAG, sb2.toString());
                    return webResourceResponse;
                } catch (Throwable th2) {
                    fl.r.a aVar3 = fl.r.f38769b;
                    Throwable thE = fl.r.e(fl.r.b(fl.s.a(th2)));
                    if (thE == null) {
                        return null;
                    }
                    q.Companion.e(TAG, "Error serving local range video: " + thE.getMessage(), thE);
                    this.partialDownloadErrorMetric.setMeta(string + ' ' + thE.getMessage());
                    com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ab A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:3:0x0003, B:5:0x001b, B:8:0x0024, B:10:0x0033, B:13:0x003c, B:15:0x0049, B:17:0x004f, B:43:0x00ab, B:48:0x00b7, B:49:0x00c4, B:53:0x00dd, B:37:0x0092), top: B:80:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00af A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:25:0x0063, B:28:0x006c, B:45:0x00af, B:51:0x00ca, B:32:0x007e, B:35:0x0087, B:39:0x009a, B:41:0x009e), top: B:82:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7 A[Catch: all -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f2, blocks: (B:3:0x0003, B:5:0x001b, B:8:0x0024, B:10:0x0033, B:13:0x003c, B:15:0x0049, B:17:0x004f, B:43:0x00ab, B:48:0x00b7, B:49:0x00c4, B:53:0x00dd, B:37:0x0092), top: B:80:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca A[Catch: all -> 0x0079, LOOP:0: B:49:0x00c4->B:51:0x00ca, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:25:0x0063, B:28:0x006c, B:45:0x00af, B:51:0x00ca, B:32:0x007e, B:35:0x0087, B:39:0x009a, B:41:0x009e), top: B:82:0x0056 }] */
    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(final WebView webView, String str) {
        Object obj;
        i iVar;
        final o.a aVar;
        e0 e0Var;
        try {
            q.a aVar2 = q.Companion;
            aVar2.d(TAG, "MRAID Command " + str);
            try {
                if (str == null || str.length() == 0) {
                    aVar2.e(TAG, "Invalid URL ");
                    return false;
                }
                Uri uri = Uri.parse(str);
                s.g(uri, "parse(this)");
                String scheme = uri.getScheme();
                if (scheme == null || scheme.length() == 0) {
                    return false;
                }
                String scheme2 = uri.getScheme();
                if (!s.c(scheme2, CampaignEx.JSON_KEY_MRAID)) {
                    iVar = this;
                    if (!bm.r.A("http", scheme2, true)) {
                        if (bm.r.A("https", scheme2, true)) {
                        }
                    }
                    aVar2.d(TAG, "Open URL" + str);
                    o.a aVar3 = iVar.mraidDelegate;
                    if (aVar3 != null) {
                        e0 e0Var2 = new e0();
                        kotlinx.serialization.json.j.c(e0Var2, "url", str);
                        aVar3.processCommand("openNonMraid", e0Var2.a());
                    }
                    return true;
                }
                final String host = uri.getHost();
                if (host != null) {
                    int iHashCode = host.hashCode();
                    try {
                        if (iHashCode == -1943542072) {
                            if (!host.equals("propertiesChangeCompleted")) {
                                aVar = this.mraidDelegate;
                                if (aVar == null) {
                                    runJavascriptOnWebView(webView, COMMAND_COMPLETE);
                                    return true;
                                }
                                if (aVar != null) {
                                    e0Var = new e0();
                                    while (r2.hasNext()) {
                                        s.g(param, "param");
                                        kotlinx.serialization.json.j.c(e0Var, param, uri.getQueryParameter(param));
                                    }
                                    final kotlinx.serialization.json.d0 d0VarA = e0Var.a();
                                    this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.h
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            i.m155shouldOverrideUrlLoading$lambda11$lambda10$lambda9(aVar, host, d0VarA, this, webView);
                                        }
                                    });
                                }
                                return true;
                            }
                            if (!this.ready) {
                                this.ready = true;
                                this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.e
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        i.m156shouldOverrideUrlLoading$lambda11$lambda5(this.f35860a, webView);
                                    }
                                });
                            }
                        } else if (iHashCode != 88409791) {
                            if (iHashCode != 119543762 || !host.equals("readyToPlay")) {
                                aVar = this.mraidDelegate;
                                if (aVar == null) {
                                    runJavascriptOnWebView(webView, COMMAND_COMPLETE);
                                    return true;
                                }
                                if (aVar != null) {
                                    e0Var = new e0();
                                    for (String param : uri.getQueryParameterNames()) {
                                        s.g(param, "param");
                                        kotlinx.serialization.json.j.c(e0Var, param, uri.getQueryParameter(param));
                                    }
                                    final kotlinx.serialization.json.d0 d0VarA2 = e0Var.a();
                                    this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.h
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            i.m155shouldOverrideUrlLoading$lambda11$lambda10$lambda9(aVar, host, d0VarA2, this, webView);
                                        }
                                    });
                                }
                                return true;
                            }
                            this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    i.m157shouldOverrideUrlLoading$lambda11$lambda6(this.f35862a, webView);
                                }
                            });
                        } else {
                            if (!host.equals("failToLoad")) {
                                aVar = this.mraidDelegate;
                                if (aVar == null) {
                                    runJavascriptOnWebView(webView, COMMAND_COMPLETE);
                                    return true;
                                }
                                if (aVar != null) {
                                    e0Var = new e0();
                                    while (r2.hasNext()) {
                                        s.g(param, "param");
                                        kotlinx.serialization.json.j.c(e0Var, param, uri.getQueryParameter(param));
                                    }
                                    final kotlinx.serialization.json.d0 d0VarA3 = e0Var.a();
                                    this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.h
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            i.m155shouldOverrideUrlLoading$lambda11$lambda10$lambda9(aVar, host, d0VarA3, this, webView);
                                        }
                                    });
                                }
                                return true;
                            }
                            this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    i.m158shouldOverrideUrlLoading$lambda11$lambda7(this.f35864a, webView);
                                }
                            });
                        }
                        return true;
                    } catch (Throwable th2) {
                        obj = th2;
                    }
                } else {
                    iVar = this;
                }
                iVar.skippedUrlMetric.setMeta("url: " + str);
                com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, iVar.skippedUrlMetric, iVar.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                aVar2.w(TAG, new l(str));
                return false;
            } catch (Throwable th3) {
                th = th3;
                obj = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        obj = th;
        if (obj instanceof OutOfMemoryError) {
            new OutOfMemory("mraid:" + str).logErrorNoReturnValue$vungle_ads_release();
        }
        return false;
    }

    public i(com.vungle.ads.internal.model.b advertisement, Placement placement, ExecutorService offloadExecutor, com.vungle.ads.internal.platform.f fVar, m mVar, Long l10) {
        s.h(advertisement, "advertisement");
        s.h(placement, "placement");
        s.h(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.platform = fVar;
        this.delegate = mVar;
        this.loadDuration = l10;
        this.blackScreenDetector$delegate = fl.l.b(c.INSTANCE);
        Sdk$SDKMetric.b bVar = Sdk$SDKMetric.b.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.partialDownloadMetric = new x(bVar);
        this.partialDownloadErrorMetric = new x(bVar);
        this.skippedUrlMetric = new d0(Sdk$SDKMetric.b.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = false;
        boolean z11 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        q.Companion.e(TAG, "Error desc " + strValueOf + ' ' + z11 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z11) {
            z10 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z10);
    }

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }
}
