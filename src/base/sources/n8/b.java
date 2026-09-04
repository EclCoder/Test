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
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends InterstitialAdEventListener implements MediationInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f46924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final MediationAdLoadCallback f46925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected j f46926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediationInterstitialAdCallback f46927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.ads.mediation.inmobi.b f46928e;

    public b(MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        this.f46925b = mediationAdLoadCallback;
        this.f46926c = jVar;
        this.f46928e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Context context, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        this.f46924a = this.f46928e.c(context, Long.valueOf(com.google.ads.mediation.inmobi.d.g(mediationInterstitialAdConfiguration.getServerParameters())), this);
        com.google.ads.mediation.inmobi.d.h();
        com.google.ads.mediation.inmobi.d.a(mediationInterstitialAdConfiguration.getMediationExtras());
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            this.f46924a.f(new WatermarkData(watermark, 0.3f));
        }
        b(this.f46924a, mediationInterstitialAdConfiguration);
    }

    protected abstract void b(k kVar, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has been clicked.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46927d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi SDK fetched the interstitial ad successfully, but the ad contents still need to be loaded.");
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onAdImpression(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has logged an impression.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46927d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorB = g.b(com.google.ads.mediation.inmobi.d.f(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        Log.e(InMobiMediationAdapter.TAG, adErrorB.toString());
        MediationAdLoadCallback mediationAdLoadCallback = this.f46925b;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adErrorB);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has been loaded.");
        MediationAdLoadCallback mediationAdLoadCallback = this.f46925b;
        if (mediationAdLoadCallback != null) {
            this.f46927d = (MediationInterstitialAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has been dismissed.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46927d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
        AdError adErrorA = g.a(106, "InMobi SDK failed to display an interstitial ad.");
        Log.e(InMobiMediationAdapter.TAG, adErrorA.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46927d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorA);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has been shown.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46927d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad will be shown.");
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has caused the user to leave the application.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46927d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        if (this.f46924a.a().booleanValue()) {
            this.f46924a.g();
            return;
        }
        AdError adErrorA = g.a(105, "InMobi interstitial ad is not yet ready to be shown.");
        Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46927d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorA);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map map) {
    }
}
