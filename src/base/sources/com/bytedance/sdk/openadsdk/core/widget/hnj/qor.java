package com.bytedance.sdk.openadsdk.core.widget.hnj;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.apu;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private final WeakReference<Context> hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f14281hn = true;
    private final boolean qor = true;
    private final boolean gjv = true;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final boolean f14282sk = false;
    private final boolean dkl = true;
    private boolean dse = true;

    private qor(Context context) {
        this.hnj = new WeakReference<>(context);
    }

    public static qor hnj(Context context) {
        return new qor(context);
    }

    public qor hn(boolean z10) {
        this.f14281hn = z10;
        return this;
    }

    public static void hn(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            apu.qor(th2.toString(), new Object[0]);
        }
    }

    public qor hnj(boolean z10) {
        this.dse = z10;
        return this;
    }

    public void hnj(WebView webView) {
        if (webView == null || this.hnj.get() == null) {
            return;
        }
        hn(webView);
        WebSettings settings = webView.getSettings();
        hnj(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e10) {
            apu.qor("SSWebSettings", e10.getMessage());
        }
        try {
            if (this.f14281hn) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th2) {
            apu.qor("SSWebSettings", th2.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.dse) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th3) {
            apu.qor("SSWebSettings", th3.getMessage());
        }
    }

    private void hnj(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            apu.qor(th2.toString(), new Object[0]);
        }
    }

    public static void hnj(com.bytedance.sdk.component.ojm.dkl dklVar) {
        if (dklVar == null) {
            return;
        }
        int iHnj = com.bytedance.sdk.openadsdk.as.sk.hnj("clear_web_cache_new", 0);
        if (iHnj == 0) {
            dklVar.hnj(true);
        } else if (iHnj == 1) {
            dklVar.hnj(false);
        }
    }
}
