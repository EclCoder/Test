package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzxk extends zzyq {
    private static final zzyf zza = new zzxj();
    private final AtomicLong zzb = new AtomicLong(2147483647L);

    zzxk() {
    }

    static zzyq zza(zzzj zzzjVar, zzyd zzydVar) {
        Integer num = (Integer) zzzjVar.zzd(zzxx.zzb);
        if (num == null) {
            return null;
        }
        zzxk zzxkVar = (zzxk) zza.zzb(zzydVar, zzzjVar);
        return zzxkVar.zzb.incrementAndGet() >= ((long) num.intValue()) ? zzxkVar : zzyq.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void zzb() {
        this.zzb.set(0L);
    }
}
