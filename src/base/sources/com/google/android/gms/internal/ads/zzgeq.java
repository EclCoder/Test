package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgeq implements zzgel {
    private final ScheduledExecutorService zza = Executors.newSingleThreadScheduledExecutor();

    zzgeq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final void zza(Runnable runnable, long j10) {
        this.zza.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final void zzb() {
    }
}
