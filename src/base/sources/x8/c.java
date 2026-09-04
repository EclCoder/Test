package x8;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.VungleError;
import com.vungle.ads.i;
import com.vungle.ads.q;
import com.vungle.ads.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements MediationInterstitialAd, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f56756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediationInterstitialAdCallback f56757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q f56758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.ads.mediation.vungle.b f56759d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.google.ads.mediation.vungle.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f56760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f56761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.vungle.ads.b f56762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f56763d;

        a(Context context, String str, com.vungle.ads.b bVar, String str2) {
            this.f56760a = context;
            this.f56761b = str;
            this.f56762c = bVar;
            this.f56763d = str2;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            c.this.f56756a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void b() {
            c cVar = c.this;
            cVar.f56758c = cVar.f56759d.c(this.f56760a, this.f56761b, this.f56762c);
            c.this.f56758c.setAdListener(c.this);
            c.this.f56758c.setAdapterAdFormat("VungleRtbInterstitialAd");
            c.this.f56758c.load(this.f56763d);
        }
    }

    public c(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        this.f56756a = mediationAdLoadCallback;
        this.f56759d = bVar;
    }

    public void e(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f56756a.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f56756a.onFailure(adError2);
            return;
        }
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        com.vungle.ads.b bVarA = this.f56759d.a();
        if (mediationExtras.containsKey("adOrientation")) {
            bVarA.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            bVarA.setWatermark(watermark);
        }
        Context context = mediationInterstitialAdConfiguration.getContext();
        com.google.ads.mediation.vungle.c.a().b(string, context, new a(context, string2, bVarA, bidResponse));
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdClicked(i iVar) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f56757b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdEnd(i iVar) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f56757b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdFailedToLoad(i iVar, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f56756a.onFailure(adError);
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdFailedToPlay(i iVar, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f56757b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdImpression(i iVar) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f56757b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdLeftApplication(i iVar) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f56757b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdLoaded(i iVar) {
        this.f56757b = (MediationInterstitialAdCallback) this.f56756a.onSuccess(this);
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdStart(i iVar) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f56757b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        q qVar = this.f56758c;
        if (qVar != null) {
            qVar.play(context);
        } else if (this.f56757b != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f56757b.onAdFailedToShow(adError);
        }
    }
}
