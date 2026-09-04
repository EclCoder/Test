package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zziw implements Callable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjd zzc;

    zziw(zzjd zzjdVar, zzr zzrVar, Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = bundle;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzaa();
        return zzjdVar.zzL().zzar(this.zza, this.zzb);
    }
}
