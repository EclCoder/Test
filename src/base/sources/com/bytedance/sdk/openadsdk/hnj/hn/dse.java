package com.bytedance.sdk.openadsdk.hnj.hn;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.ua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse implements dkl {
    private final PAGNativeAdInteractionListener hnj;

    public dse(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.hnj = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.hn.dkl
    public boolean hn() {
        return this.hnj != null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.dse.1
            @Override // java.lang.Runnable
            public void run() {
                if (dse.this.hnj != null) {
                    dse.this.hnj.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.hn.dkl
    public void hnj(PAGNativeAd pAGNativeAd) {
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.dse.2
            @Override // java.lang.Runnable
            public void run() {
                if (dse.this.hnj != null) {
                    dse.this.hnj.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.hn.dkl
    public void hnj() {
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.dse.3
            @Override // java.lang.Runnable
            public void run() {
                if (dse.this.hnj != null) {
                    dse.this.hnj.onAdDismissed();
                }
            }
        });
    }
}
