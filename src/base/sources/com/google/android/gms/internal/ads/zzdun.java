package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdun implements zzhbt {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbpq zzb;

    zzdun(zzdux zzduxVar, String str, zzbpq zzbpqVar) {
        this.zza = str;
        this.zzb = zzbpqVar;
        Objects.requireNonNull(zzduxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcku) obj).zzab(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
    }
}
