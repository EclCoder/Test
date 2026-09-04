package com.bytedance.sdk.openadsdk.core.gjv;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends com.bytedance.sdk.openadsdk.core.dkl.qor {
    private int aq;
    protected String dkl;
    protected boolean dse;
    protected AdSlot gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected apu f13742hn;
    protected final Context hnj;
    private boolean ojm;
    protected as qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected PAGBannerAdWrapperListener f13743sk;

    public gjv(Context context, as asVar, AdSlot adSlot, boolean z10) {
        super(context);
        this.dkl = "banner_ad";
        this.dse = false;
        this.aq = -1;
        this.ojm = false;
        if (asVar != null && asVar.th() != 2) {
            asVar.xn(1);
        }
        this.dse = z10;
        this.hnj = context;
        this.qor = asVar;
        this.gjv = adSlot;
        qor();
        AdSlot adSlot2 = this.gjv;
        if (adSlot2 != null) {
            hnj(adSlot2.getExpressViewAcceptedWidth(), this.gjv.getExpressViewAcceptedHeight());
        }
    }

    public apu getCurView() {
        return this.f13742hn;
    }

    public void gjv() {
        if (this.f13742hn != null) {
            ta.hn().dkl(this.f13742hn.getClosedListenerKey());
            removeView(this.f13742hn);
            this.f13742hn.bug();
            this.f13742hn = null;
        }
        ta.hn().xn();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13742hn == null) {
            qor();
        }
        com.bytedance.sdk.openadsdk.utils.gjv.hnj(this, this.qor);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    protected void qor() {
        apu apuVar = new apu(this.hnj, this.qor, this.gjv, this.dkl) { // from class: com.bytedance.sdk.openadsdk.core.gjv.gjv.1
            @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
            protected com.bytedance.sdk.openadsdk.do.hn.sk.hnj qor(int i10) {
                return gjv.this.hnj(super.qor(i10));
            }
        };
        this.f13742hn = apuVar;
        addView(apuVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.f13743sk;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public void setCurrentIndex(int i10) {
        this.aq = i10;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.f13743sk = pAGBannerAdWrapperListener;
        apu apuVar = this.f13742hn;
        if (apuVar != null) {
            apuVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.sk() { // from class: com.bytedance.sdk.openadsdk.core.gjv.gjv.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.sk
                public void hnj() {
                    gjv.this.f13743sk.onAdClicked();
                }
            });
            this.f13742hn.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.gjv.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    as asVar = gjv.this.qor;
                    if (asVar == null || !asVar.ux() || (pAGBannerAdWrapperListener2 = gjv.this.f13743sk) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i10) {
                    gjv gjvVar = gjv.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = gjvVar.f13743sk;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(gjvVar, str, i10);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    apu apuVar2 = gjv.this.f13742hn;
                    if (apuVar2 != null) {
                        apuVar2.setSoundMute(true);
                        if (com.bytedance.sdk.openadsdk.core.bug.sk.hnj(gjv.this.f13742hn.getDynamicShowType())) {
                            gjv gjvVar = gjv.this;
                            AdSlot adSlot = gjvVar.gjv;
                            if (adSlot != null) {
                                gjvVar.hnj(adSlot.getExpressViewAcceptedWidth(), gjv.this.gjv.getExpressViewAcceptedHeight());
                            }
                        } else {
                            gjv.this.hnj(f10, f11);
                        }
                    }
                    if (gjv.this.ojm) {
                        gjv.this.f13742hn.oj();
                    }
                    gjv gjvVar2 = gjv.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = gjvVar2.f13743sk;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(gjvVar2, f10, f11);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i10) {
                }
            });
        }
    }

    public void setIsShow(boolean z10) {
        this.ojm = z10;
    }

    public void sk() {
        apu apuVar = this.f13742hn;
        if (apuVar != null) {
            apuVar.xn();
        }
    }

    protected com.bytedance.sdk.openadsdk.do.hn.sk.hnj hnj(com.bytedance.sdk.openadsdk.do.hn.sk.hnj hnjVar) {
        int i10;
        if (this.dse && (i10 = this.aq) >= 0) {
            hnjVar.f14326hn = i10;
        }
        return hnjVar;
    }

    protected void hnj(float f10, float f11) {
        int iHn = sq.hn(this.hnj, f10);
        int iHn2 = sq.hn(this.hnj, f11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iHn, iHn2);
        }
        layoutParams.width = iHn;
        layoutParams.height = iHn2;
        setLayoutParams(layoutParams);
    }
}
