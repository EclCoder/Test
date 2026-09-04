package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpw implements zzehq {
    private final zzefw zza;
    private final zzcox zzb;

    zzcpw(zzcox zzcoxVar, zzcpu zzcpuVar, zzefw zzefwVar) {
        this.zzb = zzcoxVar;
        this.zza = zzefwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final zzefx zza() {
        zzcox zzcoxVar = this.zzb;
        return zzefy.zza(zzcns.zzd(zzcoxVar.zzI()), zzcoi.zzd(zzcoxVar.zzI()), this.zza, zzcah.zza());
    }
}
