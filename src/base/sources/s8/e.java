package s8;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import q8.j;
import r8.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q8.d f51507f;

    public e(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, q8.a aVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        AdError adErrorH = com.google.ads.mediation.mintegral.a.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f51168a.onFailure(adErrorH);
            return;
        }
        if (this.f51172e.c()) {
            j jVar = new j(string, string2);
            this.f51169b = jVar;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(jVar, new WeakReference<>(this));
        }
        q8.d dVarD = q8.f.d();
        this.f51507f = dVarD;
        dVarD.a(mediationRewardedAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationRewardedAdConfiguration.getWatermark());
            this.f51507f.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding rewarded video ad.", e10);
        }
        this.f51507f.b(this);
        this.f51507f.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f51507f.playVideoMute(this.f51171d ? 1 : 2);
        this.f51507f.showFromBid();
    }
}
