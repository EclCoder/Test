package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzftq implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zza;
    final /* synthetic */ zzfub zzb;

    zzftq(zzfub zzfubVar, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza = zzdxVar;
        Objects.requireNonNull(zzfubVar);
        this.zzb = zzfubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK(this.zza);
    }
}
