package com.google.ads.mediation.pangle;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import v8.d;
import v8.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    PAGConfig.Builder a() {
        return new PAGConfig.Builder();
    }

    public PAGAppOpenRequest b() {
        return new PAGAppOpenRequest();
    }

    public PAGBannerRequest c(PAGBannerSize pAGBannerSize) {
        return new PAGBannerRequest(pAGBannerSize);
    }

    public PAGInterstitialRequest d() {
        return new PAGInterstitialRequest();
    }

    public PAGNativeRequest e() {
        return new PAGNativeRequest();
    }

    public PAGRewardedRequest f() {
        return new PAGRewardedRequest();
    }

    v8.a g(MediationAdLoadCallback mediationAdLoadCallback, b bVar, c cVar) {
        return new v8.a(mediationAdLoadCallback, bVar, cVar, this);
    }

    v8.b h(MediationAdLoadCallback mediationAdLoadCallback, b bVar, c cVar) {
        return new v8.b(mediationAdLoadCallback, bVar, cVar, this);
    }

    v8.c i(MediationAdLoadCallback mediationAdLoadCallback, b bVar, c cVar) {
        return new v8.c(mediationAdLoadCallback, bVar, cVar, this);
    }

    d j(MediationAdLoadCallback mediationAdLoadCallback, b bVar, c cVar) {
        return new d(mediationAdLoadCallback, bVar, cVar, this);
    }

    f k(MediationAdLoadCallback mediationAdLoadCallback, b bVar, c cVar) {
        return new f(mediationAdLoadCallback, bVar, cVar, this);
    }
}
