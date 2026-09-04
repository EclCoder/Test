package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbrk implements zzhbe {
    final /* synthetic */ zzbrc zza;

    zzbrk(zzbro zzbroVar, zzbrc zzbrcVar) {
        this.zza = zzbrcVar;
        Objects.requireNonNull(zzbroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) {
        zzcfw zzcfwVar = new zzcfw();
        ((zzbri) obj).zze(this.zza, new zzbrj(this, zzcfwVar));
        return zzcfwVar;
    }
}
