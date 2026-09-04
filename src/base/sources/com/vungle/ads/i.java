package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.signals.SignaledAd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i implements com.vungle.ads.a, VungleAdType {
    private final com.vungle.ads.b adConfig;
    private final fl.k adInternal$delegate;
    private j adListener;
    private String adapterAdFormat;
    private final Context context;
    private String creativeId;
    private final y displayToClickMetric;
    private String eventId;
    private final d0 leaveApplicationMetric;
    private final com.vungle.ads.internal.util.p logEntry;
    private final String placementId;
    private final y presentToDisplayMetric;
    private final y responseToShowMetric;
    private final d0 rewardedMetric;
    private final y showToCloseMetric;
    private final y showToFailMetric;
    private final fl.k signalManager$delegate;
    private SignaledAd signaledAd;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.jvm.internal.t implements tl.a {
        a() {
            super(0);
        }

        @Override // tl.a
        public final com.vungle.ads.internal.a invoke() {
            i iVar = i.this;
            com.vungle.ads.internal.a aVarConstructAdInternal$vungle_ads_release = iVar.constructAdInternal$vungle_ads_release(iVar.getContext());
            aVarConstructAdInternal$vungle_ads_release.setLogEntry$vungle_ads_release(i.this.getLogEntry$vungle_ads_release());
            return aVarConstructAdInternal$vungle_ads_release;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements com.vungle.ads.internal.load.a {
        final /* synthetic */ String $adMarkup;

        b(String str) {
            this.$adMarkup = str;
        }

        @Override // com.vungle.ads.internal.load.a
        public void onFailure(VungleError error) {
            kotlin.jvm.internal.s.h(error, "error");
            i iVar = i.this;
            iVar.onLoadFailure$vungle_ads_release(iVar, error);
        }

        @Override // com.vungle.ads.internal.load.a
        public void onSuccess(com.vungle.ads.internal.model.b advertisement) {
            kotlin.jvm.internal.s.h(advertisement, "advertisement");
            i.this.onAdLoaded$vungle_ads_release(advertisement);
            i iVar = i.this;
            iVar.onLoadSuccess$vungle_ads_release(iVar, this.$adMarkup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements com.vungle.ads.internal.load.a {
        c() {
        }

        @Override // com.vungle.ads.internal.load.a
        public void onFailure(VungleError error) {
            kotlin.jvm.internal.s.h(error, "error");
            i iVar = i.this;
            iVar.onLoadFailure$vungle_ads_release(iVar, error);
        }

        @Override // com.vungle.ads.internal.load.a
        public void onSuccess(com.vungle.ads.internal.model.b advertisement) {
            kotlin.jvm.internal.s.h(advertisement, "advertisement");
            i.this.onAdLoaded$vungle_ads_release(advertisement);
            i iVar = i.this;
            iVar.onLoadSuccess$vungle_ads_release(iVar, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.jvm.internal.t implements tl.a {
        final /* synthetic */ VungleError $vungleError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(VungleError vungleError) {
            super(0);
            this.$vungleError = vungleError;
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m64invoke();
            return fl.g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m64invoke() {
            j adListener = i.this.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToLoad(i.this, this.$vungleError);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.jvm.internal.t implements tl.a {
        e() {
            super(0);
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m65invoke();
            return fl.g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m65invoke() {
            j adListener = i.this.getAdListener();
            if (adListener != null) {
                adListener.onAdLoaded(i.this);
            }
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

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    public i(Context context, String placementId, com.vungle.ads.b adConfig) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(placementId, "placementId");
        kotlin.jvm.internal.s.h(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal$delegate = fl.l.b(new a());
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.signalManager$delegate = fl.l.a(fl.o.SYNCHRONIZED, new f(context));
        com.vungle.ads.internal.util.p pVar = new com.vungle.ads.internal.util.p();
        pVar.setPlacementRefId$vungle_ads_release(placementId);
        this.logEntry = pVar;
        this.responseToShowMetric = new y(Sdk$SDKMetric.b.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new y(Sdk$SDKMetric.b.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new y(Sdk$SDKMetric.b.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new y(Sdk$SDKMetric.b.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new d0(Sdk$SDKMetric.b.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new d0(Sdk$SDKMetric.b.AD_REWARD_USER);
        this.showToCloseMetric = new y(Sdk$SDKMetric.b.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    private final void onLoadEnd() {
        this.responseToShowMetric.markStart();
    }

    @Override // com.vungle.ads.a
    public Boolean canPlayAd() {
        return Boolean.valueOf(com.vungle.ads.internal.a.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null);
    }

    public abstract com.vungle.ads.internal.a constructAdInternal$vungle_ads_release(Context context);

    public final com.vungle.ads.b getAdConfig() {
        return this.adConfig;
    }

    public final com.vungle.ads.internal.a getAdInternal$vungle_ads_release() {
        return (com.vungle.ads.internal.a) this.adInternal$delegate.getValue();
    }

    public final j getAdListener() {
        return this.adListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public String getAdapterAdFormat() {
        return this.adapterAdFormat;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final y getDisplayToClickMetric$vungle_ads_release() {
        return this.displayToClickMetric;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final d0 getLeaveApplicationMetric$vungle_ads_release() {
        return this.leaveApplicationMetric;
    }

    public final com.vungle.ads.internal.util.p getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final y getPresentToDisplayMetric$vungle_ads_release() {
        return this.presentToDisplayMetric;
    }

    public final y getResponseToShowMetric$vungle_ads_release() {
        return this.responseToShowMetric;
    }

    public final d0 getRewardedMetric$vungle_ads_release() {
        return this.rewardedMetric;
    }

    public final y getShowToCloseMetric$vungle_ads_release() {
        return this.showToCloseMetric;
    }

    public final y getShowToFailMetric$vungle_ads_release() {
        return this.showToFailMetric;
    }

    public final com.vungle.ads.internal.signals.b getSignalManager$vungle_ads_release() {
        return (com.vungle.ads.internal.signals.b) this.signalManager$delegate.getValue();
    }

    public final SignaledAd getSignaledAd$vungle_ads_release() {
        return this.signaledAd;
    }

    public final Double getWinningPrice() {
        com.vungle.ads.internal.model.b advertisement = getAdInternal$vungle_ads_release().getAdvertisement();
        if (advertisement != null) {
            return advertisement.getWinningPrice();
        }
        return null;
    }

    @Override // com.vungle.ads.a
    public void load() throws Throwable {
        load((String) null);
    }

    public void onAdLoaded$vungle_ads_release(com.vungle.ads.internal.model.b advertisement) {
        kotlin.jvm.internal.s.h(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String strEventId = advertisement.eventId();
        this.eventId = strEventId;
        SignaledAd signaledAd = this.signaledAd;
        if (signaledAd == null) {
            return;
        }
        signaledAd.setEventId(strEventId);
    }

    public void onLoadFailure$vungle_ads_release(i baseAd, VungleError vungleError) {
        kotlin.jvm.internal.s.h(baseAd, "baseAd");
        kotlin.jvm.internal.s.h(vungleError, "vungleError");
        onLoadEnd();
        com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new d(vungleError));
    }

    public void onLoadSuccess$vungle_ads_release(i baseAd, String str) {
        kotlin.jvm.internal.s.h(baseAd, "baseAd");
        onLoadEnd();
        com.vungle.ads.internal.util.y.INSTANCE.runOnUiThread(new e());
    }

    public final void sendLossURL() {
        getAdInternal$vungle_ads_release().sendLossURL();
    }

    public final void sendWinURL() {
        getAdInternal$vungle_ads_release().sendWinURL();
    }

    public final void setAdListener(j jVar) {
        this.adListener = jVar;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(String str) {
        this.adapterAdFormat = str;
        this.logEntry.setAdapterAdFormat$vungle_ads_release(str);
    }

    public final void setSignaledAd$vungle_ads_release(SignaledAd signaledAd) {
        this.signaledAd = signaledAd;
    }

    @Override // com.vungle.ads.a
    public void load(String str) throws Throwable {
        getAdInternal$vungle_ads_release().loadAd(this.placementId, str, null, new b(str));
    }

    @Override // com.vungle.ads.a
    public void load(i0 csbData) throws Throwable {
        kotlin.jvm.internal.s.h(csbData, "csbData");
        getAdInternal$vungle_ads_release().loadAd(this.placementId, null, csbData, new c());
    }
}
