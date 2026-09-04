package t8;

import android.content.Context;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;
import q8.i;
import q8.j;
import r8.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f53163f;

    public e(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, q8.a aVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = com.google.ads.mediation.mintegral.a.g(string, string2);
        if (adErrorG != null) {
            this.f51168a.onFailure(adErrorG);
            return;
        }
        if (this.f51172e.c()) {
            j jVar = new j(string, string2);
            this.f51169b = jVar;
            Map<j, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(jVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f51168a.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f51169b, new WeakReference<>(this));
        }
        i iVarE = q8.f.e();
        this.f53163f = iVarE;
        iVarE.a(mediationRewardedAdConfiguration.getContext(), string2, string);
        this.f53163f.b(this);
        this.f53163f.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f53163f.playVideoMute(this.f51171d ? 1 : 2);
        this.f53163f.show();
    }
}
