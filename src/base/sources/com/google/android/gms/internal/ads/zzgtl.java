package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtl implements Serializable, zzgtk {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgtl) {
            return this.zza.equals(((zzgtl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and(");
        boolean z10 = true;
        for (Object obj : this.zza) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    public final boolean zza(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.zza;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((zzgtk) list.get(i10)).zza(obj)) {
                return false;
            }
            i10++;
        }
    }
}
