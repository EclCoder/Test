package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
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

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class InMobiMediationAdapter extends RtbAdapter {
    public static final String ERROR_MESSAGE_FOR_INVALID_ACCOUNTID = "Missing or invalid Account ID, configured for this ad source instance in the AdMob or Ad Manager UI";
    public static final String TAG = "InMobiMediationAdapter";
    private b inMobiAdFactory;
    private j inMobiInitializer;
    private o8.a inMobiRtbBannerAd;
    private o8.b inMobiRtbInterstitialAd;
    private o8.c inMobiRtbNativeAd;
    private o8.d inMobiRtbRewardedAd;
    private o8.d inMobiRtbRewardedInterstitialAd;
    private o inMobiSdkWrapper;
    private p8.a inMobiWaterfallBannerAd;
    private p8.b inMobiWaterfallInterstitialAd;
    private p8.c inMobiWaterfallNativeAd;
    private p8.d inMobiWaterfallRewardedAd;
    private p8.d inMobiWaterfallRewardedInterstitialAd;
    private q mediationUtils;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InitializationCompleteCallback f16302a;

        a(InitializationCompleteCallback initializationCompleteCallback) {
            this.f16302a = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.inmobi.j.a
        public void a(AdError adError) {
            this.f16302a.onInitializationFailed(adError.toString());
        }

        @Override // com.google.ads.mediation.inmobi.j.a
        public void b() {
            this.f16302a.onInitializationSucceeded();
        }
    }

    InMobiMediationAdapter(j jVar, b bVar, o oVar, q qVar) {
        this.inMobiInitializer = jVar;
        this.inMobiAdFactory = bVar;
        this.inMobiSdkWrapper = oVar;
        this.mediationUtils = qVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        h hVarA = i.a(rtbSignalData.getContext(), rtbSignalData.getNetworkExtras(), "c_google");
        signalCallbacks.onSuccess(this.inMobiSdkWrapper.a(hVarA.b(), hVarA.a()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String strB = this.inMobiSdkWrapper.b();
        String[] strArrSplit = strB.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strB));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        return getVersionInfo("11.2.0.0");
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (this.inMobiSdkWrapper.d()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("accountid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(g.a(100, ERROR_MESSAGE_FOR_INVALID_ACCOUNTID).toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the InMobi SDK", "accountid", hashSet, str));
        }
        this.inMobiInitializer.b(context, str, new a(initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        p8.a aVar = new p8.a(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallBannerAd = aVar;
        aVar.i(mediationBannerAdConfiguration, this.mediationUtils);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        p8.b bVar = new p8.b(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallInterstitialAd = bVar;
        bVar.k(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        p8.c cVar = new p8.c(mediationNativeAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallNativeAd = cVar;
        cVar.i();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        p8.d dVar = new p8.d(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallRewardedAd = dVar;
        dVar.k(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        p8.d dVar = new p8.d(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallRewardedInterstitialAd = dVar;
        dVar.k(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        o8.a aVar = new o8.a(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbBannerAd = aVar;
        aVar.g(mediationBannerAdConfiguration, this.mediationUtils);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        o8.b bVar = new o8.b(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbInterstitialAd = bVar;
        bVar.h(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        o8.c cVar = new o8.c(mediationNativeAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbNativeAd = cVar;
        cVar.f();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        o8.d dVar = new o8.d(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbRewardedAd = dVar;
        dVar.h(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        o8.d dVar = new o8.d(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbRewardedInterstitialAd = dVar;
        dVar.h(mediationRewardedAdConfiguration);
    }

    VersionInfo getVersionInfo(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str));
        return new VersionInfo(0, 0, 0);
    }

    public InMobiMediationAdapter() {
        this.inMobiInitializer = j.a();
        this.inMobiAdFactory = new b();
        this.inMobiSdkWrapper = new o();
        this.mediationUtils = new q();
    }
}
