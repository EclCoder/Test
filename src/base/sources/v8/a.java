package v8;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a implements MediationAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f55207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.b f55208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.c f55209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.a f55210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MediationAppOpenAdCallback f55211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PAGAppOpenAd f55212f;

    /* JADX INFO: renamed from: v8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0830a implements com.google.ads.mediation.pangle.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f55213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediationAppOpenAdConfiguration f55214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f55215c;

        /* JADX INFO: renamed from: v8.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0831a implements PAGAppOpenAdLoadListener {
            C0831a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
                a aVar = a.this;
                aVar.f55211e = (MediationAppOpenAdCallback) aVar.f55207a.onSuccess(a.this);
                a.this.f55212f = pAGAppOpenAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
            public void onError(int i10, String str) {
                AdError adErrorC = u8.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                a.this.f55207a.onFailure(adErrorC);
            }
        }

        C0830a(String str, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, String str2) {
            this.f55213a = str;
            this.f55214b = mediationAppOpenAdConfiguration;
            this.f55215c = str2;
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            a.this.f55207a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void b() {
            PAGAppOpenRequest pAGAppOpenRequestB = a.this.f55210d.b();
            pAGAppOpenRequestB.setAdString(this.f55213a);
            u8.b.a(pAGAppOpenRequestB, this.f55213a, this.f55214b);
            a.this.f55209c.d(this.f55215c, pAGAppOpenRequestB, new C0831a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements PAGAppOpenAdInteractionListener {
        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (a.this.f55211e != null) {
                a.this.f55211e.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (a.this.f55211e != null) {
                a.this.f55211e.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (a.this.f55211e != null) {
                a.this.f55211e.onAdOpened();
                a.this.f55211e.reportAdImpression();
            }
        }
    }

    public a(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.b bVar, com.google.ads.mediation.pangle.c cVar, com.google.ads.mediation.pangle.a aVar) {
        this.f55207a = mediationAdLoadCallback;
        this.f55208b = bVar;
        this.f55209c = cVar;
        this.f55210d = aVar;
    }

    public void g(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = u8.a.a(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f55207a.onFailure(adErrorA);
        } else {
            String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
            this.f55208b.b(mediationAppOpenAdConfiguration.getContext(), serverParameters.getString("appid"), new C0830a(bidResponse, mediationAppOpenAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        this.f55212f.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f55212f.show((Activity) context);
        } else {
            this.f55212f.show(null);
        }
    }
}
