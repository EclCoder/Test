package n8;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.g;
import com.google.ads.mediation.inmobi.j;
import com.google.ads.mediation.inmobi.k;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends InterstitialAdEventListener implements MediationRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f46937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final MediationAdLoadCallback f46938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected j f46939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediationRewardedAdCallback f46940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.ads.mediation.inmobi.b f46941e;

    public d(MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        this.f46938b = mediationAdLoadCallback;
        this.f46939c = jVar;
        this.f46941e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Context context, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        this.f46937a = this.f46941e.c(context, Long.valueOf(com.google.ads.mediation.inmobi.d.g(mediationRewardedAdConfiguration.getServerParameters())), this);
        com.google.ads.mediation.inmobi.d.h();
        com.google.ads.mediation.inmobi.d.a(mediationRewardedAdConfiguration.getMediationExtras());
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            this.f46937a.f(new WatermarkData(watermark, 0.3f));
        }
        b(this.f46937a, mediationRewardedAdConfiguration);
    }

    protected abstract void b(k kVar, MediationRewardedAdConfiguration mediationRewardedAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46940d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi SDK fetched the rewarded ad successfully, but the ad contents still need to be loaded.");
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onAdImpression(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has logged an impression.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46940d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorB = g.b(com.google.ads.mediation.inmobi.d.f(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        Log.w(InMobiMediationAdapter.TAG, adErrorB.toString());
        MediationAdLoadCallback mediationAdLoadCallback = this.f46938b;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adErrorB);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been loaded.");
        MediationAdLoadCallback mediationAdLoadCallback = this.f46938b;
        if (mediationAdLoadCallback != null) {
            this.f46940d = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been dismissed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46940d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
        AdError adErrorA = g.a(106, "InMobi rewarded ad failed to show.");
        Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46940d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorA);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been shown.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46940d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.f46940d.onVideoStart();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad will be shown.");
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map map) {
        if (this.f46940d != null) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad credited the user with a reward.");
            this.f46940d.onVideoComplete();
            this.f46940d.onUserEarnedReward();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad left application.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        if (this.f46937a.a().booleanValue()) {
            this.f46937a.g();
            return;
        }
        AdError adErrorA = g.a(105, "InMobi rewarded ad is not yet ready to be shown.");
        Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46940d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorA);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onRequestPayloadCreated(byte[] bArr) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
    }
}
