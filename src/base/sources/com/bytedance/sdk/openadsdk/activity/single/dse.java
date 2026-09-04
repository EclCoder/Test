package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.jip;
import com.bytedance.sdk.openadsdk.component.reward.view.dnm;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.vf;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.fc;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends hnj {
    private static String apu;
    private static String as;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static String f23do;
    private static String eum;
    private static String wu;
    private int tu;

    public dse(hn hnVar, as asVar, int i10, int i11, boolean z10) {
        super(hnVar, asVar, i10, i11, z10);
        this.tu = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x008a  */
    public void gn() {
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        this.ojm.eum.gm();
        fc.hnj hnjVar = new fc.hnj();
        hnjVar.hn(this.ojm.eum.orl());
        hnjVar.gjv(this.ojm.eum.tgn());
        hnjVar.qor(this.ojm.eum.uua());
        hnjVar.qor(3);
        hnjVar.gjv(this.ojm.eum.tu());
        hnjVar.hnj(this.ojm.eum.hn());
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(this.ojm.eum.aq(), hnjVar, this.ojm.eum.sk());
        vf.qor(this.ojm.dkl);
        this.ojm.eum.hnj(FreeSpaceBox.TYPE, false);
        if (this.ojm.qor) {
            hnj(true, 4);
            if (apu.hnj(this.ojm.f13456hn) && !this.ojm.orl.get()) {
                cm();
            }
        } else {
            cm();
        }
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = this.ojm.f13456hn.fvx();
        if (gjvVarFvx != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
            long jOrl = this.ojm.eum.orl();
            gjvVarHnj.dkl(jOrl);
            gjvVarHnj.sk(jOrl);
        }
        com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.ojm.f13456hn, 5);
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.dse.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (dse.this.ojm.nyv.apu() && dse.this.ojm.ojm.get()) {
                        boolean zOrl = dse.this.ojm.pty.orl();
                        dse.this.ojm.nyv.dkl(zOrl);
                        dse.this.ojm.f13464ua.dkl(8);
                        dse.this.ojm.f13453ff.sendEmptyMessageDelayed(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE, 5000L);
                        if (!as.qor(dse.this.ojm.f13456hn)) {
                            return;
                        }
                        if (as.qor(dse.this.ojm.f13456hn) && zOrl) {
                            return;
                        }
                    }
                    dse.this.ojm.nyv.eum();
                    dse.this.ojm.pty.dnm();
                    dse.this.ojm.tgn.dkl();
                    if (hqh.gjv(dse.this.ojm.f13456hn)) {
                        dse.this.hnj(true, true, (Runnable) null);
                    } else {
                        dse.this.cm();
                    }
                }
            };
            viewTa.setOnClickListener(onClickListener);
            viewTa.setTag(viewTa.getId(), onClickListener);
        }
        this.ojm.f13454gm.hnj(new com.bytedance.sdk.openadsdk.component.reward.top.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.dse.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void gjv(View view) {
                dse dseVar = dse.this;
                dseVar.hn(dseVar.ojm);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hn(View view) {
                dse.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view) {
                dse dseVar = dse.this;
                dseVar.hnj(hqh.qor(dseVar.ojm.f13456hn), false, (Runnable) null);
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
                dse.this.hnj(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    protected boolean c_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public String d_() {
        return "rewarded_video";
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.hnj, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void uua() {
        lu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.hnj
    protected void hn() {
        this.ojm.f13454gm.hnj(null, TTAdDislikeToast.getSkipText());
        this.ojm.f13454gm.sk(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hn(int i10) {
        if (i10 == 10000) {
            lu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.hnj, com.bytedance.sdk.openadsdk.activity.single.aq
    public void hnj(Activity activity, hn.sk skVar) {
        hn hnVar;
        super.hnj(activity, skVar);
        if (com.bytedance.sdk.component.utils.hn.hnj(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.f13128fc = intent.getStringExtra("media_extra");
        this.mjg = intent.getStringExtra("user_id");
        try {
            if (as == null) {
                as = wu.hnj(this.ojm.jbd, "tt_reward_msg");
                apu = wu.hnj(this.ojm.jbd, "tt_msgPlayable");
                wu = wu.hnj(this.ojm.jbd, "tt_negtiveBtnBtnText");
                f23do = wu.hnj(this.ojm.jbd, "tt_postiveBtnText");
                eum = wu.hnj(this.ojm.jbd, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.RewardAdScene", th2.getMessage());
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar == null || (hnVar = this.dse) == null) {
            return;
        }
        hnjVar.f13457jo = hnVar.hnj;
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
        StringBuilder sb2 = new StringBuilder("will set is Mute ");
        sb2.append(this.ojm.dzo);
        sb2.append(" mLastVolume=");
        sb2.append(this.ojm.hqh.hnj());
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

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(final boolean z10, boolean z11, final Runnable runnable) {
        if (!z11 && this.dse.orl() && runnable != null) {
            return false;
        }
        if (!oj.gjv().aq(String.valueOf(this.ojm.dkl))) {
            if (runnable == null) {
                if (z10) {
                    cm();
                    return false;
                }
                gn();
            }
            return false;
        }
        if (this.dse.uua()) {
            if (runnable == null) {
                if (z10) {
                    cm();
                    return false;
                }
                gn();
            }
            return false;
        }
        this.ojm.uua.set(true);
        this.ojm.eum.wu();
        if (z10) {
            this.ojm.as.dkl();
        }
        final com.bytedance.sdk.openadsdk.core.widget.hn hnVar = new com.bytedance.sdk.openadsdk.core.widget.hn(xad());
        ((hnj) this).f13198hn.bug = hnVar;
        if (z10) {
            hnVar.hnj(apu).hn(eum).qor(wu);
        } else {
            hnVar.hnj(as).hn(f23do).qor(wu);
        }
        ((hnj) this).f13198hn.bug.hnj(new com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.dse.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn
            public void hn() {
                hnVar.dismiss();
                dse.this.dse.hn(true);
                dse.this.ojm.uua.set(false);
                dse.this.ojm.as.hn(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z10) {
                    dse.this.gn();
                } else {
                    dse.this.ojm.tgn.dkl();
                    dse.this.cm();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn
            public void hnj() {
                dse.this.ojm.eum.eum();
                if (z10) {
                    dse.this.ojm.as.hnj(1000);
                }
                hnVar.dismiss();
                dse.this.ojm.uua.set(false);
            }
        }).show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.hnj, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.ojm.f13463th != null && this.dse.tu() == null) {
            hn hnVar = this.dse;
            if (hnVar != null && hnVar.qor()) {
                jip jipVar = this.f13132xn;
                if (jipVar != null && jipVar.hnj(hqh.qor(this.ojm.f13456hn), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.dse.4
                    @Override // java.lang.Runnable
                    public void run() {
                        dse.super.hnj(str, jSONObject);
                    }
                })) {
                    return;
                }
            } else if (hnj(hqh.qor(this.ojm.f13456hn), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.dse.5
                @Override // java.lang.Runnable
                public void run() {
                    dse.super.hnj(str, jSONObject);
                }
            })) {
                return;
            }
        }
        super.hnj(str, jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    protected void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        if (hnjVar.qor) {
            hnj(true, 4);
            if (apu.hnj(hnjVar.f13456hn) && !hnjVar.orl.get()) {
                cm();
            }
        } else {
            cm();
        }
        com.bytedance.sdk.openadsdk.common.hnj.hn(hnjVar);
    }
}
