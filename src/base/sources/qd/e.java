package qd;

import a9.h;
import a9.j;
import android.os.SystemClock;
import c9.l;
import com.google.android.gms.tasks.TaskCompletionSource;
import gd.g;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jd.i1;
import jd.j0;
import jd.w0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f50627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f50628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f50629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f50630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue f50632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f50633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h f50634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w0 f50635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f50637k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j0 f50638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource f50639b;

        @Override // java.lang.Runnable
        public void run() {
            e.this.n(this.f50638a, this.f50639b);
            e.this.f50635i.c();
            double dG = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f50638a.d());
            e.o(dG);
        }

        private b(j0 j0Var, TaskCompletionSource taskCompletionSource) {
            this.f50638a = j0Var;
            this.f50639b = taskCompletionSource;
        }
    }

    e(h hVar, rd.d dVar, w0 w0Var) {
        this(dVar.f51288f, dVar.f51289g, ((long) dVar.f51290h) * 1000, hVar, w0Var);
    }

    public static /* synthetic */ void a(e eVar, TaskCompletionSource taskCompletionSource, boolean z10, j0 j0Var, Exception exc) {
        eVar.getClass();
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z10) {
            eVar.j();
        }
        taskCompletionSource.trySetResult(j0Var);
    }

    public static /* synthetic */ void b(e eVar, CountDownLatch countDownLatch) {
        eVar.getClass();
        try {
            l.a(eVar.f50634h, a9.e.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f50627a) * Math.pow(this.f50628b, h()));
    }

    private int h() {
        if (this.f50637k == 0) {
            this.f50637k = m();
        }
        int iM = (int) ((m() - this.f50637k) / this.f50629c);
        int iMin = l() ? Math.min(100, this.f50636j + iM) : Math.max(0, this.f50636j - iM);
        if (this.f50636j != iMin) {
            this.f50636j = iMin;
            this.f50637k = m();
        }
        return iMin;
    }

    private boolean k() {
        return this.f50632f.size() < this.f50631e;
    }

    private boolean l() {
        return this.f50632f.size() == this.f50631e;
    }

    private long m() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final j0 j0Var, final TaskCompletionSource taskCompletionSource) {
        g.f().b("Sending report through Google DataTransport: " + j0Var.d());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f50630d < 2000;
        this.f50634h.a(a9.c.g(j0Var.b()), new j() { // from class: qd.c
            @Override // a9.j
            public final void a(Exception exc) {
                e.a(this.f50621a, taskCompletionSource, z10, j0Var, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    TaskCompletionSource i(j0 j0Var, boolean z10) {
        synchronized (this.f50632f) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (!z10) {
                    n(j0Var, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.f50635i.b();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + j0Var.d());
                    this.f50635i.a();
                    taskCompletionSource.trySetResult(j0Var);
                    return taskCompletionSource;
                }
                g.f().b("Enqueueing report: " + j0Var.d());
                g.f().b("Queue size: " + this.f50632f.size());
                this.f50633g.execute(new b(j0Var, taskCompletionSource));
                g.f().b("Closing task for report: " + j0Var.d());
                taskCompletionSource.trySetResult(j0Var);
                return taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: qd.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f50625a, countDownLatch);
            }
        }).start();
        i1.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    e(double d10, double d11, long j10, h hVar, w0 w0Var) {
        this.f50627a = d10;
        this.f50628b = d11;
        this.f50629c = j10;
        this.f50634h = hVar;
        this.f50635i = w0Var;
        this.f50630d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f50631e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f50632f = arrayBlockingQueue;
        this.f50633g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f50636j = 0;
        this.f50637k = 0L;
    }
}
