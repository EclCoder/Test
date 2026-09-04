package com.bumptech.glide.load.engine;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f11274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f11275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f11276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o.a f11277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f11278f;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class ThreadFactoryC0153a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0154a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f11279a;

            RunnableC0154a(Runnable runnable) {
                this.f11279a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f11279a.run();
            }
        }

        ThreadFactoryC0153a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0154a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final r5.e f11282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f11283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        t5.c f11284c;

        c(r5.e eVar, o oVar, ReferenceQueue referenceQueue, boolean z10) {
            super(oVar, referenceQueue);
            this.f11282a = (r5.e) m6.k.e(eVar);
            this.f11284c = (oVar.e() && z10) ? (t5.c) m6.k.e(oVar.d()) : null;
            this.f11283b = oVar.e();
        }

        void a() {
            this.f11284c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0153a()));
    }

    synchronized void a(r5.e eVar, o oVar) {
        c cVar = (c) this.f11275c.put(eVar, new c(eVar, oVar, this.f11276d, this.f11273a));
        if (cVar != null) {
            cVar.a();
        }
    }

    void b() {
        while (!this.f11278f) {
            try {
                c((c) this.f11276d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        t5.c cVar2;
        synchronized (this) {
            this.f11275c.remove(cVar.f11282a);
            if (cVar.f11283b && (cVar2 = cVar.f11284c) != null) {
                this.f11277e.b(cVar.f11282a, new o(cVar2, true, false, cVar.f11282a, this.f11277e));
            }
        }
    }

    synchronized void d(r5.e eVar) {
        c cVar = (c) this.f11275c.remove(eVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized o e(r5.e eVar) {
        c cVar = (c) this.f11275c.get(eVar);
        if (cVar == null) {
            return null;
        }
        o oVar = (o) cVar.get();
        if (oVar == null) {
            c(cVar);
        }
        return oVar;
    }

    void f(o.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f11277e = aVar;
            }
        }
    }

    a(boolean z10, Executor executor) {
        this.f11275c = new HashMap();
        this.f11276d = new ReferenceQueue();
        this.f11273a = z10;
        this.f11274b = executor;
        executor.execute(new b());
    }
}
