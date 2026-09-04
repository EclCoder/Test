package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxo implements zzimu {
    private final zzcxl zza;

    private zzcxo(zzcxl zzcxlVar) {
        this.zza = zzcxlVar;
    }

    public static zzcxo zzc(zzcxl zzcxlVar) {
        return new zzcxo(zzcxlVar);
    }

    public static zzdfs zzd(zzcxl zzcxlVar) {
        return zzcxlVar.zza();
    }

    public final zzdfs zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
