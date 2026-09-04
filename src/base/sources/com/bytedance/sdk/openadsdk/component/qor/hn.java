package com.bytedance.sdk.openadsdk.component.qor;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.ua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener hnj;

    public hn(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.hnj = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.hnj != null) {
            ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.qor.hn.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = hn.this.hnj;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
    public void onError(final int i10, final String str) {
        if (this.hnj != null) {
            ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.qor.hn.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = hn.this.hnj;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i10, str);
                    }
                }
            });
        }
    }
}
