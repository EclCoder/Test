package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbn {
    private final AtomicLong zza;

    zzdbn(zzfkq zzfkqVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.zza = atomicLong;
        atomicLong.set(zzfkqVar.zza.zza.zzu.get());
    }

    public final long zza() {
        return this.zza.get();
    }

    public final void zzb(long j10) {
        this.zza.set(j10);
    }
}
