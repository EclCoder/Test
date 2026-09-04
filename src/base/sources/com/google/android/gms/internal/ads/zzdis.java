package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdis implements zzimu {
    private final zzdir zza;
    private final zzind zzb;

    private zzdis(zzdir zzdirVar, zzind zzindVar) {
        this.zza = zzdirVar;
        this.zzb = zzindVar;
    }

    public static zzdis zza(zzdir zzdirVar, zzind zzindVar) {
        return new zzdis(zzdirVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdct zzdctVarZzp = this.zza.zzp(((zzing) this.zzb).zzb());
        zzinc.zzb(zzdctVarZzp);
        return zzdctVarZzp;
    }
}
