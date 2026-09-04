package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhcu extends zzhcd {
    final /* synthetic */ zzhcv zza;
    private final Callable zzb;

    zzhcu(zzhcv zzhcvVar, Callable callable) {
        Objects.requireNonNull(zzhcvVar);
        this.zza = zzhcvVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final Object zza() {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final void zzf(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final void zzg(Throwable th2) {
        this.zza.zzb(th2);
    }
}
