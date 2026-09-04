package al;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e extends ok.h.b implements rk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f384b;

    public e(ThreadFactory threadFactory) {
        this.f383a = i.a(threadFactory);
    }

    @Override // ok.h.b
    public rk.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // ok.h.b
    public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f384b ? uk.c.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // rk.b
    public void d() {
        if (this.f384b) {
            return;
        }
        this.f384b = true;
        this.f383a.shutdownNow();
    }

    public h e(Runnable runnable, long j10, TimeUnit timeUnit, uk.a aVar) {
        h hVar = new h(cl.a.l(runnable), aVar);
        if (aVar != null && !aVar.b(hVar)) {
            return hVar;
        }
        try {
            hVar.a(j10 <= 0 ? this.f383a.submit((Callable) hVar) : this.f383a.schedule((Callable) hVar, j10, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e10) {
            if (aVar != null) {
                aVar.c(hVar);
            }
            cl.a.k(e10);
            return hVar;
        }
    }

    public rk.b f(Runnable runnable, long j10, TimeUnit timeUnit) {
        g gVar = new g(cl.a.l(runnable));
        try {
            gVar.a(j10 <= 0 ? this.f383a.submit(gVar) : this.f383a.schedule(gVar, j10, timeUnit));
            return gVar;
        } catch (RejectedExecutionException e10) {
            cl.a.k(e10);
            return uk.c.INSTANCE;
        }
    }

    public void g() {
        if (this.f384b) {
            return;
        }
        this.f384b = true;
        this.f383a.shutdown();
    }
}
