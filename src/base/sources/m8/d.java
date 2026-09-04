package m8;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c1.pGX.geAgcEazw;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.s;
import l8.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements MediationAppOpenAd, InterstitialAdExtendedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f45357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f45358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterstitialAd f45359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediationAppOpenAdCallback f45360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f45361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f45362f;

    public d(MediationAdLoadCallback loadCallback, e metaFactory) {
        s.h(loadCallback, "loadCallback");
        s.h(metaFactory, "metaFactory");
        this.f45357a = loadCallback;
        this.f45358b = metaFactory;
        this.f45361e = new AtomicBoolean();
        this.f45362f = new AtomicBoolean();
    }

    public final void a(MediationAppOpenAdConfiguration adConfiguration) {
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderBuildLoadAdConfig;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithBid;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithAdListener;
        InterstitialAd interstitialAd;
        s.h(adConfiguration, "adConfiguration");
        Bundle serverParameters = adConfiguration.getServerParameters();
        s.g(serverParameters, "getServerParameters(...)");
        String placementID = FacebookMediationAdapter.getPlacementID(serverParameters);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f45357a.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(adConfiguration);
        this.f45359c = this.f45358b.a(adConfiguration.getContext(), placementID);
        if (!TextUtils.isEmpty(adConfiguration.getWatermark()) && (interstitialAd = this.f45359c) != null) {
            interstitialAd.setExtraHints(new ExtraHints.Builder().mediationData(adConfiguration.getWatermark()).build());
        }
        InterstitialAd interstitialAd2 = this.f45359c;
        if (interstitialAd2 != null) {
            interstitialAd2.loadAd((interstitialAd2 == null || (interstitialAdLoadConfigBuilderBuildLoadAdConfig = interstitialAd2.buildLoadAdConfig()) == null || (interstitialAdLoadConfigBuilderWithBid = interstitialAdLoadConfigBuilderBuildLoadAdConfig.withBid(adConfiguration.getBidResponse())) == null || (interstitialAdLoadConfigBuilderWithAdListener = interstitialAdLoadConfigBuilderWithBid.withAdListener(this)) == null) ? null : interstitialAdLoadConfigBuilderWithAdListener.build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        s.h(ad2, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45360d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        s.h(ad2, "ad");
        this.f45360d = (MediationAppOpenAdCallback) this.f45357a.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        s.h(ad2, "ad");
        s.h(adError, "adError");
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        s.g(adError2, "getAdError(...)");
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        if (!this.f45361e.get()) {
            this.f45357a.onFailure(adError2);
            return;
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45360d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        MediationAppOpenAdCallback mediationAppOpenAdCallback;
        if (this.f45362f.getAndSet(true) || (mediationAppOpenAdCallback = this.f45360d) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad2) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback;
        s.h(ad2, "ad");
        if (this.f45362f.getAndSet(true) || (mediationAppOpenAdCallback = this.f45360d) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        s.h(ad2, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45360d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        s.h(context, "context");
        this.f45361e.set(true);
        InterstitialAd interstitialAd = this.f45359c;
        if (interstitialAd == null || interstitialAd.show()) {
            return;
        }
        AdError adError = new AdError(110, "Failed to present app open ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45360d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad2) {
        s.h(ad2, geAgcEazw.kgMPKw);
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45360d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
    }
}
