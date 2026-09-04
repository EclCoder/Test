package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcny implements zzimu {
    private final zzind zza;

    private zzcny(zzcnl zzcnlVar, zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzcny zzc(zzcnl zzcnlVar, zzind zzindVar) {
        return new zzcny(zzcnlVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        return zzflu.zza(((zzcns) this.zza).zza()).zze();
    }
}
