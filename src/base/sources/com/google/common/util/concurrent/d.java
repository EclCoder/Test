package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class d extends r.a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ListenableFuture f21968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f21969b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends d {
        a(ListenableFuture listenableFuture, j jVar) {
            super(listenableFuture, jVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.d
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public ListenableFuture t(j jVar, Object obj) {
            ListenableFuture listenableFutureApply = jVar.apply(obj);
            sc.p.q(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", jVar);
            return listenableFutureApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.d
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void u(ListenableFuture listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends d {
        b(ListenableFuture listenableFuture, sc.g gVar) {
            super(listenableFuture, gVar);
        }

        @Override // com.google.common.util.concurrent.d
        void u(Object obj) {
            set(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.d
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public Object t(sc.g gVar, Object obj) {
            return gVar.apply(obj);
        }
    }

    d(ListenableFuture listenableFuture, Object obj) {
        this.f21968a = (ListenableFuture) sc.p.o(listenableFuture);
        this.f21969b = sc.p.o(obj);
    }

    static ListenableFuture r(ListenableFuture listenableFuture, j jVar, Executor executor) {
        sc.p.o(executor);
        a aVar = new a(listenableFuture, jVar);
        listenableFuture.addListener(aVar, g0.d(executor, aVar));
        return aVar;
    }

    static ListenableFuture s(ListenableFuture listenableFuture, sc.g gVar, Executor executor) {
        sc.p.o(gVar);
        b bVar = new b(listenableFuture, gVar);
        listenableFuture.addListener(bVar, g0.d(executor, bVar));
        return bVar;
    }

    @Override // com.google.common.util.concurrent.b
    protected final void afterDone() {
        maybePropagateCancellationTo(this.f21968a);
        this.f21968a = null;
        this.f21969b = null;
    }

    @Override // com.google.common.util.concurrent.b
    protected String pendingToString() {
        String str;
        ListenableFuture listenableFuture = this.f21968a;
        Object obj = this.f21969b;
        String strPendingToString = super.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        }
        if (strPendingToString == null) {
            return null;
        }
        return str + strPendingToString;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f21968a;
        Object obj = this.f21969b;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f21968a = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object objT = t(obj, x.d(listenableFuture));
                this.f21969b = null;
                u(objT);
            } catch (Throwable th2) {
                try {
                    j0.b(th2);
                    setException(th2);
                } finally {
                    this.f21969b = null;
                }
            }
        } catch (Error e10) {
            setException(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            setException(e11.getCause());
        } catch (Exception e12) {
            setException(e12);
        }
    }

    abstract Object t(Object obj, Object obj2);

    abstract void u(Object obj);
}
