package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f10532b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f10533a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10534c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f10535d;

    c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f10534c) {
                    return;
                }
                c.this.f10533a.d();
                long unused = c.f10532b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.f10535d, 500L);
                } else {
                    m.a().a(c.this.f10535d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f10532b);
            }
        };
        this.f10535d = runnable;
        this.f10533a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f10532b <= MBInterstitialActivity.WEB_LOAD_TIME;
    }

    public final void b() {
        this.f10534c = true;
    }

    public final void a() {
        if (this.f10534c) {
            return;
        }
        m.a().a(this.f10535d, 5000L);
    }
}
