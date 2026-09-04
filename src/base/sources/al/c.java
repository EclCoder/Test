package al;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends ok.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final f f362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final f f363e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final C0007c f366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final a f367i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference f369c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final TimeUnit f365g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f364f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue f371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final rk.a f372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ScheduledExecutorService f373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Future f374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ThreadFactory f375f;

        a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f370a = nanos;
            this.f371b = new ConcurrentLinkedQueue();
            this.f372c = new rk.a();
            this.f375f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, c.f363e);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f373d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f374e = scheduledFutureScheduleWithFixedDelay;
        }

        void a() {
            if (this.f371b.isEmpty()) {
                return;
            }
            long jC = c();
            for (C0007c c0007c : this.f371b) {
                if (c0007c.h() > jC) {
                    return;
                }
                if (this.f371b.remove(c0007c)) {
                    this.f372c.c(c0007c);
                }
            }
        }

        C0007c b() {
            if (this.f372c.f()) {
                return c.f366h;
            }
            while (!this.f371b.isEmpty()) {
                C0007c c0007c = (C0007c) this.f371b.poll();
                if (c0007c != null) {
                    return c0007c;
                }
            }
            C0007c c0007c2 = new C0007c(this.f375f);
            this.f372c.b(c0007c2);
            return c0007c2;
        }

        long c() {
            return System.nanoTime();
        }

        void d(C0007c c0007c) {
            c0007c.i(c() + this.f370a);
            this.f371b.offer(c0007c);
        }

        void e() {
            this.f372c.d();
            Future future = this.f374e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f373d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends ok.h.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C0007c f378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f379d = new AtomicBoolean();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final rk.a f376a = new rk.a();

        b(a aVar) {
            this.f377b = aVar;
            this.f378c = aVar.b();
        }

        @Override // ok.h.b
        public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f376a.f() ? uk.c.INSTANCE : this.f378c.e(runnable, j10, timeUnit, this.f376a);
        }

        @Override // rk.b
        public void d() {
            if (this.f379d.compareAndSet(false, true)) {
                this.f376a.d();
                this.f377b.d(this.f378c);
            }
        }
    }

    /* JADX INFO: renamed from: al.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0007c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f380c;

        C0007c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f380c = 0L;
        }

        public long h() {
            return this.f380c;
        }

        public void i(long j10) {
            this.f380c = j10;
        }
    }

    public c() {
        this(f362d);
    }

    @Override // ok.h
    public ok.h.b a() {
        return new b((a) this.f369c.get());
    }

    public void d() {
        a aVar = new a(f364f, f365g, this.f368b);
        if (androidx.lifecycle.b.a(this.f369c, f367i, aVar)) {
            return;
        }
        aVar.e();
    }

    static {
        C0007c c0007c = new C0007c(new f("RxCachedThreadSchedulerShutdown"));
        f366h = c0007c;
        c0007c.d();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f fVar = new f("RxCachedThreadScheduler", iMax);
        f362d = fVar;
        f363e = new f(qEagQqzJZsd.ZwCwvR, iMax);
        a aVar = new a(0L, null, fVar);
        f367i = aVar;
        aVar.e();
    }

    public c(ThreadFactory threadFactory) {
        this.f368b = threadFactory;
        this.f369c = new AtomicReference(f367i);
        d();
    }
}
