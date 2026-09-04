package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzefm implements zzhbt {
    final /* synthetic */ zzefs zza;

    zzefm(zzefs zzefsVar) {
        Objects.requireNonNull(zzefsVar);
        this.zza = zzefsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfkq zzfkqVar = (zzfkq) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcS)).booleanValue()) {
            this.zza.zzf().zzdQ(zzfkqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
    }
}
