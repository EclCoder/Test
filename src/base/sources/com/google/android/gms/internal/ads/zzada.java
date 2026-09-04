package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzada implements zzaes {
    final /* synthetic */ zzvj zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzade zzd;

    zzada(zzade zzadeVar, zzvj zzvjVar, int i10, long j10) {
        this.zza = zzvjVar;
        this.zzb = i10;
        this.zzc = j10;
        Objects.requireNonNull(zzadeVar);
        this.zzd = zzadeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zza(long j10) {
        this.zzd.zzaB(this.zza, this.zzb, this.zzc, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zzb() {
        this.zzd.zzay(this.zza, this.zzb, this.zzc);
    }
}
