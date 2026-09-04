package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcev {
    public final ListenableFuture zza(Context context, int i10) {
        zzcfw zzcfwVar = new zzcfw();
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzA(context)) {
            zzcfr.zza.execute(new zzceu(this, context, zzcfwVar));
        }
        return zzcfwVar;
    }
}
