package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbai implements Runnable {
    final /* synthetic */ zzbaj zza;

    zzbai(zzbaj zzbajVar) {
        Objects.requireNonNull(zzbajVar);
        this.zza = zzbajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzbaj zzbajVar = this.zza;
        if (zzbajVar.zzb != null) {
            return;
        }
        synchronized (zzbaj.zzd) {
            if (zzbajVar.zzb != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) zzbiq.zzdu.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzbaj.zza = zzfzc.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z10 = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z10);
            zzbaj.zzd.open();
        }
    }
}
