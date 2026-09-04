package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhbu implements Runnable {
    final Future zza;
    final zzhbt zzb;

    zzhbu(Future future, zzhbt zzhbtVar) {
        this.zza = future;
        this.zzb = zzhbtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Future future = this.zza;
        if ((future instanceof zzhcy) && (thZza = zzhcz.zza((zzhcy) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzhbw.zzs(future));
        } catch (ExecutionException e10) {
            this.zzb.zza(e10.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzgtf zzgtfVarZzb = zzgtg.zzb(this);
        zzgtfVarZzb.zza(this.zzb);
        return zzgtfVarZzb.toString();
    }
}
