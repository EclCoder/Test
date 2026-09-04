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
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d extends n8.d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediationRewardedAdConfiguration f49590b;

        a(Context context, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
            this.f49589a = context;
            this.f49590b = mediationRewardedAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.j.a
        public void a(AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            if (((n8.d) d.this).f46938b != null) {
                ((n8.d) d.this).f46938b.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.j.a
        public void b() {
            d.this.a(this.f49589a, this.f49590b);
        }
    }

    public d(MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        super(mediationAdLoadCallback, jVar, bVar);
    }

    @Override // n8.d
    protected void b(k kVar, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        h hVarA = i.a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration.getMediationExtras(), "c_admob");
        kVar.d(hVarA.b());
        kVar.e(hVarA.a());
        kVar.b();
    }

    public void k(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorJ = com.google.ads.mediation.inmobi.d.j(string, com.google.ads.mediation.inmobi.d.g(serverParameters));
        if (adErrorJ != null) {
            this.f46938b.onFailure(adErrorJ);
        } else {
            this.f46939c.b(context, string, new a(context, mediationRewardedAdConfiguration));
        }
    }
}
