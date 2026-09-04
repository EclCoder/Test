package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzyp {
    private static final zzyf zza = new zzyo();
    private final AtomicBoolean zzb = new AtomicBoolean();
    private final AtomicInteger zzc = new AtomicInteger();

    private zzyp() {
    }

    static int zza(zzyq zzyqVar, zzyd zzydVar, zzzj zzzjVar) {
        zzyp zzypVar = (zzyp) zza.zzb(zzydVar, zzzjVar);
        int iIncrementAndGet = zzypVar.zzc.incrementAndGet();
        if (zzyqVar == zzyq.zzc || !zzypVar.zzb.compareAndSet(false, true)) {
            return -1;
        }
        try {
            zzyqVar.zzb();
            zzypVar.zzb.set(false);
            zzypVar.zzc.addAndGet(-iIncrementAndGet);
            return iIncrementAndGet - 1;
        } catch (Throwable th2) {
            zzypVar.zzb.set(false);
            throw th2;
        }
    }

    /* synthetic */ zzyp(byte[] bArr) {
    }
}
