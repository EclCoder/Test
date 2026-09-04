package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzig implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzjd zze;

    zzig(zzjd zzjdVar, String str, String str2, String str3, long j10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j10;
        Objects.requireNonNull(zzjdVar);
        this.zze = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.zza;
        if (str == null) {
            zzjd zzjdVar = this.zze;
            zzjdVar.zzL().zzau(this.zzb, null);
        } else {
            zzlu zzluVar = new zzlu(this.zzc, str, this.zzd);
            zzjd zzjdVar2 = this.zze;
            zzjdVar2.zzL().zzau(this.zzb, zzluVar);
        }
    }
}
