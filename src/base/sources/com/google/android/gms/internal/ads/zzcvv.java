package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvv implements zzimu {
    private final zzcvs zza;

    private zzcvv(zzcvs zzcvsVar) {
        this.zza = zzcvsVar;
    }

    public static zzcvv zzc(zzcvs zzcvsVar) {
        return new zzcvv(zzcvsVar);
    }

    public static zzfkg zzd(zzcvs zzcvsVar) {
        zzfkg zzfkgVarZzd = zzcvsVar.zzd();
        zzinc.zzb(zzfkgVarZzd);
        return zzfkgVarZzd;
    }

    public final zzfkg zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
