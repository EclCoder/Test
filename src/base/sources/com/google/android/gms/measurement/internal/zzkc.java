package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzkc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ Bundle zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ String zzi;
    final /* synthetic */ zzlj zzj;

    zzkc(zzlj zzljVar, String str, String str2, long j10, long j11, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bundle;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = str3;
        Objects.requireNonNull(zzljVar);
        this.zzj = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzj.zzG(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }
}
