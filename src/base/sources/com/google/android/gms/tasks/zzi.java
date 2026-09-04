package com.google.android.gms.tasks;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzi implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzj zzb;

    zzi(zzj zzjVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzjVar);
        this.zzb = zzjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzj zzjVar = this.zzb;
        synchronized (zzjVar.zzc()) {
            try {
                if (zzjVar.zzd() != null) {
                    zzjVar.zzd().onComplete(this.zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
