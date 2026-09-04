package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcqg implements zzimu {
    private final zzcqf zza;

    private zzcqg(zzcqf zzcqfVar) {
        this.zza = zzcqfVar;
    }

    public static zzcqg zzc(zzcqf zzcqfVar) {
        return new zzcqg(zzcqfVar);
    }

    public static com.google.android.gms.ads.internal.zza zzd(zzcqf zzcqfVar) {
        return new com.google.android.gms.ads.internal.zza(new zzcik(), new zzchf());
    }

    public final com.google.android.gms.ads.internal.zza zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
