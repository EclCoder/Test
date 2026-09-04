package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzh {
    static final zzh zza = new zzh(null, null);
    final Runnable zzb;
    final Executor zzc;
    zzh zzd;

    zzh(Runnable runnable, Executor executor) {
        this.zzb = runnable;
        this.zzc = executor;
    }
}
