package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnn implements zzhns {
    private final zziaz zza;
    private final zzhst zzb;

    private zzhnn(zzhst zzhstVar, zziaz zziazVar) {
        this.zzb = zzhstVar;
        this.zza = zziazVar;
    }

    public static zzhnn zza(zzhst zzhstVar) {
        return new zzhnn(zzhstVar, zzhnz.zza(zzhstVar.zza()));
    }

    public static zzhnn zzb(zzhst zzhstVar) {
        return new zzhnn(zzhstVar, zzhnz.zzb(zzhstVar.zza()));
    }

    public final zzhst zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhns
    public final zziaz zzf() {
        return this.zza;
    }
}
