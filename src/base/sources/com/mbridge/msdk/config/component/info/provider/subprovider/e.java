package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static String f28771d = "UserAgentProvider";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile e f28772e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f28773a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f28774b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicBoolean f28775c = new AtomicBoolean(false);

    private e() {
    }

    private String c() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String str3 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Mozilla/5.0 (Linux; Android ");
        sb2.append(str);
        sb2.append("; ");
        sb2.append(str2);
        sb2.append(" Build/");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
        return sb2.toString();
    }

    public static e d() {
        if (f28772e == null) {
            synchronized (e.class) {
                try {
                    if (f28772e == null) {
                        f28772e = new e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f28772e;
    }

    private String f() {
        try {
            return WebSettings.getDefaultUserAgent(com.mbridge.msdk.foundation.controller.c.n().d());
        } catch (Throwable th2) {
            q0.b(f28771d, th2.getMessage(), th2);
            return "";
        }
    }

    public String e() {
        if (TextUtils.isEmpty(this.f28773a) && TextUtils.isEmpty(this.f28774b)) {
            return c();
        }
        if (TextUtils.isEmpty(this.f28773a)) {
            return TextUtils.isEmpty(this.f28774b) ? "" : this.f28774b;
        }
        return this.f28773a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        this.f28773a = f();
        b();
        if (!TextUtils.isEmpty(this.f28773a)) {
            a(this.f28773a);
        }
        if (TextUtils.isEmpty(this.f28773a)) {
            this.f28773a = c();
            a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (aVar != null) {
            HashMap map = new HashMap();
            map.put("userAgent", this.f28773a);
            aVar.a(map);
        }
        this.f28775c.set(true);
    }

    public void a(final com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28779a.b(aVar);
                }
            });
        } catch (Throwable th2) {
            q0.b(f28771d, th2.getMessage(), th2);
        }
    }

    public String a() {
        try {
            String strF = f();
            this.f28773a = strF;
            if (!TextUtils.isEmpty(strF)) {
                a(this.f28773a);
            } else {
                b();
            }
            if (TextUtils.isEmpty(this.f28773a)) {
                this.f28773a = c();
            }
            this.f28775c.set(true);
        } catch (Throwable th2) {
            q0.b(f28771d, th2.getMessage(), th2);
        }
        return c();
    }

    private void a(final Context context) {
        if (TextUtils.isEmpty(this.f28773a)) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28781a.b(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            this.f28773a = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th2) {
            q0.b(f28771d, th2.getMessage(), th2);
        }
        if (TextUtils.isEmpty(this.f28773a)) {
            this.f28773a = c();
        } else {
            a(this.f28773a);
        }
    }

    private void a(String str) {
        Context contextD;
        if (TextUtils.isEmpty(str) || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b("userAgent", str);
    }

    private void b() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        this.f28774b = com.mbridge.msdk.config.component.common.util.b.a(contextD).a("userAgent", c());
    }
}
