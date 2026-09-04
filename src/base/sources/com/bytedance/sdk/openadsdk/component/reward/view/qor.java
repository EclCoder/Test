package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hn.mjg;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.ojm.Cdo;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.fc;
import com.bytedance.sdk.openadsdk.core.ojm.uua;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends apu {
    public static float hnj = 100.0f;
    private float dkl;
    private com.bytedance.sdk.openadsdk.wu.hnj.hnj dse;
    public int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    fc f13562hn;
    uua qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj f13563sk;

    public qor(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, AdSlot adSlot, String str) {
        super(hnjVar.orp, hnjVar.f13456hn, adSlot, str, hnjVar.dzo, !hnjVar.dy);
        this.gjv = 1;
        this.dkl = -1.0f;
        this.f13563sk = hnjVar;
        setVideoBusiness(hnjVar.sq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gjv(mjg mjgVar) {
        if (mjgVar == null) {
            return;
        }
        double dSk = mjgVar.sk();
        double dDkl = mjgVar.dkl();
        double dDse = mjgVar.dse();
        double dAq = mjgVar.aq();
        int iHn = sq.hn(this.ojm, (float) dSk);
        int iHn2 = sq.hn(this.ojm, (float) dDkl);
        int iHn3 = sq.hn(this.ojm, (float) dDse);
        int iHn4 = sq.hn(this.ojm, (float) dAq);
        if ((dAq != 0.0d && dDse != 0.0d) || this.f14036vf.qor() == 7 || this.f14036vf.qor() == 10 || (this.f14036vf instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv)) {
            if ((this.f14036vf instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) && (mjgVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hn)) {
                FrameLayout frameLayoutFc = ((com.bytedance.sdk.openadsdk.core.bug.dkl.hn) mjgVar).fc();
                if (frameLayoutFc != null) {
                    if (this.orl.getParent() != null) {
                        ((ViewGroup) this.orl.getParent()).removeView(this.orl);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutFc.addView(this.orl, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.orl.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iHn3, iHn4);
            }
            layoutParams2.width = iHn3;
            layoutParams2.height = iHn4;
            layoutParams2.topMargin = iHn2;
            layoutParams2.leftMargin = iHn;
            layoutParams2.setMarginStart(iHn);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.orl.setLayoutParams(layoutParams2);
        }
    }

    private void orl() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.hn.qor() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.qor.2
            @Override // com.bytedance.sdk.component.adexpress.hn.qor
            public boolean hnj(ViewGroup viewGroup, int i10) {
                try {
                    ((apu) viewGroup).apu();
                    qor.this.qor = new uua(viewGroup.getContext());
                    qor qorVar = qor.this;
                    qorVar.qor.hnj(((apu) qorVar).bug, (apu) viewGroup, qor.this.f13563sk.fvt);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    private void qor(mjg mjgVar) {
        FrameLayout frameLayoutJip;
        boolean z10;
        try {
            if (!(mjgVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hn) || (frameLayoutJip = ((com.bytedance.sdk.openadsdk.core.bug.dkl.hn) mjgVar).jip()) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.activity.single.aq aqVar = this.f13563sk.f13463th;
            boolean z11 = true;
            if (aqVar == null || aqVar.ff() == null) {
                z10 = false;
            } else {
                com.bytedance.sdk.openadsdk.activity.single.aq aqVarDnm = this.f13563sk.f13463th.ff().dnm();
                com.bytedance.sdk.openadsdk.activity.single.aq aqVar2 = this.f13563sk.f13463th;
                z10 = aqVarDnm == aqVar2;
                if (!aqVar2.ff().as() && z10) {
                    z11 = false;
                }
            }
            boolean z12 = z11;
            com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = new com.bytedance.sdk.openadsdk.wu.hnj.hnj(this.ojm, this.bug, this.f13563sk.lu, z12, frameLayoutJip);
            this.dse = hnjVar;
            hnjVar.hnj(this.f13563sk.sq);
            this.dse.hnj(false, (com.bytedance.sdk.openadsdk.orl.dkl) null);
            this.dse.hnj();
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.FRExpressView", "initPlayable success mute = " + this.f13563sk.dzo + ",isCurrentScene->" + z10 + ",isMute = " + z12);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    protected boolean aq() {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar = this.f13563sk.f13463th;
        if (aqVar == null || !aqVar.ff().tgn()) {
            return true;
        }
        return this.f13563sk.pnz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    public void bug() {
        try {
            com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.dse;
            if (hnjVar != null) {
                hnjVar.gjv();
            }
        } catch (Throwable unused) {
        }
        if (!as() && (getExpressInteractionListener() instanceof PAGRewardFullExpressAdListenerProxy)) {
            ((PAGRewardFullExpressAdListenerProxy) getExpressInteractionListener()).triggerUnfinishedFail(this);
        }
        super.bug();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.model.apu apuVar;
        dnm dnmVar = this.f13563sk.f13464ua;
        if (dnmVar != null && (apuVar = dnmVar.f13541fc) != null && apuVar.ojm()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.dkl = motionEvent.getY();
            } else if (action == 1) {
            }
            if (sq.hnj(this.dkl, motionEvent.getY(), this.ojm)) {
                apuVar.hn(5);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void dkl() {
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            fcVar.dkl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    public void dnm() {
        super.dnm();
        if (this.dse != null) {
            com.bytedance.sdk.openadsdk.activity.single.aq aqVar = this.f13563sk.f13463th;
            if (aqVar != null && aqVar.ff() != null) {
                this.dse.hnj(true);
            }
            this.dse.qor();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    protected void dse() {
        this.f14022fc = true;
        this.orl = new FrameLayout(this.ojm);
        if (!com.bytedance.sdk.openadsdk.core.bug.sk.hnj(this.bug) && !com.bytedance.sdk.openadsdk.core.bug.sk.hn(this.bug)) {
            addView(this.orl, new FrameLayout.LayoutParams(-1, -1));
        }
        super.dse();
        com.bytedance.sdk.component.ojm.dkl webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        orl();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.orl.dse() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.qor.1
            @Override // com.bytedance.sdk.openadsdk.orl.dse
            public void hnj(mjg mjgVar) {
                qor.this.hnj(mjgVar);
            }
        });
    }

    public View getBackupContainerBackgroundView() {
        if (eum()) {
            return this.qor.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        return eum() ? this.qor.getVideoContainer() : this.orl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    protected boolean ojm() {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar = this.f13563sk.f13463th;
        return aqVar == null || !aqVar.ff().tgn();
    }

    public void setExpressVideoListenerProxy(fc fcVar) {
        this.f13562hn = fcVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void setSoundMute(boolean z10) {
        super.setSoundMute(z10);
        com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.dse;
        if (hnjVar != null) {
            hnjVar.hnj(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public int sk() {
        fc fcVar = this.f13562hn;
        if (fcVar == null) {
            return 0;
        }
        int iSk = fcVar.sk();
        dse(iSk);
        return iSk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    public void ta() {
        super.ta();
        if (this.dse != null) {
            com.bytedance.sdk.openadsdk.activity.single.aq aqVar = this.f13563sk.f13463th;
            if (aqVar != null && aqVar.ff() != null) {
                this.dse.hnj(this.f13563sk.f13463th.ff().as());
            }
            this.dse.hn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public boolean hn(JSONObject jSONObject) {
        return com.bytedance.sdk.openadsdk.component.reward.hn.hnj(this.f13563sk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hn() {
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            fcVar.hn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.component.adexpress.hn.fc
    public void hnj(com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar, mjg mjgVar) {
        this.f14036vf = gjvVar;
        as asVar = this.bug;
        if (asVar != null && asVar.ouk()) {
            super.hnj(gjvVar, mjgVar);
            return;
        }
        if (gjvVar instanceof Cdo) {
            Cdo cdo = (Cdo) gjvVar;
            if (cdo.jip() != null) {
                cdo.jip().hnj((fc) this);
            }
        }
        if (mjgVar != null && mjgVar.hn()) {
            hnj(mjgVar);
            this.gjv = gjvVar.qor();
            if ((this.f14036vf instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) && hqh.qor(this.bug)) {
                qor(mjgVar);
            }
            if (gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl) {
                this.f13563sk.eum.sk(true);
            }
        }
        super.hnj(gjvVar, mjgVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hn(int i10) {
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            fcVar.hn(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public long qor() {
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            return fcVar.qor();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    protected com.bytedance.sdk.openadsdk.do.hn.sk.hnj qor(int i10) {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        com.bytedance.sdk.openadsdk.do.hn.sk.hnj hnjVarQor = super.qor(i10);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13563sk;
        if (hnjVar.dy && (aqVar = hnjVar.f13463th) != null) {
            hnjVarQor.f14326hn = aqVar.dnm;
        }
        return hnjVarQor;
    }

    public void hnj(final mjg mjgVar) {
        if (mjgVar == null) {
            return;
        }
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.qor.3
            @Override // java.lang.Runnable
            public void run() {
                qor.this.gjv(mjgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(String str, JSONObject jSONObject) {
        super.hnj(str, jSONObject);
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            fcVar.hnj(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(boolean z10, String str) {
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            fcVar.hnj(z10, str);
        }
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public boolean hnj(JSONObject jSONObject) {
        Objects.toString(jSONObject);
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            return fcVar.hnj(jSONObject);
        }
        return super.hnj(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public long gjv() {
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            return fcVar.gjv();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj() {
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            fcVar.hnj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(int i10) {
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            fcVar.hnj(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(int i10, mjg mjgVar) {
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            fcVar.hnj(i10, mjgVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.component.adexpress.hn.aq
    public void hnj(View view, int i10, com.bytedance.sdk.component.adexpress.qor qorVar) {
        if (i10 != -1 && qorVar != null && i10 == 3) {
            dkl();
        } else {
            super.hnj(view, i10, qorVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(int i10, String str) {
        fc fcVar = this.f13562hn;
        if (fcVar != null) {
            fcVar.hnj(i10, str);
        }
    }

    public void hnj(long j10, long j11) {
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) {
            ((com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) gjvVar).hnj(j10, j11);
        }
    }
}
