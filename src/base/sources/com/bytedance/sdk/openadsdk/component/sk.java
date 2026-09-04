package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements com.bytedance.sdk.openadsdk.hnj.gjv.hn {
    private final PAGAppOpenAdInteractionListener hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final AtomicBoolean f13565hn = new AtomicBoolean(false);
    private final AtomicBoolean qor = new AtomicBoolean(false);

    public sk(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.hnj = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.gjv.hn
    public void hn() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        apu.hnj("BVA", "onAdSkip");
        if (this.f13565hn.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.hnj) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.gjv.hn
    public void hnj() {
        if (this.qor.compareAndSet(false, true)) {
            apu.hnj("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.hnj;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        apu.hnj("BVA", "onAdClicked");
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.hnj;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.gjv.hn
    public void qor() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.f13565hn.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.hnj) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
