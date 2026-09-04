package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfgz implements zzfng {
    private final zzfhw zza;

    public zzfgz(zzfhw zzfhwVar) {
        this.zza = zzfhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    public final ListenableFuture zza(zzfnh zzfnhVar) {
        zzfhc zzfhcVar = (zzfhc) zzfnhVar;
        return ((zzfgy) this.zza).zzb(zzfhcVar.zzb, zzfhcVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    public final void zzb(zzfmw zzfmwVar) {
        zzfmwVar.zza = ((zzfgy) this.zza).zza();
    }
}
