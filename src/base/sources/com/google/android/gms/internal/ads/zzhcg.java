package com.google.android.gms.internal.ads;

import androidx.activity.b0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzhcg extends ExecutorService, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        b0.a(this);
    }

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhcg
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    ListenableFuture submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhcg
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    ListenableFuture submit(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhcg
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    ListenableFuture submit(Callable callable);
}
