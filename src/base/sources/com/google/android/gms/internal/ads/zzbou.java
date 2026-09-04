package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbou implements zzhbt {
    final /* synthetic */ zzcku zza;

    zzbou(zzcku zzckuVar) {
        this.zza = zzckuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcku zzckuVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzckuVar.getContext(), zzckuVar.zzs().afmaVersion, str, null, zzckuVar.zzC() != null ? zzckuVar.zzC().zzax : null).zzb();
    }
}
