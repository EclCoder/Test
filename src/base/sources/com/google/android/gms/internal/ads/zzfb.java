package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfb {
    final /* synthetic */ zzfc zza;
    private final int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    public zzfb(zzfc zzfcVar, int i10) {
        Objects.requireNonNull(zzfcVar);
        this.zza = zzfcVar;
        this.zzb = i10;
    }

    public final void zza() {
        zzfc zzfcVar = this.zza;
        int iZzi = zzfcVar.zzd().zzi();
        if (!zzfcVar.zzd().zzk() || zzfcVar.zzd().zzh() == 1 || zzfcVar.zzd().zzh() == 4 || iZzi == 0 || iZzi == 1) {
            if (this.zzd) {
                zzfcVar.zzg().zzk(4);
            }
            this.zzd = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzd && this.zzc == iZzi) {
            long j10 = jElapsedRealtime - this.zze;
            int i10 = this.zzb;
            if (j10 >= i10) {
                zzfcVar.zze().zza(new zzfd(4, i10));
                return;
            }
            return;
        }
        this.zzd = true;
        this.zze = jElapsedRealtime;
        this.zzc = iZzi;
        zzfcVar.zzg().zzk(4);
        zzfcVar.zzg().zzi(4, this.zzb);
    }
}
