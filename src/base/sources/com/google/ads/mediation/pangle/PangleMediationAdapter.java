package com.google.ads.mediation.pangle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.google.android.gms.ads.AdError;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import v8.d;
import v8.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.b f16351a = com.google.ads.mediation.pangle.b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f16352b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.a f16353c = new com.google.ads.mediation.pangle.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v8.a f16354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v8.b f16355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v8.c f16356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f16357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f16358h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements PAGBidCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SignalCallbacks f16359a;

        a(SignalCallbacks signalCallbacks) {
            this.f16359a = signalCallbacks;
        }

        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
        public void onBiddingTokenCollected(String str) {
            this.f16359a.onSuccess(str);
        }

        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
        public void onBiddingTokenFailed(PAGBidError pAGBidError) {
            this.f16359a.onFailure(new AdError(pAGBidError.getCode(), pAGBidError.getMessage(), "com.pangle.ads"));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.google.ads.mediation.pangle.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InitializationCompleteCallback f16361a;

        b(InitializationCompleteCallback initializationCompleteCallback) {
            this.f16361a = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            this.f16361a.onInitializationFailed(adError.getMessage());
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void b() {
            this.f16361a.onInitializationSucceeded();
        }
    }

    static void a(int i10, c cVar) {
        if (i10 == 1 || i10 == 0) {
            cVar.i(i10);
        } else {
            Log.w(TAG, "Invalid PA value. Pangle SDK only accepts 0 or 1.");
        }
    }

    public static int getPAConsent() {
        return PAGConfig.getPAConsent();
    }

    public static void setPAConsent(int i10) {
        a(i10, new c());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        if (u8.a.d()) {
            signalCallbacks.onFailure(u8.a.b());
            return;
        }
        Bundle networkExtras = rtbSignalData.getNetworkExtras();
        if (networkExtras != null && networkExtras.containsKey("user_data")) {
            this.f16352b.j(networkExtras.getString("user_data", ""));
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setAdxId("207");
        this.f16352b.a(rtbSignalData.getContext(), pAGBiddingRequest, new a(signalCallbacks));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String strB = this.f16352b.b();
        String[] strArrSplit = strB.split("\\.");
        if (strArrSplit.length < 3) {
            Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strB));
            return new VersionInfo(0, 0, 0);
        }
        int i10 = Integer.parseInt(strArrSplit[0]);
        int i11 = Integer.parseInt(strArrSplit[1]);
        int i12 = Integer.parseInt(strArrSplit[2]);
        if (strArrSplit.length >= 4) {
            i12 = (i12 * 100) + Integer.parseInt(strArrSplit[3]);
        }
        return new VersionInfo(i10, i11, i12);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        return getVersionInfo("7.9.1.3.0");
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (u8.a.d()) {
            initializationCompleteCallback.onInitializationFailed("MobileAds.getRequestConfiguration() indicates the user is a child. Pangle SDK V71 or higher does not support child users.");
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
            AdError adErrorA = u8.a.a(101, "Missing or invalid App ID.");
            Log.w(TAG, adErrorA.toString());
            initializationCompleteCallback.onInitializationFailed(adErrorA.toString());
        } else {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str));
            }
            this.f16351a.b(context, str, new b(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        if (u8.a.d()) {
            mediationAdLoadCallback.onFailure(u8.a.b());
            return;
        }
        v8.a aVarG = this.f16353c.g(mediationAdLoadCallback, this.f16351a, this.f16352b);
        this.f16354d = aVarG;
        aVarG.g(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (u8.a.d()) {
            mediationAdLoadCallback.onFailure(u8.a.b());
            return;
        }
        v8.b bVarH = this.f16353c.h(mediationAdLoadCallback, this.f16351a, this.f16352b);
        this.f16355e = bVarH;
        bVarH.f(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (u8.a.d()) {
            mediationAdLoadCallback.onFailure(u8.a.b());
            return;
        }
        v8.c cVarI = this.f16353c.i(mediationAdLoadCallback, this.f16351a, this.f16352b);
        this.f16356f = cVarI;
        cVarI.g(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        if (u8.a.d()) {
            mediationAdLoadCallback.onFailure(u8.a.b());
            return;
        }
        d dVarJ = this.f16353c.j(mediationAdLoadCallback, this.f16351a, this.f16352b);
        this.f16357g = dVarJ;
        dVarJ.i(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (u8.a.d()) {
            mediationAdLoadCallback.onFailure(u8.a.b());
            return;
        }
        f fVarK = this.f16353c.k(mediationAdLoadCallback, this.f16351a, this.f16352b);
        this.f16358h = fVarK;
        fVarK.g(mediationRewardedAdConfiguration);
    }

    VersionInfo getVersionInfo(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str));
            return new VersionInfo(0, 0, 0);
        }
        int i10 = Integer.parseInt(strArrSplit[0]);
        int i11 = Integer.parseInt(strArrSplit[1]);
        int i12 = (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]);
        if (strArrSplit.length >= 5) {
            i12 = (i12 * 100) + Integer.parseInt(strArrSplit[4]);
        }
        return new VersionInfo(i10, i11, i12);
    }
}
