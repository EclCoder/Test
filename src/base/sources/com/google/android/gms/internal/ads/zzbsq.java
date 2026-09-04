package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbsq implements zzbpq {
    final /* synthetic */ zzbsx zza;
    private final zzbpq zzb;

    public zzbsq(zzbsx zzbsxVar, zzbpq zzbpqVar) {
        Objects.requireNonNull(zzbsxVar);
        this.zza = zzbsxVar;
        this.zzb = zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        this.zzb.zza(this.zza, map);
    }

    final /* synthetic */ zzbpq zzb() {
        return this.zzb;
    }
}
