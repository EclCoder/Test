package w8;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.c;
import com.google.ads.mediation.vungle.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.VungleError;
import com.vungle.ads.f0;
import com.vungle.ads.h;
import com.vungle.ads.h0;
import com.vungle.ads.i;
import com.vungle.mediation.VungleInterstitialAdapter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements MediationBannerAd, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f55961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediationBannerAdCallback f55962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h0 f55963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.ads.mediation.vungle.b f55964d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f55965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f55966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f55967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MediationBannerAdConfiguration f55968d;

        a(Context context, String str, f0 f0Var, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
            this.f55965a = context;
            this.f55966b = str;
            this.f55967c = f0Var;
            this.f55968d = mediationBannerAdConfiguration;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            b.this.f55961a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void b() {
            b.this.c(this.f55965a, this.f55966b, this.f55967c, this.f55968d);
        }
    }

    public b(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        this.f55961a = mediationAdLoadCallback;
        this.f55964d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, String str, f0 f0Var, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        h0 h0VarB = this.f55964d.b(context, str, f0Var);
        this.f55963c = h0VarB;
        h0VarB.setAdListener(this);
        this.f55963c.setAdapterAdFormat("VungleBannerAd");
        d.a(this.f55963c, "VungleBannerAd-custom", str, mediationBannerAdConfiguration.getAdSize());
        d(this.f55963c, mediationBannerAdConfiguration);
    }

    protected abstract void d(h0 h0Var, MediationBannerAdConfiguration mediationBannerAdConfiguration);

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f55963c;
    }

    @Override // com.vungle.ads.h, com.vungle.ads.j
    public void onAdClicked(i iVar) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f55962b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f55962b.onAdOpened();
        }
    }

    @Override // com.vungle.ads.h, com.vungle.ads.j
    public void onAdEnd(i iVar) {
    }

    @Override // com.vungle.ads.h, com.vungle.ads.j
    public void onAdFailedToLoad(i iVar, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f55961a.onFailure(adError);
    }

    @Override // com.vungle.ads.h, com.vungle.ads.j
    public void onAdFailedToPlay(i iVar, VungleError vungleError) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
    }

    @Override // com.vungle.ads.h, com.vungle.ads.j
    public void onAdImpression(i iVar) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f55962b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.h, com.vungle.ads.j
    public void onAdLeftApplication(i iVar) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f55962b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.h, com.vungle.ads.j
    public void onAdLoaded(i iVar) {
        this.f55962b = (MediationBannerAdCallback) this.f55961a.onSuccess(this);
    }

    @Override // com.vungle.ads.h, com.vungle.ads.j
    public void onAdStart(i iVar) {
    }

    public void e(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        boolean zIsEmpty = TextUtils.isEmpty(string);
        String str = qEagQqzJZsd.vHOdCF;
        if (zIsEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", str);
            Log.e(VungleMediationAdapter.TAG, adError.getMessage());
            this.f55961a.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", str);
            Log.e(VungleMediationAdapter.TAG, adError2.getMessage());
            this.f55961a.onFailure(adError2);
        } else {
            Context context = mediationBannerAdConfiguration.getContext();
            c.a().b(string, context, new a(context, string2, VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(mediationBannerAdConfiguration.getAdSize(), string2), mediationBannerAdConfiguration));
        }
    }
}
