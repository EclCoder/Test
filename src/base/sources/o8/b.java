package o8;

import com.google.ads.mediation.inmobi.h;
import com.google.ads.mediation.inmobi.i;
import com.google.ads.mediation.inmobi.j;
import com.google.ads.mediation.inmobi.k;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b extends n8.b {
    public b(MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        super(mediationAdLoadCallback, jVar, bVar);
    }

    @Override // n8.b
    protected void b(k kVar, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        h hVarA = i.a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getMediationExtras(), "c_google");
        kVar.d(hVarA.b());
        kVar.e(hVarA.a());
        kVar.c(mediationInterstitialAdConfiguration.getBidResponse().getBytes());
    }

    public void h(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration);
    }
}
