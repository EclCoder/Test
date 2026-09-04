package com.inmobi.media;

import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Oe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f25417a;

    public Oe(WebView webView) {
        kotlin.jvm.internal.s.h(webView, "webView");
        this.f25417a = new WeakReference(webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebSettings settings;
        WebView webView = (WebView) this.f25417a.get();
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.setBlockNetworkLoads(true);
    }
}
