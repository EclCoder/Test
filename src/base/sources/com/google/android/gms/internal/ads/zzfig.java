package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfig implements zzhbt {
    final /* synthetic */ zzetr zza;
    final /* synthetic */ zzfqg zzb;
    final /* synthetic */ zzfpw zzc;
    final /* synthetic */ zzdng zzd;
    final /* synthetic */ zzfii zze;

    zzfig(zzfii zzfiiVar, zzetr zzetrVar, zzfqg zzfqgVar, zzfpw zzfpwVar, zzdng zzdngVar) {
        this.zza = zzetrVar;
        this.zzb = zzfqgVar;
        this.zzc = zzfpwVar;
        this.zzd = zzdngVar;
        Objects.requireNonNull(zzfiiVar);
        this.zze = zzfiiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        zzfqg zzfqgVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th2);
        }
        zzdng zzdngVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdngVar.zzb().zzg(th2);
        zzfii zzfiiVar = this.zze;
        synchronized (zzfiiVar) {
            try {
                zzfiiVar.zzi(null);
                zzdngVar.zza().zzdJ(zzeVarZzg);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjw)).booleanValue()) {
                    zzfiiVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfid
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzdJ(zzeVarZzg);
                        }
                    });
                    zzfiiVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfie
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdJ(zzeVarZzg);
                        }
                    });
                }
                zzflv.zza(zzeVarZzg.zza, th2, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zzb) == null) {
                    zzfqj zzfqjVarZzh = zzfiiVar.zzh();
                    zzfpw zzfpwVar = this.zzc;
                    zzfpwVar.zzh(zzeVarZzg);
                    zzfpwVar.zzj(th2);
                    zzfpwVar.zzd(false);
                    zzfqjVarZzh.zzb(zzfpwVar.zzm());
                } else {
                    zzfqgVar.zzf(zzeVarZzg);
                    zzfpw zzfpwVar2 = this.zzc;
                    zzfpwVar2.zzj(th2);
                    zzfpwVar2.zzd(false);
                    zzfqgVar.zza(zzfpwVar2);
                    zzfqgVar.zzh();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfqg zzfqgVar;
        zzfii zzfiiVar = this.zze;
        zzdlz zzdlzVar = (zzdlz) obj;
        synchronized (zzfiiVar) {
            if (zzdlzVar != null) {
                try {
                    zzdlzVar.zzt();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzfiiVar.zzi(null);
            zzbih zzbihVar = zzbiq.zzjw;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                zzdgh zzdghVarZzq = zzdlzVar.zzq();
                zzdghVarZzq.zza(zzfiiVar.zzf());
                zzdghVarZzq.zzd(zzfiiVar.zzg());
            }
            this.zza.zzb(zzdlzVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                zzfiiVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfif
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzg();
                    }
                });
                zzfiiVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfic
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzg().zzg();
                    }
                });
            }
            if (!((Boolean) zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zzb) == null) {
                zzfqj zzfqjVarZzh = zzfiiVar.zzh();
                zzfpw zzfpwVar = this.zzc;
                zzfpwVar.zzg(zzdlzVar.zzr().zzb);
                zzfpwVar.zzi(zzdlzVar.zzn().zze());
                zzfpwVar.zzd(true);
                zzfqjVarZzh.zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zze(zzdlzVar.zzr().zzb);
                zzfqgVar.zzg(zzdlzVar.zzn().zze());
                zzfpw zzfpwVar2 = this.zzc;
                zzfpwVar2.zzd(true);
                zzfqgVar.zza(zzfpwVar2);
                zzfqgVar.zzh();
            }
        }
    }
}
