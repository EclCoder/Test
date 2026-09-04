package com.bytedance.sdk.openadsdk.wu;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private aq f14778hn;
    private ScheduledExecutorService hnj = null;
    private long qor = 0;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private hnj f14779sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
    }

    public hn(aq aqVar, int i10) {
        this.f14778hn = aqVar;
        this.gjv = i10;
    }

    public boolean hn() {
        ScheduledExecutorService scheduledExecutorService = this.hnj;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void hnj(long j10) {
        this.qor = j10;
    }

    public void hnj(int i10) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.hnj = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.hn.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = hn.this.qor;
                if (System.currentTimeMillis() - hn.this.qor > hn.this.gjv) {
                    hn.this.hnj.shutdown();
                    if (hn.this.f14778hn != null) {
                        hn.this.f14778hn.hn(0, "Automatic detection of stuck");
                    }
                    if (hn.this.f14779sk != null) {
                        hnj unused2 = hn.this.f14779sk;
                    }
                }
            }
        }, 0L, i10, TimeUnit.MILLISECONDS);
    }

    public void hnj() {
        ScheduledExecutorService scheduledExecutorService = this.hnj;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
