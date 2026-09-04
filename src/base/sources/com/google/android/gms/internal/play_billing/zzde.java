package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzde implements Runnable {
    final zzdk zza;
    final zzdd zzb;

    zzde(zzdk zzdkVar, zzdd zzddVar) {
        this.zza = zzdkVar;
        this.zzb = zzddVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thZza;
        zzdk zzdkVar = this.zza;
        if ((zzdkVar instanceof zzdq) && (thZza = zzdr.zza((zzdq) zzdkVar)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            if (!zzdkVar.isDone()) {
                throw new IllegalStateException(zzbo.zzb("Future was expected to be done: %s", zzdkVar));
            }
            boolean z10 = false;
            Future future = zzdkVar;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    future = future;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e10) {
            this.zzb.zza(e10.getCause());
        } catch (Throwable th3) {
            this.zzb.zza(th3);
        }
    }

    public final String toString() {
        zzbh zzbhVarZza = zzbj.zza(this);
        zzbhVarZza.zza(this.zzb);
        return zzbhVarZza.toString();
    }
}
