package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzaz {
    private static volatile Handler zzb;
    private final zzjg zza;
    private final Runnable zzc;
    private volatile long zzd;

    zzaz(zzjg zzjgVar) {
        Preconditions.checkNotNull(zzjgVar);
        this.zza = zzjgVar;
        this.zzc = new zzay(this, zzjgVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzaz.class) {
            try {
                if (zzb == null) {
                    zzb = new com.google.android.gms.internal.measurement.zzcl(this.zza.zzaZ().getMainLooper());
                }
                handler = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public abstract void zza();

    public final void zzb(long j10) {
        zzd();
        if (j10 >= 0) {
            zzjg zzjgVar = this.zza;
            this.zzd = zzjgVar.zzba().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j10)) {
                return;
            }
            zzjgVar.zzaW().zzb().zzb("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean zzc() {
        return this.zzd != 0;
    }

    final void zzd() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    final /* synthetic */ void zze(long j10) {
        this.zzd = 0L;
    }
}
