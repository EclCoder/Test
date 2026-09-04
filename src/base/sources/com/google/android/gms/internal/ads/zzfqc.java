package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfqc implements zzhbt {
    final /* synthetic */ zzfqg zza;
    final /* synthetic */ zzfpw zzb;
    final /* synthetic */ boolean zzc;

    zzfqc(zzfqg zzfqgVar, zzfpw zzfpwVar, boolean z10) {
        this.zza = zzfqgVar;
        this.zzb = zzfpwVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        zzfpw zzfpwVar = this.zzb;
        if (zzfpwVar.zzb()) {
            zzfqg zzfqgVar = this.zza;
            zzfpwVar.zzj(th2);
            zzfpwVar.zzd(false);
            zzfqgVar.zza(zzfpwVar);
            if (this.zzc) {
                zzfqgVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(Object obj) {
        zzfpw zzfpwVar = this.zzb;
        zzfpwVar.zzd(true);
        zzfqg zzfqgVar = this.zza;
        zzfqgVar.zza(zzfpwVar);
        if (this.zzc) {
            zzfqgVar.zzh();
        }
    }
}
