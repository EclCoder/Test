package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzog {
    private final String zza = "com.google.android.gms.measurement";
    private final zzph zzb;

    public zzog(String str, zzph zzphVar) {
        this.zzb = zzphVar;
    }

    public final zzom zza(String str, boolean z10) {
        return new zznx(this.zza, str, this.zzb, z10);
    }

    public final zzom zzb(String str, long j10) {
        return new zzob(this.zza, str, this.zzb, j10);
    }

    public final zzom zzc(String str, double d10) {
        return new zznz(this.zza, "measurement.test.double_flag", this.zzb, -3.0d);
    }

    public final zzom zzd(String str, String str2) {
        return new zzod(this.zza, str, this.zzb, str2);
    }
}
