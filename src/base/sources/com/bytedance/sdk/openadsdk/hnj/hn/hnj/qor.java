package com.bytedance.sdk.openadsdk.hnj.hn.hnj;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.bug.sk;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.xn;
import com.bytedance.sdk.openadsdk.hnj.hn.aq;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends aq {
    protected final Context aq;
    private boolean bug;
    protected String dnm;
    protected AdSlot ojm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected apu f14518ta;

    public qor(Context context, as asVar, AdSlot adSlot) {
        super(context, asVar, 5, true);
        this.dnm = "embeded_ad";
        this.bug = false;
        this.f14506hn.xn(1);
        this.gjv.hnj(this);
        this.aq = context;
        this.ojm = adSlot;
        hnj();
        hn();
    }

    private void hn() {
        apu apuVar = this.f14518ta;
        if (apuVar != null) {
            apuVar.setBackupListener(new com.bytedance.sdk.component.adexpress.hn.qor() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor.1
                @Override // com.bytedance.sdk.component.adexpress.hn.qor
                public boolean hnj(ViewGroup viewGroup, int i10) {
                    hnj hnjVar = new hnj(qor.this.f14518ta.getContext());
                    hnjVar.setExtraFuncationHelper(((aq) qor.this).gjv);
                    hnjVar.hnj(qor.this.f14518ta);
                    return true;
                }
            });
        }
    }

    public apu gjv() {
        return this.f14518ta;
    }

    protected void qor() {
        apu apuVar = this.f14518ta;
        if (apuVar != null) {
            apuVar.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    if (!qor.this.f14518ta.eum()) {
                        qor.this.hnj(f10, f11);
                        if (qor.this.bug) {
                            qor.this.f14518ta.oj();
                            return;
                        }
                        return;
                    }
                    qor qorVar = qor.this;
                    Context context = qorVar.aq;
                    as asVar = ((aq) qorVar).f14506hn;
                    qor qorVar2 = qor.this;
                    com.bytedance.sdk.openadsdk.hnj.hn.hn hnVar = new com.bytedance.sdk.openadsdk.hnj.hn.hn(context, asVar, 5, qorVar2.ojm, ((aq) qorVar2).gjv, ((aq) qor.this).hnj);
                    qor qorVar3 = qor.this;
                    if (qorVar3 instanceof hn) {
                        hnVar.hnj(((xn) qorVar3.gjv()).getVideoAdListener());
                    }
                    ((aq) qor.this).gjv.hnj((com.bytedance.sdk.openadsdk.core.qor.hnj) qor.this.f14518ta.getClickCreativeListener());
                    PAGMediaView pAGMediaViewOjm = ((aq) qor.this).gjv.ojm();
                    if (pAGMediaViewOjm == null) {
                        pAGMediaViewOjm = new PAGMediaView(qor.this.aq);
                    }
                    qor.this.f14518ta.addView(pAGMediaViewOjm);
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i10) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i10) {
                }
            });
        }
    }

    public void sk() {
        apu apuVar = this.f14518ta;
        if (apuVar != null) {
            apuVar.xn();
        }
    }

    protected void hnj() {
        this.f14518ta = new apu(this.aq, this.f14506hn, this.ojm, this.dnm);
        qor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(float f10, float f11) {
        apu apuVar = this.f14518ta;
        if (apuVar != null && sk.hnj(apuVar.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = this.f14518ta.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.f14518ta.setLayoutParams(layoutParams);
            return;
        }
        int iHn = sq.hn(this.aq, f10);
        int iHn2 = sq.hn(this.aq, f11);
        ViewGroup.LayoutParams layoutParams2 = this.f14518ta.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(iHn, iHn2);
        } else {
            layoutParams2.width = iHn;
            layoutParams2.height = iHn2;
        }
        this.f14518ta.setLayoutParams(layoutParams2);
    }

    public void hnj(boolean z10) {
        this.bug = z10;
    }
}
