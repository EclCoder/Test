package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfgo implements zzhbt {
    final /* synthetic */ zzfqg zza;
    final /* synthetic */ zzfpw zzb;
    final /* synthetic */ zzcwq zzc;
    final /* synthetic */ zzfgs zzd;

    zzfgo(zzfgs zzfgsVar, zzfqg zzfqgVar, zzfpw zzfpwVar, zzcwq zzcwqVar) {
        this.zza = zzfqgVar;
        this.zzb = zzfpwVar;
        this.zzc = zzcwqVar;
        Objects.requireNonNull(zzfgsVar);
        this.zzd = zzfgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        zzfqg zzfqgVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th2);
        }
        zzfgs zzfgsVar = this.zzd;
        synchronized (zzfgsVar) {
            try {
                zzcwq zzcwqVar = this.zzc;
                com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzcwqVar.zzc().zzg(th2);
                zzfgsVar.zzs(zzeVarZzg);
                zzcwqVar.zzb().zzdJ(zzeVarZzg);
                zzflv.zza(zzeVarZzg.zza, th2, "BannerAdLoader.onFailure");
                if (zzfgsVar.zzr()) {
                    zzfgsVar.zzn();
                    zzfgsVar.zzo().zzd(zzfgsVar.zzq().zzc());
                }
                if (!((Boolean) zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zza) == null) {
                    zzfqj zzfqjVarZzp = zzfgsVar.zzp();
                    zzfpw zzfpwVar = this.zzb;
                    zzfpwVar.zzh(zzeVarZzg);
                    zzfpwVar.zzj(th2);
                    zzfpwVar.zzd(false);
                    zzfqjVarZzp.zzb(zzfpwVar.zzm());
                } else {
                    zzfqgVar.zzf(zzeVarZzg);
                    zzfpw zzfpwVar2 = this.zzb;
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
        zzfgs zzfgsVar = this.zzd;
        zzcvl zzcvlVar = (zzcvl) obj;
        synchronized (zzfgsVar) {
            if (zzcvlVar != null) {
                try {
                    zzcvlVar.zzt();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zzfgsVar.zzr()) {
                zzfgsVar.zzc();
            }
            if (!((Boolean) zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zza) == null) {
                zzfqj zzfqjVarZzp = zzfgsVar.zzp();
                zzfpw zzfpwVar = this.zzb;
                zzfpwVar.zzg(zzcvlVar.zzr().zzb);
                zzfpwVar.zzi(zzcvlVar.zzn().zze());
                zzfpwVar.zzd(true);
                zzfqjVarZzp.zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zze(zzcvlVar.zzr().zzb);
                zzfqgVar.zzg(zzcvlVar.zzn().zze());
                zzfpw zzfpwVar2 = this.zzb;
                zzfpwVar2.zzd(true);
                zzfqgVar.zza(zzfpwVar2);
                zzfqgVar.zzh();
            }
        }
    }
}
