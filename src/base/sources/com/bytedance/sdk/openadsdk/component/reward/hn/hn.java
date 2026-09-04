package com.bytedance.sdk.openadsdk.component.reward.hn;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.a;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.aq;
import com.bytedance.sdk.openadsdk.component.reward.hnj.bug;
import com.bytedance.sdk.openadsdk.component.reward.hnj.fc;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.dnm;
import com.bytedance.sdk.openadsdk.component.reward.view.ojm;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.gjv.ta;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.mjg;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.google.api.client.http.HttpStatusCodes;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hn extends hnj {
    public com.bytedance.sdk.openadsdk.core.widget.hn bug;
    protected com.bytedance.sdk.openadsdk.core.qor.sk dnm;
    private com.bytedance.sdk.openadsdk.orl.dkl orl;

    public hn(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        super(hnjVar);
    }

    private void gjv(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        bug bugVar = hnjVar.f13454gm;
        if (bugVar != null) {
            bugVar.gjv();
        }
    }

    private void qor(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        dnm dnmVar = hnjVar.f13464ua;
        if (dnmVar == null || dnmVar.ta() == null) {
            return;
        }
        hnjVar.f13464ua.ta().performClick();
    }

    public void apu() {
        if (!this.hnj.as.dnm() && oj.gjv().eum(String.valueOf(this.hnj.dkl)) == 1) {
            int iHnj = hnj(this.hnj);
            if (hn(this.hnj)) {
                qor(this.hnj);
            } else if (hnj(this.hnj, iHnj)) {
                gjv(this.hnj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00f3  */
    public View aq() {
        View viewCreatePAGLogoViewByMaterial;
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(this.hnj.orp);
        qorVar.setId(jip.sz);
        View viewHn = com.bytedance.sdk.openadsdk.core.widget.dkl.hn(this.hnj.orp);
        viewHn.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = sq.hn(this.hnj.orp, 20.0f);
        layoutParams.rightMargin = sq.hn(this.hnj.orp, 16.0f);
        viewHn.setLayoutParams(layoutParams);
        viewHn.setContentDescription(wu.hnj(this.hnj.orp, "tt_ad_close_text"));
        viewHn.setVisibility(8);
        aq aqVar = this.hnj.f13463th;
        if (aqVar == null || !aqVar.ff().tgn()) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
            viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(hnjVar.orp, hnjVar.f13456hn);
            viewCreatePAGLogoViewByMaterial.setId(520093757);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, sq.hn(this.hnj.orp, 14.0f));
            layoutParams2.gravity = 8388691;
            viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        } else {
            viewCreatePAGLogoViewByMaterial = null;
        }
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(this.hnj.orp);
        gjvVar.setId(jip.mdk);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(sq.hn(this.hnj.orp, 32.0f), sq.hn(this.hnj.orp, 14.0f));
        layoutParams3.gravity = 8388693;
        gjvVar.setLayoutParams(layoutParams3);
        gjvVar.setPadding(sq.hn(this.hnj.orp, 9.0f), 0, sq.hn(this.hnj.orp, 9.0f), 0);
        gjvVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (viewCreatePAGLogoViewByMaterial != null) {
            qorVar.addView(viewCreatePAGLogoViewByMaterial);
        }
        qorVar.addView(gjvVar);
        if (this.hnj.f13456hn.dzo()) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
            if (!hnjVar2.dy || hnjVar2.hnj != 1) {
                View qorVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.qor(this.hnj.orp);
                qorVar2.setId(jip.f52if);
                qorVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                qorVar.addView(qorVar2);
            }
        } else {
            View qorVar3 = new com.bytedance.sdk.openadsdk.component.reward.top.qor(this.hnj.orp);
            qorVar3.setId(jip.f52if);
            qorVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            qorVar.addView(qorVar3);
        }
        qorVar.addView(viewHn);
        return qorVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    public void as() {
        as asVar;
        if (!sk() && (this instanceof dse)) {
            this.hnj.tgn.hn();
            return;
        }
        if (!this.ojm.hnj(this.f13413sk.fc(), false)) {
            this.hnj.eum.dnm();
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
            if (hnjVar.dy) {
                aq aqVar = hnjVar.f13463th;
                if (aqVar instanceof com.bytedance.sdk.openadsdk.activity.single.hnj) {
                    ((com.bytedance.sdk.openadsdk.activity.single.hnj) aqVar).as();
                } else {
                    hnj(com.bytedance.sdk.openadsdk.gjv.hn.C0241hn.hnj);
                    fc fcVar = this.f13413sk;
                    fcVar.hnj(!fcVar.orp() ? 1 : 0, 4);
                }
            } else {
                hnj(com.bytedance.sdk.openadsdk.gjv.hn.C0241hn.hnj);
                fc fcVar2 = this.f13413sk;
                fcVar2.hnj(!fcVar2.orp() ? 1 : 0, 4);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
        if (hnjVar2 == null || (asVar = hnjVar2.f13456hn) == null || hnjVar2.f13455gn == null || !asVar.ouk()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.hnj;
        hnjVar3.f13455gn.hnj(hnjVar3.eum.xyo());
    }

    public void bug() {
        com.bytedance.sdk.openadsdk.core.widget.hn hnVar = this.bug;
        if (hnVar == null || !hnVar.isShowing()) {
            return;
        }
        this.bug.dismiss();
    }

    public abstract void dkl();

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m20do() {
        qor();
        if (!this.hnj.f13456hn.qs() && tgn()) {
            tu();
        }
        if (tgn()) {
            this.hnj.f13465ul.hn();
        }
        if (apu.gjv(this.hnj.f13456hn) || apu.dse(this.hnj.f13456hn)) {
            this.f13414ta.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        hnjVar.f13464ua.hnj(hnjVar.rmr == 100.0f);
        wu();
        dkl();
    }

    public RFEndCardBackUpLayout dse() {
        return new RFEndCardBackUpLayout(this.hnj.jbd);
    }

    public void eum() {
        this.hnj.f13454gm.qor();
        this.hnj.f13454gm.sk(true);
    }

    public void fc() {
        if (this.hnj.f13463th != null || ((!hqh.hn(this.f13412hn) && !hqh.qor(this.f13412hn)) || (hqh.aq(this.f13412hn) && this.hnj.nyv.vf() && !this.hnj.nyv.pty()))) {
            jip();
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        if (hnjVar == null) {
            return;
        }
        mjg mjgVar = hnjVar.f13455gn;
        if (mjgVar != null) {
            mjgVar.hnj();
        }
        this.hnj.gjv();
    }

    public abstract boolean gjv();

    public void hn(boolean z10) {
        try {
            ojm ojmVar = this.hnj.f33do;
            if (ojmVar != null && !z10) {
                ojmVar.dkl();
            }
            dnm dnmVar = this.hnj.f13464ua;
            if (dnmVar != null) {
                dnmVar.mjg();
            }
            this.hnj.eum.ua();
            if (!gjv()) {
                this.hnj.ojm.get();
            }
            com.bytedance.sdk.openadsdk.component.reward.hnj.jip jipVar = this.hnj.nyv;
            if (jipVar != null) {
                jipVar.dnm();
            }
            com.bytedance.sdk.openadsdk.component.reward.hnj.aq aqVar = this.hnj.as;
            if (aqVar != null) {
                aqVar.qor(com.bytedance.sdk.openadsdk.component.reward.hnj.aq.hnj);
            }
            dnm dnmVar2 = this.hnj.f13464ua;
            if (dnmVar2 != null) {
                dnmVar2.bug();
            }
            com.bytedance.sdk.openadsdk.component.reward.hnj.sk skVar = this.hnj.f13465ul;
            if (skVar != null) {
                skVar.qor();
            }
            mjg mjgVar = this.hnj.f13455gn;
            if (mjgVar != null) {
                mjgVar.qor();
            }
        } catch (Throwable unused) {
        }
    }

    public abstract void hnj(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hnj
    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar, xyo xyoVar) {
        super.hnj(hnVar, xyoVar);
        if (this.hnj.f13456hn.dkl()) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
            if (hnjVar.fr) {
                hnjVar.nyv.hnj(false);
            }
        }
    }

    protected void jip() {
        int i10;
        if (this.hnj.ojm.get() && this.hnj.f13459oj.getAndSet(false) && ((i10 = this.hnj.dse) >= 0 || i10 == -1)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 700;
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
            messageObtain.arg1 = hnjVar.dse;
            hnjVar.f13453ff.sendMessage(messageObtain);
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
        if (hnjVar2.aq <= 0 || !hnjVar2.f13468xn.getAndSet(false)) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 900;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.hnj;
        messageObtain2.arg1 = hnjVar3.aq;
        hnjVar3.f13453ff.sendMessage(messageObtain2);
    }

    public void mjg() {
        xyo xyoVar = this.f13414ta;
        if (xyoVar != null) {
            xyoVar.removeMessages(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
        }
    }

    public void oj() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        if (hnjVar == null) {
            return;
        }
        dnm dnmVar = hnjVar.f13464ua;
        if (dnmVar != null) {
            dnmVar.jip();
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
        boolean z10 = hnjVar2.dzo;
        hnjVar2.hqh.hnj();
        DeviceUtils.dse();
        this.hnj.nyv.fc();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.hnj;
        if (hnjVar3.dzo) {
            hnjVar3.orp.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hn.hn.1
                @Override // java.lang.Runnable
                public void run() {
                    if (hn.this.hnj.hqh.hnj() > 0) {
                        hn.this.hnj.hqh.hnj(false);
                    }
                }
            });
        }
    }

    public View ojm() {
        com.bytedance.sdk.openadsdk.core.dkl.dse dseVar;
        if (this.f13412hn.vh() != 5) {
            dseVar = new com.bytedance.sdk.openadsdk.core.dkl.dse(this.hnj.orp);
            dseVar.setId(jip.ajq);
        } else {
            dseVar = null;
        }
        Objects.toString(dseVar);
        return dseVar;
    }

    public void orl() {
        if (this.hnj.dse()) {
            this.hnj.f13454gm.sk();
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
            if (hnjVar.dy && (hnjVar.f13463th instanceof com.bytedance.sdk.openadsdk.activity.single.hnj)) {
                return;
            }
            hnjVar.f13464ua.dkl(0);
        }
    }

    public abstract boolean sk();

    public void ta() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        hnjVar.tu.hnj(hnjVar.gjv);
        this.hnj.f13464ua.hn();
        this.hnj.f13465ul.hnj();
        if (!this.hnj.f13456hn.qs()) {
            this.hnj.nyv.hnj();
            this.hnj.pty.hnj();
        }
        this.hnj.as.dse();
        this.hnj.f13454gm.hnj();
        if (hqh.dkl(this.hnj.f13456hn)) {
            this.hnj.f13464ua.gjv();
            sq.hnj((View) this.hnj.nyv.aq(), 4);
        }
        if (apu.gjv(this.hnj.f13456hn) || apu.hn(this.hnj.f13456hn) || apu.dse(this.hnj.f13456hn)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
        dnm dnmVar = hnjVar2.f13464ua;
        int iHn = sq.hn(hnjVar2.jbd, hnjVar2.eta);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.hnj;
        dnmVar.hnj(iHn, sq.hn(hnjVar3.jbd, hnjVar3.zt));
        this.hnj.wu.hnj();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar4 = this.hnj;
        if (hnjVar4.lhi) {
            hnjVar4.f13464ua.hnj(0);
        }
    }

    protected boolean tgn() {
        return true;
    }

    public final void tu() {
        if (this.hnj.orp.isFinishing()) {
            return;
        }
        this.hnj.nyv.ta();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        String str = hnjVar.gjv ? "reward_endcard" : "fullscreen_endcard";
        hnjVar.nyv.hnj(this.orl, str, hnjVar.sq);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
        if (hnjVar2.fzb) {
            hnjVar2.as.hnj(hnjVar2.dzo);
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.hnj;
        hnjVar3.nyv.hnj(str, hnjVar3.sq);
        this.hnj.nyv.sk();
    }

    public void uua() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        if (hnjVar == null) {
            return;
        }
        try {
            hnjVar.pnz = false;
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
            boolean z10 = hnjVar2.pnz;
            boolean z11 = hnjVar2.dzo;
            if (!hnjVar2.f13462ta.get()) {
                this.hnj.eum.jip();
            }
            mjg();
            this.hnj.nyv.jip();
            this.hnj.as.aq();
            this.hnj.f13468xn.set(true);
            if (this.hnj.ojm.get()) {
                this.hnj.f13459oj.set(true);
            }
            mjg mjgVar = this.hnj.f13455gn;
            if (mjgVar != null) {
                mjgVar.hn();
            }
            this.hnj.sk();
        } catch (Throwable unused) {
        }
    }

    public void wu() {
        this.dnm = this.hnj.tgn.qor();
    }

    public void xn() {
        hn(false);
    }

    public void hnj(com.bytedance.sdk.openadsdk.component.reward.view.aq aqVar) {
        hnj(aqVar, this.hnj);
    }

    public void hnj(boolean z10, boolean z11, boolean z12, int i10) {
        this.hnj.f13465ul.hnj(z10, z11, z12, this, i10);
    }

    private int hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        if (hqh.qor(hnjVar.f13456hn)) {
            return hnjVar.f13456hn.acd();
        }
        if (hnjVar.gjv) {
            return hnjVar.f13456hn.qlh();
        }
        return hnjVar.f13456hn.kht();
    }

    private boolean hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, int i10) {
        if (i10 == -1) {
            return false;
        }
        boolean z10 = !hnjVar.ojm.get() || hqh.qor(hnjVar.f13456hn);
        fc fcVar = hnjVar.eum;
        boolean z11 = fcVar != null && fcVar.mjg() >= ((long) i10) * 1000;
        com.bytedance.sdk.openadsdk.component.reward.hnj.aq aqVar = hnjVar.as;
        return z10 && (z11 || (aqVar != null && aqVar.gjv()));
    }

    private boolean hn(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        dnm dnmVar = hnjVar.f13464ua;
        return dnmVar != null && dnmVar.ojm();
    }

    public void hnj(int i10) {
        this.f13413sk.apu();
        hnj(false, true, false, i10);
        if (this.hnj.gjv) {
            this.ojm.hn(10000);
        }
    }

    public void dnm() {
    }

    /* JADX WARN: Code duplicated, block: B:94:0x020d  */
    public void hnj(Message message) {
        apu apuVar;
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        int i10 = message.what;
        if (i10 == 1) {
            eum();
            return;
        }
        if (i10 == 300) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
            if (hnjVar.dy) {
                aq aqVar = hnjVar.f13463th;
                if (aqVar instanceof com.bytedance.sdk.openadsdk.activity.single.hnj) {
                    ((com.bytedance.sdk.openadsdk.activity.single.hnj) aqVar).as();
                } else {
                    hnj(com.bytedance.sdk.openadsdk.gjv.hn.C0241hn.f14351hn);
                    fc fcVar = this.hnj.eum;
                    fcVar.hnj(!fcVar.orp() ? 1 : 0, 1 ^ (this.hnj.eum.orp() ? 1 : 0));
                }
            } else {
                hnj(com.bytedance.sdk.openadsdk.gjv.hn.C0241hn.f14351hn);
                fc fcVar2 = this.hnj.eum;
                fcVar2.hnj(!fcVar2.orp() ? 1 : 0, 1 ^ (this.hnj.eum.orp() ? 1 : 0));
            }
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
            ta.hnj(hnjVar2.f13456hn, "play_video_time_out", hnjVar2.f13461sk, (String) null);
            com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = this.hnj.f13456hn.fvx();
            if (gjvVarFvx != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                gjvVarHnj.hnj(com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.GENERAL_LINEAR_AD_ERROR);
            }
            dnm dnmVar = this.hnj.f13464ua;
            if (dnmVar == null || (apuVar = dnmVar.f13541fc) == null) {
                return;
            }
            apuVar.ta();
            return;
        }
        if (i10 == 400) {
            this.hnj.eum.apu();
            hnj(false, true, false, 3);
            return;
        }
        if (i10 == 500) {
            if (!hqh.sk(this.hnj.f13456hn)) {
                this.hnj.f13454gm.qor(false);
            }
            com.bytedance.sdk.component.ojm.dkl dklVarAq = this.hnj.nyv.aq();
            if (dklVarAq != null && dklVarAq.getWebView() != null) {
                dklVarAq.orl();
                dklVarAq.getWebView().resumeTimers();
            }
            if (this.hnj.nyv.aq() != null) {
                this.hnj.nyv.hnj(1.0f);
                this.hnj.f13464ua.hnj(1.0f);
            }
            if (!this.hnj.f13456hn.hhw() && this.hnj.eum.dkl() && this.hnj.f13452fc.get()) {
                this.hnj.eum.apu();
                return;
            }
            return;
        }
        if (i10 == 600) {
            orl();
            return;
        }
        if (i10 == 700) {
            int i11 = message.arg1;
            if (this.hnj.f13459oj.get()) {
                return;
            }
            if (i11 > 0) {
                this.hnj.f13454gm.hn();
                this.hnj.f13454gm.hnj((CharSequence) ((i11 / 1000) + "s"));
                this.hnj.f13454gm.sk(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                messageObtain.arg1 = i11 - 1000;
                this.hnj.dse -= 1000;
                this.f13414ta.sendMessageDelayed(messageObtain, 1000L);
                return;
            }
            this.f13414ta.removeMessages(700);
            if (hqh.dse(this.f13412hn)) {
                if (!this.hnj.as.hn() && this.hnj.nyv.orl()) {
                    eum();
                    return;
                } else {
                    orl();
                    return;
                }
            }
            orl();
            return;
        }
        if (i10 != 800) {
            if (i10 == 900 && !this.hnj.f13468xn.get()) {
                int i12 = message.arg1;
                double dSq = this.hnj.eum.sq();
                hnj(i12, (long) (1000.0d * dSq));
                if (i12 > 0) {
                    this.hnj.f13454gm.hn();
                    this.hnj.f13454gm.hnj((CharSequence) ((i12 / 1000) + "s"));
                    this.hnj.f13454gm.sk(false);
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 900;
                    int i13 = i12 - 1000;
                    messageObtain2.arg1 = i13;
                    this.hnj.aq = i13;
                    this.f13414ta.sendMessageDelayed(messageObtain2, 1000L);
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.hnj;
                    if (hnjVar3.dy) {
                        aq aqVar2 = hnjVar3.f13463th;
                        if (!(aqVar2 instanceof com.bytedance.sdk.openadsdk.activity.single.hnj) || dSq <= 0.0d) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.activity.single.hnj) aqVar2).hnj((float) (1.0d - (((double) (i12 / 1000.0f)) / dSq)));
                        return;
                    }
                    return;
                }
                this.f13414ta.removeMessages(900);
                orl();
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar4 = this.hnj;
                aq aqVar3 = hnjVar4.f13463th;
                if (hnjVar4.dy && (aqVar3 instanceof com.bytedance.sdk.openadsdk.activity.single.hnj)) {
                    aqVar3.ff().hnj(aqVar3, new com.bytedance.sdk.openadsdk.activity.single.hn.sk(5, this.hnj));
                    return;
                }
                return;
            }
            return;
        }
        if (!hqh.hn(this.hnj.f13456hn)) {
            this.hnj.f13454gm.qor(false);
        }
        this.hnj.f13464ua.hnj(1.0f);
        if (!this.hnj.f13456hn.hhw() && this.hnj.eum.dkl() && this.hnj.f13452fc.get()) {
            this.hnj.eum.apu();
        }
    }

    private void hnj(long j10, long j11) {
        long j12 = j11 - j10;
        Activity activity = this.hnj.orp;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).qor(j12, j11);
        }
    }

    static void hnj(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        final com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar;
        Context context = frameLayout.getContext();
        if (hnjVar.fr) {
            com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
            qorVar.setId(jip.bug);
            frameLayout.addView(qorVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutHnj = hnj(context);
            String strHnj = "";
            if (as.sk(hnjVar.f13456hn)) {
                a aVarPwt = hnjVar.f13456hn.pwt();
                if (aVarPwt != null) {
                    strHnj = aVarPwt.J();
                }
            } else {
                List<com.bytedance.sdk.openadsdk.core.model.oj> listLx = hnjVar.f13456hn.lx();
                if (listLx != null && !listLx.isEmpty()) {
                    strHnj = listLx.get(0).hnj();
                }
            }
            if (TextUtils.isEmpty(strHnj)) {
                gjvVar = null;
            } else {
                gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
                int i10 = jip.rw;
                gjvVar.setId(i10);
                gjvVar.setTag(i10, strHnj);
                gjvVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutHnj.addView(gjvVar);
            }
            qorVar.addView(frameLayoutHnj);
            qorVar.addView(new com.bytedance.sdk.openadsdk.core.widget.dnm(context), new FrameLayout.LayoutParams(-1, -1));
            View gjvVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.gjv(context);
            gjvVar2.setId(jip.mjg);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(gjvVar2, layoutParams);
            gjvVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.hn.hn.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = hnjVar.fvt.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = hnjVar.fvt.findViewById(jip.mdk);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = hnjVar.fvt.findViewById(jip.dms);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar3 = gjvVar;
                    if (gjvVar3 != null) {
                        ViewGroup.LayoutParams layoutParams5 = gjvVar3.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            gjvVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
            skVar.setId(jip.f14657fc);
            skVar.setOrientation(1);
            skVar.setVisibility(8);
            frameLayout.addView(skVar, new FrameLayout.LayoutParams(-1, -1));
        }
        if (hnjVar.xad) {
            View dklVar = new com.bytedance.sdk.component.ojm.dkl(context, true, com.bytedance.sdk.component.ojm.dkl.qor.ENDCARD);
            dklVar.setId(jip.jip);
            dklVar.setLayerType(2, null);
            dklVar.setVisibility(4);
            boolean zDkl = apu.dkl(hnjVar.f13456hn);
            boolean zBug = apu.bug(hnjVar.f13456hn);
            if (!hnjVar.rq && (zDkl || zBug)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = sq.hn(hnjVar.jbd, 58.0f);
                frameLayout.addView(dklVar, layoutParams2);
            } else {
                frameLayout.addView(dklVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(jip.uua);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (hqh.hn(hnjVar.f13456hn)) {
                View qorVar2 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
                qorVar2.setId(jip.f14670nn);
                qorVar2.setVisibility(4);
                frameLayout.addView(qorVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    protected static FrameLayout hnj(Context context) {
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar.setId(jip.orl);
        qorVar.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        qorVar.setLayoutParams(layoutParams);
        return qorVar;
    }
}
