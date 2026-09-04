package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcdx implements ThreadFactory {
    private final AtomicInteger zza;

    zzcdx(zzcdz zzcdzVar) {
        Objects.requireNonNull(zzcdzVar);
        this.zza = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(String.valueOf(andIncrement).length() + 31);
        sb2.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb2.append(andIncrement);
        return new Thread(runnable, sb2.toString());
    }
}
