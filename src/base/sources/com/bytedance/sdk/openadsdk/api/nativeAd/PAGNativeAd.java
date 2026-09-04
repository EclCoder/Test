package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.dkl;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class PAGNativeAd implements PAGClientBidding, PangleAd {
    public static void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        ISDKTypeFactory iSDKTypeFactoryHnj = dkl.hnj(pAGNativeAdLoadListener);
        if (iSDKTypeFactoryHnj != null) {
            iSDKTypeFactoryHnj.createADTypeLoaderFactory(str).createNativeAdLoader().loadAd(str, pAGNativeRequest, pAGNativeAdLoadListener);
        }
    }

    public abstract PAGNativeAdData getNativeAdData();

    public abstract void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback);

    public abstract void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener);

    public abstract void showPrivacyActivity();

    public static void loadAd(String str, PAGNativeRequest pAGNativeRequest, final PAGNativeAdLoadCallback pAGNativeAdLoadCallback) {
        loadAd(str, pAGNativeRequest, new PAGNativeAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
            public void onError(int i10, String str2) {
                pAGNativeAdLoadCallback.onError(new PAGErrorModel(i10, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGNativeAd pAGNativeAd) {
                pAGNativeAdLoadCallback.onAdLoaded(pAGNativeAd);
            }
        });
    }
}
