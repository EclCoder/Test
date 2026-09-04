package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzelr implements zzimu {
    private final zzind zza;

    private zzelr(zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzelr zzc(zzind zzindVar) {
        return new zzelr(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzelq zzb() {
        return new zzelq(((zzcns) this.zza).zza());
    }
}
