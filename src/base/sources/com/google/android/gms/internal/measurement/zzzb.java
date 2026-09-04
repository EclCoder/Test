package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public enum zzzb {
    GENERAL(false, true),
    BOOLEAN(false, false),
    CHARACTER(false, false),
    INTEGRAL(true, false),
    FLOAT(true, true);

    private final boolean zzf;

    zzzb(boolean z10, boolean z11) {
        this.zzf = z11;
    }

    final boolean zza() {
        return this.zzf;
    }
}
