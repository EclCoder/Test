package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagz {
    public final zzahc zza;
    public final zzahc zzb;

    public zzagz(zzahc zzahcVar, zzahc zzahcVar2) {
        this.zza = zzahcVar;
        this.zzb = zzahcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagz.class == obj.getClass()) {
            zzagz zzagzVar = (zzagz) obj;
            if (this.zza.equals(zzagzVar.zza) && this.zzb.equals(zzagzVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzahc zzahcVar = this.zza;
        zzahc zzahcVar2 = this.zzb;
        String string = zzahcVar.toString();
        String strConcat = zzahcVar.equals(zzahcVar2) ? "" : ", ".concat(zzahcVar2.toString());
        StringBuilder sb2 = new StringBuilder(string.length() + 1 + strConcat.length() + 1);
        sb2.append("[");
        sb2.append(string);
        sb2.append(strConcat);
        sb2.append("]");
        return sb2.toString();
    }
}
