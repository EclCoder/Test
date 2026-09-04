package com.bytedance.sdk.openadsdk.component.ojm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hn.mjg;
import com.bytedance.sdk.component.adexpress.hn.orl;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm.Cdo;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.fc;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import org.json.JSONObject;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends apu {
    private com.bytedance.sdk.openadsdk.component.aq.qor aq;
    private final com.bytedance.sdk.openadsdk.component.dkl.hn dkl;
    private final com.bytedance.sdk.openadsdk.component.aq.hnj dse;
    float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    boolean f13368hn;
    boolean hnj;
    private com.bytedance.sdk.openadsdk.component.dkl.hnj hqh;
    private FrameLayout nyv;
    private c.InterfaceC0870c pty;
    int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.hnj f13369sk;

    public hn(Context context, as asVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.hnj hnjVar, com.bytedance.sdk.openadsdk.component.dkl.hn hnVar, com.bytedance.sdk.openadsdk.component.aq.hnj hnjVar2) {
        super(context, asVar, adSlot, str, true, true);
        this.hnj = true;
        this.f13368hn = false;
        this.qor = 0;
        this.gjv = 1.0f;
        this.f13369sk = hnjVar;
        this.dkl = hnVar;
        this.dse = hnjVar2;
        if (asVar == null || asVar.lq() == null) {
            return;
        }
        this.qor = asVar.lq().hn();
        this.gjv = asVar.lq().hnj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(mjg mjgVar) {
        if (mjgVar == null) {
            return;
        }
        if (mjgVar.hnj() != null) {
            if (this.hnj) {
                mjgVar.hnj().setTag(com.bytedance.sdk.component.adexpress.dynamic.hnj.dkl, 1);
                ((FrameLayout) mjgVar.hnj()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) mjgVar.hnj();
                this.nyv = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.hnj = false;
                return;
            }
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
            if ((this.f14036vf.qor() == 7 || this.f14036vf.qor() == 10 || (this.f14036vf instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv)) && (mjgVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.hn)) {
                FrameLayout frameLayoutFc = ((com.bytedance.sdk.openadsdk.core.bug.dkl.hn) mjgVar).fc();
                if (frameLayoutFc != null) {
                    if (this.nyv.getParent() != null) {
                        ((ViewGroup) this.nyv.getParent()).removeView(this.nyv);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutFc.addView(this.nyv, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.nyv.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iHn3, iHn4);
            }
            layoutParams2.width = iHn3;
            layoutParams2.height = iHn4;
            layoutParams2.topMargin = iHn2;
            layoutParams2.leftMargin = iHn;
            layoutParams2.setMarginStart(iHn);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.nyv.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void dkl() {
        com.bytedance.sdk.openadsdk.component.dkl.hnj hnjVar = this.hqh;
        if (hnjVar != null) {
            hnjVar.hn(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    protected void dse() {
        this.f14022fc = true;
        this.nyv = new FrameLayout(this.ojm);
        if (!com.bytedance.sdk.openadsdk.core.bug.sk.hnj(this.bug) && !com.bytedance.sdk.openadsdk.core.bug.sk.hn(this.bug)) {
            addView(this.nyv, new FrameLayout.LayoutParams(-1, -1));
        }
        super.dse();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.orl.dse() { // from class: com.bytedance.sdk.openadsdk.component.ojm.hn.1
            @Override // com.bytedance.sdk.openadsdk.orl.dse
            public void hnj(mjg mjgVar) {
                hn.this.hnj(mjgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    public int getDynamicShowType() {
        if (this.f14036vf == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(this.bug, oj.gjv().dse(String.valueOf(this.bug.atw())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.nyv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public long gjv() {
        return this.dse.qor();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hn() {
        super.hn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(int i10, String str) {
    }

    public void setExpressVideoListenerProxy(c.InterfaceC0870c interfaceC0870c) {
        this.pty = interfaceC0870c;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.dkl.hnj hnjVar) {
        this.hqh = hnjVar;
    }

    public void setVideoManager(com.bytedance.sdk.openadsdk.component.aq.qor qorVar) {
        this.aq = qorVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public int sk() {
        com.bytedance.sdk.openadsdk.component.aq.qor qorVar = this.aq;
        if (qorVar != null && qorVar.dse()) {
            return 1;
        }
        com.bytedance.sdk.openadsdk.component.aq.qor qorVar2 = this.aq;
        if (qorVar2 != null && qorVar2.dkl()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.aq.qor qorVar3 = this.aq;
        if (qorVar3 != null && qorVar3.sk()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.aq.qor qorVar4 = this.aq;
        if (qorVar4 == null || !qorVar4.qor()) {
            com.bytedance.sdk.openadsdk.component.aq.qor qorVar5 = this.aq;
            return (qorVar5 == null || !qorVar5.gjv()) ? 3 : 5;
        }
        dse(4);
        return 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.component.adexpress.hn.fc
    public void hnj(com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar, mjg mjgVar) {
        this.f14036vf = gjvVar;
        if (gjvVar instanceof Cdo) {
            Cdo cdo = (Cdo) gjvVar;
            if (cdo.jip() != null) {
                cdo.jip().hnj((fc) this);
            }
        }
        if (mjgVar != null && mjgVar.hn()) {
            hnj(mjgVar);
        }
        super.hnj(gjvVar, mjgVar);
    }

    public void hnj(final mjg mjgVar) {
        if (mjgVar == null) {
            return;
        }
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ojm.hn.2
            @Override // java.lang.Runnable
            public void run() {
                hn.this.qor(mjgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj() {
        com.bytedance.sdk.openadsdk.component.dkl.hnj hnjVar = this.hqh;
        if (hnjVar != null) {
            hnjVar.hnj(this);
        }
    }

    public void hnj(long j10, long j11) {
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) {
            ((com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) gjvVar).hnj(j10, j11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public boolean hnj(JSONObject jSONObject) {
        as asVar;
        if (jSONObject == null) {
            this.f13368hn = false;
            return false;
        }
        int i10 = this.qor;
        if (i10 != 1 && i10 != 2) {
            this.f13368hn = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.gjv = fOptDouble;
        if (fOptDouble <= 0.0f && (asVar = this.bug) != null && asVar.lq() != null) {
            this.gjv = this.bug.lq().hnj();
        }
        boolean z10 = iOptInt == 1;
        this.f13368hn = z10;
        com.bytedance.sdk.openadsdk.component.dkl.hn hnVar = this.dkl;
        if (hnVar != null) {
            hnVar.hnj(this.qor, this.gjv, z10);
            com.bytedance.sdk.openadsdk.component.aq.qor qorVar = this.aq;
            if (qorVar != null && qorVar.hn() != null && this.dse != null) {
                this.aq.hn().hnj(this.dse.hnj());
                com.bytedance.sdk.component.utils.apu.hnj("PAGAppOpenAdExpressView", "isAccelerate =" + this.f13368hn + ",total duration = " + this.aq.hn().uua());
            }
        }
        if (this.qor == 1) {
            return true;
        }
        if (!this.f13368hn) {
            this.gjv = 1.0f;
        }
        com.bytedance.sdk.openadsdk.component.aq.qor qorVar2 = this.aq;
        if (qorVar2 != null) {
            return qorVar2.hnj(this.gjv);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(int i10) {
        com.bytedance.sdk.openadsdk.component.aq.qor qorVar = this.aq;
        if (qorVar == null) {
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                qorVar.aq();
                this.dkl.gjv();
                return;
            } else if (i10 == 3) {
                qorVar.ojm();
                this.dkl.qor();
                return;
            } else if (i10 == 4) {
                qorVar.ta();
                return;
            } else if (i10 != 5) {
                return;
            }
        }
        if (qorVar.sk() || this.aq.dkl()) {
            return;
        }
        this.aq.hnj(getVideoFrameLayout(), this.f13369sk, this.bug);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.openadsdk.core.ojm.fc
    public long qor() {
        return this.dse.qor();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    protected void qor(JSONObject jSONObject) {
        as asVar = this.bug;
        boolean z10 = asVar != null && asVar.rq() == 0;
        as asVar2 = this.bug;
        com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(jSONObject, asVar2 != null ? asVar2.atw() : 0, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu, com.bytedance.sdk.component.adexpress.hn.aq
    public void hnj(View view, int i10, com.bytedance.sdk.component.adexpress.qor qorVar) {
        if (i10 != -1 && qorVar != null && i10 == 3) {
            dkl();
        } else {
            super.hnj(view, i10, qorVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.apu
    protected void hnj(orl.hnj hnjVar) {
        hnjVar.sk(com.bytedance.sdk.openadsdk.component.dse.hnj.hnj());
    }
}
