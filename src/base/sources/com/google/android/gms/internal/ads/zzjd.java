package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjd {
    private final long zza;
    private final long zzb;
    private long zzc = C.TIME_UNSET;
    private long zzd = C.TIME_UNSET;
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = C.TIME_UNSET;
    private long zze = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private long zzm = C.TIME_UNSET;
    private long zzn = C.TIME_UNSET;

    /* synthetic */ zzjd(float f10, float f11, long j10, float f12, long j11, long j12, float f13, byte[] bArr) {
        this.zza = j11;
        this.zzb = j12;
    }

    private final void zzf() {
        long j10;
        long j11 = this.zzc;
        if (j11 != C.TIME_UNSET) {
            j10 = this.zzd;
            if (j10 == C.TIME_UNSET) {
                long j12 = this.zzf;
                if (j12 != C.TIME_UNSET && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.zzg;
                if (j10 == C.TIME_UNSET || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.zze == j10) {
            return;
        }
        this.zze = j10;
        this.zzh = j10;
        this.zzm = C.TIME_UNSET;
        this.zzn = C.TIME_UNSET;
        this.zzl = C.TIME_UNSET;
    }

    private static long zzg(long j10, long j11, float f10) {
        return (long) ((j10 * 0.999f) + (j11 * 9.999871E-4f));
    }

    public final void zza(zzaf zzafVar) {
        long j10 = zzafVar.zza;
        this.zzc = zzfl.zzs(C.TIME_UNSET);
        this.zzf = zzfl.zzs(C.TIME_UNSET);
        this.zzg = zzfl.zzs(C.TIME_UNSET);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j10) {
        this.zzd = j10;
        zzf();
    }

    public final void zzc() {
        long j10 = this.zzh;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        long j11 = j10 + this.zzb;
        this.zzh = j11;
        long j12 = this.zzg;
        if (j12 != C.TIME_UNSET && j11 > j12) {
            this.zzh = j12;
        }
        this.zzl = C.TIME_UNSET;
    }

    public final float zzd(long j10, long j11) {
        long j12;
        if (this.zzc == C.TIME_UNSET) {
            return 1.0f;
        }
        long j13 = j10 - j11;
        long j14 = this.zzm;
        if (j14 == C.TIME_UNSET) {
            this.zzm = j13;
            this.zzn = 0L;
        } else {
            long jMax = Math.max(j13, zzg(j14, j13, 0.999f));
            this.zzm = jMax;
            this.zzn = zzg(this.zzn, Math.abs(j13 - jMax), 0.999f);
        }
        if (this.zzl != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j15 = this.zzm + (this.zzn * 3);
        if (this.zzh > j15) {
            float fZzs = zzfl.zzs(1000L);
            long[] jArr = {j15, this.zze, this.zzh - (((long) ((this.zzk - 1.0f) * fZzs)) + ((long) ((this.zzi - 1.0f) * fZzs)))};
            j12 = jArr[0];
            for (int i10 = 1; i10 < 3; i10++) {
                long j16 = jArr[i10];
                if (j16 > j12) {
                    j12 = j16;
                }
            }
            this.zzh = j12;
        } else {
            long jMax2 = j10 - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j17 = this.zzh;
            String str = zzfl.zza;
            long jMax3 = Math.max(j17, Math.min(jMax2, j15));
            this.zzh = jMax3;
            long j18 = this.zzg;
            if (j18 == C.TIME_UNSET || jMax3 <= j18) {
                j12 = jMax3;
            } else {
                this.zzh = j18;
                j12 = j18;
            }
        }
        long j19 = j10 - j12;
        if (Math.abs(j19) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j19 * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zze() {
        return this.zzh;
    }
}
