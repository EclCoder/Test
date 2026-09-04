package m8;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import l8.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a implements MediationBannerAd, AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f45333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdView f45334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f45335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediationBannerAdCallback f45336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f45337e;

    public a(MediationAdLoadCallback mediationAdLoadCallback, e eVar) {
        this.f45333a = mediationAdLoadCallback;
        this.f45337e = eVar;
    }

    public void a(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        String placementID = FacebookMediationAdapter.getPlacementID(mediationBannerAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f45333a.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationBannerAdConfiguration);
        try {
            this.f45334b = this.f45337e.d(mediationBannerAdConfiguration.getContext(), placementID, mediationBannerAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationBannerAdConfiguration.getWatermark())) {
                this.f45334b.setExtraHints(new ExtraHints.Builder().mediationData(mediationBannerAdConfiguration.getWatermark()).build());
            }
            Context context = mediationBannerAdConfiguration.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mediationBannerAdConfiguration.getAdSize().getWidthInPixels(context), -2);
            this.f45335c = new FrameLayout(context);
            this.f45334b.setLayoutParams(layoutParams);
            this.f45335c.addView(this.f45334b);
            AdView adView = this.f45334b;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(mediationBannerAdConfiguration.getBidResponse()).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(111, "Failed to create banner ad: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f45333a.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f45335c;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f45336d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f45336d.onAdOpened();
            this.f45336d.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        this.f45336d = (MediationBannerAdCallback) this.f45333a.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.f45333a.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f45336d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
