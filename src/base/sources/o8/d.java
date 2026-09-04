package o8;

import com.google.ads.mediation.inmobi.h;
import com.google.ads.mediation.inmobi.i;
import com.google.ads.mediation.inmobi.j;
import com.google.ads.mediation.inmobi.k;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d extends n8.d {
    public d(MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        super(mediationAdLoadCallback, jVar, bVar);
    }

    @Override // n8.d
    protected void b(k kVar, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        h hVarA = i.a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration.getMediationExtras(), "c_google");
        kVar.d(hVarA.b());
        kVar.e(hVarA.a());
        kVar.c(mediationRewardedAdConfiguration.getBidResponse().getBytes());
    }

    public void h(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration);
    }
}
