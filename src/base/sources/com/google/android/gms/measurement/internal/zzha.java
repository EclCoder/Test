package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzha implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzhb zzb;

    zzha(zzhb zzhbVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzhbVar);
        this.zzb = zzhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().zzat(this.zza);
    }
}
