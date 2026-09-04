package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbae implements zzfye {
    final /* synthetic */ zzfxg zza;

    zzbae(zzfxg zzfxgVar) {
        this.zza = zzfxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zza(int i10, long j10) {
        this.zza.zzb(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zzb(int i10, long j10, String str) {
        this.zza.zzf(i10, System.currentTimeMillis() - j10, str);
    }
}
