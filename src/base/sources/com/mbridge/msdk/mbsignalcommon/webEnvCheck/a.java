package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f31675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f31676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f31677c;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0424a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f31678a;

        RunnableC0424a(Context context) {
            this.f31678a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f31675a == null) {
                try {
                    Boolean unused = a.f31675a = Boolean.valueOf(a.a(this.f31678a));
                } catch (Exception unused2) {
                    Boolean unused3 = a.f31675a = Boolean.FALSE;
                }
            }
        }
    }

    public static boolean b(Context context) {
        g gVarD;
        try {
            gVarD = h.b().d(c.n().b());
        } catch (Exception unused) {
            gVarD = null;
        }
        if (gVarD != null) {
            f31677c = Boolean.valueOf(gVarD.G0());
        } else {
            f31677c = Boolean.FALSE;
        }
        Boolean bool = f31677c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f31675a == null) {
                try {
                    f31675a = Boolean.valueOf(a(context));
                } catch (Exception unused2) {
                    f31675a = Boolean.FALSE;
                }
            }
            if (f31675a == null) {
                f31675a = new Boolean(false);
            }
            return f31675a.booleanValue();
        }
        if (f31675a == null && f31676b == null) {
            f31676b = new Handler(Looper.getMainLooper());
            f31676b.post(new RunnableC0424a(context));
        }
        if (f31675a == null) {
            return true;
        }
        return f31675a.booleanValue();
    }

    public static boolean a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        a(webView);
        return true;
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBWebViewChecker", "destroy webview error", e10);
            }
        }
    }
}
