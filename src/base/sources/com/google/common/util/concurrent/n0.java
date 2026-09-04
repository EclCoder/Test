package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class n0 extends r.a implements RunnableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile b0 f22029a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i f22030c;

        a(i iVar) {
            this.f22030c = (i) sc.p.o(iVar);
        }

        @Override // com.google.common.util.concurrent.b0
        void a(Throwable th2) {
            n0.this.setException(th2);
        }

        @Override // com.google.common.util.concurrent.b0
        final boolean g() {
            return n0.this.isDone();
        }

        @Override // com.google.common.util.concurrent.b0
        String i() {
            return this.f22030c.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void b(ListenableFuture listenableFuture) {
            n0.this.setFuture(listenableFuture);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.b0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public ListenableFuture h() {
            return (ListenableFuture) sc.p.q(this.f22030c.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f22030c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Callable f22032c;

        b(Callable callable) {
            this.f22032c = (Callable) sc.p.o(callable);
        }

        @Override // com.google.common.util.concurrent.b0
        void a(Throwable th2) {
            n0.this.setException(th2);
        }

        @Override // com.google.common.util.concurrent.b0
        void b(Object obj) {
            n0.this.set(obj);
        }

        @Override // com.google.common.util.concurrent.b0
        final boolean g() {
            return n0.this.isDone();
        }

        @Override // com.google.common.util.concurrent.b0
        Object h() {
            return this.f22032c.call();
        }

        @Override // com.google.common.util.concurrent.b0
        String i() {
            return this.f22032c.toString();
        }
    }

    n0(Callable callable) {
        this.f22029a = new b(callable);
    }

    static n0 r(i iVar) {
        return new n0(iVar);
    }

    static n0 s(Runnable runnable, Object obj) {
        return new n0(Executors.callable(runnable, obj));
    }

    static n0 t(Callable callable) {
        return new n0(callable);
    }

    @Override // com.google.common.util.concurrent.b
    protected void afterDone() {
        b0 b0Var;
        super.afterDone();
        if (wasInterrupted() && (b0Var = this.f22029a) != null) {
            b0Var.d();
        }
        this.f22029a = null;
    }

    @Override // com.google.common.util.concurrent.b
    protected String pendingToString() {
        b0 b0Var = this.f22029a;
        if (b0Var == null) {
            return super.pendingToString();
        }
        return "task=[" + b0Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        b0 b0Var = this.f22029a;
        if (b0Var != null) {
            b0Var.run();
        }
        this.f22029a = null;
    }

    n0(i iVar) {
        this.f22029a = new a(iVar);
    }
}
