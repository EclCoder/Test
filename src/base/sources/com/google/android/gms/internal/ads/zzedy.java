package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedy {
    zzcaa zza;
    zzcaa zzb;
    private final Context zzc;
    private final zzedv zzd;
    private final zzdzl zze;
    private final com.google.android.gms.ads.internal.util.zzg zzf;

    zzedy(zzedv zzedvVar, zzdzl zzdzlVar, Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzedvVar;
        this.zze = zzdzlVar;
        this.zzc = context;
        this.zzf = zzgVar;
    }

    public final void zza() {
        try {
            if (this.zzf.zzP()) {
                return;
            }
            zzedv zzedvVar = this.zzd;
            zzedvVar.zza();
            zzedvVar.zzb(new zzedx(this));
        } catch (Exception e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfQ)).booleanValue()) {
                if (this.zzb == null) {
                    this.zzb = zzbzy.zzc(this.zzc);
                }
                this.zzb.zzh(e10, "InstallReferrerUnsampled.initializeAndReport");
            } else {
                if (this.zza == null) {
                    this.zza = zzbzy.zza(this.zzc);
                }
                this.zza.zzh(e10, "InstallReferrer.initializeAndReport");
            }
        }
    }

    final /* synthetic */ Context zzb() {
        return this.zzc;
    }

    final /* synthetic */ zzedv zzc() {
        return this.zzd;
    }

    final /* synthetic */ zzdzl zzd() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.zzg zze() {
        return this.zzf;
    }
}
