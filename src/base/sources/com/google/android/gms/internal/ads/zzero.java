package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzero implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdma zza;

    zzero(zzerp zzerpVar, zzdma zzdmaVar) {
        this.zza = zzdmaVar;
        Objects.requireNonNull(zzerpVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdma zzdmaVar = this.zza;
        zzdmaVar.zzd().zza();
        zzdmaVar.zze().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }
}
