package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzere implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcfw zza;
    final /* synthetic */ zzfkq zzb;
    final /* synthetic */ zzfkf zzc;
    final /* synthetic */ zzerl zzd;
    final /* synthetic */ zzerg zze;

    zzere(zzerg zzergVar, zzcfw zzcfwVar, zzfkq zzfkqVar, zzfkf zzfkfVar, zzerl zzerlVar) {
        this.zza = zzcfwVar;
        this.zzb = zzfkqVar;
        this.zzc = zzfkfVar;
        this.zzd = zzerlVar;
        Objects.requireNonNull(zzergVar);
        this.zze = zzergVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzerl zzerlVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzerlVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
