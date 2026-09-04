package p8;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.e;
import com.google.ads.mediation.inmobi.g;
import com.google.ads.mediation.inmobi.h;
import com.google.ads.mediation.inmobi.i;
import com.google.ads.mediation.inmobi.j;
import com.google.ads.mediation.inmobi.q;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a extends n8.a {

    /* JADX INFO: renamed from: p8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0764a implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdSize f49580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediationBannerAdConfiguration f49581c;

        C0764a(Context context, AdSize adSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
            this.f49579a = context;
            this.f49580b = adSize;
            this.f49581c = mediationBannerAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.j.a
        public void a(AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            ((n8.a) a.this).f46919a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.inmobi.j.a
        public void b() {
            a.this.a(this.f49579a, this.f49580b, this.f49581c);
        }
    }

    public a(MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        super(mediationAdLoadCallback, jVar, bVar);
    }

    @Override // n8.a
    public void b(e eVar, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        h hVarA = i.a(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getMediationExtras(), "c_admob");
        eVar.f(hVarA.b());
        eVar.g(hVarA.a());
        eVar.b();
    }

    public void i(MediationBannerAdConfiguration mediationBannerAdConfiguration, q qVar) {
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSizeB = com.google.ads.mediation.inmobi.d.b(context, mediationBannerAdConfiguration.getAdSize(), qVar);
        if (adSizeB == null) {
            AdError adErrorA = g.a(102, String.format("The requested banner size: %s is not supported by InMobi SDK.", mediationBannerAdConfiguration.getAdSize()));
            Log.e(InMobiMediationAdapter.TAG, adErrorA.toString());
            this.f46919a.onFailure(adErrorA);
            return;
        }
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorJ = com.google.ads.mediation.inmobi.d.j(string, com.google.ads.mediation.inmobi.d.g(serverParameters));
        if (adErrorJ != null) {
            this.f46919a.onFailure(adErrorJ);
        } else {
            this.f46920b.b(context, string, new C0764a(context, adSizeB, mediationBannerAdConfiguration));
        }
    }
}
