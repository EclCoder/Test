package l8;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b implements MediationRewardedAd, RewardedVideoAdExtendedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f44059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RewardedVideoAd f44060b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediationRewardedAdCallback f44062d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f44064f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f44061c = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f44063e = new AtomicBoolean();

    public b(MediationAdLoadCallback mediationAdLoadCallback, e eVar) {
        this.f44059a = mediationAdLoadCallback;
        this.f44064f = eVar;
    }

    AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public void b(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        String placementID = FacebookMediationAdapter.getPlacementID(mediationRewardedAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f44059a.onFailure(adError);
        } else {
            FacebookMediationAdapter.setMixedAudience(mediationRewardedAdConfiguration);
            this.f44060b = this.f44064f.e(context, placementID);
            if (!TextUtils.isEmpty(mediationRewardedAdConfiguration.getWatermark())) {
                this.f44060b.setExtraHints(new ExtraHints.Builder().mediationData(mediationRewardedAdConfiguration.getWatermark()).build());
            }
            RewardedVideoAd rewardedVideoAd = this.f44060b;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(mediationRewardedAdConfiguration.getBidResponse()).withAdExperience(a()).build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f44062d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        MediationAdLoadCallback mediationAdLoadCallback = this.f44059a;
        if (mediationAdLoadCallback != null) {
            this.f44062d = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.f44061c.get()) {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f44062d;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationAdLoadCallback mediationAdLoadCallback = this.f44059a;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.f44060b.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f44062d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f44063e.getAndSet(true) && (mediationRewardedAdCallback = this.f44062d) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f44060b;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f44063e.getAndSet(true) && (mediationRewardedAdCallback = this.f44062d) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f44060b;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        this.f44062d.onVideoComplete();
        this.f44062d.onUserEarnedReward();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f44061c.set(true);
        if (this.f44060b.show()) {
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f44062d;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onVideoStart();
                this.f44062d.onAdOpened();
                return;
            }
            return;
        }
        AdError adError = new AdError(110, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.f44062d;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onAdFailedToShow(adError);
        }
        this.f44060b.destroy();
    }
}
