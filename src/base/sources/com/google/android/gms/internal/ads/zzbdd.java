package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbdd implements Runnable {
    final /* synthetic */ zzbde zza;

    zzbdd(zzbde zzbdeVar) {
        Objects.requireNonNull(zzbdeVar);
        this.zza = zzbdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
