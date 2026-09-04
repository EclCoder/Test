package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcua implements zzbpq {
    final /* synthetic */ zzcub zza;

    zzcua(zzcub zzcubVar) {
        Objects.requireNonNull(zzcubVar);
        this.zza = zzcubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        zzcub zzcubVar = this.zza;
        if (zzcubVar.zze(map)) {
            zzcubVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzm();
                }
            });
        }
    }
}
