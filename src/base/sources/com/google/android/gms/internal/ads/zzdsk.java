package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdsk implements zzhbt {
    final /* synthetic */ zzdyu zza;
    final /* synthetic */ zzdsn zzb;

    zzdsk(zzdsn zzdsnVar, zzdyu zzdyuVar) {
        this.zza = zzdyuVar;
        Objects.requireNonNull(zzdsnVar);
        this.zzb = zzdsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(Object obj) {
        this.zzb.zzd().zzf(this.zza.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
    }
}
