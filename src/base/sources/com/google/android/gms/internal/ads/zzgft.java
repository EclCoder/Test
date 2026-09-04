package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgft implements zzhbe {
    final /* synthetic */ zzgfy zza;

    zzgft(zzgfy zzgfyVar) {
        Objects.requireNonNull(zzgfyVar);
        this.zza = zzgfyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) {
        zzgfr zzgfrVar = (zzgfr) obj;
        if (zzgfrVar != null) {
            return zzhbw.zza(zzgfrVar);
        }
        zzgfy zzgfyVar = this.zza;
        zzgfyVar.zza().zzb(51);
        return zzgfyVar.zzd(zzgfyVar.zze());
    }
}
