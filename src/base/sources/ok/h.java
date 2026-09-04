package ok;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f48976a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements rk.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f48977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b f48978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Thread f48979c;

        a(Runnable runnable, b bVar) {
            this.f48977a = runnable;
            this.f48978b = bVar;
        }

        @Override // rk.b
        public void d() {
            if (this.f48979c == Thread.currentThread()) {
                b bVar = this.f48978b;
                if (bVar instanceof al.e) {
                    ((al.e) bVar).g();
                    return;
                }
            }
            this.f48978b.d();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f48979c = Thread.currentThread();
            try {
                this.f48977a.run();
            } finally {
                d();
                this.f48979c = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b implements rk.b {
        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public rk.b b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract rk.b c(Runnable runnable, long j10, TimeUnit timeUnit);
    }

    public abstract b a();

    public rk.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        b bVarA = a();
        a aVar = new a(cl.a.l(runnable), bVarA);
        bVarA.c(aVar, j10, timeUnit);
        return aVar;
    }
}
