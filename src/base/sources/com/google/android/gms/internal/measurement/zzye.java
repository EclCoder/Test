package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzye implements Runnable {
    final /* synthetic */ zzyd zza;
    final /* synthetic */ zzyf zzb;

    zzye(zzyf zzyfVar, zzyd zzydVar) {
        this.zza = zzydVar;
        Objects.requireNonNull(zzyfVar);
        this.zzb = zzyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().remove(this.zza);
    }
}
