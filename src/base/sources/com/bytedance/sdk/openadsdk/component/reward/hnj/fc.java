package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.eum;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;
import u6.b;
import x6.c;
import y6.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc {
    private String apu;
    private final as aq;
    private final hnj as;
    private long bug;
    c dkl;
    private long dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean f32do;
    private final Activity dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private boolean f13441fc;
    final boolean gjv;
    private com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj hqh;
    private boolean mjg;
    private com.bytedance.sdk.openadsdk.gjv.dse nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private long f13443oj;
    private FrameLayout ojm;
    private boolean orl;
    boolean qor;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final String f13445ta;
    private boolean wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private long f13447xn;
    protected boolean hnj = false;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    boolean f13442hn = false;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected boolean f13444sk = false;
    private long jip = -1;
    private int uua = -1;
    private boolean tu = false;
    private int tgn = 0;
    private float xyo = 1.0f;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private boolean f13446vf = false;
    private volatile boolean pty = false;
    private HashSet<String> eum = new HashSet<>();

    public fc(hnj hnjVar) {
        this.as = hnjVar;
        this.dse = hnjVar.orp;
        this.aq = hnjVar.f13456hn;
        this.gjv = hnjVar.gjv;
        this.f13445ta = hnjVar.f13461sk;
    }

    private void xo() {
        c cVar = this.dkl;
        if (cVar == null || cVar.dnm() == null) {
            return;
        }
        this.dnm = this.dkl.dkl();
        if (this.dkl.dnm().qor() || !this.dkl.dnm().hn()) {
            this.dkl.hn();
            this.dkl.gjv();
            this.hnj = true;
        }
    }

    public void apu() {
        c cVar = this.dkl;
        if (cVar != null) {
            cVar.sk();
        }
    }

    public a aq() {
        c cVar = this.dkl;
        if (cVar != null) {
            return cVar instanceof com.bytedance.sdk.openadsdk.component.reward.gjv ? ((com.bytedance.sdk.openadsdk.component.reward.gjv) cVar).uua() : cVar.bug();
        }
        return null;
    }

    public long as() {
        c cVar = this.dkl;
        if (cVar != null) {
            return cVar.ojm();
        }
        return 0L;
    }

    public boolean bug() {
        return this.hnj;
    }

    public void cm() {
        c cVar = this.dkl;
        if (cVar instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) {
            ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) cVar).jbd();
        }
    }

    public boolean dkl() {
        c cVar = this.dkl;
        return (cVar == null || cVar.dnm() == null || !this.dkl.dnm().dkl()) ? false : true;
    }

    public void dnm() {
        this.pty = false;
        xyo xyoVar = this.as.f13453ff;
        if (xyoVar != null) {
            xyoVar.removeMessages(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public int m21do() {
        c cVar = this.dkl;
        if (cVar != null) {
            return cVar.ta();
        }
        return 0;
    }

    public boolean dse() {
        c cVar = this.dkl;
        return cVar != null && cVar.orl();
    }

    public void dzo() {
        c cVar = this.dkl;
        if (cVar != null) {
            cVar.hnj();
        }
    }

    public void eum() {
        c cVar = this.dkl;
        if (cVar != null) {
            cVar.qor();
        }
    }

    public long fc() {
        return this.dnm;
    }

    public View ff() {
        c cVar = this.dkl;
        if (cVar instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) {
            return (View) ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) cVar).orp();
        }
        return null;
    }

    public void fvt() {
        try {
            if (dkl()) {
                this.f13444sk = true;
                wu();
            }
        } catch (Exception e10) {
            apu.qor("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e10.getMessage());
        }
    }

    public boolean gjv() {
        int i10;
        if (this.f13446vf) {
            return this.tu && this.tgn == 1;
        }
        return this.tu && ((i10 = this.tgn) == 2 || i10 == 1);
    }

    public void gm() {
        int i10 = this.tgn;
        if (i10 == 1 || i10 == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                hnj(jSONObject);
            } catch (Throwable th2) {
                apu.hnj("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th2);
            }
        }
    }

    public boolean hqh() {
        return this.dkl != null;
    }

    public void jbd() {
        c cVar = this.dkl;
        if (cVar instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) {
            ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) cVar).ua();
        }
    }

    public void jip() {
        try {
            if (dkl()) {
                this.dkl.hn();
            }
        } catch (Throwable th2) {
            apu.qor("RewardFullVideoPlayerManager onPause throw Exception :" + th2.getMessage(), new Object[0]);
        }
    }

    public long mjg() {
        return this.bug;
    }

    public boolean nyv() {
        c cVar = this.dkl;
        return cVar != null && cVar.dnm() == null;
    }

    public b oj() {
        c cVar = this.dkl;
        if (cVar != null) {
            return cVar.dnm();
        }
        return null;
    }

    public boolean ojm() {
        c cVar = this.dkl;
        return (cVar == null || cVar.dnm() == null || !this.dkl.dnm().dse()) ? false : true;
    }

    public long orl() {
        c cVar = this.dkl;
        return cVar != null ? cVar.dkl() : this.dnm;
    }

    public boolean orp() {
        c cVar = this.dkl;
        if (cVar == null || cVar.dnm() == null) {
            return false;
        }
        return this.dkl.dnm().hnj();
    }

    public void pnz() {
        c cVar = this.dkl;
        if (cVar == null || cVar.dnm() == null) {
            return;
        }
        this.dnm = this.dkl.dkl();
        apu();
        hnj(true);
        this.orl = true;
    }

    public boolean pty() {
        return this.pty;
    }

    public boolean pv() {
        return this.orl;
    }

    public com.bytedance.sdk.openadsdk.gjv.dse sk() {
        return this.nyv;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public double sq() {
        double dE;
        long jGjv;
        com.bytedance.sdk.openadsdk.component.reward.bug bugVar;
        eum eumVarM31do = this.aq.m31do();
        if (!com.bytedance.sdk.openadsdk.core.model.apu.gjv(this.aq) || eumVarM31do == null) {
            if (!com.bytedance.sdk.openadsdk.core.model.apu.dse(this.aq) || eumVarM31do == null) {
                com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVarPwt = this.aq.pwt();
                dE = aVarPwt != null ? aVarPwt.e() * ((double) aVarPwt.M()) : 0.0d;
            } else {
                jGjv = eumVarM31do.gjv();
            }
            bugVar = this.as.f13457jo;
            if (bugVar != null) {
                bugVar.hnj((long) dE);
            }
            return dE;
        }
        jGjv = eumVarM31do.hn();
        dE = jGjv;
        bugVar = this.as.f13457jo;
        if (bugVar != null) {
            bugVar.hnj((long) dE);
        }
        return dE;
    }

    public boolean ta() {
        c cVar = this.dkl;
        return cVar != null && cVar.mjg();
    }

    public long tgn() {
        c cVar = this.dkl;
        if (cVar != null) {
            return cVar.ojm() + this.dkl.dse();
        }
        return 0L;
    }

    public int tu() {
        c cVar = this.dkl;
        if (cVar != null) {
            return cVar.aq();
        }
        return 0;
    }

    public void ua() {
        this.tu = false;
        xn();
    }

    public boolean ul() {
        return this.qor;
    }

    public long uua() {
        c cVar = this.dkl;
        if (cVar != null) {
            return cVar.dse();
        }
        return 0L;
    }

    public boolean vf() {
        c cVar = this.dkl;
        if (cVar != null) {
            if (cVar.dnm() != null) {
                b bVarDnm = this.dkl.dnm();
                if (bVarDnm.dse() || bVarDnm.aq()) {
                    c cVar2 = this.dkl;
                    if (cVar2 instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) {
                        ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) cVar2).fvt();
                    }
                    return true;
                }
            } else if (bug()) {
                hnj(false);
                c cVar3 = this.dkl;
                if (cVar3 instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) {
                    ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) cVar3).fvt();
                }
                return true;
            }
        }
        return false;
    }

    public void wu() {
        c cVar = this.dkl;
        if (cVar != null) {
            cVar.hn();
        }
    }

    public void xad() {
        c cVar = this.dkl;
        if (cVar instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) {
            ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) cVar).sq();
        }
    }

    public void xn() {
        c cVar = this.dkl;
        if (cVar == null) {
            return;
        }
        cVar.gjv();
        this.dkl = null;
    }

    public long xyo() {
        c cVar = this.dkl;
        if (cVar != null) {
            return cVar.ojm();
        }
        return 0L;
    }

    public long hn() {
        return this.f13443oj;
    }

    public long hnj() {
        return this.jip;
    }

    public boolean qor() {
        return this.tu;
    }

    public void sk(boolean z10) {
        this.f13441fc = z10;
        c cVar = this.dkl;
        if (cVar instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) {
            ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) cVar).dkl(z10);
        }
    }

    private void hn(long j10, long j11) {
        int iAbs = (int) Math.abs(((long) this.uua) - j10);
        int i10 = this.uua;
        if (i10 < 0 || iAbs > 500 || i10 > j11 || iAbs >= 500 || this.eum.contains(this.apu)) {
            return;
        }
        if (this.uua > j10) {
            com.bytedance.sdk.openadsdk.core.fc.qor().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.fc.1
                @Override // java.lang.Runnable
                public void run() {
                    fc.this.fvt();
                    fc.this.as.f33do.hnj(fc.this.uua, fc.this.apu);
                }
            }, iAbs);
        } else {
            fvt();
            this.as.f33do.hnj(this.uua, this.apu);
        }
        this.eum.add(this.apu);
    }

    public void hnj(long j10) {
        this.jip = j10;
    }

    public void qor(boolean z10) {
        this.qor = z10;
    }

    public void gjv(boolean z10) {
        this.f32do = z10;
        if (this.dkl instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) {
            if (z10) {
                ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) this.dkl).hn(this.aq.pwt().M());
            } else {
                this.aq.pwt().K(1);
                ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) this.dkl).hn(1);
            }
        }
    }

    public void hnj(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.gjv.dse dseVar) {
        if (this.wu) {
            return;
        }
        this.wu = true;
        this.ojm = frameLayout;
        if (this.aq.lq() != null) {
            this.tgn = this.aq.lq().hn();
            this.xyo = this.aq.lq().hnj();
        }
        this.nyv = dseVar;
        if (as.sk(this.aq)) {
            this.f13446vf = true;
            this.dkl = new com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj(this.dse, this.ojm, this.aq, dseVar);
            gjv(this.f32do);
            com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj interfaceC0222hnj = this.hqh;
            if (interfaceC0222hnj != null) {
                ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) this.dkl).hnj(interfaceC0222hnj);
            }
            ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj) this.dkl).dkl(this.f13441fc);
            return;
        }
        this.f13446vf = false;
        com.bytedance.sdk.openadsdk.component.reward.gjv gjvVar = new com.bytedance.sdk.openadsdk.component.reward.gjv(this.aq, dseVar);
        this.dkl = gjvVar;
        com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj interfaceC0222hnj2 = this.hqh;
        if (interfaceC0222hnj2 != null) {
            gjvVar.hnj(interfaceC0222hnj2);
        }
    }

    public void hn(long j10) {
        this.dnm = j10;
    }

    public void hn(boolean z10) {
        c cVar = this.dkl;
        if (cVar != null) {
            cVar.hn();
            this.mjg = z10;
        }
    }

    protected void hn(com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        if (!vf() || hnVar == null) {
            return;
        }
        hnVar.hnj(fc(), true);
    }

    public void hnj(com.bytedance.sdk.openadsdk.gjv.dse dseVar) {
        this.nyv = dseVar;
    }

    public void hnj(long j10, long j11) {
        this.bug = j10;
        if (this.pty && (orp() || dkl() || j10 > 0)) {
            dnm();
        }
        hn(j10, j11);
    }

    public void hnj(int i10, String str) {
        this.uua = i10;
        this.apu = str;
    }

    public void hnj(boolean z10) {
        this.hnj = z10;
    }

    public void hnj(int i10, int i11) {
        if (this.dkl != null) {
            com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj hnjVar = new com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj();
            hnjVar.qor(uua());
            hnjVar.gjv(tgn());
            hnjVar.hn(orl());
            hnjVar.hnj(i10);
            hnjVar.hn(i11);
            com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.gjv(this.dkl.bug(), hnjVar);
        }
    }

    public void hnj(c.InterfaceC0870c interfaceC0870c) {
        c cVar = this.dkl;
        if (cVar != null) {
            cVar.hnj(interfaceC0870c);
        }
    }

    public void hnj(boolean z10, String str) {
        c cVar = this.dkl;
        if (cVar != null) {
            cVar.hnj(z10, str);
        }
    }

    public void hnj(String str, boolean z10) {
        if (this.dkl != null) {
            long jOrl = orl();
            if (this.aq.rmr()) {
                jOrl = this.as.dkl();
            }
            long j10 = jOrl;
            JSONObject jSONObjectHnj = orp.hnj(this.aq, this.dkl.dse(), this.dkl.dnm());
            try {
                jSONObjectHnj.put("auto_click", z10);
                if (!z10) {
                    hnj hnjVar = this.as;
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(jSONObjectHnj, hnjVar.gjv ? hnjVar.f13456hn.qlh() : hnjVar.f13456hn.kht(), (int) j10);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.aq, this.f13445ta, str, j10, m21do(), jSONObjectHnj, this.nyv);
            tgn();
            m21do();
        }
        xad();
    }

    public boolean hnj(long j10, boolean z10, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar) {
        boolean zHnj;
        boolean z11 = false;
        if (!hqh()) {
            hnj hnjVar = this.as;
            com.bytedance.sdk.openadsdk.gjv.ta.hnj(hnjVar.f13456hn, "show_ad_fail", hnjVar.f13461sk, "video_controller_not_ready");
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.apu.gjv(this.as.f13456hn) || com.bytedance.sdk.openadsdk.core.model.apu.dse(this.as.f13456hn)) {
            return true;
        }
        if (!z10 || !nyv()) {
            hnj(hnVar);
        }
        try {
            zHnj = hnj(j10, this.as.dzo);
            try {
                this.orl = false;
            } catch (Exception e10) {
                e = e10;
                z11 = zHnj;
                Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
                zHnj = z11;
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (zHnj && !z10) {
            this.as.tgn.hnj(map);
        } else if (!zHnj) {
            hnj hnjVar2 = this.as;
            com.bytedance.sdk.openadsdk.gjv.ta.hnj(hnjVar2.f13456hn, "show_ad_fail", hnjVar2.f13461sk, "video_play_fail");
        }
        return zHnj;
    }

    public void hnj(com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar) {
        if (this.as.ojm.get()) {
            return;
        }
        hnj hnjVar = this.as;
        if (hnjVar.pnz && !hqh.qor(hnjVar.f13456hn)) {
            boolean zSk = as.sk(this.as.f13456hn);
            boolean zGjv = this.as.f33do.gjv();
            int iOrl = oj.gjv().orl(String.valueOf(this.as.dkl));
            if ((!zSk && iOrl == 1 && zGjv) || com.bytedance.sdk.openadsdk.core.model.apu.gjv(this.as.f13456hn) || com.bytedance.sdk.openadsdk.core.model.apu.dse(this.as.f13456hn) || this.f13444sk || !hnVar.sk()) {
                return;
            }
            this.as.f13453ff.removeMessages(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
            Message messageObtain = Message.obtain();
            messageObtain.what = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
            this.as.f13453ff.sendMessageDelayed(messageObtain, 5000L);
            this.pty = true;
        }
    }

    public boolean hnj(JSONObject jSONObject) {
        int i10;
        if (this.dkl != null && jSONObject != null && ((i10 = this.tgn) == 1 || i10 == 2)) {
            int iOptInt = jSONObject.optInt("switch", 0);
            float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
            this.xyo = fOptDouble;
            if (fOptDouble <= 0.0f && this.as.f13456hn.lq() != null) {
                this.xyo = this.as.f13456hn.lq().hnj();
            }
            if (iOptInt == 0) {
                this.xyo = 1.0f;
                if (this.tu) {
                    long jCurrentTimeMillis = this.f13443oj + (System.currentTimeMillis() - this.f13447xn);
                    this.f13443oj = jCurrentTimeMillis;
                    c cVar = this.dkl;
                    if (cVar != null) {
                        cVar.hnj(jCurrentTimeMillis);
                    }
                    com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar = this.as.sq;
                    if (hnVar != null) {
                        hnVar.gjv(false);
                    }
                }
            } else if (iOptInt == 1 && !this.tu) {
                this.f13447xn = System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar2 = this.as.sq;
                if (hnVar2 != null) {
                    hnVar2.gjv(true);
                }
            }
            this.tu = iOptInt == 1;
            if (this.tgn == 1) {
                return true;
            }
            c cVar2 = this.dkl;
            if (cVar2 == null) {
                return false;
            }
            return cVar2.hnj(this.xyo);
        }
        this.tu = false;
        return false;
    }

    private boolean hnj(long j10, boolean z10) {
        if (this.dkl == null || this.aq.pwt() == null) {
            return false;
        }
        String strHnj = CacheDirFactory.getICacheDir(this.aq.gkx()).hnj();
        File file = new File(strHnj, this.aq.pwt().y());
        if (file.exists() && file.length() > 0) {
            this.f13442hn = true;
        }
        com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(strHnj, this.aq);
        hnVarHnj.hn(this.aq.sp());
        hnVarHnj.hn(this.ojm.getWidth());
        hnVarHnj.qor(this.ojm.getHeight());
        hnVarHnj.qor(this.aq.ldn());
        hnVarHnj.hnj(j10);
        hnVarHnj.hnj(z10);
        return this.dkl.hnj(hnVarHnj);
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        try {
            this.f13444sk = false;
            if (bug()) {
                xo();
                hn(hnVar);
            } else if (ojm()) {
                eum();
            }
        } catch (Throwable th2) {
            apu.qor("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public void hnj(boolean z10, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar, boolean z11) {
        if (this.mjg || !(!z11 || z10 || this.f13444sk)) {
            if (ojm()) {
                eum();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                xo();
                hn(hnVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.mjg = false;
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj interfaceC0222hnj) {
        this.hqh = interfaceC0222hnj;
    }
}
