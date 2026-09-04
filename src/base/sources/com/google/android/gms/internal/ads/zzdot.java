package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdot implements zzimu {
    private final zzind zza;

    private zzdot(zzdop zzdopVar, zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzdot zzc(zzdop zzdopVar, zzind zzindVar) {
        return new zzdot(zzdopVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdqb zzb() {
        zzdon zzdonVar = (zzdon) this.zza.zzb();
        zzinc.zzb(zzdonVar);
        return zzdonVar;
    }
}
