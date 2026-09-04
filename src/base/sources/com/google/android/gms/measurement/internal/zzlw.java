package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzlw implements Runnable {
    final /* synthetic */ zzlu zza;
    final /* synthetic */ zzlu zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzmb zze;

    zzlw(zzmb zzmbVar, zzlu zzluVar, zzlu zzluVar2, long j10, boolean z10) {
        this.zza = zzluVar;
        this.zzb = zzluVar2;
        this.zzc = j10;
        this.zzd = z10;
        Objects.requireNonNull(zzmbVar);
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzm(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
