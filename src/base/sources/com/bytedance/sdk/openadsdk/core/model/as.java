package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.fvt;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class as {

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private xn f13881ac;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private boolean f13882af;
    private com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aip;
    private hqh ajq;
    private int apu;
    protected int aq;
    private long as;
    private aq atw;
    private int az;
    private boolean azk;

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f13883bf;
    private boolean bgg;
    private JSONObject bpy;
    private mjg bqc;
    private String br;
    private boolean cbn;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private int f13884cm;
    private String cq;
    private String cvc;

    /* JADX INFO: renamed from: da, reason: collision with root package name */
    private String f13885da;

    /* JADX INFO: renamed from: dl, reason: collision with root package name */
    private int f13886dl;
    private Map<String, Object> dlk;
    private String dms;
    private dkl dy;
    private int dzo;
    private boolean exp;
    private int fr;
    private int fvt;
    private gm fzx;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private int f13889gm;
    private int hhw;
    private int hkr;
    private com.bytedance.sdk.openadsdk.core.model.hnj hqh;
    private AdSlot hw;
    private orl idl;

    /* JADX INFO: renamed from: if, reason: not valid java name */
    private JSONObject f42if;

    /* JADX INFO: renamed from: ij, reason: collision with root package name */
    private int f13891ij;
    private int iwu;
    private String izk;

    /* JADX INFO: renamed from: jd, reason: collision with root package name */
    private eum f13892jd;
    private PAGBannerSize jfp;
    private com.bykv.vk.openvk.hnj.hnj.hnj.qor.a jle;

    /* JADX INFO: renamed from: jo, reason: collision with root package name */
    private String f13893jo;

    /* JADX INFO: renamed from: jp, reason: collision with root package name */
    private tgn f13894jp;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private String f13895ka;
    private int kby;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f13896ko;
    private long krm;
    private int ldn;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private String f13897lf;
    private String lhi;

    /* JADX INFO: renamed from: ll, reason: collision with root package name */
    private int f13898ll;
    private String lu;
    private uua lwt;
    private com.bytedance.sdk.openadsdk.core.orl.hnj mdk;
    private String mkl;
    private String mzt;

    /* JADX INFO: renamed from: nl, reason: collision with root package name */
    private vf f13900nl;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.bug.aq.hnj f13901nn;

    /* JADX INFO: renamed from: np, reason: collision with root package name */
    private volatile boolean f13902np;
    private String nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private sk f13903oj;
    protected long ojm;
    private int oq;
    public long orl;
    private nyv ouk;
    private String pty;
    private oj pv;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    private String f13905qb;

    /* JADX INFO: renamed from: qi, reason: collision with root package name */
    private int f13906qi;

    /* JADX INFO: renamed from: qk, reason: collision with root package name */
    private boolean f13907qk;
    private int qou;
    private int qri;
    private fc qs;

    /* JADX INFO: renamed from: rd, reason: collision with root package name */
    private com.bykv.vk.openvk.hnj.hnj.hnj.qor.a f13909rd;
    private String rmr;
    private boolean rw;

    /* JADX INFO: renamed from: sl, reason: collision with root package name */
    private JSONObject f13914sl;
    private String sz;

    /* JADX INFO: renamed from: td, reason: collision with root package name */
    private boolean f13918td;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private String f13919th;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    private String f13920tl;
    private String tll;
    private String tq;
    private Cdo tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private int f13921ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private boolean f13922ul;
    private boolean uua;
    private dse ux;

    /* JADX INFO: renamed from: vb, reason: collision with root package name */
    private int f13923vb;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private String f13924vf;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private int f13925vh;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private hnj f13927vk;
    private long wu;
    private int xad;

    /* JADX INFO: renamed from: xd, reason: collision with root package name */
    private JSONObject f13928xd;

    /* JADX INFO: renamed from: xf, reason: collision with root package name */
    private String f13930xf;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private String f13931xn;
    private boolean xnh;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private oj f13932xo;
    private int xr;
    private boolean xw;
    private String xyb;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private JSONObject f13934yo;
    private String yrd;

    /* JADX INFO: renamed from: zd, reason: collision with root package name */
    private int f13935zd;

    /* JADX INFO: renamed from: zf, reason: collision with root package name */
    private String f13936zf;
    private com.bytedance.sdk.openadsdk.core.bug.aq.hnj zgl;
    private int zyh;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static final String f13880hn = a.a("_", new CharSequence[]{"is", orp.hqh()});
    public static final String qor = a.a("_", new CharSequence[]{"is", orp.hqh(), "sample"});
    public static final String gjv = a.a("_", new CharSequence[]{orp.hqh(), "strategy"});
    protected static int dnm = 330;
    private long jip = 0;
    protected boolean hnj = false;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected boolean f13913sk = com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj;
    protected int dkl = com.bytedance.sdk.openadsdk.p000do.hnj.qor.f14332hn;
    protected String dse = com.bytedance.sdk.openadsdk.p000do.hnj.qor.qor;
    private int eum = 0;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean f41do = false;
    private List<String> tgn = new ArrayList();
    private int xyo = -1;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected int f13916ta = 0;
    private final List<oj> orp = new ArrayList();
    private final List<String> sq = new ArrayList();
    private final List<FilterWord> jbd = new ArrayList();

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private final fvt f13888ff = fvt.qor();
    public boolean bug = false;
    private int pnz = 0;
    private List<String> eta = new ArrayList();
    private List<String> zt = new ArrayList();

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    private String f13890gn = MBridgeConstans.ENDCARD_URL_TYPE_PL;
    private String fzb = "";
    private int znr = 0;
    private int rq = 2;
    private int lko = -1;
    private int meb = 0;
    private int pwt = 0;
    private int mw = 1;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private dnm f13911sg = new dnm();

    /* JADX INFO: renamed from: rg, reason: collision with root package name */
    private int f13910rg = -200;
    private int wxi = 0;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private int f13899mn = 1;

    /* JADX INFO: renamed from: xe, reason: collision with root package name */
    private int f13929xe = 0;
    private int lx = 0;

    /* JADX INFO: renamed from: sh, reason: collision with root package name */
    private int f13912sh = 0;

    /* JADX INFO: renamed from: tb, reason: collision with root package name */
    private int f13917tb = 1;

    /* JADX INFO: renamed from: sp, reason: collision with root package name */
    private int f13915sp = 1;
    private float ett = 100.0f;
    private int pdc = -1;

    /* JADX INFO: renamed from: yl, reason: collision with root package name */
    private int f13933yl = 2;
    private int rx = 1;
    private int jpm = 0;
    private int alw = -1;

    /* JADX INFO: renamed from: zg, reason: collision with root package name */
    private long f13937zg = -1;
    private int tab = 0;
    private int ooh = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: pf, reason: collision with root package name */
    private boolean f13904pf = false;
    private int gkx = 0;
    private int uql = -1;

    /* JADX INFO: renamed from: qm, reason: collision with root package name */
    private long f13908qm = -1;
    private int iz = 50;
    private int bsm = -1;
    private final hn vz = new hn();

    /* JADX INFO: renamed from: vj, reason: collision with root package name */
    private boolean f13926vj = false;
    private com.bytedance.sdk.openadsdk.p000do.hnj.hn mpa = null;
    protected int mjg = -1;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected int f13887fc = -1;
    private float mfh = -1.0f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class hnj {
        private List<Integer> aq;
        private String bug;
        private String dkl;
        private String dnm;
        private String dse;
        private String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private String f13938hn;
        private String hnj;
        private String mjg;
        private String ojm;
        private String orl;
        private String qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private String f13939sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private String f13940ta;

        public static com.bytedance.sdk.openadsdk.core.bug.aq.hnj hn(hnj hnjVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.bug.aq.hnj().hnj(hnjVar.gjv()).hn(hnjVar.mjg()).qor(hnjVar.orl()).gjv(hnjVar.fc()).sk(str);
        }

        public static com.bytedance.sdk.component.adexpress.hnj.qor.gjv hnj(hnj hnjVar, String str) {
            return com.bytedance.sdk.component.adexpress.hnj.qor.gjv.hnj().hnj(hnjVar.gjv()).hn(hnjVar.sk()).qor(hnjVar.dkl()).gjv(hnjVar.dse()).sk(hnjVar.qor()).dkl(str);
        }

        public String aq() {
            return this.f13939sk;
        }

        public boolean bug() {
            return !TextUtils.isEmpty(this.f13940ta) && this.f13940ta.equals("v3");
        }

        public String dkl() {
            return this.qor;
        }

        public String dnm() {
            return this.f13940ta;
        }

        public String dse() {
            return this.gjv;
        }

        public String fc() {
            return this.mjg;
        }

        public String gjv() {
            return this.hnj;
        }

        public String mjg() {
            return this.orl;
        }

        public String ojm() {
            return this.dse;
        }

        public String orl() {
            return this.bug;
        }

        public String qor() {
            return this.dkl;
        }

        public String sk() {
            return this.f13938hn;
        }

        public String ta() {
            return this.dnm;
        }

        public void aq(String str) {
            this.dse = str;
        }

        public void bug(String str) {
            this.orl = str;
        }

        public void dkl(String str) {
            this.gjv = str;
        }

        public void dnm(String str) {
            this.bug = str;
        }

        public void dse(String str) {
            this.f13939sk = str;
        }

        public void gjv(String str) {
            this.f13938hn = str;
        }

        public void ojm(String str) {
            this.dnm = str;
        }

        public void orl(String str) {
            this.mjg = str;
        }

        public void qor(String str) {
            this.hnj = str;
        }

        public void sk(String str) {
            this.qor = str;
        }

        public void ta(String str) {
            this.f13940ta = str;
        }

        public String hn() {
            return this.ojm;
        }

        public void hn(String str) {
            this.dkl = str;
        }

        public List<Integer> hnj() {
            return this.aq;
        }

        public void hnj(List<Integer> list) {
            this.aq = list;
        }

        public void hnj(String str) {
            this.ojm = str;
        }
    }

    public as() {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.model.hnj();
        this.hqh = hnjVar;
        hnjVar.hnj(this);
    }

    public static boolean fr(int i10) {
        return i10 == 44 || i10 == 43 || i10 == 30 || i10 == 40 || i10 == 41 || i10 == 39;
    }

    private com.bytedance.sdk.openadsdk.core.bug.aq.hnj hq() {
        gm gmVarVk = vk();
        if (gmVarVk == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.bug.aq.hnj().hnj(gmVarVk.hnj()).hn(gmVarVk.hn()).qor(gmVarVk.qor()).gjv(gmVarVk.gjv()).sk(atw() + "_v3");
    }

    private com.bytedance.sdk.openadsdk.core.bug.aq.hnj ssa() {
        hnj hnjVarZd = zd();
        if (hnjVarZd == null) {
            return null;
        }
        return hnj.hn(hnjVarZd, String.valueOf(atw()));
    }

    public boolean ac() {
        fc fcVar;
        return qs() && !tl() && (fcVar = this.qs) != null && fcVar.hnj() == 1;
    }

    public int acd() {
        int i10 = this.xyo;
        if (i10 >= 0) {
            return i10;
        }
        return hhw() ? 30 : 5;
    }

    public int af() {
        return this.iwu;
    }

    public int afv() {
        return this.f13887fc;
    }

    public AdSlot aip() {
        return this.hw;
    }

    public boolean aj() {
        xn xnVar;
        AdSlot adSlot = this.hw;
        if (adSlot == null || (xnVar = this.f13881ac) == null) {
            return false;
        }
        return xnVar.hnj(!TextUtils.isEmpty(adSlot.getBidAdm()));
    }

    public JSONObject ajq() {
        return this.f13914sl;
    }

    public JSONObject alw() {
        JSONObject jSONObjectOrl = orl(false);
        JSONObject jSONObjectOj = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().oj(String.valueOf(atw()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObjectOrl);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectOj);
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.qor("MaterialMeta", "toJsonObjPlus", e10.getMessage());
            return jSONObject;
        }
    }

    public boolean apu() {
        return this.f13896ko;
    }

    public String aq() {
        tu tuVarTa;
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarGjv = gjv();
        if (hnjVarGjv == null || (tuVarTa = hnjVarGjv.ta()) == null) {
            return null;
        }
        return tuVarTa.dse();
    }

    public boolean as() {
        return (TextUtils.isEmpty(eum()) || TextUtils.isEmpty(wu())) ? false : true;
    }

    public int atw() {
        JSONObject jSONObjectAzk = azk();
        if (jSONObjectAzk != null) {
            return jSONObjectAzk.optInt("rit", 0);
        }
        return 0;
    }

    public boolean az() {
        return iz() == 1;
    }

    public JSONObject azk() {
        if (this.f13934yo == null) {
            try {
                if (!TextUtils.isEmpty(this.f13893jo)) {
                    this.f13934yo = new JSONObject(this.f13893jo);
                }
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.apu.qor("MaterialMeta", e10.getMessage());
            }
        }
        return this.f13934yo;
    }

    public int bf() {
        int i10 = this.pdc;
        if (i10 >= 0) {
            return i10;
        }
        return 30;
    }

    public boolean bgg() {
        hnj hnjVar = this.f13927vk;
        if (hnjVar != null) {
            return !TextUtils.isEmpty(hnjVar.dnm());
        }
        int i10 = this.pwt;
        return i10 == 9 || i10 == 10;
    }

    public fc bpy() {
        return this.qs;
    }

    public String bqc() {
        return this.mkl;
    }

    public String br() {
        return this.izk;
    }

    public boolean bsm() {
        return iz() == 3 || iz() == 4;
    }

    public boolean btk() {
        Cdo cdo = this.tu;
        return cdo != null && cdo.hnj() > 0;
    }

    public String bug() {
        return this.pty;
    }

    public String cbn() {
        return this.f13936zf;
    }

    public boolean cm() {
        return this.f13918td;
    }

    public String cq() {
        if (!TextUtils.isEmpty(this.mkl)) {
            return this.mkl;
        }
        Context contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj();
        int iRg = rg();
        if (iRg != 2 && iRg != 3) {
            if (iRg == 4) {
                return contextHnj != null ? com.bytedance.sdk.component.utils.wu.hnj(contextHnj, "tt_video_download_apk") : this.mkl;
            }
            if (iRg != 8) {
                return this.mkl;
            }
        }
        return contextHnj != null ? com.bytedance.sdk.component.utils.wu.hnj(contextHnj, "tt_video_mobile_go_detail") : this.mkl;
    }

    public String cvc() {
        return this.f13931xn;
    }

    public boolean da() {
        return qs() || this.f13903oj != null;
    }

    public boolean dkl() {
        tgn tgnVar;
        int iQb = qb();
        if (dzo() && hqh.qor(this) && iQb != 43 && iQb != 44) {
            return false;
        }
        if (!dzo() && fr(iQb) && (tgnVar = this.f13894jp) != null && tgnVar.hnj() == 1) {
            return false;
        }
        boolean z10 = (iQb == 33 || iQb == 5 || iQb == 6 || iQb == 19 || iQb == 12) ? false : true;
        if (qs() || th() == 2 || !z10 || !com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.dkl.hnj(orp.qor(this.alw))) {
            return th() == 2 && z10;
        }
        return true;
    }

    public dnm dl() {
        return this.f13911sg;
    }

    public JSONObject dlk() {
        return this.bpy;
    }

    public uua dms() {
        return this.lwt;
    }

    public boolean dne() {
        return this.f13904pf;
    }

    public String dnm() {
        return this.nyv;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public eum m31do() {
        return this.f13892jd;
    }

    public int dse() {
        return this.fvt;
    }

    public int dy() {
        return this.rx;
    }

    public boolean dzo() {
        return this.azk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && as.class == obj.getClass()) {
            as asVar = (as) obj;
            if (this.f13890gn.equals(asVar.sp()) && this.f13893jo.equals(asVar.ldn())) {
                return true;
            }
        }
        return false;
    }

    public boolean era() {
        return this.f13926vj;
    }

    public void eta() {
        com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVar = this.aip;
        if (aVar == null || TextUtils.isEmpty(aVar.d())) {
            return;
        }
        try {
            if (!this.aip.d().contains("style_id")) {
                this.rw = false;
            } else {
                this.rw = true;
                this.sz = Uri.parse(this.aip.d()).getQueryParameters("style_id").get(0);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor(th2.getMessage(), new Object[0]);
        }
    }

    public String ett() {
        return this.f13919th;
    }

    public String eum() {
        return this.f13885da;
    }

    public com.bykv.vk.openvk.hnj.hnj.hnj.qor.a exp() {
        return this.jle;
    }

    public boolean fc() {
        return this.f13922ul;
    }

    public boolean ff() {
        return this.xnh;
    }

    public int fgi() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarGjv = gjv();
        if (hnjVarGjv != null && hnjVarGjv.ta() != null) {
            return hnjVarGjv.ta().ojm();
        }
        if (aip() != null) {
            strValueOf = aip().getCodeId();
        } else {
            int iAtw = atw();
            strValueOf = iAtw != 0 ? String.valueOf(iAtw) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.oj.gjv().dnm(strValueOf);
        }
        return 30;
    }

    public com.bytedance.sdk.openadsdk.core.bug.aq.hnj fvt() {
        return this.f13901nn;
    }

    public gjv fvx() {
        gjv gjvVarOrl;
        sk skVar = this.f13903oj;
        if (skVar != null) {
            gjvVarOrl = skVar.hn();
        } else {
            com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar = this.mdk;
            gjvVarOrl = hnjVar != null ? hnjVar.orl() : null;
        }
        if (gjvVarOrl != null) {
            gjvVarOrl.hnj(this);
        }
        return gjvVarOrl;
    }

    public boolean fzb() {
        return this.f13929xe == 1;
    }

    public int fzx() {
        return this.f13923vb;
    }

    public com.bytedance.sdk.openadsdk.core.model.hnj gjv() {
        return this.hqh;
    }

    public int gkx() {
        return this.jpm;
    }

    public boolean gm() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectDlk = dlk();
        if (jSONObjectDlk == null || (jSONArrayOptJSONArray = jSONObjectDlk.optJSONArray("tag_ids")) == null) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (jSONArrayOptJSONArray.optInt(i10) == 186) {
                return true;
            }
        }
        return false;
    }

    public hn gmt() {
        return this.vz;
    }

    public int gn() {
        return this.pnz;
    }

    public boolean gyx() {
        return this.bug;
    }

    public boolean hhw() {
        return iz() == 7;
    }

    public boolean hjf() {
        return this.hnj;
    }

    public String hkr() {
        return this.fzb;
    }

    public int hn() {
        dse dseVarZt = zt();
        if (dseVarZt != null) {
            return dseVarZt.hnj();
        }
        return -1;
    }

    public Cdo hnj() {
        return this.tu;
    }

    public String hqh() {
        return this.dms;
    }

    public boolean hw() {
        return this.az == 1;
    }

    public int idl() {
        return this.f13933yl;
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public float m34if() {
        if (this.ett <= 0.0f) {
            this.ett = 100.0f;
        }
        return (this.ett * 1000.0f) / 1000.0f;
    }

    public boolean ij() {
        return !qs() && np() == 1;
    }

    public int iwu() {
        JSONObject jSONObject;
        int i10 = this.ooh;
        return (Integer.MIN_VALUE != i10 || (jSONObject = this.bpy) == null) ? i10 : jSONObject.optInt("click_trigger_type", 0);
    }

    public int iz() {
        if (this.alw < 0) {
            JSONObject jSONObjectAzk = azk();
            if (jSONObjectAzk != null) {
                this.alw = jSONObjectAzk.optInt("ad_slot_type", 0);
            } else {
                this.alw = 0;
            }
        }
        return this.alw;
    }

    public int izk() {
        if (nyv()) {
            return 5;
        }
        return ux() ? 4 : 1;
    }

    public boolean jbd() {
        return this.f13907qk;
    }

    public Map<String, Object> jd() {
        return this.dlk;
    }

    public double jfp() {
        return ojm(azk());
    }

    public boolean jip() {
        return this.exp;
    }

    public int jle() {
        return this.f13910rg;
    }

    public tgn jlw() {
        return this.f13894jp;
    }

    public PAGBannerSize jmr() {
        return this.jfp;
    }

    public int jo() {
        return this.lko;
    }

    public String jp() {
        JSONObject jSONObjectAzk;
        String strOptString = this.f13883bf;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectAzk = azk()) != null) {
            strOptString = jSONObjectAzk.optString("req_id", "");
            gm(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public long jpm() {
        return this.krm;
    }

    public int ka() {
        dse dseVar = this.ux;
        if (dseVar == null) {
            return 2;
        }
        return dseVar.hn();
    }

    public String kby() {
        return this.f13895ka;
    }

    public int kht() {
        int i10 = this.mjg;
        return i10 >= 0 ? i10 : com.bytedance.sdk.openadsdk.core.oj.gjv().xn(String.valueOf(atw()));
    }

    public boolean ko() {
        return rd() == 100 || this.f13884cm == 20;
    }

    public int krm() {
        return this.lx;
    }

    public String ldn() {
        return this.f13893jo;
    }

    public com.bytedance.sdk.component.adexpress.hnj.qor.gjv lf() {
        hnj hnjVarZd = zd();
        if (hnjVarZd == null) {
            return null;
        }
        return hnj.hnj(hnjVarZd, String.valueOf(atw()));
    }

    public hqh lhi() {
        return this.ajq;
    }

    public int lko() {
        return this.mw;
    }

    public boolean ll() {
        return this.bgg;
    }

    public nyv lq() {
        return this.ouk;
    }

    public int ltp() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarGjv = gjv();
        if (hnjVarGjv != null && hnjVarGjv.ta() != null) {
            return hnjVarGjv.ta().ojm();
        }
        if (aip() != null) {
            strValueOf = aip().getCodeId();
        } else {
            int iAtw = atw();
            strValueOf = iAtw != 0 ? String.valueOf(iAtw) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.oj.gjv().xn(strValueOf);
        }
        return 5;
    }

    public int lu() {
        if (this.bsm < 0) {
            try {
                JSONObject jSONObjectAzk = azk();
                if (jSONObjectAzk != null) {
                    this.bsm = jSONObjectAzk.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.bsm = 0;
                }
            } catch (Throwable unused) {
                this.bsm = 0;
            }
        }
        return this.bsm;
    }

    public boolean lwt() {
        if (this.orp.isEmpty()) {
            return false;
        }
        if (this.hkr == 4 && this.orp.size() < 3) {
            return false;
        }
        Iterator<oj> it = this.orp.iterator();
        while (it.hasNext()) {
            if (!it.next().sk()) {
                return false;
            }
        }
        return true;
    }

    public List<oj> lx() {
        return this.orp;
    }

    public JSONObject mdk() {
        return this.f13928xd;
    }

    public String meb() {
        return this.br;
    }

    public void mfh() {
        this.f13888ff.sk();
        dse(false);
    }

    public int mg() {
        return this.eum;
    }

    public boolean mjg() {
        return this.uua;
    }

    public long mkl() {
        dse dseVar = this.ux;
        if (dseVar == null) {
            return 0L;
        }
        return dseVar.qor();
    }

    public oj mn() {
        return this.pv;
    }

    public fvt mpa() {
        return this.f13888ff;
    }

    public List<as> mr() {
        return this.hqh.gjv();
    }

    public String mw() {
        return this.tll;
    }

    public long mxk() {
        return this.as;
    }

    public com.bytedance.sdk.openadsdk.core.orl.hnj mzt() {
        return this.mdk;
    }

    public String nl() {
        dkl dklVarZyh = zyh();
        if (dklVarZyh == null || TextUtils.isEmpty(dklVarZyh.hnj())) {
            return null;
        }
        return dklVarZyh.hnj();
    }

    public boolean nn() {
        return this.f13902np;
    }

    public int np() {
        return this.meb;
    }

    public boolean nyv() {
        List<Integer> listHnj;
        return (zd() == null || (listHnj = zd().hnj()) == null || !listHnj.contains(57)) ? false : true;
    }

    public int oj() {
        return this.f13916ta;
    }

    public long ojm() {
        return this.jip;
    }

    public int ooh() {
        return this.f13935zd;
    }

    public boolean oq() {
        return iz() == 8;
    }

    public int orl() {
        return this.f13889gm;
    }

    public com.bytedance.sdk.openadsdk.core.bug.aq.hnj orp() {
        return this.zgl;
    }

    public List<String> osq() {
        return this.tgn;
    }

    public boolean ouk() {
        return aip() != null && aip().getDurationSlotType() == 8 && ux();
    }

    public orl pdc() {
        return this.idl;
    }

    public com.bytedance.sdk.component.ojm.hn.hnj pf() {
        com.bytedance.sdk.component.ojm.hn.hnj hnjVar = new com.bytedance.sdk.component.ojm.hn.hnj();
        hnjVar.hnj(this.iwu);
        hnjVar.hn(this.f13890gn);
        hnjVar.qor(this.f13919th);
        hnjVar.hnj(ldn());
        return hnjVar;
    }

    public int pnz() {
        return this.iz;
    }

    public long pq() {
        return this.ojm;
    }

    public boolean pty() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectDlk = dlk();
        if (jSONObjectDlk != null && (jSONArrayOptJSONArray = jSONObjectDlk.optJSONArray(PvZsvNiPV.iDXDSL)) != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                if (jSONArrayOptJSONArray.optInt(i10) == 174) {
                    return true;
                }
            }
        }
        return false;
    }

    public String pv() {
        JSONObject jSONObjectAzk;
        if (this.f13930xf == null && (jSONObjectAzk = azk()) != null) {
            this.f13930xf = jSONObjectAzk.optString(BidResponsedEx.KEY_CID, "");
        }
        return this.f13930xf;
    }

    public com.bykv.vk.openvk.hnj.hnj.hnj.qor.a pwt() {
        return this.aip;
    }

    public int qb() {
        return this.f13884cm;
    }

    public int qi() {
        return this.qou;
    }

    public int qk() {
        return this.f13898ll;
    }

    public int qlh() {
        int i10 = this.f13887fc;
        return i10 >= 0 ? i10 : com.bytedance.sdk.openadsdk.core.oj.gjv().ta(String.valueOf(atw()));
    }

    public boolean qm() {
        com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVar = this.aip;
        return aVar == null || aVar.N() != 1;
    }

    public int qor() {
        return this.f13921ua;
    }

    public boolean qou() {
        return iz() == 5;
    }

    public int qri() {
        return this.hkr;
    }

    public boolean qs() {
        int i10 = this.tab;
        return (i10 == 1 || i10 == 3) && mzt() != null;
    }

    public boolean rbd() {
        tgn tgnVar = this.f13894jp;
        if (tgnVar == null || tgnVar.hn() != 1) {
            return false;
        }
        Cdo cdo = this.tu;
        return cdo == null || cdo.hnj() <= 0;
    }

    public int rd() {
        return this.f13886dl;
    }

    public void res() {
        if (!TextUtils.isEmpty(meb())) {
            mjg(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        }
        Map<String, Object> mapJd = jd();
        if (mapJd == null || !mapJd.containsKey(BidResponsed.KEY_PRICE)) {
            return;
        }
        mapJd.put(BidResponsed.KEY_PRICE, MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    public int rg() {
        return this.xad;
    }

    public boolean rmr() {
        if (this.alw <= 0) {
            this.alw = iz();
        }
        int i10 = this.alw;
        return (i10 == 7 || i10 == 8) && !sk(this) && fr() != 21 && this.hhw == 1;
    }

    public int rq() {
        return this.pwt;
    }

    public void rw() {
        this.f13902np = true;
    }

    public String rx() {
        return this.cq;
    }

    public sk sa() {
        return this.f13903oj;
    }

    public String sg() {
        return this.f13905qb;
    }

    public int sgl() {
        Map<String, Object> map = this.dlk;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public String sh() {
        return this.rmr;
    }

    public String sk() {
        int iXf = xf();
        if (iXf == 1) {
            return "banner_ad";
        }
        if (iXf == 3) {
            return "open_ad";
        }
        if (iXf == 5) {
            return PAFNPq.MHKAfZvJK;
        }
        if (iXf != 7) {
            return iXf != 8 ? "unknown" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    public List<String> sl() {
        return this.eta;
    }

    public String sp() {
        return this.f13890gn;
    }

    public int sq() {
        return this.gkx;
    }

    public boolean suj() {
        return this.f41do;
    }

    public boolean sz() {
        return this.f13891ij == 1;
    }

    public int ta() {
        return this.apu;
    }

    public JSONObject tab() {
        return this.f42if;
    }

    public List<String> tb() {
        return this.sq;
    }

    public String td() {
        return this.lhi;
    }

    public xn tgn() {
        return this.f13881ac;
    }

    public int th() {
        int i10 = this.f13884cm;
        if (i10 == 5 || i10 == 6 || i10 == 33) {
            return 1;
        }
        if (ouk()) {
            return 2;
        }
        return this.rq;
    }

    public boolean tl() {
        return this.f13888ff.hnj > 0;
    }

    public int tll() {
        return this.znr;
    }

    public String tm() {
        return this.f13920tl;
    }

    public String tmb() {
        return this.f13924vf;
    }

    public oj tq() {
        return this.f13932xo;
    }

    public aq tu() {
        return this.atw;
    }

    public boolean ua() {
        return this.rw;
    }

    public long ud() {
        Map<String, Object> mapJd = jd();
        if (mapJd == null) {
            return 0L;
        }
        try {
            Object obj = mapJd.get("media_share_price");
            if (obj == null) {
                return 0L;
            }
            return Long.parseLong(obj.toString());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public boolean udr() {
        return this.f13913sk;
    }

    public vf ui() {
        return this.f13900nl;
    }

    public String ul() {
        return this.sz;
    }

    public int uql() {
        return this.fr;
    }

    public long uua() {
        return this.f13908qm;
    }

    public boolean ux() {
        return this.tab == 2;
    }

    public String uy() {
        return this.dse;
    }

    public int vb() {
        return this.qri;
    }

    public String vf() {
        return this.xyb;
    }

    public int vh() {
        if (qs()) {
            return 5;
        }
        if (m34if() != 100.0f || th() == 2) {
            return 0;
        }
        return this.wxi;
    }

    public boolean vj() {
        int i10 = this.f13884cm;
        return (i10 == 2 || i10 == 1) && 3 == this.xad;
    }

    public gm vk() {
        return this.fzx;
    }

    public int vv() {
        return this.dkl;
    }

    public int vz() {
        return this.tab;
    }

    public String wu() {
        return this.mzt;
    }

    public float wxh() {
        float f10 = this.mfh;
        if (f10 > 0.0f) {
            return f10;
        }
        gm gmVar = this.fzx;
        if (gmVar != null) {
            String strGjv = gmVar.gjv();
            if (TextUtils.isEmpty(strGjv)) {
                strGjv = com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj("adv3", this.fzx.hnj(), this.fzx.hn());
            }
            if (strGjv != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(strGjv).optJSONObject(TtmlNode.TAG_BODY);
                    if (jSONObjectOptJSONObject != null) {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("ratio");
                        this.mfh = fOptDouble;
                        return fOptDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.mfh = 0.0f;
        return 0.0f;
    }

    public boolean wxi() {
        return this.oq == 1;
    }

    public int xad() {
        try {
            JSONObject jSONObjectAzk = azk();
            if (jSONObjectAzk != null) {
                return jSONObjectAzk.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public List<String> xd() {
        return this.zt;
    }

    public String xe() {
        return this.lu;
    }

    public int xf() {
        return this.alw;
    }

    public com.bytedance.sdk.openadsdk.p000do.hnj.hn xht() {
        return this.mpa;
    }

    public boolean xj() {
        int i10 = this.dzo;
        return i10 == 44 || i10 == 43;
    }

    public boolean xn() {
        return this.xw;
    }

    public com.bykv.vk.openvk.hnj.hnj.hnj.qor.a xnh() {
        return this.f13909rd;
    }

    public String xo() {
        return this.yrd;
    }

    public int xr() {
        return this.ldn;
    }

    public String xw() {
        return this.f13897lf;
    }

    public int xyb() {
        JSONObject jSONObject = this.f42if;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public boolean xyo() {
        return this.cbn;
    }

    public long yg() {
        return this.wu;
    }

    public List<FilterWord> yl() {
        return this.jbd;
    }

    public int yo() {
        mjg mjgVar = this.bqc;
        if (mjgVar == null) {
            return 0;
        }
        return mjgVar.hnj();
    }

    public long yrd() {
        if (this.f13937zg < 0) {
            JSONObject jSONObjectAzk = azk();
            if (jSONObjectAzk != null) {
                this.f13937zg = jSONObjectAzk.optLong("ad_id", 0L);
            } else {
                this.f13937zg = 0L;
            }
        }
        return this.f13937zg;
    }

    public boolean za() {
        return true;
    }

    public hnj zd() {
        return this.f13927vk;
    }

    public int zf() {
        if (this.f13915sp != 2) {
            this.f13915sp = 1;
        }
        return this.f13915sp;
    }

    public int zg() {
        return this.zyh;
    }

    public int zgl() {
        return this.xr;
    }

    public int znr() {
        return this.f13912sh;
    }

    public int zod() {
        return this.aq;
    }

    public dse zt() {
        return this.ux;
    }

    public long zxr() {
        return this.orl;
    }

    public dkl zyh() {
        return this.dy;
    }

    public static boolean gjv(as asVar) {
        return (asVar == null || asVar.pwt() == null || asVar.pwt().s() != 1) ? false : true;
    }

    private static double ojm(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    private String sq(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.jip.hnj(str);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("MaterialMeta", "generate icon key error", th2.getMessage());
            return null;
        }
    }

    public void apu(int i10) {
        this.lx = i10;
    }

    public void as(int i10) {
        this.f13906qi = i10;
    }

    public void bug(int i10) {
        this.f13884cm = i10;
    }

    public void cm(int i10) {
        this.qri = i10;
    }

    public void dnm(boolean z10) {
        this.azk = z10;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m32do(int i10) {
        this.f13910rg = i10;
    }

    public void dse(String str) {
        this.f13885da = str;
    }

    public void dzo(int i10) {
        this.f13891ij = i10;
    }

    public void eum(int i10) {
        this.f13899mn = i10;
    }

    public void fc(int i10) {
        this.rq = i10;
    }

    public void ff(int i10) {
        this.xyo = i10;
    }

    public int fr() {
        return this.dzo;
    }

    public void fvt(int i10) {
        this.f13915sp = i10;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        if (hnjVar != null) {
            this.hqh = hnjVar;
        }
    }

    public void hqh(int i10) {
        this.oq = i10;
    }

    public void jbd(int i10) {
        this.pdc = i10;
    }

    public void jip(int i10) {
        this.f13929xe = i10;
    }

    public void ka(int i10) {
        this.aq = i10;
    }

    public void lhi(int i10) {
        this.f13887fc = i10;
    }

    public void mjg(int i10) {
        this.lko = i10;
    }

    public void mkl(int i10) {
        this.mjg = i10;
    }

    public void oj(int i10) {
        this.pwt = i10;
    }

    public void orl(int i10) {
        this.znr = i10;
    }

    public void orp(int i10) {
        this.meb = i10;
    }

    public void pnz(int i10) {
        this.xr = Math.max(0, i10);
    }

    public void qb(int i10) {
        this.eum = i10;
    }

    public void qor(int i10) {
        this.apu = i10;
    }

    public void ta(String str) {
        this.dms = str;
    }

    public void tgn(int i10) {
        this.kby = i10;
    }

    public void tu(int i10) {
        this.f13917tb = i10;
    }

    public void ua(int i10) {
        this.f13925vh = i10;
    }

    public void ul(int i10) {
        this.hkr = i10;
    }

    public void uua(int i10) {
        this.f13912sh = i10;
    }

    public void vf(int i10) {
        this.iwu = i10;
    }

    public void wu(int i10) {
        this.wxi = i10;
    }

    public void xn(int i10) {
        this.mw = i10;
    }

    public void xo(int i10) {
        this.f13935zd = i10;
    }

    public void xyo(int i10) {
        this.f13886dl = i10;
    }

    public void zt(int i10) {
        this.tab = i10;
    }

    public static boolean qor(as asVar) {
        return (asVar == null || asVar.pwt() == null || asVar.pwt().m() != 7 || hqh.hn(asVar)) ? false : true;
    }

    public void apu(String str) {
        this.f13895ka = str;
    }

    public void as(String str) {
        this.f13890gn = str;
    }

    public void bug(String str) {
        this.fzb = str;
    }

    public void dnm(String str) {
        this.yrd = str;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m33do(String str) {
        this.f13919th = str;
    }

    public void dse(boolean z10) {
        this.cbn = z10;
    }

    public void eum(String str) {
        this.izk = str;
    }

    public void fc(String str) {
        this.f13897lf = str;
    }

    public void fvt(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.tgn.add(str);
    }

    public void hn(int i10) {
        this.fvt = i10;
    }

    public void hnj(int i10) {
        this.f13921ua = i10;
    }

    public void hqh(String str) {
        this.f13936zf = str;
    }

    public void izk(int i10) {
        if (i10 < 0 || i10 > 30) {
            i10 = 6;
        }
        this.dkl = i10;
    }

    public void jip(String str) {
        this.tll = str;
    }

    public void mjg(String str) {
        this.br = str;
    }

    public void oj(String str) {
        this.lu = str;
    }

    public void ojm(String str) {
        this.xyb = str;
    }

    public void orl(String str) {
        this.cvc = str;
    }

    public void orp(String str) {
        this.f13924vf = str;
    }

    public void ta(boolean z10) {
        this.f13918td = z10;
    }

    public void tgn(String str) {
        this.f13893jo = str;
    }

    public void tu(String str) {
        this.f13931xn = str;
    }

    public void ua(String str) {
        if (TextUtils.isEmpty(str)) {
            this.dse = com.bytedance.sdk.openadsdk.p000do.hnj.qor.qor;
        } else {
            this.dse = str;
        }
    }

    public void ul(String str) {
        this.f13920tl = str;
    }

    public void uua(String str) {
        this.f13905qb = str;
    }

    public void vf(String str) {
        this.tq = str;
    }

    public void wu(String str) {
        this.mkl = str;
    }

    public void xad(int i10) {
        this.ldn = i10;
    }

    public void xn(String str) {
        this.rmr = str;
    }

    public void xyo(String str) {
        this.cq = str;
    }

    private static long aq(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static int gjv(String str) {
        return hnj(qor(str));
    }

    public static boolean hn(as asVar) {
        return (hnj(asVar) || qor(asVar)) ? false : true;
    }

    public static JSONObject qor(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.qor("MaterialMeta", e10.getMessage());
            return null;
        }
    }

    public void bug(boolean z10) {
        this.bgg = z10;
    }

    public void dnm(int i10) {
        this.pnz = i10;
    }

    public void dse(int i10) {
        this.gkx = i10;
    }

    public void fc(boolean z10) {
        this.f13904pf = z10;
    }

    public void hnj(long j10) {
        this.jip = j10;
    }

    public void jip(boolean z10) {
        this.hnj = z10;
    }

    public void mjg(boolean z10) {
        this.bug = z10;
    }

    public void nyv(int i10) {
        this.xad = i10;
    }

    public void oj(boolean z10) {
        this.f13913sk = z10;
    }

    public void ojm(boolean z10) {
        this.xnh = z10;
    }

    public JSONObject orl(boolean z10) {
        try {
            String strTm = tm();
            if (TextUtils.isEmpty(strTm)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            if (z10) {
                jSONObject.put("raw_response_info", strTm);
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(strTm).optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null && qor() >= 0 && qor() < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(qor());
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectOptJSONObject.get(next));
                    }
                }
                AdSlot adSlotAip = aip();
                if (adSlotAip != null) {
                    jSONObject.put("adslot", adSlotAip.toJsonObj());
                }
                if (!TextUtils.isEmpty(this.xyb)) {
                    jSONObject.put("gdid_encrypted", this.xyb);
                }
                jSONObject.put("hasReportShow", this.f13918td);
                jSONObject.put("isMrcReportFinish", this.f13902np);
                return jSONObject;
            }
            return null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.hnj("MaterialMeta", "toJsonObj error", e10);
            return null;
        }
    }

    public void ta(int i10) {
        hnj(i10, -1);
    }

    public void uua(boolean z10) {
        this.f13926vj = z10;
    }

    public void xn(boolean z10) {
        this.f41do = z10;
    }

    public static double hn(String str) {
        return ojm(qor(str));
    }

    public static boolean hnj(as asVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (hnj(asVar) || z13 || asVar == null || asVar.pwt() == null || TextUtils.isEmpty(asVar.pwt().d())) {
            return false;
        }
        if (qor(asVar)) {
            return z12;
        }
        return (asVar.pwt() == null || asVar.pwt().s() != 1) ? z10 : z11;
    }

    public void aq(String str) {
        this.mzt = str;
    }

    public void dse(JSONObject jSONObject) {
        this.vz.hnj(jSONObject);
    }

    public void gjv(int i10) {
        this.f13889gm = i10;
    }

    public void gm(int i10) {
        this.qou = i10;
    }

    public void nyv(String str) {
        this.lhi = str;
    }

    public void ojm(int i10) {
        this.hhw = i10;
    }

    public void pty(int i10) {
        this.az = i10;
    }

    public void pv(int i10) {
        this.f13923vb = i10;
    }

    public void sq(int i10) {
        this.zyh = i10;
    }

    public void aq(boolean z10) {
        this.f13907qk = z10;
    }

    public void dse(long j10) {
        this.as = j10;
    }

    public void gjv(boolean z10) {
        this.xw = z10;
    }

    public void gm(String str) {
        this.f13883bf = str;
    }

    public String pty(String str) {
        JSONObject jSONObjectAzk = azk();
        return jSONObjectAzk != null ? jSONObjectAzk.optString("rit", str) : str;
    }

    public void rmr(int i10) {
        this.f13898ll = i10;
    }

    public static boolean dkl(as asVar) {
        Object obj;
        if (asVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapJd = asVar.jd();
            return (mapJd == null || (obj = mapJd.get(TTAdConstant.SDK_BIDDING_TYPE)) == null || 2 != Integer.parseInt(obj.toString())) ? false : true;
        } catch (Throwable th2) {
            th2.getMessage();
            return false;
        }
    }

    public static String hn(Context context, as asVar) {
        if (context != null && asVar != null) {
            try {
                if (asVar.rg() != 8) {
                    if (asVar.tu().hnj()) {
                    }
                }
                String strHnj = com.bytedance.sdk.openadsdk.core.hnj.hnj.hnj(context);
                if (TextUtils.isEmpty(strHnj)) {
                    return null;
                }
                return strHnj;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor("MaterialMeta", th2.getMessage());
            }
        }
        return null;
    }

    public void aq(int i10) {
        this.iz = i10;
    }

    public void gjv(JSONObject jSONObject) {
        this.f13928xd = jSONObject;
    }

    public void lu(int i10) {
        this.jpm = i10;
    }

    public void qor(boolean z10) {
        this.exp = z10;
    }

    public static boolean sk(as asVar) {
        if (asVar == null) {
            return false;
        }
        int iQri = asVar.qri();
        return asVar.qs() || iQri == 5 || iQri == 15 || iQri == 50;
    }

    public void eta(int i10) {
        this.fr = i10;
    }

    public void gjv(long j10) {
        this.orl = j10;
    }

    public void qor(oj ojVar) {
        PAGBannerSize pAGBannerSizeJmr = jmr();
        if (pAGBannerSizeJmr != null && pAGBannerSizeJmr.getWidth() > 0 && pAGBannerSizeJmr.getHeight() > 0) {
            hnj(ojVar, sq.hn(com.bytedance.sdk.openadsdk.core.oj.hnj(), pAGBannerSizeJmr.getWidth()), sq.hn(com.bytedance.sdk.openadsdk.core.oj.hnj(), pAGBannerSizeJmr.getHeight()));
        }
        this.orp.add(ojVar);
    }

    public static boolean hnj(as asVar) {
        return (asVar == null || asVar.pwt() == null || asVar.pwt().m() != 1) ? false : true;
    }

    public static com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnj(String str, as asVar) {
        asVar.lu(0);
        int iIz = asVar.iz();
        int i10 = 3;
        if (iIz == 3) {
            i10 = 4;
        } else if (iIz == 7) {
            i10 = 1;
        } else if (iIz == 8) {
            i10 = 2;
        }
        com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVar = new com.bytedance.sdk.openadsdk.core.mjg.hnj.hn(str, asVar.xnh(), asVar.exp(), asVar.gkx(), asVar.qk(), i10);
        hnVar.hnj(com.bytedance.sdk.openadsdk.as.sk.hnj("video_error_conf", 0));
        hnVar.qor(o6.a.e(hnVar.jip()));
        return hnVar;
    }

    public void sk(String str) {
        this.nyv = str;
    }

    public void dkl(String str) {
        this.pty = str;
    }

    public void hn(boolean z10) {
        this.f13922ul = z10;
    }

    public void sk(int i10) {
        this.uql = i10;
    }

    public void dkl(int i10) {
        this.f13916ta = i10;
    }

    public void hn(long j10) {
        this.f13908qm = j10;
    }

    public void sk(boolean z10) {
        this.f13896ko = z10;
    }

    public void dkl(boolean z10) {
        this.f13882af = z10;
    }

    public void hn(com.bytedance.sdk.openadsdk.core.bug.aq.hnj hnjVar) {
        this.zgl = hnjVar;
        com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj(hnjVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public void sk(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.xad = 4;
        this.f13890gn = jSONObject.optString("id");
        this.tll = jSONObject.optString("source");
        dkl dklVar = new dkl();
        this.dy = dklVar;
        dklVar.qor(jSONObject.optString("pkg_name"));
        this.dy.hn(jSONObject.optString("name"));
        this.dy.hnj(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    public void dkl(JSONObject jSONObject) {
        this.f42if = jSONObject;
    }

    public void qor(long j10) {
        this.krm = j10;
    }

    public static long hnj(String str) {
        return aq(qor(str));
    }

    public void dkl(long j10) {
        this.wu = j10;
    }

    public void hn(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.f13933yl = 2;
        } else {
            this.f13933yl = (int) d10;
        }
    }

    public void qor(JSONObject jSONObject) {
        this.f13914sl = jSONObject;
    }

    public void qor(com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVar) {
        this.jle = aVar;
    }

    public static int hnj(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public void hn(JSONObject jSONObject) {
        this.bpy = jSONObject;
    }

    public static String hnj(Context context, as asVar) {
        if (context == null || asVar == null || !((asVar.iz() == 8 || asVar.iz() == 7) && asVar.ko())) {
            return null;
        }
        String strHn = hn(context, asVar);
        if (TextUtils.isEmpty(strHn) || com.bytedance.sdk.openadsdk.core.hnj.hnj.hnj() != 1) {
            return null;
        }
        return strHn;
    }

    public void hn(oj ojVar) {
        this.f13932xo = ojVar;
    }

    public void hn(com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVar) {
        this.f13909rd = aVar;
    }

    public static void hn(as asVar, JSONObject jSONObject) throws JSONException {
        dkl dklVarZyh = asVar.zyh();
        if (dklVarZyh != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_name", dklVarZyh.hn());
            jSONObject2.put(CampaignEx.JSON_KEY_PACKAGE_NAME, dklVarZyh.qor());
            jSONObject2.put(DownloadModel.DOWNLOAD_URL, dklVarZyh.hnj());
            jSONObject2.put("score", dklVarZyh.gjv());
            jSONObject2.put("comment_num", dklVarZyh.sk());
            jSONObject2.put(CampaignEx.JSON_KEY_APP_SIZE, dklVarZyh.dkl());
            jSONObject2.put("app_category", dklVarZyh.dse());
            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject2);
        }
    }

    public void sk(long j10) {
        this.ojm = j10;
    }

    public void hnj(boolean z10) {
        this.uua = z10;
    }

    public void hnj(aq aqVar) {
        this.atw = aqVar;
    }

    public void hnj(eum eumVar) {
        this.f13892jd = eumVar;
    }

    public void hnj(xn xnVar) {
        this.f13881ac = xnVar;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.bug.aq.hnj hnjVar) {
        this.f13901nn = hnjVar;
        com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj(hnjVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public void hnj(dse dseVar) {
        this.ux = dseVar;
    }

    public void hnj(hqh hqhVar) {
        this.ajq = hqhVar;
    }

    public void hnj(int i10, int i11) {
        this.dzo = i10;
        this.f13884cm = i10;
        if (this.hw == null) {
            this.f13884cm = 0;
            return;
        }
        if (i11 <= 0) {
            i11 = iz();
        }
        if (this.hw.getDurationSlotType() != 3 && i11 != 3) {
            if (this.hw.getDurationSlotType() != 7 && this.hw.getDurationSlotType() != 8 && i11 != 7 && i11 != 8) {
                if (!this.azk && hqh.hn(this)) {
                    this.f13884cm = 4;
                    return;
                }
                if (this.dzo == 4 && !hqh.hn(this)) {
                    this.f13884cm = 0;
                }
                int i12 = this.dzo;
                if (i12 == 41) {
                    this.f13884cm = 41;
                    return;
                }
                if (i10 >= 5) {
                    this.f13884cm = 0;
                    return;
                }
                if (i12 == 2 && rg() != 3) {
                    this.f13884cm = 0;
                    return;
                } else {
                    if (i10 == 0 || (i10 == 1 && rg() != 3)) {
                        this.f13884cm = 0;
                        return;
                    }
                    return;
                }
            }
            if (!this.azk) {
                if (hqh.qor(this)) {
                    this.f13884cm = 12;
                    return;
                } else if (hqh.hn(this)) {
                    this.f13884cm = 9;
                    return;
                }
            }
            if (this.dzo == 5 && !apu.gjv(this)) {
                this.f13884cm = 7;
            }
            if (this.dzo == 6 && !apu.hn(this)) {
                this.f13884cm = 7;
            }
            if (this.dzo == 8 && rd() != 100) {
                this.f13884cm = 7;
            }
            if (this.dzo == 19 && TextUtils.isEmpty(this.lu)) {
                this.f13884cm = 7;
            }
            if (this.dzo == 20 && TextUtils.isEmpty(this.lu)) {
                this.f13884cm = 7;
            }
            if (this.dzo == 38 && !apu.qor(this)) {
                this.f13884cm = 7;
            }
            if (i10 < 5) {
                this.f13884cm = 7;
                return;
            }
            return;
        }
        this.f13884cm = 14;
    }

    public void hnj(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.rx = 1;
        } else {
            this.rx = (int) d10;
        }
    }

    public void hnj(dnm dnmVar) {
        this.f13911sg = dnmVar;
    }

    public void hnj(AdSlot adSlot) {
        this.hw = adSlot;
    }

    public void hnj(hnj hnjVar) {
        this.f13927vk = hnjVar;
        com.bytedance.sdk.component.adexpress.hnj.qor.gjv gjvVarLf = lf();
        if (gjvVarLf != null && !bgg()) {
            com.bytedance.sdk.component.adexpress.hnj.hn.hn.hnj(gjvVarLf);
        }
        if (hnjVar == null || TextUtils.isEmpty(hnjVar.orl())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj(ssa(), "ad");
    }

    public void hnj(gm gmVar) {
        this.fzx = gmVar;
        if (gmVar == null || TextUtils.isEmpty(gmVar.qor())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj(hq(), "adv3");
    }

    public void hnj(com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVar) {
        this.aip = aVar;
    }

    public void hnj(mjg mjgVar) {
        this.bqc = mjgVar;
    }

    public void hnj(oj ojVar) {
        hnj(ojVar, dnm);
        String strSq = sq(ojVar.hnj());
        if (!TextUtils.isEmpty(strSq)) {
            ojVar.hn(strSq);
        }
        this.pv = ojVar;
    }

    private void hnj(oj ojVar, int i10) {
        if (ojVar != null) {
            try {
                if (TextUtils.isEmpty(ojVar.hnj())) {
                    return;
                }
                if (ojVar.hn() == 0 && ojVar.qor() == 0) {
                    ojVar.hnj(i10);
                    ojVar.hn(i10);
                    return;
                }
                if (ojVar.hn() == 0) {
                    if (ojVar.qor() > i10) {
                        ojVar.hn(i10);
                        ojVar.hnj(i10);
                        return;
                    } else {
                        ojVar.hnj(ojVar.qor());
                        return;
                    }
                }
                if (ojVar.qor() == 0) {
                    if (ojVar.hn() > i10) {
                        ojVar.hn(i10);
                        ojVar.hnj(i10);
                        return;
                    } else {
                        ojVar.hn(ojVar.hn());
                        return;
                    }
                }
                if (ojVar.hn() > ojVar.qor()) {
                    if (ojVar.hn() > i10) {
                        ojVar.hn((int) (i10 / (ojVar.hn() / ojVar.qor())));
                        ojVar.hnj(i10);
                        return;
                    }
                    return;
                }
                if (ojVar.qor() > i10) {
                    ojVar.hnj((int) (i10 * (ojVar.hn() / ojVar.qor())));
                    ojVar.hn(i10);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void hnj(oj ojVar, int i10, int i11) {
        try {
            if (ojVar.qor() >= i11) {
                ojVar.hnj((int) ((ojVar.hn() / ojVar.qor()) * i11));
                ojVar.hn(i11);
            } else if (ojVar.hn() >= i10) {
                ojVar.hnj((int) ((i10 / i11) * ojVar.qor()));
            }
        } catch (Throwable unused) {
        }
    }

    public void hnj(dkl dklVar) {
        this.dy = dklVar;
    }

    public void hnj(orl orlVar) {
        this.idl = orlVar;
    }

    public void hnj(FilterWord filterWord) {
        this.jbd.add(filterWord);
    }

    public void hnj(Map<String, Object> map) {
        this.dlk = map;
    }

    public void hnj(float f10) {
        this.ett = f10;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar) {
        this.mdk = hnjVar;
    }

    public void hnj(uua uuaVar) {
        this.lwt = uuaVar;
    }

    public void hnj(fc fcVar) {
        this.qs = fcVar;
    }

    public void hnj(vf vfVar) {
        this.f13900nl = vfVar;
    }

    public void hnj(PAGBannerSize pAGBannerSize) {
        this.jfp = pAGBannerSize;
    }

    public void hnj(tgn tgnVar) {
        this.f13894jp = tgnVar;
    }

    public void hnj(com.bytedance.sdk.openadsdk.p000do.hnj.hn hnVar) {
        this.mpa = hnVar;
    }

    public void hnj(nyv nyvVar) {
        this.ouk = nyvVar;
    }

    public void hnj(sk skVar) {
        this.f13903oj = skVar;
    }

    public void hnj(Cdo cdo) {
        this.tu = cdo;
    }

    public static void hnj(as asVar, JSONObject jSONObject) throws JSONException {
        List<oj> listLx = asVar.lx();
        if (listLx != null) {
            JSONArray jSONArray = new JSONArray();
            for (oj ojVar : listLx) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", ojVar.hnj());
                jSONObject2.put("height", ojVar.qor());
                jSONObject2.put("width", ojVar.hn());
                jSONObject2.put("image_preview", ojVar.dkl());
                jSONObject2.put("image_key", ojVar.dse());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }
}
