package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgm extends zzheu {
    private final zzhgl zza;

    private zzhgm(zzhgl zzhglVar) {
        this.zza = zzhglVar;
    }

    public static zzhgm zzb(zzhgl zzhglVar) {
        return new zzhgm(zzhglVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhgm) && ((zzhgm) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhgm.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 39);
        sb2.append("ChaCha20Poly1305 Parameters (variant: ");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zza != zzhgl.zzc;
    }

    public final zzhgl zzc() {
        return this.zza;
    }
}
