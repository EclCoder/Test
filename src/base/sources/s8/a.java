package s8;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import q8.f;
import q8.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a extends r8.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f51504f;

    public a(MediationAdLoadCallback mediationAdLoadCallback, q8.a aVar) {
        super(mediationAdLoadCallback, aVar);
    }

    private void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, str);
            this.f51147d.setExtraInfo(jSONObject);
        } catch (JSONException e10) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding app open ad.", e10);
        }
    }

    public void a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("ad_unit_id");
        String string2 = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        this.f51504f = bidResponse;
        AdError adErrorH = com.google.ads.mediation.mintegral.a.h(string, string2, bidResponse);
        if (adErrorH != null) {
            this.f51144a.onFailure(adErrorH);
            return;
        }
        if (this.f51148e.c()) {
            j jVar = new j(string, string2);
            this.f51145b = jVar;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(jVar, new WeakReference<>(this));
        }
        this.f51147d = f.f();
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            b(watermark);
        }
        this.f51147d.d(string2, string);
        this.f51147d.e(this);
        this.f51147d.f(this);
        this.f51147d.c(this.f51504f);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Activity activity = (Activity) context;
        if (this.f51147d != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.f51147d.b(relativeLayout, this.f51504f);
        }
    }
}
