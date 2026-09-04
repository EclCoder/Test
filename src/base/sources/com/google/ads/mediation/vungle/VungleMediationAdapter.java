package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.vungle.ads.VungleError;
import com.vungle.ads.b0;
import com.vungle.ads.c0;
import com.vungle.ads.i;
import com.vungle.ads.l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import x8.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, c0 {
    public static final int ERROR_CANNOT_GET_BID_TOKEN = 108;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final String TAG = "VungleMediationAdapter";
    public static final String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.ads";
    private com.vungle.ads.b adConfig;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback mediationRewardedAdCallback;
    private b0 rewardedAd;
    private x8.a rtbAppOpenAd;
    private x8.b rtbBannerAd;
    private x8.c rtbInterstitialAd;
    private x8.d rtbNativeAd;
    private e rtbRewardedAd;
    private e rtbRewardedInterstitialAd;
    private String userId;
    private final com.google.ads.mediation.vungle.b vungleFactory = new com.google.ads.mediation.vungle.b();
    private y8.a waterfallAppOpenAd;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SignalCallbacks f16369a;

        a(SignalCallbacks signalCallbacks) {
            this.f16369a = signalCallbacks;
        }

        @Override // com.vungle.ads.l
        public void onBidTokenCollected(String str) {
            Log.d(VungleMediationAdapter.TAG, "Liftoff Monetize bidding token=" + str);
            this.f16369a.onSuccess(str);
        }

        @Override // com.vungle.ads.l
        public void onBidTokenError(String str) {
            AdError adError = new AdError(108, "Liftoff Monetize returned an empty bid token.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f16369a.onFailure(adError);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.google.ads.mediation.vungle.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InitializationCompleteCallback f16371a;

        b(InitializationCompleteCallback initializationCompleteCallback) {
            this.f16371a = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f16371a.onInitializationFailed(adError.toString());
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void b() {
            this.f16371a.onInitializationSucceeded();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements com.google.ads.mediation.vungle.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16374b;

        c(Context context, String str) {
            this.f16373a = context;
            this.f16374b = str;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            VungleMediationAdapter.this.mediationAdLoadCallback.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void b() {
            VungleMediationAdapter vungleMediationAdapter = VungleMediationAdapter.this;
            vungleMediationAdapter.rewardedAd = vungleMediationAdapter.vungleFactory.e(this.f16373a, this.f16374b, VungleMediationAdapter.this.adConfig);
            VungleMediationAdapter.this.rewardedAd.setAdListener(VungleMediationAdapter.this);
            VungleMediationAdapter.this.rewardedAd.setAdapterAdFormat("VungleMediationAdapter-rewarded");
            if (!TextUtils.isEmpty(VungleMediationAdapter.this.userId)) {
                VungleMediationAdapter.this.rewardedAd.setUserId(VungleMediationAdapter.this.userId);
            }
            VungleMediationAdapter.this.rewardedAd.load((String) null);
        }
    }

    private static boolean g(VersionInfo versionInfo, VersionInfo versionInfo2) {
        if (versionInfo.getMajorVersion() > versionInfo2.getMajorVersion()) {
            return true;
        }
        if (versionInfo.getMajorVersion() == versionInfo2.getMajorVersion()) {
            if (versionInfo.getMinorVersion() > versionInfo2.getMinorVersion()) {
                return true;
            }
            if (versionInfo.getMinorVersion() == versionInfo2.getMinorVersion() && versionInfo.getMicroVersion() >= versionInfo2.getMicroVersion()) {
                return true;
            }
        }
        return false;
    }

    public static AdError getAdError(VungleError vungleError) {
        return new AdError(vungleError.getCode(), vungleError.getErrorMessage(), VUNGLE_SDK_ERROR_DOMAIN);
    }

    static String getAdapterVersion() {
        return "7.7.2.0";
    }

    private static boolean h(VersionInfo versionInfo, VersionInfo versionInfo2) {
        if (versionInfo.getMajorVersion() < versionInfo2.getMajorVersion()) {
            return true;
        }
        if (versionInfo.getMajorVersion() == versionInfo2.getMajorVersion()) {
            if (versionInfo.getMinorVersion() < versionInfo2.getMinorVersion()) {
                return true;
            }
            if (versionInfo.getMinorVersion() == versionInfo2.getMinorVersion() && versionInfo.getMicroVersion() < versionInfo2.getMicroVersion()) {
                return true;
            }
        }
        return false;
    }

    public static boolean runtimeGmaSdkListensToAdapterReportedImpressions() {
        VersionInfo version = MobileAds.getVersion();
        if (h(version, new VersionInfo(6, 5, 0)) && g(version, new VersionInfo(0, 18, 0))) {
            return true;
        }
        return g(version, new VersionInfo(24, 4, 0));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        d.f16380b.c(rtbSignalData.getContext(), new a(signalCallbacks));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String strB = d.f16380b.b();
        String[] strArrSplit = strB.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strB));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String adapterVersion = getAdapterVersion();
        String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (d.f16380b.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            if (initializationCompleteCallback != null) {
                AdError adError = new AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN);
                Log.w(TAG, adError.toString());
                initializationCompleteCallback.onInitializationFailed(adError.toString());
                return;
            }
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", "appid", hashSet, str));
        }
        com.google.ads.mediation.vungle.c.a().b(str, context, new b(initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        y8.a aVar = new y8.a(mediationAdLoadCallback, this.vungleFactory);
        this.waterfallAppOpenAd = aVar;
        aVar.g(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        new y8.b(mediationAdLoadCallback, this.vungleFactory).e(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadNativeAd()...");
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        x8.d dVar = new x8.d(mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = dVar;
        dVar.i(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.userId = mediationExtras.getString("userId");
        }
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.w(TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.adConfig = this.vungleFactory.a();
        if (mediationExtras != null && mediationExtras.containsKey("adOrientation")) {
            this.adConfig.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        Context context = mediationRewardedAdConfiguration.getContext();
        com.google.ads.mediation.vungle.c.a().b(string, context, new c(context, string2));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRewardedInterstitialAd()...");
        Log.d(str, "Liftoff Monetize adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Liftoff Monetize.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        x8.a aVar = new x8.a(mediationAdLoadCallback, this.vungleFactory);
        this.rtbAppOpenAd = aVar;
        aVar.g(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbBannerAd()...");
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        x8.b bVar = new x8.b(mediationAdLoadCallback, this.vungleFactory);
        this.rtbBannerAd = bVar;
        bVar.e(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbInterstitialAd()...");
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        x8.c cVar = new x8.c(mediationAdLoadCallback, this.vungleFactory);
        this.rtbInterstitialAd = cVar;
        cVar.e(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbNativeAd()...");
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        x8.d dVar = new x8.d(mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = dVar;
        dVar.i(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbRewardedAd()...");
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        e eVar = new e(mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedAd = eVar;
        eVar.e(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbRewardedInterstitialAd()...");
        Log.d(str, "Liftoff Monetize adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Liftoff Monetize.");
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        e eVar = new e(mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedInterstitialAd = eVar;
        eVar.e(mediationRewardedAdConfiguration);
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdClicked(i iVar) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad was clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdEnd(i iVar) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad has ended.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdFailedToLoad(i iVar, VungleError vungleError) {
        AdError adError = getAdError(vungleError);
        Log.w(TAG, "Failed to load waterfall rewarded ad from Liftoff Monetize with error: " + adError.toString());
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdFailedToPlay(i iVar, VungleError vungleError) {
        AdError adError = getAdError(vungleError);
        Log.w(TAG, "Failed to play waterfall rewarded ad from Liftoff Monetize with error: " + adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdImpression(i iVar) {
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdLoaded(i iVar) {
        Log.d(TAG, "Loaded waterfall rewarded ad from Liftoff Monetize.");
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.c0
    public void onAdRewarded(i iVar) {
        Log.d(TAG, "Received reward from Liftoff Monetize waterfall rewarded ad.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mediationRewardedAdCallback.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdStart(i iVar) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad has started.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        b0 b0Var = this.rewardedAd;
        if (b0Var != null) {
            b0Var.play(context);
        } else if (this.mediationRewardedAdCallback != null) {
            AdError adError = new AdError(107, "Failed to show waterfall rewarded ad from Liftoff Monetize.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            this.mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdLeftApplication(i iVar) {
    }
}
