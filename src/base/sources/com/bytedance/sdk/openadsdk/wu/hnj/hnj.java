package com.bytedance.sdk.openadsdk.wu.hnj;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.hnj.fc;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.core.widget.hnj.sk;
import com.bytedance.sdk.openadsdk.core.widget.ojm;
import com.bytedance.sdk.openadsdk.core.widget.ta;
import com.bytedance.sdk.openadsdk.orl.dkl;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.xn;
import com.bytedance.sdk.openadsdk.wu.aq;
import com.bytedance.sdk.openadsdk.wu.dse;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private hn apu;
    private String aq;
    private int as;
    private boolean bug;
    private ta dkl;
    private dkl dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private long f54do;
    private ua dse;
    private boolean eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f14788fc;
    private final int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Context f14789hn;
    protected com.bytedance.sdk.component.ojm.dkl hnj;
    private AtomicBoolean jip;
    private volatile boolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private ojm f14790oj;
    private final String ojm;
    private volatile boolean orl;
    private final as qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final FrameLayout f14791sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private aq f14792ta;
    private InterfaceC0257hnj tgn;
    private StringBuilder tu;
    private AtomicBoolean uua;
    private int wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.qor.hnj f14793xn;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void hnj();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.wu.hnj.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0257hnj {
        void hnj(int i10);
    }

    public hnj(Context context, as asVar, int i10, boolean z10, FrameLayout frameLayout) {
        this(context, asVar, i10, z10, frameLayout, false);
    }

    public hnj(Context context, as asVar, int i10, boolean z10, FrameLayout frameLayout, boolean z11) {
        this(context, asVar, i10, z10, frameLayout, z11, 0);
    }

    private void aq() {
        this.hnj.setWebViewClient(new sk(oj.hnj(), this.dse, this.qor.sp(), null, true) { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (hnj.this.f14792ta != null) {
                    hnj.this.f14792ta.ojm(str);
                }
                if (hnj.this.bug) {
                    hnj.this.hnj(0, 0);
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), hnj.this.qor, hnj.this.aq, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
                hnj.this.bug = false;
                if (hnj.this.f14792ta != null) {
                    hnj.this.f14792ta.dkl(com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(hnj.this.qor));
                    hnj.this.f14792ta.hnj(i10, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    hnj.this.bug = false;
                    if (hnj.this.f14792ta != null) {
                        hnj.this.f14792ta.dkl(com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(hnj.this.qor));
                        hnj.this.f14792ta.hnj(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (hnj.this.qor.pwt() != null && !TextUtils.isEmpty(hnj.this.qor.pwt().C())) {
                        if (hnj.this.f14792ta != null) {
                            hnj.this.f14792ta.ta(str);
                        }
                        String strBug = hqh.bug(hnj.this.qor);
                        WebResourceResponse webResourceResponseHnj = com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(hnj.this.qor.pwt().C(), strBug, str);
                        if (webResourceResponseHnj == null) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        if (hnj.this.f14792ta != null) {
                            hnj.this.f14792ta.dnm(str);
                        }
                        return webResourceResponseHnj;
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    hnj.this.bug = false;
                    if (hnj.this.f14792ta == null || webResourceError == null) {
                        return;
                    }
                    hnj.this.f14792ta.dkl(com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(hnj.this.qor));
                    hnj.this.f14792ta.hnj(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }
        });
        this.hnj.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.hnj.gjv(this.dse) { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.gjv, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.gjv, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (hnj.this.dkl == null || hnj.this.dkl.getVisibility() != 0) {
                    return;
                }
                hnj.this.dkl.setProgress(i10);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hnj(this.f14789hn).hnj(false).hn(false).hnj(this.hnj.getWebView());
        com.bytedance.sdk.component.ojm.dkl dklVar = this.hnj;
        dklVar.setUserAgentString(xn.hnj(dklVar.getWebView(), BuildConfig.VERSION_CODE));
        this.hnj.setMixedContentMode(0);
    }

    private void qor(boolean z10) {
        fc fcVarHn;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.qor.sp());
            jSONObject.put("log_extra", this.qor.ldn());
        } catch (Throwable unused) {
        }
        if (com.bytedance.sdk.openadsdk.core.ta.hn().fc()) {
            dse.hnj(new dse.hnj() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.1
            });
        }
        aq aqVarHnj = aq.hnj(oj.hnj(), this.hnj.getWebView(), new com.bytedance.sdk.openadsdk.wu.qor() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.2
            @Override // com.bytedance.sdk.openadsdk.wu.qor
            public void hnj(String str, JSONObject jSONObject2) {
                if (hnj.this.dse != null) {
                    hnj.this.dse.hnj(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.wu.hnj() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.3
            @Override // com.bytedance.sdk.openadsdk.wu.hnj
            public void hn() {
                hnj.this.dse.hn(true);
                if (hnj.this.dnm != null) {
                    hnj.this.dnm.hnj();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.wu.hnj
            public com.bytedance.sdk.openadsdk.wu.gjv hnj() {
                String strDkl = com.bytedance.sdk.openadsdk.common.qor.dkl();
                strDkl.getClass();
                switch (strDkl) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.wu.gjv.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.wu.gjv.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.wu.gjv.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.wu.gjv.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.wu.gjv.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.wu.gjv.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.wu.hnj
            public void qor() {
                if (hnj.this.dse.mjg() != null) {
                    hnj.this.dse.mjg().hnj(true);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.wu.hnj
            public void hnj(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), hnj.this.qor, hnj.this.aq, "playable_track", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.3.1
                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject hnj() {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (!hnj.this.qor.hjf()) {
                                return jSONObject3;
                            }
                            jSONObject3.put("is_pre_render", 1);
                            return jSONObject3;
                        } catch (JSONException e10) {
                            apu.qor("PlayableManager", e10.getMessage());
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject qor() {
                        return jSONObject2;
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.wu.hnj
            public void hnj(int i10, String str) {
                hnj.this.bug = false;
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    hnj.this.hnj(2, i10);
                } else if (i10 == 5) {
                    hnj.this.hnj(3, i10);
                } else {
                    hnj.this.hnj(1, 0);
                }
            }
        });
        this.f14792ta = aqVarHnj;
        aqVarHnj.dse(this.ojm).sk(com.bytedance.sdk.openadsdk.common.qor.hnj(oj.hnj())).hn(com.bytedance.sdk.openadsdk.common.qor.sk()).hnj(com.bytedance.sdk.openadsdk.common.qor.hnj()).gjv(com.bytedance.sdk.openadsdk.common.qor.gjv()).qor(jSONObject).qor(hqh.ta(this.qor)).gjv(true).hnj(z10).qor(false).hnj(hqh.uua(this.qor)).hn(hqh.uua(this.qor)).hnj("sdkEdition", com.bytedance.sdk.openadsdk.common.qor.qor()).sk(hqh.dkl(this.qor)).dkl(this.aq);
        this.f14792ta.hnj(com.bytedance.sdk.openadsdk.wu.sk.hn(this.f14789hn));
        Set<String> setDnm = this.f14792ta.dnm();
        final WeakReference weakReference = new WeakReference(this.f14792ta);
        for (String str : setDnm) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (fcVarHn = this.dse.hn()) != null) {
                fcVarHn.hnj(str, new com.bytedance.sdk.component.hnj.gjv<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.4
                    @Override // com.bytedance.sdk.component.hnj.gjv
                    public JSONObject hnj(String str2, JSONObject jSONObject2, com.bytedance.sdk.component.hnj.sk skVar) {
                        try {
                            aq aqVar = (aq) weakReference.get();
                            if (aqVar == null) {
                                return null;
                            }
                            return aqVar.gjv(hnj(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    public boolean dkl() {
        ua uaVar = this.dse;
        if (uaVar != null) {
            return uaVar.dkl();
        }
        return false;
    }

    public ua dse() {
        return this.dse;
    }

    public void gjv() {
        aq aqVar = this.f14792ta;
        if (aqVar != null) {
            aqVar.fvt();
        }
        com.bytedance.sdk.component.ojm.dkl dklVar = this.hnj;
        if (dklVar != null) {
            dklVar.jip();
        }
        ua uaVar = this.dse;
        if (uaVar != null) {
            uaVar.bug();
        }
        this.f54do = System.currentTimeMillis();
        this.tu = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb2 = this.tu;
                sb2.append(stackTraceElement);
                sb2.append("\n");
            }
        } catch (Throwable th2) {
            apu.hnj("PlayableManager", "onDestroy() error", th2);
        }
        this.hnj = null;
    }

    public void hn() {
        aq aqVar;
        if (!this.jip.get() || (aqVar = this.f14792ta) == null) {
            return;
        }
        aqVar.qor(true);
    }

    public boolean sk() {
        return this.orl;
    }

    public hnj(Context context, as asVar, int i10, boolean z10, FrameLayout frameLayout, boolean z11, int i11) {
        this.bug = true;
        this.jip = new AtomicBoolean(false);
        this.uua = new AtomicBoolean(false);
        this.as = 0;
        this.f54do = 0L;
        this.f14789hn = context;
        this.qor = asVar;
        this.wu = i11;
        if (asVar != null && asVar.gjv() != null && asVar.gjv().gjv() != null) {
            this.as = asVar.gjv().gjv().size();
        }
        this.gjv = i10;
        String strQor = orp.qor(asVar.aip().getDurationSlotType());
        this.aq = strQor;
        int iHnj = orp.hnj(strQor);
        this.eum = z11;
        if (z11) {
            this.aq = orp.hn(iHnj);
        }
        this.ojm = hqh.bug(asVar);
        this.f14791sk = frameLayout;
        hnj(frameLayout);
        hnj(iHnj);
        qor(z10);
        aq();
    }

    public void hnj(InterfaceC0257hnj interfaceC0257hnj) {
        this.tgn = interfaceC0257hnj;
    }

    private void hnj(FrameLayout frameLayout) {
        com.bytedance.sdk.component.ojm.dkl dklVar = new com.bytedance.sdk.component.ojm.dkl(this.f14789hn, true, com.bytedance.sdk.component.ojm.dkl.qor.PLAYABLE);
        this.hnj = dklVar;
        dklVar.sk();
        this.hnj.setLayerType(2, null);
        this.hnj.setVisibility(4);
        this.hnj.setBackgroundColor(-16777216);
        this.hnj.setEnabled(true);
        this.hnj.setTag(this.aq);
        this.hnj.setMaterialMeta(this.qor.pf());
        this.hnj.setLandingPage(true);
        frameLayout.addView(this.hnj, new FrameLayout.LayoutParams(-1, -1));
        ojm ojmVar = new ojm(this.f14789hn);
        this.f14790oj = ojmVar;
        ojmVar.hnj(this.qor, this.aq, this.f14793xn, this.eum);
        frameLayout.addView(this.f14790oj, new FrameLayout.LayoutParams(-1, -1));
        if (this.qor.qm()) {
            ta taVar = new ta(this.f14789hn);
            this.dkl = taVar;
            taVar.hn();
            frameLayout.addView(this.dkl, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void hn(boolean z10) {
        aq aqVar = this.f14792ta;
        if (aqVar != null) {
            aqVar.sk(z10);
        }
    }

    private void hnj(int i10) {
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.dse = new ua(this.f14789hn);
        String strNl = this.qor.nl();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", this.qor.dzo());
            jSONObject.put("currentIndex", this.wu);
            jSONObject.put("totalAdCount", this.as);
        } catch (JSONException unused) {
        }
        this.dse.hn(this.hnj).hnj(this.qor).hnj(com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj(this.qor, true, jSONObject)).qor(this.qor.sp()).gjv(this.qor.ldn()).hn(i10).sk(strNl).hnj(this.hnj).hn(this.aq).hnj(map).hnj(new com.bytedance.sdk.openadsdk.gjv.xn(3, this.aq, this.qor));
    }

    public void qor() {
        aq aqVar;
        if (!this.jip.get() || (aqVar = this.f14792ta) == null) {
            return;
        }
        aqVar.qor(false);
    }

    public void hnj(boolean z10, dkl dklVar) {
        this.dnm = dklVar;
        this.f14792ta.hn(z10);
        com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hn(this.qor);
        this.hnj.a_(this.ojm);
        aq aqVar = this.f14792ta;
        if (aqVar != null) {
            aqVar.dkl(com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(this.qor));
            this.f14792ta.aq(this.ojm);
        }
    }

    public void hnj() {
        ta taVar;
        final boolean z10 = true;
        if (this.jip.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.f14791sk;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (!this.mjg && (taVar = this.dkl) != null) {
            taVar.hn(this.qor, this.gjv);
            aq aqVar = this.f14792ta;
            if (aqVar != null) {
                aqVar.nyv();
            }
        } else {
            this.f14792ta.qor(true);
            ua uaVar = this.dse;
            if (uaVar != null && uaVar.mjg() != null) {
                this.dse.mjg().sk();
            }
            InterfaceC0257hnj interfaceC0257hnj = this.tgn;
            if (interfaceC0257hnj != null) {
                interfaceC0257hnj.hnj(this.f14788fc);
            }
            z10 = false;
        }
        if (this.f14792ta != null) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), this.qor, this.aq, "playable_track", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.7
                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject hnj() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", hnj.this.f14792ta.jbd());
                        jSONObject.put("has_loading", z10);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject qor() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
            this.f14792ta.dkl(com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(this.qor));
        }
        com.bytedance.sdk.component.ojm.dkl dklVar = this.hnj;
        if (dklVar != null) {
            dklVar.setVisibility(0);
        } else {
            com.bytedance.sdk.openadsdk.jip.gjv.hnj("plb_npe_crash", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.8
                @Override // com.bytedance.sdk.openadsdk.jip.hn
                public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    if (hnj.this.tu != null) {
                        jSONObject.put("destroy_stack_trace", hnj.this.tu.toString());
                    }
                    jSONObject.put("destroy_ts", hnj.this.f54do);
                    return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("plb_npe_crash").hn(jSONObject.toString());
                }
            });
        }
    }

    public void hnj(final int i10, final int i11) {
        InterfaceC0257hnj interfaceC0257hnj;
        aq aqVar;
        hn hnVar;
        if (this.mjg) {
            return;
        }
        this.mjg = true;
        this.f14788fc = i10;
        if (i10 == 2) {
            this.orl = true;
            this.f14792ta.hnj(3);
        } else if (i10 == 1) {
            this.orl = true;
            this.f14792ta.hnj(2);
        } else if (i10 == 3) {
            this.orl = true;
            this.f14792ta.hnj(4);
        } else if (i10 == 0) {
            this.f14792ta.hnj(1);
        }
        if (this.orl && (hnVar = this.apu) != null) {
            hnVar.hnj();
        }
        if (this.jip.get() && (aqVar = this.f14792ta) != null) {
            aqVar.qor(true);
        }
        ua uaVar = this.dse;
        if (uaVar != null && uaVar.mjg() != null) {
            this.dse.mjg().sk();
        }
        if (!this.orl && (interfaceC0257hnj = this.tgn) != null) {
            interfaceC0257hnj.hnj(i10);
        }
        ta taVar = this.dkl;
        if (taVar != null) {
            taVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.9
                @Override // java.lang.Runnable
                public void run() {
                    if (hnj.this.orl) {
                        hnj.this.f14790oj.setVisibility(0);
                        if (hnj.this.tgn != null) {
                            hnj.this.tgn.hnj(i10);
                        }
                        hnj.this.hnj(true);
                    }
                    hnj.this.f14792ta.dse(hnj.this.orl);
                    hnj.this.dkl.qor();
                    if (hnj.this.jip.get()) {
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), hnj.this.qor, hnj.this.aq, "playable_track", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hnj.9.1
                            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                            public JSONObject hnj() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i10);
                                    jSONObject.put("remove_loading_page_reason", i11);
                                    jSONObject.put("playable_url", hnj.this.ojm);
                                    jSONObject.put("duration", hnj.this.dkl.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                            public JSONObject qor() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }
                        });
                    }
                }
            });
        }
    }

    public void hnj(boolean z10) {
        aq aqVar = this.f14792ta;
        if (aqVar != null) {
            aqVar.hnj(z10);
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar) {
        this.f14793xn = hnjVar;
        ta taVar = this.dkl;
        if (taVar != null && taVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.dkl.aq downloadButton = this.dkl.getDownloadButton();
            downloadButton.setOnClickListener(hnjVar);
            downloadButton.setOnTouchListener(hnjVar);
        }
        ojm ojmVar = this.f14790oj;
        if (ojmVar != null) {
            ojmVar.setClickListener(hnjVar);
        }
    }

    public void hnj(hn hnVar) {
        this.apu = hnVar;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        ua uaVar = this.dse;
        if (uaVar != null) {
            uaVar.hnj(hnVar);
        }
    }
}
