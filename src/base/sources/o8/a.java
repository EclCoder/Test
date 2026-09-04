package o8;

import android.content.Context;
import com.google.ads.mediation.inmobi.e;
import com.google.ads.mediation.inmobi.h;
import com.google.ads.mediation.inmobi.i;
import com.google.ads.mediation.inmobi.j;
import com.google.ads.mediation.inmobi.q;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a extends n8.a {
    public a(MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        super(mediationAdLoadCallback, jVar, bVar);
    }

    @Override // n8.a
    public void b(e eVar, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        h hVarA = i.a(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getMediationExtras(), "c_google");
        eVar.f(hVarA.b());
        eVar.g(hVarA.a());
        eVar.c(mediationBannerAdConfiguration.getBidResponse().getBytes());
    }

    public void g(MediationBannerAdConfiguration mediationBannerAdConfiguration, q qVar) {
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSizeB = com.google.ads.mediation.inmobi.d.b(context, mediationBannerAdConfiguration.getAdSize(), qVar);
        if (adSizeB == null) {
            adSizeB = mediationBannerAdConfiguration.getAdSize();
        }
        a(context, adSizeB, mediationBannerAdConfiguration);
    }
}
