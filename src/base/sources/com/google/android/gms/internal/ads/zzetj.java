package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzetj implements zzetr {
    final /* synthetic */ zzetk zza;

    zzetj(zzetk zzetkVar) {
        Objects.requireNonNull(zzetkVar);
        this.zza = zzetkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final void zza() {
        zzetk zzetkVar = this.zza;
        synchronized (zzetkVar) {
            zzetkVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzetk zzetkVar = this.zza;
        zzdlz zzdlzVar = (zzdlz) obj;
        synchronized (zzetkVar) {
            zzetkVar.zzN(zzdlzVar);
            zzetkVar.zzM().zzj();
        }
    }
}
