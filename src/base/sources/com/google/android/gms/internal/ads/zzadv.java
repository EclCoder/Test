package com.google.android.gms.internal.ads;

import android.util.Range;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzadv {
    private long zza;
    private long zzb;
    private double zzc;
    private Range zzd;

    public zzadv(float f10) {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.zzd = range;
        this.zzc = ((Double) range.getUpper()).doubleValue();
        this.zza = C.TIME_UNSET;
        this.zzb = C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void zza(long j10, long j11) {
        double dDoubleValue;
        zzgtj.zza(j10 != C.TIME_UNSET);
        zzgtj.zza(j11 != C.TIME_UNSET);
        long j12 = this.zza;
        if (j12 != C.TIME_UNSET) {
            long j13 = this.zzb;
            if (j13 == C.TIME_UNSET || j10 == j12) {
                dDoubleValue = ((Double) this.zzd.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j11 - j13) / (j10 - j12);
            }
        } else {
            dDoubleValue = ((Double) this.zzd.getUpper()).doubleValue();
        }
        this.zzc = (this.zzc * 0.800000011920929d) + (((Double) this.zzd.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d);
        this.zza = j10;
        this.zzb = j11;
    }

    public final long zzb(long j10) {
        long j11 = this.zza;
        if (j11 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        return (long) (this.zzb + ((j10 - j11) * this.zzc));
    }

    public final void zzc(float f10) {
        zzgtj.zza(f10 > 0.0f);
        this.zzd = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        zzd();
    }

    public final void zzd() {
        this.zzc = ((Double) this.zzd.getUpper()).doubleValue();
        this.zza = C.TIME_UNSET;
        this.zzb = C.TIME_UNSET;
    }
}
