package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfvd implements Runnable {
    final /* synthetic */ zzfve zza;

    zzfvd(zzfve zzfveVar) {
        Objects.requireNonNull(zzfveVar);
        this.zza = zzfveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfve zzfveVar = this.zza;
        AtomicBoolean atomicBooleanZzf = zzfveVar.zzf();
        float fZzc = zzfveVar.zzc();
        atomicBooleanZzf.set(false);
        if (((Float) zzfveVar.zze().getAndSet(Float.valueOf(fZzc))).floatValue() != fZzc) {
            zzfveVar.zzd().post(new zzfvc(this, fZzc));
        }
    }
}
