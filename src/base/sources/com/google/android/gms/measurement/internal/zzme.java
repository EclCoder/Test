package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzme extends zzgd {
    final /* synthetic */ AtomicReference zza;

    zzme(zznl zznlVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(zznlVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzge
    public final void zze(List list) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
