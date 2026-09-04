package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzacz implements zzaer {
    final /* synthetic */ zzade zza;

    zzacz(zzade zzadeVar) {
        Objects.requireNonNull(zzadeVar);
        this.zza = zzadeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zza() {
        zzmz zzmzVarZzbc = this.zza.zzbc();
        if (zzmzVarZzbc != null) {
            zzmzVarZzbc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzb() {
        zzade zzadeVar = this.zza;
        if (zzadeVar.zzbp() != null) {
            zzadeVar.zzbo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzc() {
        zzade zzadeVar = this.zza;
        if (zzadeVar.zzbp() != null) {
            zzadeVar.zzaz(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzd(zzbv zzbvVar) {
    }
}
