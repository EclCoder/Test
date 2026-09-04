package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f22039a = new AtomicReference(x.h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f22040b = new d(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f22041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f22042b;

        a(q qVar, c cVar, i iVar) {
            this.f22041a = cVar;
            this.f22042b = iVar;
        }

        @Override // com.google.common.util.concurrent.i
        public ListenableFuture call() {
            return !this.f22041a.h() ? x.e() : this.f22042b.call();
        }

        public String toString() {
            return this.f22042b.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum b {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends AtomicReference implements Executor, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        q f22047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Executor f22048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Runnable f22049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Thread f22050d;

        /* synthetic */ c(Executor executor, q qVar, p pVar) {
            this(executor, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            return compareAndSet(b.NOT_RUN, b.CANCELLED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h() {
            return compareAndSet(b.NOT_RUN, b.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (get() == b.CANCELLED) {
                this.f22048b = null;
                this.f22047a = null;
                return;
            }
            this.f22050d = Thread.currentThread();
            try {
                q qVar = this.f22047a;
                Objects.requireNonNull(qVar);
                d dVar = qVar.f22040b;
                if (dVar.f22051a == this.f22050d) {
                    this.f22047a = null;
                    sc.p.v(dVar.f22052b == null);
                    dVar.f22052b = runnable;
                    Executor executor = this.f22048b;
                    Objects.requireNonNull(executor);
                    dVar.f22053c = executor;
                    this.f22048b = null;
                } else {
                    Executor executor2 = this.f22048b;
                    Objects.requireNonNull(executor2);
                    this.f22048b = null;
                    this.f22049c = runnable;
                    executor2.execute(this);
                }
            } finally {
                this.f22050d = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            p pVar = null;
            if (threadCurrentThread != this.f22050d) {
                Runnable runnable = this.f22049c;
                Objects.requireNonNull(runnable);
                this.f22049c = null;
                runnable.run();
                return;
            }
            d dVar = new d(pVar);
            dVar.f22051a = threadCurrentThread;
            q qVar = this.f22047a;
            Objects.requireNonNull(qVar);
            qVar.f22040b = dVar;
            this.f22047a = null;
            try {
                Runnable runnable2 = this.f22049c;
                Objects.requireNonNull(runnable2);
                this.f22049c = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = dVar.f22052b;
                    if (runnable3 == null || (executor = dVar.f22053c) == null) {
                        break;
                    }
                    dVar.f22052b = null;
                    dVar.f22053c = null;
                    executor.execute(runnable3);
                }
                dVar.f22051a = null;
            } catch (Throwable th2) {
                dVar.f22051a = null;
                throw th2;
            }
        }

        private c(Executor executor, q qVar) {
            super(b.NOT_RUN);
            this.f22048b = executor;
            this.f22047a = qVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Thread f22051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f22052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Executor f22053c;

        private d() {
        }

        /* synthetic */ d(p pVar) {
            this();
        }
    }

    private q() {
    }

    public static /* synthetic */ void a(n0 n0Var, l0 l0Var, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, c cVar) {
        if (n0Var.isDone()) {
            l0Var.setFuture(listenableFuture);
        } else if (listenableFuture2.isCancelled() && cVar.g()) {
            n0Var.cancel(false);
        }
    }

    public static q d() {
        return new q();
    }

    public ListenableFuture e(i iVar, Executor executor) {
        sc.p.o(iVar);
        sc.p.o(executor);
        final c cVar = new c(executor, this, null);
        a aVar = new a(this, cVar, iVar);
        final l0 l0VarN = l0.n();
        final ListenableFuture listenableFuture = (ListenableFuture) this.f22039a.getAndSet(l0VarN);
        final n0 n0VarR = n0.r(aVar);
        listenableFuture.addListener(n0VarR, cVar);
        final ListenableFuture listenableFutureI = x.i(n0VarR);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.o
            @Override // java.lang.Runnable
            public final void run() {
                q.a(n0VarR, l0VarN, listenableFuture, listenableFutureI, cVar);
            }
        };
        listenableFutureI.addListener(runnable, g0.a());
        n0VarR.addListener(runnable, g0.a());
        return listenableFutureI;
    }
}
