package com.bytedance.sdk.openadsdk.mjg;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.ojm.dkl;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.core.jip;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.xn;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.widget.hnj.gjv;
import com.bytedance.sdk.openadsdk.core.widget.hnj.qor;
import com.bytedance.sdk.openadsdk.gjv.orl;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.bytedance.sdk.openadsdk.utils.wu;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private static long gjv = 3600000;
    private static volatile hnj hnj = null;
    private static int qor = 2;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Handler f14556hn;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private LinkedHashMap<Integer, SoftReference<dkl>> f14557sk;

    public hnj() {
        qor = sk.hnj("pre_render_count", 2);
        long jHnj = sk.hnj("pre_render_duration", 3600000);
        gjv = jHnj;
        if (qor <= 0) {
            qor = 2;
        }
        if (jHnj <= 0) {
            gjv = 3600000L;
        }
        this.f14557sk = new LinkedHashMap<>();
        this.f14556hn = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.mjg.hnj.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                SoftReference softReference;
                int i10 = message.what;
                if (hnj.this.f14557sk == null || (softReference = (SoftReference) hnj.this.f14557sk.get(Integer.valueOf(i10))) == null) {
                    return false;
                }
                dkl dklVar = (dkl) softReference.get();
                hnj.this.hnj(i10, 2, new as(), dklVar == null ? "" : dklVar.getTag());
                return false;
            }
        });
    }

    public static boolean qor(as asVar) {
        return apu.aq(asVar) || apu.hn(asVar) || apu.qor(asVar);
    }

    public dkl hn(as asVar) {
        if (asVar == null || TextUtils.isEmpty(asVar.xe())) {
            return null;
        }
        String strXe = asVar.xe();
        if (TextUtils.isEmpty(strXe)) {
            return null;
        }
        int iHashCode = strXe.hashCode();
        SoftReference<dkl> softReference = this.f14557sk.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        dkl dklVar = softReference.get();
        hnj(asVar, dklVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - asVar.jfp()).floatValue(), "web_use_pre_render");
        hnj(iHashCode, 3, asVar, dklVar.getTag());
        return dklVar;
    }

    public static hnj hnj() {
        if (hnj == null) {
            synchronized (hnj.class) {
                try {
                    if (hnj == null) {
                        hnj = new hnj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public void hnj(final as asVar) {
        final String str;
        if (asVar == null || !qor(asVar)) {
            return;
        }
        xn xnVarTgn = asVar.tgn();
        if (xnVarTgn == null) {
            xnVarTgn = new xn();
        }
        asVar.aj();
        if (asVar.aj()) {
            String strXe = asVar.xe();
            if (TextUtils.isEmpty(strXe)) {
                return;
            }
            final int iHashCode = strXe.hashCode();
            if (apu.hn(asVar)) {
                str = "landingpage_split_screen";
            } else if (apu.gjv(asVar)) {
                str = "landingpage_direct";
            } else if (apu.qor(asVar)) {
                str = "landingpage_split_ceiling";
            } else {
                str = "";
            }
            LinkedHashMap<Integer, SoftReference<dkl>> linkedHashMap = this.f14557sk;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                HashMap map = new HashMap();
                map.put(asVar.rx(), asVar);
                if (xnVarTgn.hn() == 2) {
                    com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj((Map<String, as>) map, new com.bytedance.sdk.openadsdk.dse.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.mjg.hnj.2
                        @Override // com.bytedance.sdk.openadsdk.dse.hn.hnj
                        public void hnj() {
                            hnj.this.hnj(iHashCode, asVar, str, true);
                        }
                    }, true);
                    return;
                }
                if (xnVarTgn.hn() == 1) {
                    com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj((Map<String, as>) map, (com.bytedance.sdk.openadsdk.dse.hn.hnj) null, true);
                    hnj(iHashCode, asVar, str, true);
                } else if (xnVarTgn.hn() == 0) {
                    hnj(iHashCode, asVar, str, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final int i10, final as asVar, final String str, final boolean z10) {
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mjg.hnj.3
            private com.bytedance.sdk.openadsdk.core.widget.hnj.sk hnj(final dkl dklVar, orl orlVar) {
                com.bytedance.sdk.openadsdk.core.widget.hnj.sk skVar = new com.bytedance.sdk.openadsdk.core.widget.hnj.sk(oj.hnj(), null, asVar.sp(), orlVar, true) { // from class: com.bytedance.sdk.openadsdk.mjg.hnj.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        dkl dklVar2 = dklVar;
                        if (dklVar2 != null) {
                            dklVar2.setPreFinish(true);
                        }
                        super.onPageFinished(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        dkl dklVar2 = dklVar;
                        if (dklVar2 != null) {
                            dklVar2.setPreStart(true);
                        }
                        super.onPageStarted(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i11, String str2, String str3) {
                        String strGjv = com.bytedance.sdk.openadsdk.core.widget.hnj.sk.gjv(str3);
                        boolean z11 = false;
                        boolean z12 = strGjv != null && strGjv.startsWith("image");
                        if (strGjv != null && strGjv.startsWith("mp4")) {
                            z11 = true;
                        }
                        if (!z12 && !z11 && !dklVar.qor()) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            hnj.this.hnj(i10, 4, asVar, str);
                        }
                        super.onReceivedError(webView, i11, str2, str3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            hnj.this.hnj(i10, 4, asVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        try {
                            if (!z10) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            dkl dklVar2 = dklVar;
                            if (dklVar2 != null) {
                                dklVar2.hnj++;
                            }
                            WebResourceResponseModel webResourceResponseModelHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(com.bytedance.sdk.openadsdk.dse.hn.hnj().hn(), asVar.rx(), str2);
                            if (webResourceResponseModelHnj != null && webResourceResponseModelHnj.getWebResourceResponse() != null) {
                                dkl dklVar3 = dklVar;
                                if (dklVar3 != null) {
                                    dklVar3.f12913hn++;
                                }
                                return webResourceResponseModelHnj.getWebResourceResponse();
                            }
                            if (dklVar != null && webResourceResponseModelHnj != null && webResourceResponseModelHnj.getMsg() == 2) {
                                dklVar.qor++;
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        return super.shouldOverrideUrlLoading(webView, str2);
                    }
                };
                skVar.hnj(asVar);
                skVar.hnj(str);
                return skVar;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.utils.hnj hnjVarSk;
                Activity activityHn;
                if (hnj.this.f14557sk != null && hnj.this.f14557sk.size() >= hnj.qor) {
                    Map.Entry entry = (Map.Entry) hnj.this.f14557sk.entrySet().iterator().next();
                    SoftReference softReference = (SoftReference) entry.getValue();
                    if (softReference != null) {
                        dkl dklVar = (dkl) softReference.get();
                        hnj.this.hnj(((Integer) entry.getKey()).intValue(), 1, asVar, dklVar == null ? "" : dklVar.getTag());
                    }
                }
                if (hnj.this.f14556hn != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    hnj.this.f14556hn.sendMessageDelayed(messageObtain, hnj.gjv);
                }
                SoftReference softReference2 = new SoftReference(new dkl(oj.hnj(), false, dkl.qor.LANDING_PAGE_PRE_RENDER));
                final dkl dklVar2 = (dkl) softReference2.get();
                if (dklVar2 == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.ua uaVar = null;
                dklVar2.setLayerType(2, null);
                sq.hnj((View) dklVar2, 4);
                dklVar2.setTag(str);
                dklVar2.setLandingPage(true);
                xn xnVarTgn = asVar.tgn();
                int iHnj = xnVarTgn != null ? xnVarTgn.hnj() : 3;
                if (iHnj == 2) {
                    int iQor = sq.qor(oj.hnj());
                    int iSk = sq.sk(oj.hnj());
                    int iZf = asVar.zf();
                    if (iZf == 1) {
                        if (iQor >= iSk) {
                            dklVar2.layout(0, 0, iSk, iQor);
                        } else {
                            dklVar2.layout(0, 0, iQor, iSk);
                        }
                    } else if (iZf == 2) {
                        if (iQor < iSk) {
                            dklVar2.layout(0, 0, iSk, iQor);
                        } else {
                            dklVar2.layout(0, 0, iQor, iSk);
                        }
                    }
                } else if (iHnj == 1 && (hnjVarSk = jip.hnj().sk()) != null && (activityHn = hnjVarSk.hn()) != null) {
                    final int iHashCode = activityHn.hashCode();
                    hnjVarSk.hnj(new com.bytedance.sdk.component.adexpress.hnj() { // from class: com.bytedance.sdk.openadsdk.mjg.hnj.3.1
                        @Override // com.bytedance.sdk.component.adexpress.hnj
                        public void hnj(Activity activity) {
                            int i11 = iHashCode;
                            if (i11 == 0 || activity == null || i11 != activity.hashCode() || dklVar2.qor()) {
                                return;
                            }
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            hnj.this.hnj(i10, 5, asVar, str);
                        }
                    });
                    FrameLayout frameLayout = (FrameLayout) activityHn.findViewById(R.id.content);
                    if (frameLayout != null) {
                        frameLayout.addView(dklVar2);
                    }
                }
                int iHnj2 = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(com.bytedance.sdk.openadsdk.dse.hn.hnj().hn(), asVar.rx());
                orl orlVar = new orl(asVar, dklVar2.getWebView());
                orlVar.hnj(iHnj2 > 0 ? 2 : 0);
                orlVar.hnj(true);
                orlVar.hn(true);
                dklVar2.setWebViewClient(hnj(dklVar2, orlVar));
                dklVar2.setWebChromeClient(new gjv(uaVar, orlVar) { // from class: com.bytedance.sdk.openadsdk.mjg.hnj.3.2
                    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.gjv, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i11) {
                        super.onProgressChanged(webView, i11);
                        if (i11 == 100) {
                            dklVar2.setPreProgressHundred(true);
                        }
                    }
                });
                hnj.this.hnj(dklVar2, asVar.xe());
                hnj.hnj(asVar, str, Double.valueOf((System.currentTimeMillis() / 1000) - asVar.jfp()).floatValue(), "web_start_pre_render");
                if (hnj.this.f14557sk != null) {
                    hnj.this.f14557sk.put(Integer.valueOf(i10), softReference2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(int i10, int i11, as asVar, String str) {
        LinkedHashMap<Integer, SoftReference<dkl>> linkedHashMap = this.f14557sk;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i10))) {
            this.f14557sk.remove(Integer.valueOf(i10));
        }
        Handler handler = this.f14556hn;
        if (handler != null) {
            handler.removeMessages(i10);
        }
        hnj(asVar, str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(dkl dklVar, String str) {
        if (dklVar == null) {
            return;
        }
        qor.hnj(oj.hnj()).hnj(false).hn(false).hnj(dklVar.getWebView());
        dklVar.setMixedContentMode(0);
        wu.hnj(dklVar, str);
    }

    public static void hnj(as asVar, String str, final float f10, String str2) {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, str, str2, new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.mjg.hnj.4
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", f10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(as asVar, final String str, final int i10) {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.mjg.hnj.5
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }
}
