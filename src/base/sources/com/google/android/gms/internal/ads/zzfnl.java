package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfnl {
    private final long zza;
    private long zzc;
    private final zzfnk zzb = new zzfnk();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfnl() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zza = jCurrentTimeMillis;
        this.zzc = jCurrentTimeMillis;
    }

    public final void zza() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
        this.zzb.zza = true;
    }

    public final void zzc() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final long zzd() {
        return this.zza;
    }

    public final long zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final zzfnk zzg() {
        zzfnk zzfnkVar = this.zzb;
        zzfnk zzfnkVarClone = zzfnkVar.clone();
        zzfnkVar.zza = false;
        zzfnkVar.zzb = 0;
        return zzfnkVarClone;
    }

    public final String zzh() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }
}
