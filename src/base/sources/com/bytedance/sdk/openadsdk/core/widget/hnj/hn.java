package com.bytedance.sdk.openadsdk.core.widget.hnj;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.utils.xn;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements hnj {
    private final MessageQueue gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.component.ojm.dkl f14279hn;
    ua hnj;
    private final AtomicInteger qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final boolean f14280sk;

    public hn(int i10, boolean z10, MessageQueue messageQueue) {
        this.qor = new AtomicInteger(i10);
        this.f14280sk = z10;
        this.gjv = messageQueue;
    }

    private void hnj(com.bytedance.sdk.component.ojm.dkl dklVar) {
        if (dklVar == null || dklVar.getWebView() == null) {
            return;
        }
        try {
            qor.hnj(oj.hnj()).hnj(false).hnj(dklVar.getWebView());
            dklVar.setVerticalScrollBarEnabled(false);
            dklVar.setHorizontalScrollBarEnabled(false);
            qor.hnj(dklVar);
            dklVar.mjg();
            dklVar.setUserAgentString(xn.hnj(dklVar.getWebView(), BuildConfig.VERSION_CODE));
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
        } catch (Throwable th2) {
            apu.qor("WebViewPool", th2.toString());
        }
    }

    public void hn() {
        if (this.qor.get() <= 0) {
            return;
        }
        Objects.toString(this.qor);
        String strGjv = com.bytedance.sdk.component.adexpress.hnj.hn.hn.gjv(null);
        if (this.f14280sk) {
            String strGjv2 = com.bytedance.sdk.component.adexpress.hnj.hn.hn.gjv("v3");
            if (strGjv != null && strGjv.equals(strGjv2)) {
                return;
            } else {
                strGjv = strGjv2;
            }
        }
        if (TextUtils.isEmpty(strGjv)) {
            return;
        }
        try {
            com.bytedance.sdk.component.ojm.dkl dklVar = new com.bytedance.sdk.component.ojm.dkl(new MutableContextWrapper(oj.hnj()), this.f14280sk ? com.bytedance.sdk.component.ojm.dkl.qor.ADS_V3 : com.bytedance.sdk.component.ojm.dkl.qor.ADS);
            this.f14279hn = dklVar;
            if (dklVar.getWebView() == null) {
                return;
            }
            this.f14279hn.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.hnj.hn.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            hnj(this.f14279hn);
            Uri uriBuild = Uri.parse(strGjv).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            ua uaVar = new ua(this.f14279hn.getContext());
            this.hnj = uaVar;
            uaVar.hn(this.f14279hn).hnj(this).hnj(this.f14279hn);
            com.bytedance.sdk.component.adexpress.sk.sk.hnj().hnj(this.f14279hn, this.hnj);
            this.f14279hn.a_(uriBuild.toString());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.hnj
    public void hnj() {
        MessageQueue messageQueue;
        if (this.f14280sk) {
            com.bytedance.sdk.component.adexpress.sk.sk.hnj().hn(this.f14279hn);
        } else {
            com.bytedance.sdk.component.adexpress.sk.sk.hnj().qor(this.f14279hn);
        }
        try {
            this.qor.get();
            this.qor.decrementAndGet();
            if (this.qor.get() <= 0 || (messageQueue = this.gjv) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.hnj.hn.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    new hn(hn.this.qor.get(), hn.this.f14280sk, hn.this.gjv).hn();
                    return false;
                }
            });
        } catch (Exception e10) {
            e10.getMessage();
        }
    }
}
