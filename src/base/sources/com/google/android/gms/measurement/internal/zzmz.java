package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzmz implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zznf zzb;

    zzmz(zznf zznfVar, ComponentName componentName) {
        this.zza = componentName;
        Objects.requireNonNull(zznfVar);
        this.zzb = zznfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzW(this.zza);
    }
}
