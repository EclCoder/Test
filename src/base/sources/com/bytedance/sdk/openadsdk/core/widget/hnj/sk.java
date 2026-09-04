package com.bytedance.sdk.openadsdk.core.widget.hnj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.oj;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.bug;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.gjv.orl;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.xn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends com.bytedance.sdk.component.ojm.dkl.hnj {
    private static final HashSet<String> eum;
    private as apu;
    protected boolean aq;
    private boolean bug;
    protected orl dkl;
    private Map<String, Object> dnm;
    protected boolean dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final Stack<String> f14283fc;
    protected final Context gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f14284hn;
    private final boolean hnj;
    private boolean jip;
    private String mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.mjg.gjv.hn f14285oj;
    protected boolean ojm;
    private com.bytedance.sdk.openadsdk.common.sk orl;
    protected final ua qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected final String f14286sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private bug f14287ta;
    private TTCeilingLandingPageActivity.hnj uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private JSONObject f14288xn;

    static {
        HashSet<String> hashSet = new HashSet<>();
        eum = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public sk(Context context, ua uaVar, String str, com.bytedance.sdk.openadsdk.common.sk skVar, orl orlVar, boolean z10, boolean z11, TTCeilingLandingPageActivity.hnj hnjVar) {
        this(context, uaVar, str, skVar, orlVar, z10);
        this.jip = z11;
        this.uua = hnjVar;
    }

    public static String gjv(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !eum.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(strSubstring);
    }

    private boolean sk(String str) {
        if (apu.ta(this.apu)) {
            return TextUtils.equals(this.apu.td(), str);
        }
        return false;
    }

    public orl hn() {
        return this.dkl;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        orl orlVar = this.dkl;
        if (orlVar != null) {
            orlVar.hnj(webView, str, this.hnj);
        }
        com.bytedance.sdk.openadsdk.common.sk skVar = this.orl;
        if (skVar != null) {
            skVar.hn(webView, str, this.hnj);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2;
        String str2;
        as asVar;
        super.onPageStarted(webView, str, bitmap);
        as asVar2 = this.apu;
        int iHnj = (asVar2 != null && asVar2.hw() && com.bytedance.sdk.openadsdk.as.sk.hnj("opt_web_index", false)) ? orp.hnj(webView) : -1;
        orl orlVar = this.dkl;
        if (orlVar != null) {
            webView2 = webView;
            str2 = str;
            orlVar.hnj(webView2, str2, bitmap, this.hnj, iHnj);
        } else {
            webView2 = webView;
            str2 = str;
        }
        com.bytedance.sdk.openadsdk.common.sk skVar = this.orl;
        if (skVar != null) {
            skVar.qor(webView2, str2, this.hnj);
        }
        if (this.hnj && (asVar = this.apu) != null && asVar.hw() && this.apu.tu().hn() >= 2) {
            if (!TextUtils.isEmpty(str2) && !str2.equals(this.mjg)) {
                if (this.f14283fc.contains(str2)) {
                    while (!str2.equals(this.f14283fc.peek())) {
                        this.f14283fc.pop();
                    }
                } else {
                    this.f14283fc.push(str2);
                }
            }
            this.mjg = str2;
        }
        if (!this.aq || this.ojm) {
            return;
        }
        this.ojm = true;
        qor.hnj(this.gjv).hnj(true).hn(webView2.getSettings().getBuiltInZoomControls()).hnj(webView2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.dkl == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.dkl.hnj(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.dkl != null) {
            int primaryError = 0;
            String strConcat = "SslError: unknown";
            String url = null;
            if (sslError != null) {
                try {
                    primaryError = sslError.getPrimaryError();
                    strConcat = "SslError: ".concat(String.valueOf(sslError));
                    url = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str = url;
            this.dkl.hnj(webView, primaryError, strConcat, str, gjv(str), true);
        }
    }

    @Override // com.bytedance.sdk.component.ojm.dkl.hnj, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.sk.sk.hnj().hn();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void qor() {
        if (TextUtils.isEmpty(this.f14284hn) || !apu.ojm(this.apu) || this.bug) {
            return;
        }
        bug bugVar = this.f14287ta;
        if (bugVar != null) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.apu, bugVar, this.f14284hn, true, this.dnm, 1);
            this.bug = true;
            return;
        }
        JSONObject jSONObject = this.f14288xn;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.apu, this.f14284hn, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
            this.bug = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, final String str) {
        sk skVar;
        String str2;
        ua uaVar;
        Intent uri;
        orl orlVar = this.dkl;
        if (orlVar != null) {
            orlVar.hnj(str, this.hnj);
        }
        com.bytedance.sdk.openadsdk.common.sk skVar2 = this.orl;
        if (skVar2 != null) {
            skVar2.hnj(webView, str, this.hnj);
        }
        if (hnj(webView, str)) {
            return true;
        }
        as asVar = this.apu;
        if (asVar != null && asVar.oj() == 1 && ((com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.hnj(str, this.apu) || com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.hnj(this.apu, str)) && com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.hn(this.apu, this.gjv, true))) {
            return true;
        }
        try {
            Uri uri2 = Uri.parse(str);
            final String lowerCase = uri2.getScheme().toLowerCase();
            if ("bytedance".equals(lowerCase)) {
                xn.hnj(uri2, this.qor);
                return true;
            }
            if (qor(str)) {
                return true;
            }
            if (oj.hnj(str)) {
                str2 = str;
                return super.shouldOverrideUrlLoading(webView, str2);
            }
            if (apu.ta(this.apu)) {
                hnj(lowerCase, str);
                return true;
            }
            try {
                if (str.startsWith("intent:")) {
                    uri = Intent.parseUri(str, 1);
                } else if (str.startsWith("android-app:")) {
                    uri = Intent.parseUri(str, 2);
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(uri2);
                    uri = intent;
                }
                uri.addFlags(268435456);
                com.bytedance.sdk.component.utils.hn.hnj(this.gjv, uri, new com.bytedance.sdk.component.utils.hn.InterfaceC0195hn() { // from class: com.bytedance.sdk.openadsdk.core.widget.hnj.sk.1
                    @Override // com.bytedance.sdk.component.utils.hn.InterfaceC0195hn
                    public void hnj() {
                        sk.this.hnj(lowerCase, true, 0, "", str);
                    }

                    @Override // com.bytedance.sdk.component.utils.hn.InterfaceC0195hn
                    public void hnj(Throwable th2) {
                        sk.this.hnj(lowerCase, false, 2, th2.getMessage(), str);
                    }
                });
                skVar = this;
                str2 = str;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.hnj("WebChromeClient", "parseUri", th2);
                skVar = this;
                str2 = str;
                try {
                    skVar.hnj(lowerCase, false, 1, th2.getMessage(), str2);
                } catch (Throwable unused) {
                    uaVar = skVar.qor;
                    if (uaVar != null) {
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView, str2);
                }
            }
            com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar = skVar.f14285oj;
            if (hnVar != null) {
                hnVar.fr();
            }
            return true;
        } catch (Throwable unused2) {
            skVar = this;
            str2 = str;
            uaVar = skVar.qor;
            if (uaVar != null && uaVar.sk()) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str2);
        }
    }

    public boolean hn(String str) {
        String strQor;
        String strHnj;
        if (this.gjv == null) {
            return false;
        }
        as asVar = this.apu;
        if (asVar == null || asVar.zyh() == null) {
            strQor = "";
            strHnj = "";
        } else {
            strQor = this.apu.zyh().qor();
            strHnj = this.apu.zyh().hnj();
        }
        Context context = this.gjv;
        as asVar2 = this.apu;
        return com.bytedance.sdk.openadsdk.eum.hnj.hnj.hnj.hnj(context, str, asVar2, orp.hn(asVar2), null, true) || com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.hnj(this.apu, strQor, this.gjv, this.f14284hn, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.hnj(this.gjv, strHnj, strQor, this.f14284hn, this.apu);
    }

    public void hnj(bug bugVar) {
        this.f14287ta = bugVar;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.dkl == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.dkl.hnj(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        orl orlVar = this.dkl;
        if (orlVar != null) {
            orlVar.hn(webView, str, this.hnj);
        }
        com.bytedance.sdk.openadsdk.common.sk skVar = this.orl;
        if (skVar != null) {
            skVar.hnj(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public void hnj(Map<String, Object> map) {
        this.dnm = map;
    }

    public sk(Context context, ua uaVar, String str, com.bytedance.sdk.openadsdk.common.sk skVar, orl orlVar, boolean z10) {
        this(context, uaVar, str, orlVar, z10);
        this.orl = skVar;
    }

    public void hnj(JSONObject jSONObject) {
        this.f14288xn = jSONObject;
    }

    public void hnj(String str) {
        this.f14284hn = str;
    }

    public sk(Context context, ua uaVar, String str, orl orlVar, boolean z10) {
        this.dse = true;
        this.aq = true;
        this.ojm = false;
        this.gjv = context;
        this.qor = uaVar;
        this.f14286sk = str;
        this.dkl = orlVar;
        this.hnj = z10;
        this.f14283fc = new Stack<>();
    }

    public void hnj(as asVar) {
        this.apu = asVar;
    }

    private void hnj(String str, String str2) {
        if ((sk(str) || "market".equals(str)) && ((this.f14287ta != null || this.f14288xn != null) && hn(str2))) {
            qor();
        }
        this.f14287ta = null;
        this.f14288xn = null;
    }

    public boolean qor(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (apu.ta(this.apu) && this.f14288xn == null && this.f14287ta == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.gjv instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.gjv.startActivity(intent);
                qor();
                this.f14288xn = null;
                this.f14287ta = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean hnj(WebView webView, String str) {
        if (!orp.gjv(this.apu) || this.apu.tu() == null || webView == null) {
            return false;
        }
        int iHn = this.apu.tu().hn();
        int size = this.f14283fc.size();
        if (this.jip) {
            size++;
        }
        if (size + 1 != iHn) {
            return false;
        }
        com.bytedance.sdk.openadsdk.utils.as.hnj(this.gjv, str, this.apu, com.bytedance.sdk.openadsdk.gjv.hn.hnj.gjv, true);
        TTCeilingLandingPageActivity.hnj hnjVar = this.uua;
        if (hnjVar != null) {
            hnjVar.hnj();
        }
        return true;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        this.f14285oj = hnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final String str, final boolean z10, final int i10, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), this.apu, this.f14284hn, "lp_not_http_open", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.widget.hnj.sk.2
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z10);
                    jSONObject.put("error_type", i10);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
