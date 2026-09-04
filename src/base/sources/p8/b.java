package p8;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.h;
import com.google.ads.mediation.inmobi.i;
import com.google.ads.mediation.inmobi.j;
import com.google.ads.mediation.inmobi.k;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b extends n8.b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediationInterstitialAdConfiguration f49584b;

        a(Context context, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
            this.f49583a = context;
            this.f49584b = mediationInterstitialAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.j.a
        public void a(AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            if (((n8.b) b.this).f46925b != null) {
                ((n8.b) b.this).f46925b.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.j.a
        public void b() {
            b.this.a(this.f49583a, this.f49584b);
        }
    }

    public b(MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        super(mediationAdLoadCallback, jVar, bVar);
    }

    @Override // n8.b
    protected void b(k kVar, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        h hVarA = i.a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getMediationExtras(), "c_admob");
        kVar.d(hVarA.b());
        kVar.e(hVarA.a());
        kVar.b();
    }

    public void k(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorJ = com.google.ads.mediation.inmobi.d.j(string, com.google.ads.mediation.inmobi.d.g(serverParameters));
        if (adErrorJ != null) {
            this.f46925b.onFailure(adErrorJ);
        } else {
            this.f46926c.b(context, string, new a(context, mediationInterstitialAdConfiguration));
        }
    }
}
