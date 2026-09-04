package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbpt {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = 0.0f;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public final synchronized void zza(boolean z10) {
        this.zza = z10;
        this.zzd.set(true);
    }

    public final synchronized void zzb(boolean z10, float f10) {
        this.zzb = z10;
        this.zzc = f10;
    }

    public final synchronized boolean zzc(boolean z10) {
        if (!this.zzd.get()) {
            return z10;
        }
        return this.zza;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized float zze() {
        return this.zzc;
    }
}
