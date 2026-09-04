package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.y;
import fl.g0;
import fl.r;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static final String TAG = "WebViewManager";
    public static final o INSTANCE = new o();
    private static final ReentrantLock lock = new ReentrantLock();
    private static final LinkedHashMap<String, a> webViewCache = new LinkedHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        private final WebView webView;
        private final com.vungle.ads.internal.ui.i webViewClient;

        public a(WebView webView, com.vungle.ads.internal.ui.i webViewClient) {
            s.h(webView, "webView");
            s.h(webViewClient, "webViewClient");
            this.webView = webView;
            this.webViewClient = webViewClient;
        }

        public static /* synthetic */ a copy$default(a aVar, WebView webView, com.vungle.ads.internal.ui.i iVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                webView = aVar.webView;
            }
            if ((i10 & 2) != 0) {
                iVar = aVar.webViewClient;
            }
            return aVar.copy(webView, iVar);
        }

        public final WebView component1() {
            return this.webView;
        }

        public final com.vungle.ads.internal.ui.i component2() {
            return this.webViewClient;
        }

        public final a copy(WebView webView, com.vungle.ads.internal.ui.i webViewClient) {
            s.h(webView, "webView");
            s.h(webViewClient, "webViewClient");
            return new a(webView, webViewClient);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.c(this.webView, aVar.webView) && s.c(this.webViewClient, aVar.webViewClient);
        }

        public final WebView getWebView() {
            return this.webView;
        }

        public final com.vungle.ads.internal.ui.i getWebViewClient() {
            return this.webViewClient;
        }

        public int hashCode() {
            return (this.webView.hashCode() * 31) + this.webViewClient.hashCode();
        }

        public String toString() {
            return "WebViewEntry(webView=" + this.webView + ", webViewClient=" + this.webViewClient + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t implements tl.a {
        final /* synthetic */ com.vungle.ads.internal.model.b $adv;
        final /* synthetic */ Context $context;
        final /* synthetic */ m $delegate;
        final /* synthetic */ String $key;
        final /* synthetic */ Long $loadDuration;
        final /* synthetic */ Placement $placement;
        final /* synthetic */ String $templatePath;
        final /* synthetic */ com.vungle.ads.internal.model.b.WebViewSettings $webSettings;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends t implements tl.a {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.$context = context;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
            @Override // tl.a
            public final com.vungle.ads.internal.executor.a invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.presenter.o$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0527b extends t implements tl.a {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0527b(Context context) {
                super(0);
                this.$context = context;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.f, java.lang.Object] */
            @Override // tl.a
            public final com.vungle.ads.internal.platform.f invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.platform.f.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, com.vungle.ads.internal.model.b bVar, Placement kVar, m mVar, Long l10, String str, String str2, com.vungle.ads.internal.model.b.WebViewSettings lVar) {
            super(0);
            this.$context = context;
            this.$adv = bVar;
            this.$placement = kVar;
            this.$delegate = mVar;
            this.$loadDuration = l10;
            this.$templatePath = str;
            this.$key = str2;
            this.$webSettings = lVar;
        }

        /* JADX INFO: renamed from: invoke$lambda-3$lambda-1, reason: not valid java name */
        private static final com.vungle.ads.internal.executor.a m135invoke$lambda3$lambda1(fl.k kVar) {
            return (com.vungle.ads.internal.executor.a) kVar.getValue();
        }

        /* JADX INFO: renamed from: invoke$lambda-3$lambda-2, reason: not valid java name */
        private static final com.vungle.ads.internal.platform.f m136invoke$lambda3$lambda2(fl.k kVar) {
            return (com.vungle.ads.internal.platform.f) kVar.getValue();
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m137invoke();
            return g0.f38750a;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m137invoke() {
            Object objB;
            o oVar = o.INSTANCE;
            Context context = this.$context;
            com.vungle.ads.internal.model.b bVar = this.$adv;
            Placement kVar = this.$placement;
            m mVar = this.$delegate;
            Long l10 = this.$loadDuration;
            String str = this.$templatePath;
            String str2 = this.$key;
            com.vungle.ads.internal.model.b.WebViewSettings lVar = this.$webSettings;
            try {
                r.a aVar = r.f38769b;
                WebView webView = new WebView(context.getApplicationContext());
                com.vungle.ads.internal.platform.g.INSTANCE.applyWebSettings(webView, lVar);
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                fl.o oVar2 = fl.o.SYNCHRONIZED;
                com.vungle.ads.internal.ui.i iVar = new com.vungle.ads.internal.ui.i(bVar, kVar, m135invoke$lambda3$lambda1(fl.l.a(oVar2, new a(context))).getOffloadExecutor(), m136invoke$lambda3$lambda2(fl.l.a(oVar2, new C0527b(context))), mVar, l10);
                com.vungle.ads.internal.e eVar = com.vungle.ads.internal.e.INSTANCE;
                iVar.setConsentStatus(eVar.getGDPRIsCountryDataProtected() && s.c("unknown", yj.c.INSTANCE.getConsentStatus()), eVar.getGDPRConsentTitle(), eVar.getGDPRConsentMessage(), eVar.getGDPRButtonAccept(), eVar.getGDPRButtonDeny());
                webView.setWebViewClient(iVar);
                webView.loadUrl(str);
                o.webViewCache.put(String.valueOf(str2), new a(webView, iVar));
                com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, Sdk$SDKMetric.b.CONCURRENT_CACHED_WEBVIEW_COUNT, o.webViewCache.size(), bVar.getLogEntry(), null, 8, null);
                objB = r.b(Integer.valueOf(q.Companion.d(o.TAG, "Preload complete. Cache size: " + o.webViewCache.size())));
            } catch (Throwable th2) {
                r.a aVar2 = r.f38769b;
                objB = r.b(fl.s.a(th2));
            }
            m mVar2 = this.$delegate;
            Throwable thE = r.e(objB);
            if (thE != null) {
                q.Companion.e(o.TAG, "Preload webview failed", thE);
                mVar2.onAdReadyToPlay();
            }
        }
    }

    private o() {
    }

    private final void destroyWebViewInternal(String str) {
        webViewCache.remove(str);
    }

    public final void destroyWebView(String key) {
        s.h(key, "key");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            INSTANCE.destroyWebViewInternal(key);
            g0 g0Var = g0.f38750a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final WebView getOrCreateWebView(Context context, String str) {
        WebView webView;
        s.h(context, "context");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            LinkedHashMap<String, a> linkedHashMap = webViewCache;
            a aVar = linkedHashMap.get(str);
            if (aVar != null) {
                q.Companion.d(TAG, "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = aVar.getWebView();
            } else {
                q.Companion.d(TAG, "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            return webView;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final com.vungle.ads.internal.ui.i getOrCreateWebViewClient(com.vungle.ads.internal.model.b advertisement, Placement placement, com.vungle.ads.internal.executor.i offloadExecutor, com.vungle.ads.internal.platform.f platform) {
        s.h(advertisement, "advertisement");
        s.h(placement, "placement");
        s.h(offloadExecutor, "offloadExecutor");
        s.h(platform, "platform");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            a aVar = webViewCache.get(advertisement.eventId());
            com.vungle.ads.internal.ui.i webViewClient = aVar != null ? aVar.getWebViewClient() : null;
            if (webViewClient == null) {
                webViewClient = new com.vungle.ads.internal.ui.i(advertisement, placement, offloadExecutor, platform, null, null, 48, null);
            }
            return webViewClient;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void preloadWebView$vungle_ads_release(Context context, com.vungle.ads.internal.model.b adv, Placement placement, String templatePath, com.vungle.ads.internal.model.b.WebViewSettings lVar, m delegate, Long l10) {
        s.h(context, "context");
        s.h(adv, "adv");
        s.h(placement, "placement");
        s.h(templatePath, "templatePath");
        s.h(delegate, "delegate");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            q.a aVar = q.Companion;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Preload webview start. Cache size: ");
            LinkedHashMap<String, a> linkedHashMap = webViewCache;
            sb2.append(linkedHashMap.size());
            aVar.d(TAG, sb2.toString());
            String strEventId = adv.eventId();
            if (!linkedHashMap.containsKey(strEventId)) {
                y.INSTANCE.runOnUiThread(new b(context, adv, placement, delegate, l10, templatePath, strEventId, lVar));
            }
            g0 g0Var = g0.f38750a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
