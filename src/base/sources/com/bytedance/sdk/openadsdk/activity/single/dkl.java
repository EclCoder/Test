package com.bytedance.sdk.openadsdk.activity.single;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.dnm;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.vf;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.fc;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends hnj {
    private boolean apu;

    public dkl(hn hnVar, as asVar, int i10, int i11, boolean z10) {
        super(hnVar, asVar, i10, i11, z10);
    }

    private boolean hnj(as asVar) {
        return asVar == null || asVar.m34if() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    protected void a_() {
        hn hnVar = this.dse;
        if (hnVar != null && hnVar.qor()) {
            super.a_();
            return;
        }
        final View viewTa = this.ojm.f13464ua.ta();
        if (viewTa != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.dkl.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (dkl.this.ojm.nyv.apu() && dkl.this.ojm.ojm.get()) {
                        boolean zOrl = dkl.this.ojm.pty.orl();
                        dkl.this.ojm.nyv.dkl(zOrl);
                        dkl.this.ojm.f13464ua.dkl(8);
                        dkl.this.ojm.f13453ff.sendEmptyMessageDelayed(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE, 5000L);
                        if (!as.qor(dkl.this.ojm.f13456hn)) {
                            return;
                        }
                        if (as.qor(dkl.this.ojm.f13456hn) && zOrl) {
                            return;
                        }
                    }
                    dkl.this.ojm.nyv.eum();
                    dkl.this.ojm.pty.dnm();
                    dkl.this.ojm.tgn.dkl();
                    dkl.this.cm();
                }
            };
            viewTa.setOnClickListener(onClickListener);
            viewTa.setTag(viewTa.getId(), onClickListener);
        }
        this.ojm.f13454gm.hnj(new com.bytedance.sdk.openadsdk.component.reward.top.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.dkl.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void gjv(View view) {
                dkl dklVar = dkl.this;
                dklVar.hn(dklVar.ojm);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hn(View view) {
                dkl.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view) {
                com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
                if (apu.hnj(dkl.this.ojm.f13456hn) && !dkl.this.ojm.orl.get()) {
                    dkl.this.cm();
                    return;
                }
                dkl.this.ojm.eum.gm();
                fc.hnj hnjVar = new fc.hnj();
                hnjVar.hn(dkl.this.ojm.eum.orl());
                hnjVar.gjv(dkl.this.ojm.eum.tgn());
                hnjVar.qor(dkl.this.ojm.eum.uua());
                hnjVar.qor(3);
                hnjVar.gjv(dkl.this.ojm.eum.tu());
                hnjVar.hnj(dkl.this.ojm.eum.hn());
                com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(dkl.this.ojm.eum.aq(), hnjVar, dkl.this.ojm.eum.sk());
                vf.qor(dkl.this.ojm.dkl);
                dkl.this.ojm.eum.hnj(FreeSpaceBox.TYPE, false);
                dkl.this.ojm.f13454gm.gjv(false);
                dkl dklVar = dkl.this;
                if (dklVar.ojm.qor) {
                    dklVar.hnj(true, 4);
                } else {
                    dklVar.cm();
                }
                as asVar = dkl.this.ojm.f13456hn;
                if (asVar != null && asVar.fvx() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = dkl.this.ojm;
                    if (hnjVar2.eum != null && (gjvVarHnj = hnjVar2.f13456hn.fvx().hnj()) != null) {
                        gjvVarHnj.dkl(dkl.this.ojm.eum.orl());
                        gjvVarHnj.sk(dkl.this.ojm.eum.orl());
                    }
                }
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(dkl.this.ojm.f13456hn, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void qor(View view) {
                View view2 = viewTa;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view, String str) {
                dkl.this.hnj(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    protected boolean b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    protected boolean c_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public String d_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.hnj
    public FrameLayout dse() {
        dnm dnmVar;
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar;
        if (this.dkl.dkl()) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
            if (hnjVar == null || (ojmVar = hnjVar.f33do) == null) {
                return null;
            }
            return ojmVar.hn();
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.ojm;
        if (hnjVar2 == null || (dnmVar = hnjVar2.f13464ua) == null) {
            return null;
        }
        return dnmVar.dkl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void e_() {
        this.ojm.f13466vf.hnj(((hnj) this).f13198hn);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public boolean f_() {
        return this.ojm.dzo;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void fvt() {
        super.fvt();
        this.f13199sk = false;
        this.ojm.f33do.hn(false);
        this.ojm.eum.dzo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.hnj, com.bytedance.sdk.openadsdk.activity.single.aq
    public void gjv() {
        super.gjv();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar == null || !hn(hnjVar.f13456hn) || hnj(this.ojm.f13456hn)) {
            return;
        }
        if (this.apu) {
            this.apu = false;
            cm();
        } else if (this.ojm.nyv.tgn()) {
            cm();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.hnj
    public void hn() {
        if (as.sk(this.ojm.f13456hn)) {
            this.ojm.f13454gm.hnj(null, TTAdDislikeToast.getSkipText());
        } else {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
            if (hnjVar.qor) {
                this.ojm.f13454gm.hnj(null, TTAdDislikeToast.getSkipText());
            } else {
                hnjVar.f13454gm.hnj(null, "X");
            }
        }
        this.ojm.f13454gm.sk(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ul() {
        if (this.ojm.f13456hn.m34if() != 100.0f) {
            this.apu = true;
        }
        super.ul();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void hnj(String str) {
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        hnjVar.dzo = !hnjVar.dzo;
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = hnjVar.f33do;
        if (ojmVar != null && ojmVar.hnj() != null) {
            this.ojm.f33do.hnj().setSoundMute(this.ojm.dzo);
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.ojm;
        hnjVar2.eum.hnj(hnjVar2.dzo, str);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.ojm;
        hnjVar3.nyv.sk(hnjVar3.dzo);
        as asVar = this.ojm.f13456hn;
        if (asVar == null || (gjvVarFvx = asVar.fvx()) == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar4 = this.ojm;
        if (hnjVar4.dzo) {
            gjvVarHnj.aq(hnjVar4.eum.orl());
        } else {
            gjvVarHnj.ojm(hnjVar4.eum.orl());
        }
    }

    private boolean hn(as asVar) {
        if (asVar == null) {
            return false;
        }
        return oj.gjv().apu(String.valueOf(this.ojm.dkl));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ua() {
    }
}
