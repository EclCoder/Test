package com.vungle.ads.internal.presenter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.LinkError;
import com.vungle.ads.MraidTemplateError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.d0;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.y;
import fl.g0;
import fl.w;
import gl.l0;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements com.vungle.ads.internal.ui.view.o.a, com.vungle.ads.internal.ui.view.o.b {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String DETECT_BLACK_SCREEN = "detectBlackScreen";
    public static final String ERROR = "error";
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    public static final String OPEN = "open";
    private static final String OPEN_APP_STORE = "openAppStore";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String PING_URL = "pingUrl";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    public static final String UPDATE_SIGNALS = "updateSignals";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    private Long adStartTime;
    private final com.vungle.ads.internal.ui.view.j adWidget;
    private final com.vungle.ads.internal.model.b advertisement;
    private com.vungle.ads.internal.presenter.l appStoreDelegate;
    private boolean backEnabled;
    private com.vungle.ads.internal.presenter.a bus;
    private final fl.k clickCoordinateTracker$delegate;
    private boolean cp0Fired;
    private Executor executor;
    private final AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;
    private final fl.k logEntry$delegate;
    private final com.vungle.ads.internal.omsdk.d omTracker;
    private final fl.k pathProvider$delegate;
    private final Placement placement;
    private final com.vungle.ads.internal.platform.f platform;
    private com.vungle.ads.internal.presenter.n presenterDelegate;
    private final fl.k scheduler$delegate;
    private final AtomicBoolean sendReportIncentivized;
    private final fl.k signalManager$delegate;
    private final fl.k tpatSender$delegate;
    private String userId;
    private long videoLength;
    private final fl.k vungleApiClient$delegate;
    private final com.vungle.ads.internal.ui.i vungleWebClient;
    public static final a Companion = new a(null);
    private static final Map<String, Sdk$SDKMetric.b> eventMap = l0.l(w.a(com.vungle.ads.internal.f.CHECKPOINT_0, Sdk$SDKMetric.b.AD_START_EVENT), w.a(com.vungle.ads.internal.f.CLICK_URL, Sdk$SDKMetric.b.AD_CLICK_EVENT));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<String, Sdk$SDKMetric.b> getEventMap$vungle_ads_release() {
            return g.eventMap;
        }

        private a() {
        }

        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getDETECT_BLACK_SCREEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getPING_URL$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class b extends t implements tl.a {
        b() {
            super(0);
        }

        @Override // tl.a
        public final com.vungle.ads.internal.d invoke() {
            Context context = g.this.adWidget.getContext();
            s.g(context, "adWidget.context");
            return new com.vungle.ads.internal.d(context, g.this.advertisement);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class c extends t implements tl.a {
        c() {
            super(0);
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m127invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m127invoke() {
            g.this.adWidget.close();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class d implements com.vungle.ads.internal.ui.c {
        final /* synthetic */ String $deeplinkUrl;
        final /* synthetic */ g this$0;

        d(String str, g gVar) {
            this.$deeplinkUrl = str;
            this.this$0 = gVar;
        }

        @Override // com.vungle.ads.internal.ui.c
        public void onDeeplinkClick(boolean z10) {
            if (!z10) {
                new LinkError(Sdk$SDKError.b.DEEPLINK_OPEN_FAILED, "Fail to open " + this.$deeplinkUrl).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            }
            List tpatUrls$default = com.vungle.ads.internal.model.b.getTpatUrls$default(this.this$0.advertisement, com.vungle.ads.internal.f.DEEPLINK_CLICK, String.valueOf(z10), null, 4, null);
            if (tpatUrls$default != null) {
                g gVar = this.this$0;
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.i.sendTpat$default(gVar.getTpatSender(), new com.vungle.ads.internal.network.g.a((String) it.next()).tpatKey(com.vungle.ads.internal.f.DEEPLINK_CLICK).withLogEntry(gVar.getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class e extends t implements tl.a {
        e() {
            super(0);
        }

        @Override // tl.a
        public final p invoke() {
            return g.this.advertisement.getLogEntry();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class f extends t implements tl.a {
        f() {
            super(0);
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m128invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m128invoke() {
            g.this.vungleWebClient.notifyPresentAppStoreFailed();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.presenter.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class C0526g extends t implements tl.a {
        C0526g() {
            super(0);
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m129invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m129invoke() {
            g.this.adWidget.setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class h implements com.vungle.ads.internal.network.b {
        h() {
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a aVar, Throwable th2) {
            q.Companion.d(g.TAG, "send RI Failure");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error RI API calls: ");
            sb2.append(th2 != null ? th2.getLocalizedMessage() : null);
            new NetworkUnreachable(sb2.toString()).setLogEntry$vungle_ads_release(g.this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a aVar, com.vungle.ads.internal.network.f fVar) {
            q.Companion.d(g.TAG, "send RI success");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class i extends t implements tl.a {
        final /* synthetic */ MraidTemplateError $exception;
        final /* synthetic */ boolean $isFatal;
        final /* synthetic */ String $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(MraidTemplateError mraidTemplateError, boolean z10, String str) {
            super(0);
            this.$exception = mraidTemplateError;
            this.$isFatal = z10;
            this.$message = str;
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m130invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m130invoke() {
            g.this.handleWebViewException(this.$exception, this.$isFatal, this.$message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class j extends t implements tl.a {
        final /* synthetic */ long $availableDiskSpace;
        final /* synthetic */ long $webviewSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j10, long j11) {
            super(0);
            this.$availableDiskSpace = j10;
            this.$webviewSize = j11;
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m131invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m131invoke() {
            g.this.vungleWebClient.notifyDiskAvailableSize(this.$availableDiskSpace, this.$webviewSize);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class k extends t implements tl.a {
        public static final k INSTANCE = new k();

        k() {
            super(0);
        }

        @Override // tl.a
        public final com.vungle.ads.internal.util.k invoke() {
            return new com.vungle.ads.internal.util.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class l extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.k, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.k invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.k.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class m extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.s, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.util.s invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.util.s.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class n extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class o extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.i, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.i invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.i.class);
        }
    }

    public g(com.vungle.ads.internal.ui.view.j adWidget, com.vungle.ads.internal.model.b advertisement, Placement placement, com.vungle.ads.internal.ui.i vungleWebClient, Executor executor, com.vungle.ads.internal.omsdk.d omTracker, com.vungle.ads.internal.platform.f platform) {
        s.h(adWidget, "adWidget");
        s.h(advertisement, "advertisement");
        s.h(placement, "placement");
        s.h(vungleWebClient, "vungleWebClient");
        s.h(executor, "executor");
        s.h(omTracker, "omTracker");
        s.h(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = adWidget.getContext();
        s.g(context, "adWidget.context");
        fl.o oVar = fl.o.SYNCHRONIZED;
        this.vungleApiClient$delegate = fl.l.a(oVar, new l(context));
        Context context2 = adWidget.getContext();
        s.g(context2, "adWidget.context");
        this.pathProvider$delegate = fl.l.a(oVar, new m(context2));
        Context context3 = adWidget.getContext();
        s.g(context3, "adWidget.context");
        this.signalManager$delegate = fl.l.a(oVar, new n(context3));
        Context context4 = adWidget.getContext();
        s.g(context4, "adWidget.context");
        this.tpatSender$delegate = fl.l.a(oVar, new o(context4));
        this.scheduler$delegate = fl.l.b(k.INSTANCE);
        this.logEntry$delegate = fl.l.b(new e());
        this.clickCoordinateTracker$delegate = fl.l.b(new b());
    }

    private final void closeView() {
        y yVar = y.INSTANCE;
        if (yVar.isMainThread()) {
            this.executor.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.d
                @Override // java.lang.Runnable
                public final void run() {
                    g.m124closeView$lambda3(this.f35846a);
                }
            });
        } else {
            sendAdCloseEvent();
        }
        yVar.runOnUiThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: closeView$lambda-3, reason: not valid java name */
    public static final void m124closeView$lambda3(g this$0) {
        s.h(this$0, "this$0");
        this$0.sendAdCloseEvent();
    }

    private final com.vungle.ads.internal.ui.c createDeeplinkCallback(String str) {
        return new d(str, this);
    }

    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBus$annotations() {
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p getLogEntry() {
        return (p) this.logEntry$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.s getPathProvider() {
        return (com.vungle.ads.internal.util.s) this.pathProvider$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.k getScheduler() {
        return (com.vungle.ads.internal.util.k) this.scheduler$delegate.getValue();
    }

    private final com.vungle.ads.internal.signals.b getSignalManager() {
        return (com.vungle.ads.internal.signals.b) this.signalManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.network.i getTpatSender() {
        return (com.vungle.ads.internal.network.i) this.tpatSender$delegate.getValue();
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVideoLength$vungle_ads_release$annotations() {
    }

    private final com.vungle.ads.internal.network.k getVungleApiClient() {
        return (com.vungle.ads.internal.network.k) this.vungleApiClient$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewException(VungleError vungleError, boolean z10, String str) {
        q.Companion.e(TAG, "handleWebViewException: " + vungleError.getLocalizedMessage() + ", fatal: " + z10 + ", errorMsg: " + str);
        vungleError.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (z10) {
            makeBusError(vungleError);
            closeView();
        }
    }

    static /* synthetic */ void handleWebViewException$default(g gVar, VungleError vungleError, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        gVar.handleWebViewException(vungleError, z10, str);
    }

    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    private final boolean launchInlineInstall(String str) throws Throwable {
        fl.q qVar;
        com.vungle.ads.internal.util.h hVar = com.vungle.ads.internal.util.h.INSTANCE;
        Context context = this.adWidget.getContext();
        s.g(context, "adWidget.context");
        Intent intentFromUrl$vungle_ads_release = hVar.getIntentFromUrl$vungle_ads_release(context, str);
        if (intentFromUrl$vungle_ads_release == null) {
            logInlineInstallFailure("url: " + str + ", message: intent is null");
            return false;
        }
        fl.q qVarCheckInlineInstallIntent$vungle_ads_release = checkInlineInstallIntent$vungle_ads_release(intentFromUrl$vungle_ads_release);
        boolean zBooleanValue = ((Boolean) qVarCheckInlineInstallIntent$vungle_ads_release.d()).booleanValue();
        String str2 = (String) qVarCheckInlineInstallIntent$vungle_ads_release.g();
        if (!zBooleanValue) {
            logInlineInstallFailure("url: " + str + ", message: resolveInfo " + str2);
            return false;
        }
        com.vungle.ads.internal.presenter.l lVar = this.appStoreDelegate;
        if (lVar == null || (qVar = lVar.openInlineInstall(intentFromUrl$vungle_ads_release)) == null) {
            qVar = new fl.q(Boolean.FALSE, null);
        }
        boolean zBooleanValue2 = ((Boolean) qVar.d()).booleanValue();
        String str3 = (String) qVar.g();
        if (zBooleanValue2) {
            logInlineInstallSuccess$vungle_ads_release("url: " + str);
            return true;
        }
        logInlineInstallFailure("url: " + str + ", message: " + str3);
        return false;
    }

    private final VungleError loadMraidAd() {
        String indexFilePath = this.advertisement.getIndexFilePath();
        File file = indexFilePath != null ? new File(indexFilePath) : null;
        if (file == null || !file.exists()) {
            Sdk$SDKError.b bVar = Sdk$SDKError.b.AD_HTML_FAILED_TO_LOAD;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fail to load html ");
            sb2.append(file != null ? file.getPath() : null);
            return new IndexHtmlError(bVar, sb2.toString());
        }
        this.adWidget.linkWebView(this.vungleWebClient, this.advertisement.getWebViewSettings());
        this.adWidget.showWebsite(com.vungle.ads.internal.model.b.FILE_SCHEME + file.getPath());
        return null;
    }

    private final void logInlineInstallFailure(String str) throws Throwable {
        y.INSTANCE.runOnUiThread(new f());
        d0 d0Var = new d0(Sdk$SDKMetric.b.INLINE_INSTALL_STATUS);
        d0Var.setValue(2L);
        com.vungle.ads.g gVar = com.vungle.ads.g.INSTANCE;
        gVar.logMetric$vungle_ads_release(d0Var, getLogEntry(), str);
        gVar.logError$vungle_ads_release(Sdk$SDKError.b.INLINE_INSTALL_ERROR, String.valueOf(str), getLogEntry());
    }

    static /* synthetic */ void logInlineInstallFailure$default(g gVar, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            str = null;
        }
        gVar.logInlineInstallFailure(str);
    }

    public static /* synthetic */ void logInlineInstallSuccess$vungle_ads_release$default(g gVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        gVar.logInlineInstallSuccess$vungle_ads_release(str);
    }

    private final void makeBusError(VungleError vungleError) {
        com.vungle.ads.internal.presenter.a aVar = this.bus;
        if (aVar != null) {
            aVar.onError(vungleError, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prepare$lambda-15, reason: not valid java name */
    public static final void m125prepare$lambda15(g this$0) {
        s.h(this$0, "this$0");
        this$0.backEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m126processCommand$lambda11(g this$0) {
        s.h(this$0, "this$0");
        List list = null;
        CommonRequestBody.AdSizeParam bVar = null;
        com.vungle.ads.internal.network.a aVarRi = this$0.getVungleApiClient().ri(new CommonRequestBody.RequestParam(list, bVar, this$0.adStartTime, this$0.advertisement.advAppId(), this$0.placement.getReferenceId(), this$0.userId, (CommonRequestBody.CSBParam) null, 67, (DefaultConstructorMarker) null));
        if (aVarRi != null) {
            aVarRi.enqueue(this$0.new h());
            return;
        }
        q.Companion.e(TAG, "Invalid ri call.");
        new NetworkUnreachable("Error RI API for placement: " + this$0.placement.getReferenceId()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final void reportErrorAndCloseAd(VungleError vungleError) {
        vungleError.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        makeBusError(vungleError);
        closeView();
    }

    private final void sendAdCloseEvent() {
        Long l10 = this.adStartTime;
        if (l10 != null) {
            List<String> tpatUrls = this.advertisement.getTpatUrls(com.vungle.ads.internal.f.AD_CLOSE, String.valueOf(System.currentTimeMillis() - l10.longValue()), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.i.sendTpat$default(getTpatSender(), new com.vungle.ads.internal.network.g.a((String) it.next()).tpatKey(com.vungle.ads.internal.f.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    private final void triggerEventMetricForTpat(String str) throws Throwable {
        Sdk$SDKMetric.b bVar = eventMap.get(str);
        if (bVar != null) {
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, new d0(bVar), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final fl.q checkInlineInstallIntent$vungle_ads_release(Intent intent) {
        s.h(intent, "intent");
        ComponentName componentNameResolveActivity = intent.resolveActivity(this.adWidget.getContext().getPackageManager());
        String packageName = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : null;
        return new fl.q(Boolean.valueOf(s.c(packageName, "com.android.vending")), packageName);
    }

    public final void detach(int i10) {
        com.vungle.ads.internal.presenter.a aVar;
        q.Companion.d(TAG, "detach()");
        boolean z10 = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z10 && z11 && !this.isDestroying.getAndSet(true) && (aVar = this.bus) != null) {
            aVar.onNext(TtmlNode.END, null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop());
    }

    public final Long getAdStartTime$vungle_ads_release() {
        return this.adStartTime;
    }

    public final boolean getBackEnabled$vungle_ads_release() {
        return this.backEnabled;
    }

    public final com.vungle.ads.internal.presenter.a getBus() {
        return this.bus;
    }

    public final com.vungle.ads.internal.d getClickCoordinateTracker$vungle_ads_release() {
        return (com.vungle.ads.internal.d) this.clickCoordinateTracker$delegate.getValue();
    }

    public final long getLastUserInteractionTimestamp$vungle_ads_release() {
        return this.lastUserInteractionTimestamp;
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    public final long getVideoLength$vungle_ads_release() {
        return this.videoLength;
    }

    public final Long getViewStatus() {
        return !this.cp0Fired ? 1L : null;
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final AtomicBoolean isDestroying$vungle_ads_release() {
        return this.isDestroying;
    }

    public final void logInlineInstallSuccess$vungle_ads_release(String str) {
        d0 d0Var = new d0(Sdk$SDKMetric.b.INLINE_INSTALL_STATUS);
        d0Var.setValue(1L);
        com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(d0Var, getLogEntry(), str);
    }

    @Override // com.vungle.ads.internal.ui.view.o.b
    public void onReceivedError(String errorDesc, boolean z10) {
        s.h(errorDesc, "errorDesc");
        if (z10) {
            reportErrorAndCloseAd(new WebViewError(errorDesc));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.o.b
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new WebViewRenderProcessUnresponsive("fatal=true"), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            q.Companion.d(TAG, "user interaction");
            this.lastUserInteractionTimestamp = System.currentTimeMillis();
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.o.b
    public boolean onWebRenderingProcessGone(WebView webView, Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        handleWebViewException$default(this, new WebViewRenderingProcessGone("didCrash=" + zBooleanValue), zBooleanValue, null, 4, null);
        return true;
    }

    public final void prepare() {
        int i10;
        String alertTitleText;
        String alertBodyText;
        String alertContinueButtonText;
        String alertCloseButtonText;
        VungleError vungleErrorLoadMraidAd;
        int settings;
        this.isDestroying.set(false);
        com.vungle.ads.b adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        com.vungle.ads.b adConfig2 = this.advertisement.getAdConfig();
        Integer numValueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            i10 = 7;
        } else {
            i10 = (numValueOf != null && numValueOf.intValue() == 1) ? 6 : 4;
        }
        this.adWidget.setOrientation(i10);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        this.vungleWebClient.setAdVisibility(false);
        if (!this.advertisement.usePreloading() && (vungleErrorLoadMraidAd = loadMraidAd()) != null) {
            reportErrorAndCloseAd(vungleErrorLoadMraidAd);
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        com.vungle.ads.internal.presenter.n nVar = this.presenterDelegate;
        this.userId = nVar != null ? nVar.getUserId() : null;
        com.vungle.ads.internal.presenter.n nVar2 = this.presenterDelegate;
        if (nVar2 == null || (alertTitleText = nVar2.getAlertTitleText()) == null) {
            alertTitleText = "";
        }
        com.vungle.ads.internal.presenter.n nVar3 = this.presenterDelegate;
        if (nVar3 == null || (alertBodyText = nVar3.getAlertBodyText()) == null) {
            alertBodyText = "";
        }
        com.vungle.ads.internal.presenter.n nVar4 = this.presenterDelegate;
        if (nVar4 == null || (alertContinueButtonText = nVar4.getAlertContinueButtonText()) == null) {
            alertContinueButtonText = "";
        }
        com.vungle.ads.internal.presenter.n nVar5 = this.presenterDelegate;
        if (nVar5 == null || (alertCloseButtonText = nVar5.getAlertCloseButtonText()) == null) {
            alertCloseButtonText = "";
        }
        this.advertisement.setIncentivizedText(alertTitleText, alertBodyText, alertContinueButtonText, alertCloseButtonText);
        com.vungle.ads.internal.e eVar = com.vungle.ads.internal.e.INSTANCE;
        boolean z10 = eVar.getGDPRIsCountryDataProtected() && s.c("unknown", yj.c.INSTANCE.getConsentStatus());
        this.vungleWebClient.setConsentStatus(z10, eVar.getGDPRConsentTitle(), eVar.getGDPRConsentMessage(), eVar.getGDPRButtonAccept(), eVar.getGDPRButtonDeny());
        if (z10) {
            yj.c.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new Runnable() { // from class: com.vungle.ads.internal.presenter.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.m125prepare$lambda15(this.f35848a);
                }
            }, showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        com.vungle.ads.internal.presenter.a aVar = this.bus;
        if (aVar != null) {
            aVar.onNext("start", null, this.placement.getReferenceId());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:259:0x067f  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0255, code lost:
    
        r12 = r0.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0259, code lost:
    
        r0 = com.vungle.ads.internal.util.o.INSTANCE.getContentStringValue(r27, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0265, code lost:
    
        if (com.vungle.ads.internal.util.j.INSTANCE.isValidUrl(r0) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0267, code lost:
    
        new com.vungle.ads.InvalidCTAUrl("Invalid CTA Url (" + r0 + ')').setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0291, code lost:
    
        if (shouldBlockAutoRedirect$vungle_ads_release() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0293, code lost:
    
        r25.lastUserInteractionTimestamp = 0;
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, new com.vungle.ads.d0(com.vungle.ads.internal.protos.Sdk$SDKMetric.b.BANNER_AUTO_REDIRECT), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ad, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ae, code lost:
    
        r25.lastUserInteractionTimestamp = 0;
        r19 = com.vungle.ads.internal.util.h.INSTANCE;
        r2 = r25.adWidget.getContext();
        kotlin.jvm.internal.s.g(r2, "adWidget.context");
        r0 = r19.launch$vungle_ads_release(r12, r0, r2, getLogEntry(), createDeeplinkCallback(r12));
        r2 = r25.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d1, code lost:
    
        if (r2 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d3, code lost:
    
        r2.onNext(com.vungle.ads.internal.presenter.g.OPEN, "adClick", r25.placement.getReferenceId());
        r2 = fl.g0.f38750a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02de, code lost:
    
        if (r0 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02e0, code lost:
    
        r0 = r25.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02e2, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02e4, code lost:
    
        r0.onNext(com.vungle.ads.internal.presenter.g.OPEN, "adLeftApplication", r25.placement.getReferenceId());
        r0 = fl.g0.f38750a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02ef, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0234, code lost:
    
        if (r26.equals(com.vungle.ads.internal.presenter.g.OPEN) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0249, code lost:
    
        if (r26.equals(com.vungle.ads.internal.presenter.g.OPEN_NON_MRAID) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024d, code lost:
    
        r0 = r25.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0253, code lost:
    
        if (r0 == null) goto L101;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
    @Override // com.vungle.ads.internal.ui.view.o.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean processCommand(java.lang.String r26, kotlinx.serialization.json.d0 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.g.processCommand(java.lang.String, kotlinx.serialization.json.d0):boolean");
    }

    public final void setAdStartTime$vungle_ads_release(Long l10) {
        this.adStartTime = l10;
    }

    public final void setAdVisibility(boolean z10) {
        this.vungleWebClient.setAdVisibility(z10);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z10) {
        this.backEnabled = z10;
    }

    public final void setBus(com.vungle.ads.internal.presenter.a aVar) {
        this.bus = aVar;
    }

    public final void setEventListener(com.vungle.ads.internal.presenter.a aVar) {
        this.bus = aVar;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long j10) {
        this.lastUserInteractionTimestamp = j10;
    }

    public final void setOpenActivityDelegate$vungle_ads_release(com.vungle.ads.internal.presenter.l lVar) {
        this.appStoreDelegate = lVar;
    }

    public final void setPresenterDelegate$vungle_ads_release(com.vungle.ads.internal.presenter.n nVar) {
        this.presenterDelegate = nVar;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void setVideoLength$vungle_ads_release(long j10) {
        this.videoLength = j10;
    }

    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        com.vungle.ads.internal.e eVar = com.vungle.ads.internal.e.INSTANCE;
        if (eVar.allowAutoRedirects()) {
            return false;
        }
        return this.lastUserInteractionTimestamp == 0 || System.currentTimeMillis() - this.lastUserInteractionTimestamp > eVar.afterClickDuration();
    }

    public final void start() {
        q.Companion.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
    }

    public final void stop() {
        q.Companion.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }
}
