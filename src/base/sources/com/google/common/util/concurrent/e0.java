package com.google.common.util.concurrent;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface e0 extends ExecutorService, AutoCloseable {
    ListenableFuture submit(Runnable runnable);
}
