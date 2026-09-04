package m8;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import l8.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b implements MediationInterstitialAd, InterstitialAdExtendedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f45338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterstitialAd f45339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediationInterstitialAdCallback f45340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f45341d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f45342e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f45343f;

    public b(MediationAdLoadCallback mediationAdLoadCallback, e eVar) {
        this.f45338a = mediationAdLoadCallback;
        this.f45343f = eVar;
    }

    public void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String placementID = FacebookMediationAdapter.getPlacementID(mediationInterstitialAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f45338a.onFailure(adError);
        } else {
            FacebookMediationAdapter.setMixedAudience(mediationInterstitialAdConfiguration);
            this.f45339b = this.f45343f.b(mediationInterstitialAdConfiguration.getContext(), placementID);
            if (!TextUtils.isEmpty(mediationInterstitialAdConfiguration.getWatermark())) {
                this.f45339b.setExtraHints(new ExtraHints.Builder().mediationData(mediationInterstitialAdConfiguration.getWatermark()).build());
            }
            InterstitialAd interstitialAd = this.f45339b;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(mediationInterstitialAdConfiguration.getBidResponse()).withAdListener(this).build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f45340c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.f45340c.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        this.f45340c = (MediationInterstitialAdCallback) this.f45338a.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        if (!this.f45341d.get()) {
            this.f45338a.onFailure(adError2);
            return;
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f45340c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f45342e.getAndSet(true) || (mediationInterstitialAdCallback = this.f45340c) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f45342e.getAndSet(true) || (mediationInterstitialAdCallback = this.f45340c) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f45340c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f45340c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
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

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f45341d.set(true);
        if (this.f45339b.show()) {
            return;
        }
        AdError adError = new AdError(110, "Failed to present interstitial ad.", obFGmWgqyy.GmkSAPKBOV);
        Log.w(FacebookMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f45340c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }
}
