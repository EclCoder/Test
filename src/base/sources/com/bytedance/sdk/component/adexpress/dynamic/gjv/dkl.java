package com.bytedance.sdk.component.adexpress.dynamic.gjv;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.Wz.OGoz;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class dkl {

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private int f12563af;
    private int aip;
    private String apu;
    private float aq;
    private String as;
    private double bgg;
    private String bqc;
    private long br = -1;
    private double bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private double f12564cm;
    private String cq;
    private float dkl;

    /* JADX INFO: renamed from: dl, reason: collision with root package name */
    private int f12565dl;
    private JSONObject dlk;
    private double dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private String f11do;
    private float dse;
    private int dy;
    private int dzo;
    private boolean eta;
    private String eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private String f12566fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private int f12567ff;
    private boolean fr;
    private boolean fvt;
    private String fzb;
    private float gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private String f12568gm;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    private int f12569gn;
    private int hkr;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12570hn;
    private float hnj;
    private double hqh;
    private int hw;
    private int idl;
    private JSONObject iwu;
    private boolean izk;
    private int jbd;
    private String jip;
    private int jle;

    /* JADX INFO: renamed from: jo, reason: collision with root package name */
    private String f12571jo;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private boolean f12572ka;
    private String kby;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f12573ko;
    private List<hnj> krm;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private String f12574lf;
    private JSONObject lhi;
    private int lko;
    private int lu;
    private boolean lx;
    private int meb;
    private String mjg;
    private String mkl;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private int f12575mn;
    private int mw;
    private String nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private String f12576oj;
    private float ojm;
    private String orl;
    private int orp;
    private boolean pnz;
    private String pty;
    private int pv;
    private JSONObject pwt;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    private int f12577qb;

    /* JADX INFO: renamed from: qi, reason: collision with root package name */
    private String f12578qi;
    private float qor;

    /* JADX INFO: renamed from: rd, reason: collision with root package name */
    private boolean f12579rd;

    /* JADX INFO: renamed from: rg, reason: collision with root package name */
    private int f12580rg;
    private String rmr;
    private int rq;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private int f12581sg;

    /* JADX INFO: renamed from: sh, reason: collision with root package name */
    private int f12582sh;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12583sk;

    /* JADX INFO: renamed from: sl, reason: collision with root package name */
    private int f12584sl;
    private int sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private float f12585ta;

    /* JADX INFO: renamed from: tb, reason: collision with root package name */
    private String f12586tb;
    private int tgn;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private int f12587th;
    private int tll;
    private boolean tq;
    private boolean tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private String f12588ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private String f12589ul;
    private String uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private double f12590vf;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private int f12591vh;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private int f12592vk;
    private String wu;
    private int wxi;
    private int xad;

    /* JADX INFO: renamed from: xd, reason: collision with root package name */
    private int f12593xd;

    /* JADX INFO: renamed from: xe, reason: collision with root package name */
    private String f12594xe;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private String f12595xn;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private boolean f12596xo;
    private boolean xw;
    private int xyo;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private boolean f12597yo;

    /* JADX INFO: renamed from: zd, reason: collision with root package name */
    private boolean f12598zd;
    private boolean znr;
    private boolean zt;

    public static dkl hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        dkl dklVar = new dkl();
        dklVar.hn(jSONObject.optString("adType", "embeded"));
        dklVar.fc(jSONObject.optString("clickArea", "creative"));
        dklVar.jip(jSONObject.optString("clickTigger", CampaignEx.JSON_NATIVE_VIDEO_CLICK));
        dklVar.qor(jSONObject.optString(TtmlNode.ATTR_TTS_FONT_FAMILY, "PingFangSC"));
        dklVar.gjv(jSONObject.optString(TtmlNode.ATTR_TTS_TEXT_ALIGN, TtmlNode.LEFT));
        dklVar.sk(jSONObject.optString(TtmlNode.ATTR_TTS_COLOR, "#999999"));
        dklVar.dkl(jSONObject.optString("bgColor", "transparent"));
        dklVar.dse(jSONObject.optString("bgImgUrl", ""));
        dklVar.xyo(jSONObject.optString("bgImgData", ""));
        dklVar.aq(jSONObject.optString("borderColor", "#000000"));
        dklVar.ojm(jSONObject.optString("borderStyle", "solid"));
        dklVar.ta(jSONObject.optString("heightMode", "auto"));
        dklVar.dnm(jSONObject.optString("widthMode", "fixed"));
        dklVar.bug(jSONObject.optString("interactText", ""));
        dklVar.qor(jSONObject.optBoolean("isShowBgControl", false));
        dklVar.orl(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            dklVar.dse(jSONObjectOptJSONObject.optInt("translateY", 0));
            dklVar.aq(jSONObjectOptJSONObject.optInt("translateX", 0));
            dklVar.gjv(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            dklVar.sk(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        dklVar.mjg(jSONObject.optString("interactType", ""));
        dklVar.sk(jSONObject.optInt("interactSlideDirection", -1));
        dklVar.uua(jSONObject.optString("justifyHorizontal", "space-around"));
        dklVar.oj(jSONObject.optString("justifyVertical", "flex-start"));
        dklVar.hn(jSONObject.optDouble("timingStart"));
        dklVar.qor(jSONObject.optDouble("timingEnd"));
        dklVar.gjv((float) jSONObject.optDouble("width", 0.0d));
        dklVar.qor((float) jSONObject.optDouble("height", 0.0d));
        dklVar.hnj((float) jSONObject.optDouble("borderRadius", 0.0d));
        dklVar.hn((float) jSONObject.optDouble("borderSize", 0.0d));
        dklVar.hn(jSONObject.optBoolean("interactValidate", false));
        dklVar.ojm((float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, 0.0d));
        dklVar.sk((float) jSONObject.optDouble("paddingBottom", 0.0d));
        dklVar.dkl((float) jSONObject.optDouble("paddingLeft", 0.0d));
        dklVar.dse((float) jSONObject.optDouble("paddingRight", 0.0d));
        dklVar.aq((float) jSONObject.optDouble("paddingTop", 0.0d));
        dklVar.gjv(jSONObject.optBoolean("lineFeed", false));
        dklVar.ojm(jSONObject.optInt("lineCount", 0));
        dklVar.dkl(jSONObject.optDouble("lineHeight", 1.2d));
        dklVar.mjg(jSONObject.optInt("letterSpacing", 0));
        dklVar.sk(jSONObject.optBoolean("isDataFixed", false));
        dklVar.fc(jSONObject.optInt(TtmlNode.ATTR_TTS_FONT_WEIGHT));
        dklVar.dkl(jSONObject.optBoolean("lineLimit"));
        dklVar.jip(jSONObject.optInt("position"));
        dklVar.xn(jSONObject.optString("align"));
        dklVar.dse(jSONObject.optBoolean("useLeft"));
        dklVar.aq(jSONObject.optBoolean("useRight"));
        dklVar.ojm(jSONObject.optBoolean("useTop"));
        dklVar.ta(jSONObject.optBoolean("useBottom"));
        dklVar.apu(jSONObject.optString(DataSchemeDataSource.SCHEME_DATA));
        dklVar.hn(jSONObject.optJSONObject("i18n"));
        dklVar.bug(jSONObject.optInt("marginLeft"));
        dklVar.orl(jSONObject.optInt("marginRight"));
        dklVar.ta(jSONObject.optInt("marginTop"));
        dklVar.dnm(jSONObject.optInt("marginBottom"));
        dklVar.uua(jSONObject.optInt("tagMaxCount"));
        dklVar.dnm(jSONObject.optBoolean("allowTextFlow"));
        dklVar.oj(jSONObject.optInt("textFlowType"));
        dklVar.xn(jSONObject.optInt("textFlowDuration"));
        dklVar.apu(jSONObject.optInt(TtmlNode.LEFT));
        dklVar.eum(jSONObject.optInt(TtmlNode.RIGHT));
        dklVar.wu(jSONObject.optInt("top"));
        dklVar.as(jSONObject.optInt("bottom"));
        dklVar.eum(jSONObject.optString("alignItems", "flex-start"));
        dklVar.wu(jSONObject.optString(OGoz.SDjub, ""));
        dklVar.hnj(jSONObject.optBoolean("loop", false));
        dklVar.m6do(jSONObject.optInt("zIndex"));
        dklVar.hqh(jSONObject.optInt("interactVisibleTime"));
        dklVar.tu(jSONObject.optInt("interactHiddenTime"));
        dklVar.orl(jSONObject.optBoolean("interactEnableMask"));
        dklVar.mjg(jSONObject.optBoolean("interactWontHide"));
        dklVar.hnj(jSONObject.optString("bgGradient"));
        dklVar.pty(jSONObject.optInt("areaType"));
        dklVar.gm(jSONObject.optInt("interactSlideThreshold", 0));
        dklVar.fvt(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.gjv.hn() ? 0 : AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
        dklVar.oj(jSONObject.optBoolean("openPlayableLandingPage", false));
        dklVar.qor(jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO));
        dklVar.gjv(jSONObject.optJSONObject("image"));
        dklVar.ul(jSONObject.optInt("borderShadowExtent"));
        dklVar.fc(jSONObject.optBoolean("bgGauseBlur"));
        dklVar.ua(jSONObject.optInt("bgGauseBlurRadius"));
        dklVar.jip(jSONObject.optBoolean("showTimeProgress", false));
        dklVar.uua(jSONObject.optBoolean("showPlayButton", false));
        dklVar.hnj(jSONObject.optDouble("bgColorCg", 0.0d));
        dklVar.dkl(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        dklVar.hn(jSONObject.optInt("borderTopLeftRadius", 0));
        dklVar.hnj(jSONObject.optInt("borderTopRightRadius", 0));
        dklVar.gjv(jSONObject.optInt("borderBottomLeftRadius", 0));
        dklVar.qor(jSONObject.optInt("borderBottomRightRadius", 0));
        dklVar.sk(jSONObject.optJSONObject("interactI18n"));
        dklVar.m7do(jSONObject.optString("imageObjectFit"));
        dklVar.tu(jSONObject.optString("interactTitle"));
        dklVar.nyv(jSONObject.optInt("interactTextPositionTop"));
        dklVar.as(jSONObject.optString("imageLottieTosPath"));
        dklVar.bug(jSONObject.optBoolean("animationsLoop"));
        dklVar.tgn(jSONObject.optInt("lottieAppNameMaxLength"));
        dklVar.vf(jSONObject.optInt("lottieAdDescMaxLength"));
        dklVar.xyo(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    hnj hnjVar = new hnj();
                    hnjVar.qor(jSONObject2.optString("animationType"));
                    hnjVar.hnj(jSONObject2.optDouble("animationDuration"));
                    hnjVar.hn(jSONObject2.optDouble("animationScaleX"));
                    hnjVar.qor(jSONObject2.optDouble("animationScaleY"));
                    hnjVar.gjv(jSONObject2.optString("animationTimeFunction"));
                    hnjVar.gjv(jSONObject2.optDouble("animationDelay"));
                    hnjVar.dkl(jSONObject2.optInt("animationIterationCount"));
                    hnjVar.sk(jSONObject2.optString("animationDirection"));
                    hnjVar.sk(jSONObject2.optDouble("animationInterval"));
                    hnjVar.hnj(jSONObject2.optInt("animationBorderWidth"));
                    hnjVar.hnj(jSONObject2.optLong("key"));
                    hnjVar.hn(jSONObject2.optInt("animationEffectWidth"));
                    hnjVar.qor(jSONObject2.optInt("animationSwing", 1));
                    hnjVar.gjv(jSONObject2.optInt("animationTranslateX"));
                    hnjVar.sk(jSONObject2.optInt("animationTranslateY"));
                    hnjVar.hn(jSONObject2.optString("animationRippleBackgroundColor"));
                    hnjVar.hnj(jSONObject2.optString("animationScaleDirection"));
                    hnjVar.dse(jSONObject2.optInt("animationFadeStart"));
                    hnjVar.aq(jSONObject2.optInt("animationFadeEnd"));
                    hnjVar.dkl(jSONObject2.optString("animationFillMode"));
                    hnjVar.ojm(jSONObject2.optInt("animationBounceHeight"));
                    if (dklVar.xn() > 0.0d) {
                        hnjVar.gjv(hnjVar.mjg() + dklVar.xn());
                    }
                    arrayList.add(hnjVar);
                }
                dklVar.hnj(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                dklVar.tgn(jSONObject.optString("triggerSlideDirection", MBridgeConstans.ENDCARD_URL_TYPE_PL));
                dklVar.hnj(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return dklVar;
    }

    private void xyo(String str) {
        this.cq = str;
    }

    public int af() {
        return this.f12593xd;
    }

    public int aip() {
        return this.lko;
    }

    public double apu() {
        return this.bug;
    }

    public double aq() {
        return this.bgg;
    }

    public String as() {
        return this.uua;
    }

    public int bgg() {
        return this.meb;
    }

    public float bug() {
        return this.f12570hn;
    }

    public boolean cm() {
        return this.fvt;
    }

    public JSONObject dkl() {
        return this.pwt;
    }

    public int dl() {
        return this.rq;
    }

    public String dlk() {
        return this.f12578qi;
    }

    public float dnm() {
        return this.hnj;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public String m5do() {
        return this.f12576oj;
    }

    public int dse() {
        return this.f12592vk;
    }

    public boolean dy() {
        return this.izk;
    }

    public int dzo() {
        return this.orp;
    }

    public int eta() {
        return this.dzo;
    }

    public String eum() {
        return this.f12566fc;
    }

    public float fc() {
        return this.dse;
    }

    public String ff() {
        return this.f12589ul;
    }

    public boolean fr() {
        return this.zt;
    }

    public double fvt() {
        return this.hqh;
    }

    public int fzb() {
        return this.dy;
    }

    public int gjv() {
        return this.wxi;
    }

    public int gm() {
        return this.tgn;
    }

    public boolean gn() {
        return this.f12572ka;
    }

    public JSONObject hkr() {
        return this.lhi;
    }

    public int hn() {
        return this.f12581sg;
    }

    public String hqh() {
        return this.as;
    }

    public boolean hw() {
        return this.xw;
    }

    public String idl() {
        return this.mkl;
    }

    public boolean iwu() {
        return this.f12597yo;
    }

    public boolean izk() {
        return this.f12596xo;
    }

    public String jbd() {
        return this.f12568gm;
    }

    public float jip() {
        return this.aq;
    }

    public String jle() {
        return this.f12594xe;
    }

    public int jo() {
        return this.f12569gn;
    }

    public int ka() {
        return this.pv;
    }

    public long kby() {
        return this.br;
    }

    public int ko() {
        return this.f12584sl;
    }

    public String krm() {
        return this.f12571jo;
    }

    public List<hnj> lf() {
        return this.krm;
    }

    public String lhi() {
        return this.rmr;
    }

    public int lko() {
        return this.tll;
    }

    public int lu() {
        return this.xad;
    }

    public JSONObject lx() {
        return this.dlk;
    }

    public int meb() {
        return this.f12587th;
    }

    public float mjg() {
        return this.dkl;
    }

    public int mkl() {
        return this.lu;
    }

    public int mn() {
        return this.f12563af;
    }

    public int mw() {
        return this.f12565dl;
    }

    public String nyv() {
        return this.f11do;
    }

    public float oj() {
        return this.f12585ta;
    }

    public int ojm() {
        return this.mw;
    }

    public boolean orl() {
        return this.f12583sk;
    }

    public String orp() {
        return this.nyv;
    }

    public int pnz() {
        return this.sq;
    }

    public boolean pty() {
        return this.tu;
    }

    public int pv() {
        return this.jbd;
    }

    public int pwt() {
        return this.f12591vh;
    }

    public boolean qb() {
        return this.eta;
    }

    public boolean qi() {
        return this.f12573ko;
    }

    public int qor() {
        return this.f12580rg;
    }

    public boolean rd() {
        return this.lx;
    }

    public boolean rg() {
        return this.f12579rd;
    }

    public double rmr() {
        return this.f12564cm;
    }

    public int rq() {
        return this.hkr;
    }

    public int sg() {
        return this.aip;
    }

    public String sh() {
        return this.f12586tb;
    }

    public int sk() {
        return this.hw;
    }

    public void sl() {
        hnj(this, this.iwu);
    }

    public String sq() {
        return this.pty;
    }

    public String ta() {
        return this.bqc;
    }

    public String tb() {
        return this.kby;
    }

    public String tgn() {
        return this.f12595xn;
    }

    public boolean th() {
        return this.fr;
    }

    public int tll() {
        return this.f12577qb;
    }

    public String tq() {
        return this.f12574lf;
    }

    public String tu() {
        return this.cq;
    }

    public double ua() {
        return this.f12590vf;
    }

    public int ul() {
        return this.xyo;
    }

    public float uua() {
        return this.ojm;
    }

    public String vf() {
        return this.wu;
    }

    public String vh() {
        return this.fzb;
    }

    public int vk() {
        return this.f12575mn;
    }

    public String wu() {
        return this.jip;
    }

    public int wxi() {
        return this.jle;
    }

    public String xad() {
        return this.f12588ua;
    }

    public void xd() {
        hnj(this, this.dlk);
    }

    public boolean xe() {
        return this.f12598zd;
    }

    public double xn() {
        return this.dnm;
    }

    public int xo() {
        return this.f12567ff;
    }

    public int xw() {
        return this.f12582sh;
    }

    public int yo() {
        List<hnj> list = this.krm;
        if (list == null) {
            return 0;
        }
        for (hnj hnjVar : list) {
            if ("translate".equals(hnjVar.ojm()) && hnjVar.dse() < 0) {
                return -hnjVar.dse();
            }
        }
        return 0;
    }

    public boolean zd() {
        return this.tq;
    }

    public int znr() {
        return this.idl;
    }

    public boolean zt() {
        return this.pnz;
    }

    public void apu(String str) {
        this.mkl = str;
    }

    public void aq(float f10) {
        this.ojm = f10;
    }

    public void as(int i10) {
        this.f12587th = i10;
    }

    public void bug(String str) {
        this.as = str;
    }

    public void dkl(int i10) {
        this.mw = i10;
    }

    public void dnm(String str) {
        this.wu = str;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m6do(int i10) {
        this.rq = i10;
    }

    public void dse(float f10) {
        this.aq = f10;
    }

    public void eum(int i10) {
        this.hkr = i10;
    }

    public void fc(String str) {
        this.pty = str;
    }

    public void fvt(int i10) {
        this.f12563af = i10;
    }

    public void gjv(int i10) {
        this.hw = i10;
    }

    public void gm(int i10) {
        this.f12565dl = i10;
    }

    public void hn(int i10) {
        this.f12580rg = i10;
    }

    public void hqh(int i10) {
        this.meb = i10;
    }

    public void jip(String str) {
        this.f12568gm = str;
    }

    public void mjg(String str) {
        this.nyv = str;
    }

    public void nyv(int i10) {
        this.f12575mn = i10;
    }

    public void oj(String str) {
        this.f12588ua = str;
    }

    public void ojm(float f10) {
        this.f12585ta = f10;
    }

    public void orl(String str) {
        this.f11do = str;
    }

    public void pty(int i10) {
        this.f12591vh = i10;
    }

    public void qor(int i10) {
        this.wxi = i10;
    }

    public void sk(int i10) {
        this.f12592vk = i10;
    }

    public void ta(String str) {
        this.eum = str;
    }

    public void tgn(int i10) {
        this.f12582sh = i10;
    }

    public void tu(int i10) {
        this.lko = i10;
    }

    public void ua(int i10) {
        this.jle = i10;
    }

    public void ul(int i10) {
        this.aip = i10;
    }

    public void uua(String str) {
        this.f12589ul = str;
    }

    public void vf(int i10) {
        this.f12593xd = i10;
    }

    public void wu(int i10) {
        this.tll = i10;
    }

    public void xn(String str) {
        this.rmr = str;
    }

    public String xyo() {
        return this.eum;
    }

    public void apu(int i10) {
        this.idl = i10;
    }

    public void aq(String str) {
        this.f12595xn = str;
    }

    public void as(String str) {
        this.f12594xe = str;
    }

    public void bug(int i10) {
        this.f12567ff = i10;
    }

    public void dkl(float f10) {
        this.dse = f10;
    }

    public void dnm(int i10) {
        this.jbd = i10;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m7do(String str) {
        this.f12578qi = str;
    }

    public void dse(String str) {
        this.f12576oj = str;
    }

    public void eum(String str) {
        this.f12571jo = str;
    }

    public void fc(int i10) {
        this.pv = i10;
    }

    public void gjv(float f10) {
        this.gjv = f10;
    }

    public void hn(float f10) {
        this.f12570hn = f10;
    }

    public void jip(int i10) {
        this.lu = i10;
    }

    public void mjg(int i10) {
        this.dzo = i10;
    }

    public void oj(int i10) {
        this.f12569gn = i10;
    }

    public void ojm(String str) {
        this.apu = str;
    }

    public void orl(int i10) {
        this.xad = i10;
    }

    public void qor(float f10) {
        this.qor = f10;
    }

    public void sk(float f10) {
        this.dkl = f10;
    }

    public void ta(int i10) {
        this.sq = i10;
    }

    public void tgn(String str) {
        this.kby = str;
    }

    public void tu(String str) {
        this.f12586tb = str;
    }

    public void uua(int i10) {
        this.f12577qb = i10;
    }

    public void wu(String str) {
        this.fzb = str;
    }

    public void xn(int i10) {
        this.dy = i10;
    }

    public void xyo(int i10) {
        this.f12584sl = i10;
    }

    public void aq(int i10) {
        this.xyo = i10;
    }

    public void bug(boolean z10) {
        this.lx = z10;
    }

    public void dkl(String str) {
        this.uua = str;
    }

    public void dnm(boolean z10) {
        this.fr = z10;
    }

    public void dse(int i10) {
        this.tgn = i10;
    }

    public void fc(boolean z10) {
        this.f12579rd = z10;
    }

    public void gjv(String str) {
        this.f12566fc = str;
    }

    public void hn(boolean z10) {
        this.f12583sk = z10;
    }

    public void jip(boolean z10) {
        this.xw = z10;
    }

    public void mjg(boolean z10) {
        this.f12597yo = z10;
    }

    public void oj(boolean z10) {
        this.f12598zd = z10;
    }

    public void ojm(int i10) {
        this.orp = i10;
    }

    public void orl(boolean z10) {
        this.tq = z10;
    }

    public void qor(double d10) {
        this.bug = d10;
    }

    public void sk(String str) {
        this.jip = str;
    }

    public void ta(boolean z10) {
        this.izk = z10;
    }

    public void uua(boolean z10) {
        this.f12573ko = z10;
    }

    public void aq(boolean z10) {
        this.zt = z10;
    }

    public void dkl(double d10) {
        this.f12564cm = d10;
    }

    public void dse(boolean z10) {
        this.eta = z10;
    }

    public void gjv(double d10) {
        this.f12590vf = d10;
    }

    public void hn(double d10) {
        this.dnm = d10;
    }

    public void ojm(boolean z10) {
        this.f12572ka = z10;
    }

    public void qor(String str) {
        this.mjg = str;
    }

    public void sk(double d10) {
        this.hqh = d10;
    }

    public void dkl(boolean z10) {
        this.f12596xo = z10;
    }

    public void gjv(boolean z10) {
        this.fvt = z10;
    }

    public void hn(String str) {
        this.orl = str;
    }

    public void qor(boolean z10) {
        this.tu = z10;
    }

    public void sk(boolean z10) {
        this.pnz = z10;
    }

    public void gjv(JSONObject jSONObject) {
        this.dlk = jSONObject;
    }

    public void hn(JSONObject jSONObject) {
        this.lhi = jSONObject;
    }

    public void qor(JSONObject jSONObject) {
        this.iwu = jSONObject;
    }

    public void sk(JSONObject jSONObject) {
        this.pwt = jSONObject;
    }

    public boolean hnj() {
        return this.znr;
    }

    public void hnj(boolean z10) {
        this.znr = z10;
    }

    public void hnj(int i10) {
        this.f12581sg = i10;
    }

    public void hnj(double d10) {
        this.bgg = d10;
    }

    public void hnj(String str) {
        this.bqc = str;
    }

    public void hnj(float f10) {
        this.hnj = f10;
    }

    public void hnj(List<hnj> list) {
        this.krm = list;
    }

    public void hnj(long j10) {
        this.br = j10;
    }

    private void hnj(dkl dklVar, JSONObject jSONObject) {
        if (dklVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            switch (next) {
                case "isShowBgControl":
                    dklVar.qor(jSONObject.optBoolean(next, false));
                    break;
                case "clickArea":
                    dklVar.fc(jSONObject.optString(next));
                    break;
                case "triggerSlideDirection":
                    dklVar.tgn(jSONObject.optString(next));
                    break;
                case "bgImgUrl":
                    dklVar.dse(jSONObject.optString(next));
                    break;
                case "lineCount":
                    dklVar.ojm(jSONObject.optInt(next));
                    break;
                case "openPlayableLandingPage":
                    dklVar.oj(jSONObject.optBoolean(next));
                    break;
                case "lineLimit":
                    dklVar.dkl(jSONObject.optBoolean(next));
                    break;
                case "interactBgColor":
                    dklVar.orl(jSONObject.optString(next));
                    break;
                case "paddingLeft":
                    dklVar.dkl((float) jSONObject.optDouble(next));
                    break;
                case "adType":
                    dklVar.hn(jSONObject.optString(next));
                    break;
                case "bottom":
                    dklVar.as(jSONObject.optInt(next));
                    break;
                case "fontFamily":
                    dklVar.qor(jSONObject.optString(next));
                    break;
                case "height":
                    dklVar.qor((float) jSONObject.optDouble(next));
                    break;
                case "textAlign":
                    dklVar.gjv(jSONObject.optString(next));
                    break;
                case "alignItems":
                    dklVar.eum(jSONObject.optString(next));
                    break;
                case "interactValidate":
                    dklVar.hn(jSONObject.optBoolean(next));
                    break;
                case "marginTop":
                    dklVar.ta(jSONObject.optInt(next));
                    break;
                case "useBottom":
                    dklVar.ta(jSONObject.optBoolean(next));
                    break;
                case "triggerSlideMinDistance":
                    dklVar.hnj(jSONObject.optLong(next));
                    break;
                case "direction":
                    dklVar.wu(jSONObject.optString(next));
                    break;
                case "tagMaxCount":
                    dklVar.uua(jSONObject.optInt(next));
                    break;
                case "interactHiddenTime":
                    dklVar.tu(jSONObject.optInt(next));
                    break;
                case "useTop":
                    dklVar.ojm(jSONObject.optBoolean(next));
                    break;
                case "fontWeight":
                    dklVar.fc(jSONObject.optInt(next));
                    break;
                case "zIndex":
                    dklVar.m6do(jSONObject.optInt(next));
                    break;
                case "timingStart":
                    dklVar.hn(jSONObject.optDouble(next));
                    break;
                case "lineHeight":
                    dklVar.dkl(jSONObject.optDouble(next));
                    break;
                case "textFlowDuration":
                    dklVar.xn(jSONObject.optInt(next));
                    break;
                case "useRight":
                    dklVar.aq(jSONObject.optBoolean(next));
                    break;
                case "marginBottom":
                    dklVar.dnm(jSONObject.optInt(next));
                    break;
                case "bgColor":
                    dklVar.dkl(jSONObject.optString(next));
                    break;
                case "useLeft":
                    dklVar.dse(jSONObject.optBoolean(next));
                    break;
                case "widthMode":
                    dklVar.dnm(jSONObject.optString(next));
                    break;
                case "top":
                    dklVar.wu(jSONObject.optInt(next));
                    break;
                case "data":
                    dklVar.apu(jSONObject.optString(next));
                    break;
                case "left":
                    dklVar.apu(jSONObject.optInt(next));
                    break;
                case "loop":
                    dklVar.hnj(jSONObject.optBoolean(next));
                    break;
                case "paddingTop":
                    dklVar.aq((float) jSONObject.optDouble(next));
                    break;
                case "align":
                    dklVar.xn(jSONObject.optString(next));
                    break;
                case "color":
                    dklVar.sk(jSONObject.optString(next));
                    break;
                case "right":
                    dklVar.eum(jSONObject.optInt(next));
                    break;
                case "width":
                    dklVar.gjv((float) jSONObject.optDouble(next));
                    break;
                case "timingEnd":
                    dklVar.qor(jSONObject.optDouble(next));
                    break;
                case "paddingBottom":
                    dklVar.sk((float) jSONObject.optDouble(next));
                    break;
                case "allowTextFlow":
                    dklVar.dnm(jSONObject.optBoolean(next));
                    break;
                case "interactWontHide":
                    dklVar.mjg(jSONObject.optBoolean(next));
                    break;
                case "fontSize":
                    dklVar.ojm((float) jSONObject.optDouble(next));
                    break;
                case "justifyVertical":
                    dklVar.oj(jSONObject.optString(next));
                    break;
                case "interactVisibleTime":
                    dklVar.hqh(jSONObject.optInt(next));
                    break;
                case "paddingRight":
                    dklVar.dse((float) jSONObject.optDouble(next));
                    break;
                case "borderColor":
                    dklVar.aq(jSONObject.optString(next));
                    break;
                case "borderStyle":
                    dklVar.ojm(jSONObject.optString(next));
                    break;
                case "position":
                    dklVar.jip(jSONObject.optInt(next));
                    break;
                case "isDataFixed":
                    dklVar.sk(jSONObject.optBoolean(next));
                    break;
                case "marginRight":
                    dklVar.orl(jSONObject.optInt(next));
                    break;
                case "justifyHorizontal":
                    dklVar.uua(jSONObject.optString(next));
                    break;
                case "interactPosition":
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject == null) {
                        break;
                    } else {
                        dklVar.dse(jSONObjectOptJSONObject.optInt("translateY", 0));
                        dklVar.aq(jSONObjectOptJSONObject.optInt("translateX", 0));
                        dklVar.gjv(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        dklVar.sk(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                    break;
                case "lineFeed":
                    dklVar.gjv(jSONObject.optBoolean(next));
                    break;
                case "interactText":
                    dklVar.bug(jSONObject.optString(next));
                    break;
                case "interactType":
                    dklVar.mjg(jSONObject.optString(next));
                    break;
                case "borderRadius":
                    dklVar.hnj((float) jSONObject.optDouble(next));
                    break;
                case "clickTigger":
                    dklVar.jip(jSONObject.optString(next));
                    break;
                case "heightMode":
                    dklVar.ta(jSONObject.optString(next));
                    break;
                case "textFlowType":
                    dklVar.oj(jSONObject.optInt(next));
                    break;
                case "borderSize":
                    dklVar.hn((float) jSONObject.optDouble(next));
                    break;
                case "marginLeft":
                    dklVar.bug(jSONObject.optInt(next));
                    break;
                case "letterSpacing":
                    dklVar.mjg(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
