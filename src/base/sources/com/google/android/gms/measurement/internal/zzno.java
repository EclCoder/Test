package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzno implements Runnable {
    final /* synthetic */ zzpg zza;
    final /* synthetic */ Runnable zzb;

    zzno(zznt zzntVar, zzpg zzpgVar, Runnable runnable) {
        this.zza = zzpgVar;
        this.zzb = runnable;
        Objects.requireNonNull(zzntVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        zzpgVar.zzZ(this.zzb);
        zzpgVar.zzM();
    }
}
