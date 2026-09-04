package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdny implements zzimu {
    private final zzdnx zza;

    private zzdny(zzdnx zzdnxVar) {
        this.zza = zzdnxVar;
    }

    public static zzdny zzc(zzdnx zzdnxVar) {
        return new zzdny(zzdnxVar);
    }

    public final com.google.android.gms.ads.internal.client.zzbh zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
