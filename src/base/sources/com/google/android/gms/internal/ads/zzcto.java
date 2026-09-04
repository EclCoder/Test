package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcto implements zzhbt {
    final /* synthetic */ zzctv zza;

    zzcto(zzctv zzctvVar) {
        Objects.requireNonNull(zzctvVar);
        this.zza = zzctvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzctv zzctvVar = this.zza;
        zzctvVar.zzu().zzb(zzctvVar.zzt().zzb(zzctvVar.zzr(), zzctvVar.zzs(), false, "", (String) obj, zzctvVar.zzs().zzc, null, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(zzctvVar.zzq()) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
    }
}
