package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f33886a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.mbridge.msdk.tracker.network.b f33891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f33892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f33893h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f33887b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<t<?>> f33888c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<t<?>> f33889d = new PriorityBlockingQueue<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<c> f33894i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33895j = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "NetworkDispatcher");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new n(u.this.f33889d, u.this.f33892g, u.this.f33891f, u.this.f33893h).run();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(t<?> tVar, int i10);
    }

    public u(m mVar, w wVar, int i10, com.mbridge.msdk.tracker.network.b bVar) {
        this.f33890e = i10;
        this.f33891f = bVar;
        this.f33892g = mVar;
        this.f33893h = wVar;
    }

    private void a(int i10) {
        if (this.f33886a != null) {
            return;
        }
        try {
            b(i10);
        } catch (Throwable unused) {
            try {
                b(5);
            } catch (Exception unused2) {
                this.f33886a = null;
            }
        }
    }

    public void b() {
        if (!this.f33895j || this.f33886a == null) {
            a(this.f33890e);
            this.f33895j = true;
        }
    }

    <T> void c(t<T> tVar) {
        synchronized (this.f33888c) {
            this.f33888c.remove(tVar);
        }
        a(tVar, 5);
    }

    <T> void d(t<T> tVar) {
        this.f33889d.add(tVar);
    }

    private void b(int i10) {
        this.f33886a = new ThreadPoolExecutor(i10, i10, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public int a() {
        return this.f33887b.incrementAndGet();
    }

    <T> void b(t<T> tVar) {
        d(tVar);
    }

    public <T> t<T> a(t<T> tVar) {
        tVar.a(this);
        synchronized (this.f33888c) {
            this.f33888c.add(tVar);
        }
        tVar.b(a());
        tVar.a("add-to-queue");
        a(tVar, 0);
        b(tVar);
        if (this.f33886a == null) {
            a(this.f33890e);
        }
        if (!this.f33886a.isShutdown()) {
            this.f33886a.execute(new b());
        }
        return tVar;
    }

    void a(t<?> tVar, int i10) {
        synchronized (this.f33894i) {
            try {
                Iterator<c> it = this.f33894i.iterator();
                while (it.hasNext()) {
                    it.next().a(tVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
