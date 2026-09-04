package t8;

import android.util.Log;
import android.widget.FrameLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b extends r8.b {
    public b(MediationAdLoadCallback mediationAdLoadCallback) {
        super(mediationAdLoadCallback);
    }

    public void b(MediationBannerAdConfiguration mediationBannerAdConfiguration, q8.b bVar) {
        BannerSize bannerSizeA = r8.b.a(mediationBannerAdConfiguration.getAdSize(), mediationBannerAdConfiguration.getContext(), false, bVar);
        if (bannerSizeA == null) {
            AdError adErrorA = q8.e.a(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getAdSize()));
            Log.e(MintegralMediationAdapter.TAG, adErrorA.toString());
            this.f51149a.onFailure(adErrorA);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = com.google.ads.mediation.mintegral.a.g(string, string2);
        if (adErrorG != null) {
            this.f51149a.onFailure(adErrorG);
            return;
        }
        MBBannerView mBBannerView = new MBBannerView(mediationBannerAdConfiguration.getContext());
        this.f51150b = mBBannerView;
        mBBannerView.init(bannerSizeA, string2, string);
        this.f51150b.setLayoutParams(new FrameLayout.LayoutParams(com.google.ads.mediation.mintegral.a.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getWidth()), com.google.ads.mediation.mintegral.a.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getHeight())));
        this.f51150b.setBannerAdListener(this);
        this.f51150b.load();
    }
}
