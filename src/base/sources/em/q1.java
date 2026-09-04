package em;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q1 extends p1 implements x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f38051d;

    public q1(Executor executor) {
        this.f38051d = executor;
        jm.a.a(Y0());
    }

    private final void X0(kl.j jVar, RejectedExecutionException rejectedExecutionException) {
        b2.c(jVar, n1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture Z0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kl.j jVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            X0(jVar, e10);
            return null;
        }
    }

    @Override // em.k0
    public void T0(kl.j jVar, Runnable runnable) {
        try {
            Executor executorY0 = Y0();
            c.a();
            executorY0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            X0(jVar, e10);
            c1.b().T0(jVar, runnable);
        }
    }

    public Executor Y0() {
        return this.f38051d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorY0 = Y0();
        ExecutorService executorService = executorY0 instanceof ExecutorService ? (ExecutorService) executorY0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof q1) && ((q1) obj).Y0() == Y0();
    }

    public int hashCode() {
        return System.identityHashCode(Y0());
    }

    @Override // em.x0
    public e1 i(long j10, Runnable runnable, kl.j jVar) {
        long j11;
        Runnable runnable2;
        kl.j jVar2;
        Executor executorY0 = Y0();
        ScheduledFuture scheduledFutureZ0 = null;
        ScheduledExecutorService scheduledExecutorService = executorY0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorY0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            jVar2 = jVar;
            scheduledFutureZ0 = Z0(scheduledExecutorService, runnable2, jVar2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            jVar2 = jVar;
        }
        return scheduledFutureZ0 != null ? new d1(scheduledFutureZ0) : t0.f38057i.i(j11, runnable2, jVar2);
    }

    @Override // em.x0
    public void i0(long j10, o oVar) {
        long j11;
        Executor executorY0 = Y0();
        ScheduledFuture scheduledFutureZ0 = null;
        ScheduledExecutorService scheduledExecutorService = executorY0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorY0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureZ0 = Z0(scheduledExecutorService, new q2(this, oVar), oVar.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureZ0 != null) {
            s.c(oVar, new m(scheduledFutureZ0));
        } else {
            t0.f38057i.i0(j11, oVar);
        }
    }

    @Override // em.k0
    public String toString() {
        return Y0().toString();
    }
}
