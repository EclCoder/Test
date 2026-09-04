package com.bytedance.sdk.openadsdk.sk;

import android.text.TextUtils;
import com.bytedance.sdk.component.aq.hn.qor;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.component.reward.dkl;
import com.bytedance.sdk.openadsdk.component.reward.jip;
import com.bytedance.sdk.openadsdk.component.reward.ojm;
import com.bytedance.sdk.openadsdk.component.reward.uua;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm.dse;
import com.bytedance.sdk.openadsdk.hnj.hn.sk;
import com.bytedance.sdk.openadsdk.utils.hn;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.sk.hnj.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, final PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.hnj.hnj.hnj(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.hnj.hnj.hnj(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                final PAGBannerSize adSize = pAGBannerRequest.getAdSize();
                if (adSize != null) {
                    if (adSize.getType() == 3) {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getMaxHeight());
                    } else {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                    }
                    codeId.setBannerType(adSize.getType());
                }
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.hnj.hnj.hnj hnjVar = new com.bytedance.sdk.openadsdk.hnj.hnj.hnj(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.hnj.hnj.hnj(new qor("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.sk.hnj.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!oj.gjv().jip() && orp.xyo()) {
                            hnjVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.hnj.hnj.hnj(hnjVar)) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = adSize;
                        if (pAGBannerSize != null && ((pAGBannerSize.getType() == 2 || adSize.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest.getAdString()))) {
                            int iGjv = sq.gjv(oj.hnj());
                            int iDse = sq.dse(oj.hnj());
                            int height = adSize.getType() == 2 ? adSize.getHeight() : adSize.getMaxHeight();
                            if (adSize.getWidth() > iGjv || adSize.getWidth() <= 0 || height > iDse || height < 0) {
                                hnjVar.onError(-19, "The banner size invalid width=" + adSize.getWidth() + ",height=" + height);
                                return;
                            }
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            hnjVar.onError(-4, "adslot is null");
                        } else {
                            adSlot.setDurationSlotType(1);
                            dse.hnj(oj.hnj()).hnj(adSlotBuild, 1, hnjVar);
                        }
                    }
                }, hnjVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.sk.hnj.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.hnj.hnj.hnj(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.hnj.hnj.hnj(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot adSlotBuild = codeId.build();
                final com.bytedance.sdk.openadsdk.hnj.qor.hnj hnjVar = new com.bytedance.sdk.openadsdk.hnj.qor.hnj(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.hnj.hnj.hnj(new qor("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.sk.hnj.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!oj.gjv().jip() && orp.xyo()) {
                            hnjVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.hnj.hnj.hnj(hnjVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            hnjVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(8);
                            if (hn.hn()) {
                                com.bytedance.sdk.openadsdk.component.reward.dse.hnj(oj.hnj()).hnj(adSlotBuild, new com.bytedance.sdk.openadsdk.component.qor.hn(hnjVar));
                            } else {
                                dkl.hnj(oj.hnj()).hnj(adSlotBuild, new com.bytedance.sdk.openadsdk.component.qor.hn(hnjVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, hnjVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.sk.hnj.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.hnj.hnj.hnj(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final sk skVar = new sk(pAGNativeAdLoadListener);
                AdSlot.Builder builderWithBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.hnj.hnj.hnj(builderWithBid, pAGNativeRequest);
                final AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.hnj.hnj.hnj(new qor("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.sk.hnj.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!oj.gjv().jip() && orp.xyo()) {
                            skVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.hnj.hnj.hnj(skVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            skVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(5);
                            com.bytedance.sdk.openadsdk.component.hn.hnj.hnj().hnj(oj.hnj(), adSlotBuild, skVar);
                        } catch (Throwable unused) {
                        }
                    }
                }, skVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.sk.hnj.1

            /* JADX INFO: renamed from: hn, reason: collision with root package name */
            private int f14603hn;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.hnj.hnj.hnj(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.hnj.hnj.hnj(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.f14603hn = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.hnj.gjv.hnj hnjVar = new com.bytedance.sdk.openadsdk.hnj.gjv.hnj(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.hnj.hnj.hnj(new qor("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.sk.hnj.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!oj.gjv().jip() && orp.xyo()) {
                                hnjVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.hnj.hnj.hnj(hnjVar)) {
                                return;
                            }
                            AdSlot adSlot = adSlotBuild;
                            if (adSlot == null) {
                                hnjVar.onError(-4, "adslot is null");
                            } else {
                                adSlot.setDurationSlotType(3);
                                com.bytedance.sdk.openadsdk.component.dse.hnj(oj.hnj()).hnj(adSlotBuild, hnjVar, AnonymousClass1.this.f14603hn);
                            }
                        } catch (Throwable th2) {
                            apu.hnj("ADNFactory", "open component maybe not exist, please check", th2);
                        }
                    }
                }, hnjVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.sk.hnj.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.hnj.hnj.hnj(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.hnj.hnj.hnj(codeId, pAGRewardedRequest);
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.hnj.sk.hn hnVar = new com.bytedance.sdk.openadsdk.hnj.sk.hn(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.hnj.hnj.hnj(new qor("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.sk.hnj.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!oj.gjv().jip() && orp.xyo()) {
                            hnVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.hnj.hnj.hnj(hnVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            hnVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(7);
                            if (hn.hn()) {
                                uua.hnj(oj.hnj()).hnj(adSlotBuild, new ojm(hnVar));
                            } else {
                                jip.hnj(oj.hnj()).hnj(adSlotBuild, new ojm(hnVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, hnVar, adSlotBuild);
            }
        };
    }
}
