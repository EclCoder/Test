package k0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f42816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f42817b;

        /* JADX INFO: renamed from: k0.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class C0649a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f42818a;

            C0649a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f42818a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f42818a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f42816a = str;
            this.f42817b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0649a(runnable, this.f42816a, this.f42817b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f42819a;

        b(Handler handler) {
            this.f42819a = (Handler) m0.g.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f42819a.post((Runnable) m0.g.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f42819a + " is shutting down");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable f42820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m0.a f42821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f42822c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m0.a f42823a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f42824b;

            a(m0.a aVar, Object obj) {
                this.f42823a = aVar;
                this.f42824b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f42823a.accept(this.f42824b);
            }
        }

        c(Handler handler, Callable callable, m0.a aVar) {
            this.f42820a = callable;
            this.f42821b = aVar;
            this.f42822c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f42820a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f42822c.post(new a(this.f42821b, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, m0.a aVar) {
        executor.execute(new c(k0.b.a(), callable, aVar));
    }

    static Object d(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
