package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcyd implements zzhbt {
    final /* synthetic */ zzhbt zza;
    final /* synthetic */ zzcyi zzb;

    zzcyd(zzcyi zzcyiVar, zzhbt zzhbtVar) {
        this.zza = zzhbtVar;
        Objects.requireNonNull(zzcyiVar);
        this.zzb = zzcyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        this.zzb.zzf();
        this.zza.zza(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzf();
        this.zza.zzb((zzcxt) obj);
    }
}
