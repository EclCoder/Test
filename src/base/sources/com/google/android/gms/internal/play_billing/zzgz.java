package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgz {
    protected volatile zzhr zza;
    private final zzhr zzb;
    private final zzgc zzc;
    private volatile zzfp zzd;
    private volatile boolean zze;

    zzgz(zzhr zzhrVar) {
        if (zzhrVar == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.zza = zzhrVar;
        this.zzb = zzhrVar.zzl();
        int i10 = zzgc.zzb;
        int i11 = zzfc.zza;
        this.zzc = zzgc.zza;
        this.zzd = null;
        this.zze = false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgz)) {
            return zzc().equals(obj);
        }
        zzgz zzgzVar = (zzgz) obj;
        if (this.zzd == null || zzgzVar.zzd == null || this.zzc != zzgzVar.zzc || !this.zzd.equals(zzgzVar.zzd)) {
            return zzc().equals(zzgzVar.zzc());
        }
        return true;
    }

    public final int hashCode() {
        return zzc().hashCode();
    }

    public final String toString() {
        return zzc().toString();
    }

    final int zza() {
        return this.zzd != null ? this.zzd.zzd() : this.zza.zzn();
    }

    final zzfp zzb() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            try {
                if (this.zzd != null) {
                    return this.zzd;
                }
                this.zzd = this.zza.zzj();
                return this.zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final zzhr zzc() {
        try {
            return this.zza;
        } catch (zzhb unused) {
            zzgc.zzb();
            return this.zzb;
        }
    }
}
