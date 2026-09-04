package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Objects;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzehk implements zzefw {
    final /* synthetic */ zzehn zza;

    zzehk(zzehn zzehnVar) {
        Objects.requireNonNull(zzehnVar);
        this.zza = zzehnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefw
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpC)).booleanValue()) {
            zzdzk zzdzkVarZza = this.zza.zzd().zza();
            zzdzkVarZza.zzc("action", "ptard");
            zzdzkVarZza.zzc("ptard", CampaignEx.JSON_KEY_AD_R);
            zzdzkVarZza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefw
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpD)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(remoteException, SVWsZyNSAChGIA.GddKeC);
        }
    }
}
