package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzs {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return this.zza.equals(((zzs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean zza(int i10) {
        return this.zza.get(i10);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i10) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzgtj.zzm(i10, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i10);
    }
}
