package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends y {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class a extends r implements b.i {
        a() {
        }

        @Override // com.google.common.util.concurrent.b, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final Object get(long j10, TimeUnit timeUnit) {
            return super.get(j10, timeUnit);
        }
    }

    r() {
    }

    public static r o(ListenableFuture listenableFuture) {
        return listenableFuture instanceof r ? (r) listenableFuture : new s(listenableFuture);
    }

    public final r n(Class cls, sc.g gVar, Executor executor) {
        return (r) x.b(this, cls, gVar, executor);
    }

    public final r p(sc.g gVar, Executor executor) {
        return (r) x.l(this, gVar, executor);
    }

    public final r q(j jVar, Executor executor) {
        return (r) x.m(this, jVar, executor);
    }
}
