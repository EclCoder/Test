package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface f0 extends ScheduledExecutorService, e0, AutoCloseable {
    @Override // java.util.concurrent.ScheduledExecutorService
    d0 schedule(Runnable runnable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    d0 schedule(Callable callable, long j10, TimeUnit timeUnit);
}
