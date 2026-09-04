package s8;

import android.util.Log;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d extends r8.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MBBidNativeHandler f51506e;

    public d(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    public void c(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        String string = mediationNativeAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationNativeAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        AdError adErrorH = com.google.ads.mediation.mintegral.a.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f51158b.onFailure(adErrorH);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        this.f51506e = new MBBidNativeHandler(nativeProperties, mediationNativeAdConfiguration.getContext());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationNativeAdConfiguration.getWatermark());
            this.f51506e.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding native ad.", e10);
        }
        this.f51506e.setAdListener(new r8.e(this, mediationNativeAdConfiguration.getContext(), this.f51158b));
        this.f51506e.bidLoad(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) {
        HashMap map3 = new HashMap(map);
        map3.remove("3011");
        map3.remove("3012");
        ArrayList arrayList = new ArrayList(map3.values());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View view2 = (View) arrayList.get(i10);
            if (view2 instanceof MediaView) {
                MediaView mediaView = (MediaView) view2;
                for (int i11 = 0; i11 < mediaView.getChildCount(); i11++) {
                    View childAt = mediaView.getChildAt(i11);
                    if (childAt instanceof MBMediaView) {
                        ((MBMediaView) childAt).setOnMediaViewListener(this);
                        break;
                    }
                }
                break;
            }
        }
        MBBidNativeHandler mBBidNativeHandler = this.f51506e;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.registerView(view, arrayList, this.f51157a);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        MBBidNativeHandler mBBidNativeHandler = this.f51506e;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.unregisterView(view, b(view), this.f51157a);
        }
    }
}
