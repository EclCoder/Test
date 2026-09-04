package c9;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class n implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f9669a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f9670a;

        a(Runnable runnable) {
            this.f9670a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9670a.run();
            } catch (Exception e10) {
                g9.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    n(Executor executor) {
        this.f9669a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f9669a.execute(new a(runnable));
    }
}
