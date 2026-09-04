package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzflk implements zzhbt {
    final /* synthetic */ zzfll zza;
    final /* synthetic */ int zzb;

    zzflk(zzfll zzfllVar, int i10) {
        this.zzb = i10;
        Objects.requireNonNull(zzfllVar);
        this.zza = zzfllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
