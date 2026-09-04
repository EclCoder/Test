package com.bytedance.sdk.openadsdk.gjv;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.google.api.client.http.HttpStatusCodes;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o4.Wz.OGoz;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class orl {
    private static final int[] qor = {10, 30, 50, 75, 100};
    private boolean apu;
    private final AtomicBoolean aq;
    private long as;
    private boolean bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private final AtomicInteger f14385cm;
    private int dkl;
    private int dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private int f50do;
    private final AtomicBoolean dse;
    private final AtomicInteger dzo;
    private volatile long eta;
    private int eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final Context f14386fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private bug f14387ff;
    private WeakReference<WebView> fvt;
    private int gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private boolean f14388gm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    AtomicBoolean f14389hn;
    public com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj hnj;
    private long hqh;
    private long izk;
    private boolean jbd;
    private com.bytedance.sdk.openadsdk.core.widget.hnj.dkl jip;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private String f14390ka;
    private String lhi;
    private volatile long lu;
    private String mjg;
    private final AtomicBoolean mkl;
    private long nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.wu.aq f14391oj;
    private final AtomicBoolean ojm;
    private String orl;
    private boolean orp;
    private final AtomicBoolean pnz;
    private long pty;
    private volatile int pv;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    private boolean f14392qb;
    private volatile long rmr;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f14393sk;
    private com.bytedance.sdk.openadsdk.gjv.gjv.sk sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final AtomicBoolean f14394ta;
    private String tgn;
    private final as tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private final int[] f14395ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private final boolean f14396ul;
    private boolean uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private long f14397vf;
    private long wu;
    private volatile long xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private ojm f14398xn;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private int f14399xo;
    private long xyo;
    private final AtomicBoolean zt;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class hnj {
        private final int[] hnj;

        public hnj(int[] iArr) {
            this.hnj = iArr;
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int iIntValue;
            try {
                iIntValue = Float.valueOf(str).intValue();
                if (iIntValue > 100) {
                    iIntValue = 100;
                } else if (iIntValue < 0) {
                    iIntValue = 0;
                }
            } catch (Throwable unused) {
            }
            int[] iArr = this.hnj;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            iArr[0] = iIntValue;
        }
    }

    public orl(as asVar, WebView webView, bug bugVar, int i10) {
        this(asVar, webView);
        this.f14387ff = bugVar;
        this.f14399xo = i10;
    }

    private boolean ojm() {
        as asVar;
        return this.jbd && (asVar = this.tu) != null && asVar.ua();
    }

    private int ta() {
        WeakReference<WebView> weakReference = this.fvt;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() == 0) {
                    return 1;
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public void aq() {
        if (("landingpage".equals(this.tgn) || "landingpage_endcard".equals(this.tgn) || "landingpage_split_screen".equals(this.tgn) || "landingpage_direct".equals(this.tgn) || "aggregate_page".equals(this.tgn) || "landingpage_split_ceiling".equals(this.tgn)) && this.dkl == 2) {
            if (this.f14397vf > 0 || !qor()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.xyo, this.f14397vf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.dkl);
                    jSONObject.put("max_scroll_percent", this.f14395ua[0]);
                    jSONObject.put("jump_times", this.f14385cm.getAndSet(0));
                    jSONObject.put("click_times", this.dzo.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.f14394ta.set(true);
                hnj("stay_page", jSONObject, Math.min(jCurrentTimeMillis, TTAdConstant.AD_MAX_EVENT_TIME));
                com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj("landingPause", this.tu, this.lhi);
            }
        }
    }

    public void dkl() {
        if (ojm() && this.rmr > 0 && this.eta > 0 && !this.zt.getAndSet(true)) {
            qor.hn(this.eta - this.rmr, this.tu, this.f14390ka, (String) null);
        }
    }

    public void dse() {
        if (this.pty == 0) {
            this.pty = System.currentTimeMillis();
        }
        this.xyo = System.currentTimeMillis();
        if ("landingpage".equals(this.tgn) || "landingpage_endcard".equals(this.tgn) || "landingpage_split_screen".equals(this.tgn) || "landingpage_direct".equals(this.tgn) || "aggregate_page".equals(this.tgn)) {
            if (this.mkl.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj("landingStart", this.tu, this.lhi);
            } else {
                com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj("landingContinue", this.tu, this.lhi);
            }
        }
        if (apu.aq(this.tu) || apu.hn(this.tu)) {
            hnj(true, SystemClock.elapsedRealtime());
        }
    }

    public void gjv() {
        if (ojm()) {
            this.lu = SystemClock.elapsedRealtime();
            qor.hnj(this.tu, this.f14390ka);
        }
    }

    public com.bytedance.sdk.openadsdk.gjv.gjv.sk hn() {
        return this.sq;
    }

    public boolean qor() {
        return this.jbd;
    }

    public void sk() {
        if (ojm()) {
            this.rmr = SystemClock.elapsedRealtime();
            dkl();
        }
    }

    public orl hn(boolean z10) {
        this.orp = z10;
        return this;
    }

    public void qor(boolean z10) {
        this.jbd = z10;
    }

    public orl(as asVar, WebView webView) {
        this(asVar, webView, false);
    }

    public void hn(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f14390ka = str;
    }

    public as hnj() {
        return this.tu;
    }

    public void qor(String str) {
        if (!this.orp || this.tu == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i10 = this.f14399xo;
            if (i10 >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i10));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.tu.xe();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        hnj("load_start", jSONObject);
    }

    public orl(as asVar, WebView webView, boolean z10) {
        this.gjv = 0;
        this.f14393sk = -1L;
        this.dkl = 1;
        this.dse = new AtomicBoolean(false);
        this.aq = new AtomicBoolean(false);
        this.ojm = new AtomicBoolean(false);
        this.f14394ta = new AtomicBoolean(false);
        this.dnm = -1;
        this.apu = false;
        this.eum = 0;
        this.f14389hn = new AtomicBoolean(false);
        this.tgn = OGoz.RcYjDb;
        this.xyo = 0L;
        this.f14397vf = 0L;
        this.hqh = 0L;
        this.nyv = 0L;
        this.pty = 0L;
        this.f14388gm = false;
        this.f14396ul = false;
        int[] iArr = {0};
        this.f14395ua = iArr;
        this.orp = false;
        this.jbd = false;
        this.xad = 0L;
        this.f14385cm = new AtomicInteger(0);
        this.dzo = new AtomicInteger(0);
        this.pnz = new AtomicBoolean(false);
        this.pv = 0;
        this.f14399xo = -1;
        this.zt = new AtomicBoolean(false);
        this.mkl = new AtomicBoolean(false);
        this.f14392qb = false;
        Context contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj();
        this.f14386fc = contextHnj;
        this.tu = asVar;
        if (webView == null) {
            return;
        }
        this.apu = z10;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.fvt = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (asVar != null && asVar.wxi()) {
            com.bytedance.sdk.openadsdk.core.widget.hnj.dkl dklVar = new com.bytedance.sdk.openadsdk.core.widget.hnj.dkl(webView2, asVar, contextHnj, this.apu);
            this.jip = dklVar;
            this.hnj = dklVar.qor();
        }
        if (asVar != null && asVar.hw() && com.bytedance.sdk.openadsdk.core.settings.dnm.hn().m37do()) {
            this.f14398xn = new ojm(asVar, webView, this.apu);
        }
        if (webView instanceof com.bytedance.sdk.component.ojm.sk) {
            this.izk = ((com.bytedance.sdk.component.ojm.sk) webView2).hnj;
        } else {
            this.izk = System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new hnj(iArr), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.hnj("LandingPageLog", "addJavascriptInterface exception", e10);
        }
        if (asVar != null && asVar.azk() != null) {
            this.f14393sk = asVar.azk().optLong("page_id", -1L);
        }
        this.lhi = String.valueOf(SystemClock.elapsedRealtime());
    }

    private String sk(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void gjv(boolean z10) {
        WeakReference<WebView> weakReference = this.fvt;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.apu.hnj("LandingPageLog", IAoPeRfJn.vlH, e10);
            }
        }
        if (this.aq.compareAndSet(false, true)) {
            hnj(z10, "1");
            if (this.orp) {
                qor.hnj(this.tu, this.tgn, System.currentTimeMillis() - this.pty, this.f14399xo, ta());
            }
        } else if (this.dkl == 2 && !this.f14394ta.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.dkl);
                jSONObject.put("max_scroll_percent", this.f14395ua[0]);
                jSONObject.put("jump_times", this.f14385cm.getAndSet(0));
                jSONObject.put("click_times", this.dzo.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            hnj("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.tgn) || "landingpage_endcard".equals(this.tgn) || "landingpage_split_screen".equals(this.tgn) || "landingpage_direct".equals(this.tgn) || "aggregate_page".equals(this.tgn) || "landingpage_split_ceiling".equals(this.tgn)) {
            com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj("landingFinish", this.tu, this.lhi);
        }
    }

    public void hnj(boolean z10) {
        if (z10) {
            this.eum = 1;
        }
    }

    public void hn(WebView webView, String str, boolean z10) {
        ojm ojmVar = this.f14398xn;
        if (ojmVar == null || !z10) {
            return;
        }
        ojmVar.hnj(webView, str);
    }

    public void hnj(bug bugVar) {
        this.f14387ff = bugVar;
    }

    public void sk(boolean z10) {
        this.f14392qb = z10;
    }

    public void hnj(long j10) {
        this.f14397vf = j10;
    }

    public void hn(int i10) {
        com.bytedance.sdk.openadsdk.core.widget.hnj.dkl dklVar = this.jip;
        if (dklVar == null || !this.uua) {
            return;
        }
        dklVar.hnj(i10);
    }

    public void hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.hnj.dkl dklVar = this.jip;
        if (dklVar != null) {
            dklVar.hnj(str);
        }
        ojm ojmVar = this.f14398xn;
        if (ojmVar != null) {
            ojmVar.qor(str);
        }
        this.tgn = str;
    }

    public void hnj(int i10) {
        this.f14399xo = i10;
    }

    public void hnj(com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar) {
        this.sq = skVar;
    }

    public void hnj(com.bytedance.sdk.openadsdk.wu.aq aqVar) {
        this.f14391oj = aqVar;
    }

    public void hnj(WebView webView, int i10) {
        if (webView == null) {
            return;
        }
        if (this.xad == 0) {
            this.xad = SystemClock.elapsedRealtime();
        }
        if (this.hqh == 0 && i10 > 0) {
            this.hqh = System.currentTimeMillis();
        } else if (this.nyv == 0 && i10 == 100) {
            this.nyv = System.currentTimeMillis();
        }
        if (this.gjv != qor.length && ("landingpage".equals(this.tgn) || "landingpage_endcard".equals(this.tgn) || "landingpage_split_screen".equals(this.tgn) || "landingpage_direct".equals(this.tgn) || "aggregate_page".equals(this.tgn))) {
            int i11 = this.gjv;
            while (true) {
                int[] iArr = qor;
                if (i11 >= iArr.length || i10 < iArr[this.gjv]) {
                    break;
                }
                int i12 = i11 + 1;
                this.gjv = i12;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j10 = this.f14393sk;
                    if (j10 != -1) {
                        jSONObject.put("page_id", j10);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i11]);
                } catch (Exception unused) {
                }
                hnj("progress_load_finish", jSONObject);
                i11 = i12;
            }
        }
        if (i10 == 100) {
            hnj(false, SystemClock.elapsedRealtime());
            hnj(webView.getUrl(), NotificationCompat.CATEGORY_PROGRESS, Math.min(this.nyv - this.hqh, TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    public void gjv(String str) {
        if (!this.orp || this.tu == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i10 = this.f14399xo;
            if (i10 >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i10));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.tu.xe();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        hnj(KPtaxpyICj.gtl, jSONObject);
    }

    private void hnj(String str, String str2, long j10) {
        if (this.ojm.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i10 = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i10 = iIndexOf;
                    }
                    str = str.substring(0, i10);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            hnj("load_finish_progress", jSONObject, j10);
        }
    }

    public void hnj(WebView webView, String str, Bitmap bitmap, boolean z10, int i10) {
        this.uua = z10;
        this.f50do++;
        com.bytedance.sdk.openadsdk.core.widget.hnj.dkl dklVar = this.jip;
        if (dklVar != null && z10) {
            dklVar.hn(str);
            this.jip.hn();
        }
        ojm ojmVar = this.f14398xn;
        if (ojmVar != null && z10) {
            ojmVar.hnj(str, i10);
        }
        WeakReference<WebView> weakReference = this.fvt;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.pv) {
                    this.f14385cm.incrementAndGet();
                }
                this.pv = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.apu.hnj("LandingPageLog", "copyBackForwardList exception", e10);
            }
        }
        if (this.xad == 0) {
            this.xad = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.sq;
        if (skVar != null) {
            skVar.gjv();
        }
        if (this.dse.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i11 = this.f14399xo;
                if (i11 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i11));
                }
            } catch (Exception unused) {
            }
            hnj("load_start", jSONObject);
        }
    }

    public void hnj(WebView webView, String str, boolean z10) {
        hnj(false, SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.core.widget.hnj.dkl dklVar = this.jip;
        if (dklVar != null && z10) {
            dklVar.hnj();
        }
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.sq;
        if (skVar != null) {
            skVar.sk();
        }
        ojm ojmVar = this.f14398xn;
        if (ojmVar != null && z10) {
            ojmVar.hnj(str);
        }
        if (webView != null && !this.f14388gm && this.orp) {
            this.f14388gm = true;
            com.bytedance.sdk.component.utils.mjg.hnj(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.aq.compareAndSet(false, true)) {
            if (this.dkl != 3) {
                this.dkl = 2;
            }
            this.xyo = System.currentTimeMillis();
            boolean z11 = this.dkl == 2;
            int iTa = ta();
            if (z11) {
                long j10 = this.nyv - this.hqh;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.dnm);
                    jSONObject.put("error_msg", this.orl);
                    jSONObject.put("error_url", this.mjg);
                    int i10 = this.f14399xo;
                    if (i10 >= 0) {
                        jSONObject.put("preload_status", i10);
                    }
                    jSONObject.put("first_page", iTa);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.tu.xe());
                    jSONObject.put("preload_h5_type", this.tu.sq());
                } catch (Exception unused) {
                }
                hnj(z10, MBridgeConstans.ENDCARD_URL_TYPE_PL);
                long jMin = Math.min(j10, TTAdConstant.AD_MAX_EVENT_TIME);
                hnj("load_finish", jSONObject, jMin);
                if (ojm()) {
                    this.eta = SystemClock.elapsedRealtime();
                    dkl();
                    qor.hnj(this.tu, this.f14390ka, this.eta - this.lu);
                }
                hnj(str, "load_finish", jMin);
                bug bugVar = this.f14387ff;
                if (bugVar != null) {
                    bugVar.hnj(iTa);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.dnm);
                jSONObject2.put("error_msg", this.orl);
                jSONObject2.put("error_url", this.mjg);
                jSONObject2.put("first_page", iTa);
                int i11 = this.f14399xo;
                if (i11 >= 0) {
                    jSONObject2.put("preload_status", i11);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.tu.xe());
                jSONObject2.put("preload_h5_type", this.tu.sq());
            } catch (Exception unused2) {
            }
            hnj(z10, MBridgeConstans.API_REUQEST_CATEGORY_APP);
            hnj("load_fail", jSONObject2);
            if (ojm()) {
                qor.hnj(this.tu, this.f14390ka, SystemClock.elapsedRealtime() - this.lu, this.dnm, this.orl, this.mjg);
            }
            if (this.bug) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                hnj("load_fail_main", jSONObject2);
            }
        }
    }

    public void hnj(WebView webView, int i10, String str, String str2, String str3, boolean z10) {
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.sq;
        if (skVar != null) {
            skVar.hnj((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.dkl != 2) {
            this.dkl = 3;
        }
        this.dnm = i10;
        this.orl = str;
        this.mjg = str2;
        this.bug = z10;
    }

    public void hnj(com.bytedance.sdk.component.ojm.dkl dklVar) {
        int iHkr;
        Bitmap bitmapHnj;
        as asVar;
        if ((!"landingpage".equals(this.tgn) && !"landingpage_endcard".equals(this.tgn) && !"landingpage_split_screen".equals(this.tgn) && !"landingpage_direct".equals(this.tgn) && !"aggregate_page".equals(this.tgn)) || (iHkr = com.bytedance.sdk.openadsdk.core.oj.gjv().hkr()) == 0 || new Random().nextInt(100) + 1 > iHkr || dklVar == null || dklVar.getWebView() == null || dklVar.getVisibility() != 0 || (bitmapHnj = sq.hnj(dklVar)) == null || (asVar = this.tu) == null) {
            return;
        }
        sq.hnj(asVar, this.tgn, "landing_page_blank", bitmapHnj, dklVar.getUrl(), this.f14393sk);
    }

    private void hnj(String str, JSONObject jSONObject) {
        hnj(str, jSONObject, -1L);
    }

    private void hnj(final String str, final JSONObject jSONObject, final long j10) {
        if (!this.orp || this.tu == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.wu.aq aqVar = this.f14391oj;
        final int iOrp = aqVar != null ? aqVar.orp() : -1;
        qor.hnj(System.currentTimeMillis(), this.tu, this.tgn, str, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.orl.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j11 = j10;
                    if (j11 > 0) {
                        jSONObject2.put("duration", j11);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if ("load_start".equals(str) || "load_finish".equals(str) || "progress_load_finish".equals(str)) {
                        jSONObject2.put("is_reused", orl.this.f14392qb ? 1 : 0);
                    }
                    if (com.bytedance.sdk.openadsdk.mjg.hnj.qor(orl.this.tu)) {
                        jSONObject2.put("is_lp_pre_render", orl.this.eum);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject qor() {
                if (jSONObject != null) {
                    try {
                        boolean zHn = hqh.hn(orl.this.tu);
                        jSONObject.put("is_playable", zHn ? 1 : 0);
                        jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(orl.this.tu) ? 1 : 0);
                        if (zHn && ("load_finish".equals(str) || "load_fail".equals(str))) {
                            jSONObject.put("playable_has_show", iOrp);
                        }
                        if ("stay_page".equals(str)) {
                            jSONObject.put("first_page", orl.this.f50do > 1 ? 0 : 1);
                        }
                    } catch (JSONException unused) {
                    }
                }
                String unused2 = orl.this.tgn;
                return jSONObject;
            }
        });
    }

    public void hnj(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.hnj.dkl dklVar = this.jip;
        if (dklVar != null && this.uua) {
            dklVar.hnj(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.xad != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.dzo.incrementAndGet();
                this.dzo.get();
                if (this.pnz.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.tu.xe());
                } catch (JSONException unused) {
                }
                hnj("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.xad, 0L));
            }
        }
    }

    public void hnj(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.widget.hnj.dkl dklVar = this.jip;
        if (dklVar != null && z10) {
            dklVar.qor(str);
        }
        ojm ojmVar = this.f14398xn;
        if (ojmVar == null || !z10) {
            return;
        }
        ojmVar.hn(str);
    }

    private void hnj(boolean z10, final String str) {
        if (z10) {
            final int iTa = ta();
            qor.hnj(new com.bytedance.sdk.component.aq.hn.qor("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.gjv.orl.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.dkl dklVarUl = com.bytedance.sdk.openadsdk.core.oj.gjv().ul();
                        boolean zHnj = orl.this.hnj(dklVarUl, str);
                        if (zHnj) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.dkl.f14175hn)) {
                                orl.this.hnj(iTa, str);
                                return;
                            }
                            if (TextUtils.isEmpty(dklVarUl.qor) || !zHnj) {
                                return;
                            }
                            String str2 = dklVarUl.qor;
                            com.bytedance.sdk.component.dse.hn.hn hnVarQor = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().qor();
                            hnVarQor.qor(str2);
                            HashMap map = new HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            hnVarQor.gjv(map);
                            hnVarQor.hnj(9);
                            hnVarQor.hn("sendPrefLog");
                            hnVarQor.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.orl.2.1
                                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.dkl.f14175hn = hnVar.gjv();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        orl.this.hnj(iTa, str);
                                    } catch (Exception e10) {
                                        com.bytedance.sdk.component.utils.apu.hnj("LandingPageLog", "TTWebViewClient : onPageFinished", e10);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.apu.qor(th2.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(int i10, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.dkl.f14175hn)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.dkl.f14175hn);
            jSONObject.putOpt(BidResponsedEx.KEY_CID, hnj().sp());
            jSONObject.putOpt("ad_id", hnj().sp());
            jSONObject.put("log_extra", hnj().ldn());
            orp.hnj(sb2, "\"/** adInfo **/\"", jSONObject.toString());
            orp.hnj(sb2, "\"/** first_page **/\"", String.valueOf(i10));
            long j10 = this.f14393sk;
            String str2 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            orp.hnj(sb2, "\"/** ix_to_externalurl **/\"", j10 != -1 ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
            if (this.f14399xo == 2) {
                str2 = MBridgeConstans.API_REUQEST_CATEGORY_APP;
            }
            orp.hnj(sb2, "\"/** preload_status **/\"", str2);
            orp.hnj(sb2, "\"/** scene_state **/\"", str);
            orp.hnj(sb2, "\"/** web_init_time **/\"", String.valueOf(this.izk));
            orp.hnj(sb2, "\"/** channel_name **/\"", "\"" + hnj().rx() + "\"");
            orp.hnj(sb2, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            orp.hnj(sb2, "\"/** web_url **/\"", "\"" + hnj().xe() + "\"");
            String string = sb2.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strSk = sk(string);
            WeakReference<WebView> weakReference = this.fvt;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(strSk) || webView == null) {
                return;
            }
            ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.orl.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.mjg.hnj(webView, strSk);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor(th2.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(com.bytedance.sdk.openadsdk.core.settings.dkl dklVar, String str) {
        str.getClass();
        switch (str) {
            case "0":
                return dklVar.gjv;
            case "1":
                return dklVar.f14176sk;
            case "2":
                return dklVar.dkl;
            default:
                return false;
        }
    }

    public void hnj(boolean z10, long j10) {
        if (z10) {
            this.wu = j10;
        } else {
            this.as = j10;
        }
        if (this.wu <= 0 || this.as <= 0 || !this.uua || !this.f14389hn.compareAndSet(false, true)) {
            return;
        }
        hnj(this.tu, this.tgn, this.as - this.wu, this.eum, this.f14392qb);
    }

    public static void hnj(final as asVar, final String str, final long j10, final int i10, final boolean z10) {
        qor.hnj(System.currentTimeMillis(), asVar, str, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.gjv.orl.4
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_lp_pre_render", i10);
                    jSONObject.put("meta_pre_render", asVar.aj() ? 1 : 0);
                    com.bytedance.sdk.openadsdk.core.model.xn xnVarTgn = asVar.tgn();
                    if (xnVarTgn == null) {
                        xnVarTgn = new com.bytedance.sdk.openadsdk.core.model.xn();
                    }
                    jSONObject.put("pre_render_status", xnVarTgn.qor());
                    jSONObject.put("pre_render_use_gecko", xnVarTgn.hn());
                    jSONObject.put("pre_render_add_type", xnVarTgn.hnj());
                    jSONObject.put("is_reused", z10 ? 1 : 0);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public void hnj(String str, long j10) {
        if (!this.orp || this.tu == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", this.dnm);
            jSONObject.put("error_msg", this.orl);
            jSONObject.put("error_url", this.mjg);
            int i10 = this.f14399xo;
            if (i10 >= 0) {
                jSONObject.put("preload_status", i10);
            }
            jSONObject.put("first_page", ta());
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            if (TextUtils.isEmpty(str)) {
                str = this.tu.xe();
            }
            jSONObject.put("url", str);
            jSONObject.put("preload_h5_type", this.tu.sq());
        } catch (Exception unused) {
        }
        hnj("load_finish", jSONObject, Math.min(j10, TTAdConstant.AD_MAX_EVENT_TIME));
    }
}
