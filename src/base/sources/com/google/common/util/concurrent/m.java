package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class m extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f22009i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final i f22010e;

        a(i iVar, Executor executor) {
            super(executor);
            this.f22010e = (i) sc.p.o(iVar);
        }

        @Override // com.google.common.util.concurrent.b0
        String i() {
            return this.f22010e.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.b0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public ListenableFuture h() {
            return (ListenableFuture) sc.p.q(this.f22010e.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f22010e);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.m.c
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void l(ListenableFuture listenableFuture) {
            m.this.setFuture(listenableFuture);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Callable f22012e;

        b(Callable callable, Executor executor) {
            super(executor);
            this.f22012e = (Callable) sc.p.o(callable);
        }

        @Override // com.google.common.util.concurrent.b0
        Object h() {
            return this.f22012e.call();
        }

        @Override // com.google.common.util.concurrent.b0
        String i() {
            return this.f22012e.toString();
        }

        @Override // com.google.common.util.concurrent.m.c
        void l(Object obj) {
            m.this.set(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private abstract class c extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Executor f22014c;

        c(Executor executor) {
            this.f22014c = (Executor) sc.p.o(executor);
        }

        @Override // com.google.common.util.concurrent.b0
        final void a(Throwable th2) {
            m.this.f22009i = null;
            if (th2 instanceof ExecutionException) {
                m.this.setException(((ExecutionException) th2).getCause());
            } else if (th2 instanceof CancellationException) {
                m.this.cancel(false);
            } else {
                m.this.setException(th2);
            }
        }

        @Override // com.google.common.util.concurrent.b0
        final void b(Object obj) {
            m.this.f22009i = null;
            l(obj);
        }

        @Override // com.google.common.util.concurrent.b0
        final boolean g() {
            return m.this.isDone();
        }

        final void k() {
            try {
                this.f22014c.execute(this);
            } catch (RejectedExecutionException e10) {
                m.this.setException(e10);
            }
        }

        abstract void l(Object obj);
    }

    m(com.google.common.collect.a0 a0Var, boolean z10, Executor executor, i iVar) {
        super(a0Var, z10, false);
        this.f22009i = new a(iVar, executor);
        C();
    }

    @Override // com.google.common.util.concurrent.g
    void A() {
        c cVar = this.f22009i;
        if (cVar != null) {
            cVar.k();
        }
    }

    @Override // com.google.common.util.concurrent.g
    void F(g.a aVar) {
        super.F(aVar);
        if (aVar == g.a.OUTPUT_FUTURE_DONE) {
            this.f22009i = null;
        }
    }

    @Override // com.google.common.util.concurrent.b
    protected void interruptTask() {
        c cVar = this.f22009i;
        if (cVar != null) {
            cVar.d();
        }
    }

    m(com.google.common.collect.a0 a0Var, boolean z10, Executor executor, Callable callable) {
        super(a0Var, z10, false);
        this.f22009i = new b(callable, executor);
        C();
    }

    @Override // com.google.common.util.concurrent.g
    void x(int i10, Object obj) {
    }
}
