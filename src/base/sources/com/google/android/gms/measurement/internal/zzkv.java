package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzkv implements Runnable {
    final /* synthetic */ zzjl zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzlj zzd;

    zzkv(zzlj zzljVar, zzjl zzjlVar, long j10, boolean z10) {
        this.zza = zzjlVar;
        this.zzb = j10;
        this.zzc = z10;
        Objects.requireNonNull(zzljVar);
        this.zzd = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.zzd;
        zzjl zzjlVar = this.zza;
        zzljVar.zzz(zzjlVar);
        zzljVar.zzaj(zzjlVar, this.zzb, false, this.zzc);
    }
}
