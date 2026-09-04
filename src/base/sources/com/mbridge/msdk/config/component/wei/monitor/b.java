package com.mbridge.msdk.config.component.wei.monitor;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSession;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AdSession f29204a;

    public b(AdSession adSession) {
        this.f29204a = adSession;
    }

    public void a(WebView webView) {
        this.f29204a.registerAdView(webView);
    }
}
