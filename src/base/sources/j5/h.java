package j5;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f42021b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Runnable f42023d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f42020a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f42022c = new Object();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h f42024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f42025b;

        a(h hVar, Runnable runnable) {
            this.f42024a = hVar;
            this.f42025b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f42025b.run();
            } finally {
                this.f42024a.b();
            }
        }
    }

    public h(Executor executor) {
        this.f42021b = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f42022c) {
            z10 = !this.f42020a.isEmpty();
        }
        return z10;
    }

    void b() {
        synchronized (this.f42022c) {
            try {
                Runnable runnable = (Runnable) this.f42020a.poll();
                this.f42023d = runnable;
                if (runnable != null) {
                    this.f42021b.execute(this.f42023d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f42022c) {
            try {
                this.f42020a.add(new a(this, runnable));
                if (this.f42023d == null) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
