package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcdq {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    zzcdq(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcdz zzcdzVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i10, long j10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbe)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zza;
        if (j10 - zzgVar.zzF() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbf)).booleanValue()) {
            zzgVar.zzE(i10);
            zzgVar.zzG(j10);
        } else {
            zzgVar.zzE(-1);
            zzgVar.zzG(j10);
        }
    }
}
