package k5;

import android.os.Handler;
import android.os.Looper;
import j5.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements k5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f42984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f42985b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f42986c = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.c(runnable);
        }
    }

    public b(Executor executor) {
        this.f42984a = new h(executor);
    }

    @Override // k5.a
    public Executor a() {
        return this.f42986c;
    }

    @Override // k5.a
    public void b(Runnable runnable) {
        this.f42984a.execute(runnable);
    }

    public void c(Runnable runnable) {
        this.f42985b.post(runnable);
    }

    @Override // k5.a
    public h getBackgroundExecutor() {
        return this.f42984a;
    }
}
