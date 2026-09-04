package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeuq implements zzfck {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    zzeuq(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        ListenableFuture listenableFuture = this.zza;
        zzeup zzeupVar = zzeup.zza;
        Executor executor = this.zzb;
        ListenableFuture listenableFutureZzj = zzhbw.zzj(listenableFuture, zzeupVar, executor);
        zzbih zzbihVar = zzbiq.zznW;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue() > 0) {
            listenableFutureZzj = zzhbw.zzi(listenableFutureZzj, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzhbw.zzh(listenableFutureZzj, Throwable.class, zzeuo.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 6;
    }
}
