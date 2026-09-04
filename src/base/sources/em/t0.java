package em;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends j1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t0 f38057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f38058j;

    static {
        Long l10;
        t0 t0Var = new t0();
        f38057i = t0Var;
        i1.d1(t0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f38058j = timeUnit.toNanos(l10.longValue());
    }

    private t0() {
    }

    private final synchronized void C1() {
        if (F1()) {
            debugStatus = 3;
            w1();
            kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread D1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f38057i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean E1() {
        return debugStatus == 4;
    }

    private final boolean F1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean G1() {
        if (F1()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void H1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // em.j1, em.x0
    public e1 i(long j10, Runnable runnable, kl.j jVar) {
        return z1(j10, runnable);
    }

    @Override // em.k1
    protected Thread i1() {
        Thread thread = _thread;
        return thread == null ? D1() : thread;
    }

    @Override // em.k1
    protected void j1(long j10, j1.c cVar) {
        H1();
    }

    @Override // em.j1
    public void o1(Runnable runnable) {
        if (E1()) {
            H1();
        }
        super.o1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zU1;
        w2.f38068a.d(this);
        c.a();
        try {
            if (!G1()) {
                if (zU1) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jG1 = g1();
                if (jG1 == Long.MAX_VALUE) {
                    c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f38058j + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        if (zU1) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jG1 = yl.g.g(jG1, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jG1 > 0) {
                    if (F1()) {
                        if (zU1) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        c.a();
                        LockSupport.parkNanos(this, jG1);
                    }
                }
            }
        } finally {
            _thread = null;
            C1();
            c.a();
            if (!u1()) {
                i1();
            }
        }
    }

    @Override // em.j1, em.i1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // em.k0
    public String toString() {
        return "DefaultExecutor";
    }
}
