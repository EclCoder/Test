package com.google.android.gms.internal.ads;

import androidx.activity.b0;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzhch extends ScheduledExecutorService, zzhcg, AutoCloseable {
    @Override // com.google.android.gms.internal.ads.zzhcg, java.lang.AutoCloseable
    /* synthetic */ default void close() {
        b0.a(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    zzhcf schedule(Runnable runnable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    zzhcf schedule(Callable callable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    zzhcf scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    zzhcf scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit);
}
