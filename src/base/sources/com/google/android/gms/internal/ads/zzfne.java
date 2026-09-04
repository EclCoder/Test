package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfne implements zzhbt {
    final /* synthetic */ zzfnh zza;
    final /* synthetic */ zzfnj zzb;

    zzfne(zzfnj zzfnjVar, zzfnh zzfnhVar) {
        this.zza = zzfnhVar;
        Objects.requireNonNull(zzfnjVar);
        this.zzb = zzfnjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        zzfnj zzfnjVar = this.zzb;
        synchronized (zzfnjVar) {
            zzfnjVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfnj zzfnjVar = this.zzb;
        synchronized (zzfnjVar) {
            try {
                zzfnjVar.zzf(null);
                zzfnjVar.zze().addFirst(this.zza);
                if (zzfnjVar.zzg() == 1) {
                    zzfnjVar.zzd();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
