package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhvo extends zzhxi {
    private final zzhvm zza;
    private final zzhvn zzb;

    private zzhvo(zzhvm zzhvmVar, zzhvn zzhvnVar) {
        this.zza = zzhvmVar;
        this.zzb = zzhvnVar;
    }

    public static zzhvo zzb(zzhvm zzhvmVar, zzhvn zzhvnVar) {
        return new zzhvo(zzhvmVar, zzhvnVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvo)) {
            return false;
        }
        zzhvo zzhvoVar = (zzhvo) obj;
        return zzhvoVar.zza == this.zza && zzhvoVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhvo.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + string2.length() + 1);
        sb2.append("ML-DSA Parameters (ML-DSA instance: ");
        sb2.append(string);
        sb2.append(", variant: ");
        sb2.append(string2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzb != zzhvn.zzb;
    }
}
