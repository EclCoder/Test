package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhcq implements Runnable {
    zzhcs zza;

    zzhcq(zzhcs zzhcsVar) {
        this.zza = zzhcsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFutureZzf;
        zzhcs zzhcsVar = this.zza;
        if (zzhcsVar == null || (listenableFutureZzf = zzhcsVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (listenableFutureZzf.isDone()) {
            zzhcsVar.zzk(listenableFutureZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzhcsVar.zzx();
            zzhcsVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb2.append("Timed out");
                        sb2.append(" (timeout delayed by ");
                        sb2.append(jAbs);
                        sb2.append(" ms after scheduled time)");
                        string = sb2.toString();
                    }
                } catch (Throwable th2) {
                    zzhcsVar.zzb(new zzhcr(string, null));
                    throw th2;
                }
            }
            String string2 = listenableFutureZzf.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
            sb3.append(string);
            sb3.append(": ");
            sb3.append(string2);
            zzhcsVar.zzb(new zzhcr(sb3.toString(), null));
            listenableFutureZzf.cancel(true);
        } catch (Throwable th3) {
            listenableFutureZzf.cancel(true);
            throw th3;
        }
    }
}
