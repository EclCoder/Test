package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzay implements Runnable {
    final /* synthetic */ zzjg zza;
    final /* synthetic */ zzaz zzb;

    zzay(zzaz zzazVar, zzjg zzjgVar) {
        this.zza = zzjgVar;
        Objects.requireNonNull(zzazVar);
        this.zzb = zzazVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjg zzjgVar = this.zza;
        zzjgVar.zzaV();
        if (zzae.zza()) {
            zzjgVar.zzaX().zzj(this);
            return;
        }
        zzaz zzazVar = this.zzb;
        boolean zZzc = zzazVar.zzc();
        zzazVar.zze(0L);
        if (zZzc) {
            zzazVar.zza();
        }
    }
}
