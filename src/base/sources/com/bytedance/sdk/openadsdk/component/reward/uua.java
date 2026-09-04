package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua extends hnj<PAGRewardedAdLoadListener, TTClientBidding> {
    uua(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    protected int dkl() {
        return 6;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    protected int hn() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public TTClientBidding hnj(Context context, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, AdSlot adSlot) {
        return new xn(context, hnjVar, adSlot);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    public void hn(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof xn) {
            ((xn) tTClientBidding).hn();
        }
    }

    public static uua hnj(Context context) {
        return (uua) apu.hnj(context, 7);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    protected mjg hnj() {
        return mjg.hnj(this.hnj, mjg.hnj.REWARD_VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    public Object hnj(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof xn) {
            return ((xn) tTClientBidding).hnj();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    public void hnj(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, int i10, String str) {
        pAGRewardedAdLoadListener.onError(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj
    public void hnj(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, Object obj) {
        if (pAGRewardedAdLoadListener == null || obj == null || !(obj instanceof PAGRewardedAd)) {
            return;
        }
        pAGRewardedAdLoadListener.onAdLoaded((PAGRewardedAd) obj);
    }
}
