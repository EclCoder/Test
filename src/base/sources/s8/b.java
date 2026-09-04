package s8;

import android.util.Log;
import android.widget.FrameLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import org.json.JSONException;
import org.json.JSONObject;
import q8.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b extends r8.b {
    public b(MediationAdLoadCallback mediationAdLoadCallback) {
        super(mediationAdLoadCallback);
    }

    public void b(MediationBannerAdConfiguration mediationBannerAdConfiguration, q8.b bVar) {
        BannerSize bannerSizeA = r8.b.a(mediationBannerAdConfiguration.getAdSize(), mediationBannerAdConfiguration.getContext(), true, bVar);
        if (bannerSizeA == null) {
            AdError adErrorA = q8.e.a(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getAdSize()));
            Log.e(MintegralMediationAdapter.TAG, adErrorA.toString());
            this.f51149a.onFailure(adErrorA);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        AdError adErrorH = com.google.ads.mediation.mintegral.a.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f51149a.onFailure(adErrorH);
            return;
        }
        MBBannerView mBBannerViewC = f.c(mediationBannerAdConfiguration.getContext());
        this.f51150b = mBBannerViewC;
        mBBannerViewC.init(bannerSizeA, string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationBannerAdConfiguration.getWatermark());
            this.f51150b.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding banner ad.", e10);
        }
        this.f51150b.setLayoutParams(new FrameLayout.LayoutParams(com.google.ads.mediation.mintegral.a.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getWidth()), com.google.ads.mediation.mintegral.a.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getHeight())));
        this.f51150b.setBannerAdListener(this);
        this.f51150b.loadFromBid(bidResponse);
    }
}
