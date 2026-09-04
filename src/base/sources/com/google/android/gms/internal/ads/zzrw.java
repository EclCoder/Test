package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzrw {
    private final zzv zza;
    private zzhaf zzb = null;

    public zzrw(zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final zzrw zza(zzhaf zzhafVar) {
        this.zzb = zzhafVar;
        return this;
    }

    public final zzrx zzb() {
        return new zzrx(this.zza, 0, this.zzb, null);
    }
}
