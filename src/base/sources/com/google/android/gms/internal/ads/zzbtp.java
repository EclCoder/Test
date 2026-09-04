package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbtp implements zzcga {
    final /* synthetic */ zzbto zza;

    zzbtp(zzbtt zzbttVar, zzbto zzbtoVar) {
        this.zza = zzbtoVar;
        Objects.requireNonNull(zzbttVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        this.zza.zzf(((zzbsp) obj).zzl());
    }
}
