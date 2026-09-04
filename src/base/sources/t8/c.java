package t8;

import android.content.Context;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;
import q8.f;
import q8.h;
import q8.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c extends r8.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f53161f;

    public c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, q8.a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = com.google.ads.mediation.mintegral.a.g(string, string2);
        if (adErrorG != null) {
            this.f51152a.onFailure(adErrorG);
            return;
        }
        if (this.f51156e.c()) {
            j jVar = new j(string, string2);
            this.f51153b = jVar;
            Map<j, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(jVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f51152a.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f51153b, new WeakReference<>(this));
        }
        h hVarB = f.b();
        this.f53161f = hVarB;
        hVarB.a(mediationInterstitialAdConfiguration.getContext(), string2, string);
        this.f53161f.b(this);
        this.f53161f.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f53161f.playVideoMute(this.f51155d ? 1 : 2);
        this.f53161f.show();
    }
}
