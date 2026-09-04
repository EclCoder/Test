package jd;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f42360b;

        /* JADX INFO: renamed from: jd.o0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0642a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f42361a;

            C0642a(Runnable runnable) {
                this.f42361a = runnable;
            }

            @Override // jd.d
            public void a() {
                this.f42361a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f42359a = str;
            this.f42360b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0642a(runnable));
            threadNewThread.setName(this.f42359a + this.f42360b.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f42364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f42365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f42366d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f42363a = str;
            this.f42364b = executorService;
            this.f42365c = j10;
            this.f42366d = timeUnit;
        }

        @Override // jd.d
        public void a() {
            try {
                gd.g.f().b("Executing shutdown hook for " + this.f42363a);
                this.f42364b.shutdown();
                if (this.f42364b.awaitTermination(this.f42365c, this.f42366d)) {
                    return;
                }
                gd.g.f().b(this.f42363a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f42364b.shutdownNow();
            } catch (InterruptedException unused) {
                gd.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f42363a));
                this.f42364b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
