package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcyn implements zzimu {
    private final zzcyj zza;

    private zzcyn(zzcyj zzcyjVar) {
        this.zza = zzcyjVar;
    }

    public static zzcyn zzc(zzcyj zzcyjVar) {
        return new zzcyn(zzcyjVar);
    }

    public static zzfkq zzd(zzcyj zzcyjVar) {
        zzfkq zzfkqVarZza = zzcyjVar.zza();
        zzinc.zzb(zzfkqVarZza);
        return zzfkqVarZza;
    }

    public final zzfkq zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
