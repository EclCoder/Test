package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzenr implements zzdno {
    final /* synthetic */ zzelv zza;
    final /* synthetic */ zzfkf zzb;
    final /* synthetic */ zzens zzc;

    zzenr(zzens zzensVar, zzelv zzelvVar, zzfkf zzfkfVar) {
        this.zza = zzelvVar;
        this.zzb = zzfkfVar;
        Objects.requireNonNull(zzensVar);
        this.zzc = zzensVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zza(boolean z10, Context context, zzdde zzddeVar) throws zzdnn {
        try {
            zzflw zzflwVar = (zzflw) this.zza.zzb;
            zzflwVar.zzs(z10);
            if (this.zzc.zzc().clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbt)).intValue()) {
                zzflwVar.zzd();
            } else {
                zzflwVar.zze(context);
            }
        } catch (zzflf e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot show interstitial.");
            throw new zzdnn(e10.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final zzfkf zzb() {
        return this.zzb;
    }
}
