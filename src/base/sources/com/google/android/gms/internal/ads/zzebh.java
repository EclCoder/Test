package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzebh extends zzcco {
    final /* synthetic */ zzebj zza;

    zzebh(zzebj zzebjVar) {
        Objects.requireNonNull(zzebjVar);
        this.zza = zzebjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze() {
        zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzk(zzebjVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(int i10) {
        zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzl(zzebjVar.zzd(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzl(zzebjVar.zzd(), zzeVar.zza);
    }
}
