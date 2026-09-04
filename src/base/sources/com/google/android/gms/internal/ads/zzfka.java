package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfka implements zzetr {
    final /* synthetic */ zzfkc zza;

    zzfka(zzfkc zzfkcVar) {
        Objects.requireNonNull(zzfkcVar);
        this.zza = zzfkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final void zza() {
        zzfkc zzfkcVar = this.zza;
        synchronized (zzfkcVar) {
            zzfkcVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfkc zzfkcVar = this.zza;
        zzdvm zzdvmVar = (zzdvm) obj;
        synchronized (zzfkcVar) {
            try {
                zzfkcVar.zzx(zzdvmVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzeu)).booleanValue()) {
                    zzdvmVar.zzh().zza = zzfkcVar.zzv();
                }
                zzfkcVar.zzw().zzj();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
