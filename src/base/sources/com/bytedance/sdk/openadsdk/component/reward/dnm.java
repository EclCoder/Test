package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.as;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm implements com.bytedance.sdk.openadsdk.hnj.sk.hnj {
    private final as dkl;
    private final AtomicBoolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final PAGRewardedAdInteractionCallback f13401hn;
    private final PAGRewardedAdInteractionListener hnj;
    private final AtomicBoolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final AtomicBoolean f13402sk;

    public dnm(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        this.qor = new AtomicBoolean(false);
        this.gjv = new AtomicBoolean(false);
        this.f13402sk = new AtomicBoolean(false);
        this.hnj = pAGRewardedAdInteractionListener;
        this.f13401hn = null;
        this.dkl = hnjVar != null ? hnjVar.dkl() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.sk.hnj
    public void hn() {
        this.gjv.get();
        com.bytedance.sdk.openadsdk.gjv.ta.hnj("close_callback", this.gjv.get(), this.qor.get(), this.dkl);
        if (this.gjv.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.apu.hnj("BVA", "reward video onAdClose");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.hnj;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdDismissed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f13401hn;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdDismissed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.sk.hnj
    public void hnj() {
        this.qor.get();
        com.bytedance.sdk.openadsdk.gjv.ta.hnj("show_callback", this.gjv.get(), this.qor.get(), this.dkl);
        if (this.qor.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.apu.hnj("BVA", "reward video onAdShow");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.hnj;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdShowed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f13401hn;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.hnj;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f13401hn;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    public dnm(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        this.qor = new AtomicBoolean(false);
        this.gjv = new AtomicBoolean(false);
        this.f13402sk = new AtomicBoolean(false);
        this.f13401hn = pAGRewardedAdInteractionCallback;
        this.hnj = null;
        this.dkl = hnjVar != null ? hnjVar.dkl() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.sk.hnj
    public void hnj(boolean z10, int i10, String str, int i11, String str2) {
        if (this.f13402sk.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.apu.hnj("BVA", "reward video onRewardVerify");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.hnj;
            if (pAGRewardedAdInteractionListener != null) {
                if (z10) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i10, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i11, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f13401hn;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z10) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i10, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i11, str2));
                }
            }
        }
    }
}
