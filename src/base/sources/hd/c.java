package hd;

import android.os.Bundle;
import gd.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f40329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f40331c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CountDownLatch f40333e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f40332d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40334f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f40329a = eVar;
        this.f40330b = i10;
        this.f40331c = timeUnit;
    }

    @Override // hd.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f40332d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f40333e = new CountDownLatch(1);
                this.f40334f = false;
                this.f40329a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f40333e.await(this.f40330b, this.f40331c)) {
                        this.f40334f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f40333e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hd.b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f40333e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
