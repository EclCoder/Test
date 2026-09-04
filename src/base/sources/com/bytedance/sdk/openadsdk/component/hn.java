package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.aq;
import com.bytedance.sdk.openadsdk.core.ojm.ojm;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends qor {

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private boolean f13359fc;
    private com.bytedance.sdk.openadsdk.component.ojm.hn mjg;
    private final com.bytedance.sdk.openadsdk.component.dkl.hn orl;

    public hn(Activity activity, as asVar, FrameLayout frameLayout, hnj hnjVar, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.aq.hnj hnjVar2, com.bytedance.sdk.openadsdk.component.dkl.hn hnVar) {
        super(activity, asVar, frameLayout, hnjVar, i10, z10, hnjVar2);
        this.orl = hnVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.qor
    public int gjv() {
        return this.mjg.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.qor
    public void sk() {
        com.bytedance.sdk.openadsdk.component.ojm.hn hnVar = this.mjg;
        if (hnVar != null) {
            hnVar.oj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.qor
    public void hn() {
        this.mjg.xn();
    }

    @Override // com.bytedance.sdk.openadsdk.component.qor
    public void qor() {
        super.qor();
        com.bytedance.sdk.openadsdk.component.ojm.hn hnVar = this.mjg;
        if (hnVar != null) {
            hnVar.bug();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.qor
    public void hnj(ViewGroup viewGroup) {
        Pair<Float, Float> pairHnj = com.bytedance.sdk.openadsdk.core.ojm.hnj.hnj.hnj(this.hnj.getWindow(), this.dse);
        com.bytedance.sdk.openadsdk.component.ojm.hn hnVar = new com.bytedance.sdk.openadsdk.component.ojm.hn(this.hnj, this.f13375hn, new AdSlot.Builder().setCodeId(String.valueOf(this.f13375hn.atw())).setExpressViewAcceptedSize(((Float) pairHnj.first).floatValue(), ((Float) pairHnj.second).floatValue()).build(), "open_ad", this.f13377sk, this.orl, this.bug);
        this.mjg = hnVar;
        hnVar.setTopListener(this.f13377sk);
        this.mjg.setExpressVideoListenerProxy(this.f13377sk);
        this.mjg.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.hn.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
                hn.this.f13377sk.gjv();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                if (hn.this.mjg.eum()) {
                    hn.this.f13359fc = true;
                    hn hnVar2 = hn.this;
                    hn.super.hnj((ViewGroup) hnVar2.gjv);
                    hn.super.hnj();
                    hn.super.hn();
                    return;
                }
                if (hn.this.f13375hn.nyv()) {
                    hn.this.f13377sk.qor();
                    return;
                }
                hn hnVar3 = hn.this;
                if (!hnVar3.qor) {
                    hnVar3.f13377sk.qor();
                } else if (!hnVar3.hnj(hnVar3.mjg.getVideoFrameLayout())) {
                    hn.this.f13377sk.gjv();
                } else {
                    hn.this.mjg.setVideoManager(hn.this.dse());
                    hn.this.f13377sk.qor();
                }
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
        });
        this.f13375hn.xn(1);
        this.gjv.addView(this.mjg, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.qor
    public void hnj() {
        ojm ojmVarHnj = com.bytedance.sdk.openadsdk.component.hnj.hn.hnj(this.f13375hn, this.hnj, this.bug, this.mjg);
        ojmVarHnj.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.component.hn.2
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
            public void hnj(View view, int i10) {
                hn.this.f13377sk.sk();
            }
        });
        this.mjg.setClickListener(ojmVarHnj);
        aq aqVarHn = com.bytedance.sdk.openadsdk.component.hnj.hn.hn(this.f13375hn, this.hnj, this.bug, this.mjg);
        this.mjg.setClickCreativeListener(aqVarHn);
        aqVarHn.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.component.hn.3
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
            public void hnj(View view, int i10) {
                hn.this.f13377sk.sk();
            }
        });
        this.mjg.setBackupListener(new com.bytedance.sdk.component.adexpress.hn.qor() { // from class: com.bytedance.sdk.openadsdk.component.hn.4
            @Override // com.bytedance.sdk.component.adexpress.hn.qor
            public boolean hnj(ViewGroup viewGroup, int i10) {
                StringBuilder sb2 = new StringBuilder("isUseBackup() called with: view = [");
                sb2.append(viewGroup);
                sb2.append("], errCode = [");
                sb2.append(i10);
                sb2.append("]");
                try {
                    ((apu) viewGroup).apu();
                    new com.bytedance.sdk.openadsdk.component.ojm.hnj(hn.this.hnj).hnj((apu) hn.this.mjg);
                    return true;
                } catch (Exception e10) {
                    Log.e("AppOpenAdExpressManager", "", e10);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.qor
    public void hnj(int i10, boolean z10) {
        super.hnj(i10, z10);
        com.bytedance.sdk.openadsdk.component.ojm.hn hnVar = this.mjg;
        if (hnVar != null) {
            hnVar.setTime(String.valueOf(i10), (int) (this.bug.qor() / 1000), i10, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.qor
    public JSONObject hnj(JSONObject jSONObject) {
        return this.mjg.hnj(jSONObject, this.f13375hn);
    }

    public void hnj(long j10, long j11) {
        com.bytedance.sdk.openadsdk.component.ojm.hn hnVar = this.mjg;
        if (hnVar != null) {
            hnVar.hnj(j10, j11);
        }
    }
}
