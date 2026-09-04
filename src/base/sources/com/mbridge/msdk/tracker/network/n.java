package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<t<?>> f33791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f33792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f33793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f33794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f33795e = false;

    public n(BlockingQueue<t<?>> blockingQueue, m mVar, b bVar, w wVar) {
        this.f33791a = blockingQueue;
        this.f33792b = mVar;
        this.f33793c = bVar;
        this.f33794d = wVar;
    }

    private void a(t<?> tVar) {
        TrafficStats.setThreadStatsTag(tVar.s());
    }

    void b(t<?> tVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tVar.a(3);
        try {
            try {
                try {
                    tVar.a("network-queue-take");
                    if (tVar.v()) {
                        tVar.c("network-discard-cancelled");
                        tVar.x();
                        return;
                    }
                    if (tVar.y()) {
                        a(tVar);
                    }
                    q qVarA = this.f33792b.a(tVar);
                    tVar.a("network-http-complete");
                    if (qVarA.f33826e && tVar.u()) {
                        tVar.c("not-modified");
                        tVar.x();
                        return;
                    }
                    v<?> vVarA = tVar.a(qVarA);
                    tVar.a("network-parse-complete");
                    if (tVar.z() && vVarA.f33899b != null) {
                        this.f33793c.a(tVar.e(), vVarA.f33899b);
                        tVar.a("network-cache-written");
                    }
                    tVar.w();
                    this.f33794d.a(tVar, vVarA);
                    tVar.a(vVarA);
                } catch (Exception e10) {
                    c0.a(e10, "Unhandled exception %s", e10.toString());
                    a0 a0Var = new a0(e10);
                    a0Var.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    this.f33794d.a(tVar, a0Var);
                    tVar.x();
                }
            } catch (b0 e11) {
                e11.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                a(tVar, e11);
                tVar.x();
            }
        } finally {
            tVar.a(4);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f33795e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private void a() {
        b(this.f33791a.take());
    }

    private void a(t<?> tVar, b0 b0Var) {
        this.f33794d.a(tVar, tVar.c(b0Var));
    }
}
