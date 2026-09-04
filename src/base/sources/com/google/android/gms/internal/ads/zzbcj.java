package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcj extends zzbdf {
    private final long zzh;

    public zzbcj(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, long j10, int i10, int i11) {
        super(zzbbsVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", zzaxmVar, i10, 25);
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        long jLongValue = ((Long) this.zze.invoke(null, null)).longValue();
        zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            try {
                zzaxmVar.zzac(jLongValue);
                long j10 = this.zzh;
                if (j10 != 0) {
                    zzaxmVar.zzk(jLongValue - j10);
                    zzaxmVar.zzn(j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
