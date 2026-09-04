package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.common.jip;
import com.bytedance.sdk.openadsdk.component.reward.hnj.ta;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class sk extends aq implements xyo.hnj {
    private static String apu;
    private static String eum;
    private static String gjv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static String f13207sk;
    private static String wu;
    private Bundle as;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private int f27do;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final xyo f13208hn;
    public boolean hnj;
    private JSONObject hqh;
    private int nyv;
    private boolean pty;
    protected com.bytedance.sdk.openadsdk.component.reward.hn.hn qor;
    private boolean tgn;
    private hn.sk tu;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private long f13209vf;
    private boolean xyo;

    public sk(hn hnVar, as asVar, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        super(hnVar, asVar, i10, i11, z11);
        this.f13208hn = new xyo(Looper.getMainLooper(), this);
        this.f27do = 0;
        this.pty = true;
        this.jip = z10;
        this.orl = hnVar.sk();
        this.hnj = z12;
        hnj(asVar, this.as);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dy() {
        hn.sk skVar = new hn.sk(7, this.ojm);
        skVar.gjv = this.ojm.dzo;
        this.dse.hn(this, skVar);
    }

    private boolean gn() {
        if (this.dkl.dkl()) {
            return this.ojm.ojm.get();
        }
        return true;
    }

    private void hqh() {
        if (this.tgn) {
            return;
        }
        this.tgn = true;
        if (this.orl) {
            this.dse.hnj(hnj(), orp());
        } else {
            this.dse.hnj(hnj());
        }
        this.qor.m20do();
    }

    private void idl() {
        try {
            vf();
        } catch (Throwable unused) {
            cm();
        }
        hqh();
        if (!apu.dkl(this.dkl) || this.hnj) {
            return;
        }
        qb();
    }

    private void vf() {
        if (this.xyo) {
            return;
        }
        this.xyo = true;
        if (!this.hnj) {
            this.ojm.tll = this.dse.m19do();
        }
        this.ojm.fvt.hnj(this.qor);
        this.qor.hnj(this, this.f13208hn);
        this.qor.ta();
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.sk.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (sk.this.ojm.nyv.apu()) {
                        boolean zOrl = sk.this.ojm.pty.orl();
                        sk.this.ojm.nyv.dkl(zOrl);
                        sk.this.ojm.f13464ua.dkl(8);
                        View view2 = viewTa;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.dkl.gjv) {
                            ((com.bytedance.sdk.openadsdk.core.dkl.gjv) view2).setImageResource(wu.gjv(sk.this.ojm.jbd, "tt_close_btn"));
                        }
                        sk.this.ojm.f13453ff.sendEmptyMessageDelayed(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE, 5000L);
                        if (!as.qor(sk.this.ojm.f13456hn)) {
                            return;
                        }
                        if (as.qor(sk.this.ojm.f13456hn) && zOrl) {
                            return;
                        }
                    }
                    sk.this.ojm.nyv.eum();
                    sk.this.ojm.pty.dnm();
                    sk.this.ojm.tgn.dkl();
                    if (hqh.gjv(sk.this.ojm.f13456hn) && sk.this.hnj(true, true, (Runnable) null)) {
                        return;
                    }
                    sk.this.cm();
                }
            };
            viewTa.setOnClickListener(onClickListener);
            viewTa.setTag(viewTa.getId(), onClickListener);
        }
        this.ojm.f13454gm.hnj(new com.bytedance.sdk.openadsdk.component.reward.top.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.sk.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void gjv(View view) {
                sk skVar = sk.this;
                skVar.hn(skVar.ojm);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hn(View view) {
                sk.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view) {
                sk skVar = sk.this;
                if (skVar.hnj(hqh.qor(skVar.ojm.f13456hn), false, (Runnable) null) || sk.this.aq()) {
                    return;
                }
                if (!hqh.sk(sk.this.ojm.f13456hn)) {
                    if (!apu.hnj(sk.this.ojm.f13456hn) || sk.this.ojm.orl.get()) {
                        sk.this.cm();
                        return;
                    } else {
                        sk.this.cm();
                        return;
                    }
                }
                if (hqh.aq(sk.this.ojm.f13456hn)) {
                    sk.this.ojm.as.ojm();
                    return;
                }
                View view2 = viewTa;
                if (view2 != null) {
                    view2.performClick();
                } else {
                    sk.this.cm();
                }
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
                sk.this.hnj(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void apu() {
        super.apu();
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar != null) {
            hnVar.apu();
        }
    }

    public boolean aq() {
        hn hnVar;
        if (this.hnj || (hnVar = this.dse) == null || !hnVar.apu()) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), this.dkl, this.ojm.f13461sk, FreeSpaceBox.TYPE, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.sk.3
                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject hn() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", sk.this.f13209vf);
                        jSONObject.put("percent", sk.this.nyv);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject hnj() {
                    if (sk.this.hqh != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene_type", sk.this.ojm.hnj);
                            return jSONObject;
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
        }
        this.dse.hnj(this, true, false, false, 4);
        return true;
    }

    public boolean as() {
        return this.ojm.nyv.xyo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    protected boolean b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void bug() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    protected boolean c_() {
        return this.ojm.gjv;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public String d_() {
        return this.ojm.f13461sk;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    /* JADX INFO: renamed from: do */
    public com.bytedance.sdk.openadsdk.component.reward.hnj.hnj mo16do() {
        return this.ojm;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void e_() {
        this.ojm.f13466vf.hnj(this.qor);
    }

    public void eum() {
        if (orp()) {
            return;
        }
        hn.sk skVar = new hn.sk(8, this.ojm);
        skVar.gjv = this.ojm.dzo;
        hn hnVar = this.dse;
        if (hnVar != null) {
            hnVar.hnj(this, skVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public boolean f_() {
        return this.ojm.dzo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public final void fc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void gjv(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public boolean hnj(long j10, boolean z10) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public final View jip() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public final void mjg() {
        super.mjg();
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar == null) {
            return;
        }
        hnVar.uua();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void nyv() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public final void orl() {
        super.orl();
        if (this.ojm == null || com.bytedance.sdk.component.utils.hn.hnj(xad())) {
            return;
        }
        this.ojm.nyv.tu();
        com.bytedance.sdk.openadsdk.utils.gjv.hnj(xad(), this.ojm.f13456hn);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void sk() {
        com.bytedance.sdk.component.utils.apu.hnj("TTAD.EndCardScene", "onPlayableLoadingDismiss()---" + this.f13131ta + ",scene = " + this);
        hn hnVar = this.dse;
        if (hnVar != null) {
            hnVar.hnj(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void uua() {
        lu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public boolean wu() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        return hnjVar != null && hnjVar.eum.ul();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void xn() {
        super.xn();
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar == null) {
            return;
        }
        hnVar.xn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public final void dnm() {
        if (this.dse == null) {
            return;
        }
        this.ojm.f13465ul.hnj(this.tu.hnj.getBoolean("isSkip", false), this.tu.hnj.getBoolean("force", false), this.tu.hnj.getBoolean(giNWGaNAgVQoO.IJew, false), this.qor, this.tu.f13196hn);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hn(boolean z10) {
        if (!z10 || this.ojm.dy) {
            return;
        }
        lu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public final void qor() {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar;
        super.qor();
        if (this.ojm == null || (hnVar = this.qor) == null) {
            return;
        }
        hnVar.fc();
        this.ojm.pnz = true;
        if (gn()) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
            hnjVar.f13454gm.hnj(hnjVar.f13456hn.ij());
        }
        this.ojm.f13464ua.fc();
        this.ojm.nyv.uua();
        this.ojm.as.sk();
        if (this.qor.hn()) {
            this.ojm.eum.hnj(this.qor);
            this.ojm.eum.hnj(false, this, this.f27do != 0);
        }
        this.f27do++;
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.ojm.f33do;
        if (ojmVar != null) {
            ojmVar.dse();
        }
        this.ojm.tu.hnj(this.f13208hn);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void gjv() {
        super.gjv();
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar == null) {
            return;
        }
        hnVar.oj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public final void hnj(Activity activity, Bundle bundle) {
        this.as = bundle;
        super.hnj(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public final com.bytedance.sdk.openadsdk.component.reward.view.aq hnj() {
        return this.ojm.fvt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.bytedance.sdk.openadsdk.core.model.as] */
    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void hnj(Activity activity, hn.sk skVar) {
        hn hnVar;
        hn hnVar2;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar;
        this.tu = skVar;
        Intent intent = activity.getIntent();
        this.f13128fc = intent.getStringExtra("media_extra");
        this.mjg = intent.getStringExtra("user_id");
        try {
            if (eum == null) {
                eum = wu.hnj(this.ojm.jbd, "tt_reward_msg");
                gjv = wu.hnj(this.ojm.jbd, "tt_msgPlayable");
                apu = wu.hnj(this.ojm.jbd, "tt_negtiveBtnBtnText");
                wu = wu.hnj(this.ojm.jbd, "tt_postiveBtnText");
                f13207sk = wu.hnj(this.ojm.jbd, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.EndCardScene", th2.getMessage());
        }
        if (skVar != null && (hnjVar = skVar.qor) != null) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.ojm;
            hnjVar2.mkl = hnjVar.mkl;
            hnjVar2.dzo = hnjVar.dzo;
            if ((this.orl || this.jip) && !orp()) {
                this.ojm.dnm.set(hnjVar.dnm.get());
            }
            this.ojm.eum.hnj(hnjVar.eum.sk());
            hnj(this.ojm, hnjVar);
        }
        if (this.orl || this.jip) {
            try {
                vf();
            } catch (Throwable unused) {
                cm();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.ojm;
        if (hnjVar3 != null && (hnVar2 = this.dse) != null) {
            hnjVar3.f13457jo = hnVar2.hnj;
        }
        hqh();
        a_();
        dnm();
        if (!this.hnj || (hnVar = this.dse) == null || hnVar.hnj() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar4 = this.ojm;
        this.dse.hnj().sk(hnjVar4 != null ? hnjVar4.ojm.get() : -1);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void qor(boolean z10) {
        ta taVar;
        long j10 = this.pty ? this.ojm.mkl : 0L;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar != null && (taVar = hnjVar.tgn) != null) {
            taVar.hn(z10);
            this.ojm.tgn.qor(z10);
            if (z10 && j10 > 0) {
                this.ojm.mkl = j10;
            }
        }
        if (z10) {
            this.pty = false;
        }
    }

    private void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2) {
        if (!this.orl || orp() || hnjVar == null || hnjVar2 == null) {
            return;
        }
        try {
            this.f13209vf = hnjVar2.eum.mjg();
            if (this.dkl.rmr()) {
                this.f13209vf = hnjVar2.dkl();
            }
            this.nyv = hnjVar2.eum.m21do();
            this.hqh = orp.hnj(this.dkl, hnjVar2.eum.uua(), hnjVar2.eum.oj());
        } catch (Throwable unused) {
        }
    }

    private void hnj(as asVar, Bundle bundle) {
        Activity activityXad = xad();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = new com.bytedance.sdk.openadsdk.component.reward.hnj.hnj(activityXad, this.f13208hn, asVar, this, 2, this.dse.hn());
        this.ojm = hnjVar;
        hnjVar.fzb = this.jip;
        boolean z10 = this.hnj;
        hnjVar.rq = z10;
        hnjVar.lko = hnjVar.dy && !z10;
        hnjVar.dy = this.dse.dkl();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.ojm;
        hnjVar2.idl = this.orl;
        hnjVar2.hkr = this.dse.gjv();
        if (!this.hnj) {
            this.ojm.tll = this.dse.m19do();
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.ojm;
        hnjVar3.f13463th = this;
        hnjVar3.hqh = this.dse.wu();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(this.ojm, activityXad.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVarHnj = com.bytedance.sdk.openadsdk.component.reward.hn.dkl.hnj(this.ojm);
        this.qor = hnVarHnj;
        this.ojm.f13460qb = hnVarHnj;
        Objects.toString(this.qor);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void hnj(String str) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        hnjVar.dzo = !hnjVar.dzo;
        StringBuilder sb2 = new StringBuilder("will set is Mute ");
        sb2.append(this.ojm.dzo);
        sb2.append(" mLastVolume=");
        sb2.append(this.ojm.hqh.hnj());
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.ojm;
        hnjVar2.eum.hnj(hnjVar2.dzo, str);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.ojm;
        hnjVar3.nyv.sk(hnjVar3.dzo);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar4 = this.ojm;
        hnjVar4.as.hn(hnjVar4.dzo);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void hnj(Activity activity) {
        super.hnj(activity);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar == null) {
            return;
        }
        hnjVar.tu.hnj();
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public final void hnj(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar == null) {
            return;
        }
        hnVar.hnj(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.dse == null || orp()) {
            return;
        }
        hn hnVar = this.dse;
        if (hnVar != null && hnVar.tu() == null) {
            if (this.dse.qor()) {
                jip jipVar = this.f13132xn;
                if (jipVar != null && jipVar.hnj(hqh.qor(this.ojm.f13456hn), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.sk.4
                    @Override // java.lang.Runnable
                    public void run() {
                        sk.this.dy();
                    }
                })) {
                    return;
                }
            } else if (hnj(hqh.qor(this.ojm.f13456hn), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.sk.5
                @Override // java.lang.Runnable
                public void run() {
                    sk.this.dy();
                }
            })) {
                return;
            }
        }
        dy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(boolean z10) {
        hn hnVar = this.dse;
        if (hnVar != null) {
            hnVar.hnj(this, z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void hnj(aq aqVar, aq aqVar2, hn.sk skVar) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar;
        super.hnj(aqVar, aqVar2, skVar);
        com.bytedance.sdk.component.utils.apu.hnj("TTAD.EndCardScene", "【onActiveSceneChanged】" + this.f13131ta + ",scene = " + this + ",newScene = " + aqVar2 + ",oldScene = " + aqVar + ",isPlayable = " + this.jip);
        boolean z10 = this.f13131ta == aqVar2.f13131ta + 1;
        if (aqVar != null && (hnjVar = this.ojm) != null) {
            hnjVar.dzo = skVar.gjv;
        }
        if (z10) {
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.EndCardScene", "preload index =" + this.f13131ta + ",new index =" + aqVar2.f13131ta + ",isPlayableProxy = " + this.jip);
            idl();
        }
        if (aqVar == null && this.hnj) {
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.EndCardScene", "preload agg-endcard =" + this.f13131ta + ",new index =" + aqVar2.f13131ta + ",isPlayableProxy = " + this.jip);
            idl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(final boolean z10, boolean z11, final Runnable runnable) {
        if (!this.ojm.gjv || this.dse.uua()) {
            return false;
        }
        if (!z11 && this.dse.orl()) {
            return false;
        }
        if (!oj.gjv().aq(String.valueOf(this.ojm.dkl))) {
            if (!z11) {
                return false;
            }
            if (runnable == null && z10) {
                cm();
                return true;
            }
        }
        this.ojm.uua.set(true);
        if (z10) {
            this.ojm.as.dkl();
        }
        final com.bytedance.sdk.openadsdk.core.widget.hn hnVar = new com.bytedance.sdk.openadsdk.core.widget.hn(this.ojm.orp);
        this.qor.bug = hnVar;
        if (z10) {
            hnVar.hnj(gjv).hn(f13207sk).qor(apu);
        } else {
            hnVar.hnj(eum).hn(wu).qor(apu);
        }
        this.qor.bug.hnj(new com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.sk.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn
            public void hn() {
                hnVar.dismiss();
                sk.this.dse.hn(true);
                sk.this.ojm.uua.set(false);
                sk.this.ojm.as.hn(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z10) {
                    sk.this.aq();
                } else {
                    sk.this.ojm.tgn.dkl();
                    sk.this.cm();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn
            public void hnj() {
                if (z10) {
                    sk.this.ojm.as.hnj(1000);
                }
                hnVar.dismiss();
                sk.this.ojm.uua.set(false);
            }
        }).show();
        return true;
    }
}
