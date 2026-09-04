package com.google.ads.mediation.pangle;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c {
    void a(Context context, PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGSdk.getBiddingToken(context, pAGBiddingRequest, pAGBidCallback);
    }

    String b() {
        return PAGSdk.getSDKVersion();
    }

    public void c(Context context, PAGConfig pAGConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        PAGSdk.init(context, pAGConfig, pAGInitCallback);
    }

    public void d(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        PAGAppOpenAd.loadAd(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener);
    }

    public void e(String str, PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        PAGBannerAd.loadAd(str, pAGBannerRequest, pAGBannerAdLoadListener);
    }

    public void f(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        PAGInterstitialAd.loadAd(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener);
    }

    public void g(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        PAGNativeAd.loadAd(str, pAGNativeRequest, pAGNativeAdLoadListener);
    }

    public void h(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        PAGRewardedAd.loadAd(str, pAGRewardedRequest, pAGRewardedAdLoadListener);
    }

    void i(int i10) {
        PAGConfig.setPAConsent(i10);
    }

    void j(String str) {
        PAGConfig.setUserData(str);
    }
}
