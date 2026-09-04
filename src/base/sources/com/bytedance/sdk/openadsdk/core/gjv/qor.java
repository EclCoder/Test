package com.bytedance.sdk.openadsdk.core.gjv;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.xn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends gjv {
    private com.bytedance.sdk.openadsdk.hnj.hnj.hn aq;
    private int ojm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f13763ta;

    public qor(Context context, as asVar, AdSlot adSlot, boolean z10) {
        super(context, asVar, adSlot, z10);
        this.ojm = 1;
        this.f13763ta = -1;
    }

    public com.bytedance.sdk.openadsdk.xn.qor.hnj getVideoModel() {
        apu apuVar = this.f13742hn;
        if (apuVar != null) {
            return ((xn) apuVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gjv.gjv
    public void gjv() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.qor videoController;
        apu apuVar = this.f13742hn;
        if ((apuVar instanceof xn) && (videoController = ((xn) apuVar).getVideoController()) != null) {
            this.ojm = videoController.sq();
        }
        super.gjv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.gjv.gjv
    protected void qor() {
        xn xnVar = new xn(this.hnj, this.qor, this.gjv, this.dkl, this.dse) { // from class: com.bytedance.sdk.openadsdk.core.gjv.qor.1
            @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
            protected com.bytedance.sdk.openadsdk.do.hn.sk.hnj qor(int i10) {
                return qor.this.hnj(super.qor(i10));
            }
        };
        this.f13742hn = xnVar;
        com.bytedance.sdk.openadsdk.core.mjg.hn.qor videoController = xnVar.getVideoController();
        if (videoController != null) {
            videoController.gjv(this.ojm);
        }
        addView(this.f13742hn, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.f13743sk;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        apu apuVar = this.f13742hn;
        if (apuVar != null) {
            ((xn) apuVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.hnj.hn.qor() { // from class: com.bytedance.sdk.openadsdk.core.gjv.qor.2
                @Override // com.bytedance.sdk.openadsdk.hnj.hn.qor
                public void hnj(int i10, int i11) {
                }

                @Override // com.bytedance.sdk.openadsdk.hnj.hn.qor
                public void qor(PAGNativeAd pAGNativeAd) {
                    if (qor.this.aq != null) {
                        qor.this.aq.hnj();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.hnj.hn.qor
                public void hnj(PAGNativeAd pAGNativeAd) {
                    if (qor.this.f13763ta == 3) {
                        qor qorVar = qor.this;
                        qorVar.hnj(qorVar.aq);
                    } else if (qor.this.f13763ta == 2) {
                        qor.this.hnj();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.hnj.hn.qor
                public void hn(PAGNativeAd pAGNativeAd) {
                }
            });
        }
    }

    public void hn() {
        apu apuVar = this.f13742hn;
        if (apuVar != null) {
            ((xn) apuVar).uua();
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.hnj.hnj.hn hnVar) {
        apu apuVar = this.f13742hn;
        if (apuVar != null) {
            ((xn) apuVar).jip();
            this.aq = hnVar;
            this.f13763ta = 3;
        }
    }

    public void hnj() {
        apu apuVar = this.f13742hn;
        if (apuVar != null) {
            ((xn) apuVar).fc();
            this.f13763ta = 2;
        }
    }
}
