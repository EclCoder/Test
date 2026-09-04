package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzftr implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzb;
    final /* synthetic */ zzfub zzc;

    zzftr(zzfub zzfubVar, long j10, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza = j10;
        this.zzb = zzdxVar;
        Objects.requireNonNull(zzfubVar);
        this.zzc = zzfubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfub zzfubVar = this.zzc;
        if (zzfubVar.zzN() != null) {
            long j10 = this.zza;
            String strZzV = zzfub.zzV(this.zzb);
            int iZzs = zzfubVar.zzs();
            int iZzt = zzfubVar.zzt();
            String strZzM = zzfubVar.zzM();
            zzfubVar.zzN().zzi(j10, strZzV, zzfubVar.zzP(), iZzs, iZzt, strZzM);
        }
    }
}
