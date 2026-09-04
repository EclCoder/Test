package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfvc implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfvd zzb;

    zzfvc(zzfvd zzfvdVar, float f10) {
        this.zza = f10;
        Objects.requireNonNull(zzfvdVar);
        this.zzb = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
