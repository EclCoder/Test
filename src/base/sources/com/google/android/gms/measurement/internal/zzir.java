package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzir implements Runnable {
    final /* synthetic */ zzbh zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ zzjd zzc;

    zzir(zzjd zzjdVar, zzbh zzbhVar, zzr zzrVar) {
        this.zza = zzbhVar;
        this.zzb = zzrVar;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar = this.zza;
        zzr zzrVar = this.zzb;
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzb(zzjdVar.zzc(zzbhVar, zzrVar), zzrVar);
    }
}
