package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzrx {
    public final zzv zza;

    @Deprecated
    public final int zzb = 0;
    public final zzhaf zzc;

    /* synthetic */ zzrx(zzv zzvVar, int i10, zzhaf zzhafVar, byte[] bArr) {
        this.zza = zzvVar;
        this.zzc = zzhafVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrx)) {
            return false;
        }
        zzrx zzrxVar = (zzrx) obj;
        return this.zza.equals(zzrxVar.zza) && Objects.equals(this.zzc, zzrxVar.zzc);
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() * 961;
        zzhaf zzhafVar = this.zzc;
        return iHashCode + (zzhafVar == null ? 0 : zzhafVar.hashCode());
    }
}
