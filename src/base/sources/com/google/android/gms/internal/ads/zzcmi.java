package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzcmi extends zzcmh {
    public zzcmi(zzcku zzckuVar, zzbhp zzbhpVar, boolean z10, zzekr zzekrVar) {
        super(zzckuVar, zzbhpVar, z10, zzekrVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzac(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
