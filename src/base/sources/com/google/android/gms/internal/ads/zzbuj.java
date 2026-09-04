package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbuj implements zzcga {
    final /* synthetic */ zzbto zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcfw zzc;
    final /* synthetic */ zzbum zzd;

    zzbuj(zzbum zzbumVar, zzbto zzbtoVar, Object obj, zzcfw zzcfwVar) {
        this.zza = zzbtoVar;
        this.zzb = obj;
        this.zzc = zzcfwVar;
        Objects.requireNonNull(zzbumVar);
        this.zzd = zzbumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcfw zzcfwVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbtv) obj, obj2, zzcfwVar);
    }
}
