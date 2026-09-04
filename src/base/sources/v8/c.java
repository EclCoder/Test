package v8;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements MediationInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f55231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.b f55232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.c f55233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.a f55234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MediationInterstitialAdCallback f55235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PAGInterstitialAd f55236f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.google.ads.mediation.pangle.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f55237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediationInterstitialAdConfiguration f55238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f55239c;

        /* JADX INFO: renamed from: v8.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0833a implements PAGInterstitialAdLoadListener {
            C0833a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
                c cVar = c.this;
                cVar.f55235e = (MediationInterstitialAdCallback) cVar.f55231a.onSuccess(c.this);
                c.this.f55236f = pAGInterstitialAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
            public void onError(int i10, String str) {
                AdError adErrorC = u8.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                c.this.f55231a.onFailure(adErrorC);
            }
        }

        a(String str, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, String str2) {
            this.f55237a = str;
            this.f55238b = mediationInterstitialAdConfiguration;
            this.f55239c = str2;
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            c.this.f55231a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void b() {
            PAGInterstitialRequest pAGInterstitialRequestD = c.this.f55234d.d();
            pAGInterstitialRequestD.setAdString(this.f55237a);
            u8.b.a(pAGInterstitialRequestD, this.f55237a, this.f55238b);
            c.this.f55233c.f(this.f55239c, pAGInterstitialRequestD, new C0833a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements PAGInterstitialAdInteractionListener {
        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (c.this.f55235e != null) {
                c.this.f55235e.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (c.this.f55235e != null) {
                c.this.f55235e.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (c.this.f55235e != null) {
                c.this.f55235e.onAdOpened();
                c.this.f55235e.reportAdImpression();
            }
        }
    }

    public c(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.b bVar, com.google.ads.mediation.pangle.c cVar, com.google.ads.mediation.pangle.a aVar) {
        this.f55231a = mediationAdLoadCallback;
        this.f55232b = bVar;
        this.f55233c = cVar;
        this.f55234d = aVar;
    }

    public void g(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = u8.a.a(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f55231a.onFailure(adErrorA);
        } else {
            String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
            this.f55232b.b(mediationInterstitialAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationInterstitialAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f55236f.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f55236f.show((Activity) context);
        } else {
            this.f55236f.show(null);
        }
    }
}
