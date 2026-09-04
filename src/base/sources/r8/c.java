package r8;

import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import q8.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends NewInterstitialWithCodeListener implements MediationInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final MediationAdLoadCallback f51152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected j f51153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MediationInterstitialAdCallback f51154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final boolean f51155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final q8.a f51156e;

    public c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, q8.a aVar) {
        this.f51155d = com.google.ads.mediation.mintegral.a.f(mediationInterstitialAdConfiguration.getMediationExtras());
        this.f51152a = mediationAdLoadCallback;
        this.f51156e = aVar;
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f51154c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f51154c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdShow(MBridgeIds mBridgeIds) {
        j jVar;
        if (this.f51156e.c() && (jVar = this.f51153b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(jVar);
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f51154c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            this.f51154c.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        j jVar;
        if (this.f51156e.c() && (jVar = this.f51153b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(jVar);
        }
        AdError adErrorB = q8.e.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f51152a.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        this.f51154c = (MediationInterstitialAdCallback) this.f51152a.onSuccess(this);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        j jVar;
        if (this.f51156e.c() && (jVar = this.f51153b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(jVar);
        }
        AdError adErrorB = q8.e.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f51154c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorB);
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }
}
