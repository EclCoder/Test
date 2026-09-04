package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zztq {
    private Exception zza;
    private long zzb = C.TIME_UNSET;
    private long zzc = C.TIME_UNSET;

    public final void zza(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
        }
        if (this.zzb == C.TIME_UNSET && !zztr.zzH()) {
            this.zzb = 200 + jElapsedRealtime;
        }
        long j10 = this.zzb;
        if (j10 == C.TIME_UNSET || jElapsedRealtime < j10) {
            this.zzc = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.zza;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.zza;
        zzc();
        throw exc3;
    }

    public final boolean zzb() {
        if (this.zza == null) {
            return false;
        }
        return zztr.zzH() || SystemClock.elapsedRealtime() < this.zzc;
    }

    public final void zzc() {
        this.zza = null;
        this.zzb = C.TIME_UNSET;
        this.zzc = C.TIME_UNSET;
    }
}
