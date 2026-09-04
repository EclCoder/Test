package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class l implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f7196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f7197b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f7198c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f7199a;

        a(Runnable runnable) {
            this.f7199a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f7199a.run();
            } finally {
                l.this.a();
            }
        }
    }

    l(Executor executor) {
        this.f7196a = executor;
    }

    synchronized void a() {
        Runnable runnable = (Runnable) this.f7197b.poll();
        this.f7198c = runnable;
        if (runnable != null) {
            this.f7196a.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f7197b.offer(new a(runnable));
        if (this.f7198c == null) {
            a();
        }
    }
}
