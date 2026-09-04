package com.bytedance.sdk.openadsdk.core.widget.hnj;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.gjv.orl;
import com.bytedance.sdk.openadsdk.utils.xn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends WebChromeClient {
    private static final String hnj = WebChromeClient.class.getSimpleName();
    private com.bytedance.sdk.openadsdk.common.sk gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final ua f14277hn;
    private orl qor;

    public gjv(ua uaVar) {
        this.f14277hn = uaVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (!TextUtils.isEmpty(str)) {
            hnj(str);
        }
        super.onConsoleMessage(str, i10, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        orl orlVar = this.qor;
        if (orlVar != null) {
            orlVar.hnj(webView, i10);
        }
        com.bytedance.sdk.openadsdk.common.sk skVar = this.gjv;
        if (skVar != null) {
            skVar.hnj(webView, i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    private boolean hnj(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                fc.qor().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.hnj.gjv.1
                    @Override // java.lang.Runnable
                    public void run() {
                        xn.hnj(Uri.parse(str), gjv.this.f14277hn);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public gjv(ua uaVar, orl orlVar, com.bytedance.sdk.openadsdk.common.sk skVar) {
        this(uaVar, orlVar);
        this.gjv = skVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !hnj(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public gjv(ua uaVar, orl orlVar) {
        this.f14277hn = uaVar;
        this.qor = orlVar;
    }
}
