package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzduw implements zzbpq {
    final /* synthetic */ zzdux zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbpq zzd;

    /* synthetic */ zzduw(zzdux zzduxVar, WeakReference weakReference, String str, zzbpq zzbpqVar, byte[] bArr) {
        Objects.requireNonNull(zzduxVar);
        this.zza = zzduxVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
