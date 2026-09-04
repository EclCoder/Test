package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzeom implements zzhbt {
    final /* synthetic */ zzfkf zza;
    final /* synthetic */ zzeon zzb;

    zzeom(zzeon zzeonVar, zzfkf zzfkfVar) {
        this.zza = zzfkfVar;
        Objects.requireNonNull(zzeonVar);
        this.zzb = zzeonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        zzeon zzeonVar = this.zzb;
        synchronized (zzeonVar) {
            try {
                zzeoo zzeooVarZzc = zzeonVar.zzc();
                zzfkf zzfkfVar = this.zza;
                zzeooVarZzc.zzc(th2, zzfkfVar);
                zzfkf zzfkfVarZza = zzeonVar.zzc().zza();
                if (zzfkfVar.zzav) {
                    while (zzfkfVarZza != null) {
                        zzeonVar.zzb(zzfkfVarZza);
                        zzfkfVarZza = zzeonVar.zzc().zza();
                    }
                } else if (zzfkfVarZza != null) {
                    zzeonVar.zzb(zzfkfVarZza);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeon zzeonVar = this.zzb;
        zzepe zzepeVar = (zzepe) obj;
        synchronized (zzeonVar) {
            try {
                zzeonVar.zzc().zzb(zzepeVar, this.zza);
                zzfkf zzfkfVarZza = zzeonVar.zzc().zza();
                if (zzfkfVarZza != null) {
                    zzeonVar.zzb(zzfkfVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
