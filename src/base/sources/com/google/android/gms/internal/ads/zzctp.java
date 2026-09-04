package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzctp implements zzhbt {
    final /* synthetic */ String zza;
    final /* synthetic */ zzctv zzb;

    zzctp(zzctv zzctvVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzctvVar);
        this.zzb = zzctvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        zzctv zzctvVar = this.zzb;
        zzctvVar.zzu().zza(zzctvVar.zzt().zzb(zzctvVar.zzr(), zzctvVar.zzs(), false, this.zza, null, zzctvVar.zzp(), zzctvVar.zzw(), zzctvVar.zzx()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        String str2 = (String) obj;
        zzctv zzctvVar = this.zzb;
        zzctvVar.zzu().zza(zzctvVar.zzt().zzb(zzctvVar.zzr(), zzctvVar.zzs(), false, str, str2, zzctvVar.zzp(), zzctvVar.zzw(), zzctvVar.zzx()), zzctvVar.zzv());
    }
}
