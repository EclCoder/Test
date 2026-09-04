package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzzj implements zzzc {
    private final zzzc zza;
    private final long zzb;

    public zzzj(zzzc zzzcVar, long j10) {
        this.zza = zzzcVar;
        this.zzb = j10;
    }

    public final zzzc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zzd(zzlw zzlwVar, zziv zzivVar, int i10) {
        int iZzd = this.zza.zzd(zzlwVar, zzivVar, i10);
        if (iZzd != -4) {
            return iZzd;
        }
        zzivVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zze(long j10) {
        return this.zza.zze(j10 - this.zzb);
    }
}
