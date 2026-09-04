package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdm implements Runnable {
    zzdp zza;

    zzdm(zzdp zzdpVar) {
        this.zza = zzdpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdk zzdkVar;
        zzdp zzdpVar = this.zza;
        if (zzdpVar == null || (zzdkVar = zzdpVar.zzd) == null) {
            return;
        }
        this.zza = null;
        if (zzdkVar.isDone()) {
            zzdpVar.zzj(zzdkVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzdpVar.zze;
            zzdpVar.zze = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    zzdpVar.zzi(new zzdn(str, null));
                    throw th2;
                }
            }
            zzdpVar.zzi(new zzdn(str + ": " + zzdkVar.toString(), null));
            zzdkVar.cancel(true);
        } catch (Throwable th3) {
            zzdkVar.cancel(true);
            throw th3;
        }
    }
}
