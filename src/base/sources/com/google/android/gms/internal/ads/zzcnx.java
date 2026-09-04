package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnx implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzcnx(zzcnl zzcnlVar, zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static zzcnx zza(zzcnl zzcnlVar, zzind zzindVar, zzind zzindVar2) {
        return new zzcnx(zzcnlVar, zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdI)).booleanValue() ? new zzbap((zzbak) this.zzb.zzb()) : new zzbap((zzbak) this.zza.zzb());
    }
}
