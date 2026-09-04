package w5;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.b0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f55918b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile int f55919c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f55920a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f55921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f55922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f55923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ThreadFactory f55924d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f55925e = e.f55941d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f55926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f55927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Function f55928h;

        /* JADX INFO: renamed from: w5.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0853a extends ThreadPoolExecutor implements AutoCloseable {
            C0853a(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
                super(i10, i11, j10, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
            }

            @Override // java.lang.AutoCloseable
            public /* synthetic */ void close() {
                b0.a(this);
            }

            @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                super.execute((Runnable) b.this.f55928h.apply(runnable));
            }
        }

        b(boolean z10) {
            this.f55921a = z10;
        }

        public a b() {
            b bVar;
            ThreadPoolExecutor threadPoolExecutor;
            if (TextUtils.isEmpty(this.f55926f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f55926f);
            }
            d dVar = new d(this.f55924d, this.f55926f, this.f55925e, this.f55921a);
            if (this.f55928h != null) {
                threadPoolExecutor = new C0853a(this.f55922b, this.f55923c, this.f55927g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), dVar);
                bVar = this;
            } else {
                bVar = this;
                threadPoolExecutor = new ThreadPoolExecutor(bVar.f55922b, bVar.f55923c, bVar.f55927g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), dVar);
            }
            if (bVar.f55927g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b c(String str) {
            this.f55926f = str;
            return this;
        }

        public b d(int i10) {
            this.f55922b = i10;
            this.f55923c = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: w5.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0854a extends Thread {
            C0854a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0854a(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadFactory f55931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f55932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f55933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f55934d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicInteger f55935e = new AtomicInteger();

        /* JADX INFO: renamed from: w5.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0855a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f55936a;

            RunnableC0855a(Runnable runnable) {
                this.f55936a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f55934d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f55936a.run();
                } catch (Throwable th2) {
                    d.this.f55933c.a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f55931a = threadFactory;
            this.f55932b = str;
            this.f55933c = eVar;
            this.f55934d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f55931a.newThread(new RunnableC0855a(runnable));
            threadNewThread.setName("glide-" + this.f55932b + "-thread-" + this.f55935e.getAndIncrement());
            return threadNewThread;
        }
    }

    a(ExecutorService executorService) {
        this.f55920a = executorService;
    }

    public static a c0() {
        return t().b();
    }

    public static a d0() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f55918b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f55941d, false)));
    }

    static int h() {
        return k() >= 4 ? 2 : 1;
    }

    public static int k() {
        if (f55919c == 0) {
            f55919c = Math.min(4, w5.b.a());
        }
        return f55919c;
    }

    public static b l() {
        return new b(true).d(h()).c("animation");
    }

    public static a q() {
        return l().b();
    }

    public static b r() {
        return new b(true).d(1).c("disk-cache");
    }

    public static a s() {
        return r().b();
    }

    public static b t() {
        return new b(false).d(k()).c("source");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f55920a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        b0.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f55920a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f55920a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f55920a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f55920a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f55920a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f55920a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f55920a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f55920a.submit(runnable);
    }

    public String toString() {
        return this.f55920a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f55920a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f55920a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f55920a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f55920a.submit(callable);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f55938a = new C0856a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f55939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f55940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f55941d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class b implements e {
            b() {
            }

            @Override // w5.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class c implements e {
            c() {
            }

            @Override // w5.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f55939b = bVar;
            f55940c = new c();
            f55941d = bVar;
        }

        void a(Throwable th2);

        /* JADX INFO: renamed from: w5.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0856a implements e {
            C0856a() {
            }

            @Override // w5.a.e
            public void a(Throwable th2) {
            }
        }
    }
}
