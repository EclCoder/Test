package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpc implements zzimu {
    private final zzind zza;

    private zzdpc(zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzdpc zzc(zzind zzindVar) {
        return new zzdpc(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdpb zzb() {
        return new zzdpb(((zzdql) this.zza).zza());
    }
}
