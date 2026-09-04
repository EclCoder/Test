package r8;

import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import q8.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends RewardVideoWithCodeListener implements MediationRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final MediationAdLoadCallback f51168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected j f51169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MediationRewardedAdCallback f51170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final boolean f51171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final q8.a f51172e;

    public f(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, q8.a aVar) {
        this.f51171d = com.google.ads.mediation.mintegral.a.f(mediationRewardedAdConfiguration.getMediationExtras());
        this.f51168a = mediationAdLoadCallback;
        this.f51172e = aVar;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        if (this.f51170c == null) {
            return;
        }
        if (rewardInfo == null || !rewardInfo.isCompleteView()) {
            Log.w(MintegralMediationAdapter.TAG, "Mintegral SDK failed to reward user due to missing rewarded settings or rewarded ad playback not completed.");
        } else {
            this.f51170c.onUserEarnedReward();
        }
        this.f51170c.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdShow(MBridgeIds mBridgeIds) {
        j jVar;
        if (this.f51172e.c() && (jVar = this.f51169b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(jVar);
        }
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f51170c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.f51170c.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        j jVar;
        if (this.f51172e.c() && (jVar = this.f51169b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(jVar);
        }
        AdError adErrorB = q8.e.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f51170c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorB);
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoAdClicked(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f51170c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        j jVar;
        if (this.f51172e.c() && (jVar = this.f51169b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(jVar);
        }
        AdError adErrorB = q8.e.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f51168a.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.f51170c = (MediationRewardedAdCallback) this.f51168a.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoComplete(MBridgeIds mBridgeIds) {
    }
}
