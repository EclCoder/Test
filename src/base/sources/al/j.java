package al;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ok.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final f f399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ScheduledExecutorService f400e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference f402c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends ok.h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final rk.a f404b = new rk.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f405c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f403a = scheduledExecutorService;
        }

        @Override // ok.h.b
        public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f405c) {
                return uk.c.INSTANCE;
            }
            h hVar = new h(cl.a.l(runnable), this.f404b);
            this.f404b.b(hVar);
            try {
                hVar.a(j10 <= 0 ? this.f403a.submit((Callable) hVar) : this.f403a.schedule((Callable) hVar, j10, timeUnit));
                return hVar;
            } catch (RejectedExecutionException e10) {
                d();
                cl.a.k(e10);
                return uk.c.INSTANCE;
            }
        }

        @Override // rk.b
        public void d() {
            if (this.f405c) {
                return;
            }
            this.f405c = true;
            this.f404b.d();
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f400e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f399d = new f("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public j() {
        this(f399d);
    }

    static ScheduledExecutorService d(ThreadFactory threadFactory) {
        return i.a(threadFactory);
    }

    @Override // ok.h
    public ok.h.b a() {
        return new a((ScheduledExecutorService) this.f402c.get());
    }

    @Override // ok.h
    public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        g gVar = new g(cl.a.l(runnable));
        try {
            gVar.a(j10 <= 0 ? ((ScheduledExecutorService) this.f402c.get()).submit(gVar) : ((ScheduledExecutorService) this.f402c.get()).schedule(gVar, j10, timeUnit));
            return gVar;
        } catch (RejectedExecutionException e10) {
            cl.a.k(e10);
            return uk.c.INSTANCE;
        }
    }

    public j(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f402c = atomicReference;
        this.f401b = threadFactory;
        atomicReference.lazySet(d(threadFactory));
    }
}
