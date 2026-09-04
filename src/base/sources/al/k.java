package al;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends ok.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f406b = new k();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f409c;

        a(Runnable runnable, c cVar, long j10) {
            this.f407a = runnable;
            this.f408b = cVar;
            this.f409c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f408b.f417d) {
                return;
            }
            long jA = this.f408b.a(TimeUnit.MILLISECONDS);
            long j10 = this.f409c;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    cl.a.k(e10);
                    return;
                }
            }
            if (this.f408b.f417d) {
                return;
            }
            this.f407a.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f413d;

        b(Runnable runnable, Long l10, int i10) {
            this.f410a = runnable;
            this.f411b = l10.longValue();
            this.f412c = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = vk.b.b(this.f411b, bVar.f411b);
            return iB == 0 ? vk.b.a(this.f412c, bVar.f412c) : iB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends ok.h.b implements rk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final PriorityBlockingQueue f414a = new PriorityBlockingQueue();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f415b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f416c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f417d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f418a;

            a(b bVar) {
                this.f418a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f418a.f413d = true;
                c.this.f414a.remove(this.f418a);
            }
        }

        c() {
        }

        @Override // ok.h.b
        public rk.b b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // ok.h.b
        public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return e(new a(runnable, this, jA), jA);
        }

        @Override // rk.b
        public void d() {
            this.f417d = true;
        }

        rk.b e(Runnable runnable, long j10) {
            if (this.f417d) {
                return uk.c.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f416c.incrementAndGet());
            this.f414a.add(bVar);
            if (this.f415b.getAndIncrement() != 0) {
                return rk.c.b(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f417d) {
                b bVar2 = (b) this.f414a.poll();
                if (bVar2 == null) {
                    iAddAndGet = this.f415b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return uk.c.INSTANCE;
                    }
                } else if (!bVar2.f413d) {
                    bVar2.f410a.run();
                }
            }
            this.f414a.clear();
            return uk.c.INSTANCE;
        }
    }

    k() {
    }

    public static k d() {
        return f406b;
    }

    @Override // ok.h
    public ok.h.b a() {
        return new c();
    }

    @Override // ok.h
    public rk.b b(Runnable runnable) {
        cl.a.l(runnable).run();
        return uk.c.INSTANCE;
    }

    @Override // ok.h
    public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            cl.a.l(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            cl.a.k(e10);
        }
        return uk.c.INSTANCE;
    }
}
