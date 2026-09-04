package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbtd implements zzcga {
    final /* synthetic */ zzbtt zza;
    final /* synthetic */ zzfpw zzb;
    final /* synthetic */ zzbtu zzc;

    zzbtd(zzbtu zzbtuVar, zzbtt zzbttVar, zzfpw zzfpwVar) {
        this.zza = zzbttVar;
        this.zzb = zzfpwVar;
        Objects.requireNonNull(zzbtuVar);
        this.zzc = zzbtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbtu zzbtuVar = this.zzc;
        synchronized (zzbtuVar.zzg()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                zzbtuVar.zzl(0);
                if (zzbtuVar.zzi() != null && this.zza != zzbtuVar.zzi()) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbtuVar.zzi().zzc();
                }
                zzbtuVar.zzj(this.zza);
                if (((Boolean) zzbkj.zzd.zze()).booleanValue() && zzbtuVar.zzh() != null) {
                    zzfqj zzfqjVarZzh = zzbtuVar.zzh();
                    zzfpw zzfpwVar = this.zzb;
                    zzfpwVar.zzd(true);
                    zzfqjVarZzh.zzb(zzfpwVar.zzm());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
