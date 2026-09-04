package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfon {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfoo zzd;

    zzfon(zzfoo zzfooVar, Runnable runnable, long j10) {
        Objects.requireNonNull(zzfooVar);
        this.zzd = zzfooVar;
        this.zza = runnable;
        this.zzb = j10;
    }
}
