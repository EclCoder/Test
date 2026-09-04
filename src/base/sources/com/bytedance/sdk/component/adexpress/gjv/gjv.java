package com.bytedance.sdk.component.adexpress.gjv;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public static void hn(com.bytedance.sdk.component.aq.hn.qor qorVar, int i10) {
        if (qorVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.hnj.hnj.qor qorVarQor = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor();
        ExecutorService executorServiceOrl = qorVarQor != null ? qorVarQor.orl() : null;
        if (executorServiceOrl != null) {
            qorVar.setPriority(i10);
            executorServiceOrl.execute(qorVar);
        }
    }

    public static void hnj(com.bytedance.sdk.component.aq.hn.qor qorVar, int i10) {
        if (qorVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.hnj.hnj.qor qorVarQor = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor();
        ExecutorService executorServiceMjg = qorVarQor != null ? qorVarQor.mjg() : null;
        if (executorServiceMjg != null) {
            qorVar.setPriority(i10);
            executorServiceMjg.execute(qorVar);
        }
    }

    public static ScheduledFuture hnj(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.hnj.hnj.qor qorVarQor = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor();
        ScheduledExecutorService scheduledExecutorServiceFc = qorVarQor != null ? qorVarQor.fc() : null;
        if (scheduledExecutorServiceFc != null) {
            return scheduledExecutorServiceFc.schedule(runnable, j10, timeUnit);
        }
        return null;
    }
}
