package t8;

import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import com.mbridge.msdk.out.MBNativeHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d extends r8.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MBNativeHandler f53162e;

    public d(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    public void c(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        String string = mediationNativeAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationNativeAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = com.google.ads.mediation.mintegral.a.g(string, string2);
        if (adErrorG != null) {
            this.f51158b.onFailure(adErrorG);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        MBNativeHandler mBNativeHandler = new MBNativeHandler(nativeProperties, mediationNativeAdConfiguration.getContext());
        this.f53162e = mBNativeHandler;
        mBNativeHandler.setAdListener(new r8.e(this, mediationNativeAdConfiguration.getContext(), this.f51158b));
        this.f53162e.load();
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
        MBNativeHandler mBNativeHandler = this.f53162e;
        if (mBNativeHandler != null) {
            mBNativeHandler.registerView(view, arrayList, this.f51157a);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        MBNativeHandler mBNativeHandler = this.f53162e;
        if (mBNativeHandler != null) {
            mBNativeHandler.unregisterView(view, b(view), this.f51157a);
        }
    }
}
