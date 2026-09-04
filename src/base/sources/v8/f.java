package v8;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f implements MediationRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f55260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.b f55261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.c f55262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.a f55263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MediationRewardedAdCallback f55264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PAGRewardedAd f55265f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.google.ads.mediation.pangle.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f55266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediationRewardedAdConfiguration f55267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f55268c;

        /* JADX INFO: renamed from: v8.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0836a implements PAGRewardedAdLoadListener {
            C0836a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
                f fVar = f.this;
                fVar.f55264e = (MediationRewardedAdCallback) fVar.f55260a.onSuccess(f.this);
                f.this.f55265f = pAGRewardedAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
            public void onError(int i10, String str) {
                AdError adErrorC = u8.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                f.this.f55260a.onFailure(adErrorC);
            }
        }

        a(String str, MediationRewardedAdConfiguration mediationRewardedAdConfiguration, String str2) {
            this.f55266a = str;
            this.f55267b = mediationRewardedAdConfiguration;
            this.f55268c = str2;
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            f.this.f55260a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void b() {
            PAGRewardedRequest pAGRewardedRequestF = f.this.f55263d.f();
            pAGRewardedRequestF.setAdString(this.f55266a);
            u8.b.a(pAGRewardedRequestF, this.f55266a, this.f55267b);
            f.this.f55262c.h(this.f55268c, pAGRewardedRequestF, new C0836a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements PAGRewardedAdInteractionListener {
        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (f.this.f55264e != null) {
                f.this.f55264e.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (f.this.f55264e != null) {
                f.this.f55264e.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (f.this.f55264e != null) {
                f.this.f55264e.onAdOpened();
                f.this.f55264e.reportAdImpression();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
            if (f.this.f55264e != null) {
                f.this.f55264e.onUserEarnedReward();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedRewardFail(int i10, String str) {
            Log.d(PangleMediationAdapter.TAG, u8.a.c(i10, String.format("Failed to reward user: %s", str)).toString());
        }
    }

    public f(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.b bVar, com.google.ads.mediation.pangle.c cVar, com.google.ads.mediation.pangle.a aVar) {
        this.f55260a = mediationAdLoadCallback;
        this.f55261b = bVar;
        this.f55262c = cVar;
        this.f55263d = aVar;
    }

    public void g(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = u8.a.a(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f55260a.onFailure(adErrorA);
        } else {
            String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
            this.f55261b.b(mediationRewardedAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationRewardedAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f55265f.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f55265f.show((Activity) context);
        } else {
            this.f55265f.show(null);
        }
    }
}
