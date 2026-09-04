package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private long aip;
    public final AtomicBoolean apu;
    public int aq;
    public final aq as;
    public final AtomicBoolean bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    public String f13450cm;
    public final int dkl;

    /* JADX INFO: renamed from: dl, reason: collision with root package name */
    private int f13451dl;
    public final AtomicBoolean dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final com.bytedance.sdk.openadsdk.component.reward.view.ojm f33do;
    public int dse;
    public boolean dy;
    public boolean dzo;
    public int eta;
    public final fc eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    public final AtomicBoolean f13452fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    public final xyo f13453ff;
    public boolean fr;
    public final com.bytedance.sdk.openadsdk.component.reward.view.aq fvt;
    public boolean fzb;
    public final boolean gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    public final bug f13454gm;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.utils.mjg f13455gn;
    public boolean hkr;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public as f13456hn;
    public final int hnj;
    public com.bytedance.sdk.openadsdk.orl.ojm hqh;
    public boolean idl;
    public boolean izk;
    public final Context jbd;
    public final AtomicBoolean jip;
    private long jle;

    /* JADX INFO: renamed from: jo, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.bug f13457jo;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    public boolean f13458ka;
    private int krm;
    public boolean lhi;
    public boolean lko;
    public int lu;
    public final boolean meb;
    public final AtomicBoolean mjg;
    public long mkl;
    public final jip nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    public final AtomicBoolean f13459oj;
    public final AtomicBoolean ojm;
    public final AtomicBoolean orl;
    public final Activity orp;
    public boolean pnz;
    public final orl pty;
    public int pv;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.hn.hn f13460qb;
    public final boolean qor;
    public float rmr;
    public boolean rq;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public final String f13461sk;
    public final com.bytedance.sdk.openadsdk.core.mjg.gjv.hn sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public final AtomicBoolean f13462ta;
    public final ta tgn;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.activity.single.aq f13463th;
    public com.bytedance.sdk.openadsdk.component.reward.top.qor tll;
    public final dnm tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    public final com.bytedance.sdk.openadsdk.component.reward.view.dnm f13464ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    public final sk f13465ul;
    public final AtomicBoolean uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    public final qor f13466vf;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private String f13467vh;
    public final gjv wu;
    public final boolean xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    public final AtomicBoolean f13468xn;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    public boolean f13469xo;
    public final dkl xyo;
    public boolean znr;
    public int zt;

    public hnj(Activity activity, xyo xyoVar, as asVar, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar, int i10, boolean z10) {
        this(activity, xyoVar, asVar, hnVar, i10, z10, null);
    }

    public com.bytedance.sdk.openadsdk.gjv.dse aq() {
        if (!this.f13456hn.dkl()) {
            com.bytedance.sdk.openadsdk.gjv.dse dseVar = new com.bytedance.sdk.openadsdk.gjv.dse();
            dseVar.hnj(System.currentTimeMillis(), 1.0f);
            return dseVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.f33do;
        if (ojmVar != null && ojmVar.hnj() != null) {
            return this.f33do.hnj().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.gjv.dse dseVar2 = new com.bytedance.sdk.openadsdk.gjv.dse();
        dseVar2.hnj(System.currentTimeMillis(), 1.0f);
        return dseVar2;
    }

    public long dkl() {
        return this.jle + (SystemClock.elapsedRealtime() - this.aip);
    }

    public boolean dse() {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        return !this.dy || (aqVar = this.f13463th) == null || !(aqVar instanceof com.bytedance.sdk.openadsdk.activity.single.sk) || ((com.bytedance.sdk.openadsdk.activity.single.sk) aqVar).hnj;
    }

    public void gjv() {
        this.aip = SystemClock.elapsedRealtime();
    }

    public int hn() {
        return this.krm;
    }

    public int hnj() {
        return this.f13451dl;
    }

    public Map<String, Object> ojm() {
        as asVar;
        HashMap map = new HashMap();
        if (this.f33do != null && (asVar = this.f13456hn) != null && asVar.th() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.f33do.dnm()));
            JSONObject jSONObjectHnj = this.f33do.hnj((JSONObject) null);
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

    public boolean qor() {
        return this.f13451dl != 0;
    }

    public void sk() {
        if (this.aip <= 0) {
            this.aip = SystemClock.elapsedRealtime();
        }
        this.jle += SystemClock.elapsedRealtime() - this.aip;
    }

    public hnj(Activity activity, xyo xyoVar, as asVar, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar, int i10, boolean z10, hnj hnjVar) {
        this.dse = 0;
        this.aq = 0;
        this.ojm = new AtomicBoolean(false);
        this.f13462ta = new AtomicBoolean(false);
        this.dnm = new AtomicBoolean(false);
        this.bug = new AtomicBoolean(false);
        this.orl = new AtomicBoolean(false);
        this.mjg = new AtomicBoolean(false);
        this.f13452fc = new AtomicBoolean(false);
        this.jip = new AtomicBoolean(false);
        this.uua = new AtomicBoolean(false);
        this.f13459oj = new AtomicBoolean(false);
        this.f13468xn = new AtomicBoolean(false);
        this.apu = new AtomicBoolean(false);
        this.pnz = false;
        this.lu = 1;
        this.mkl = 0L;
        this.f13463th = null;
        this.fzb = true;
        this.rq = false;
        this.lko = false;
        this.krm = -1;
        this.f13467vh = "";
        this.f13451dl = 0;
        this.orp = activity;
        this.sq = hnVar;
        Context contextHnj = oj.hnj();
        this.jbd = contextHnj;
        this.f13456hn = asVar;
        this.hnj = i10;
        this.znr = hnjVar != null;
        this.fr = i10 == 0 || i10 == 1;
        this.xad = i10 == 0 || i10 == 2;
        this.f13453ff = xyoVar;
        this.meb = z10;
        boolean z11 = asVar.aip().getDurationSlotType() == 7;
        this.gjv = z11;
        this.f13461sk = z11 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.lhi = asVar.dkl();
        int iAtw = asVar.atw();
        this.dkl = iAtw;
        this.dzo = oj.gjv().uua(String.valueOf(iAtw));
        this.qor = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().mjg(String.valueOf(iAtw));
        this.tu = new dnm(this);
        this.f13464ua = i10 == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.bug(this) : asVar.dkl() ? new com.bytedance.sdk.openadsdk.component.reward.view.dnm(this) : new com.bytedance.sdk.openadsdk.component.reward.view.ta(this);
        this.fvt = new com.bytedance.sdk.openadsdk.component.reward.view.aq(this);
        this.eum = new fc(this);
        this.wu = new gjv(this);
        this.as = new aq(this, asVar);
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = hnjVar != null ? hnjVar.f33do : new com.bytedance.sdk.openadsdk.component.reward.view.ojm(this);
        this.f33do = ojmVar;
        ojmVar.hnj(this);
        this.nyv = new jip(this);
        this.pty = new orl(this);
        this.f13454gm = new bug(this);
        this.f13465ul = new sk(this);
        this.tgn = new ta(this);
        dkl dklVar = hnjVar != null ? hnjVar.xyo : new dkl(this);
        this.xyo = dklVar;
        dklVar.hnj(this);
        this.f13466vf = new qor(this);
        this.hqh = new com.bytedance.sdk.openadsdk.orl.ojm(contextHnj);
        this.f13455gn = com.bytedance.sdk.openadsdk.utils.ojm.hnj(activity, new com.bytedance.sdk.openadsdk.utils.ojm.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.hnj.1
            @Override // com.bytedance.sdk.openadsdk.utils.ojm.hnj
            public void hn() {
                bug bugVar = hnj.this.f13454gm;
                if (bugVar != null) {
                    bugVar.sk();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ojm.hnj
            public View hnj() {
                com.bytedance.sdk.openadsdk.component.reward.view.dnm dnmVar = hnj.this.f13464ua;
                if (dnmVar != null) {
                    return dnmVar.ta();
                }
                return null;
            }
        });
    }

    public void hnj(int i10, String str, int i11) {
        this.krm = i10;
        this.f13467vh = str;
        this.f13451dl = i11;
    }

    public void hnj(boolean z10) {
        this.izk = z10;
        this.f13454gm.gjv(z10);
    }
}
