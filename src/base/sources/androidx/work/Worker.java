package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    androidx.work.impl.utils.futures.c mFuture;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.o(Worker.this.doWork());
            } catch (Throwable th2) {
                Worker.this.mFuture.p(th2);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture startWork() {
        this.mFuture = androidx.work.impl.utils.futures.c.s();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
