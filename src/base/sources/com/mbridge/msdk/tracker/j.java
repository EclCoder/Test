package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f33733a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f33735a;

        public b(Runnable runnable) {
            this.f33735a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.b(this.f33735a)) {
                return;
            }
            try {
                this.f33735a.run();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f33703a) {
                    Log.e("TrackManager", "execute error", e10);
                }
            }
        }
    }

    public void a(Runnable runnable) {
        if (this.f33733a == null) {
            this.f33733a = a();
        }
        if (this.f33733a.isShutdown()) {
            return;
        }
        this.f33733a.execute(new b(runnable));
    }

    private ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
