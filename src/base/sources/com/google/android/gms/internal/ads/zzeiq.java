package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeiq {
    private final zzcaw zza;

    zzeiq(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    public final void zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziG)).booleanValue()) {
            zzcfu.zzb(listenableFutureZza, "persistFlags");
        } else {
            zzcfu.zza(listenableFutureZza, "persistFlags", zzcfr.zzh);
        }
    }
}
