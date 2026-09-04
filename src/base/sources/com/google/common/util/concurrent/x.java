package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x extends z {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future f22056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final v f22057b;

        a(Future future, v vVar) {
            this.f22056a = future;
            this.f22057b = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Object obj = this.f22056a;
            if ((obj instanceof xc.a) && (thA = xc.b.a((xc.a) obj)) != null) {
                this.f22057b.onFailure(thA);
                return;
            }
            try {
                this.f22057b.onSuccess(x.d(this.f22056a));
            } catch (ExecutionException e10) {
                this.f22057b.onFailure(e10.getCause());
            } catch (Throwable th2) {
                this.f22057b.onFailure(th2);
            }
        }

        public String toString() {
            return sc.j.b(this).c(this.f22057b).toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f22058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.common.collect.c0 f22059b;

        /* synthetic */ b(boolean z10, com.google.common.collect.c0 c0Var, w wVar) {
            this(z10, c0Var);
        }

        public ListenableFuture a(Callable callable, Executor executor) {
            return new m(this.f22059b, this.f22058a, executor, callable);
        }

        public ListenableFuture b(i iVar, Executor executor) {
            return new m(this.f22059b, this.f22058a, executor, iVar);
        }

        private b(boolean z10, com.google.common.collect.c0 c0Var) {
            this.f22058a = z10;
            this.f22059b = c0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends com.google.common.util.concurrent.b.j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ListenableFuture f22060a;

        c(ListenableFuture listenableFuture) {
            this.f22060a = listenableFuture;
        }

        @Override // com.google.common.util.concurrent.b
        protected void afterDone() {
            this.f22060a = null;
        }

        @Override // com.google.common.util.concurrent.b
        protected String pendingToString() {
            ListenableFuture listenableFuture = this.f22060a;
            if (listenableFuture == null) {
                return null;
            }
            return "delegate=[" + listenableFuture + "]";
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture listenableFuture = this.f22060a;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }
    }

    public static void a(ListenableFuture listenableFuture, v vVar, Executor executor) {
        sc.p.o(vVar);
        listenableFuture.addListener(new a(listenableFuture, vVar), executor);
    }

    public static ListenableFuture b(ListenableFuture listenableFuture, Class cls, sc.g gVar, Executor executor) {
        return com.google.common.util.concurrent.a.s(listenableFuture, cls, gVar, executor);
    }

    public static ListenableFuture c(ListenableFuture listenableFuture, Class cls, j jVar, Executor executor) {
        return com.google.common.util.concurrent.a.r(listenableFuture, cls, jVar, executor);
    }

    public static Object d(Future future) {
        sc.p.y(future.isDone(), "Future was expected to be done: %s", future);
        return o0.a(future);
    }

    public static ListenableFuture e() {
        a0.a aVar = a0.a.f21936a;
        return aVar != null ? aVar : new a0.a();
    }

    public static ListenableFuture f(Throwable th2) {
        sc.p.o(th2);
        return new a0.b(th2);
    }

    public static ListenableFuture g(Object obj) {
        return obj == null ? a0.f21933b : new a0(obj);
    }

    public static ListenableFuture h() {
        return a0.f21933b;
    }

    public static ListenableFuture i(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        c cVar = new c(listenableFuture);
        listenableFuture.addListener(cVar, g0.a());
        return cVar;
    }

    public static ListenableFuture j(Callable callable, Executor executor) {
        n0 n0VarT = n0.t(callable);
        executor.execute(n0VarT);
        return n0VarT;
    }

    public static ListenableFuture k(i iVar, Executor executor) {
        n0 n0VarR = n0.r(iVar);
        executor.execute(n0VarR);
        return n0VarR;
    }

    public static ListenableFuture l(ListenableFuture listenableFuture, sc.g gVar, Executor executor) {
        return d.s(listenableFuture, gVar, executor);
    }

    public static ListenableFuture m(ListenableFuture listenableFuture, j jVar, Executor executor) {
        return d.r(listenableFuture, jVar, executor);
    }

    public static b n(Iterable iterable) {
        return new b(false, com.google.common.collect.c0.w(iterable), null);
    }

    public static b o(Iterable iterable) {
        return new b(true, com.google.common.collect.c0.w(iterable), null);
    }
}
