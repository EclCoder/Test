package com.inmobi.media;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.google.api.client.http.HttpMethods;
import java.net.URLDecoder;

/* JADX INFO: renamed from: com.inmobi.media.vo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3389vo {
    public static WebResourceResponse a(WebResourceRequest request, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(request, "<this>");
        if (!bm.r.A(HttpMethods.GET, request.getMethod(), true)) {
            return null;
        }
        String string = request.getUrl().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return a(string, interfaceC3322t9);
    }

    public static WebResourceResponse a(String urlRaw, InterfaceC3322t9 interfaceC3322t9) {
        String url;
        kotlin.jvm.internal.s.h(urlRaw, "urlRaw");
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("IMResourceCacheManager", "shouldInterceptRequest " + urlRaw);
        }
        try {
            url = URLDecoder.decode(bm.r.V0(urlRaw).toString(), com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        } catch (Exception unused) {
            url = null;
        }
        if (url == null) {
            return null;
        }
        kotlin.jvm.internal.s.h(url, "url");
        if (bm.r.T(url, "inmobicache=true", false, 2, null)) {
            return (WebResourceResponse) em.j.b(null, new C3363uo(url, interfaceC3322t9, null), 1, null);
        }
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("IMResourceCacheManager", "Cache is not enabled for URL: " + url);
        }
        return null;
    }
}
