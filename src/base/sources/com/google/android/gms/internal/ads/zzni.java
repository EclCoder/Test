package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzni {
    public static final zzni zza;
    public static final zzni zzb;
    public static final zzni zzc;
    public final long zzd;
    public final long zze;

    static {
        zzni zzniVar = new zzni(0L, 0L);
        zza = zzniVar;
        new zzni(Long.MAX_VALUE, Long.MAX_VALUE);
        zzb = new zzni(Long.MAX_VALUE, 0L);
        new zzni(0L, Long.MAX_VALUE);
        zzc = zzniVar;
    }

    public zzni(long j10, long j11) {
        zzgtj.zza(j10 >= 0);
        zzgtj.zza(j11 >= 0);
        this.zzd = j10;
        this.zze = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzni.class == obj.getClass()) {
            zzni zzniVar = (zzni) obj;
            if (this.zzd == zzniVar.zzd && this.zze == zzniVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzd) * 31) + ((int) this.zze);
    }
}
