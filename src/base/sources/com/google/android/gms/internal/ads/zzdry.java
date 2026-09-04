package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdry implements zzimu {
    private final zzind zza;

    private zzdry(zzdrx zzdrxVar, zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzdry zza(zzdrx zzdrxVar, zzind zzindVar) {
        return new zzdry(zzdrxVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdrv zzdrvVar = (zzdrv) this.zza.zzb();
        zzinc.zzb(zzdrvVar);
        return zzdrvVar;
    }
}
