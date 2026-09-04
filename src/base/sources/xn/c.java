package xn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class c extends r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f56893i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final i0 f56894j = new i0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c f56895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ReentrantLock f56896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Condition f56897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f56898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f56899o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56901g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f56902h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(c cVar) {
            if (d() == null) {
                h(new c());
                new b().start();
            }
            c.y(cVar, 0L, 1, null);
            f().a(cVar);
            if (cVar.f56901g == 1) {
                c().signal();
            }
        }

        public final c b() throws InterruptedException {
            c cVarB = f().b();
            if (cVarB == null) {
                long jNanoTime = System.nanoTime();
                c().await(c.f56898n, TimeUnit.MILLISECONDS);
                if (f().b() != null || System.nanoTime() - jNanoTime < c.f56899o) {
                    return null;
                }
                return d();
            }
            long jW = cVarB.w(System.nanoTime());
            if (jW > 0) {
                c().await(jW, TimeUnit.NANOSECONDS);
                return null;
            }
            f().e(cVarB);
            cVarB.f56900f = 2;
            return cVarB;
        }

        public final Condition c() {
            return c.f56897m;
        }

        public final c d() {
            return c.f56895k;
        }

        public final ReentrantLock e() {
            return c.f56896l;
        }

        public final i0 f() {
            return c.f56894j;
        }

        public final void h(c cVar) {
            c.f56895k = cVar;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockE = c.f56893i.e();
                    reentrantLockE.lock();
                    try {
                        c cVarB = c.f56893i.b();
                        if (cVarB == c.f56893i.d()) {
                            c.f56893i.h(null);
                            reentrantLockE.unlock();
                            return;
                        } else {
                            fl.g0 g0Var = fl.g0.f38750a;
                            reentrantLockE.unlock();
                            if (cVarB != null) {
                                cVarB.z();
                            }
                        }
                    } catch (Throwable th2) {
                        reentrantLockE.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f56896l = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.s.g(conditionNewCondition, "newCondition(...)");
        f56897m = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f56898n = millis;
        f56899o = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static /* synthetic */ void y(c cVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTimeoutAt");
        }
        if ((i10 & 1) != 0) {
            j10 = System.nanoTime();
        }
        cVar.x(j10);
    }

    public final IOException p(IOException iOException) {
        return v(iOException);
    }

    public final void s() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            ReentrantLock reentrantLock = f56896l;
            reentrantLock.lock();
            try {
                if (this.f56900f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f56900f = 1;
                f56893i.g(this);
                fl.g0 g0Var = fl.g0.f38750a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final boolean t() {
        ReentrantLock reentrantLock = f56896l;
        reentrantLock.lock();
        try {
            int i10 = this.f56900f;
            this.f56900f = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f56894j.e(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long u() {
        return this.f56902h;
    }

    protected IOException v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long w(long j10) {
        return this.f56902h - j10;
    }

    public final void x(long j10) {
        long jH = h();
        boolean zE = e();
        if (h() != 0 && e()) {
            this.f56902h = j10 + Math.min(jH, c() - j10);
        } else if (jH != 0) {
            this.f56902h = j10 + jH;
        } else {
            if (!zE) {
                throw new AssertionError();
            }
            this.f56902h = c();
        }
    }

    protected void z() {
    }
}
