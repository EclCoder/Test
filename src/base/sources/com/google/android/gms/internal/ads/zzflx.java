package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzflx {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzhcg zzc;

    public zzflx(Callable callable, zzhcg zzhcgVar) {
        this.zzb = callable;
        this.zzc = zzhcgVar;
    }

    public final synchronized void zza(int i10) {
        Deque deque = this.zza;
        int size = i10 - deque.size();
        for (int i11 = 0; i11 < size; i11++) {
            deque.add(this.zzc.submit(this.zzb));
        }
    }

    public final synchronized ListenableFuture zzb() {
        zza(1);
        return (ListenableFuture) this.zza.poll();
    }

    public final synchronized void zzc(ListenableFuture listenableFuture) {
        this.zza.addFirst(listenableFuture);
    }
}
