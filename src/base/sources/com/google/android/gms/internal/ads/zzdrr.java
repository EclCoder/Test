package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdrr implements zzhbt {
    final /* synthetic */ zzdrt zza;

    zzdrr(zzdrt zzdrtVar) {
        Objects.requireNonNull(zzdrtVar);
        this.zza = zzdrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgs)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcku zzckuVar = (zzcku) list.get(0);
            if (zzckuVar != null) {
                this.zza.zza(zzckuVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgs)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "omid native display exp");
            }
        }
    }
}
