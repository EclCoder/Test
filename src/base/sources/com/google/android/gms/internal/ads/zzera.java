package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzera implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdcp zzb;
    private final zzddj zzc;
    private final zzdla zzd;
    private final zzdks zze;
    private final zzcug zzf;

    zzera(zzdcp zzdcpVar, zzddj zzddjVar, zzdla zzdlaVar, zzdks zzdksVar, zzcug zzcugVar) {
        this.zzb = zzdcpVar;
        this.zzc = zzddjVar;
        this.zzd = zzdlaVar;
        this.zze = zzdksVar;
        this.zzf = zzcugVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdr();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
