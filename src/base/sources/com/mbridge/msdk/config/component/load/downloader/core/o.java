package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class o implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28902a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f28903a;

        a(Runnable runnable) {
            this.f28903a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.f28902a);
            } catch (Throwable th2) {
                q0.b("PriorityThreadFactory", "set thread priority error : " + th2.getMessage());
            }
            try {
                this.f28903a.run();
            } catch (Exception e10) {
                q0.b("PriorityThreadFactory", "runnable error : " + e10.getMessage());
            }
        }
    }

    o(int i10) {
        this.f28902a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }
}
