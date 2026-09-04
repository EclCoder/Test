package com.google.android.gms.internal.ads;

import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdww {
    private final zzdzl zza;

    zzdww(zzdzl zzdzlVar) {
        this.zza = zzdzlVar;
    }

    public final boolean zza(zzgat zzgatVar) {
        boolean zZzj = zzgatVar.zzj();
        String str = qnwOeeQSSWa.gsdueqWYSFwjtj;
        if (zZzj) {
            zzdzk zzdzkVarZza = this.zza.zza();
            zzdzkVarZza.zzc("action", "aq_ad_closed");
            zzdzkVarZza.zzc(str, zzgatVar.zza());
            zzdzkVarZza.zzc("aq_ad_duration", String.valueOf(zzgatVar.zzb()));
            zzdzkVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzgatVar.zzc()));
            zzdzkVarZza.zzc("aq_time_away", String.valueOf(zzgatVar.zzg()));
            return zzdzkVarZza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        }
        zzdzk zzdzkVarZza2 = this.zza.zza();
        zzdzkVarZza2.zzc("action", "aq_ad_kill");
        zzdzkVarZza2.zzc(str, zzgatVar.zza());
        zzdzkVarZza2.zzc("aq_ad_duration", String.valueOf(zzgatVar.zzb()));
        zzdzkVarZza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzgatVar.zzc()));
        zzdzkVarZza2.zzc("aq_time_away", String.valueOf(zzgatVar.zzg()));
        zzdzkVarZza2.zzc("aq_is_os_kill", String.valueOf(zzgatVar.zze()));
        return zzdzkVarZza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
    }
}
