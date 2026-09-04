package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.ui.view.NativeAdOptionsView;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class v extends i {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final a Companion = new a(null);
    private static final String TAG = "NativeAd";
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private MediaView adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private NativeAdOptionsView adOptionsView;
    private final b adPlayCallback;
    private FrameLayout adRootView;
    private Collection<? extends View> clickableViews;
    private final AtomicBoolean destroyed;
    private int displayCount;
    private final com.vungle.ads.internal.l nativeAdInternal;
    private final e0 nativeDisplayDurationMetric;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private v(Context context, String str, com.vungle.ads.b bVar) {
        super(context, str, bVar);
        this.adOptionsPosition = 1;
        com.vungle.ads.internal.a adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.s.f(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.NativeAdInternal");
        this.nativeAdInternal = (com.vungle.ads.internal.l) adInternal$vungle_ads_release;
        this.nativeDisplayDurationMetric = new e0(Sdk$SDKMetric.b.NATIVE_AD_DISPLAY_DURATION);
        this.destroyed = new AtomicBoolean(false);
        this.adPlayCallback = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerViewForInteraction$lambda-1, reason: not valid java name */
    public static final void m189registerViewForInteraction$lambda1(v this$0, View view) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.nativeAdInternal.onPrivacyIconClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerViewForInteraction$lambda-3$lambda-2, reason: not valid java name */
    public static final void m190registerViewForInteraction$lambda3$lambda2(v this$0, View view) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.nativeAdInternal.openCallToActionUrlByUser();
    }

    public final String getAdBodyText() {
        return this.nativeAdInternal.getAdBodyText();
    }

    public final String getAdCallToActionText() {
        return this.nativeAdInternal.getAdCallToActionText();
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        return this.nativeAdInternal.getAdSponsoredText();
    }

    public final Double getAdStarRating() {
        return this.nativeAdInternal.getAdStarRating();
    }

    public final String getAdTitle() {
        return this.nativeAdInternal.getAdTitle();
    }

    public final String getAppIcon() {
        return this.nativeAdInternal.getAppIcon();
    }

    public final float getMediaAspectRatio() {
        return this.nativeAdInternal.getMediaAspectRatio();
    }

    public final MediaView getMediaView() {
        return this.adContentView;
    }

    public final e0 getNativeDisplayDurationMetric$vungle_ads_release() {
        return this.nativeDisplayDurationMetric;
    }

    public final zj.d getVideoOptions() {
        return this.nativeAdInternal.getVideoOptions$vungle_ads_release();
    }

    public final boolean hasCallToAction() {
        return this.nativeAdInternal.hasCallToAction();
    }

    public final boolean hasVideoContent() {
        return this.nativeAdInternal.hasVideoContent();
    }

    public final void performCTA() {
        this.nativeAdInternal.openCallToActionUrl();
    }

    public final void registerViewForInteraction(FrameLayout rootView, MediaView mediaView, ImageView imageView, Collection<? extends View> collection) throws Throwable {
        kotlin.jvm.internal.s.h(rootView, "rootView");
        kotlin.jvm.internal.s.h(mediaView, "mediaView");
        com.vungle.ads.internal.util.q.a aVar = com.vungle.ads.internal.util.q.Companion;
        aVar.w(TAG, "registerViewForInteraction " + hashCode());
        g gVar = g.INSTANCE;
        g.logMetric$vungle_ads_release$default(gVar, new d0(Sdk$SDKMetric.b.PLAY_AD_API), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.displayCount = this.displayCount + 1;
        this.nativeDisplayDurationMetric.markStart();
        getResponseToShowMetric$vungle_ads_release().markEnd();
        g.logMetric$vungle_ads_release$default(gVar, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        getShowToFailMetric$vungle_ads_release().markStart();
        getShowToCloseMetric$vungle_ads_release().markStart();
        if (getAdInternal$vungle_ads_release().isAdPlaying$vungle_ads_release()) {
            if (kotlin.jvm.internal.s.c(this.adRootView, rootView)) {
                aVar.d(TAG, "no-op when re-play it on the same root view");
                return;
            }
            unregisterView();
        }
        this.destroyed.set(false);
        VungleError vungleErrorCanPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            aVar.w(TAG, "registerViewForInteraction can NOT play. " + hashCode() + ' ' + vungleErrorCanPlayAd);
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.EnumC0494a.ERROR);
            }
            j adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        this.adRootView = rootView;
        this.adContentView = mediaView;
        this.adIconView = imageView;
        this.clickableViews = collection;
        this.nativeAdInternal.initPresenter(rootView, this.adPlayCallback);
        if (this.adOptionsView == null) {
            this.adOptionsView = new NativeAdOptionsView(getContext());
        }
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v.m189registerViewForInteraction$lambda1(this.f35897a, view);
                }
            });
        }
        if (collection == null) {
            collection = gl.r.e(mediaView);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v.m190registerViewForInteraction$lambda3$lambda2(this.f35898a, view);
                }
            });
        }
        NativeAdOptionsView nativeAdOptionsView2 = this.adOptionsView;
        if (nativeAdOptionsView2 != null) {
            nativeAdOptionsView2.renderTo(rootView, this.adOptionsPosition);
        }
        this.nativeAdInternal.trySetTouchListener(mediaView);
        mediaView.present$vungle_ads_release(this.nativeAdInternal);
        this.nativeAdInternal.displayAppIcon(imageView);
        com.vungle.ads.internal.l lVar = this.nativeAdInternal;
        NativeAdOptionsView nativeAdOptionsView3 = this.adOptionsView;
        lVar.displayPrivacyIcon(nativeAdOptionsView3 != null ? nativeAdOptionsView3.getPrivacyIcon$vungle_ads_release() : null);
        this.nativeAdInternal.showWatermark(rootView, getAdConfig().getWatermark$vungle_ads_release());
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        g.logMetric$vungle_ads_release$default(g.INSTANCE, getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
    }

    public final void setAdOptionsPosition(int i10) {
        this.adOptionsPosition = i10;
    }

    public final void unregisterView() throws Throwable {
        com.vungle.ads.internal.util.q.Companion.w(TAG, "unregisterView  " + hashCode());
        if (this.destroyed.getAndSet(true)) {
            return;
        }
        this.nativeDisplayDurationMetric.markEnd();
        this.nativeDisplayDurationMetric.setMeta(String.valueOf(this.displayCount));
        g.logMetric$vungle_ads_release$default(g.INSTANCE, this.nativeDisplayDurationMetric, getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.clickableViews = null;
        this.adRootView = null;
        MediaView mediaView = this.adContentView;
        if (mediaView != null) {
            mediaView.destroy$vungle_ads_release();
        }
        this.adContentView = null;
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.destroy();
        }
        this.adOptionsView = null;
        this.nativeAdInternal.destroy();
        try {
            ImageView imageView = this.adIconView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e10) {
            com.vungle.ads.internal.util.q.Companion.w(TAG, "error msg: " + e10.getLocalizedMessage());
        }
        ImageView imageView2 = this.adIconView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.adIconView = null;
    }

    @Override // com.vungle.ads.i
    public com.vungle.ads.internal.l constructAdInternal$vungle_ads_release(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        return new com.vungle.ads.internal.l(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Context context, String placementId) {
        this(context, placementId, new com.vungle.ads.b());
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(placementId, "placementId");
    }

    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements com.vungle.ads.internal.presenter.b {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ v this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar) {
                super(0);
                this.this$0 = vVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m191invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m191invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdClicked(this.this$0);
                }
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.v$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0538b extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ v this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0538b(v vVar) {
                super(0);
                this.this$0 = vVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m192invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m192invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdEnd(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class c extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ v this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(v vVar) {
                super(0);
                this.this$0 = vVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m193invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m193invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdImpression(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class d extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ v this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(v vVar) {
                super(0);
                this.this$0 = vVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m194invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m194invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdLeftApplication(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class e extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ v this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(v vVar) {
                super(0);
                this.this$0 = vVar;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m195invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m195invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdStart(this.this$0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class f extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ VungleError $error;
            final /* synthetic */ v this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(v vVar, VungleError vungleError) {
                super(0);
                this.this$0 = vVar;
                this.$error = vungleError;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m196invoke();
                return fl.g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m196invoke() {
                j adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToPlay(this.this$0, this.$error);
                }
            }
        }

        b() {
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdClick(String str) {
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new a(v.this));
            v.this.getDisplayToClickMetric$vungle_ads_release().markEnd();
            g.logMetric$vungle_ads_release$default(g.INSTANCE, v.this.getDisplayToClickMetric$vungle_ads_release(), v.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdEnd(String str) {
            if (v.this.getAdInternal$vungle_ads_release().isAdPlaying$vungle_ads_release()) {
                v.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.EnumC0494a.READY);
            }
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new C0538b(v.this));
            v.this.getShowToCloseMetric$vungle_ads_release().markEnd();
            g.logMetric$vungle_ads_release$default(g.INSTANCE, v.this.getShowToCloseMetric$vungle_ads_release(), v.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdImpression(String str) {
            v.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.EnumC0494a.IMPRESSION_LOGGED);
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new c(v.this));
            v.this.getPresentToDisplayMetric$vungle_ads_release().markEnd();
            g.logMetric$vungle_ads_release$default(g.INSTANCE, v.this.getPresentToDisplayMetric$vungle_ads_release(), v.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            v.this.getDisplayToClickMetric$vungle_ads_release().markStart();
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdLeftApplication(String str) throws Throwable {
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new d(v.this));
            g.logMetric$vungle_ads_release$default(g.INSTANCE, v.this.getLeaveApplicationMetric$vungle_ads_release(), v.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdStart(String str) {
            v.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.EnumC0494a.PLAYING);
            v.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
            v.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
            g.logMetric$vungle_ads_release$default(g.INSTANCE, v.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), v.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            v.this.getPresentToDisplayMetric$vungle_ads_release().markStart();
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new e(v.this));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onFailure(VungleError error) {
            kotlin.jvm.internal.s.h(error, "error");
            v.this.getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.a.EnumC0494a.ERROR);
            com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new f(v.this, error));
            v.this.getShowToFailMetric$vungle_ads_release().markEnd();
            g.INSTANCE.logMetric$vungle_ads_release(v.this.getShowToFailMetric$vungle_ads_release(), v.this.getLogEntry$vungle_ads_release(), error.getCode() + '-' + error.getErrorMessage());
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdRewarded(String str) {
        }
    }
}
