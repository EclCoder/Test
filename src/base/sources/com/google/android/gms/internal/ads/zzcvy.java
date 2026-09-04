package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvy implements zzimu {
    private final zzcvs zza;
    private final zzind zzb;

    private zzcvy(zzcvs zzcvsVar, zzind zzindVar) {
        this.zza = zzcvsVar;
        this.zzb = zzindVar;
    }

    public static zzcvy zzc(zzcvs zzcvsVar, zzind zzindVar) {
        return new zzcvy(zzcvsVar, zzindVar);
    }

    public static zzcvl zzd(zzcvs zzcvsVar, Object obj) {
        return (zzcvo) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcvl zzb() {
        return ((zzcvp) this.zzb).zzb();
    }
}
