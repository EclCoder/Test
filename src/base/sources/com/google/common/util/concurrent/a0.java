package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class a0 implements ListenableFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ListenableFuture f21933b = new a0(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c0 f21934c = new c0(a0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21935a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends com.google.common.util.concurrent.b.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f21936a;

        static {
            f21936a = com.google.common.util.concurrent.b.GENERATE_CANCELLATION_CAUSES ? null : new a();
        }

        a() {
            cancel(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends com.google.common.util.concurrent.b.j {
        b(Throwable th2) {
            setException(th2);
        }
    }

    a0(Object obj) {
        this.f21935a = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        sc.p.p(runnable, "Runnable was null.");
        sc.p.p(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f21934c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f21935a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f21935a + "]]";
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        sc.p.o(timeUnit);
        return get();
    }
}
