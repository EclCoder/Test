package com.vungle.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h0 extends RelativeLayout implements VungleAdType {
    public static final b Companion = new b(null);
    private static final String TAG = "VungleBannerView";
    private com.vungle.ads.h adListener;
    private final f0 adSize;
    private final com.vungle.ads.internal.b adViewImpl;
    private com.vungle.ads.internal.ui.view.j adWidget;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private com.vungle.ads.internal.ui.j imageView;
    private final fl.k impressionTracker$delegate;
    private final AtomicBoolean isAdAttachedToWindow;
    private final AtomicBoolean isAdDownloaded;
    private final AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private boolean isReceiverRegistered;
    private final String placementId;
    private com.vungle.ads.internal.presenter.g presenter;
    private final AtomicBoolean presenterStarted;
    private final com.vungle.ads.internal.util.u ringerModeReceiver;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements com.vungle.ads.h {
        a() {
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdClicked(com.vungle.ads.i baseAd) {
            kotlin.jvm.internal.s.h(baseAd, "baseAd");
            com.vungle.ads.h adListener = h0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdClicked(baseAd);
            }
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdEnd(com.vungle.ads.i baseAd) {
            kotlin.jvm.internal.s.h(baseAd, "baseAd");
            com.vungle.ads.h adListener = h0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdEnd(baseAd);
            }
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdFailedToLoad(com.vungle.ads.i baseAd, VungleError adError) {
            kotlin.jvm.internal.s.h(baseAd, "baseAd");
            kotlin.jvm.internal.s.h(adError, "adError");
            com.vungle.ads.h adListener = h0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToLoad(baseAd, adError);
            }
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdFailedToPlay(com.vungle.ads.i baseAd, VungleError adError) {
            kotlin.jvm.internal.s.h(baseAd, "baseAd");
            kotlin.jvm.internal.s.h(adError, "adError");
            com.vungle.ads.h adListener = h0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(baseAd, adError);
            }
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdImpression(com.vungle.ads.i baseAd) {
            kotlin.jvm.internal.s.h(baseAd, "baseAd");
            com.vungle.ads.h adListener = h0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdImpression(baseAd);
            }
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdLeftApplication(com.vungle.ads.i baseAd) {
            kotlin.jvm.internal.s.h(baseAd, "baseAd");
            com.vungle.ads.h adListener = h0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdLeftApplication(baseAd);
            }
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdLoaded(com.vungle.ads.i baseAd) throws Throwable {
            kotlin.jvm.internal.s.h(baseAd, "baseAd");
            h0.this.onBannerAdLoaded(baseAd);
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdStart(com.vungle.ads.i baseAd) {
            kotlin.jvm.internal.s.h(baseAd, "baseAd");
            com.vungle.ads.h adListener = h0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdStart(baseAd);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.jvm.internal.t implements tl.a {
        c() {
            super(0);
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m63invoke();
            return fl.g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m63invoke() {
            h0.this.finishAdInternal(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.jvm.internal.t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // tl.a
        public final com.vungle.ads.internal.i invoke() {
            return new com.vungle.ads.internal.i(this.$context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements com.vungle.ads.internal.i.b {
        e() {
        }

        @Override // com.vungle.ads.internal.i.b
        public void onImpression(View view) throws Throwable {
            com.vungle.ads.internal.util.q.Companion.d(h0.TAG, "ImpressionTracker checked the banner view become visible.");
            h0.this.isOnImpressionCalled = true;
            h0.this.logViewVisibleOnPlay();
            h0.this.checkHardwareAcceleration();
            com.vungle.ads.internal.presenter.g gVar = h0.this.presenter;
            if (gVar != null) {
                gVar.start();
            }
        }

        @Override // com.vungle.ads.internal.i.b
        public void onViewInvisible(View view) throws Throwable {
            h0.this.logViewInvisibleOnPlay();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends kotlin.jvm.internal.t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends kotlin.jvm.internal.t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.d$b, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.omsdk.d.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.omsdk.d.b.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h extends kotlin.jvm.internal.t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.f, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.platform.f invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.platform.f.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i implements com.vungle.ads.internal.ui.view.j.a {
        i() {
        }

        @Override // com.vungle.ads.internal.ui.view.j.a
        public void close() {
            h0.this.finishAdInternal(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class j implements com.vungle.ads.internal.ui.view.j.d {
        j() {
        }

        @Override // com.vungle.ads.internal.ui.view.j.d
        public boolean onTouch(MotionEvent motionEvent) {
            com.vungle.ads.internal.presenter.g gVar = h0.this.presenter;
            if (gVar == null) {
                return false;
            }
            gVar.onViewTouched(motionEvent);
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, String placementId, f0 adSize) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(placementId, "placementId");
        kotlin.jvm.internal.s.h(adSize, "adSize");
        this.placementId = placementId;
        this.adSize = adSize;
        this.ringerModeReceiver = new com.vungle.ads.internal.util.u();
        com.vungle.ads.internal.b bVar = new com.vungle.ads.internal.b(context, placementId, adSize, new com.vungle.ads.b());
        this.adViewImpl = bVar;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.isAdDownloaded = new AtomicBoolean(false);
        this.isAdAttachedToWindow = new AtomicBoolean(false);
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.impressionTracker$delegate = fl.l.b(new d(context));
        bVar.setAdListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHardwareAcceleration() throws Throwable {
        com.vungle.ads.internal.util.q.Companion.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, Sdk$SDKMetric.b.HARDWARE_ACCELERATE_DISABLED, 0L, this.adViewImpl.getLogEntry$vungle_ads_release(), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdInternal(boolean z10) {
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        int i10 = (z10 ? 4 : 0) | 2;
        com.vungle.ads.internal.presenter.g gVar = this.presenter;
        if (gVar != null) {
            gVar.stop();
        }
        com.vungle.ads.internal.presenter.g gVar2 = this.presenter;
        if (gVar2 != null) {
            gVar2.detach(i10);
        }
        getImpressionTracker().destroy();
        try {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (Exception e10) {
            com.vungle.ads.internal.util.q.Companion.d(TAG, "Removing webView error: " + e10);
        }
    }

    private final com.vungle.ads.internal.i getImpressionTracker() {
        return (com.vungle.ads.internal.i) this.impressionTracker$delegate.getValue();
    }

    public static /* synthetic */ void load$default(h0 h0Var, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            str = null;
        }
        h0Var.load(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewInvisibleOnPlay() throws Throwable {
        if (this.isInvisibleLogged.getAndSet(true)) {
            return;
        }
        com.vungle.ads.internal.util.q.Companion.d(TAG, "ImpressionTracker checked the banner view invisible on play, log AD_VISIBILITY_INVISIBLE. " + hashCode());
        com.vungle.ads.g gVar = com.vungle.ads.g.INSTANCE;
        d0 d0Var = new d0(Sdk$SDKMetric.b.AD_VISIBILITY);
        d0Var.setValue(1L);
        com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, d0Var, this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() throws Throwable {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        com.vungle.ads.g gVar = com.vungle.ads.g.INSTANCE;
        d0 d0Var = new d0(Sdk$SDKMetric.b.AD_VISIBILITY);
        d0Var.setValue(Long.valueOf(j10));
        com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, d0Var, this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        com.vungle.ads.internal.util.q.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerAdLoaded(com.vungle.ads.i iVar) throws Throwable {
        com.vungle.ads.g gVar = com.vungle.ads.g.INSTANCE;
        com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, new d0(Sdk$SDKMetric.b.PLAY_AD_API), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.adViewImpl.getResponseToShowMetric$vungle_ads_release().markEnd();
        com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, this.adViewImpl.getResponseToShowMetric$vungle_ads_release(), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        this.adViewImpl.getShowToCloseMetric$vungle_ads_release().markStart();
        this.adViewImpl.getShowToFailMetric$vungle_ads_release().markStart();
        VungleError vungleErrorCanPlayAd = this.adViewImpl.getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (this.adViewImpl.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                this.adViewImpl.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.EnumC0494a.ERROR);
            }
            com.vungle.ads.h hVar = this.adListener;
            if (hVar != null) {
                hVar.onAdFailedToPlay(iVar, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        com.vungle.ads.internal.model.b advertisement = this.adViewImpl.getAdInternal$vungle_ads_release().getAdvertisement();
        Placement placement = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        if (advertisement == null || placement == null) {
            com.vungle.ads.h hVar2 = this.adListener;
            if (hVar2 != null) {
                hVar2.onAdFailedToPlay(iVar, new AdNotLoadedCantPlay("Ad or Placement is null").setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            return;
        }
        this.adViewImpl.getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
        try {
            willPresentAdView(advertisement, placement, getAdViewSize());
            this.isAdDownloaded.set(true);
            com.vungle.ads.h hVar3 = this.adListener;
            if (hVar3 != null) {
                hVar3.onAdLoaded(iVar);
            }
            renderAd();
        } catch (InstantiationException unused) {
        }
    }

    private final void renderAd() {
        if (this.destroyed.get()) {
            com.vungle.ads.internal.util.q.Companion.w(TAG, "renderAd() - destroyed");
            return;
        }
        if (!this.isAdDownloaded.get()) {
            com.vungle.ads.internal.util.q.Companion.d(TAG, "renderAd() - not ready: not downloaded.");
            return;
        }
        if (!this.isAdAttachedToWindow.get()) {
            com.vungle.ads.internal.util.q.Companion.d(TAG, "renderAd() - not ready: not attached.");
            return;
        }
        if (!this.presenterStarted.getAndSet(true)) {
            com.vungle.ads.internal.presenter.g gVar = this.presenter;
            if (gVar != null) {
                gVar.prepare();
            }
            getImpressionTracker().addView(this, new e());
        }
        com.vungle.ads.internal.ui.view.j jVar = this.adWidget;
        if (jVar != null && !kotlin.jvm.internal.s.c(jVar.getParent(), this)) {
            ViewParent parent = jVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(jVar);
            }
            addView(jVar, this.calculatedPixelWidth, this.calculatedPixelHeight);
        }
        com.vungle.ads.internal.ui.j jVar2 = this.imageView;
        if (jVar2 != null && !kotlin.jvm.internal.s.c(jVar2.getParent(), this)) {
            ViewParent parent2 = jVar2.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(jVar2);
            }
            addView(jVar2, this.calculatedPixelWidth, this.calculatedPixelHeight);
            jVar2.bringToFront();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    private final void setAdVisibility(boolean z10) {
        com.vungle.ads.internal.presenter.g gVar;
        if (!this.isOnImpressionCalled || this.destroyed.get() || (gVar = this.presenter) == null) {
            return;
        }
        gVar.setAdVisibility(z10);
    }

    private final void willPresentAdView(com.vungle.ads.internal.model.b bVar, Placement placement, f0 f0Var) throws InstantiationException {
        com.vungle.ads.internal.util.a0 a0Var = com.vungle.ads.internal.util.a0.INSTANCE;
        Context context = getContext();
        kotlin.jvm.internal.s.g(context, "context");
        this.calculatedPixelHeight = a0Var.dpToPixels(context, f0Var.getHeight());
        Context context2 = getContext();
        kotlin.jvm.internal.s.g(context2, "context");
        this.calculatedPixelWidth = a0Var.dpToPixels(context2, f0Var.getWidth());
        com.vungle.ads.internal.presenter.a aVar = new com.vungle.ads.internal.presenter.a(this.adViewImpl.getAdPlayCallback$vungle_ads_release(), this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement());
        try {
            Context context3 = getContext();
            kotlin.jvm.internal.s.g(context3, "context");
            com.vungle.ads.internal.ui.view.j jVar = new com.vungle.ads.internal.ui.view.j(context3, bVar.eventId());
            this.adWidget = jVar;
            jVar.setCloseDelegate(new i());
            jVar.setOnViewTouchListener(new j());
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            Context context4 = getContext();
            kotlin.jvm.internal.s.g(context4, "context");
            fl.o oVar = fl.o.SYNCHRONIZED;
            fl.k kVarA = fl.l.a(oVar, new f(context4));
            Context context5 = getContext();
            kotlin.jvm.internal.s.g(context5, "context");
            com.vungle.ads.internal.omsdk.d dVarMake = m61willPresentAdView$lambda6(fl.l.a(oVar, new g(context5))).make(bVar.omEnabled());
            Context context6 = getContext();
            kotlin.jvm.internal.s.g(context6, "context");
            fl.k kVarA2 = fl.l.a(oVar, new h(context6));
            com.vungle.ads.internal.ui.i orCreateWebViewClient = com.vungle.ads.internal.presenter.o.INSTANCE.getOrCreateWebViewClient(bVar, placement, m60willPresentAdView$lambda5(kVarA).getOffloadExecutor(), m62willPresentAdView$lambda7(kVarA2));
            this.ringerModeReceiver.setListener(orCreateWebViewClient);
            orCreateWebViewClient.setWebViewObserver(dVarMake);
            com.vungle.ads.internal.presenter.g gVar = new com.vungle.ads.internal.presenter.g(jVar, bVar, placement, orCreateWebViewClient, m60willPresentAdView$lambda5(kVarA).getJobExecutor(), dVarMake, m62willPresentAdView$lambda7(kVarA2));
            gVar.setEventListener(aVar);
            this.presenter = gVar;
            String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                Context context7 = getContext();
                kotlin.jvm.internal.s.g(context7, "context");
                this.imageView = new com.vungle.ads.internal.ui.j(context7, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e10) {
            aVar.onError(new AdCantPlayWithoutWebView(e10.getMessage()).setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.placementId);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m60willPresentAdView$lambda5(fl.k kVar) {
        return (com.vungle.ads.internal.executor.a) kVar.getValue();
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-6, reason: not valid java name */
    private static final com.vungle.ads.internal.omsdk.d.b m61willPresentAdView$lambda6(fl.k kVar) {
        return (com.vungle.ads.internal.omsdk.d.b) kVar.getValue();
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.f m62willPresentAdView$lambda7(fl.k kVar) {
        return (com.vungle.ads.internal.platform.f) kVar.getValue();
    }

    public final void finishAd() {
        com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new c());
    }

    public final com.vungle.ads.b getAdConfig() {
        return this.adViewImpl.getAdConfig();
    }

    public final com.vungle.ads.h getAdListener() {
        return this.adListener;
    }

    public final f0 getAdSize() {
        return this.adSize;
    }

    public final f0 getAdViewSize() {
        return this.adViewImpl.getAdViewSize();
    }

    @Override // com.vungle.ads.VungleAdType
    public String getAdapterAdFormat() {
        return this.adViewImpl.getAdapterAdFormat();
    }

    public final String getCreativeId() {
        return this.adViewImpl.getCreativeId();
    }

    public final String getEventId() {
        return this.adViewImpl.getEventId();
    }

    public final com.vungle.ads.internal.util.p getLogEntry$vungle_ads_release() {
        return this.adViewImpl.getLogEntry$vungle_ads_release();
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final void load() throws Throwable {
        this.adViewImpl.load();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.vungle.ads.internal.util.q.a aVar = com.vungle.ads.internal.util.q.Companion;
        aVar.d(TAG, "onAttachedToWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(true);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (!this.isReceiverRegistered) {
                    getContext().registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    this.isReceiverRegistered = true;
                    aVar.d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
                }
            } catch (Exception e10) {
                com.vungle.ads.internal.util.q.Companion.e(TAG, "registerReceiver error: " + e10.getLocalizedMessage());
            }
        }
        renderAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.vungle.ads.internal.util.q.Companion.d(TAG, "onDetachedFromWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(false);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (this.isReceiverRegistered) {
                    getContext().unregisterReceiver(this.ringerModeReceiver);
                    this.isReceiverRegistered = false;
                }
            } catch (Exception e10) {
                com.vungle.ads.internal.util.q.Companion.e(TAG, "unregisterReceiver error: " + e10.getLocalizedMessage());
            }
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        setAdVisibility(i10 == 0);
    }

    public final void setAdListener(com.vungle.ads.h hVar) {
        this.adListener = hVar;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(String str) {
        this.adViewImpl.setAdapterAdFormat(str);
    }

    public final void load(String str) throws Throwable {
        this.adViewImpl.load(str);
    }

    public final void load(i0 csbData) throws Throwable {
        kotlin.jvm.internal.s.h(csbData, "csbData");
        this.adViewImpl.load(csbData);
    }
}
