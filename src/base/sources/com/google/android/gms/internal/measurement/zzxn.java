package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzxn extends zzyq {
    private static final zzyf zza = new zzxl();
    private final AtomicLong zzb = new AtomicLong(-1);

    zzxn() {
    }

    static zzyq zza(zzzj zzzjVar, zzyd zzydVar, long j10) {
        if (((zzxm) zzzjVar.zzd(zzxx.zzd)) == null) {
            return null;
        }
        zzxn zzxnVar = (zzxn) zza.zzb(zzydVar, zzzjVar);
        zzabr.zzb(j10 >= 0, "timestamp cannot be negative");
        AtomicLong atomicLong = zzxnVar.zzb;
        long j11 = atomicLong.get();
        if (j11 >= 0) {
            throw null;
        }
        atomicLong.compareAndSet(j11, -j10);
        return zzxnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void zzb() {
        AtomicLong atomicLong = this.zzb;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
