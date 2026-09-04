package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Handler f4585e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f4587b = e.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f4588c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f4589d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FutureTask f4586a = new b(new a());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            c.this.f4589d.set(true);
            Object objB = null;
            try {
                Process.setThreadPriority(10);
                objB = c.this.b();
                Binder.flushPendingCommands();
                c.this.i(objB);
                return objB;
            } catch (Throwable th2) {
                try {
                    c.this.f4588c.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    c.this.i(objB);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends FutureTask {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c.this.j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0053c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4592a;

        RunnableC0053c(Object obj) {
            this.f4592a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d(this.f4592a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4594a;

        static {
            int[] iArr = new int[e.values().length];
            f4594a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4594a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    c() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (c.class) {
            try {
                if (f4585e == null) {
                    f4585e = new Handler(Looper.getMainLooper());
                }
                handler = f4585e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f4588c.set(true);
        return this.f4586a.cancel(z10);
    }

    protected abstract Object b();

    public final void c(Executor executor) {
        if (this.f4587b == e.PENDING) {
            this.f4587b = e.RUNNING;
            executor.execute(this.f4586a);
            return;
        }
        int i10 = d.f4594a[this.f4587b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f4587b = e.FINISHED;
    }

    public final boolean f() {
        return this.f4588c.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    void i(Object obj) {
        e().post(new RunnableC0053c(obj));
    }

    void j(Object obj) {
        if (this.f4589d.get()) {
            return;
        }
        i(obj);
    }
}
