package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzr {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzr zza(int i10) {
        zzgtj.zzi(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzs zzb() {
        zzgtj.zzi(!this.zzb);
        this.zzb = true;
        return new zzs(this.zza, null);
    }
}
