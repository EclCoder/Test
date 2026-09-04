package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzlx implements Runnable {
    final /* synthetic */ zzmb zza;

    zzlx(zzmb zzmbVar) {
        Objects.requireNonNull(zzmbVar);
        this.zza = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmb zzmbVar = this.zza;
        zzmbVar.zza = zzmbVar.zzv();
    }
}
