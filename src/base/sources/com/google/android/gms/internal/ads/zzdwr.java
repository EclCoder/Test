package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwr implements zzimu {
    private final zzind zza;

    private zzdwr(zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzdwr zzc(zzind zzindVar) {
        return new zzdwr(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdwq zzb() {
        return new zzdwq((zzcku) this.zza.zzb());
    }
}
