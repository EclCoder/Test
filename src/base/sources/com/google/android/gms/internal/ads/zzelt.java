package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzelt implements zzels {
    public final zzels zza;
    private final zzgta zzb;

    public zzelt(zzels zzelsVar, zzgta zzgtaVar) {
        this.zza = zzelsVar;
        this.zzb = zzgtaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(zzfkq zzfkqVar, zzfkf zzfkfVar) {
        return this.zza.zza(zzfkqVar, zzfkfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final ListenableFuture zzb(zzfkq zzfkqVar, zzfkf zzfkfVar) {
        return zzhbw.zzk(this.zza.zzb(zzfkqVar, zzfkfVar), this.zzb, zzcfr.zza);
    }
}
