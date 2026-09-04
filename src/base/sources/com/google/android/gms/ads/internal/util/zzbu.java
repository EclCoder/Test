package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbu {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbu(long j10) {
        this.zza = j10;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                if (this.zzb + this.zza > jElapsedRealtime) {
                    return false;
                }
                this.zzb = jElapsedRealtime;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(long j10) {
        synchronized (this.zzc) {
            this.zza = j10;
        }
    }
}
