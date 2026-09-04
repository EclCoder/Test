package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgin implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzgin(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static zzgin zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzgin(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgim((zzaxm) this.zza.zzb(), (zzght) this.zzb.zzb(), (zzgqh) this.zzc.zzb());
    }
}
