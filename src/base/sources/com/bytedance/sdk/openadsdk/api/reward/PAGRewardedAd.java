package com.bytedance.sdk.openadsdk.api.reward;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.dkl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class PAGRewardedAd implements PAGClientBidding, PangleAd {
    public static void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        ISDKTypeFactory iSDKTypeFactoryHnj = dkl.hnj(pAGRewardedAdLoadListener);
        if (iSDKTypeFactoryHnj != null) {
            iSDKTypeFactoryHnj.createADTypeLoaderFactory(str).createRewardAdLoader().loadAd(str, pAGRewardedRequest, pAGRewardedAdLoadListener);
        }
    }

    public abstract void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback);

    public abstract void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener);

    public abstract void show(Activity activity);

    public static void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, final PAGRewardedAdLoadCallback pAGRewardedAdLoadCallback) {
        loadAd(str, pAGRewardedRequest, new PAGRewardedAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
            public void onError(int i10, String str2) {
                pAGRewardedAdLoadCallback.onError(new PAGErrorModel(i10, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
                pAGRewardedAdLoadCallback.onAdLoaded(pAGRewardedAd);
            }
        });
    }
}
