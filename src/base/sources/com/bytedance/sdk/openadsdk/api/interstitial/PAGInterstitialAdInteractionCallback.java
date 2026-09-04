package com.bytedance.sdk.openadsdk.api.interstitial;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class PAGInterstitialAdInteractionCallback implements PAGInterstitialAdInteractionListener {
    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
    }

    public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
    }
}
