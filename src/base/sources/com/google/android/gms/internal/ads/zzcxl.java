package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxl {
    private final zzdfs zza;
    private final zzdhx zzb;

    public zzcxl(zzdfs zzdfsVar, zzdhx zzdhxVar) {
        this.zza = zzdfsVar;
        this.zzb = zzdhxVar;
    }

    public final zzdfs zza() {
        return this.zza;
    }

    final zzdkq zzb() {
        zzdhx zzdhxVar = this.zzb;
        return zzdhxVar != null ? new zzdkq(zzdhxVar, zzcfr.zzh) : new zzdkq(new zzcxk(this), zzcfr.zzh);
    }

    final zzdhx zzc() {
        return this.zzb;
    }
}
