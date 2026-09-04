package p8;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.h;
import com.google.ads.mediation.inmobi.i;
import com.google.ads.mediation.inmobi.j;
import com.google.ads.mediation.inmobi.n;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c extends n8.c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f49587b;

        a(Context context, long j10) {
            this.f49586a = context;
            this.f49587b = j10;
        }

        @Override // com.google.ads.mediation.inmobi.j.a
        public void a(AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            if (((n8.c) c.this).f46930b != null) {
                ((n8.c) c.this).f46930b.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.j.a
        public void b() {
            c.this.a(this.f49586a, this.f49587b);
        }
    }

    public c(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, jVar, bVar);
    }

    @Override // n8.c
    public void b(n nVar) {
        h hVarA = i.a(this.f46929a.getContext(), this.f46929a.getMediationExtras(), "c_admob");
        nVar.l(hVarA.b());
        nVar.m(hVarA.a());
        nVar.i();
    }

    public void i() {
        Context context = this.f46929a.getContext();
        Bundle serverParameters = this.f46929a.getServerParameters();
        String string = serverParameters.getString("accountid");
        long jG = com.google.ads.mediation.inmobi.d.g(serverParameters);
        AdError adErrorJ = com.google.ads.mediation.inmobi.d.j(string, jG);
        if (adErrorJ != null) {
            this.f46930b.onFailure(adErrorJ);
        } else {
            this.f46933e.b(context, string, new a(context, jG));
        }
    }
}
