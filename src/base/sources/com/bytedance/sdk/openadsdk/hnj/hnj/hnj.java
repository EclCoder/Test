package com.bytedance.sdk.openadsdk.hnj.hnj;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.ua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener hnj;

    public hnj(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.hnj = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
    public void onError(final int i10, final String str) {
        if (this.hnj == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnj.hnj.hnj.1
            @Override // java.lang.Runnable
            public void run() {
                hnj.this.hnj.onError(i10, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.hnj == null) {
            return;
        }
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnj.hnj.hnj.2
            @Override // java.lang.Runnable
            public void run() {
                hnj.this.hnj.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
