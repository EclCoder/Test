package com.google.firebase.concurrent;

import androidx.activity.b0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class o implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f22150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f22151b;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f22150a = executorService;
        this.f22151b = scheduledExecutorService;
    }

    public static /* synthetic */ void i(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void j(Runnable runnable, p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    public static /* synthetic */ void q(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void s(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f22150a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        b0.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f22150a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f22150a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f22150a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f22150a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f22150a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f22112a;
                return oVar.f22151b.schedule(new Runnable() { // from class: com.google.firebase.concurrent.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f22150a.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.s(runnable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f22120a;
                return oVar.f22151b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f22150a.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                o.j(runnable, bVar);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f22125a;
                return oVar.f22151b.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f22150a.execute(new Runnable() { // from class: com.google.firebase.concurrent.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.q(runnable, bVar);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f22150a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f22150a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f22150a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f22130a;
                return oVar.f22151b.schedule(new Callable() { // from class: com.google.firebase.concurrent.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return oVar.f22150a.submit(new Runnable() { // from class: com.google.firebase.concurrent.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.i(callable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f22150a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f22150a.submit(runnable);
    }
}
