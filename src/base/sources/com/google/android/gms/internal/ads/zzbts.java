package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbts implements zzcga {
    final /* synthetic */ zzbtt zza;

    zzbts(zzbtt zzbttVar) {
        Objects.requireNonNull(zzbttVar);
        this.zza = zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbsp zzbspVar = (zzbsp) obj;
        zzcfr.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy > Destroying engine.");
                zzbsp zzbspVar2 = zzbspVar;
                zzbspVar2.zzn("/result", zzbpp.zzo);
                zzbspVar2.zzj();
            }
        });
    }
}
