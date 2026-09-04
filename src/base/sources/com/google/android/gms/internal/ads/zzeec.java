package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeec implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzeec(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static zzeec zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzeec(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeeb(((zzcns) this.zza).zza(), ((zzcoi) this.zzb).zza(), zzfoa.zzc());
    }
}
