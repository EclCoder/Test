package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.core.widget.oj;
import com.bytedance.sdk.openadsdk.core.xyo;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm {
    protected volatile boolean aq;
    protected final hnj bug;
    protected final String dnm;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected boolean f13494fc;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.activity.single.gjv.dkl f13495hn;
    private oj hnj;
    protected boolean jip;
    protected boolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.wu.hnj.hnj f13496oj;
    protected final Activity ojm;
    protected boolean orl;
    private boolean qor;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected final as f13497ta;
    protected FrameLayout uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    protected AtomicBoolean f13498xn = new AtomicBoolean(false);

    public ojm(hnj hnjVar) {
        this.bug = hnjVar;
        this.ojm = hnjVar.orp;
        this.dnm = hnjVar.f13461sk;
        as asVar = hnjVar.f13456hn;
        this.f13497ta = asVar;
        this.mjg = hqh.sk(asVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gjv(boolean z10) {
        com.bytedance.sdk.openadsdk.activity.single.hn hnVarFf;
        hnj hnjVar = this.bug;
        if (!hnjVar.dy) {
            if (this instanceof dse) {
                hnj(0L);
            } else {
                com.bytedance.sdk.openadsdk.activity.single.gjv.dkl dklVar = this.f13495hn;
                if (dklVar != null) {
                    dklVar.qor();
                }
            }
            this.qor = false;
            return;
        }
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar = hnjVar.f13463th;
        if (aqVar == null || (hnVarFf = aqVar.ff()) == null) {
            return;
        }
        if (z10) {
            hnVarFf.nyv();
        }
        hnVarFf.hnj(1);
    }

    private void jip() {
        if (this.bug.f13456hn.btk()) {
            oj ojVar = new oj(this.bug, new oj.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ojm.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
                public void dkl() {
                    ojm.this.gjv(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
                public int gjv() {
                    ojm ojmVar = ojm.this;
                    return ojmVar.bug.dy ? ojmVar.bug() : ojmVar.aq();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
                public void hn() {
                    ua uaVarDse = ojm.this.f13496oj.dse();
                    if (uaVarDse != null) {
                        uaVarDse.hnj("popupDidDismiss", (JSONObject) null);
                    }
                    ojm.this.gjv(true);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
                public void hnj() {
                    ojm.this.bug.sq.hnj("skipToNextAd", (JSONObject) null);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
                public void qor() {
                    com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
                    com.bytedance.sdk.openadsdk.activity.single.hn hnVarFf;
                    ua uaVarDse = ojm.this.f13496oj.dse();
                    if (uaVarDse != null) {
                        uaVarDse.hnj("popupDidShow", (JSONObject) null);
                    }
                    hnj hnjVar = ojm.this.bug;
                    if (!hnjVar.dy || (aqVar = hnjVar.f13463th) == null || (hnVarFf = aqVar.ff()) == null) {
                        return;
                    }
                    hnVarFf.pty();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
                public void sk() {
                    ojm.this.uua();
                }
            });
            this.hnj = ojVar;
            ojVar.hnj(this.bug.fvt);
            ua uaVarDse = this.f13496oj.dse();
            if (uaVarDse != null) {
                uaVarDse.hnj(new xyo() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ojm.2
                    @Override // com.bytedance.sdk.openadsdk.core.xyo
                    public void m_() {
                        if (ojm.this.hnj != null) {
                            ojm.this.hnj.hnj(ojm.this.bug.orp);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.xyo
                    public void n_() {
                        if (ojm.this.hnj != null) {
                            ojm.this.hnj.n_();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.xyo
                    public int o_() {
                        ojm ojmVar = ojm.this;
                        return ojmVar.bug.dy ? ojmVar.bug() : ojmVar.aq();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.xyo
                    public void p_() {
                        ojm.this.uua();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.xyo
                    public void q_() {
                        ojm.this.gjv(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.xyo
                    public void r_() {
                    }
                });
            }
        }
    }

    private void oj() {
        int iXr = this.f13497ta.xr();
        if (iXr == -1) {
            if (hqh.dse(this.f13497ta)) {
                com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.f13496oj;
                if (hnjVar == null || !hnjVar.sk()) {
                    this.bug.f13460qb.eum();
                    return;
                } else {
                    this.bug.jip.set(true);
                    this.bug.f13460qb.orl();
                }
            } else {
                this.bug.jip.set(true);
                this.bug.f13460qb.orl();
            }
        } else {
            if (iXr < 0) {
                return;
            }
            this.bug.f13454gm.gjv(false);
            if (hqh.dse(this.f13497ta)) {
                com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar2 = this.f13496oj;
                if (hnjVar2 == null || !hnjVar2.sk()) {
                    com.bytedance.sdk.openadsdk.activity.single.gjv.dkl dklVar = new com.bytedance.sdk.openadsdk.activity.single.gjv.dkl(iXr) { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ojm.5
                        @Override // com.bytedance.sdk.openadsdk.activity.single.gjv.dkl
                        public void hnj() {
                            ojm.this.bug.f13453ff.sendEmptyMessage(1);
                        }
                    };
                    this.f13495hn = dklVar;
                    dklVar.sk();
                    return;
                } else {
                    com.bytedance.sdk.openadsdk.activity.single.gjv.dkl dklVar2 = new com.bytedance.sdk.openadsdk.activity.single.gjv.dkl(iXr) { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ojm.4
                        @Override // com.bytedance.sdk.openadsdk.activity.single.gjv.dkl
                        public void hnj() {
                            ojm.this.bug.f13453ff.sendEmptyMessage(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE);
                        }
                    };
                    this.f13495hn = dklVar2;
                    dklVar2.sk();
                }
            } else {
                com.bytedance.sdk.openadsdk.activity.single.gjv.dkl dklVar3 = new com.bytedance.sdk.openadsdk.activity.single.gjv.dkl(iXr) { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ojm.6
                    @Override // com.bytedance.sdk.openadsdk.activity.single.gjv.dkl
                    public void hnj() {
                        ojm.this.bug.f13453ff.sendEmptyMessage(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE);
                    }
                };
                this.f13495hn = dklVar3;
                dklVar3.sk();
            }
        }
        hnj hnjVar3 = this.bug;
        if (hnjVar3.f13455gn == null || !hnjVar3.dse()) {
            return;
        }
        this.bug.f13455gn.hnj(iXr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uua() {
        com.bytedance.sdk.openadsdk.activity.single.hn hnVarFf;
        hnj hnjVar = this.bug;
        if (hnjVar.dy) {
            com.bytedance.sdk.openadsdk.activity.single.aq aqVar = hnjVar.f13463th;
            if (aqVar == null || (hnVarFf = aqVar.ff()) == null) {
                return;
            }
            hnVarFf.hnj(2);
            return;
        }
        if (this instanceof dse) {
            ojm();
        } else {
            com.bytedance.sdk.openadsdk.activity.single.gjv.dkl dklVar = this.f13495hn;
            if (dklVar != null) {
                dklVar.hn();
            }
        }
        this.qor = true;
    }

    public int aq() {
        com.bytedance.sdk.openadsdk.activity.single.gjv.dkl dklVar = this.f13495hn;
        if (dklVar != null) {
            return (int) (dklVar.dkl() / 1000);
        }
        return 0;
    }

    public int bug() {
        com.bytedance.sdk.openadsdk.activity.single.hn hnVarFf;
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar = this.bug.f13463th;
        if (aqVar == null || (hnVarFf = aqVar.ff()) == null) {
            return 0;
        }
        return hnVarFf.gm();
    }

    public void dkl() {
        if (this.mjg && !this.jip) {
            this.jip = true;
            com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.f13496oj;
            if (hnjVar != null) {
                hnjVar.gjv();
            }
            FrameLayout frameLayout = this.uua;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            oj ojVar = this.hnj;
            if (ojVar != null) {
                ojVar.aq();
                this.hnj = null;
            }
            com.bytedance.sdk.openadsdk.activity.single.gjv.dkl dklVar = this.f13495hn;
            if (dklVar != null) {
                dklVar.gjv();
                this.f13495hn = null;
            }
        }
    }

    public boolean dnm() {
        return !this.qor;
    }

    public int dse() {
        return 0;
    }

    public boolean fc() {
        oj ojVar = this.hnj;
        if (ojVar != null) {
            return ojVar.ojm();
        }
        return false;
    }

    public void hnj(int i10) {
    }

    public void mjg() {
        if (!this.f13498xn.compareAndSet(false, true)) {
            this.bug.nyv.dse();
            return;
        }
        com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.f13496oj;
        if (hnjVar != null) {
            hnjVar.hnj(true);
        }
        this.bug.nyv.dse(true);
        hnj hnjVar2 = this.bug;
        hnjVar2.f13465ul.hnj(true, hnjVar2.f13460qb);
        if (this.bug.f13465ul.sk()) {
            hnj hnjVar3 = this.bug;
            hnjVar3.f13455gn.hnj(hnjVar3.dse);
            return;
        }
        hnj hnjVar4 = this.bug;
        hnjVar4.nyv.hnj(hnjVar4.dzo, true);
        this.bug.nyv.qor(true);
        this.bug.nyv.hn(true);
        this.bug.f13453ff.removeMessages(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE);
    }

    public void ojm() {
        com.bytedance.sdk.openadsdk.activity.single.gjv.dkl dklVar = this.f13495hn;
        if (dklVar != null) {
            dklVar.hn();
        }
    }

    public boolean orl() {
        return this.aq;
    }

    public void qor() {
        if (this.mjg) {
            this.aq = true;
            qor(this.bug.dzo);
            this.f13496oj.hnj();
            oj();
            if (hqh.aq(this.f13497ta)) {
                this.bug.nyv.dkl();
            }
        }
    }

    public void sk() {
        if (!this.mjg || this.f13498xn.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.f13496oj;
        if (hnjVar != null) {
            hnjVar.qor();
        }
        com.bytedance.sdk.openadsdk.activity.single.gjv.dkl dklVar = this.f13495hn;
        if (dklVar != null) {
            dklVar.hn();
        }
    }

    public boolean ta() {
        return false;
    }

    public void hn(boolean z10) {
        if (this.mjg) {
            hnj hnjVar = this.bug;
            if (hnjVar.xad) {
                this.uua = (FrameLayout) hnjVar.fvt.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f14670nn);
                hnj(z10);
                jip();
            }
        }
    }

    public void hnj() {
        if (this.mjg && !this.orl) {
            this.orl = true;
        }
    }

    protected com.bytedance.sdk.openadsdk.orl.dkl hn() {
        return new com.bytedance.sdk.openadsdk.orl.dkl() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.ojm.3
            @Override // com.bytedance.sdk.openadsdk.orl.dkl
            public void hnj() {
                ojm.this.bug.sq.hn(false);
            }
        };
    }

    protected void hnj(boolean z10) {
        FrameLayout frameLayout = this.uua;
        if (frameLayout != null) {
            hnj hnjVar = this.bug;
            Context context = hnjVar.jbd;
            as asVar = this.f13497ta;
            int i10 = hnjVar.lu;
            com.bytedance.sdk.openadsdk.activity.single.aq aqVar = hnjVar.f13463th;
            com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.wu.hnj.hnj(context, asVar, i10, z10, frameLayout, false, aqVar != null ? aqVar.jbd() : 0);
            this.f13496oj = hnjVar2;
            hnjVar2.hnj(this.bug.sq);
            this.f13496oj.hnj(true, hn());
        }
    }

    public void qor(boolean z10) {
        if (this.mjg && this.f13496oj != null && this.aq) {
            this.f13496oj.hnj(z10);
        }
    }

    public void gjv() {
        if (!this.mjg || this.f13498xn.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.f13496oj;
        if (hnjVar != null) {
            hnjVar.hn();
        }
        if (this.f13495hn == null || !dnm()) {
            return;
        }
        this.f13495hn.qor();
    }

    public void hnj(long j10) {
        com.bytedance.sdk.openadsdk.activity.single.gjv.dkl dklVar = this.f13495hn;
        if (dklVar != null) {
            dklVar.qor();
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.qor.sk skVar) {
        com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar;
        if (this.mjg && (hnjVar = this.f13496oj) != null) {
            hnjVar.hnj(skVar);
        }
    }
}
