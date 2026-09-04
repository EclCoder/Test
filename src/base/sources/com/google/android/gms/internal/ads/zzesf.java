package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzesf implements zzetr {
    final /* synthetic */ zzesg zza;

    zzesf(zzesg zzesgVar) {
        Objects.requireNonNull(zzesgVar);
        this.zza = zzesgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final void zza() {
        zzesg zzesgVar = this.zza;
        synchronized (zzesgVar) {
            zzesgVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzesg zzesgVar = this.zza;
        zzcvl zzcvlVar = (zzcvl) obj;
        synchronized (zzesgVar) {
            try {
                if (zzesgVar.zzM() != null) {
                    if (zzcvlVar.zzo() != null && zzesgVar.zzM().zzo() != null) {
                        zzcvlVar.zzo().zzb(zzesgVar.zzM().zzo().zza());
                    }
                    zzesgVar.zzM().zzd();
                }
                zzesgVar.zzN(zzcvlVar);
                zzesgVar.zzM().zzj();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
