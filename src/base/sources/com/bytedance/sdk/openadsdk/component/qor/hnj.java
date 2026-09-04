package com.bytedance.sdk.openadsdk.component.qor;

import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.gjv.ta;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements com.bytedance.sdk.openadsdk.hnj.qor.hn {
    private final as gjv;
    private final PAGInterstitialAdInteractionListener hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final AtomicBoolean f13384hn = new AtomicBoolean(false);
    private final AtomicBoolean qor = new AtomicBoolean(false);

    public hnj(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        this.hnj = pAGInterstitialAdInteractionListener;
        this.gjv = hnjVar != null ? hnjVar.dkl() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.qor.hn
    public void hn() {
        ta.hnj("close_callback", this.qor.get(), this.f13384hn.get(), this.gjv);
        if (this.qor.compareAndSet(false, true)) {
            apu.hnj("BVA", "full video onAdClose");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.hnj;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdDismissed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.qor.hn
    public void hnj() {
        ta.hnj("show_callback", this.qor.get(), this.f13384hn.get(), this.gjv);
        if (this.f13384hn.compareAndSet(false, true)) {
            apu.hnj("BVA", "full video onAdShow");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.hnj;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.hnj;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
