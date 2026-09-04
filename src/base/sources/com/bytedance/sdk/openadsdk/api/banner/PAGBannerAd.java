package com.bytedance.sdk.openadsdk.api.banner;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.dkl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class PAGBannerAd implements PAGClientBidding, PangleAd {
    public static void loadAd(String str, PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        ISDKTypeFactory iSDKTypeFactoryHnj = dkl.hnj(pAGBannerAdLoadListener);
        if (iSDKTypeFactoryHnj != null) {
            iSDKTypeFactoryHnj.createADTypeLoaderFactory(str).createBannerAdLoader().loadAd(str, pAGBannerRequest, pAGBannerAdLoadListener);
        }
    }

    public abstract void destroy();

    public abstract PAGBannerSize getBannerSize();

    public abstract View getBannerView();

    public abstract void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback);

    public abstract void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener);

    public static void loadAd(String str, PAGBannerRequest pAGBannerRequest, final PAGBannerAdLoadCallback pAGBannerAdLoadCallback) {
        loadAd(str, pAGBannerRequest, new PAGBannerAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
            public void onError(int i10, String str2) {
                pAGBannerAdLoadCallback.onError(new PAGErrorModel(i10, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGBannerAd pAGBannerAd) {
                pAGBannerAdLoadCallback.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
