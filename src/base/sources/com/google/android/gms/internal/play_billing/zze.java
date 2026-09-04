package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zze {
    static final zze zza;
    static final zze zzb;
    final Throwable zzc;

    static {
        if (zzo.zza) {
            zzb = null;
            zza = null;
        } else {
            zzb = new zze(false, null);
            zza = new zze(true, null);
        }
    }

    zze(boolean z10, Throwable th2) {
        this.zzc = th2;
    }
}
