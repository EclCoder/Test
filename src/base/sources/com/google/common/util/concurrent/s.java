package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class s extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ListenableFuture f22054a;

    s(ListenableFuture listenableFuture) {
        this.f22054a = (ListenableFuture) sc.p.o(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.b, com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.f22054a.addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f22054a.cancel(z10);
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public Object get() {
        return this.f22054a.get();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f22054a.isCancelled();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public boolean isDone() {
        return this.f22054a.isDone();
    }

    @Override // com.google.common.util.concurrent.b
    public String toString() {
        return this.f22054a.toString();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f22054a.get(j10, timeUnit);
    }
}
