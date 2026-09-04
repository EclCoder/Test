package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcfu {
    public static void zza(ListenableFuture listenableFuture, String str, Executor executor) {
        zzhbw.zzr(listenableFuture, new zzcfs(str), executor);
    }

    public static void zzb(ListenableFuture listenableFuture, String str) {
        zzhbw.zzr(listenableFuture, new zzcft(str), zzcfr.zzh);
    }
}
