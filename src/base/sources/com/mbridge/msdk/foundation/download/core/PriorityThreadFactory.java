package com.mbridge.msdk.foundation.download.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class PriorityThreadFactory implements ThreadFactory {
    private final int threadPriority;

    PriorityThreadFactory(int i10) {
        this.threadPriority = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread thread = new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.PriorityThreadFactory.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(PriorityThreadFactory.this.threadPriority);
                } catch (Throwable unused) {
                }
                try {
                    runnable.run();
                } catch (Exception unused2) {
                }
            }
        });
        thread.setName("mb_download_thread");
        return thread;
    }
}
