package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.VungleError;
import com.vungle.ads.f0;
import com.vungle.ads.internal.util.y;
import fl.g0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends com.vungle.ads.i {
    private final com.vungle.ads.internal.presenter.c adPlayCallback;
    private final f0 adSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String placementId, f0 adSize, com.vungle.ads.b adConfig) {
        super(context, placementId, adConfig);
        s.h(context, "context");
        s.h(placementId, "placementId");
        s.h(adSize, "adSize");
        s.h(adConfig, "adConfig");
        this.adSize = adSize;
        com.vungle.ads.internal.a adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        s.f(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((c) adInternal$vungle_ads_release).wrapCallback$vungle_ads_release(new a());
    }

    public final com.vungle.ads.internal.presenter.c getAdPlayCallback$vungle_ads_release() {
        return this.adPlayCallback;
    }

    public final f0 getAdViewSize() {
        com.vungle.ads.internal.a adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        s.f(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        f0 updatedAdSize$vungle_ads_release = ((c) adInternal$vungle_ads_release).getUpdatedAdSize$vungle_ads_release();
        return updatedAdSize$vungle_ads_release == null ? this.adSize : updatedAdSize$vungle_ads_release;
    }

    @Override // com.vungle.ads.i
    public c constructAdInternal$vungle_ads_release(Context context) {
        s.h(context, "context");
        return new c(context, this.adSize);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements com.vungle.ads.internal.presenter.b {

        /* JADX INFO: renamed from: com.vungle.ads.internal.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0496a extends t implements tl.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0496a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m74invoke();
                return g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m74invoke() {
                com.vungle.ads.j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdClicked(this.this$0);
                }
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0497b extends t implements tl.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0497b(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m75invoke();
                return g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m75invoke() {
                com.vungle.ads.j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdEnd(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class c extends t implements tl.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m76invoke();
                return g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m76invoke() {
                com.vungle.ads.j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdImpression(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class d extends t implements tl.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m77invoke();
                return g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m77invoke() {
                com.vungle.ads.j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdLeftApplication(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class e extends t implements tl.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m78invoke();
                return g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m78invoke() {
                com.vungle.ads.j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdStart(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class f extends t implements tl.a {
            final /* synthetic */ VungleError $error;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(b bVar, VungleError vungleError) {
                super(0);
                this.this$0 = bVar;
                this.$error = vungleError;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m79invoke();
                return g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m79invoke() {
                com.vungle.ads.j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToPlay(this.this$0, this.$error);
                }
            }
        }

        a() {
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdClick(String str) {
            y.INSTANCE.runOnUiThread(new C0496a(b.this));
            b.this.getDisplayToClickMetric$vungle_ads_release().markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, b.this.getDisplayToClickMetric$vungle_ads_release(), b.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdEnd(String str) {
            y.INSTANCE.runOnUiThread(new C0497b(b.this));
            b.this.getShowToCloseMetric$vungle_ads_release().markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, b.this.getShowToCloseMetric$vungle_ads_release(), b.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdImpression(String str) {
            y.INSTANCE.runOnUiThread(new c(b.this));
            b.this.getPresentToDisplayMetric$vungle_ads_release().markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, b.this.getPresentToDisplayMetric$vungle_ads_release(), b.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            b.this.getDisplayToClickMetric$vungle_ads_release().markStart();
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdLeftApplication(String str) throws Throwable {
            y.INSTANCE.runOnUiThread(new d(b.this));
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, b.this.getLeaveApplicationMetric$vungle_ads_release(), b.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdStart(String str) {
            b.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
            b.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, b.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), b.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            b.this.getPresentToDisplayMetric$vungle_ads_release().markStart();
            y.INSTANCE.runOnUiThread(new e(b.this));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onFailure(VungleError error) {
            s.h(error, "error");
            y.INSTANCE.runOnUiThread(new f(b.this, error));
            b.this.getShowToFailMetric$vungle_ads_release().markEnd();
            com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(b.this.getShowToFailMetric$vungle_ads_release(), b.this.getLogEntry$vungle_ads_release(), error.getCode() + '-' + error.getErrorMessage());
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdRewarded(String str) {
        }
    }
}
