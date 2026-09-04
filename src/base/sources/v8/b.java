package v8;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b implements MediationBannerAd, PAGBannerAdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f55219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.b f55220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.c f55221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.a f55222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MediationBannerAdCallback f55223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    FrameLayout f55224f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.google.ads.mediation.pangle.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediationBannerAdConfiguration f55225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f55226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f55227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f55228d;

        /* JADX INFO: renamed from: v8.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0832a implements PAGBannerAdLoadListener {
            C0832a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGBannerAd pAGBannerAd) {
                pAGBannerAd.setAdInteractionListener(b.this);
                b.this.f55224f.addView(pAGBannerAd.getBannerView());
                b bVar = b.this;
                bVar.f55223e = (MediationBannerAdCallback) bVar.f55219a.onSuccess(b.this);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
            public void onError(int i10, String str) {
                AdError adErrorC = u8.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                b.this.f55219a.onFailure(adErrorC);
            }
        }

        a(MediationBannerAdConfiguration mediationBannerAdConfiguration, Context context, String str, String str2) {
            this.f55225a = mediationBannerAdConfiguration;
            this.f55226b = context;
            this.f55227c = str;
            this.f55228d = str2;
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            b.this.f55219a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void b() {
            PAGBannerSize pAGBannerSizeE = b.e(this.f55226b, this.f55225a.getAdSize());
            if (pAGBannerSizeE == null) {
                AdError adErrorA = u8.a.a(102, "Failed to request banner ad from Pangle. Invalid banner size.");
                Log.w(PangleMediationAdapter.TAG, adErrorA.toString());
                b.this.f55219a.onFailure(adErrorA);
            } else {
                b.this.f55224f = new FrameLayout(this.f55226b);
                PAGBannerRequest pAGBannerRequestC = b.this.f55222d.c(pAGBannerSizeE);
                pAGBannerRequestC.setAdString(this.f55227c);
                u8.b.a(pAGBannerRequestC, this.f55227c, this.f55225a);
                b.this.f55221c.e(this.f55228d, pAGBannerRequestC, new C0832a());
            }
        }
    }

    public b(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.b bVar, com.google.ads.mediation.pangle.c cVar, com.google.ads.mediation.pangle.a aVar) {
        this.f55219a = mediationAdLoadCallback;
        this.f55220b = bVar;
        this.f55221c = cVar;
        this.f55222d = aVar;
    }

    static PAGBannerSize e(Context context, AdSize adSize) {
        if (adSize == null) {
            return null;
        }
        int width = adSize.getWidth();
        PAGBannerSize pAGBannerSize = PAGBannerSize.BANNER_W_320_H_50;
        if (width == pAGBannerSize.getWidth() && adSize.getHeight() == pAGBannerSize.getHeight()) {
            return pAGBannerSize;
        }
        int width2 = adSize.getWidth();
        PAGBannerSize pAGBannerSize2 = PAGBannerSize.BANNER_W_300_H_250;
        if (width2 == pAGBannerSize2.getWidth() && adSize.getHeight() == pAGBannerSize2.getHeight()) {
            return pAGBannerSize2;
        }
        int width3 = adSize.getWidth();
        PAGBannerSize pAGBannerSize3 = PAGBannerSize.BANNER_W_728_H_90;
        if (width3 == pAGBannerSize3.getWidth() && adSize.getHeight() == pAGBannerSize3.getHeight()) {
            return pAGBannerSize3;
        }
        PAGBannerSize currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adSize.getWidth());
        return (adSize.getWidth() == currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() && adSize.getHeight() == currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) ? currentOrientationAnchoredAdaptiveBannerAdSize : PAGBannerSize.getInlineAdaptiveBannerAdSize(adSize.getWidth(), adSize.getHeight());
    }

    public void f(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = u8.a.a(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f55219a.onFailure(adErrorA);
        } else {
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            Context context = mediationBannerAdConfiguration.getContext();
            this.f55220b.b(context, serverParameters.getString("appid"), new a(mediationBannerAdConfiguration, context, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f55224f;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f55223e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f55223e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }
}
