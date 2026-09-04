package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends hnj<PAGInterstitialAdLoadListener, TTClientBidding> {
    dse(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    protected int dkl() {
        return 5;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    protected int hn() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public TTClientBidding hnj(Context context, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, AdSlot adSlot) {
        return new oj(context, hnjVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    public void hn(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof oj) {
            ((oj) tTClientBidding).hn();
        }
    }

    public static dse hnj(Context context) {
        return (dse) apu.hnj(context, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    protected mjg hnj() {
        return mjg.hnj(this.hnj, mjg.hnj.FULL_SCREEN_VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    public Object hnj(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof oj) {
            return ((oj) tTClientBidding).hnj();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    public void hnj(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, int i10, String str) {
        pAGInterstitialAdLoadListener.onError(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    public void hnj(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, Object obj) {
        if (pAGInterstitialAdLoadListener == null || obj == null || !(obj instanceof PAGInterstitialAd)) {
            return;
        }
        pAGInterstitialAdLoadListener.onAdLoaded((PAGInterstitialAd) obj);
    }
}
