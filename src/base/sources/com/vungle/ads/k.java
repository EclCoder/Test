package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.signals.SignaledAd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k extends i implements n {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements com.vungle.ads.internal.presenter.b {

        /* JADX INFO: renamed from: com.vungle.ads.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0537a extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0537a(k kVar) {
                super(0);
                this.this$0 = kVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m182invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m182invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdClicked(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class b extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k kVar) {
                super(0);
                this.this$0 = kVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m183invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m183invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdEnd(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class c extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(k kVar) {
                super(0);
                this.this$0 = kVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m184invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m184invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdImpression(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class d extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(k kVar) {
                super(0);
                this.this$0 = kVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m185invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m185invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdLeftApplication(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class e extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(k kVar) {
                super(0);
                this.this$0 = kVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m186invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m186invoke() {
                j adListener = this.this$0.getAdListener();
                c0 c0Var = adListener instanceof c0 ? (c0) adListener : null;
                if (c0Var != null) {
                    c0Var.onAdRewarded(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class f extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(k kVar) {
                super(0);
                this.this$0 = kVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m187invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m187invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdStart(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class g extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ VungleError $error;
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(k kVar, VungleError vungleError) {
                super(0);
                this.this$0 = kVar;
                this.$error = vungleError;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m188invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m188invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToPlay(this.this$0, this.$error);
                }
            }
        }

        a() {
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdClick(String str) {
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new C0537a(k.this));
            k.this.getDisplayToClickMetric$vungle_ads_release().markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, k.this.getDisplayToClickMetric$vungle_ads_release(), k.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdEnd(String str) {
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new b(k.this));
            k.this.getShowToCloseMetric$vungle_ads_release().markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, k.this.getShowToCloseMetric$vungle_ads_release(), k.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdImpression(String str) {
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new c(k.this));
            k.this.getPresentToDisplayMetric$vungle_ads_release().markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, k.this.getPresentToDisplayMetric$vungle_ads_release(), k.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            k.this.getDisplayToClickMetric$vungle_ads_release().markStart();
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdLeftApplication(String str) throws Throwable {
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new d(k.this));
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, k.this.getLeaveApplicationMetric$vungle_ads_release(), k.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdRewarded(String str) throws Throwable {
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new e(k.this));
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, k.this.getRewardedMetric$vungle_ads_release(), k.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdStart(String str) {
            k.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
            k.this.getPresentToDisplayMetric$vungle_ads_release().markStart();
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new f(k.this));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onFailure(VungleError error) {
            kotlin.jvm.internal.s.h(error, "error");
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new g(k.this, error));
            k.this.getShowToFailMetric$vungle_ads_release().markEnd();
            com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(k.this.getShowToFailMetric$vungle_ads_release(), k.this.getLogEntry$vungle_ads_release(), error.getCode() + '-' + error.getErrorMessage());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, String placementId, b adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(placementId, "placementId");
        kotlin.jvm.internal.s.h(adConfig, "adConfig");
    }

    private final com.vungle.ads.internal.g getFullscreenAdInternal() {
        com.vungle.ads.internal.a adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.s.f(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.FullscreenAdInternal");
        return (com.vungle.ads.internal.g) adInternal$vungle_ads_release;
    }

    @Override // com.vungle.ads.i, com.vungle.ads.a
    public void load(String str) {
        setSignaledAd$vungle_ads_release(getSignalManager$vungle_ads_release().getSignaledAd(getPlacementId()));
        super.load(str);
    }

    @Override // com.vungle.ads.i
    public void onAdLoaded$vungle_ads_release(com.vungle.ads.internal.model.b advertisement) {
        kotlin.jvm.internal.s.h(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        SignaledAd signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release == null) {
            return;
        }
        signaledAd$vungle_ads_release.setAdAvailabilityCallbackTime(System.currentTimeMillis());
    }

    @Override // com.vungle.ads.n
    public void play(Context context) {
        g gVar = g.INSTANCE;
        g.logMetric$vungle_ads_release$default(gVar, new d0(Sdk$SDKMetric.b.PLAY_AD_API), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        g.logMetric$vungle_ads_release$default(gVar, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getShowToFailMetric$vungle_ads_release().markStart();
        getShowToCloseMetric$vungle_ads_release().markStart();
        SignaledAd signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.setPlayAdTime(System.currentTimeMillis());
            signaledAd$vungle_ads_release.calculateTimeBetweenAdAvailabilityAndPlayAd();
            getSignalManager$vungle_ads_release().registerSignaledAd(context, signaledAd$vungle_ads_release);
        }
        getFullscreenAdInternal().play(context, new a());
    }
}
