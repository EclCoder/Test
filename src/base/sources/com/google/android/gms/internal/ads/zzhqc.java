package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhqc extends zzhqf {
    private final int zza;

    private zzhqc(int i10) {
        this.zza = i10;
    }

    public static zzhqc zzb(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            return new zzhqc(i10);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i10 * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhqc) && ((zzhqc) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhqc.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 34);
        sb2.append("AesCmac PRF Parameters (");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
