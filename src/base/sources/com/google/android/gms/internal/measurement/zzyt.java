package com.google.android.gms.internal.measurement;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzyt extends zzyq {
    private static final zzyf zzb = new zzyr();
    private static final ThreadLocal zze = new zzys();
    final AtomicInteger zza = new AtomicInteger();

    zzyt() {
    }

    static zzyq zza(zzzj zzzjVar, zzyd zzydVar) {
        Integer num = (Integer) zzzjVar.zzd(zzxx.zzc);
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        zzyt zzytVar = (zzyt) zzb.zzb(zzydVar, zzzjVar);
        return (((Random) zze.get()).nextInt(num.intValue()) == 0 ? zzytVar.zza.incrementAndGet() : zzytVar.zza.get()) > 0 ? zzytVar : zzyq.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void zzb() {
        this.zza.decrementAndGet();
    }
}
