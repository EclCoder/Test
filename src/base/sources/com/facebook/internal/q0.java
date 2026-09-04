package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f15347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CountDownLatch f15348b;

    public q0(final Callable callable) {
        kotlin.jvm.internal.s.h(callable, "callable");
        this.f15348b = new CountDownLatch(1);
        com.facebook.h0.v().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.p0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q0.b(this.f15344a, callable);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void b(q0 this$0, Callable callable) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(callable, "$callable");
        try {
            this$0.f15347a = callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.f15348b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private final void d() {
        CountDownLatch countDownLatch = this.f15348b;
        if (countDownLatch == null) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    public final Object c() {
        d();
        return this.f15347a;
    }
}
