package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzekh implements zzimu {
    private final zzind zza;

    private zzekh(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static zzekh zza(zzind zzindVar, zzind zzindVar2) {
        return new zzekh(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzekg(((zzcns) this.zza).zza(), zzfoa.zzc());
    }
}
