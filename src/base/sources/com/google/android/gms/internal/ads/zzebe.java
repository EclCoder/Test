package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzebe extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ zzeay zza;
    final /* synthetic */ zzebf zzb;

    zzebe(zzebf zzebfVar, zzeay zzeayVar) {
        this.zza = zzeayVar;
        Objects.requireNonNull(zzebfVar);
        this.zzb = zzebfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() {
        this.zza.zzi(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(int i10) {
        this.zza.zzf(this.zzb.zzd(), i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzf(this.zzb.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() {
        this.zza.zze(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        this.zza.zzg(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        this.zza.zzh(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
    }
}
