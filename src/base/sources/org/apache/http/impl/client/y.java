package org.apache.http.impl.client;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oo.k f49357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadFactory f49358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f49359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f49360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f49361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Exception f49362f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ oo.k f49363a;

        a(oo.k kVar) {
            this.f49363a = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(y.this.f49360d);
                    this.f49363a.h();
                    if (y.this.f49361e > 0) {
                        this.f49363a.c(y.this.f49361e, TimeUnit.MILLISECONDS);
                    }
                } catch (Exception e10) {
                    y.this.f49362f = e10;
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements ThreadFactory {
        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Connection evictor");
            thread.setDaemon(true);
            return thread;
        }
    }

    public y(oo.k kVar, ThreadFactory threadFactory, long j10, TimeUnit timeUnit, long j11, TimeUnit timeUnit2) {
        this.f49357a = (oo.k) ip.a.h(kVar, "Connection manager");
        threadFactory = threadFactory == null ? new b() : threadFactory;
        this.f49358b = threadFactory;
        this.f49360d = timeUnit != null ? timeUnit.toMillis(j10) : j10;
        this.f49361e = timeUnit2 != null ? timeUnit2.toMillis(j11) : j11;
        this.f49359c = threadFactory.newThread(new a(kVar));
    }

    public void d(long j10, TimeUnit timeUnit) throws InterruptedException {
        Thread thread = this.f49359c;
        if (timeUnit == null) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        thread.join(timeUnit.toMillis(j10));
    }

    public void e() {
        this.f49359c.interrupt();
    }

    public void f() {
        this.f49359c.start();
    }

    public y(oo.k kVar, long j10, TimeUnit timeUnit, long j11, TimeUnit timeUnit2) {
        this(kVar, null, j10, timeUnit, j11, timeUnit2);
    }
}
