package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbuk implements zzcfy {
    final /* synthetic */ zzcfw zza;
    final /* synthetic */ zzbto zzb;

    zzbuk(zzbum zzbumVar, zzcfw zzcfwVar, zzbto zzbtoVar) {
        this.zza = zzcfwVar;
        this.zzb = zzbtoVar;
        Objects.requireNonNull(zzbumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfy
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbtx("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}
