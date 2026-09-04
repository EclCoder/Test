package com.iab.omid.library.vungle;

import android.content.Context;
import android.webkit.WebSettings;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.internal.k;
import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.e;
import com.iab.omid.library.vungle.utils.g;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24227a;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f24228a;

        a(b bVar, Context context) {
            this.f24228a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebSettings.getDefaultUserAgent(this.f24228a);
            } catch (Throwable unused) {
                d.a("Ignoring failure while retrieving default WebView user agent");
            }
        }
    }

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.6.2-Vungle";
    }

    void c() {
        g.a();
        com.iab.omid.library.vungle.internal.a.a().d();
    }

    private void c(Context context) {
        Executors.newSingleThreadExecutor().execute(new a(this, context));
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.vungle.internal.b.g().a(context);
        com.iab.omid.library.vungle.utils.a.a(context);
        com.iab.omid.library.vungle.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.vungle.internal.g.b().a(context);
        com.iab.omid.library.vungle.internal.a.a().a(context);
        k.b().a(context);
        c(context);
    }

    boolean b() {
        return this.f24227a;
    }

    void a(boolean z10) {
        this.f24227a = z10;
    }
}
