package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.fvt;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.orp;
import com.bytedance.sdk.openadsdk.core.ua;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu extends com.bytedance.sdk.openadsdk.core.dkl.qor implements com.bytedance.sdk.component.adexpress.dynamic.gjv, com.bytedance.sdk.component.adexpress.hn.aq, com.bytedance.sdk.component.adexpress.hn.fc, fc, com.bytedance.sdk.openadsdk.core.qor.hnj.InterfaceC0232hnj {
    protected HashSet<String> apu;
    private String aq;
    int as;
    protected com.bytedance.sdk.openadsdk.core.model.as bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f14021cm;
    private aq dkl;
    protected AdSlot dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    boolean f43do;
    private ojm dse;
    private float dy;
    private final Runnable dzo;
    private List<com.bytedance.sdk.component.adexpress.hn.ta> eta;
    protected ViewGroup eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected boolean f14022fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private final AtomicBoolean f14023ff;
    private int fr;
    private String fvt;
    private TTDislikeDialogAbstract gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private String f14024gm;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    private final SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> f14025gn;
    private float hkr;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14026hn;
    private boolean hnj;
    private float hqh;
    private float idl;
    private com.bytedance.sdk.openadsdk.core.bug.hn.dse izk;
    private wu jbd;
    protected com.bytedance.sdk.component.adexpress.hn.qor jip;

    /* JADX INFO: renamed from: jo, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.gjv.ojm f14027jo;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.hn.dkl f14028ka;
    private com.bytedance.sdk.component.adexpress.hn.ojm lhi;
    private Cdo lu;
    protected boolean mjg;
    private com.bytedance.sdk.openadsdk.core.bug.dkl.gjv mkl;
    private float nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    protected int f14029oj;
    protected final Context ojm;
    public FrameLayout orl;
    private com.bytedance.sdk.openadsdk.core.gjv.dse.hnj orp;
    private final Runnable pnz;
    private com.bytedance.sdk.openadsdk.gjv.gjv.sk pty;
    private final Runnable pv;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.hn.orl f14030qb;
    private com.bytedance.sdk.openadsdk.qor.qor qor;
    private com.bytedance.sdk.component.adexpress.hn.ta.hnj rmr;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private PAGExpressAdWrapperListener f14031sk;
    private boolean sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected String f14032ta;
    long tgn;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private long f14033th;
    private float tll;
    public com.bytedance.sdk.openadsdk.gjv.dse tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private boolean f14034ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.bug.qor.hn f14035ul;
    boolean uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> f14036vf;
    public boolean wu;
    private qor xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    protected String f14037xn;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private ThemeStatusBroadcastReceiver f14038xo;
    protected com.bytedance.sdk.component.adexpress.hn.hn xyo;
    private com.bytedance.sdk.component.adexpress.hn.jip zt;

    public apu(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, AdSlot adSlot, String str) {
        super(context);
        this.hnj = true;
        this.f14026hn = 0;
        this.f14032ta = "embeded_ad";
        this.aq = null;
        this.f14022fc = false;
        this.uua = true;
        this.f14029oj = -1;
        this.f14024gm = "";
        this.wu = false;
        this.sq = true;
        this.as = -1;
        this.tu = new com.bytedance.sdk.openadsdk.gjv.dse();
        this.tgn = 0L;
        this.f14023ff = new AtomicBoolean(false);
        this.f14021cm = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                apu apuVar = apu.this;
                if (apuVar.uua && apuVar.ojm()) {
                    apu.this.xyo();
                    apu apuVar2 = apu.this;
                    apuVar2.removeCallbacks(apuVar2.dzo);
                    apu apuVar3 = apu.this;
                    apuVar3.postDelayed(apuVar3.dzo, 500L);
                }
            }
        };
        this.dzo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.2
            @Override // java.lang.Runnable
            public void run() {
                if (!fvt.hnj(apu.this, 0, 5, false)) {
                    apu.this.dkl(8);
                } else {
                    apu apuVar = apu.this;
                    apuVar.dkl(apuVar.getVisibility());
                }
            }
        };
        this.pnz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.3
            @Override // java.lang.Runnable
            public void run() {
                apu.this.dkl(0);
            }
        };
        this.pv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.4
            @Override // java.lang.Runnable
            public void run() {
                apu.this.dkl(8);
            }
        };
        this.fr = 8;
        this.f14025gn = new SparseArray<>();
        this.dy = -1.0f;
        this.idl = -1.0f;
        this.hkr = -1.0f;
        this.tll = -1.0f;
        this.f14033th = 0L;
        this.f14032ta = str;
        this.ojm = context;
        this.bug = asVar;
        this.dnm = adSlot;
        this.wu = false;
        dse();
    }

    private void fc() {
        if (this.bug.iz() == 1 && this.bug.qs()) {
            uua();
            this.rmr = new com.bytedance.sdk.component.adexpress.hn.bug(this.eta, this.lhi);
            return;
        }
        if (pty()) {
            jip();
            return;
        }
        try {
            tu();
            Cdo cdo = new Cdo(this.ojm, this.f14030qb, this.f14038xo, this.pty, this.bug);
            this.lu = cdo;
            com.bytedance.sdk.component.adexpress.hn.jip jipVar = new com.bytedance.sdk.component.adexpress.hn.jip(this.ojm, this.f14030qb, cdo, this);
            this.zt = jipVar;
            this.eta.add(jipVar);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.hnj("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
        }
        uua();
        this.rmr = new com.bytedance.sdk.component.adexpress.hn.bug(this.eta, this.lhi);
    }

    private void hqh() {
        List<com.bytedance.sdk.component.adexpress.hn.ta> list = this.eta;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.hn.ta> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void jip() {
        this.f14026hn = this.bug.rq();
        try {
            tu();
            tgn();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.hnj("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
        }
        boolean z10 = this.bug.lko() == 1;
        this.hnj = z10;
        if (z10) {
            uua();
        }
        Objects.toString(this.eta);
        this.rmr = new com.bytedance.sdk.component.adexpress.hn.bug(this.eta, this.lhi);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    private void mjg() {
        long jOptLong;
        boolean z10;
        com.bytedance.sdk.component.adexpress.hn.orl.hnj hnjVar;
        com.bytedance.sdk.openadsdk.gjv.xn xnVar = new com.bytedance.sdk.openadsdk.gjv.xn(1, this.f14032ta, this.bug);
        this.pty = xnVar;
        this.lhi = new orl(xnVar, this.f14032ta, this.bug, this.aq, this.f14034ua);
        final boolean zBgg = this.bug.bgg();
        try {
            com.bytedance.sdk.openadsdk.core.model.as.hnj hnjVarZd = this.bug.zd();
            if (hnjVarZd != null) {
                String strOjm = hnjVarZd.ojm();
                if (TextUtils.isEmpty(strOjm)) {
                    jOptLong = 0;
                } else {
                    jOptLong = new JSONObject(strOjm).optLong("render_delay_time");
                }
            } else {
                jOptLong = 0;
            }
        } catch (Exception unused) {
        }
        try {
            z10 = !com.bytedance.sdk.openadsdk.core.model.as.sk(this.bug) && com.bytedance.sdk.openadsdk.core.oj.gjv().orl(this.aq) == 1;
            try {
                if (!com.bytedance.sdk.openadsdk.core.settings.dnm.hn().mjg(this.aq) || this.bug.qb() == 5 || this.bug.qb() == 6 || this.bug.xf() == 3) {
                    z10 = true;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            z10 = false;
        }
        long jMin = Math.min(Math.max(jOptLong, 0L), 10000L);
        int renderTimeout = getRenderTimeout();
        double dE = this.bug.pwt() != null ? this.bug.pwt().e() * ((double) this.bug.pwt().M()) : 0.0d;
        int i10 = this.as;
        this.f43do = i10 != -1 && i10 < ((int) dE);
        if (com.bytedance.sdk.openadsdk.core.bug.sk.hnj(this.bug) || com.bytedance.sdk.openadsdk.core.bug.sk.hn(this.bug) || com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl.hnj(this.f14032ta)) {
            com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.C0207hnj c0207hnj = new com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.C0207hnj();
            if (com.bytedance.sdk.openadsdk.core.bug.sk.hnj(this.bug)) {
                c0207hnj.hnj(com.bytedance.sdk.openadsdk.core.bug.sk.hnj(this.bug, this.f14032ta));
            }
            c0207hnj.hnj((com.bytedance.adsdk.ugeno.core.oj) this.lhi);
            c0207hnj.hnj(this.hqh);
            c0207hnj.hn(this.nyv);
            c0207hnj.dkl(this.f14034ua);
            hnjVar = c0207hnj;
        } else {
            hnjVar = new com.bytedance.sdk.component.adexpress.hn.orl.hnj();
        }
        hnjVar.sk(zBgg);
        hnjVar.hnj(this.f14032ta).hn(this.bug.sp()).qor(this.bug.nl()).gjv(this.bug.ldn()).hnj(this.lhi).gjv(this.bug.fzx()).hnj(renderTimeout).hn(this.bug.ij()).qor(this.sq).hn(this.bug.krm()).hnj(jMin).qor(this.bug.rg()).hnj(com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hn(this.bug)).gjv(z10).sk(this.as).hnj(this.f43do).hnj(dE).dkl(com.bytedance.sdk.openadsdk.core.settings.dnm.hn().apu()).dkl(com.bytedance.sdk.openadsdk.as.sk.hnj("inject_data_reuse_open", 0)).dse(this.bug.gmt().hnj()).aq(this.bug.gmt().hn()).hnj(new com.bytedance.sdk.component.adexpress.hn.sk() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.5
            @Override // com.bytedance.sdk.component.adexpress.hn.sk
            public JSONObject hnj() {
                try {
                    apu apuVar = apu.this;
                    com.bytedance.sdk.openadsdk.core.model.as asVar = apuVar.bug;
                    if (asVar == null) {
                        apuVar.f14024gm = "material is null";
                        return null;
                    }
                    if (zBgg) {
                        apuVar.jbd = new wu();
                        float f10 = apu.this.hqh;
                        float f11 = apu.this.nyv;
                        apu apuVar2 = apu.this;
                        JSONObject jSONObjectHnj = com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj(f10, f11, apuVar2.f14022fc, apuVar2.bug, apuVar2.f14032ta, apuVar2.jbd);
                        apu.this.f14024gm = com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj();
                        return jSONObjectHnj;
                    }
                    if (!com.bytedance.sdk.openadsdk.core.bug.sk.hnj(asVar)) {
                        float f12 = apu.this.hqh;
                        float f13 = apu.this.nyv;
                        apu apuVar3 = apu.this;
                        JSONObject jSONObjectHnj2 = com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj(f12, f13, apuVar3.f14022fc, apuVar3.bug);
                        apu.this.qor(jSONObjectHnj2);
                        return jSONObjectHnj2;
                    }
                    apu.this.jbd = new wu();
                    apu apuVar4 = apu.this;
                    JSONObject jSONObjectHnj3 = com.bytedance.sdk.openadsdk.core.bug.sk.hnj(apuVar4.bug, apuVar4.jbd);
                    apu.this.f14024gm = com.bytedance.sdk.openadsdk.core.bug.sk.hnj();
                    return jSONObjectHnj3;
                } catch (Throwable unused4) {
                    return null;
                }
            }
        });
        hnj(hnjVar);
        this.f14030qb = hnjVar.hnj();
    }

    private void nyv() {
        List<com.bytedance.sdk.component.adexpress.hn.ta> list = this.eta;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.hn.ta> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void orl() {
        com.bytedance.sdk.openadsdk.core.model.as.hnj hnjVarZd = this.bug.zd();
        if (!TextUtils.equals(this.f14032ta, "embeded_ad") || hnjVarZd == null) {
            return;
        }
        String strTa = hnjVarZd.ta();
        if (TextUtils.isEmpty(strTa)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strTa);
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt == 0 || iOptInt2 == 0) {
                return;
            }
            this.nyv = iOptInt2;
            this.hqh = iOptInt;
        } catch (Exception unused) {
        }
    }

    private boolean pty() {
        return TextUtils.equals(this.f14032ta, "fullscreen_interstitial_ad") || TextUtils.equals(this.f14032ta, "rewarded_video") || TextUtils.equals("open_ad", this.f14032ta) || Cdo.hn(this.f14032ta) || TextUtils.equals(this.f14032ta, "embeded_ad");
    }

    private void tgn() {
        apu apuVar;
        com.bytedance.sdk.openadsdk.core.bug.dkl.gjv gjvVar;
        com.bytedance.sdk.openadsdk.core.model.as asVar;
        com.bytedance.sdk.openadsdk.core.model.as asVar2 = this.bug;
        if (asVar2 == null || asVar2.iz() != 1 || this.bug.th() == 2) {
            if (!com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl.hnj(this.f14032ta) || (asVar = this.bug) == null || asVar.th() == 2) {
                com.bytedance.sdk.openadsdk.core.dse.hnj.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.dse.hnj.hnj();
                int i10 = this.f14026hn;
                if (i10 != 0) {
                    if (i10 == 3) {
                        com.bytedance.sdk.component.adexpress.dynamic.sk.dse dseVar = new com.bytedance.sdk.component.adexpress.dynamic.sk.dse();
                        Context applicationContext = this.ojm.getApplicationContext();
                        com.bytedance.sdk.component.adexpress.hn.orl orlVar = this.f14030qb;
                        ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.f14038xo;
                        boolean z10 = this.wu;
                        com.bytedance.sdk.component.adexpress.hn.hn hnVar = new com.bytedance.sdk.component.adexpress.hn.hn(applicationContext, orlVar, themeStatusBroadcastReceiver, z10, dseVar, this, hnjVar, new dkl(this.ojm, themeStatusBroadcastReceiver, z10, dseVar, orlVar, hnjVar));
                        this.xyo = hnVar;
                        this.eta.add(hnVar);
                        return;
                    }
                    if (i10 == 7) {
                        com.bytedance.sdk.openadsdk.core.bug.dkl.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.core.bug.dkl.gjv(this.ojm, this.bug, this.wu, (com.bytedance.sdk.openadsdk.core.bug.dkl.hnj) this.f14030qb, this);
                        this.mkl = gjvVar2;
                        com.bytedance.sdk.openadsdk.core.bug.hn.dse dseVar2 = new com.bytedance.sdk.openadsdk.core.bug.hn.dse(this.ojm, gjvVar2, this, this.f14030qb);
                        this.izk = dseVar2;
                        dseVar2.hnj(this);
                        this.eta.add(this.izk);
                        return;
                    }
                    if (i10 != 9) {
                        if (i10 != 10) {
                            return;
                        }
                        if (!this.f14034ua || (gjvVar = this.mkl) == null) {
                            apuVar = this;
                            apuVar.mkl = new com.bytedance.sdk.openadsdk.core.bug.dkl.dse(this.ojm, this.bug, this.wu, (com.bytedance.sdk.openadsdk.core.bug.dkl.hnj) this.f14030qb, this);
                        } else {
                            gjvVar.hnj(this.bug, this.wu, (com.bytedance.sdk.openadsdk.core.bug.dkl.hnj) this.f14030qb, this);
                            apuVar = this;
                        }
                        com.bytedance.sdk.openadsdk.core.bug.hn.dse dseVar3 = new com.bytedance.sdk.openadsdk.core.bug.hn.dse(apuVar.ojm, apuVar.mkl, this, apuVar.f14030qb);
                        apuVar.izk = dseVar3;
                        dseVar3.hnj(this);
                        apuVar.eta.add(apuVar.izk);
                        return;
                    }
                }
                Cdo cdo = new Cdo(this.ojm, this.f14030qb, this.f14038xo, this.pty, this.bug);
                this.lu = cdo;
                com.bytedance.sdk.component.adexpress.hn.jip jipVar = new com.bytedance.sdk.component.adexpress.hn.jip(this.ojm, this.f14030qb, cdo, this);
                this.zt = jipVar;
                this.eta.add(jipVar);
            }
        }
    }

    private void tu() {
        if (com.bytedance.sdk.openadsdk.core.fc.sk()) {
            return;
        }
        bug.hnj();
    }

    private void uua() {
        if (com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl.hnj(this.f14032ta)) {
            com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl dklVar = new com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl(this.ojm, this.bug, this.wu, (com.bytedance.sdk.openadsdk.core.bug.dkl.hnj) this.f14030qb, this, this.hqh, this.nyv, this.f14022fc, this.f14032ta);
            com.bytedance.sdk.openadsdk.core.bug.hn.dse dseVar = new com.bytedance.sdk.openadsdk.core.bug.hn.dse(this.ojm, dklVar, this, this.f14030qb);
            dklVar.hnj((fc) this);
            this.eta.add(dseVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.hn.dkl dklVar2 = new com.bytedance.sdk.component.adexpress.hn.dkl(this.ojm, this.f14030qb, new eum(this, this.f14038xo, this.f14030qb));
        this.f14028ka = dklVar2;
        this.eta.add(dklVar2);
    }

    private boolean vf() {
        return com.bytedance.sdk.openadsdk.core.model.as.sk(this.bug);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xyo() {
        if (this.f14023ff.get()) {
            this.tu.hnj(System.currentTimeMillis(), fvt.hnj(this));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.fc
    public void a_(int i10) {
        com.bytedance.sdk.component.adexpress.hn.ojm ojmVar = this.lhi;
        if (ojmVar != null) {
            if (!this.hnj) {
                ojmVar.dse();
            }
            this.lhi.aq();
            ((orl) this.lhi).ta();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f14031sk;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.ojm.hnj(i10), i10);
        }
        wu wuVar = this.jbd;
        if (wuVar != null) {
            wuVar.hnj(this.bug, this.f14032ta);
        }
    }

    public void apu() {
        try {
            FrameLayout frameLayout = this.orl;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.orl);
        } catch (Throwable unused) {
        }
    }

    protected boolean aq() {
        return true;
    }

    public boolean as() {
        return this.f14023ff.get();
    }

    public void bug() {
        try {
            qor qorVar = this.xad;
            if (qorVar != null) {
                qorVar.hn();
            }
            wu();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.hn.ta> list = this.eta;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.hn.ta> it = list.iterator();
                while (it.hasNext()) {
                    it.next().hnj();
                }
            }
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.bug);
            com.bytedance.sdk.openadsdk.p000do.hnj.qor.hn(this.bug);
            this.qor = null;
            this.gjv = null;
            this.dnm = null;
            this.bug = null;
            this.f14031sk = null;
            this.dkl = null;
            this.jip = null;
            this.dse = null;
            com.bytedance.sdk.openadsdk.core.bug.qor.hn hnVar = this.f14035ul;
            if (hnVar != null) {
                hnVar.gjv();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.hnj("NativeExpressView", "detach error", th2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        aq aqVar = this.dkl;
        if (aqVar != null) {
            aqVar.hn(motionEvent.getDeviceId());
            this.dkl.hnj(motionEvent.getSource());
            this.dkl.qor(motionEvent.getToolType(0));
        }
        ojm ojmVar = this.dse;
        if (ojmVar != null) {
            ojmVar.hn(motionEvent.getDeviceId());
            this.dse.hnj(motionEvent.getSource());
            this.dse.qor(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i11 = 3;
            if (actionMasked == 1) {
                i10 = i11;
            } else if (actionMasked != 2) {
                i11 = actionMasked != 3 ? -1 : 4;
                i10 = i11;
            } else {
                this.hkr += Math.abs(motionEvent.getX() - this.dy);
                this.tll += Math.abs(motionEvent.getY() - this.idl);
                this.dy = motionEvent.getX();
                this.idl = motionEvent.getY();
                i10 = (System.currentTimeMillis() - this.f14033th <= 200 || (this.hkr <= 8.0f && this.tll <= 8.0f)) ? 2 : 1;
            }
        } else {
            this.dy = motionEvent.getRawX();
            this.idl = motionEvent.getRawY();
            this.f14033th = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.dnm.qor.hnj(motionEvent);
            i10 = 0;
        }
        SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray = this.f14025gn;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.qor.qor.hnj(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void dkl() {
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m36do() {
        com.bytedance.sdk.openadsdk.core.bug.qor.hn hnVar = new com.bytedance.sdk.openadsdk.core.bug.qor.hn(this.ojm, this.bug);
        this.f14035ul = hnVar;
        hnVar.hnj(this);
        this.f14035ul.hnj(new com.bytedance.sdk.openadsdk.core.bug.qor.hnj() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.7
            @Override // com.bytedance.sdk.openadsdk.core.bug.qor.hnj
            public void hnj(View view, int i10, com.bytedance.sdk.component.adexpress.qor qorVar) {
                hnj(view, i10, qorVar);
            }
        });
    }

    protected void dse() {
        this.apu = new HashSet<>();
        this.f14038xo = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.dnm;
        if (adSlot != null) {
            this.hqh = adSlot.getExpressViewAcceptedWidth();
            this.nyv = this.dnm.getExpressViewAcceptedHeight();
            orl();
            this.aq = this.dnm.getCodeId();
            if (TextUtils.equals(this.f14032ta, "fullscreen_interstitial_ad")) {
                this.as = this.bug.kht();
            } else if (TextUtils.equals(this.f14032ta, "rewarded_video")) {
                this.as = this.bug.qlh();
            } else if (TextUtils.equals(this.f14032ta, "open_ad")) {
                com.bytedance.sdk.openadsdk.core.model.as asVar = this.bug;
                if (asVar == null || asVar.hn() < 0) {
                    this.as = com.bytedance.sdk.openadsdk.core.oj.gjv().wu(this.aq);
                } else {
                    this.as = this.bug.hn();
                }
                if (this.as < 0) {
                    this.as = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.bug.ux()) {
            this.xad = new qor(this.ojm, this, this.bug, this.f14032ta);
            return;
        }
        mjg();
        this.eta = new ArrayList();
        fc();
        com.bytedance.sdk.component.adexpress.hn.jip jipVar = this.zt;
        if (jipVar != null) {
            this.lu = (Cdo) jipVar.hn();
        }
        ua jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.dkl(this.f14032ta);
        }
    }

    public boolean eum() {
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        return gjvVar != null && (gjvVar instanceof eum);
    }

    public com.bytedance.sdk.openadsdk.gjv.dse getAdShowTime() {
        return this.tu;
    }

    public qor getBrandBannerController() {
        return this.xad;
    }

    public aq getClickCreativeListener() {
        return this.dkl;
    }

    public ojm getClickListener() {
        return this.dse;
    }

    public String getClosedListenerKey() {
        return this.fvt;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar != null) {
            return gjvVar.qor();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.nyv).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.hqh).intValue();
    }

    public PAGExpressAdWrapperListener getExpressInteractionListener() {
        return this.f14031sk;
    }

    public ua getJsObject() {
        Cdo cdo = this.lu;
        if (cdo != null) {
            return cdo.jip();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        ta taVarFc;
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (!(gjvVar instanceof Cdo) || (taVarFc = ((Cdo) gjvVar).fc()) == null) {
            return 0;
        }
        return taVarFc.hnj();
    }

    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.oj.gjv().ua();
    }

    public String getUgenTemplateErrorReason() {
        return this.f14024gm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qor.hnj.InterfaceC0232hnj
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.gjv.ojm ojmVar = this.f14027jo;
        if (ojmVar != null) {
            return ojmVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.ojm.dkl getWebView() {
        Cdo cdo = this.lu;
        if (cdo == null) {
            return null;
        }
        return cdo.hnj();
    }

    public long gjv() {
        return 0L;
    }

    public void hn() {
    }

    public void hnj() {
    }

    public void oj() {
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar instanceof Cdo) {
            if (gjvVar == null) {
                return;
            }
            ((Cdo) gjvVar).aq();
            com.bytedance.sdk.openadsdk.core.model.as asVar = this.bug;
            com.bytedance.sdk.component.utils.ojm.hn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.6
                @Override // java.lang.Runnable
                public void run() {
                    apu.this.sk(1);
                }
            }, ((long) (asVar != null ? asVar.tgn().gjv() : 5)) * 1000);
        } else if (gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.dse) {
            ((com.bytedance.sdk.openadsdk.core.bug.dkl.dse) gjvVar).dnm();
        }
        com.bytedance.sdk.openadsdk.core.model.as asVar2 = this.bug;
        if (asVar2 != null && (gjvVarFvx = asVar2.fvx()) != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
            gjvVarHnj.hnj(0L);
        }
        if ((this.f14036vf instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.dse) && com.bytedance.sdk.openadsdk.core.model.uua.hnj(this.bug)) {
            hnj(this.f14036vf);
        }
    }

    protected boolean ojm() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        xyo();
        hqh();
        getViewTreeObserver().addOnScrollChangedListener(this.f14021cm);
        com.bytedance.sdk.openadsdk.core.ta.hn().hnj(this.fvt, this.orp);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.f14021cm);
        com.bytedance.sdk.openadsdk.core.ta.hn().dkl(this.fvt);
        nyv();
        hnj(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        xyo();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z10 ? getVisibility() : 8);
        }
        xyo();
        com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(this.bug, z10);
        if (z10) {
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.bug, 4);
        } else {
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.bug, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        hnj(i10, true, false);
    }

    public long qor() {
        return 0L;
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.hn.qor qorVar) {
        this.jip = qorVar;
        com.bytedance.sdk.component.adexpress.hn.dkl dklVar = this.f14028ka;
        if (dklVar != null) {
            dklVar.hnj(qorVar);
        }
    }

    public void setBannerClickClosedListener(com.bytedance.sdk.openadsdk.core.gjv.dse.hnj hnjVar) {
        this.orp = hnjVar;
    }

    public void setClickCreativeListener(aq aqVar) {
        this.dkl = aqVar;
        if (aqVar != null) {
            aqVar.hnj((com.bytedance.sdk.openadsdk.core.qor.hnj.InterfaceC0232hnj) this);
        }
    }

    public void setClickListener(ojm ojmVar) {
        this.dse = ojmVar;
    }

    public void setClosedListenerKey(String str) {
        this.fvt = str;
        qor qorVar = this.xad;
        if (qorVar != null) {
            qorVar.hnj(str);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.qor.qor qorVar) {
        hnj hnjVar;
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar != null && (gjvVar instanceof eum) && (hnjVar = (hnj) gjvVar.sk()) != null) {
            hnjVar.setDislikeInner(qorVar);
        }
        qor qorVar2 = this.xad;
        if (qorVar2 != null) {
            qorVar2.hnj(qorVar);
        }
        this.qor = qorVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.f14031sk = pAGExpressAdWrapperListener;
        qor qorVar = this.xad;
        if (qorVar != null) {
            qorVar.hnj(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.sk skVar) {
        if (this.lu != null && getJsObject() != null) {
            getJsObject().hnj(skVar);
        }
        com.bytedance.sdk.openadsdk.core.bug.dkl.gjv gjvVar = this.mkl;
        if (gjvVar != null) {
            gjvVar.hnj(skVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        hnj hnjVar;
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar != null && (gjvVar instanceof eum) && (hnjVar = (hnj) gjvVar.sk()) != null) {
            hnjVar.setDislikeOuter(tTDislikeDialogAbstract);
        }
        qor qorVar = this.xad;
        if (qorVar != null) {
            qorVar.hnj(tTDislikeDialogAbstract);
        }
        this.gjv = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z10) {
        this.wu = z10;
        com.bytedance.sdk.component.adexpress.hn.hn hnVar = this.xyo;
        if (hnVar != null && hnVar.hn() != null) {
            this.xyo.hn().setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) {
            ((com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) gjvVar).setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        try {
            int i12 = Integer.parseInt(String.valueOf(charSequence));
            hn(i12, i10);
            com.bytedance.sdk.openadsdk.core.bug.qor.hn hnVar = this.f14035ul;
            if (hnVar != null) {
                hnVar.hnj(i12);
            }
        } catch (NumberFormatException unused) {
        }
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.gjv.ojm ojmVar) {
        this.f14027jo = ojmVar;
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        Cdo cdo = this.lu;
        if (cdo != null) {
            cdo.hnj(hnVar);
        }
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.orl.dse dseVar) {
        if (this.lu == null || getJsObject() == null) {
            return;
        }
        getJsObject().hnj(dseVar);
    }

    public int sk() {
        return 0;
    }

    public void ta() {
        Cdo cdo = this.lu;
        if (cdo == null || cdo.sk() == null) {
            return;
        }
        this.lu.dkl();
    }

    public void wu() {
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.bug;
        if (asVar == null || (gjvVarFvx = asVar.fvx()) == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
            return;
        }
        gjvVarHnj.sk(getVideoProgress());
    }

    public void xn() {
        if (this.bug == null) {
            return;
        }
        this.tgn = SystemClock.elapsedRealtime();
        if (this.bug.ux()) {
            qor qorVar = this.xad;
            if (qorVar == null) {
                a_(106);
                return;
            } else {
                qorVar.hnj((com.bytedance.sdk.component.adexpress.hn.fc) this);
                this.xad.hnj();
                return;
            }
        }
        this.pty.hnj();
        com.bytedance.sdk.component.adexpress.hn.ta.hnj hnjVar = this.rmr;
        if (hnjVar != null) {
            hnjVar.hnj(this);
        }
        try {
            this.rmr.hnj();
        } catch (Throwable unused) {
        }
    }

    public void dkl(int i10) {
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar == null || !(gjvVar instanceof Cdo)) {
            return;
        }
        ((Cdo) gjvVar).hnj(i10);
        this.fr = i10;
    }

    public void hn(int i10) {
    }

    public void hnj(int i10) {
    }

    protected void qor(JSONObject jSONObject) {
    }

    protected boolean hn(com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
        return true;
    }

    public void hnj(int i10, com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
    }

    public void sk(int i10) {
        if (com.bytedance.sdk.openadsdk.core.model.apu.qor(this.bug)) {
            com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
            if (gjvVar instanceof Cdo) {
                ((Cdo) gjvVar).hn(i10);
            }
        }
    }

    public boolean hn(JSONObject jSONObject) {
        return false;
    }

    public void hnj(int i10, String str) {
    }

    protected com.bytedance.sdk.openadsdk.do.hn.sk.hnj qor(int i10) {
        return new com.bytedance.sdk.openadsdk.do.hn.sk.hnj(i10);
    }

    protected void hnj(com.bytedance.sdk.component.adexpress.hn.orl.hnj hnjVar) {
    }

    protected void hn(int i10, int i11) {
        int iMin;
        if (TextUtils.equals(this.f14032ta, "banner_ad")) {
            return;
        }
        String str = this.f14032ta;
        int i12 = this.as;
        int i13 = ((i11 < i12 || i12 < 0 || !(this.f43do || TextUtils.equals(str, "open_ad"))) && !((i10 == 0 && TextUtils.equals(this.f14032ta, "open_ad")) || sk() == 5)) ? 0 : 1;
        if (i11 <= this.as) {
            com.bytedance.sdk.openadsdk.core.model.as asVar = this.bug;
            if (asVar != null && asVar.pwt() != null) {
                iMin = (int) (Math.min(this.as, this.bug.pwt().e() * ((double) this.bug.pwt().M())) - ((double) i11));
            } else {
                iMin = this.as - i11;
            }
        } else {
            iMin = 0;
        }
        com.bytedance.sdk.component.adexpress.hn.hn hnVar = this.xyo;
        if (hnVar != null && hnVar.hn() != null) {
            this.xyo.hn().setTime(String.valueOf(i10), i13, iMin, false);
        }
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) {
            ((com.bytedance.sdk.openadsdk.core.bug.dkl.gjv) gjvVar).setTime(String.valueOf(i10), i13, iMin, false);
        }
    }

    public void hnj(String str, JSONObject jSONObject) {
    }

    public void hnj(boolean z10, String str) {
    }

    public boolean hnj(JSONObject jSONObject) {
        return false;
    }

    public void hnj(int i10, boolean z10, boolean z11) {
        this.uua = z10;
        removeCallbacks(this.pv);
        removeCallbacks(this.pnz);
        if (i10 == 0) {
            if (z11) {
                this.pnz.run();
                return;
            } else {
                postDelayed(this.pnz, 50L);
                return;
            }
        }
        if (z11) {
            this.pv.run();
        } else {
            postDelayed(this.pv, 50L);
        }
    }

    public void hn(int i10, String str) {
        ua uaVarJip;
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if (gjvVar == null || !(gjvVar instanceof Cdo) || (uaVarJip = ((Cdo) gjvVar).jip()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i10);
            jSONObject.put("flag", str);
            uaVarJip.hnj("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void hnj(View view, int i10, com.bytedance.sdk.component.adexpress.qor qorVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.apu.hnj("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i10));
        if (i10 == -1 || qorVar == null) {
            return;
        }
        HashMap map = new HashMap();
        if (hqh.qor(this.bug)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.jip jipVar = (com.bytedance.sdk.openadsdk.core.model.jip) qorVar;
        if (com.bytedance.sdk.openadsdk.core.model.apu.qor(this.bug)) {
            try {
                JSONObject jSONObject2 = jipVar.orl;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor(th2.toString(), new Object[0]);
            }
        }
        aq aqVar = this.dkl;
        if (aqVar != null) {
            aqVar.gjv(getDynamicShowType());
            this.dkl.hnj(map);
        }
        ojm ojmVar = this.dse;
        if (ojmVar != null) {
            ojmVar.gjv(getDynamicShowType());
            this.dse.hnj(map);
        }
        float f10 = jipVar.hnj;
        float f11 = jipVar.f13975hn;
        float f12 = jipVar.qor;
        float f13 = jipVar.gjv;
        boolean z10 = jipVar.dnm;
        SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray = jipVar.f13977ta;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.f14025gn;
        }
        SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray2 = sparseArray;
        String str = jipVar.dse;
        JSONObject jSONObjectHnj = null;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectHnj = view != this ? hnj(view) : null;
            view2 = view;
        }
        jipVar.aq = i10;
        if (jSONObjectHnj != null && jipVar.ojm == null) {
            jipVar.ojm = jSONObjectHnj;
        }
        if (i10 != 13) {
            switch (i10) {
                case 1:
                    FrameLayout frameLayout = this.orl;
                    if (frameLayout != null) {
                        frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.as asVar = this.bug;
                    if (asVar == null || asVar.dy() != 1 || z10) {
                        ojm ojmVar2 = this.dse;
                        if (ojmVar2 != null) {
                            ojmVar2.hnj(jipVar);
                            this.dse.hnj(str);
                            this.dse.hnj(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f14031sk;
                        if (pAGExpressAdWrapperListener != null && !jipVar.mjg) {
                            pAGExpressAdWrapperListener.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (jipVar.bug > 0) {
                        orp.hnj(true);
                    }
                    aq aqVar2 = this.dkl;
                    if (aqVar2 != null) {
                        aqVar2.hnj(jipVar);
                        this.dkl.hnj(str);
                        if (com.bytedance.sdk.openadsdk.core.model.apu.qor(this.bug) && (jSONObject = jipVar.orl) != null) {
                            this.dkl.gjv(jSONObject.optBoolean("is_ceiling_page", false));
                        }
                        this.dkl.hnj(view2, f10, f11, f12, f13, sparseArray2, z10);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.f14031sk;
                    if (pAGExpressAdWrapperListener2 != null && !jipVar.mjg) {
                        pAGExpressAdWrapperListener2.onAdClicked();
                    }
                    orp.hnj(false);
                    com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.bug, 9);
                    break;
                case 3:
                    TTDislikeDialogAbstract tTDislikeDialogAbstract = this.gjv;
                    if (tTDislikeDialogAbstract != null) {
                        tTDislikeDialogAbstract.show();
                    } else {
                        com.bytedance.sdk.openadsdk.qor.qor qorVar2 = this.qor;
                        if (qorVar2 != null) {
                            qorVar2.hnj();
                        } else {
                            TTDelegateActivity.hnj(this.bug, this.fvt);
                        }
                    }
                    break;
                case 4:
                    FrameLayout frameLayout2 = this.orl;
                    if (frameLayout2 != null) {
                        frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.as asVar2 = this.bug;
                    if (asVar2 == null || asVar2.dy() != 1 || z10) {
                        com.bytedance.sdk.openadsdk.utils.orp.qor(this.bug);
                        if ("embeded_ad".equals(this.f14032ta) && vf() && !this.mjg && com.bytedance.sdk.openadsdk.utils.orp.qor(this.bug)) {
                            aq aqVar3 = this.dkl;
                            if (aqVar3 != null) {
                                aqVar3.hnj(jipVar);
                                this.dkl.hnj(str);
                                this.dkl.hnj(view2, f10, f11, f12, f13, sparseArray2, z10);
                            }
                        } else {
                            ojm ojmVar3 = this.dse;
                            if (ojmVar3 != null) {
                                ojmVar3.hnj(jipVar);
                                this.dse.hnj(str);
                                this.dse.hnj(view2, f10, f11, f12, f13, sparseArray2, z10);
                            }
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.f14031sk;
                        if (pAGExpressAdWrapperListener3 != null && !jipVar.mjg) {
                            pAGExpressAdWrapperListener3.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 5:
                    hnj(!this.wu, "dynamicClick");
                    break;
                case 6:
                    hnj();
                    break;
                case 7:
                    TTWebsiteActivity.hnj(this.ojm, this.bug, this.f14032ta);
                    break;
            }
            return;
        }
        int i11 = jipVar.f13974fc;
        if (i11 >= 0) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("switch", i11);
                hnj(jSONObject4);
            } catch (Throwable unused) {
            }
        }
    }

    public void dnm() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void setTimeUpdate(int i10) {
    }

    public void dse(int i10) {
        com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar = this.f14036vf;
        if ((gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.dse) && i10 == 4) {
            ((com.bytedance.sdk.openadsdk.core.bug.dkl.dse) gjvVar).ta();
        }
    }

    public apu(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        super(context);
        this.hnj = true;
        this.f14026hn = 0;
        this.f14032ta = "embeded_ad";
        this.aq = null;
        this.f14022fc = false;
        this.uua = true;
        this.f14029oj = -1;
        this.f14024gm = "";
        this.wu = false;
        this.sq = true;
        this.as = -1;
        this.tu = new com.bytedance.sdk.openadsdk.gjv.dse();
        this.tgn = 0L;
        this.f14023ff = new AtomicBoolean(false);
        this.f14021cm = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                apu apuVar = apu.this;
                if (apuVar.uua && apuVar.ojm()) {
                    apu.this.xyo();
                    apu apuVar2 = apu.this;
                    apuVar2.removeCallbacks(apuVar2.dzo);
                    apu apuVar3 = apu.this;
                    apuVar3.postDelayed(apuVar3.dzo, 500L);
                }
            }
        };
        this.dzo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.2
            @Override // java.lang.Runnable
            public void run() {
                if (!fvt.hnj(apu.this, 0, 5, false)) {
                    apu.this.dkl(8);
                } else {
                    apu apuVar = apu.this;
                    apuVar.dkl(apuVar.getVisibility());
                }
            }
        };
        this.pnz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.3
            @Override // java.lang.Runnable
            public void run() {
                apu.this.dkl(0);
            }
        };
        this.pv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.apu.4
            @Override // java.lang.Runnable
            public void run() {
                apu.this.dkl(8);
            }
        };
        this.fr = 8;
        this.f14025gn = new SparseArray<>();
        this.dy = -1.0f;
        this.idl = -1.0f;
        this.hkr = -1.0f;
        this.tll = -1.0f;
        this.f14033th = 0L;
        this.f14032ta = str;
        this.ojm = context;
        this.bug = asVar;
        this.dnm = adSlot;
        this.wu = z10;
        this.sq = z11;
        dse();
    }

    public static JSONObject hnj(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put(TtmlNode.LEFT, iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void hnj(com.bytedance.sdk.component.adexpress.hn.gjv<? extends View> gjvVar, com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
        com.bytedance.sdk.openadsdk.core.model.as asVar;
        this.f14023ff.set(true);
        this.f14036vf = gjvVar;
        gjvVar.qor();
        if (this.fr != getWindowVisibility() && aq()) {
            dkl(getWindowVisibility());
        }
        if (gjvVar.qor() == 3 && (asVar = this.bug) != null && asVar.qb() == 1) {
            this.bug.bug(0);
        }
        if (gjvVar.qor() != 1 || (gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.gjv)) {
            View viewSk = gjvVar.sk();
            if (viewSk.getParent() != null) {
                ((ViewGroup) viewSk.getParent()).removeView(viewSk);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                arrayList.add(getChildAt(i10));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof com.bytedance.sdk.component.ojm.dkl) {
                    removeView((View) arrayList.get(i11));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.apu.qor(this.bug)) {
                addView(gjvVar.sk(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(gjvVar.sk());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.as asVar2 = this.bug;
        if (asVar2 != null) {
            com.bytedance.sdk.openadsdk.jip.gjv.hnj(asVar2.ojm(), this.tgn, this.f14032ta, gjvVar.qor());
        }
        com.bytedance.sdk.component.adexpress.hn.ojm ojmVar = this.lhi;
        if (ojmVar != null) {
            ((orl) ojmVar).ta();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f14031sk;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) mjgVar.qor(), (float) mjgVar.gjv());
        }
        if ((this.f14036vf instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.dse) && com.bytedance.sdk.openadsdk.core.model.uua.hnj(this.bug)) {
            m36do();
        }
        if (hn(mjgVar)) {
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this, this.bug, qor(getDynamicShowType()));
        }
        wu wuVar = this.jbd;
        if (wuVar != null) {
            wuVar.hnj(this.bug, this.f14032ta);
        }
    }

    public JSONObject hnj(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (!(this.f14036vf instanceof Cdo)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (asVar != null) {
                if (asVar.zd() != null && asVar.zd().bug()) {
                    jSONObject.put("engine_version", asVar.zd().dnm());
                } else if (asVar.vk() != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
            return jSONObject;
        } catch (Exception e10) {
            e10.getMessage();
            return jSONObject;
        }
    }

    public void hnj(com.bytedance.sdk.component.adexpress.hn.gjv gjvVar) {
        if (this.f14035ul == null) {
            return;
        }
        try {
            if (gjvVar instanceof com.bytedance.sdk.openadsdk.core.bug.dkl.dse) {
                ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.bug.dkl.dse) gjvVar).dkl().dnm();
                this.eum = viewGroup;
                if (viewGroup != null) {
                    this.f14035ul.hn();
                    View viewQor = this.f14035ul.qor();
                    if (viewQor != null) {
                        ViewGroup viewGroup2 = (ViewGroup) viewQor.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewQor);
                        }
                        this.eum.addView(viewQor, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        if (asVar == null) {
            return;
        }
        this.f14032ta = str;
        this.bug = asVar;
        this.dnm = adSlot;
        this.wu = z10;
        this.sq = z11;
        int iRq = asVar.rq();
        this.f14026hn = iRq;
        if (iRq != 10) {
            return;
        }
        this.f14034ua = true;
        dse();
        xn();
        this.f14034ua = false;
    }
}
