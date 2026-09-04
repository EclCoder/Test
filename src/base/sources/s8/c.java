package s8;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import q8.f;
import q8.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c extends r8.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q8.c f51505f;

    public c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, q8.a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        AdError adErrorH = com.google.ads.mediation.mintegral.a.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f51152a.onFailure(adErrorH);
            return;
        }
        if (this.f51156e.c()) {
            j jVar = new j(string, string2);
            this.f51153b = jVar;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(jVar, new WeakReference<>(this));
        }
        q8.c cVarA = f.a();
        this.f51505f = cVarA;
        cVarA.a(mediationInterstitialAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationInterstitialAdConfiguration.getWatermark());
            this.f51505f.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding interstitial ad.", e10);
        }
        this.f51505f.b(this);
        this.f51505f.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f51505f.playVideoMute(this.f51155d ? 1 : 2);
        this.f51505f.showFromBid();
    }
}
