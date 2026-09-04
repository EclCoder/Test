package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaci implements zzacj {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdt zzb;

    zzaci(Executor executor, zzdt zzdtVar) {
        this.zza = executor;
        this.zzb = zzdtVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
