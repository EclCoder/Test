package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.component.reward.hnj.ta;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.utils.fc;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.google.api.client.http.HttpStatusCodes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj extends aq implements xyo.hnj, com.bytedance.sdk.openadsdk.component.reward.hnj.sk.hnj {
    private int apu;
    private boolean as;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean f26do;
    private Bundle eum;
    protected boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.component.reward.hn.hn f13198hn;
    protected final xyo hnj;
    private boolean hqh;
    protected int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected boolean f13199sk;
    private long tgn;
    private long tu;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private CountDownTimer f13200vf;
    private int wu;
    private boolean xyo;

    public hnj(hn hnVar, as asVar, int i10, int i11, boolean z10) {
        super(hnVar, asVar, i10, i11, z10);
        this.hnj = new xyo(Looper.getMainLooper(), this);
        this.apu = 1;
        this.wu = 0;
        this.as = false;
        this.gjv = false;
        gn();
    }

    private void dy() {
        this.ojm.fvt.hnj(this.f13198hn);
        this.f13198hn.hnj(this, this.hnj);
        this.f13198hn.ta();
    }

    private void gn() {
        this.xyo = hqh.qor(this.dkl) && this.dkl.xj();
        if (this.xyo) {
            this.tgn = ((long) this.dkl.bf()) * 1000;
        }
    }

    private boolean hkr() {
        if (this.dkl.dkl()) {
            return this.ojm.ojm.get();
        }
        return true;
    }

    private void idl() {
        this.f13198hn.m20do();
        this.qor = (int) this.ojm.eum.sq();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar.dy) {
            hnj(hnjVar.tgn.sk());
            hnj(this.ojm.tgn.gjv());
        }
        a_();
        th();
    }

    private void th() {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar;
        if (this.dkl.dkl() || (hnVar = this.f13198hn) == null) {
            return;
        }
        hnVar.hnj(this.ojm.f13464ua.dkl());
        this.f13198hn.as();
    }

    private void tll() {
        if (this.dkl.dkl() && !this.as) {
            this.as = true;
            hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.hnj.3
                @Override // java.lang.Runnable
                public void run() {
                    float[] fArrHnj;
                    if (hnj.this.dse.tgn()) {
                        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = hnj.this.ojm;
                        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = hnj.this.ojm;
                        fArrHnj = new float[]{sq.qor(hnjVar.orp, hnjVar.fvt.getWidth()), sq.qor(hnjVar2.orp, hnjVar2.fvt.getHeight())};
                    } else {
                        hnj hnjVar3 = hnj.this;
                        fArrHnj = hnjVar3.ojm.tu.hnj(hnjVar3.apu);
                    }
                    if (!hnj.this.ojm.xyo.hnj()) {
                        hnj.this.ojm.xyo.hnj(fArrHnj);
                    } else {
                        hnj hnjVar4 = hnj.this;
                        hnjVar4.ojm.xyo.hnj(hnjVar4.dkl);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void apu() {
        super.apu();
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.f13198hn;
        if (hnVar != null) {
            hnVar.apu();
        }
    }

    public Map<String, Object> aq() {
        as asVar;
        HashMap map = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar != null && hnjVar.f33do != null && (asVar = this.dkl) != null && asVar.th() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.ojm.f33do.dnm()));
            JSONObject jSONObjectHnj = this.ojm.f33do.hnj((JSONObject) null);
            if (jSONObjectHnj != null) {
                Iterator<String> itKeys = jSONObjectHnj.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectHnj.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    public void as() {
        this.dse.hnj(this, hnj(com.bytedance.sdk.openadsdk.gjv.hn.C0241hn.f14351hn));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void bug() {
        hn hnVar = this.dse;
        if (hnVar == null) {
            return;
        }
        hnVar.hn(this, hnj(10));
    }

    protected final void dkl() {
        Message message = new Message();
        message.what = 400;
        if (this.dkl.hhw()) {
            hn(10000);
        }
        this.hnj.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public final void dnm() {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.f13198hn;
        if (hnVar == null) {
            return;
        }
        hnVar.dnm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    /* JADX INFO: renamed from: do */
    public com.bytedance.sdk.openadsdk.component.reward.hnj.hnj mo16do() {
        return this.ojm;
    }

    public abstract FrameLayout dse();

    public void eum() {
        if (this.f26do) {
            return;
        }
        this.f26do = true;
        eta();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public final void fc() {
        this.ojm.eum.jbd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void gjv() {
        super.gjv();
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.f13198hn;
        if (hnVar == null) {
            return;
        }
        hnVar.oj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public boolean gm() {
        return this.ojm.f33do.ta() && !tu();
    }

    protected abstract void hn();

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hn(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(boolean z10) {
    }

    public void hqh() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar != null && hnjVar.eum.ojm()) {
            this.ojm.eum.eum();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public final View jip() {
        return this.ojm.eum.ff();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void mjg() {
        super.mjg();
        if (this.xyo) {
            this.tu = System.currentTimeMillis();
            CountDownTimer countDownTimer = this.f13200vf;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.f13198hn;
        if (hnVar == null) {
            return;
        }
        hnVar.uua();
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.ojm.f33do;
        if (ojmVar != null) {
            ojmVar.aq();
        }
        if (this.dse.tgn()) {
            this.ojm.f33do.hnj(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void nyv() {
        this.gjv = true;
    }

    protected final void oj() {
        this.hnj.removeMessages(400);
    }

    public com.bytedance.sdk.openadsdk.gjv.dse ojm() {
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar;
        if (!this.dkl.dkl()) {
            com.bytedance.sdk.openadsdk.gjv.dse dseVar = new com.bytedance.sdk.openadsdk.gjv.dse();
            dseVar.hnj(System.currentTimeMillis(), 1.0f);
            return dseVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar != null && (ojmVar = hnjVar.f33do) != null && ojmVar.hnj() != null) {
            return this.ojm.f33do.hnj().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.gjv.dse dseVar2 = new com.bytedance.sdk.openadsdk.gjv.dse();
        dseVar2.hnj(System.currentTimeMillis(), 1.0f);
        return dseVar2;
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public boolean pty() {
        return this.dkl.rq() == 10 && !tu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void qor() {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar;
        super.qor();
        if (this.ojm == null || (hnVar = this.f13198hn) == null) {
            return;
        }
        hnVar.fc();
        this.ojm.pnz = true;
        if (hkr()) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
            hnjVar.f13454gm.hnj(hnjVar.f13456hn.ij());
        }
        this.ojm.f13464ua.fc();
        this.ojm.nyv.uua();
        this.ojm.as.sk();
        if (this.f13198hn.hn()) {
            this.ojm.eum.hnj(this.f13198hn);
            if (this.ojm.eum.pv()) {
                hnj(this.ojm.eum.fc(), true);
            } else if (this.ojm.eum.dse() && this.dse.tgn()) {
                fvt();
            } else {
                this.ojm.eum.hnj(false, this, this.wu != 0);
            }
        }
        this.wu++;
        tll();
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.ojm.f33do;
        if (ojmVar != null) {
            ojmVar.dse();
        }
        this.ojm.tu.hnj(this.hnj);
        if (this.dse.tgn()) {
            this.ojm.f33do.hnj(0, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.xyo) {
            long j10 = this.tu;
            if (j10 != 0 && jCurrentTimeMillis - j10 > this.tgn) {
                ff().hnj(this, hnj(8));
                return;
            }
            if (j10 != 0) {
                this.tgn -= jCurrentTimeMillis - j10;
            }
            hnj(this.tgn);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void sk() {
        hn hnVar = this.dse;
        if (hnVar != null) {
            hnVar.hnj(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ta() {
        super.ta();
        if (this.dkl.dkl()) {
            this.ojm.f33do.orl();
        }
    }

    public void tgn() {
        tll();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public boolean tu() {
        return this.ojm.f33do.ojm();
    }

    public void vf() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar == null) {
            return;
        }
        hnjVar.eum.jip();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public boolean wu() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        return hnjVar != null && hnjVar.eum.ul();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void xn() {
        super.xn();
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.f13198hn;
        if (hnVar == null) {
            return;
        }
        hnVar.hn(this.f13130oj);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void xyo() {
        com.bytedance.sdk.openadsdk.component.reward.view.qor qorVarHnj;
        super.xyo();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar == null || (qorVarHnj = hnjVar.f33do.hnj()) == null || !qorVarHnj.as()) {
            return;
        }
        fr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void gjv(boolean z10) {
        hn hnVar = this.dse;
        if (hnVar != null) {
            hnVar.hnj(this, z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public final void hnj(Activity activity, Bundle bundle) {
        this.eum = bundle;
        super.hnj(activity, bundle);
        hnj(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public final com.bytedance.sdk.openadsdk.component.reward.view.aq hnj() {
        return this.ojm.fvt;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void hnj(Activity activity, hn.sk skVar) {
        try {
            this.apu = this.dkl.zf();
            hnj(activity, this.dkl, this.eum);
            if (this.ojm.dy && this.dkl.xj()) {
                this.ojm.dzo = skVar.gjv;
            }
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
            if (hnjVar.dy && this.f13131ta > 0) {
                hnjVar.dzo = skVar.gjv;
            }
            dy();
            idl();
            if (apu.sk(this.dkl)) {
                qb();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.AdScene", "onCreate: ", th2);
            com.bytedance.sdk.openadsdk.jip.gjv.hn();
            cm();
        }
    }

    private void hnj(Activity activity, as asVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = new com.bytedance.sdk.openadsdk.component.reward.hnj.hnj(activity, this.hnj, asVar, this, 1, this.dse.hn(), this.ojm);
        this.ojm = hnjVar;
        hnjVar.dy = this.dse.dkl();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.ojm;
        hnjVar2.idl = this.orl;
        hnjVar2.lko = hnjVar2.dy && apu.sk(asVar);
        this.ojm.hkr = this.dse.gjv();
        this.ojm.tll = this.dse.m19do();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.ojm;
        hnjVar3.f13463th = this;
        hnjVar3.hqh = this.dse.wu();
        Intent intent = activity.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(this.ojm, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(intent, this.ojm);
            asVar.hnj(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.ojm.izk) {
            hn();
        }
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVarHnj = com.bytedance.sdk.openadsdk.component.reward.hn.dkl.hnj(this.ojm);
        this.f13198hn = hnVarHnj;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar4 = this.ojm;
        hnjVar4.f13460qb = hnVarHnj;
        hnjVar4.f13465ul.hnj(this);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar5 = this.ojm;
        if (hnjVar5.dy) {
            hnjVar5.eum.hnj(new com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.hnj.1
                @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj
                public void hnj(int i10) {
                    hnj hnjVar6 = hnj.this;
                    hn hnVar = hnjVar6.dse;
                    if (hnVar == null) {
                        return;
                    }
                    hnVar.hn(hnjVar6, i10);
                }
            });
            if (!this.dse.tgn()) {
                this.dse.m19do().setShowSound(as.sk(asVar));
            }
        }
        fc.hnj(this.ojm);
        Objects.toString(this.f13198hn);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void uua() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void qor(boolean z10) {
        ta taVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar == null || (taVar = hnjVar.tgn) == null) {
            return;
        }
        taVar.hn(z10);
        this.ojm.tgn.qor(z10);
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.qor.hn hnVar) {
        if (hnVar != null) {
            HashMap map = new HashMap();
            try {
                int i10 = this.dnm + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i10);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            hnVar.hnj(map);
        }
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

    private void hnj(long j10) {
        this.f13200vf = new CountDownTimer(j10, 1000L) { // from class: com.bytedance.sdk.openadsdk.activity.single.hnj.2
            @Override // android.os.CountDownTimer
            public void onFinish() {
                hn hnVarFf = hnj.this.ff();
                hnj hnjVar = hnj.this;
                hnVarFf.hnj(hnjVar, hnjVar.hnj(8));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j11) {
                hnj.this.tgn = j11;
            }
        }.start();
    }

    public final void hnj(boolean z10, int i10) {
        hnj(z10, false, i10);
    }

    public final void hnj(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        hnjVar.f13465ul.hnj(z10, z11, false, hnjVar.f13460qb, i10);
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.f13198hn;
        if (hnVar == null) {
            return;
        }
        hnVar.hnj(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(String str, JSONObject jSONObject) {
        hn hnVar;
        if (str == null || !"skipToNextAd".equals(str) || (hnVar = this.dse) == null) {
            return;
        }
        hnVar.hn(this, hnj(7));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public boolean hnj(long j10, boolean z10) {
        apu apuVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.ojm;
        if (hnjVar == null) {
            return false;
        }
        hnjVar.f33do.hn(false);
        this.f13199sk = false;
        com.bytedance.sdk.openadsdk.gjv.dse dseVarOjm = ojm();
        if (dse() == null) {
            return false;
        }
        this.ojm.eum.hnj(dse(), dseVarOjm);
        Map<String, Object> mapAq = this.dkl.dkl() ? aq() : null;
        c.InterfaceC0870c interfaceC0870c = new c.InterfaceC0870c() { // from class: com.bytedance.sdk.openadsdk.activity.single.hnj.4
            @Override // x6.c.InterfaceC0870c
            public void hn(long j11, int i10) {
                hnj.this.ojm.eum.dnm();
                apu apuVar2 = hnj.this.ojm.f13464ua.f13541fc;
                if (apuVar2 != null) {
                    apuVar2.ta();
                }
                if (hnj.this.ojm.eum.dkl()) {
                    hnj.this.dkl();
                    return;
                }
                hnj.this.ojm.eum.apu();
                if (hnj.this.dkl.dkl()) {
                    hnj.this.ojm.f33do.hnj(true);
                }
                hnj hnjVar2 = hnj.this;
                hnjVar2.dse.hnj(hnjVar2, hnjVar2.hnj(3));
            }

            @Override // x6.c.InterfaceC0870c
            public void hnj(long j11, int i10) {
                hnj hnjVar2 = hnj.this;
                if (hnjVar2.f13199sk) {
                    return;
                }
                hnjVar2.f13199sk = true;
                boolean zDkl = hnjVar2.dkl.dkl();
                hnj.this.hnj.removeMessages(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
                hnj.this.oj();
                hnj.this.ojm.eum.hnj(j11, j11);
                if (zDkl) {
                    hnj.this.ojm.f33do.hn(true);
                } else {
                    hnj.this.ojm.jip.set(true);
                }
                if (hnj.this.ojm.f13456hn.qb() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = hnj.this.ojm;
                    if (hnjVar3.qor) {
                        hnjVar3.wu.qor().hnj(hnj.this.ojm.f13456hn);
                        fc.hn();
                    }
                }
                if (!zDkl && hnj.this.ojm.f13456hn.ac()) {
                    hnj.this.ojm.f13456hn.xo(1);
                    hnj.this.ojm.f13464ua.uua();
                }
                if (hnj.this.ojm.f13456hn.qb() == 21 && !hnj.this.ojm.f13456hn.xn()) {
                    hnj.this.ojm.f13456hn.sk(true);
                    hnj.this.ojm.f13464ua.uua();
                }
                hn.sk skVarHnj = hnj.this.hnj(5);
                skVarHnj.f13197sk = true;
                hnj hnjVar4 = hnj.this;
                hnjVar4.dse.hnj(hnjVar4, skVarHnj);
            }

            @Override // x6.c.InterfaceC0870c
            public void hnj() {
                hnj.this.ojm.eum.dnm();
                hnj.this.oj();
                hnj hnjVar2 = hnj.this;
                hnjVar2.dse.hnj(hnjVar2, hnjVar2.hnj(6));
            }

            @Override // x6.c.InterfaceC0870c
            public void hnj(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar;
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = hnj.this.ojm;
                if (!hnjVar2.pnz && hnjVar2.eum.dkl()) {
                    hnj.this.ojm.eum.hn(true);
                }
                if (hnj.this.ojm.ojm.get()) {
                    return;
                }
                if (j11 != hnj.this.ojm.eum.mjg()) {
                    hnj.this.oj();
                }
                if (!hnj.this.ojm.eum.dkl()) {
                    hnj.this.hnj.removeMessages(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
                    return;
                }
                hnj.this.ojm.eum.hnj(j11, j12);
                int i10 = (int) (j11 / 1000);
                if ((hnj.this.ojm.uua.get() || hnj.this.ojm.f13462ta.get()) && hnj.this.ojm.eum.dkl()) {
                    hnj.this.ojm.eum.wu();
                }
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = hnj.this.ojm;
                if (hnjVar3.gjv) {
                    hnjVar3.f13464ua.sk(i10);
                }
                if (hnj.this.dkl.dkl() && (ojmVar = hnj.this.ojm.f33do) != null && ojmVar.hnj() != null) {
                    hnj.this.ojm.f33do.hnj().setTime(String.valueOf(hnj.this.qor), i10, 0, false);
                    hnj.this.ojm.f33do.hnj().hnj(j11, j12);
                }
                hnj.this.hnj((j11 * 1.0f) / j12);
                hnj.this.ojm.hnj(true);
            }
        };
        this.ojm.eum.hnj(interfaceC0870c);
        if (!this.dkl.dkl() && (apuVar = this.ojm.f13464ua.f13541fc) != null) {
            apuVar.hnj(interfaceC0870c);
        }
        return this.ojm.eum.hnj(j10, z10, mapAq, this.f13198hn);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.sk.hnj
    public void hnj(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar, int i10) {
        hnj(z10, z11, z12, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void hnj(aq aqVar, aq aqVar2, hn.sk skVar) {
        super.hnj(aqVar, aqVar2, skVar);
        if (aqVar == this && (aqVar2 instanceof sk)) {
            int i10 = skVar.f13196hn;
            if (i10 == 3) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.fc fcVar = this.ojm.eum;
                fcVar.hnj(!fcVar.orp() ? 1 : 0, 2);
            } else if (i10 == 6) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.fc fcVar2 = this.ojm.eum;
                fcVar2.hnj(!fcVar2.orp() ? 1 : 0, !this.ojm.eum.orp() ? 1 : 0);
            } else if (i10 == 5 && !as.sk(this.ojm.f13456hn) && skVar.f13197sk) {
                this.ojm.eum.hnj(FreeSpaceBox.TYPE, true);
            }
            this.ojm.f13454gm.hnj(false);
            this.ojm.f13454gm.gjv(false);
        }
    }

    public void hnj(float f10) {
        hn hnVar = this.dse;
        if (hnVar == null) {
            return;
        }
        hnVar.hnj(f10);
        if (this.f26do || this.dkl.qb() == 43 || f10 < this.dkl.pnz() / 100.0f) {
            return;
        }
        aq aqVarTu = this.dse.tu();
        if (aqVarTu instanceof hnj) {
            ((hnj) aqVarTu).eum();
        }
    }

    protected hn.sk hnj(int i10) {
        hn.sk skVar = new hn.sk(i10, this.ojm);
        skVar.gjv = this.ojm.dzo;
        return skVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void hnj(Map<String, Object> map, float f10, float f11) {
        super.hnj(map, f10, f11);
        this.dse.hnj(map, this, f10, f11);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.aq
    public void hnj(as asVar, int i10, int i11) {
        super.hnj(asVar, i10, i11);
        gn();
        this.as = false;
        this.hqh = true;
    }
}
