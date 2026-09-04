package x8;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.ads.VungleError;
import com.vungle.ads.b0;
import com.vungle.ads.c0;
import com.vungle.ads.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e implements MediationRewardedAd, c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f56779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediationRewardedAdCallback f56780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b0 f56781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.ads.mediation.vungle.b f56782d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.google.ads.mediation.vungle.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f56783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f56784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.vungle.ads.b f56785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f56786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f56787e;

        a(Context context, String str, com.vungle.ads.b bVar, String str2, String str3) {
            this.f56783a = context;
            this.f56784b = str;
            this.f56785c = bVar;
            this.f56786d = str2;
            this.f56787e = str3;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            e.this.f56779a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void b() {
            e eVar = e.this;
            eVar.f56781c = eVar.f56782d.e(this.f56783a, this.f56784b, this.f56785c);
            e.this.f56781c.setAdListener(e.this);
            e.this.f56781c.setAdapterAdFormat("VungleRtbRewardedAd");
            if (!TextUtils.isEmpty(this.f56786d)) {
                e.this.f56781c.setUserId(this.f56786d);
            }
            e.this.f56781c.load(this.f56787e);
        }
    }

    public e(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        this.f56779a = mediationAdLoadCallback;
        this.f56782d = bVar;
    }

    public void e(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = mediationExtras.getString("userId");
        String string2 = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string2)) {
            AdError adError = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f56779a.onFailure(adError);
            return;
        }
        String string3 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string3)) {
            AdError adError2 = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f56779a.onFailure(adError2);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        com.vungle.ads.b bVarA = this.f56782d.a();
        if (mediationExtras.containsKey("adOrientation")) {
            bVarA.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            bVarA.setWatermark(watermark);
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        com.google.ads.mediation.vungle.c.a().b(string2, context, new a(context, string3, bVarA, string, bidResponse));
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdClicked(i iVar) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f56780b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdEnd(i iVar) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f56780b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdFailedToLoad(i iVar, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f56779a.onFailure(adError);
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdFailedToPlay(i iVar, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f56780b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdImpression(i iVar) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f56780b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.f56780b.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdLoaded(i iVar) {
        this.f56780b = (MediationRewardedAdCallback) this.f56779a.onSuccess(this);
    }

    @Override // com.vungle.ads.c0
    public void onAdRewarded(i iVar) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f56780b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.f56780b.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdStart(i iVar) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f56780b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        b0 b0Var = this.f56781c;
        if (b0Var != null) {
            b0Var.play(context);
        } else if (this.f56780b != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f56780b.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.c0, com.vungle.ads.o, com.vungle.ads.j
    public void onAdLeftApplication(i iVar) {
    }
}
