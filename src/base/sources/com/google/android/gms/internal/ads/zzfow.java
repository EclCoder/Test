package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfow implements zzhbt {
    final /* synthetic */ zzfor zza;
    final /* synthetic */ zzfpb zzb;

    zzfow(zzfpb zzfpbVar, zzfor zzforVar) {
        this.zza = zzforVar;
        Objects.requireNonNull(zzfpbVar);
        this.zzb = zzfpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        this.zzb.zza.zzg().zzc(this.zza, th2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
