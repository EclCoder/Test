package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzehr implements zzhbt {
    final /* synthetic */ zzcam zza;
    final /* synthetic */ zzcav zzb;

    zzehr(zzeii zzeiiVar, zzcav zzcavVar, zzcam zzcamVar) {
        this.zzb = zzcavVar;
        this.zza = zzcamVar;
        Objects.requireNonNull(zzeiiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th2));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }
}
