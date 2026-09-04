package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdua implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzdua(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static zzdua zza(zzind zzindVar, zzind zzindVar2) {
        return new zzdua(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdtz((zzdpo) this.zza.zzb(), ((zzdql) this.zzb).zza());
    }
}
