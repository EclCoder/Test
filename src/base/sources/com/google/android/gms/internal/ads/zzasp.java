package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzasp implements Runnable {
    final /* synthetic */ zzate zza;
    final /* synthetic */ zzasq zzb;

    zzasp(zzasq zzasqVar, zzate zzateVar) {
        this.zza = zzateVar;
        Objects.requireNonNull(zzasqVar);
        this.zzb = zzasqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
