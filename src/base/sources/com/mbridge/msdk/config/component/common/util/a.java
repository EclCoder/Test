package com.mbridge.msdk.config.component.common.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f28722a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<T> f28723b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f28724c = new AtomicBoolean(false);

    public T a(long j10) {
        if (this.f28722a.await(j10, TimeUnit.MILLISECONDS)) {
            return this.f28723b.get();
        }
        return null;
    }

    public boolean a(T t10) {
        if (!this.f28724c.compareAndSet(false, true)) {
            return false;
        }
        this.f28723b.set(t10);
        this.f28722a.countDown();
        return true;
    }
}
