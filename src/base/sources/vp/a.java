package vp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f55693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExecutorService f55694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f55695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f55696d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements Thread.UncaughtExceptionHandler {
        private b() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ThreadFactory f55697b = Executors.defaultThreadFactory();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Thread.UncaughtExceptionHandler f55698a;

        c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f55698a = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = f55697b.newThread(runnable);
            threadNewThread.setUncaughtExceptionHandler(this.f55698a);
            return threadNewThread;
        }
    }

    static {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new c(new b()));
        f55693a = executorServiceNewCachedThreadPool;
        f55694b = executorServiceNewCachedThreadPool;
        f55695c = b();
        f55696d = 100000L;
    }

    public static long a() {
        return f55696d;
    }

    public static int b() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static int c() {
        return f55695c;
    }

    public static Future d(Runnable runnable) {
        if (f55694b.isShutdown() || f55694b.isTerminated()) {
            f55694b = f55693a;
        }
        return f55694b.submit(runnable);
    }

    public static void e(Future[] futureArr) throws ExecutionException, InterruptedException {
        for (Future future : futureArr) {
            future.get();
        }
    }
}
