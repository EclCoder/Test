package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeaz implements zzimu {
    private final zzind zza;

    private zzeaz(zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzeaz zzc(zzind zzindVar) {
        return new zzeaz(zzindVar);
    }

    public static zzeay zzd(zzbqq zzbqqVar) {
        return new zzeay(zzbqqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeay zzb() {
        return new zzeay((zzbqq) this.zza.zzb());
    }
}
