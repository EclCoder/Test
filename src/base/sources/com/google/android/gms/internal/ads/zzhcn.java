package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhcn {
    public static Executor zza() {
        return zzhbl.INSTANCE;
    }

    public static zzhcg zzb(ExecutorService executorService) {
        if (executorService instanceof zzhcg) {
            return (zzhcg) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzhcm((ScheduledExecutorService) executorService) : new zzhci(executorService);
    }

    public static zzhch zzc(ScheduledExecutorService scheduledExecutorService) {
        return new zzhcm(scheduledExecutorService);
    }

    static Executor zzd(final Executor executor, final zzhap zzhapVar) {
        executor.getClass();
        return executor == zzhbl.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.zzhcj
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzhcn.zzf(executor, zzhapVar, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzf(Executor executor, zzhap zzhapVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e10) {
            zzhapVar.zzb(e10);
        }
    }
}
