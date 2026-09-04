package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdou implements zzimu {
    private final zzdop zza;

    private zzdou(zzdop zzdopVar) {
        this.zza = zzdopVar;
    }

    public static zzdou zzc(zzdop zzdopVar) {
        return new zzdou(zzdopVar);
    }

    public static zzdux zzd(zzdop zzdopVar) {
        zzdux zzduxVarZzd = zzdopVar.zzd();
        zzinc.zzb(zzduxVarZzd);
        return zzduxVarZzd;
    }

    public final zzdux zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
