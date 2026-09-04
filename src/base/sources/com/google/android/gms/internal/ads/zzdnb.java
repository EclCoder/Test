package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdnb implements zzimu {
    private final zzdmd zza;

    private zzdnb(zzdmd zzdmdVar) {
        this.zza = zzdmdVar;
    }

    public static zzdnb zzc(zzdmd zzdmdVar) {
        return new zzdnb(zzdmdVar);
    }

    public final zzcku zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
