package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcfr;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public ListenableFuture zzb() {
        return zzcfr.zza.submit(this.zza);
    }

    final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}
