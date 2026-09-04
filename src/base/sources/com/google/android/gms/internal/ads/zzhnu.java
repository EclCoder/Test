package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhnu {
    private final Class zza;
    private final zziaz zzb;

    /* synthetic */ zzhnu(Class cls, zziaz zziazVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zziazVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnu)) {
            return false;
        }
        zzhnu zzhnuVar = (zzhnu) obj;
        return zzhnuVar.zza.equals(this.zza) && zzhnuVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zziaz zziazVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zziazVar);
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 21 + strValueOf.length());
        sb2.append(simpleName);
        sb2.append(", object identifier: ");
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
