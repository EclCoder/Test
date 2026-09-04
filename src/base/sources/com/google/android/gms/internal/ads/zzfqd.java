package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfqd implements zzhbt {
    final /* synthetic */ zzfqg zza;
    final /* synthetic */ zzfpw zzb;

    zzfqd(zzfqg zzfqgVar, zzfpw zzfpwVar) {
        this.zza = zzfqgVar;
        this.zzb = zzfpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        zzfpw zzfpwVar = this.zzb;
        zzfpwVar.zzj(th2);
        zzfpwVar.zzd(false);
        this.zza.zza(zzfpwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(Object obj) {
    }
}
