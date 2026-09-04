package com.bytedance.sdk.openadsdk.wu;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class aq {

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private String f14733af;
    private String aip;
    private String apu;
    private final Handler aq;
    private boolean as;
    private String bgg;
    private String bqc;
    private boolean br;
    private final Handler bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private String f14734cm;
    private String cq;
    private boolean cvc;
    private final String dkl;

    /* JADX INFO: renamed from: dl, reason: collision with root package name */
    private JSONObject f14735dl;
    private JSONObject dlk;
    private Runnable dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean f53do;
    private final String dse;
    private long dy;
    private int dzo;
    private int eta;
    private String ett;
    private String eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private hn f14736fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private String f14737ff;
    private int fr;
    private long fvt;
    private WebView fzb;
    public final String gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private long f14738gm;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    private long f14739gn;
    private int hkr;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public final String f14740hn;
    public final String hnj;
    private long hqh;
    private int hw;
    private JSONObject idl;
    private String iwu;
    private boolean izk;
    private String jbd;
    private boolean jip;
    private String jle;

    /* JADX INFO: renamed from: jo, reason: collision with root package name */
    private Context f14741jo;
    private boolean jpm;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private String f14742ka;
    private boolean kby;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private JSONObject f14743ko;
    private int krm;
    private volatile boolean ldn;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private float f14744lf;
    private int lhi;
    private com.bytedance.sdk.openadsdk.wu.hnj lko;

    /* JADX INFO: renamed from: ll, reason: collision with root package name */
    private boolean f14745ll;
    private int lu;
    private String lx;
    private qor meb;
    private Runnable mjg;
    private int mkl;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private int f14746mn;
    private int mw;
    private long nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private boolean f14747oj;
    private Runnable ojm;
    private Runnable orl;
    private long orp;
    private boolean pdc;
    private int pnz;
    private long pty;
    private boolean pv;
    private int pwt;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    private int f14748qb;

    /* JADX INFO: renamed from: qi, reason: collision with root package name */
    private int f14749qi;
    public final String qor;
    private volatile boolean qri;

    /* JADX INFO: renamed from: rd, reason: collision with root package name */
    private String f14750rd;

    /* JADX INFO: renamed from: rg, reason: collision with root package name */
    private int f14751rg;
    private int rmr;
    private dkl rq;
    private int rx;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private int f14752sg;

    /* JADX INFO: renamed from: sh, reason: collision with root package name */
    private boolean f14753sh;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public final String f14754sk;

    /* JADX INFO: renamed from: sl, reason: collision with root package name */
    private boolean f14755sl;

    /* JADX INFO: renamed from: sp, reason: collision with root package name */
    private String f14756sp;
    private long sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private Runnable f14757ta;

    /* JADX INFO: renamed from: tb, reason: collision with root package name */
    private boolean f14758tb;
    private long tgn;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private hnj f14759th;
    private int tll;
    private int tq;
    private String tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private long f14760ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private long f14761ul;
    private boolean uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private int f14762vf;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private int f14763vh;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private float f14764vk;
    private boolean wu;
    private int wxi;
    private String xad;

    /* JADX INFO: renamed from: xd, reason: collision with root package name */
    private boolean f14765xd;

    /* JADX INFO: renamed from: xe, reason: collision with root package name */
    private int f14766xe;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private Set<String> f14767xn;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private int f14768xo;
    private Map<String, String> xw;
    private long xyo;

    /* JADX INFO: renamed from: yl, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f14769yl;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private float f14770yo;

    /* JADX INFO: renamed from: zd, reason: collision with root package name */
    private String f14771zd;
    private WeakReference<View> znr;
    private int zt;
    private List<JSONObject> zyh;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public enum hnj {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private aq(Context context, WebView webView, qor qorVar, com.bytedance.sdk.openadsdk.wu.hnj hnjVar, hnj hnjVar2) {
        this.dkl = "playable_stuck_check_ping";
        this.dse = "playable_apply_media_permission_callback";
        this.aq = new Handler(Looper.getMainLooper());
        this.bug = new Handler(Looper.getMainLooper());
        this.jip = true;
        this.uua = true;
        this.f14747oj = true;
        this.hnj = "PL_sdk_playable_global_viewable";
        this.f14740hn = "PL_sdk_page_screen_blank";
        this.qor = "PL_sdk_playable_destroy_analyze_summary";
        this.gjv = "PL_sdk_playable_hardware_dialog_cancel";
        this.f14754sk = "PL_sdk_playable_hardware_dialog_setting";
        this.f14767xn = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.apu = null;
        this.eum = "embeded_ad";
        this.wu = true;
        this.as = true;
        this.f53do = false;
        this.tu = "";
        this.tgn = 10L;
        this.xyo = 10L;
        this.f14762vf = 700;
        this.hqh = 0L;
        this.nyv = 0L;
        this.pty = -1L;
        this.f14738gm = -1L;
        this.f14761ul = -1L;
        this.f14760ua = -1L;
        this.fvt = -1L;
        this.orp = -1L;
        this.sq = -1L;
        this.jbd = "";
        this.f14737ff = "";
        this.xad = "";
        this.f14734cm = "";
        this.dzo = 0;
        this.pnz = 0;
        this.pv = false;
        this.f14768xo = 0;
        this.lu = -1;
        this.rmr = 0;
        this.eta = 0;
        this.zt = 0;
        this.f14742ka = null;
        this.izk = false;
        this.mkl = 0;
        this.lhi = 0;
        this.f14748qb = 0;
        this.fr = 0;
        this.f14739gn = 0L;
        this.dy = 0L;
        this.hkr = -2;
        this.tll = 0;
        this.krm = 0;
        this.f14763vh = 0;
        this.f14735dl = new JSONObject();
        this.xw = new HashMap();
        this.f14743ko = new JSONObject();
        this.iwu = "";
        this.f14764vk = 0.0f;
        this.f14744lf = 0.0f;
        this.f14765xd = false;
        this.br = false;
        this.cvc = false;
        this.zyh = new ArrayList();
        this.pdc = true;
        this.ldn = true;
        this.qri = true;
        this.f14769yl = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.wu.aq.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) aq.this.znr.get();
                    if (view == null) {
                        return;
                    }
                    aq.this.hn(view);
                } catch (Throwable th2) {
                    dse.hnj("PlayablePlugin", "onSizeChanged error", th2);
                }
            }
        };
        this.rx = -1;
        this.hkr = 0;
        this.f14759th = hnjVar2;
        this.fzb = webView;
        ojm.hnj(webView);
        hnj(webView);
        hnj(context, qorVar, hnjVar);
    }

    static /* synthetic */ int bug(aq aqVar) {
        int i10 = aqVar.dzo;
        aqVar.dzo = i10 + 1;
        return i10;
    }

    private void cm() {
        Runnable runnable;
        Runnable runnable2;
        this.f14736fc.hnj(System.currentTimeMillis());
        Handler handler = this.bug;
        if (handler != null) {
            int i10 = this.hkr;
            if (i10 == 0 && (runnable2 = this.orl) != null) {
                handler.post(runnable2);
            } else if ((i10 == 1 || i10 == 2) && (runnable = this.mjg) != null) {
                handler.post(runnable);
            }
            this.f14736fc.hnj(500);
        }
    }

    private void ff() {
        this.f14736fc = new hn(this, this.f14762vf);
        this.ojm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.aq.5
            @Override // java.lang.Runnable
            public void run() {
                if (aq.this.wu) {
                    aq.this.wu = false;
                    aq.this.aq.removeCallbacks(aq.this.f14757ta);
                    aq.this.hnj(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.f14757ta = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.aq.6
            @Override // java.lang.Runnable
            public void run() {
                if (aq.this.wu) {
                    aq.this.wu = false;
                    aq.this.ldn = false;
                    aq.this.aq.removeCallbacks(aq.this.ojm);
                    aq.this.hnj(3, mDXVAtwcaFMHJ.oVJcXfC);
                }
            }
        };
        this.orl = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.aq.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (aq.this.fzb != null) {
                    aq.this.fzb.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.wu.aq.7.1
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (aq.this.f14736fc != null) {
                                aq.this.f14736fc.hnj(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (aq.this.bug != null) {
                    aq.this.bug.postDelayed(this, 500L);
                }
            }
        };
        this.mjg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.aq.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                aq.this.hnj("playable_stuck_check_ping", new JSONObject());
                if (aq.this.bug != null) {
                    aq.this.bug.postDelayed(this, 500L);
                }
            }
        };
        this.dnm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.aq.9
            @Override // java.lang.Runnable
            public void run() {
                if (aq.this.dy <= 0) {
                    aq.this.hn(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (aq.this.dy - aq.this.f14739gn > aq.this.f14762vf) {
                        aq.this.hn(1, "Clicking on the hot zone causes the program to freeze.");
                        return;
                    }
                    aq.this.gm();
                    aq.this.f14739gn = 0L;
                    aq.this.dy = 0L;
                }
            }
        };
    }

    static /* synthetic */ int orl(aq aqVar) {
        int i10 = aqVar.pnz;
        aqVar.pnz = i10 + 1;
        return i10;
    }

    private void xad() {
        String str;
        if (this.f14743ko == null || (str = this.f14733af) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.f14743ko.optString(BidResponsedEx.KEY_CID);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.f14733af).getHost();
        if (TextUtils.isEmpty(host)) {
            this.f14733af += "/cid_" + strOptString;
            return;
        }
        this.f14733af = this.f14733af.replace(host, host + "/cid_" + strOptString);
    }

    public JSONObject apu() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.f14770yo);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.pwt);
            jSONObject2.put("height", this.mw);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.f14751rg);
            jSONObject3.put("y", this.f14752sg);
            jSONObject3.put("width", this.wxi);
            jSONObject3.put("height", this.hw);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.f14746mn);
            jSONObject4.put("y", this.f14749qi);
            jSONObject4.put("width", this.tq);
            jSONObject4.put("height", this.f14766xe);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "getViewport error", th2);
            return jSONObject;
        }
    }

    public void as() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.fvt > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.fvt);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.f14761ul > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f14761ul;
                this.sq = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            qor("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m43do() {
        this.lu = 2;
    }

    public void eum() {
        com.bytedance.sdk.openadsdk.wu.hnj hnjVar = this.lko;
        if (hnjVar != null) {
            hnjVar.hn();
        }
    }

    public JSONObject fc() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.f14759th.ordinal());
            jSONObject.put("safe_area_top_height", this.f14764vk);
            jSONObject.put("safe_area_bottom_height", this.f14744lf);
            jSONObject.put("playable_enter_from", this.eta);
            jSONObject.put("playable_retry_count", this.rmr);
            jSONObject.put("playable_card_session", this.jbd);
            jSONObject.put("playable_video_session", this.f14737ff);
            jSONObject.put("playable_network_type", jip());
            jSONObject.put("aweme_id", this.f14734cm);
            return jSONObject;
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "playableInfo error", th2);
            return new JSONObject();
        }
    }

    public void fvt() {
        if (this.cvc) {
            return;
        }
        this.cvc = true;
        this.nyv = 0L;
        this.uua = true;
        ua();
        try {
            View view = this.znr.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f14769yl);
            }
        } catch (Throwable unused) {
        }
        try {
            this.rq.hn();
        } catch (Throwable unused2) {
        }
        try {
            hn hnVar = this.f14736fc;
            if (hnVar != null) {
                hnVar.hnj();
                this.f14736fc = null;
            }
            Handler handler = this.bug;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th2) {
            th2.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.f14733af)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.dzo);
                jSONObject.put("playable_hit_times", this.pnz);
                int i10 = this.dzo;
                if (i10 > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.pnz) / (((double) i10) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                qor("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.f14733af)) {
                if (this.pty != -1) {
                    this.hqh += System.currentTimeMillis() - this.pty;
                    this.pty = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.hqh);
                qor("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.ldn = false;
        this.qri = false;
        this.aq.removeCallbacks(this.ojm);
        this.aq.removeCallbacks(this.f14757ta);
        this.aq.removeCallbacksAndMessages(null);
    }

    public void gm() {
        if (this.as) {
            this.orp = System.currentTimeMillis();
            if (this.f14759th == hnj.FEED_AWEME) {
                if (this.f14755sl && this.tll == 3) {
                    hn hnVar = this.f14736fc;
                    if (hnVar != null && hnVar.hn()) {
                        cm();
                        return;
                    } else {
                        if (this.f14736fc == null) {
                            this.f14736fc = new hn(this, this.f14762vf);
                            cm();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.f14755sl && this.tll == 2) {
                hn hnVar2 = this.f14736fc;
                if (hnVar2 != null && hnVar2.hn()) {
                    cm();
                } else if (this.f14736fc == null) {
                    this.f14736fc = new hn(this, this.f14762vf);
                    cm();
                }
            }
        }
    }

    public void hqh() {
        hn hnVar;
        this.dy = System.currentTimeMillis();
        int i10 = this.hkr;
        if ((i10 == 1 || i10 == 2) && (hnVar = this.f14736fc) != null) {
            hnVar.hnj(System.currentTimeMillis());
        }
    }

    public int jbd() {
        return this.rx;
    }

    public String jip() {
        com.bytedance.sdk.openadsdk.wu.hnj hnjVar;
        if (TextUtils.isEmpty(this.xad) && (hnjVar = this.lko) != null) {
            this.xad = hnjVar.hnj().toString();
        }
        return this.xad;
    }

    public JSONObject mjg() {
        boolean zHnj;
        boolean zHnj2;
        try {
            boolean z10 = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zHnj = sk.hnj(this.f14741jo, "android.permission.READ_MEDIA_IMAGES");
                zHnj2 = true;
            } else {
                zHnj = sk.hnj(this.f14741jo, "android.permission.READ_EXTERNAL_STORAGE");
                zHnj2 = sk.hnj(this.f14741jo, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zHnj);
            jSONObject.put("isHasWrite", zHnj2);
            if (!zHnj || !zHnj2) {
                z10 = false;
            }
            jSONObject.put("result", z10);
            return jSONObject;
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public void nyv() {
        int i10;
        int i11 = this.hkr;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            if (this.ldn) {
                this.aq.postDelayed(this.ojm, this.tgn * 1000);
            }
            if ((this.qri && bug(this.f14733af)) || (i10 = this.hkr) == 1 || i10 == 2) {
                this.aq.postDelayed(this.f14757ta, this.xyo * 1000);
            }
        }
    }

    public JSONObject oj() {
        if (this.f14735dl.isNull("width")) {
            View view = this.znr.get();
            if (view == null) {
                return this.f14735dl;
            }
            hn(view);
        }
        return this.f14735dl;
    }

    public int orp() {
        return (this.f14738gm == -1 || !this.f14755sl) ? 1 : 2;
    }

    public void pty() {
        this.qri = false;
        this.aq.removeCallbacks(this.f14757ta);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f14761ul > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.f14761ul);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            qor("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public String sq() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public void tgn() {
        if (this.lko != null) {
            hnj hnjVar = hnj.LAND_PAGE;
        }
    }

    public void tu() {
        this.izk = true;
    }

    public void ua() {
        this.krm = 0;
        this.f14763vh = 0;
        this.f14770yo = 0.0f;
        this.pwt = 0;
        this.mw = 0;
        this.f14752sg = 0;
        this.f14751rg = 0;
        this.wxi = 0;
        this.hw = 0;
        this.f14749qi = 0;
        this.f14746mn = 0;
        this.tq = 0;
        this.f14766xe = 0;
    }

    public void ul() {
        try {
            hn hnVar = this.f14736fc;
            if (hnVar != null) {
                hnVar.hnj();
            }
            Handler handler = this.bug;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public com.bytedance.sdk.openadsdk.wu.hnj uua() {
        return this.lko;
    }

    public void vf() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.fvt > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.fvt);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.f14761ul > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.f14761ul);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            qor("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void wu() {
        com.bytedance.sdk.openadsdk.wu.hnj hnjVar = this.lko;
        if (hnjVar != null) {
            hnjVar.qor();
        }
    }

    public JSONObject xn() {
        return this.f14743ko;
    }

    public void xyo() {
        if (this.lko != null) {
            hnj hnjVar = hnj.LAND_PAGE;
        }
    }

    private boolean bug(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public boolean aq() {
        return this.f14753sh;
    }

    public String dkl() {
        return this.f14750rd;
    }

    public Set<String> dnm() {
        return this.rq.hnj();
    }

    public String dse() {
        return this.lx;
    }

    public String gjv() {
        return this.jle;
    }

    public boolean ojm() {
        return this.f14755sl;
    }

    public JSONObject orl() {
        try {
            boolean zHnj = sk.hnj(this.f14741jo, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zHnj);
            return jSONObject;
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public JSONObject qor() {
        return this.dlk;
    }

    public String sk() {
        return this.aip;
    }

    public JSONObject ta() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.f14758tb);
            return jSONObject;
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "getPlayableClickStatus error", th2);
            return new JSONObject();
        }
    }

    public JSONObject aq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", sk.hn(this.f14741jo, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt == 2) {
                    jSONObject2.put("result", sk.hn(this.f14741jo, "android.permission.CAMERA"));
                    return jSONObject2;
                }
                if (iOptInt == 3) {
                    jSONObject2.put("result", sk.hnj(this.f14741jo));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public JSONObject bug() {
        try {
            boolean zHnj = sk.hnj(this.f14741jo, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zHnj);
            return jSONObject;
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public aq dkl(String str) {
        this.eum = str;
        return this;
    }

    public void dnm(String str) {
        this.aq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.aq.3
            @Override // java.lang.Runnable
            public void run() {
                aq.orl(aq.this);
            }
        });
    }

    public aq dse(String str) {
        int iIndexOf;
        String strDecode;
        this.iwu = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                    if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                        if (this.hkr == -1) {
                            hn(2);
                        } else {
                            hn(1);
                        }
                    }
                } else {
                    hn(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                }
            } else {
                hn(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            }
        } catch (Throwable unused) {
        }
        this.f14733af = str;
        return this;
    }

    public aq gjv(String str) {
        this.f14750rd = str;
        return this;
    }

    public void ojm(String str) {
        WebView webView;
        boolean z10 = this.tll == -1;
        this.tll = 2;
        if (!z10) {
            this.f14771zd = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f14760ua = jCurrentTimeMillis;
                long j10 = this.f14761ul;
                jSONObject.put("playable_html_load_start_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
                jSONObject.put("playable_has_show", orp());
            } catch (Throwable th2) {
                dse.hnj("PlayablePlugin", "reportUrlLoadFinish error", th2);
            }
            qor("PL_sdk_html_load_finish", jSONObject);
        }
        this.ldn = false;
        this.aq.removeCallbacks(this.ojm);
        try {
            if (this.hkr == 0) {
                if (this.jip && (webView = this.fzb) != null) {
                    this.jip = false;
                    webView.evaluateJavascript(sq(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.wu.aq.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                gm();
            }
        } catch (Throwable th3) {
            dse.hnj("PlayablePlugin", "crashMonitor error", th3);
        }
    }

    public aq qor(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.dlk = jSONObject;
            return this;
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "setPlayableStyle error", th2);
            return this;
        }
    }

    public aq sk(String str) {
        this.lx = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.krm == view.getWidth() && this.f14763vh == view.getHeight()) {
                return;
            }
            this.krm = view.getWidth();
            this.f14763vh = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.krm);
            jSONObject.put("height", this.f14763vh);
            hnj("resize", jSONObject);
            this.f14735dl = jSONObject;
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "resetViewDataJsonByView error", th2);
        }
    }

    public void dkl(JSONObject jSONObject) {
        hn(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public aq gjv(boolean z10) {
        this.f14758tb = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.f14758tb);
            hnj("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "setPlayableClick error", th2);
            return this;
        }
    }

    public void sk(JSONObject jSONObject) {
        this.idl = jSONObject;
        this.zt++;
        ul();
        this.aq.removeCallbacks(this.dnm);
        if (this.as) {
            this.orp = System.currentTimeMillis();
            this.f14739gn = System.currentTimeMillis();
            this.dy = 0L;
            int i10 = this.hkr;
            if (i10 == 0) {
                WebView webView = this.fzb;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.wu.aq.10
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            aq.this.dy = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i10 == 1 || i10 == 2) {
                hnj("playable_stuck_check_ping", new JSONObject());
            }
            this.aq.postDelayed(this.dnm, this.f14762vf);
        }
    }

    private void hnj(Context context, qor qorVar, com.bytedance.sdk.openadsdk.wu.hnj hnjVar) {
        this.apu = UUID.randomUUID().toString();
        this.f14741jo = context;
        this.lko = hnjVar;
        this.meb = qorVar;
        ta.hnj(hnjVar);
        this.rq = new dkl(this);
        ff();
        if (this.fzb == null) {
            this.rx = 4;
            this.aq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.aq.4
                @Override // java.lang.Runnable
                public void run() {
                    aq.this.hnj(5, "webview is null");
                }
            });
        }
    }

    public void ta(String str) {
        this.aq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.aq.2
            @Override // java.lang.Runnable
            public void run() {
                aq.bug(aq.this);
            }
        });
    }

    public void dkl(boolean z10) {
        this.jpm = z10;
    }

    public aq qor(boolean z10) {
        if (this.rx != -1 && this.f14755sl != z10) {
            this.f14755sl = z10;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.f14755sl) {
                    jSONObject.put("playable_background_show_type", this.lhi);
                }
            } catch (JSONException unused) {
            }
            qor(this.f14755sl ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.f14738gm == -1 && this.f14755sl) {
                this.f14738gm = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.rx == 1 ? 1 : 2);
                    int i10 = this.rx;
                    if (i10 != -1) {
                        jSONObject2.put("webview_state", i10);
                    }
                } catch (JSONException unused2) {
                }
                qor("PL_sdk_page_show", jSONObject2);
            }
            if (this.f14738gm != -1 && !this.f14755sl && !this.f14765xd) {
                this.f14765xd = true;
            }
            if (this.f14755sl) {
                this.pty = System.currentTimeMillis();
            } else if (this.pty != -1) {
                this.hqh += System.currentTimeMillis() - this.pty;
                this.pty = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.f14755sl);
                hnj("viewableChange", jSONObject3);
            } catch (Throwable th2) {
                dse.hnj("PlayablePlugin", NpmRNZ.dXpCYPmhQ, th2);
            }
            if (this.f14755sl) {
                gm();
            } else {
                ul();
            }
        }
        return this;
    }

    public void gjv(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f14742ka = jSONObject.optString("section");
        }
    }

    private String gjv(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.f14733af = str3;
        return str3;
    }

    public void aq(String str) {
        this.tll = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f14761ul = jCurrentTimeMillis;
            long j10 = this.f14738gm;
            jSONObject.put("playable_page_show_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "reportUrlLoadStart error", th2);
        }
        qor("PL_sdk_html_load_start", jSONObject);
        this.ldn = true;
        this.qri = true;
        if (this.pdc) {
            nyv();
            this.ldn = false;
            this.qri = false;
        }
        if (this.uua) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (sk.hnj(this.f14741jo, sk.bug)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (sk.hn(this.f14741jo, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    }
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (sk.hnj(this.f14741jo, sk.dnm)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (sk.hnj(this.f14741jo, sk.f14806ta)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (sk.hnj(this.f14741jo, sk.ojm)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (sk.hnj(this.f14741jo, sk.aq)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (sk.hn(this.f14741jo, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    }
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (sk.hnj(this.f14741jo, sk.dse)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (sk.hnj(this.f14741jo)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    }
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                qor("PL_sdk_hardware_detect", jSONObject2);
                this.uua = false;
            } catch (Throwable th3) {
                dse.hnj("PlayablePlugin", "Hardware detect error", th3);
            }
        }
    }

    public JSONObject gjv(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (dse.hnj() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectHnj = this.rq.hnj(str, jSONObject);
        if (dse.hnj()) {
            System.currentTimeMillis();
            if (jSONObjectHnj != null) {
                jSONObjectHnj.toString();
            }
        }
        return jSONObjectHnj;
    }

    public Map<String, String> hn() {
        return this.xw;
    }

    public aq hn(String str) {
        this.jle = str;
        return this;
    }

    public aq hn(boolean z10) {
        this.kby = z10;
        return this;
    }

    public void hnj(View view) {
        if (view == null) {
            return;
        }
        try {
            this.znr = new WeakReference<>(view);
            hn(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f14769yl);
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "setViewForScreenSize error", th2);
        }
    }

    public aq hn(long j10) {
        if (j10 <= 0) {
            this.xyo = 10L;
            return this;
        }
        this.xyo = j10;
        return this;
    }

    private void sk(String str, JSONObject jSONObject) {
        try {
            int i10 = this.hkr;
            if (i10 == 0) {
                if (this.f14759th != hnj.LAND_PAGE && !bug(this.f14733af)) {
                    xad();
                }
                jSONObject.put("playable_url", this.f14733af);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", gjv(this.f14756sp, this.ett));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", qor(this.cq, this.bqc));
            }
            jSONObject.put("playable_render_type", this.hkr);
            if (this.lko != null) {
                if (this.hkr == 0 && (this.f14759th != hnj.LAND_PAGE || bug(this.f14733af))) {
                    this.lko.hnj(jSONObject);
                } else if (this.hkr != 0) {
                    this.lko.hnj(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void hn(JSONObject jSONObject) {
        if (this.lko != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public Context hnj() {
        return this.f14741jo;
    }

    public void hn(String str, String str2) {
        Bitmap bitmapHnj;
        if (TextUtils.isEmpty(str2) || (bitmapHnj = sk.hnj(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.f14741jo.getContentResolver(), bitmapHnj, str, "");
    }

    public aq hnj(String str, String str2) {
        this.xw.put(str, str2);
        return this;
    }

    public aq hnj(String str) {
        this.aip = str;
        return this;
    }

    public aq hnj(boolean z10) {
        this.f14753sh = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.f14753sh);
            hnj("volumeChange", jSONObject);
            return this;
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "setIsMute error", th2);
            return this;
        }
    }

    public void ojm(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.tll = 3;
                gm();
            } else {
                this.tll = -2;
            }
            if (zOptBoolean || !this.wu) {
                return;
            }
            this.wu = false;
            this.ldn = false;
            this.qri = false;
            this.aq.removeCallbacks(this.ojm);
            this.aq.removeCallbacks(this.f14757ta);
            hnj(4, "CaseRenderFail");
        }
    }

    public JSONObject dse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return bug();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : mjg();
        }
        return orl();
    }

    public aq hn(int i10) {
        this.hkr = i10;
        return this;
    }

    public void hn(int i10, String str) {
        this.lu = i10;
        if (this.idl == null) {
            this.idl = new JSONObject();
        }
        try {
            this.idl.put("playable_stuck_type", i10);
            this.idl.put("playable_stuck_reason", str);
            if (this.orp > 0) {
                this.idl.put("playable_stuck_duration", System.currentTimeMillis() - this.orp);
            } else {
                this.idl.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        qor("PL_sdk_page_stuck", this.idl);
        ul();
        if (this.lko == null || i10 != 2) {
            return;
        }
        this.idl = new JSONObject();
    }

    public aq hnj(long j10) {
        if (j10 <= 0) {
            this.tgn = 10L;
            return this;
        }
        this.tgn = j10;
        return this;
    }

    public void dse(boolean z10) {
        this.f14745ll = z10;
    }

    public void hnj(int i10) {
        this.rx = i10;
    }

    public aq sk(boolean z10) {
        this.pdc = z10;
        return this;
    }

    public void hnj(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.wu.hnj hnjVar = this.lko;
        if (hnjVar == null || hnjVar.hn(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            hn(strOptString2, strOptString);
        }
    }

    public aq qor(JSONObject jSONObject) {
        this.f14743ko = jSONObject;
        return this;
    }

    private void qor(int i10, String str) {
        com.bytedance.sdk.openadsdk.wu.hnj hnjVar = this.lko;
        if (hnjVar != null) {
            hnjVar.hnj(i10, str);
        }
    }

    protected void hn(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sk(str, jSONObject);
    }

    public void hnj(String str, JSONObject jSONObject) {
        if (this.f14745ll) {
            if (!dse.hnj() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (dse.hnj() && jSONObject != null) {
            jSONObject.toString();
        }
        qor qorVar = this.meb;
        if (qorVar != null) {
            qorVar.hnj(str, jSONObject);
        }
    }

    private String qor(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.bgg) && !TextUtils.isEmpty(this.iwu)) {
            Uri uri = Uri.parse(this.iwu);
            String host = uri.getHost();
            if (!"lynxview".equalsIgnoreCase(host) && (host == null || !host.contains("lynxview"))) {
                queryParameter = "";
                queryParameter2 = "";
            } else {
                queryParameter = uri.getQueryParameter("surl");
                queryParameter2 = uri.getQueryParameter("playable_hash");
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.bgg = builderAppendQueryParameter.toString();
        }
        return this.bgg;
    }

    public aq hnj(float f10) {
        this.f14770yo = f10;
        return this;
    }

    protected void hnj(int i10, String str) {
        ul();
        qor(i10, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "reportRenderFatal error", th2);
        }
        qor("PL_sdk_global_faild", jSONObject);
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
    public void qor(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.pv && this.pnz > 0) {
                this.pv = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.jpm ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.f14755sl);
            jSONObject.put("playable_session_id", this.apu);
            int i10 = this.hkr;
            if (i10 == 0) {
                if (this.f14759th != hnj.LAND_PAGE && !bug(this.f14733af)) {
                    xad();
                }
                jSONObject.put("playable_url", this.f14733af);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", gjv(this.f14756sp, this.ett));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", qor(this.cq, this.bqc));
            }
            jSONObject.put("playable_full_url", this.iwu);
            jSONObject.put("playable_replay_count", this.f14768xo);
            jSONObject.put("playable_is_prerender", this.kby);
            jSONObject.put("playable_is_preload", this.pv);
            jSONObject.put("playable_render_type", this.hkr);
            jSONObject.put("playable_scenes_type", this.f14759th.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.cq) ? "" : this.cq);
            if (!TextUtils.isEmpty(this.bqc)) {
                str2 = this.bqc;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.f14756sp);
            jSONObject.put("playable_minigamelite_schema", this.ett);
            jSONObject.put("playable_is_debug", this.br);
            jSONObject.put("playable_retry_count", this.rmr);
            jSONObject.put("playable_enter_from", this.eta);
            jSONObject.put("playable_sequence", this.zt);
            jSONObject.put("playable_current_section", this.f14742ka);
            jSONObject.put("is_playable_finish", this.izk);
            jSONObject.put("playable_card_session", this.jbd);
            jSONObject.put("playable_video_session", this.f14737ff);
            jSONObject.put("playable_network_type", jip());
            jSONObject.put("playable_lynx_version", this.tu);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.eum);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f14743ko.opt(BidResponsedEx.KEY_CID));
            jSONObject2.put("log_extra", this.f14743ko.opt("log_extra"));
            int i11 = this.hkr;
            if (i11 != -1 && i11 != -2) {
                if (this.lko != null) {
                    List<JSONObject> list = this.zyh;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.zyh.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("adExtraData");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.hkr);
                                jSONObjectOptJSONObject.put("playable_url", this.f14733af);
                            }
                            this.lko.hnj(jSONObjectOptJSONObject);
                        }
                        this.zyh.clear();
                    }
                    if (this.hkr == 0 && (this.f14759th != hnj.LAND_PAGE || bug(this.f14733af))) {
                        this.lko.hnj(jSONObject);
                        return;
                    } else {
                        if (this.hkr != 0) {
                            this.lko.hnj(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.zyh == null) {
                this.zyh = new ArrayList();
            }
            this.zyh.add(jSONObject2);
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "reportEvent error", th2);
        }
    }

    public void hnj(int i10, String str, String str2) {
        this.tll = -1;
        this.f14771zd = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", orp());
        } catch (Throwable th2) {
            dse.hnj("PlayablePlugin", "onWebReceivedError error", th2);
        }
        qor("PL_sdk_html_load_error", jSONObject);
        if (this.wu) {
            this.wu = false;
            this.ldn = false;
            this.qri = false;
            this.aq.removeCallbacks(this.ojm);
            this.aq.removeCallbacks(this.f14757ta);
            hnj(1, "ContainerLoadFail");
        }
    }

    public void hnj(boolean z10, String str, int i10) {
        if (z10) {
            this.tll = -1;
            this.f14771zd = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i10);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", orp());
            } catch (Throwable th2) {
                dse.hnj("PlayablePlugin", "onWebReceivedHttpError error", th2);
            }
            qor("PL_sdk_html_load_error", jSONObject);
            if (this.wu) {
                this.wu = false;
                this.ldn = false;
                this.qri = false;
                this.aq.removeCallbacks(this.ojm);
                this.aq.removeCallbacks(this.f14757ta);
                hnj(1, "ContainerLoadFail");
            }
        }
    }

    private aq(Context context, int i10, qor qorVar, com.bytedance.sdk.openadsdk.wu.hnj hnjVar) {
        this.dkl = "playable_stuck_check_ping";
        this.dse = "playable_apply_media_permission_callback";
        this.aq = new Handler(Looper.getMainLooper());
        this.bug = new Handler(Looper.getMainLooper());
        this.jip = true;
        this.uua = true;
        this.f14747oj = true;
        this.hnj = "PL_sdk_playable_global_viewable";
        this.f14740hn = "PL_sdk_page_screen_blank";
        this.qor = "PL_sdk_playable_destroy_analyze_summary";
        this.gjv = "PL_sdk_playable_hardware_dialog_cancel";
        this.f14754sk = "PL_sdk_playable_hardware_dialog_setting";
        this.f14767xn = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.apu = null;
        this.eum = "embeded_ad";
        this.wu = true;
        this.as = true;
        this.f53do = false;
        this.tu = "";
        this.tgn = 10L;
        this.xyo = 10L;
        this.f14762vf = 700;
        this.hqh = 0L;
        this.nyv = 0L;
        this.pty = -1L;
        this.f14738gm = -1L;
        this.f14761ul = -1L;
        this.f14760ua = -1L;
        this.fvt = -1L;
        this.orp = -1L;
        this.sq = -1L;
        this.jbd = "";
        this.f14737ff = "";
        this.xad = "";
        this.f14734cm = "";
        this.dzo = 0;
        this.pnz = 0;
        this.pv = false;
        this.f14768xo = 0;
        this.lu = -1;
        this.rmr = 0;
        this.eta = 0;
        this.zt = 0;
        this.f14742ka = null;
        this.izk = false;
        this.mkl = 0;
        this.lhi = 0;
        this.f14748qb = 0;
        this.fr = 0;
        this.f14739gn = 0L;
        this.dy = 0L;
        this.hkr = -2;
        this.tll = 0;
        this.krm = 0;
        this.f14763vh = 0;
        this.f14735dl = new JSONObject();
        this.xw = new HashMap();
        this.f14743ko = new JSONObject();
        this.iwu = "";
        this.f14764vk = 0.0f;
        this.f14744lf = 0.0f;
        this.f14765xd = false;
        this.br = false;
        this.cvc = false;
        this.zyh = new ArrayList();
        this.pdc = true;
        this.ldn = true;
        this.qri = true;
        this.f14769yl = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.wu.aq.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) aq.this.znr.get();
                    if (view == null) {
                        return;
                    }
                    aq.this.hn(view);
                } catch (Throwable th2) {
                    dse.hnj("PlayablePlugin", "onSizeChanged error", th2);
                }
            }
        };
        this.rx = -1;
        this.hkr = i10;
        this.f14759th = hnj.LAND_PAGE;
        hnj(context, qorVar, hnjVar);
    }

    public static aq hnj(Context context, WebView webView, qor qorVar, com.bytedance.sdk.openadsdk.wu.hnj hnjVar) {
        if (qorVar == null || hnjVar == null) {
            return null;
        }
        if (webView == null) {
            return new aq(context, 0, qorVar, hnjVar);
        }
        return new aq(context, webView, qorVar, hnjVar, hnj.LAND_PAGE);
    }
}
