package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends com.bytedance.sdk.component.ojm.dkl implements com.bytedance.sdk.openadsdk.core.ojm.qor.InterfaceC0227qor {
    private as aq;
    private int bug;
    AtomicBoolean dkl;
    private String dnm;
    AtomicBoolean dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f14075fc;
    protected boolean gjv;
    private long jip;
    private hn mjg;
    private qor ojm;
    private List<String> orl;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected boolean f14076sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.as f14077ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void hn();

        View hnj();

        void hnj(int i10, int i11);

        void hnj(View view, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class hnj extends com.bytedance.sdk.component.ojm.dkl.hnj {
        public static final Set<String> hnj = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ojm.sk.hnj.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        com.bytedance.sdk.openadsdk.core.ojm.qor.InterfaceC0227qor f14078hn;

        public hnj(com.bytedance.sdk.openadsdk.core.ojm.qor.InterfaceC0227qor interfaceC0227qor) {
            this.f14078hn = interfaceC0227qor;
        }

        private void hnj(String str) {
            int iLastIndexOf;
            com.bytedance.sdk.openadsdk.core.ojm.qor.InterfaceC0227qor interfaceC0227qor;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!hnj.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0227qor = this.f14078hn) == null) {
                    return;
                }
                interfaceC0227qor.hn(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            com.bytedance.sdk.openadsdk.core.ojm.qor.InterfaceC0227qor interfaceC0227qor = this.f14078hn;
            if (interfaceC0227qor != null) {
                interfaceC0227qor.hnj();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                hnj(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            hnj(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f14078hn.hnj(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            hnj(webResourceRequest.getUrl().toString());
        }

        private void hnj(String str, int i10, String str2) {
            com.bytedance.sdk.openadsdk.core.ojm.qor.InterfaceC0227qor interfaceC0227qor = this.f14078hn;
            if (interfaceC0227qor != null) {
                interfaceC0227qor.hnj(106, i10);
            }
        }
    }

    public sk(Context context) {
        super(context, com.bytedance.sdk.component.ojm.dkl.qor.DSP);
        this.gjv = false;
        this.f14076sk = false;
        this.dkl = new AtomicBoolean(false);
        this.dse = new AtomicBoolean(false);
        this.bug = 0;
    }

    private void eum() {
        if (this.orl == null) {
            com.bytedance.sdk.openadsdk.gjv.qor.hn(this.f14077ta, this.dnm, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(new com.bytedance.sdk.component.aq.hn.qor("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.ojm.sk.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (sk.this.orl != null && sk.this.dse.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = sk.this.orl.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.gjv.qor.hn(sk.this.f14077ta, sk.this.dnm, "dsp_html_error_url", jSONObject);
                            sk.this.orl = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void apu() {
        this.dkl.set(false);
        String strCbn = this.f14077ta.cbn();
        if (TextUtils.isEmpty(strCbn)) {
            return;
        }
        String strHnj = com.bytedance.sdk.openadsdk.core.orl.sk.hnj(strCbn);
        String str = TextUtils.isEmpty(strHnj) ? strCbn : strHnj;
        this.bug = 0;
        hnj(null, str, "text/html", C.UTF8_NAME, null);
        this.jip = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.component.ojm.dkl
    public void jip() {
        this.ojm.hn();
        super.jip();
    }

    @Override // com.bytedance.sdk.component.ojm.dkl, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.gjv) {
            this.ojm.hnj(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.ojm.dkl, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.ojm.hnj();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.f14075fc / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.f14077ta, this.dnm, "load_rate", jSONObject);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z10 = i10 == 0;
        this.f14076sk = z10;
        this.ojm.hnj(z10);
    }

    public void xn() {
        hn hnVar = this.mjg;
        if (hnVar != null) {
            hnVar.hn();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.jip);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.f14077ta, this.dnm, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.qor.InterfaceC0227qor
    public void hn(String str) {
        if (this.orl == null) {
            this.orl = new ArrayList();
        }
        this.orl.add(str);
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, hn hnVar, String str) {
        this.mjg = hnVar;
        this.f14077ta = asVar;
        this.dnm = str;
        this.ojm = new qor();
        this.aq = new as(getContext());
        setWebViewClient(new hnj(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.ojm.sk.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                sk.this.f14075fc = i10;
                super.onProgressChanged(webView, i10);
                if (i10 >= 100) {
                    sk.this.hnj();
                }
            }
        });
        com.bytedance.sdk.component.utils.ojm.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.sk.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = sk.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.ojm.sk.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            sk.this.aq.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class qor {
        protected int hnj = 0;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.core.orl.dkl f14079hn = com.bytedance.sdk.openadsdk.core.orl.dkl.hnj();

        qor() {
        }

        public void hn() {
            hnj();
        }

        public void hnj(WebView webView) {
            if (webView != null && this.hnj == 0) {
                if (this.f14079hn == null) {
                    this.f14079hn = com.bytedance.sdk.openadsdk.core.orl.dkl.hnj();
                }
                this.f14079hn.hnj(webView);
                this.f14079hn.hn();
                this.hnj = 1;
            }
        }

        public void hnj(boolean z10) {
            com.bytedance.sdk.openadsdk.core.orl.dkl dklVar;
            if (this.hnj == 1 && z10 && (dklVar = this.f14079hn) != null) {
                dklVar.qor();
                this.hnj = 3;
            }
        }

        public void hnj(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.orl.dkl dklVar = this.f14079hn;
            if (dklVar != null) {
                dklVar.hnj(view, friendlyObstructionPurpose);
            }
        }

        public void hnj() {
            com.bytedance.sdk.openadsdk.core.orl.dkl dklVar;
            int i10 = this.hnj;
            if (i10 != 0 && i10 != 4 && (dklVar = this.f14079hn) != null) {
                dklVar.gjv();
            }
            this.hnj = 4;
            this.f14079hn = null;
        }
    }

    public void hnj(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.ojm.hnj(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.qor.InterfaceC0227qor
    public void hnj(String str) {
        boolean zHnj;
        if (TextUtils.isEmpty(str) || this.f14077ta == null || !this.aq.hn()) {
            return;
        }
        int iHnj = orp.hnj(this.dnm);
        View viewHnj = null;
        if (!com.bytedance.sdk.component.utils.oj.hnj(str) && (this.f14077ta.pdc() == null || TextUtils.isEmpty(this.f14077ta.pdc().hnj()))) {
            com.bytedance.sdk.openadsdk.core.model.orl orlVar = new com.bytedance.sdk.openadsdk.core.model.orl();
            orlVar.hnj(str);
            this.f14077ta.hnj(orlVar);
            str = null;
        }
        this.f14077ta.gjv(true);
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.f14077ta;
        if (asVar == null || asVar.pdc() == null || TextUtils.isEmpty(this.f14077ta.pdc().hnj())) {
            zHnj = false;
        } else {
            zHnj = com.bytedance.sdk.openadsdk.core.orp.hnj(getContext(), this.f14077ta, iHnj, this.dnm, true, (Map<String, Object>) null);
            if (!zHnj && !TextUtils.isEmpty(this.f14077ta.pdc().hn())) {
                str = this.f14077ta.pdc().hn();
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.f14077ta, this.dnm, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!zHnj) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.core.orp.hnj(getContext(), this.f14077ta, iHnj, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.gjv.hnj) null, this.dnm, true, str2);
            }
        }
        if (this.aq != null) {
            hn hnVar = this.mjg;
            if (hnVar != null) {
                viewHnj = hnVar.hnj();
                this.mjg.hnj(this, 2);
            }
            com.bytedance.sdk.openadsdk.core.model.bug bugVarHnj = this.aq.hnj(getContext(), viewHnj);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.f14077ta, bugVarHnj, this.dnm, true, (Map<String, Object>) map, this.aq.hn() ? 1 : 2);
        }
        as asVar2 = this.aq;
        if (asVar2 != null) {
            asVar2.hnj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.qor.InterfaceC0227qor
    public void hnj(int i10, int i11) {
        hn hnVar = this.mjg;
        if (hnVar != null) {
            hnVar.hnj(i10, i11);
        }
        this.bug = i11;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i11);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.jip);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.f14077ta, this.dnm, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.qor.InterfaceC0227qor
    public void hnj() {
        if (this.dkl.compareAndSet(false, true)) {
            this.gjv = true;
            this.ojm.hnj(getWebView());
            this.ojm.hnj(this.f14076sk);
            xn();
            eum();
        }
    }
}
