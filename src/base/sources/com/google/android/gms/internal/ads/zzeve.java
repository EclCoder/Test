package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeve {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzevd zzb;

    public final void zza(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    final void zzc(zzevd zzevdVar) {
        this.zzb = zzevdVar;
    }

    final zzevd zzd() {
        return this.zzb;
    }
}
