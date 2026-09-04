package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b6.a;
import b6.b;
import com.bytedance.sdk.openadsdk.core.jbd;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua implements com.bytedance.sdk.openadsdk.orl.aq {
    private volatile boolean aq;
    private com.bytedance.sdk.openadsdk.core.qor.dse dkl;
    private final AtomicBoolean dse = new AtomicBoolean(false);
    private ImageView gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final as f13509hn;
    private final Activity hnj;
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj ojm;
    private com.bytedance.sdk.component.ojm.dkl qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13510sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f13511ta;

    public uua(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.ojm = hnjVar;
        this.f13509hn = hnjVar.f13456hn;
        this.hnj = hnjVar.orp;
    }

    private void gjv() {
        this.qor.sk();
        hnj(this.qor);
        this.qor.setDisplayZoomControls(false);
        this.qor.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.uua.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (i10 == 100) {
                    uua.this.qor();
                }
            }
        });
        this.qor.setWebViewClient(new com.bytedance.sdk.component.ojm.dkl.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.uua.4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                uua.this.qor();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    uua.this.hnj(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (uua.this.hnj(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor() {
        hnj(Integer.MAX_VALUE, (String) null);
    }

    public void hn() {
        DeviceUtils.AudioInfoReceiver.hn(this);
        com.bytedance.sdk.component.ojm.dkl dklVar = this.qor;
        if (dklVar != null) {
            jbd.hnj(dklVar.getWebView());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.orl.aq
    public void qor(int i10) {
        int i11 = this.f13511ta;
        if (i11 == 0 && i10 > 0) {
            this.f13509hn.mzt().hnj().ojm(this.ojm.eum.orl());
        } else if (i11 > 0 && i10 == 0) {
            this.f13509hn.mzt().hnj().aq(this.ojm.eum.orl());
        }
        this.f13511ta = i10;
    }

    public void hnj() {
        DeviceUtils.AudioInfoReceiver.hnj(this);
        this.f13511ta = DeviceUtils.dse();
        if (this.f13509hn.mzt() != null) {
            this.dkl = new com.bytedance.sdk.openadsdk.core.qor.dse("VAST_END_CARD", this.f13509hn.mzt()) { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.uua.1
            };
            com.bytedance.sdk.openadsdk.core.orl.qor qorVarQor = this.f13509hn.mzt().qor();
            if (qorVarQor != null) {
                String strGjv = qorVarQor.gjv();
                if (!TextUtils.isEmpty(strGjv)) {
                    this.f13510sk = true;
                    this.gjv = (ImageView) this.ojm.fvt.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f14682ta);
                    hnj(qorVarQor.hnj(), qorVarQor.hn());
                    com.bytedance.sdk.openadsdk.ta.gjv.hnj(strGjv).hnj(qorVarQor.hnj()).hn(qorVarQor.hn()).sk(sq.sk(oj.hnj())).gjv(sq.qor(oj.hnj())).qor(1).hnj(new com.bytedance.sdk.openadsdk.ta.hn(this.f13509hn, strGjv, new hnj(this.gjv, strGjv, this, this.dse)));
                    return;
                }
                com.bytedance.sdk.component.ojm.dkl dklVar = (com.bytedance.sdk.component.ojm.dkl) this.ojm.fvt.findViewById(com.bytedance.sdk.openadsdk.utils.jip.dnm);
                this.qor = dklVar;
                if (dklVar == null) {
                    return;
                }
                gjv();
                String strQor = qorVarQor.qor();
                if (strQor != null) {
                    this.f13510sk = true;
                    if (strQor.startsWith("http")) {
                        this.qor.a_(strQor);
                        return;
                    }
                    String strHnj = com.bytedance.sdk.openadsdk.core.orl.sk.hnj(strQor);
                    String str = TextUtils.isEmpty(strHnj) ? strQor : strHnj;
                    this.qor.setDefaultTextEncodingName("UTF -8");
                    this.qor.hnj(null, str, "text/html", C.UTF8_NAME, null);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements com.bytedance.sdk.component.sk.jip {
        private final AtomicBoolean gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final String f13513hn;
        private final WeakReference<ImageView> hnj;
        private final WeakReference<uua> qor;

        public hnj(ImageView imageView, String str, uua uuaVar, AtomicBoolean atomicBoolean) {
            this.hnj = new WeakReference<>(imageView);
            this.f13513hn = str;
            this.qor = new WeakReference<>(uuaVar);
            this.gjv = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
            uua uuaVar;
            ImageView imageView = this.hnj.get();
            if (imageView == null || (uuaVar = this.qor.get()) == null || dnmVar == null) {
                return;
            }
            Object objHn = dnmVar.hn();
            if (objHn == null) {
                uuaVar.hnj(-1, this.f13513hn);
                return;
            }
            if (objHn instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objHn);
            } else if (objHn instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.a(objHn)) {
                    b.a(objHn).start();
                }
                imageView.setImageDrawable((Drawable) objHn);
            }
            this.gjv.set(true);
            uuaVar.qor();
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(int i10, String str, Throwable th2) {
            uua uuaVar;
            ImageView imageView = this.hnj.get();
            if (imageView == null || (uuaVar = this.qor.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            uuaVar.hnj(-2, this.f13513hn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final int i10, final String str) {
        if (this.aq) {
            return;
        }
        this.aq = true;
        if (i10 == Integer.MAX_VALUE) {
            as asVar = this.f13509hn;
            com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, asVar.sk(), "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(new com.bytedance.sdk.component.aq.hn.qor("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.uua.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i10);
                        jSONObject.put("error_code", i10);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.gjv.qor.hn(uua.this.f13509hn, uua.this.f13509hn.sk(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void hnj(com.bytedance.sdk.component.ojm.dkl dklVar) {
        dklVar.setVerticalScrollBarEnabled(false);
        dklVar.setHorizontalScrollBarEnabled(false);
        dklVar.setMixedContentMode(0);
        dklVar.setJavaScriptEnabled(true);
        dklVar.setJavaScriptCanOpenWindowsAutomatically(true);
        dklVar.setDomStorageEnabled(true);
        dklVar.setDatabaseEnabled(true);
        dklVar.setCacheMode(-1);
        dklVar.setAllowFileAccess(false);
        dklVar.setSupportZoom(true);
        dklVar.setBuiltInZoomControls(true);
        dklVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        dklVar.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(String str) {
        as asVar;
        if (str == null || (asVar = this.f13509hn) == null || asVar.mzt() == null || this.dkl == null) {
            return false;
        }
        this.f13509hn.mzt().dkl(str);
        this.dkl.onClick(this.qor);
        return true;
    }

    private void hnj(int i10, int i11) {
        if (i10 == 0 || i11 == 0 || this.gjv == null) {
            return;
        }
        int iQor = sq.qor((Context) this.hnj);
        int iSk = sq.sk(this.hnj);
        float f10 = i10 / i11;
        float f11 = iQor;
        if (f10 <= f11 / iSk) {
            iQor = (int) Math.ceil(f11 * f10);
        } else {
            iSk = (int) Math.ceil(f11 / f10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.gjv.getLayoutParams();
        layoutParams.width = iQor;
        layoutParams.height = iSk;
        layoutParams.gravity = 17;
        this.gjv.setLayoutParams(layoutParams);
        this.gjv.setOnClickListener(this.dkl);
        this.gjv.setOnTouchListener(this.dkl);
    }

    public boolean hnj(fc fcVar) {
        com.bytedance.sdk.openadsdk.core.orl.qor qorVarQor;
        if (!this.f13510sk) {
            return false;
        }
        if (this.gjv != null && this.dse.get()) {
            this.gjv.setVisibility(0);
        } else {
            com.bytedance.sdk.component.ojm.dkl dklVar = this.qor;
            if (dklVar != null) {
                dklVar.setVisibility(0);
                if (this.qor.getWebView() != null) {
                    this.qor.getWebView().setOnTouchListener(this.dkl);
                }
            }
        }
        as asVar = this.f13509hn;
        if (asVar == null || asVar.mzt() == null || (qorVarQor = this.f13509hn.mzt().qor()) == null) {
            return true;
        }
        qorVarQor.hn(fcVar != null ? fcVar.orl() : -1L);
        return true;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.qor.sk skVar) {
        com.bytedance.sdk.openadsdk.core.qor.dse dseVar = this.dkl;
        if (dseVar != null) {
            dseVar.hnj(skVar);
        }
    }
}
