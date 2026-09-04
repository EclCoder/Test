package t8;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;
import q8.f;
import q8.j;
import q8.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a extends r8.a {
    public a(MediationAdLoadCallback mediationAdLoadCallback, q8.a aVar) {
        super(mediationAdLoadCallback, aVar);
    }

    public void a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("ad_unit_id");
        String string2 = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = com.google.ads.mediation.mintegral.a.g(string, string2);
        if (adErrorG != null) {
            this.f51144a.onFailure(adErrorG);
            return;
        }
        if (this.f51148e.c()) {
            j jVar = new j(string, string2);
            this.f51145b = jVar;
            Map<j, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(jVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f51144a.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f51145b, new WeakReference<>(this));
        }
        k kVarF = f.f();
        this.f51147d = kVarF;
        kVarF.d(string2, string);
        this.f51147d.e(this);
        this.f51147d.f(this);
        this.f51147d.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Activity activity = (Activity) context;
        if (this.f51147d != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.f51147d.g(relativeLayout);
        }
    }
}
