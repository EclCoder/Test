package com.bytedance.sdk.openadsdk.core.ojm;

import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ul;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ojm.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Cdo extends com.bytedance.sdk.component.adexpress.sk.hnj {
    private ta apu;
    private Context aq;
    private com.bytedance.sdk.openadsdk.gjv.gjv.sk bug;
    private JSONObject dnm;
    com.bytedance.sdk.openadsdk.utils.hnj dse;
    private final com.bytedance.sdk.component.aq.hn.qor eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final Map<String, com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor> f14049fc;
    private ua jip;
    private com.bytedance.sdk.openadsdk.gjv.orl mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.as.hnj f14050oj;
    private String ojm;
    private String orl;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.as f14051ta;
    private com.bytedance.sdk.component.adexpress.hn.dse uua;
    private final Runnable wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private volatile int f14052xn;

    public Cdo(Context context, com.bytedance.sdk.component.adexpress.hn.orl orlVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        super(context, orlVar, themeStatusBroadcastReceiver);
        this.f14049fc = Collections.synchronizedMap(new HashMap());
        this.f14052xn = 0;
        this.eum = new com.bytedance.sdk.component.aq.hn.qor("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.ojm.do.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.sk.hnj) Cdo.this).dkl.get()) {
                    return;
                }
                Cdo cdo = Cdo.this;
                cdo.dnm = cdo.dnm().qor();
                Cdo cdo2 = Cdo.this;
                cdo2.hnj(cdo2.dnm);
                if (Cdo.this.f14052xn == 0) {
                    Cdo.this.uua();
                }
                com.bytedance.sdk.openadsdk.core.fc.qor().post(Cdo.this.wu);
            }
        };
        this.wu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.do.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.sk.hnj) Cdo.this).dkl.get() || Cdo.this.uua == null) {
                    return;
                }
                Cdo.this.bug();
                Cdo cdo = Cdo.this;
                Cdo.super.hnj(cdo.uua);
            }
        };
        if (this.gjv == null) {
            return;
        }
        this.aq = context;
        this.ojm = orlVar.gjv();
        this.f14051ta = asVar;
        this.bug = skVar;
        themeStatusBroadcastReceiver.hnj(this);
        uua();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oj() {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.gjv;
        if (dklVar == null || dklVar.getWebView() == null || this.f14052xn == 2) {
            return;
        }
        this.orl = hnj(this.f14051ta);
        this.gjv.setDisplayZoomControls(false);
        hnj(ul.hnj(this.orl));
        orl();
        ua uaVar = new ua(this.aq);
        this.jip = uaVar;
        uaVar.qor(true);
        mjg();
        this.f14052xn = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uua() {
        if (this.gjv.getWebView() == null || !com.bytedance.sdk.openadsdk.utils.ua.dkl()) {
            this.f14052xn = 1;
            com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.do.3
                @Override // java.lang.Runnable
                public void run() {
                    Cdo.this.oj();
                }
            });
        } else {
            oj();
        }
        if (!mjg.hn(this.f14051ta) || this.f12731hn) {
            return;
        }
        mjg.hnj(this.f14051ta);
    }

    public void bug() {
        ua uaVar;
        com.bytedance.sdk.component.ojm.dkl dklVar = this.gjv;
        if (dklVar == null || dklVar.getWebView() == null || (uaVar = this.jip) == null) {
            return;
        }
        uaVar.hn(this.gjv).hnj(this.f14051ta).qor(this.f14051ta.sp()).gjv(this.f14051ta.ldn()).hn(orp.hnj(this.ojm)).sk(this.f14051ta.nl()).hnj(this).hnj(this.dnm).hnj(this.gjv).hnj(this.bug);
    }

    public ta fc() {
        return this.apu;
    }

    public ua jip() {
        return this.jip;
    }

    public void mjg() {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.gjv;
        if (dklVar == null || dklVar.getWebView() == null) {
            return;
        }
        this.gjv.setBackgroundColor(0);
        this.gjv.setBackgroundResource(R.color.transparent);
        hnj(this.gjv);
        if (hnj() != null) {
            this.mjg = new com.bytedance.sdk.openadsdk.gjv.orl(this.f14051ta, hnj().getWebView()).hn(false);
        }
        this.mjg.hnj(this.bug);
        ta taVar = new ta(this.aq, this.jip, this.f14051ta, this.mjg, dnm());
        this.apu = taVar;
        this.gjv.setWebViewClient(taVar);
        this.gjv.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.hnj.gjv(this.jip, this.mjg));
        com.bytedance.sdk.component.adexpress.sk.sk.hnj().hnj(this.gjv, this.jip);
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.hnj
    public void onThemeChanged(int i10) {
        if (this.jip == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
        } catch (JSONException unused) {
        }
        this.jip.hnj("themeChange", jSONObject);
    }

    public void orl() {
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.f14051ta;
        if (asVar == null || asVar.zd() == null) {
            return;
        }
        this.f14050oj = this.f14051ta.zd();
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj
    protected void ta() {
        super.ta();
        com.bytedance.sdk.openadsdk.utils.hnj hnjVar = this.dse;
        if (hnjVar != null) {
            hnjVar.hn(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj
    public void aq() {
        super.aq();
        if (this.jip == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.jip.hnj("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj
    public void dkl() {
        if (hnj() == null) {
            return;
        }
        try {
            hnj().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj
    public void dse() {
        ua uaVar = this.jip;
        if (uaVar == null) {
            return;
        }
        uaVar.hnj("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj
    public void gjv() {
        if (this.dkl.get()) {
            return;
        }
        super.gjv();
        ua uaVar = this.jip;
        if (uaVar != null) {
            uaVar.qor();
            this.jip.bug();
            this.jip = null;
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.mjg;
        if (orlVar != null) {
            orlVar.gjv(false);
        }
        com.bytedance.sdk.openadsdk.core.fc.qor().removeCallbacks(this.wu);
        this.f14049fc.clear();
    }

    public void hn(int i10) {
        if (this.jip == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i10);
            this.jip.hnj("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.WebViewRender", e10.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj
    protected void ojm() {
        super.ojm();
        com.bytedance.sdk.openadsdk.utils.hnj hnjVarSk = com.bytedance.sdk.openadsdk.core.jip.hnj().sk();
        this.dse = hnjVarSk;
        hnjVarSk.hnj(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj, com.bytedance.sdk.component.adexpress.hn.gjv
    public int qor() {
        return this.f14051ta.rq();
    }

    public static String hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        return com.bytedance.sdk.component.adexpress.hnj.hn.hn.gjv((asVar == null || !asVar.bgg()) ? null : "v3");
    }

    private void hn(boolean z10) {
        if (this.jip == null || this.gjv == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z10);
            this.jip.hnj("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj, com.bytedance.sdk.component.adexpress.hn.gjv
    public void hnj(com.bytedance.sdk.component.adexpress.hn.dse dseVar) {
        this.uua = dseVar;
        com.bytedance.sdk.openadsdk.utils.ua.qor((Runnable) this.eum);
    }

    private void hnj(com.bytedance.sdk.component.ojm.dkl dklVar) {
        if (dklVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hnj(this.aq).hnj(false).hnj(dklVar.getWebView());
            dklVar.setVerticalScrollBarEnabled(false);
            dklVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hnj(dklVar);
            dklVar.mjg();
            dklVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xn.hnj(dklVar.getWebView(), BuildConfig.VERSION_CODE));
            dklVar.setMixedContentMode(0);
            dklVar.setJavaScriptEnabled(true);
            dklVar.setJavaScriptCanOpenWindowsAutomatically(true);
            dklVar.setDomStorageEnabled(true);
            dklVar.setDatabaseEnabled(true);
            dklVar.setAllowFileAccess(false);
            dklVar.setSupportZoom(true);
            dklVar.setBuiltInZoomControls(true);
            dklVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            dklVar.setUseWideViewPort(true);
            dklVar.setCacheMode(-1);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.WebViewRender", e10.toString());
        }
    }

    public static boolean hn(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj
    public com.bytedance.sdk.component.ojm.dkl hnj() {
        return this.gjv;
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj
    public void hnj(int i10) {
        if (i10 == this.f12732sk) {
            return;
        }
        this.f12732sk = i10;
        hn(i10 == 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hnj, com.bytedance.sdk.component.adexpress.hn.dnm
    public void hnj(com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
        super.hnj(mjgVar);
        if (this.qor) {
            com.bytedance.sdk.component.utils.ojm.hn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.do.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.sk.hnj) Cdo.this).gjv.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        ua uaVar = this.jip;
        if (uaVar != null) {
            uaVar.hnj(hnVar);
        }
    }
}
