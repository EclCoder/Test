package com.bytedance.sdk.component.sk.hn.hnj;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements ThreadFactory {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final AtomicInteger f12948hn = new AtomicInteger(1);
    private final ThreadGroup hnj;

    public hnj(String str) {
        this.hnj = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.hnj, runnable, "tt_img_" + this.f12948hn.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
