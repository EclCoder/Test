package o8;

import com.google.ads.mediation.inmobi.h;
import com.google.ads.mediation.inmobi.i;
import com.google.ads.mediation.inmobi.j;
import com.google.ads.mediation.inmobi.n;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c extends n8.c {
    public c(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, jVar, bVar);
    }

    @Override // n8.c
    public void b(n nVar) {
        h hVarA = i.a(this.f46929a.getContext(), this.f46929a.getMediationExtras(), "c_google");
        nVar.l(hVarA.b());
        nVar.m(hVarA.a());
        nVar.j(this.f46929a.getBidResponse().getBytes());
    }

    public void f() {
        a(this.f46929a.getContext(), com.google.ads.mediation.inmobi.d.g(this.f46929a.getServerParameters()));
    }
}
