package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.q;
import fl.g0;
import fl.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends RelativeLayout {
    public static final b Companion = new b(null);
    private static final String TAG = "MRAIDAdWidget";
    private a closeDelegate;
    private final String eventId;
    private d onViewTouchListener;
    private e orientationDelegate;
    private final fl.k platform$delegate;
    private WebView webView;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void close();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements Runnable {
        private final j widget;

        public c(j widget) {
            s.h(widget, "widget");
            this.widget = widget;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: run$lambda-0, reason: not valid java name */
        public static final void m167run$lambda0(c this$0) {
            s.h(this$0, "this$0");
            this$0.run();
        }

        @Override // java.lang.Runnable
        public void run() {
            g0 g0Var;
            WebView webView = this.widget.webView;
            if (webView == null) {
                return;
            }
            if (!s.c(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.vungle.ads.internal.ui.view.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.c.m167run$lambda0(this.f35879a);
                    }
                });
                return;
            }
            try {
                try {
                    r.a aVar = r.f38769b;
                    webView.onPause();
                    r.b(g0.f38750a);
                } catch (Throwable th2) {
                    r.a aVar2 = r.f38769b;
                    r.b(fl.s.a(th2));
                }
                try {
                    webView.stopLoading();
                    r.b(g0.f38750a);
                } catch (Throwable th3) {
                    r.a aVar3 = r.f38769b;
                    r.b(fl.s.a(th3));
                }
                try {
                    webView.setWebChromeClient(null);
                    r.b(g0.f38750a);
                } catch (Throwable th4) {
                    r.a aVar4 = r.f38769b;
                    r.b(fl.s.a(th4));
                }
                try {
                    webView.setWebViewClient(new WebViewClient());
                    r.b(g0.f38750a);
                } catch (Throwable th5) {
                    r.a aVar5 = r.f38769b;
                    r.b(fl.s.a(th5));
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        webView.setWebViewRenderProcessClient(null);
                        r.b(g0.f38750a);
                    } catch (Throwable th6) {
                        r.a aVar6 = r.f38769b;
                        r.b(fl.s.a(th6));
                    }
                }
                try {
                    webView.loadUrl("about:blank");
                    r.b(g0.f38750a);
                } catch (Throwable th7) {
                    r.a aVar7 = r.f38769b;
                    r.b(fl.s.a(th7));
                }
                try {
                    webView.clearHistory();
                    r.b(g0.f38750a);
                } catch (Throwable th8) {
                    r.a aVar8 = r.f38769b;
                    r.b(fl.s.a(th8));
                }
                try {
                    webView.removeAllViews();
                    r.b(g0.f38750a);
                } catch (Throwable th9) {
                    r.a aVar9 = r.f38769b;
                    r.b(fl.s.a(th9));
                }
                try {
                    this.widget.removeAllViews();
                    r.b(g0.f38750a);
                } catch (Throwable th10) {
                    r.a aVar10 = r.f38769b;
                    r.b(fl.s.a(th10));
                }
                try {
                    String eventId = this.widget.getEventId();
                    if (eventId != null) {
                        com.vungle.ads.internal.presenter.o.INSTANCE.destroyWebView(eventId);
                        g0Var = g0.f38750a;
                    } else {
                        g0Var = null;
                    }
                    r.b(g0Var);
                } catch (Throwable th11) {
                    r.a aVar11 = r.f38769b;
                    r.b(fl.s.a(th11));
                }
                try {
                    webView.destroy();
                    r.b(g0.f38750a);
                } catch (Throwable th12) {
                    r.a aVar12 = r.f38769b;
                    r.b(fl.s.a(th12));
                }
                this.widget.webView = null;
            } catch (Throwable th13) {
                q.Companion.e(j.TAG, "Destroy webview: " + th13.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        boolean onTouch(MotionEvent motionEvent);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        void setOrientation(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.f, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.platform.f invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.platform.f.class);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        s.h(context, "context");
    }

    private final void bindListeners() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.vungle.ads.internal.ui.view.i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return j.m166bindListeners$lambda0(this.f35878a, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bindListeners$lambda-0, reason: not valid java name */
    public static final boolean m166bindListeners$lambda0(j this$0, View view, MotionEvent motionEvent) {
        s.h(this$0, "this$0");
        d dVar = this$0.onViewTouchListener;
        if (dVar != null) {
            return dVar.onTouch(motionEvent);
        }
        return false;
    }

    private final com.vungle.ads.internal.platform.f getPlatform() {
        return (com.vungle.ads.internal.platform.f) this.platform$delegate.getValue();
    }

    private final void prepare() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setLayerType(getPlatform().isProblematicMaliDevice() ? 0 : 2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void close() {
        a aVar = this.closeDelegate;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void destroyWebView(long j10) {
        try {
            r.a aVar = r.f38769b;
            ViewParent parent = getParent();
            g0 g0Var = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
                g0Var = g0.f38750a;
            }
            r.b(g0Var);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            r.b(fl.s.a(th2));
        }
        try {
            removeAllViews();
            r.b(g0.f38750a);
        } catch (Throwable th3) {
            r.a aVar3 = r.f38769b;
            r.b(fl.s.a(th3));
        }
        if (j10 <= 0) {
            new c(this).run();
        } else {
            new com.vungle.ads.internal.util.k().schedule(new c(this), j10);
        }
    }

    public final a getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final d getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    public final e getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    public final String getUrl() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public final void linkWebView(WebViewClient vngWebViewClient, com.vungle.ads.internal.model.b.WebViewSettings webViewSettings) {
        s.h(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.webView;
        if (webView != null) {
            com.vungle.ads.internal.platform.g.INSTANCE.applyWebSettings(webView, webViewSettings);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.webView;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void pauseWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void resumeWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    public final void setCloseDelegate(a closeDelegate) {
        s.h(closeDelegate, "closeDelegate");
        this.closeDelegate = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(a aVar) {
        this.closeDelegate = aVar;
    }

    public final void setOnViewTouchListener(d dVar) {
        this.onViewTouchListener = dVar;
    }

    public final void setOnViewTouchListener$vungle_ads_release(d dVar) {
        this.onViewTouchListener = dVar;
    }

    public final void setOrientation(int i10) {
        e eVar = this.orientationDelegate;
        if (eVar != null) {
            eVar.setOrientation(i10);
        }
    }

    public final void setOrientationDelegate(e eVar) {
        this.orientationDelegate = eVar;
    }

    public final void setOrientationDelegate$vungle_ads_release(e eVar) {
        this.orientationDelegate = eVar;
    }

    public final void showWebsite(String url) {
        s.h(url, "url");
        q.Companion.d(TAG, "loadUrl: " + url);
        WebView webView = this.webView;
        if (webView != null) {
            webView.loadUrl(url);
        }
    }

    public /* synthetic */ j(Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, String str) throws InstantiationException {
        super(context);
        s.h(context, "context");
        this.eventId = str;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.platform$delegate = fl.l.a(fl.o.SYNCHRONIZED, new f(context));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = a0.INSTANCE.getWebView(context, str);
        this.webView = webView;
        if (webView != null) {
            webView.setLayoutParams(layoutParams);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setTag("VungleWebView");
        }
        addView(this.webView, layoutParams);
        bindListeners();
        prepare();
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }
}
