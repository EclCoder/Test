package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaax implements Comparator {
    zzaax() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzabd zzabdVarZza = zzabd.zza(obj);
        zzabd zzabdVarZza2 = zzabd.zza(obj2);
        if (zzabdVarZza != zzabdVarZza2) {
            return zzabdVarZza.compareTo(zzabdVarZza2);
        }
        int iOrdinal = zzabdVarZza.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
