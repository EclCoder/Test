package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcgc implements zzhbt {
    final /* synthetic */ zzcga zza;
    final /* synthetic */ zzcfy zzb;

    zzcgc(zzcgd zzcgdVar, zzcga zzcgaVar, zzcfy zzcfyVar) {
        this.zza = zzcgaVar;
        this.zzb = zzcfyVar;
        Objects.requireNonNull(zzcgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
