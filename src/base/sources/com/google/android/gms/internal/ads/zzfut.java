package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfut extends TimerTask {
    final /* synthetic */ zzfuv zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzfuw zzc;

    zzfut(zzfuw zzfuwVar, zzfuv zzfuvVar, Timer timer) {
        this.zza = zzfuvVar;
        this.zzb = timer;
        Objects.requireNonNull(zzfuwVar);
        this.zzc = zzfuwVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}
