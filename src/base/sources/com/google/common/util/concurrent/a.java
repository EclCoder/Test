package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class a extends r.a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ListenableFuture f21930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Class f21931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f21932c;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0326a extends a {
        C0326a(ListenableFuture listenableFuture, Class cls, j jVar) {
            super(listenableFuture, cls, jVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public ListenableFuture t(j jVar, Throwable th2) {
            ListenableFuture listenableFutureApply = jVar.apply(th2);
            sc.p.q(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", jVar);
            return listenableFutureApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void u(ListenableFuture listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends a {
        b(ListenableFuture listenableFuture, Class cls, sc.g gVar) {
            super(listenableFuture, cls, gVar);
        }

        @Override // com.google.common.util.concurrent.a
        void u(Object obj) {
            set(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public Object t(sc.g gVar, Throwable th2) {
            return gVar.apply(th2);
        }
    }

    a(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.f21930a = (ListenableFuture) sc.p.o(listenableFuture);
        this.f21931b = (Class) sc.p.o(cls);
        this.f21932c = sc.p.o(obj);
    }

    static ListenableFuture r(ListenableFuture listenableFuture, Class cls, j jVar, Executor executor) {
        C0326a c0326a = new C0326a(listenableFuture, cls, jVar);
        listenableFuture.addListener(c0326a, g0.d(executor, c0326a));
        return c0326a;
    }

    static ListenableFuture s(ListenableFuture listenableFuture, Class cls, sc.g gVar, Executor executor) {
        b bVar = new b(listenableFuture, cls, gVar);
        listenableFuture.addListener(bVar, g0.d(executor, bVar));
        return bVar;
    }

    @Override // com.google.common.util.concurrent.b
    protected final void afterDone() {
        maybePropagateCancellationTo(this.f21930a);
        this.f21930a = null;
        this.f21931b = null;
        this.f21932c = null;
    }

    @Override // com.google.common.util.concurrent.b
    protected String pendingToString() {
        String str;
        ListenableFuture listenableFuture = this.f21930a;
        Class cls = this.f21931b;
        Object obj = this.f21932c;
        String strPendingToString = super.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strPendingToString == null) {
                return null;
            }
            return str + strPendingToString;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objD;
        ListenableFuture listenableFuture = this.f21930a;
        Class cls = this.f21931b;
        Object obj = this.f21932c;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f21930a = null;
        try {
            th = listenableFuture instanceof xc.a ? xc.b.a((xc.a) listenableFuture) : null;
            objD = th == null ? x.d(listenableFuture) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e10.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        if (th == null) {
            set(h0.a(objD));
            return;
        }
        if (!j0.a(th, cls)) {
            setFuture(listenableFuture);
            return;
        }
        try {
            Object objT = t(obj, th);
            this.f21931b = null;
            this.f21932c = null;
            u(objT);
        } catch (Throwable th3) {
            try {
                j0.b(th3);
                setException(th3);
            } finally {
                this.f21931b = null;
                this.f21932c = null;
            }
        }
    }

    abstract Object t(Object obj, Throwable th2);

    abstract void u(Object obj);
}
