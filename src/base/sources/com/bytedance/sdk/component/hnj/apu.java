package com.bytedance.sdk.component.hnj;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu extends hnj {

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    static final /* synthetic */ boolean f12887ta = true;
    protected String aq;
    protected WebView ojm;

    protected void gjv() {
        this.ojm.removeJavascriptInterface(this.aq);
    }

    @Override // com.bytedance.sdk.component.hnj.hnj
    protected void hn(ojm ojmVar) {
        this.ojm = ojmVar.hnj;
        this.aq = ojmVar.qor;
        if (ojmVar.orl) {
            return;
        }
        qor();
    }

    @Override // com.bytedance.sdk.component.hnj.hnj
    protected Context hnj(ojm ojmVar) {
        Context context = ojmVar.f12904sk;
        if (context != null) {
            return context;
        }
        WebView webView = ojmVar.hnj;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.hnj.hnj
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    protected void qor() {
        if (!f12887ta && this.ojm == null) {
            throw new AssertionError();
        }
        this.ojm.addJavascriptInterface(this, this.aq);
    }

    @Override // com.bytedance.sdk.component.hnj.hnj
    protected void hn() {
        super.hn();
        gjv();
    }

    @Override // com.bytedance.sdk.component.hnj.hnj
    protected String hnj() {
        return this.ojm.getUrl();
    }

    @Override // com.bytedance.sdk.component.hnj.hnj
    protected void hnj(String str, mjg mjgVar) {
        if (mjgVar != null && !TextUtils.isEmpty(mjgVar.aq)) {
            String str2 = mjgVar.aq;
            hnj(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.hnj(str, mjgVar);
    }

    @Override // com.bytedance.sdk.component.hnj.hnj
    protected void hnj(String str) {
        hnj(str, "javascript:" + this.aq + "._handleMessageFromToutiao(" + str + ")");
    }

    private void hnj(String str, final String str2) {
        if (this.dkl || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.hnj.apu.1
            @Override // java.lang.Runnable
            public void run() {
                if (apu.this.dkl) {
                    return;
                }
                try {
                    apu.this.ojm.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.gjv.post(runnable);
        } else {
            runnable.run();
        }
    }
}
