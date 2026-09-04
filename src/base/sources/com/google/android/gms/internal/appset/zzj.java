package com.google.android.gms.internal.appset;

import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzj implements Runnable {
    final /* synthetic */ zzl zza;

    /* synthetic */ zzj(zzl zzlVar, zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jZza = this.zza.zza();
        if (jZza == -1 || DefaultClock.getInstance().currentTimeMillis() <= jZza) {
            return;
        }
        zzl.zze(this.zza.zzb);
    }
}
