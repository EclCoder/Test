package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.vi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3383vi extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3322t9 f27728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3485zi f27729b;

    public C3383vi(InterfaceC3322t9 interfaceC3322t9, C3485zi c3485zi) {
        this.f27728a = interfaceC3322t9;
        this.f27729b = c3485zi;
    }

    public final void onRenderProcessResponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        Ph ph2;
        kotlin.jvm.internal.s.h(view, "view");
        InterfaceC3322t9 interfaceC3322t9 = this.f27728a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + view + " " + webViewRenderProcess);
        }
        C3485zi c3485zi = this.f27729b;
        if (c3485zi != null) {
            Map mapA = c3485zi.a();
            mapA.put("creativeId", c3485zi.f28023a.f27564g);
            int i10 = c3485zi.f28027e + 1;
            c3485zi.f28027e = i10;
            mapA.put("count", Integer.valueOf(i10));
            String strA = c3485zi.a("RenderProcessResponsive");
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b(strA, mapA, EnumC3281rk.SDK);
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27728a;
        if (interfaceC3322t10 == null || (ph2 = ((C3348u9) interfaceC3322t10).f27613a) == null) {
            return;
        }
        ph2.a();
    }

    public final void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        Ph ph2;
        kotlin.jvm.internal.s.h(view, "view");
        InterfaceC3322t9 interfaceC3322t9 = this.f27728a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + view + " " + webViewRenderProcess);
        }
        C3485zi c3485zi = this.f27729b;
        if (c3485zi != null) {
            Map mapA = c3485zi.a();
            mapA.put("creativeId", c3485zi.f28023a.f27564g);
            int i10 = c3485zi.f28026d + 1;
            c3485zi.f28026d = i10;
            mapA.put("count", Integer.valueOf(i10));
            String strA = c3485zi.a("RenderProcessUnResponsive");
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b(strA, mapA, EnumC3281rk.SDK);
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27728a;
        if (interfaceC3322t10 == null || (ph2 = ((C3348u9) interfaceC3322t10).f27613a) == null) {
            return;
        }
        ph2.a();
    }
}
