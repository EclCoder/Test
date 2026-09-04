package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.jip;
import com.bytedance.sdk.openadsdk.common.mjg;
import com.bytedance.sdk.openadsdk.component.reward.bug;
import com.bytedance.sdk.openadsdk.core.Cdo;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.widget.oj;
import com.bytedance.sdk.openadsdk.gjv.ta;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.tgn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aq implements com.bytedance.sdk.openadsdk.core.mjg.gjv.hn {
    public boolean bug;
    protected as dkl;
    public int dnm;
    protected final hn dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    public String f13128fc;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f13129hn;
    private boolean hnj;
    public String mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    protected boolean f13130oj;
    protected com.bytedance.sdk.openadsdk.component.reward.hnj.hnj ojm;
    public boolean orl;
    private oj qor;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public int f13131ta;
    public boolean uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    protected jip f13132xn;
    protected final AtomicBoolean aq = new AtomicBoolean(false);
    public boolean jip = false;

    public aq(hn hnVar, as asVar, int i10, int i11, boolean z10) {
        this.dse = hnVar;
        this.dkl = asVar;
        this.f13131ta = i10;
        this.dnm = i11;
        this.uua = z10;
    }

    private jip aq() {
        return new jip(this.ojm) { // from class: com.bytedance.sdk.openadsdk.activity.single.aq.1
            @Override // com.bytedance.sdk.openadsdk.common.jip
            protected boolean hn() {
                return aq.this.dse.bug().getBoolean("reward_verify", false) || aq.this.dse.uua();
            }

            @Override // com.bytedance.sdk.openadsdk.common.jip
            protected boolean hnj() {
                return aq.this.dse.orl();
            }

            @Override // com.bytedance.sdk.openadsdk.common.jip
            protected void qor() {
                aq.this.cm();
            }

            @Override // com.bytedance.sdk.openadsdk.common.jip
            protected void hnj(boolean z10) {
                aq.this.dse.hn(z10);
            }

            @Override // com.bytedance.sdk.openadsdk.common.jip
            protected void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
                aq.this.hnj(hnjVar);
            }
        };
    }

    private com.bytedance.sdk.openadsdk.common.hnj.hn as() {
        return new com.bytedance.sdk.openadsdk.common.hnj.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.aq.3
            @Override // com.bytedance.sdk.openadsdk.common.hnj.hn
            public void hnj(boolean z10, int i10) {
                aq aqVar = aq.this;
                if (aqVar instanceof hnj) {
                    ((hnj) aqVar).hnj(z10, i10);
                } else if (aqVar instanceof sk) {
                    aqVar.dnm();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.hnj.hn
            public void hnj() {
                aq.this.cm();
            }
        };
    }

    private Runnable eum() {
        return new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.aq.2
            @Override // java.lang.Runnable
            public void run() {
                aq.this.cm();
            }
        };
    }

    private com.bytedance.sdk.openadsdk.common.hnj.InterfaceC0202hnj vf() {
        return new com.bytedance.sdk.openadsdk.common.hnj.InterfaceC0202hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.aq.4
            @Override // com.bytedance.sdk.openadsdk.common.hnj.InterfaceC0202hnj
            public void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, View view) {
                aq.this.hn(hnjVar);
            }
        };
    }

    protected void a_() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar;
        hn hnVar = this.dse;
        boolean z10 = hnVar != null && hnVar.qor();
        if (z10 && (hnjVar = this.ojm) != null && !(hnjVar.f13463th instanceof dkl)) {
            this.f13132xn = aq();
        }
        if (z10) {
            hnj(this.f13132xn);
        }
    }

    public void apu() {
    }

    protected boolean b_() {
        return false;
    }

    protected abstract boolean c_();

    protected void cm() {
        if (this.dkl != null) {
            com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj("videoForceBreak", this.dkl);
        }
        this.dse.dse();
    }

    public abstract String d_();

    public void dkl(boolean z10) {
        this.f13130oj = z10;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public abstract com.bytedance.sdk.openadsdk.component.reward.hnj.hnj mo16do();

    public boolean dzo() {
        as asVarHnj = this.dse.hnj();
        if (asVarHnj != null) {
            List<as> listMr = asVarHnj.mr();
            for (int i10 = 0; i10 < listMr.size(); i10++) {
                as asVar = listMr.get(i10);
                if (asVar != null && asVar.cm()) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract void e_();

    public void eta() {
        com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(this.dkl.gkx()).hnj(), this.dkl);
        hnVarHnj.hnj("material_meta", this.dkl);
        hnVarHnj.hnj("ad_slot", this.dkl.aip());
        com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, new a7.a() { // from class: com.bytedance.sdk.openadsdk.activity.single.aq.6
            @Override // a7.b.a
            public void hnj(c cVar, int i10) {
            }

            @Override // a7.b.a
            public void hnj(c cVar, int i10, String str) {
            }
        });
    }

    public abstract boolean f_();

    public hn ff() {
        return this.dse;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void fr() {
        if (mo16do() != null) {
            mo16do().tgn.hnj();
        }
    }

    public void fvt() {
    }

    public void gjv() {
    }

    public boolean gm() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hn(int i10) {
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.view.aq hnj();

    public void hnj(Activity activity) {
    }

    protected abstract void hnj(Activity activity, hn.sk skVar);

    public abstract void hnj(String str);

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void izk() {
        hn hnVar = this.dse;
        if (hnVar != null) {
            hnVar.hnj(this, true);
        }
    }

    public int jbd() {
        return this.dnm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public List<as> ka() {
        return this.dse.vf();
    }

    public boolean lhi() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVarMo16do;
        oj ojVar;
        if (sq() || (hnjVarMo16do = mo16do()) == null || !hnjVarMo16do.f13456hn.btk() || (ojVar = this.qor) == null) {
            return false;
        }
        return ojVar.hnj(hnjVarMo16do.orp);
    }

    public void lu() {
        qor(0);
    }

    public void mjg() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public final void mkl() {
        as asVar;
        xo();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar == null || (asVar = hnjVar.f13456hn) == null) {
            return;
        }
        asVar.mfh();
        this.ojm.f13456hn.gjv(true);
        if (as.sk(this.ojm.f13456hn)) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.ojm;
            as asVar2 = hnjVar2.f13456hn;
            com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar2, hnjVar2.f13461sk, asVar2.zxr());
        }
    }

    public void orl() {
    }

    public boolean orp() {
        hn hnVar = this.dse;
        return hnVar != null && hnVar.hnj(this, this.f13131ta);
    }

    protected void pnz() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar;
        bug bugVar;
        if (!c_() || (hnjVar = this.ojm) == null || (bugVar = hnjVar.f13457jo) == null) {
            return;
        }
        bugVar.gjv();
    }

    public boolean pty() {
        return false;
    }

    protected void pv() {
        hn hnVar = this.dse;
        if (hnVar == null || hnVar.xn()) {
            return;
        }
        this.dse.jip();
        this.dse.eum();
    }

    public void qb() {
        if (sq() || mo16do() == null || mo16do().fvt == null || !mo16do().f13456hn.btk()) {
            return;
        }
        oj ojVar = new oj(mo16do(), new oj.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.aq.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
            public void dkl() {
                aq.this.gjv(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
            public int gjv() {
                hn hnVar = aq.this.dse;
                if (hnVar != null) {
                    return hnVar.gm();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
            public void hn() {
                hn hnVar = aq.this.dse;
                if (hnVar != null) {
                    hnVar.nyv();
                }
                aq.this.gjv(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
            public void hnj() {
                aq aqVar = aq.this;
                aqVar.qor(aqVar.mo16do());
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
            public void qor() {
                hn hnVar = aq.this.dse;
                if (hnVar != null) {
                    hnVar.pty();
                }
                aq.this.gjv(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.oj.hnj
            public void sk() {
                aq.this.gjv(2);
            }
        });
        this.qor = ojVar;
        ojVar.hnj(mo16do().fvt);
    }

    public void qor() {
    }

    public abstract void qor(boolean z10);

    public void sk(boolean z10) {
        this.f13129hn = z10;
    }

    public boolean sq() {
        return this.uua;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ta() {
        toString();
        pv();
    }

    public boolean tu() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ua() {
        qor(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ul() {
        xo();
    }

    public abstract boolean wu();

    public Activity xad() {
        return this.dse.aq();
    }

    public void xn() {
        oj ojVar = this.qor;
        if (ojVar != null) {
            ojVar.aq();
            this.qor = null;
        }
        this.hnj = false;
    }

    protected final void xo() {
        this.dse.mjg();
    }

    public void xyo() {
    }

    public boolean zt() {
        return this.f13129hn;
    }

    public void gjv(int i10) {
        hn hnVar = this.dse;
        if (hnVar != null) {
            hnVar.hnj(i10);
        }
    }

    public final void hn(Activity activity, hn.sk skVar) {
        if (this.hnj) {
            return;
        }
        this.hnj = true;
        hnj(activity, skVar);
    }

    public void hnj(Activity activity, Bundle bundle) {
    }

    public void qor(final int i10) {
        if (!this.dse.bug().getBoolean("reward_verify", false) && !this.dse.uua() && !this.dse.orl()) {
            this.dse.bug().putBoolean("reward_verify", true);
            if (mo16do() != null) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVarMo16do = mo16do();
                if (com.bytedance.sdk.openadsdk.core.oj.gjv().jip(String.valueOf(hnjVarMo16do.dkl))) {
                    hnj(true, hnjVarMo16do.f13456hn.tll(), hnjVarMo16do.f13456hn.hkr(), 0, "", i10);
                } else {
                    com.bytedance.sdk.openadsdk.core.oj.qor().hnj(rmr(), new com.bytedance.sdk.openadsdk.core.as.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.aq.5
                        @Override // com.bytedance.sdk.openadsdk.core.as.hn
                        public void hnj(int i11, String str) {
                            aq.this.hnj(false, 0, "", i11, str, i10);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.as.hn
                        public void hnj(Cdo.hn hnVar) {
                            aq.this.hnj(hnVar.f13719hn, hnVar.qor.hnj(), hnVar.qor.hn(), 0, "", i10);
                        }
                    });
                }
            }
        }
    }

    public JSONObject rmr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.f13128fc);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.mjg);
            jSONObject.put("trans_id", tgn.hnj().replace("-", ""));
            if (mo16do() != null) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVarMo16do = mo16do();
                jSONObject.put("duration", (int) hnjVarMo16do.eum.xyo());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, hnjVarMo16do.f13456hn.hkr());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, hnjVarMo16do.f13456hn.tll());
                jSONObject.put("network", com.bytedance.sdk.component.utils.oj.qor(hnjVarMo16do.jbd));
                JSONObject jSONObjectAzk = hnjVarMo16do.f13456hn.azk();
                jSONObjectAzk.put("gaid", com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hn());
                jSONObject.put("extra", jSONObjectAzk);
                jSONObject.put("video_duration", hnjVarMo16do.f13456hn.pwt().e());
                String strGjv = qEagQqzJZsd.YkQbwBp;
                int iAf = hnjVarMo16do.f13456hn.af();
                if (iAf == 2) {
                    strGjv = orp.hn();
                } else if (iAf == 1) {
                    strGjv = orp.gjv();
                }
                jSONObject.put("user_agent", strGjv);
            }
            return jSONObject;
        } catch (Throwable th2) {
            apu.hnj("Scene", "", th2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(Bundle bundle) {
    }

    public void hnj(aq aqVar, aq aqVar2, hn.sk skVar) {
    }

    public void hn(Activity activity) {
        if (com.bytedance.sdk.openadsdk.as.sk.aq() && activity != null && activity.isChangingConfigurations()) {
            hn hnVar = this.dse;
            if (hnVar == null || hnVar.hnj() == null) {
                return;
            }
            ta.hnj(this.dse.hnj(), "close_interception_config_change", this.dse.hnj().sk(), (String) null);
            return;
        }
        Objects.toString(this.dse);
        if (!this.dse.xn() && !dzo()) {
            long jOjm = this.dse.hnj().ojm();
            if (jOjm > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jOjm;
                if (jElapsedRealtime > 0) {
                    this.dkl.hn(jElapsedRealtime);
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVarMo16do = mo16do();
            if (hnjVarMo16do != null) {
                hnjVarMo16do.hnj(BackupConstant.CLOSE_NOT_SHOW_ONE_TO_N_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1004);
                hnjVarMo16do.tgn.hnj();
            }
        }
        pnz();
        this.dse.fc();
    }

    protected void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
    }

    public void hnj(Map<String, Object> map, float f10, float f11) {
    }

    private void hnj(jip jipVar) {
        com.bytedance.sdk.openadsdk.common.hnj.hn(new mjg.hnj(this.ojm, "BVA", eum(), as()).hnj(b_()).hnj(jipVar).hnj(vf()).hnj());
    }

    public void qor(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        if (orp()) {
            return;
        }
        hn.sk skVar = new hn.sk(8, hnjVar);
        skVar.gjv = hnjVar.dzo;
        hn hnVar = this.dse;
        if (hnVar != null) {
            hnVar.hn(this, skVar);
        }
    }

    protected void hnj(boolean z10, boolean z11, boolean z12, int i10) {
        this.dse.hnj(this, z10, z11, z12, i10);
    }

    protected final void hnj(boolean z10, int i10, String str, int i11, String str2, int i12) {
        if (this.dse.uua()) {
            return;
        }
        this.dse.hnj(this, z10, i10, str, i11, str2, i12);
        bug.hnj(this.dkl, z10, i12);
    }

    public void hn(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        if (hnjVar == null) {
            return;
        }
        try {
            int iGm = this.dse.gm();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(iGm, 0));
            com.bytedance.sdk.openadsdk.gjv.qor.sk(this.dkl, hnjVar.f13461sk, jSONObject);
        } catch (Throwable unused) {
        }
        qor(hnjVar);
    }

    public void hnj(as asVar, int i10, int i11) {
        this.dkl = asVar;
        this.f13131ta = i10;
        this.dnm = i11;
    }
}
