package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzetm implements zzetr {
    final /* synthetic */ zzetn zza;

    zzetm(zzetn zzetnVar) {
        Objects.requireNonNull(zzetnVar);
        this.zza = zzetnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcxt zzcxtVar = (zzcxt) obj;
        zzetn zzetnVar = this.zza;
        synchronized (zzetnVar) {
            zzetnVar.zze(zzcxtVar.zzn());
            zzcxtVar.zzj();
        }
    }
}
