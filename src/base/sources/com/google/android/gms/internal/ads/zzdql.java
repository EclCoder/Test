package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdql implements zzimu {
    private final zzdqe zza;

    private zzdql(zzdqe zzdqeVar) {
        this.zza = zzdqeVar;
    }

    public static zzdql zzc(zzdqe zzdqeVar) {
        return new zzdql(zzdqeVar);
    }

    public static zzdpt zzd(zzdqe zzdqeVar) {
        zzdpt zzdptVarZza = zzdqeVar.zza();
        zzinc.zzb(zzdptVarZza);
        return zzdptVarZza;
    }

    public final zzdpt zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
