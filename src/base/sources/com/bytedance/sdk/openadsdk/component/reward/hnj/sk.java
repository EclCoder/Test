package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ua;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.view.dse f13505hn;
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnj;
    private hnj qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar, int i10);
    }

    public sk(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.hnj = hnjVar;
        this.f13505hn = new com.bytedance.sdk.openadsdk.component.reward.view.dse(hnjVar);
    }

    private int dkl() {
        as asVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        if (hnjVar != null && (asVar = hnjVar.f13456hn) != null) {
            int iVb = asVar.vb();
            if (oj.gjv() == null) {
                return -1;
            }
            int iHnj = oj.gjv().hnj(this.hnj.f13456hn.atw());
            if (!hnj(iVb) && !hnj(iHnj)) {
                return Math.min(hn(iVb), hn(iHnj));
            }
        }
        return -1;
    }

    private boolean hnj(int i10) {
        return i10 < 0 || i10 > 20000;
    }

    public void gjv() {
        hnj(true);
    }

    public void hn() {
        this.f13505hn.qor();
    }

    public void qor() {
        this.f13505hn.gjv();
    }

    public boolean sk() {
        return this.f13505hn.sk();
    }

    public boolean hn(com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar) {
        boolean z10;
        this.hnj.dse = dkl();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        int i10 = hnjVar.dse;
        if (hnjVar.f13456hn.apu()) {
            return false;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
        int i11 = hnjVar2.dse;
        if (i11 != -1) {
            if (i11 >= 0) {
                hnjVar2.f13459oj.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.hnj;
                messageObtain.arg1 = hnjVar3.dse;
                hnjVar3.f13453ff.sendMessage(messageObtain);
                if (!hqh.dse(this.hnj.f13456hn)) {
                    z10 = true;
                }
            }
            z10 = false;
        } else if (hnjVar2.f13463th == null && hqh.aq(hnjVar2.f13456hn) && this.hnj.nyv.orl()) {
            hnVar.eum();
            z10 = false;
        } else {
            hnVar.orl();
            z10 = true;
        }
        if (this.hnj.nyv.apu() ? false : z10) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar4 = this.hnj;
            if (hnjVar4.f13455gn == null || !hnjVar4.dse()) {
                return true;
            }
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar5 = this.hnj;
            hnjVar5.f13455gn.hnj(hnjVar5.dse);
        }
        return true;
    }

    public void hnj() {
        this.f13505hn.hnj();
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.qor.sk skVar) {
        this.f13505hn.hnj(skVar);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    public void hnj(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar, int i10) {
        if (this.hnj != null) {
            com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj("videoForceBreak", this.hnj.f13456hn);
            com.bytedance.sdk.openadsdk.p000do.hnj.qor.hn(this.hnj.f13456hn);
        }
        Objects.toString(hnVar);
        if (this.hnj.orp.isFinishing() || hnVar == null) {
            return;
        }
        this.hnj.f13464ua.bug();
        if (z11) {
            this.hnj.bug.set(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        if (hnjVar.fr && !hnjVar.orl.get() && !apu.orl(this.hnj.f13456hn) && !apu.dnm(this.hnj.f13456hn) && (!apu.hn(this.hnj.f13456hn) || !this.hnj.bug.get() || !this.hnj.mjg.get())) {
            if ((apu.hn(this.hnj.f13456hn) && z12) || !hn(z11)) {
                return;
            }
            if (apu.hn(this.hnj.f13456hn) || apu.gjv(this.hnj.f13456hn) || apu.dse(this.hnj.f13456hn)) {
                this.hnj.f13454gm.qor(false);
                hnVar.orl();
                return;
            }
        }
        if (this.hnj.orp.isDestroyed() || this.hnj.orp.isFinishing()) {
            return;
        }
        if (this.hnj.f13456hn.ouk()) {
            com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.hnj.f33do;
            com.bytedance.sdk.openadsdk.core.ojm.qor brandBannerController = (ojmVar == null || ojmVar.hnj() == null) ? null : ojmVar.hnj().getBrandBannerController();
            if (brandBannerController != null) {
                brandBannerController.hn();
            }
            this.hnj.orp.finish();
            return;
        }
        hnj hnjVar2 = this.qor;
        if (hnjVar2 != null) {
            hnjVar2.hnj(z10, z11, z12, hnVar, i10);
            return;
        }
        this.hnj.eum.apu();
        this.hnj.nyv.wu();
        this.hnj.f13462ta.set(false);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.hnj;
        if (hnjVar3.idl) {
            com.bytedance.sdk.openadsdk.activity.single.aq aqVar = hnjVar3.f13463th;
            if (!(aqVar instanceof com.bytedance.sdk.openadsdk.activity.single.sk) || aqVar.orp()) {
                this.hnj.dnm.set(false);
            }
        } else {
            this.hnj.dnm.set(false);
        }
        this.hnj.f13466vf.hnj();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar4 = this.hnj;
        hnjVar4.f13454gm.hnj(hnjVar4.f13456hn.ij());
        if (this.hnj.ojm.getAndSet(true)) {
            return;
        }
        if (hqh.hn(this.hnj.f13456hn) && this.hnj.fzb) {
            hnj(z10, z11, z12, i10);
            this.hnj.f13464ua.gjv(8);
            this.hnj.f13454gm.qor(true);
            this.hnj.as.ta();
            com.bytedance.sdk.openadsdk.core.fc.qor().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.sk.1
                @Override // java.lang.Runnable
                public void run() {
                    sk.this.hnj.f13464ua.qor();
                    if (sk.this.hnj.f33do != null) {
                        sk.this.hnj.f33do.dkl();
                    }
                }
            });
            return;
        }
        hnj(z10, hnVar);
    }

    private int hn(int i10) {
        if (i10 <= 1000) {
            return 1000;
        }
        return (i10 / 1000) * 1000;
    }

    private boolean hn(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.view.qor qorVarHnj;
        if (!apu.qor(this.hnj.f13456hn) || (qorVarHnj = this.hnj.f33do.hnj()) == null || qorVarHnj.gjv != 0 || z10) {
            return true;
        }
        this.hnj.f13454gm.qor(false);
        return false;
    }

    private void hnj(boolean z10, boolean z11, boolean z12, int i10) {
        int i11;
        HashMap map = new HashMap();
        if (this.hnj.nyv.xyo()) {
            i11 = 1;
        } else {
            i11 = !this.hnj.nyv.mjg() ? -1 : 2;
        }
        map.put("webview_state", Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnjVar.f13456hn, hnjVar.f13461sk, z10, z11, z12, hnjVar.orp.isFinishing(), i10, map);
    }

    public void hnj(boolean z10, com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar) {
        orl orlVar;
        this.hnj.f13452fc.set(z10);
        hnVar.bug();
        this.hnj.f13456hn.qs();
        this.hnj.f13454gm.gjv(false);
        this.hnj.f13454gm.qor(false);
        this.hnj.nyv.as();
        apu apuVar = this.hnj.f13464ua.f13541fc;
        if (apuVar != null) {
            apuVar.sk();
        }
        this.hnj.f13464ua.qor();
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.hnj.f33do;
        if (ojmVar != null) {
            ojmVar.dkl();
        }
        aq aqVar = this.hnj.as;
        if (aqVar != null) {
            aqVar.qor(aq.f13430hn);
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        if (!TextUtils.isEmpty(as.hnj(hnjVar.jbd, hnjVar.f13456hn))) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
            com.bytedance.sdk.openadsdk.utils.as.hnj(hnjVar2.orp, hqh.bug(hnjVar2.f13456hn), this.hnj.f13456hn, com.bytedance.sdk.openadsdk.gjv.hn.hnj.qor, true);
            return;
        }
        if (as.qor(this.hnj.f13456hn) && (orlVar = this.hnj.pty) != null) {
            orlVar.dkl();
        }
        if (!as.hnj(this.hnj.f13456hn) && (as.qor(this.hnj.f13456hn) || !this.hnj.nyv.hqh())) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.hnj;
            if (as.hnj(hnjVar3.f13456hn, hnjVar3.nyv.orl(), this.hnj.nyv.gm(), this.hnj.pty.bug(), this.hnj.nyv.m23do())) {
                if (!as.gjv(this.hnj.f13456hn) && !as.qor(this.hnj.f13456hn)) {
                    this.hnj.nyv.hnj(true, 0, (String) null);
                }
                hn(hnVar);
                hnj(hnVar);
                return;
            }
        }
        gjv();
    }

    void hnj(com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar) {
        if (!as.qor(this.hnj.f13456hn)) {
            this.hnj.pty.hnj(8);
            this.hnj.nyv.hnj(0);
            this.hnj.nyv.nyv();
        } else {
            this.hnj.nyv.hnj(8);
            this.hnj.pty.hnj(0);
            this.hnj.pty.dse();
        }
        this.hnj.f13464ua.gjv(8);
        this.hnj.f13464ua.dse();
        if (as.qor(this.hnj.f13456hn)) {
            this.hnj.f13453ff.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        hnjVar.nyv.hnj(hnjVar.dzo, true);
        this.hnj.nyv.qor(true);
        this.hnj.nyv.hn(true);
        ua uaVarOjm = this.hnj.nyv.ojm();
        if (uaVarOjm != null) {
            uaVarOjm.hnj("prerender_page_show", (JSONObject) null);
        }
        if (!hqh.hn(this.hnj.f13456hn)) {
            this.hnj.f13454gm.qor(false);
        }
        com.bytedance.sdk.component.ojm.dkl dklVarAq = this.hnj.nyv.aq();
        if (dklVarAq == null || dklVarAq.getWebView() == null) {
            return;
        }
        dklVarAq.orl();
        dklVarAq.getWebView().resumeTimers();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void hnj(boolean z10) {
        if (!as.gjv(this.hnj.f13456hn)) {
            this.hnj.nyv.hnj(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
        }
        this.hnj.nyv.hn(com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.qor.hnj() ? 1 : 0);
        this.hnj.nyv.hnj(8);
        this.hnj.pty.hnj(8);
        this.hnj.f13464ua.gjv(8);
        if (this.hnj.f13456hn.qs()) {
            if (!this.f13505hn.hnj(this.hnj.eum)) {
                this.hnj.orp.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.single.aq aqVar = this.hnj.f13463th;
            if (aqVar != null) {
                this.f13505hn.hnj(aqVar.ff().ta());
            }
            this.f13505hn.hn();
        }
        this.hnj.f13464ua.dse();
        if (z10) {
            hn(this.hnj.f13460qb);
        }
        this.hnj.f13454gm.qor(false);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        hnjVar.tgn.hnj(hnjVar.f13456hn.hhw());
    }

    public void hnj(hnj hnjVar) {
        this.qor = hnjVar;
    }
}
