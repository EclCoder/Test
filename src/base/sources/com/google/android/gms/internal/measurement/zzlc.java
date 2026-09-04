package com.google.android.gms.internal.measurement;

import android.content.Context;
import sc.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzlc extends zzlt {
    private final Context zza;
    private final x zzb;

    zzlc(Context context, x xVar) {
        this.zza = context;
        this.zzb = xVar;
    }

    public final boolean equals(Object obj) {
        x xVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzlt) {
            zzlt zzltVar = (zzlt) obj;
            if (this.zza.equals(zzltVar.zza()) && ((xVar = this.zzb) != null ? xVar.equals(zzltVar.zzb()) : zzltVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        x xVar = this.zzb;
        return (iHashCode * 1000003) ^ (xVar == null ? 0 : xVar.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    final x zzb() {
        return this.zzb;
    }
}
