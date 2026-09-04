package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzmd implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zznl zzd;

    zzmd(zznl zznlVar, AtomicReference atomicReference, zzr zzrVar, boolean z10) {
        this.zza = atomicReference;
        this.zzb = zzrVar;
        this.zzc = z10;
        Objects.requireNonNull(zznlVar);
        this.zzd = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznl zznlVar = this.zzd;
                    zzgb zzgbVarZzZ = zznlVar.zzZ();
                    if (zzgbVarZzZ == null) {
                        zznlVar.zzu.zzaW().zzb().zza("Failed to get all user properties; not connected to service");
                        atomicReference2.notify();
                        return;
                    }
                    zzr zzrVar = this.zzb;
                    Preconditions.checkNotNull(zzrVar);
                    atomicReference2.set(zzgbVarZzZ.zzj(zzrVar, this.zzc));
                    zznlVar.zzV();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.zzd.zzu.zzaW().zzb().zzb("Failed to get all user properties; remote exception", e10);
                    atomicReference = this.zza;
                }
            } catch (Throwable th2) {
                this.zza.notify();
                throw th2;
            }
        }
    }
}
