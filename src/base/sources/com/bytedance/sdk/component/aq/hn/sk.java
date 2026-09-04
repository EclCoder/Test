package com.bytedance.sdk.component.aq.hn;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements ThreadFactory {
    public static volatile boolean qor;
    private final AtomicInteger gjv = new AtomicInteger(1);

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final String f12747hn;
    protected final ThreadGroup hnj;

    public sk(String str) {
        this.hnj = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.f12747hn = hnj(str);
    }

    protected Thread hnj(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (qor) {
            return null;
        }
        Thread threadHnj = hnj(this.hnj, runnable, this.f12747hn + "_" + this.gjv.getAndIncrement());
        if (threadHnj.isDaemon()) {
            threadHnj.setDaemon(false);
        }
        return threadHnj;
    }

    public static String hnj(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
