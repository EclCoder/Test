package al;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class a extends AtomicReference implements rk.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final FutureTask f344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final FutureTask f345d;
    private static final long serialVersionUID = 1811839108042568751L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Runnable f346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Thread f347b;

    static {
        Runnable runnable = vk.a.f55663b;
        f344c = new FutureTask(runnable, null);
        f345d = new FutureTask(runnable, null);
    }

    a(Runnable runnable) {
        this.f346a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f344c) {
                return;
            }
            if (future2 == f345d) {
                future.cancel(this.f347b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // rk.b
    public final void d() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f344c || future == (futureTask = f345d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f347b != Thread.currentThread());
    }
}
