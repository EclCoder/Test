package com.bytedance.sdk.component.hn.hnj.hnj.hnj;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends com.bytedance.sdk.component.hn.hnj.gjv {
    private ExecutorService hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<com.bytedance.sdk.component.hn.hnj.hn> f12873hn = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.hn.hnj.hn> qor = new CopyOnWriteArrayList();
    private AtomicInteger gjv = new AtomicInteger(64);

    public dkl() {
        if (this.hnj == null) {
            this.hnj = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.hn.hnj.hnj.hnj.dkl.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.hn.hnj.gjv
    public List<com.bytedance.sdk.component.hn.hnj.hn> gjv() {
        return this.qor;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.gjv
    public ExecutorService hn() {
        return this.hnj;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.gjv
    public void hnj(int i10) {
        this.gjv.set(i10);
    }

    @Override // com.bytedance.sdk.component.hn.hnj.gjv
    public List<com.bytedance.sdk.component.hn.hnj.hn> qor() {
        return this.f12873hn;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.gjv
    public int hnj() {
        return this.gjv.get();
    }
}
