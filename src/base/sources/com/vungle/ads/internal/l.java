package com.vungle.ads.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.d0;
import com.vungle.ads.f0;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.y;
import fl.g0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l extends com.vungle.ads.internal.a implements com.vungle.ads.internal.presenter.k {
    public static final a Companion = new a(null);
    public static final int PLAYBACK_EVENT_CLICK = 8;
    public static final int PLAYBACK_EVENT_COMPLETE = 3;
    public static final int PLAYBACK_EVENT_IMPRESSION = 11;
    public static final int PLAYBACK_EVENT_MUTE = 9;
    public static final int PLAYBACK_EVENT_PAUSE = 2;
    public static final int PLAYBACK_EVENT_PLAY = 1;
    public static final int PLAYBACK_EVENT_QUARTILE_FIRST = 5;
    public static final int PLAYBACK_EVENT_QUARTILE_SECOND = 6;
    public static final int PLAYBACK_EVENT_QUARTILE_START = 4;
    public static final int PLAYBACK_EVENT_QUARTILE_THIRD = 7;
    public static final int PLAYBACK_EVENT_UNMUTE = 10;
    public static final String QUARTILE_START_KEY_DURATION = "OM_KEY_DURATION";
    public static final String QUARTILE_START_KEY_VOLUME = "OM_KEY_VOLUME";
    private static final String TAG = "NativeAdInternal";
    private static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";
    private static final String TOKEN_APP_ICON = "APP_ICON";
    private static final String TOKEN_APP_NAME = "APP_NAME";
    private static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";
    private static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";
    private static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";
    public static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";
    public static final String TOKEN_MAIN_VIDEO = "MAIN_VIDEO";
    private static final String TOKEN_OM_SDK_DATA = "OM_SDK_DATA";
    private static final String TOKEN_ORIGINAL_VIDEO_URL = "ORIGINAL_VIDEO_URL";
    private static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";
    private static final String TOKEN_START_MUTED = "START_MUTED";
    public static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    private static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";
    private float aspectRatio;
    private final fl.k executors$delegate;
    private final fl.k imageLoader$delegate;
    private final fl.k impressionTracker$delegate;
    private final AtomicBoolean isInvisibleLogged;
    private Map<String, String> nativeAdAssetMap;
    private final View.OnTouchListener onTouchListener;
    private final fl.k platform$delegate;
    private com.vungle.ads.internal.presenter.j presenter;
    private final fl.k videoOptions$delegate;
    private com.vungle.ads.internal.ui.j waterMarkView;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t implements Function1 {
        final /* synthetic */ ImageView $imageView;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends t implements tl.a {
            final /* synthetic */ ImageView $imageView;
            final /* synthetic */ Bitmap $it;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ImageView imageView, Bitmap bitmap) {
                super(0);
                this.$imageView = imageView;
                this.$it = bitmap;
            }

            @Override // tl.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m97invoke();
                return g0.f38750a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m97invoke() {
                this.$imageView.setImageBitmap(this.$it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ImageView imageView) {
            super(1);
            this.$imageView = imageView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Bitmap) obj);
            return g0.f38750a;
        }

        public final void invoke(Bitmap it) {
            s.h(it, "it");
            ImageView imageView = this.$imageView;
            if (imageView != null) {
                y.INSTANCE.runOnUiThread(new a(imageView, it));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends t implements tl.a {
        c() {
            super(0);
        }

        @Override // tl.a
        public final com.vungle.ads.internal.util.m invoke() {
            com.vungle.ads.internal.util.m aVar = com.vungle.ads.internal.util.m.Companion.getInstance();
            aVar.init(l.this.getExecutors().getIoExecutor());
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends t implements tl.a {
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
            com.vungle.ads.internal.util.q.Companion.d(l.TAG, "ImpressionTracker checked the native ad view become visible.");
            l.this.onImpression$vungle_ads_release();
            l.this.logViewVisibleOnPlay();
        }

        @Override // com.vungle.ads.internal.i.b
        public void onViewInvisible(View view) throws Throwable {
            if (l.this.isInvisibleLogged.getAndSet(true)) {
                return;
            }
            com.vungle.ads.internal.util.q.Companion.d(l.TAG, "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
            com.vungle.ads.g gVar = com.vungle.ads.g.INSTANCE;
            d0 d0Var = new d0(Sdk$SDKMetric.b.AD_VISIBILITY);
            d0Var.setValue(1L);
            com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, d0Var, l.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends t implements tl.o {
        f() {
            super(2);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
            return g0.f38750a;
        }

        public final void invoke(int i10, int i11) {
            if (i10 <= 0 || i11 <= 0) {
                return;
            }
            l.this.aspectRatio = i10 / i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
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
    public static final class h extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
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
    static final class i extends t implements tl.a {
        public static final i INSTANCE = new i();

        i() {
            super(0);
        }

        @Override // tl.a
        public final zj.d invoke() {
            return new zj.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        s.h(context, "context");
        this.impressionTracker$delegate = fl.l.b(new d(context));
        this.isInvisibleLogged = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        fl.o oVar = fl.o.SYNCHRONIZED;
        this.platform$delegate = fl.l.a(oVar, new g(context));
        this.executors$delegate = fl.l.a(oVar, new h(context));
        this.imageLoader$delegate = fl.l.b(new c());
        this.videoOptions$delegate = fl.l.b(i.INSTANCE);
        this.onTouchListener = new View.OnTouchListener() { // from class: com.vungle.ads.internal.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return l.m96onTouchListener$lambda0(this.f35807a, view, motionEvent);
            }
        };
    }

    private final void displayImage(String str, ImageView imageView) {
        getImageLoader().displayImage(str, new b(imageView));
    }

    private final String getCtaUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.m getImageLoader() {
        return (com.vungle.ads.internal.util.m) this.imageLoader$delegate.getValue();
    }

    private final com.vungle.ads.internal.i getImpressionTracker() {
        return (com.vungle.ads.internal.i) this.impressionTracker$delegate.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    private final String getOMSDKData() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_OM_SDK_DATA)) == null) ? "" : str;
    }

    private final com.vungle.ads.internal.platform.f getPlatform() {
        return (com.vungle.ads.internal.platform.f) this.platform$delegate.getValue();
    }

    private final String getPrivacyIconUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("VUNGLE_PRIVACY_ICON_URL")) == null) ? "" : str;
    }

    private final String getPrivacyUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() throws Throwable {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        com.vungle.ads.g gVar = com.vungle.ads.g.INSTANCE;
        d0 d0Var = new d0(Sdk$SDKMetric.b.AD_VISIBILITY);
        d0Var.setValue(Long.valueOf(j10));
        com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, d0Var, getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        com.vungle.ads.internal.util.q.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onTouchListener$lambda-0, reason: not valid java name */
    public static final boolean m96onTouchListener$lambda0(l this$0, View view, MotionEvent motionEvent) {
        s.h(this$0, "this$0");
        com.vungle.ads.internal.presenter.j jVar = this$0.presenter;
        if (jVar == null) {
            return false;
        }
        jVar.onViewTouched(motionEvent);
        return false;
    }

    private final void retrieveImageRatio() {
        getImageLoader().getImageSize(getMainImagePath(), new f());
    }

    private final void retrieveVideoRatio() {
        Object objB;
        Object objB2;
        Throwable thE;
        Object objB3;
        Integer numQ;
        Integer numQ2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            Context context = getContext();
            Uri uri = Uri.parse(getMainVideoPath$vungle_ads_release());
            s.g(uri, "parse(this)");
            mediaMetadataRetriever.setDataSource(context, uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
            int iIntValue = 0;
            int iIntValue2 = (strExtractMetadata == null || (numQ2 = bm.r.q(strExtractMetadata)) == null) ? 0 : numQ2.intValue();
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (strExtractMetadata2 != null && (numQ = bm.r.q(strExtractMetadata2)) != null) {
                iIntValue = numQ.intValue();
            }
            if (iIntValue2 > 0 && iIntValue > 0) {
                this.aspectRatio = iIntValue2 / iIntValue;
            }
            try {
                fl.r.a aVar = fl.r.f38769b;
                mediaMetadataRetriever.release();
                objB3 = fl.r.b(g0.f38750a);
            } catch (Throwable th2) {
                fl.r.a aVar2 = fl.r.f38769b;
                objB3 = fl.r.b(fl.s.a(th2));
            }
            thE = fl.r.e(objB3);
            if (thE == null) {
                return;
            }
        } catch (Throwable th3) {
            try {
                com.vungle.ads.internal.util.q.Companion.e("NativeAd", "Failed to retrieve video metadata: " + th3.getLocalizedMessage());
                try {
                    fl.r.a aVar3 = fl.r.f38769b;
                    mediaMetadataRetriever.release();
                    objB2 = fl.r.b(g0.f38750a);
                } catch (Throwable th4) {
                    fl.r.a aVar4 = fl.r.f38769b;
                    objB2 = fl.r.b(fl.s.a(th4));
                }
                thE = fl.r.e(objB2);
                if (thE == null) {
                    return;
                }
            } catch (Throwable th5) {
                try {
                    fl.r.a aVar5 = fl.r.f38769b;
                    mediaMetadataRetriever.release();
                    objB = fl.r.b(g0.f38750a);
                } catch (Throwable th6) {
                    fl.r.a aVar6 = fl.r.f38769b;
                    objB = fl.r.b(fl.s.a(th6));
                }
                Throwable thE2 = fl.r.e(objB);
                if (thE2 == null) {
                    throw th5;
                }
                com.vungle.ads.internal.util.q.Companion.e(TAG, "Failed to release metadata retriever", thE2);
                throw th5;
            }
        }
        com.vungle.ads.internal.util.q.Companion.e(TAG, "Failed to release metadata retriever", thE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackOMEvent$default(l lVar, int i10, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        lVar.trackOMEvent(i10, map);
    }

    public static /* synthetic */ void trackTpatEvent$default(l lVar, String str, String str2, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        lVar.trackTpatEvent(str, str2);
    }

    public final void destroy() {
        com.vungle.ads.internal.ui.j jVar = this.waterMarkView;
        if (jVar != null) {
            ViewParent parent = jVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(jVar);
            }
        }
        this.waterMarkView = null;
        getImpressionTracker().destroy();
        com.vungle.ads.internal.presenter.j jVar2 = this.presenter;
        if (jVar2 != null) {
            jVar2.detach();
        }
    }

    public final void displayAppIcon(ImageView imageView) {
        displayImage(getAppIcon(), imageView);
    }

    public final void displayMainImage(ImageView imageView) {
        displayImage(getMainImagePath(), imageView);
    }

    public final void displayPrivacyIcon(ImageView imageView) {
        displayImage(getPrivacyIconUrl(), imageView);
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    @Override // com.vungle.ads.internal.a
    public f0 getAdSizeForAdRequest() {
        return null;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(TOKEN_APP_RATING_VALUE)) == null) {
            return null;
        }
        return bm.r.o(str);
    }

    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_NAME)) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_ICON)) == null) ? "" : str;
    }

    public final String getMainVideoPath$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("MAIN_VIDEO")) == null) ? "" : str;
    }

    public final float getMediaAspectRatio() {
        return this.aspectRatio;
    }

    public final String getOriginalVideoUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_ORIGINAL_VIDEO_URL)) == null) ? "" : str;
    }

    @Override // com.vungle.ads.internal.presenter.k
    public String getPlacementRefId() {
        Placement placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    public final com.vungle.ads.internal.presenter.j getPresenter$vungle_ads_release() {
        return this.presenter;
    }

    public final zj.d getVideoOptions$vungle_ads_release() {
        return (zj.d) this.videoOptions$delegate.getValue();
    }

    public final boolean hasCallToAction() {
        return getCtaUrl().length() > 0;
    }

    public final boolean hasVideoContent() {
        return getMainVideoPath$vungle_ads_release().length() > 0;
    }

    public final void initPresenter(View rootView, com.vungle.ads.internal.presenter.b bVar) {
        s.h(rootView, "rootView");
        com.vungle.ads.internal.model.b advertisement = getAdvertisement();
        if (advertisement == null) {
            VungleError vungleErrorLogError$vungle_ads_release = new AdNotLoadedCantPlay("Ad is null").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release();
            if (bVar != null) {
                bVar.onFailure(vungleErrorLogError$vungle_ads_release);
                return;
            }
            return;
        }
        if (this.presenter == null) {
            com.vungle.ads.internal.presenter.j jVar = new com.vungle.ads.internal.presenter.j(getContext(), this, advertisement, getPlatform());
            this.presenter = jVar;
            jVar.setEventListener(new com.vungle.ads.internal.presenter.a(bVar, getPlacement()));
        }
        com.vungle.ads.internal.presenter.j jVar2 = this.presenter;
        if (jVar2 != null) {
            jVar2.initAndStartOMTracker(rootView, getOMSDKData());
        }
        getImpressionTracker().addView(rootView, new e());
        com.vungle.ads.internal.presenter.j jVar3 = this.presenter;
        if (jVar3 != null) {
            jVar3.prepare();
        }
    }

    @Override // com.vungle.ads.internal.a
    public VungleError isAdStateValidOnCanPlay() {
        if (getAdState() == com.vungle.ads.internal.a.EnumC0494a.READY || isAdPlaying$vungle_ads_release()) {
            return null;
        }
        return new InvalidAdStateError(Sdk$SDKError.b.AD_NOT_LOADED, getAdState() + " can not play native ad.");
    }

    @Override // com.vungle.ads.internal.presenter.k
    public boolean isNativeVideo() {
        return hasVideoContent();
    }

    public final boolean isStartMuted$vungle_ads_release() {
        if (getPlatform().isSilentModeEnabled()) {
            return true;
        }
        Boolean startMuted = getVideoOptions$vungle_ads_release().getStartMuted();
        return startMuted != null ? startMuted.booleanValue() : isStartMutedByServer$vungle_ads_release();
    }

    public final boolean isStartMutedByServer$vungle_ads_release() {
        String str;
        Boolean boolU0;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(TOKEN_START_MUTED)) == null || (boolU0 = bm.r.U0(str)) == null) {
            return true;
        }
        return boolU0.booleanValue();
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdSize(f0 f0Var) {
        return true;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(Placement placement) {
        s.h(placement, "placement");
        return placement.isNative();
    }

    @Override // com.vungle.ads.internal.a
    public void onAdLoaded$vungle_ads_release(com.vungle.ads.internal.model.b advertisement) {
        s.h(advertisement, "advertisement");
        this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
        com.vungle.ads.internal.util.p logEntry$vungle_ads_release = getLogEntry$vungle_ads_release();
        Long adLoadType$vungle_ads_release = logEntry$vungle_ads_release != null ? logEntry$vungle_ads_release.getAdLoadType$vungle_ads_release() : null;
        if ((adLoadType$vungle_ads_release != null && adLoadType$vungle_ads_release.longValue() == 3) || (adLoadType$vungle_ads_release != null && adLoadType$vungle_ads_release.longValue() == 4)) {
            sendWinURL();
        }
        if (hasVideoContent()) {
            retrieveVideoRatio();
        } else {
            retrieveImageRatio();
        }
    }

    public final void onImpression$vungle_ads_release() throws Throwable {
        trackTpatEvent$default(this, com.vungle.ads.internal.f.CHECKPOINT_0, null, 2, null);
        trackOMEvent$default(this, 11, null, 2, null);
    }

    public final void onPrivacyIconClicked() {
        com.vungle.ads.internal.presenter.j jVar = this.presenter;
        if (jVar != null) {
            com.vungle.ads.internal.presenter.j.processCommand$default(jVar, "openPrivacy", null, getPrivacyUrl(), 2, null);
        }
    }

    public final void openCallToActionUrl() {
        com.vungle.ads.internal.presenter.j jVar = this.presenter;
        if (jVar != null) {
            com.vungle.ads.internal.presenter.j.processCommand$default(jVar, com.vungle.ads.internal.presenter.j.DOWNLOAD, null, getCtaUrl(), 2, null);
        }
    }

    public final void openCallToActionUrlByUser() {
        trackOMEvent$default(this, 8, null, 2, null);
        openCallToActionUrl();
    }

    public final void setPresenter$vungle_ads_release(com.vungle.ads.internal.presenter.j jVar) {
        this.presenter = jVar;
    }

    public final void showWatermark(ViewGroup rootView, String str) {
        s.h(rootView, "rootView");
        if (str == null) {
            return;
        }
        if (this.waterMarkView == null) {
            Context context = rootView.getContext();
            s.g(context, "rootView.context");
            this.waterMarkView = new com.vungle.ads.internal.ui.j(context, str);
        }
        com.vungle.ads.internal.ui.j jVar = this.waterMarkView;
        if (jVar == null || s.c(jVar.getParent(), rootView)) {
            return;
        }
        ViewParent parent = jVar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(jVar);
        }
        rootView.addView(jVar);
        jVar.bringToFront();
    }

    public final void trackOMEvent(int i10, Map<String, ? extends Object> map) {
        com.vungle.ads.internal.presenter.j jVar = this.presenter;
        if (jVar != null) {
            jVar.onOMEvent(i10, map);
        }
    }

    public final void trackTpatEvent(String event, String str) throws Throwable {
        s.h(event, "event");
        com.vungle.ads.internal.presenter.j jVar = this.presenter;
        if (jVar != null) {
            jVar.processCommand("tpat", event, str);
        }
    }

    public final void trySetTouchListener(View view) {
        s.h(view, "view");
        com.vungle.ads.internal.model.b advertisement = getAdvertisement();
        if (advertisement == null || !advertisement.isClickCoordinatesTrackingEnabled()) {
            return;
        }
        view.setOnTouchListener(this.onTouchListener);
    }

    public static /* synthetic */ void getPresenter$vungle_ads_release$annotations() {
    }
}
