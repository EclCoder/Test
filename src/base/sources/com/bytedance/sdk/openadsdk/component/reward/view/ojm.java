package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm.fc;
import com.bytedance.sdk.openadsdk.utils.sq;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm {
    private final String aq;
    private final Activity dkl;
    private boolean dnm;
    private final as dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    Handler f13559hn;
    com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor hnj;
    private qor ojm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.reward.hnj.hnj f13561ta;
    boolean qor = false;
    boolean gjv = false;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    boolean f13560sk = false;

    public ojm(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.f13561ta = hnjVar;
        this.dkl = hnjVar.orp;
        this.dse = hnjVar.f13456hn;
        this.aq = hnjVar.f13461sk;
    }

    public void aq() {
        qor qorVar = this.ojm;
        if (qorVar != null) {
            qorVar.dnm();
        }
    }

    public boolean bug() {
        qor qorVar = this.ojm;
        if (qorVar != null) {
            return qorVar.f14036vf instanceof com.bytedance.sdk.component.adexpress.sk.hnj;
        }
        return false;
    }

    public void dkl() {
        if (this.dnm) {
            return;
        }
        this.dnm = true;
        qor qorVar = this.ojm;
        if (qorVar != null) {
            qorVar.bug();
        }
        Handler handler = this.f13559hn;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public int dnm() {
        qor qorVar = this.ojm;
        if (qorVar != null) {
            return qorVar.getDynamicShowType();
        }
        return 0;
    }

    public void dse() {
        qor qorVar = this.ojm;
        if (qorVar != null) {
            qorVar.ta();
        }
    }

    public void fc() {
        if (as.sk(this.dse) && this.dse.krm() == 3 && this.dse.vh() == 0) {
            try {
                if (this.dse.zf() == 1) {
                    int iHn = sq.hn(oj.hnj(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.ojm.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iHn;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean gjv() {
        return this.gjv;
    }

    public FrameLayout hn() {
        qor qorVar = this.ojm;
        if (qorVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = qorVar.getVideoFrameLayout();
        if (this.ojm.eum()) {
            fc();
        }
        return videoFrameLayout;
    }

    public void hnj(AdSlot adSlot, apu apuVar) {
        if (this.f13560sk) {
            return;
        }
        this.f13560sk = true;
        qor qorVar = new qor(this.f13561ta, adSlot, this.aq);
        this.ojm = qorVar;
        if (apuVar != null) {
            apuVar.hnj(qorVar, qorVar.getVideoFrameLayout());
        }
    }

    public void mjg() {
        qor qorVar = this.ojm;
        if (qorVar == null) {
            return;
        }
        qorVar.xn();
        this.ojm.ta();
    }

    public boolean ojm() {
        qor qorVar = this.ojm;
        if (qorVar == null) {
            return false;
        }
        return qorVar.eum();
    }

    public void orl() {
        qor qorVar = this.ojm;
        if (qorVar == null) {
            return;
        }
        qorVar.oj();
    }

    public boolean qor() {
        return this.qor;
    }

    public Handler sk() {
        if (this.f13559hn == null) {
            this.f13559hn = new Handler(Looper.getMainLooper());
        }
        return this.f13559hn;
    }

    public boolean ta() {
        qor qorVar = this.ojm;
        return qorVar != null && qorVar.as();
    }

    public void hn(boolean z10) {
        this.gjv = z10;
    }

    public qor hnj() {
        return this.ojm;
    }

    private com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor hn(as asVar) {
        if (asVar.rg() == 4) {
            return com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(this.dkl, this.aq);
        }
        return null;
    }

    public void hnj(boolean z10) {
        this.qor = z10;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.ojm.ojm ojmVar, com.bytedance.sdk.openadsdk.core.ojm.aq aqVar) {
        as asVar;
        if (this.ojm == null || (asVar = this.dse) == null) {
            return;
        }
        this.hnj = hn(asVar);
        ojmVar.hn(this.ojm);
        ojmVar.hnj(this.hnj);
        this.ojm.setClickListener(ojmVar);
        aqVar.hn(this.ojm);
        aqVar.hnj(this.hnj);
        this.ojm.setClickCreativeListener(aqVar);
    }

    public void hnj(fc fcVar) {
        qor qorVar = this.ojm;
        if (qorVar == null) {
            return;
        }
        qorVar.setExpressVideoListenerProxy(fcVar);
    }

    public void hnj(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        if (this.ojm == null) {
            return;
        }
        this.ojm.setExpressInteractionListener(new PAGRewardFullExpressAdListenerProxy(pAGExpressAdWrapperListener));
    }

    public JSONObject hnj(JSONObject jSONObject) {
        qor qorVar = this.ojm;
        if (qorVar != null) {
            return qorVar.hnj(jSONObject, this.f13561ta.f13456hn);
        }
        return null;
    }

    public void hnj(int i10, boolean z10) {
        qor qorVar = this.ojm;
        if (qorVar != null) {
            qorVar.hnj(i10, z10, false);
        }
    }

    public void hnj(int i10, String str) {
        qor qorVar = this.ojm;
        if (qorVar != null) {
            qorVar.hn(i10, str);
        }
    }

    public void hnj(as asVar) {
        qor qorVar = this.ojm;
        if (qorVar != null) {
            AdSlot adSlotAip = asVar.aip();
            String strSk = asVar.sk();
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13561ta;
            qorVar.hnj(asVar, adSlotAip, strSk, hnjVar.dzo, !hnjVar.dy);
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.f13561ta = hnjVar;
    }
}
