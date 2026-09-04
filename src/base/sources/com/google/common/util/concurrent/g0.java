package com.google.common.util.concurrent;

import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f21982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.b f21983b;

        a(Executor executor, com.google.common.util.concurrent.b bVar) {
            this.f21982a = executor;
            this.f21983b = bVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f21982a.execute(runnable);
            } catch (RejectedExecutionException e10) {
                this.f21983b.setException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends com.google.common.util.concurrent.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f21984a;

        b(ExecutorService executorService) {
            this.f21984a = (ExecutorService) sc.p.o(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f21984a.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f21984a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f21984a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f21984a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f21984a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            return this.f21984a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f21984a + "]";
        }
    }

    public static Executor a() {
        return n.INSTANCE;
    }

    public static f0 b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof f0 ? (f0) scheduledExecutorService : new c(scheduledExecutorService);
    }

    public static Executor c(Executor executor) {
        return new k0(executor);
    }

    static Executor d(Executor executor, com.google.common.util.concurrent.b bVar) {
        sc.p.o(executor);
        sc.p.o(bVar);
        return executor == a() ? executor : new a(executor, bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends b implements f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ScheduledExecutorService f21985b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class a extends u.a implements d0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ScheduledFuture f21986b;

            public a(ListenableFuture listenableFuture, ScheduledFuture scheduledFuture) {
                super(listenableFuture);
                this.f21986b = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.t, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean zCancel = super.cancel(z10);
                if (zCancel) {
                    this.f21986b.cancel(z10);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f21986b.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f21986b.compareTo(delayed);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class b extends com.google.common.util.concurrent.b.j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Runnable f21987a;

            public b(Runnable runnable) {
                this.f21987a = (Runnable) sc.p.o(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f21987a.run();
                } catch (Throwable th2) {
                    setException(th2);
                    throw th2;
                }
            }

            @Override // com.google.common.util.concurrent.b
            protected String pendingToString() {
                return trPLwhKZgZ.RJnQSxtaTfUb + this.f21987a + "]";
            }
        }

        c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f21985b = (ScheduledExecutorService) sc.p.o(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public d0 scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f21985b.scheduleAtFixedRate(bVar, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public d0 scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f21985b.scheduleWithFixedDelay(bVar, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public d0 schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            n0 n0VarS = n0.s(runnable, null);
            return new a(n0VarS, this.f21985b.schedule(n0VarS, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public d0 schedule(Callable callable, long j10, TimeUnit timeUnit) {
            n0 n0VarT = n0.t(callable);
            return new a(n0VarT, this.f21985b.schedule(n0VarT, j10, timeUnit));
        }
    }
}
