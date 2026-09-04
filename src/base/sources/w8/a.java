package w8;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.c;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.VungleError;
import com.vungle.ads.i;
import com.vungle.ads.q;
import com.vungle.ads.r;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements MediationAppOpenAd, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f55952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.ads.mediation.vungle.b f55953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q f55954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediationAppOpenAdCallback f55955d;

    /* JADX INFO: renamed from: w8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0857a implements c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f55957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediationAppOpenAdConfiguration f55958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f55959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f55960e;

        C0857a(Bundle bundle, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, Context context, String str) {
            this.f55957b = bundle;
            this.f55958c = mediationAppOpenAdConfiguration;
            this.f55959d = context;
            this.f55960e = str;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void a(AdError error) {
            s.h(error, "error");
            Log.w(VungleMediationAdapter.TAG, error.toString());
            a.this.f55952a.onFailure(error);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void b() {
            com.vungle.ads.b bVarA = a.this.f55953b.a();
            if (this.f55957b.containsKey("adOrientation")) {
                bVarA.setAdOrientation(this.f55957b.getInt("adOrientation", 2));
            }
            if (this.f55957b.containsKey("back_button_immediately_enabled")) {
                bVarA.setBackButtonImmediatelyEnabled(this.f55957b.getBoolean("back_button_immediately_enabled", false));
            }
            a.this.f(bVarA, this.f55958c);
            a aVar = a.this;
            com.google.ads.mediation.vungle.b bVar = aVar.f55953b;
            Context context = this.f55959d;
            String str = this.f55960e;
            s.e(str);
            aVar.f55954c = bVar.c(context, str, bVarA);
            q qVar = a.this.f55954c;
            q qVar2 = null;
            if (qVar == null) {
                s.w("appOpenAd");
                qVar = null;
            }
            qVar.setAdListener(a.this);
            q qVar3 = a.this.f55954c;
            if (qVar3 == null) {
                s.w("appOpenAd");
                qVar3 = null;
            }
            qVar3.setAdapterAdFormat("VungleAppOpenAd");
            q qVar4 = a.this.f55954c;
            if (qVar4 == null) {
                s.w("appOpenAd");
            } else {
                qVar2 = qVar4;
            }
            qVar2.load(a.this.e(this.f55958c));
        }
    }

    public a(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.b vungleFactory) {
        s.h(mediationAdLoadCallback, "mediationAdLoadCallback");
        s.h(vungleFactory, "vungleFactory");
        this.f55952a = mediationAdLoadCallback;
        this.f55953b = vungleFactory;
    }

    public abstract String e(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void f(com.vungle.ads.b bVar, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public final void g(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        s.h(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        s.g(mediationExtras, "getMediationExtras(...)");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        s.g(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString("appid");
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f55952a.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (string2 == null || string2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f55952a.onFailure(adError2);
        } else {
            Context context = mediationAppOpenAdConfiguration.getContext();
            s.g(context, "getContext(...)");
            c cVarA = c.a();
            s.e(string);
            cVarA.b(string, context, new C0857a(mediationExtras, mediationAppOpenAdConfiguration, context, string2));
        }
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdClicked(i baseAd) {
        s.h(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f55955d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdEnd(i baseAd) {
        s.h(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f55955d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdFailedToLoad(i baseAd, VungleError adError) {
        s.h(baseAd, "baseAd");
        s.h(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        s.g(adError2, "getAdError(...)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        this.f55952a.onFailure(adError2);
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdFailedToPlay(i baseAd, VungleError adError) {
        s.h(baseAd, "baseAd");
        s.h(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        s.g(adError2, "getAdError(...)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f55955d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError2);
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdImpression(i baseAd) {
        s.h(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f55955d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdLeftApplication(i baseAd) {
        s.h(baseAd, "baseAd");
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdLoaded(i baseAd) {
        s.h(baseAd, "baseAd");
        this.f55955d = (MediationAppOpenAdCallback) this.f55952a.onSuccess(this);
    }

    @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
    public void onAdStart(i baseAd) {
        s.h(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f55955d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        s.h(context, "context");
        q qVar = this.f55954c;
        q qVar2 = null;
        if (qVar == null) {
            s.w("appOpenAd");
            qVar = null;
        }
        if (qVar.canPlayAd().booleanValue()) {
            q qVar3 = this.f55954c;
            if (qVar3 == null) {
                s.w("appOpenAd");
            } else {
                qVar2 = qVar3;
            }
            qVar2.play(context);
            return;
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f55955d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }
}
