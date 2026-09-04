package com.google.common.util.concurrent;

import com.google.common.collect.p1;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class g extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c0 f21975h = new c0(g.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.common.collect.a0 f21976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f21977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f21978g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    g(com.google.common.collect.a0 a0Var, boolean z10, boolean z11) {
        super(a0Var.size());
        this.f21976e = (com.google.common.collect.a0) sc.p.o(a0Var);
        this.f21977f = z10;
        this.f21978g = z11;
    }

    private void B(Throwable th2) {
        sc.p.o(th2);
        if (this.f21977f && !setException(th2) && w(t(), th2)) {
            D(th2);
        } else if (th2 instanceof Error) {
            D(th2);
        }
    }

    private static void D(Throwable th2) {
        f21975h.a().log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
    }

    private void E(com.google.common.collect.a0 a0Var) {
        if (a0Var != null) {
            p1 it = a0Var.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Future future = (Future) it.next();
                if (!future.isCancelled()) {
                    y(i10, future);
                }
                i10++;
            }
        }
        r();
        A();
        F(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    public static /* synthetic */ void v(g gVar, ListenableFuture listenableFuture, int i10) {
        gVar.getClass();
        try {
            if (listenableFuture.isCancelled()) {
                gVar.f21976e = null;
                gVar.cancel(false);
            } else {
                gVar.y(i10, listenableFuture);
            }
        } finally {
            gVar.z(null);
        }
    }

    private static boolean w(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    private void y(int i10, Future future) {
        try {
            x(i10, x.d(future));
        } catch (ExecutionException e10) {
            B(e10.getCause());
        } catch (Throwable th2) {
            B(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(com.google.common.collect.a0 a0Var) {
        int iS = s();
        sc.p.w(iS >= 0, "Less than 0 remaining futures");
        if (iS == 0) {
            E(a0Var);
        }
    }

    abstract void A();

    final void C() {
        Objects.requireNonNull(this.f21976e);
        if (this.f21976e.isEmpty()) {
            A();
            return;
        }
        if (!this.f21977f) {
            final com.google.common.collect.a0 a0Var = this.f21978g ? this.f21976e : null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21973a.z(a0Var);
                }
            };
            p1 it = this.f21976e.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).addListener(runnable, g0.a());
            }
            return;
        }
        p1 it2 = this.f21976e.iterator();
        final int i10 = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.addListener(new Runnable() { // from class: com.google.common.util.concurrent.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.v(this.f21970a, listenableFuture, i10);
                }
            }, g0.a());
            i10++;
        }
    }

    void F(a aVar) {
        sc.p.o(aVar);
        this.f21976e = null;
    }

    @Override // com.google.common.util.concurrent.b
    protected final void afterDone() {
        super.afterDone();
        com.google.common.collect.a0 a0Var = this.f21976e;
        F(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (a0Var != null)) {
            boolean zWasInterrupted = wasInterrupted();
            p1 it = a0Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zWasInterrupted);
            }
        }
    }

    @Override // com.google.common.util.concurrent.b
    protected final String pendingToString() {
        com.google.common.collect.a0 a0Var = this.f21976e;
        if (a0Var == null) {
            return super.pendingToString();
        }
        return "futures=" + a0Var;
    }

    @Override // com.google.common.util.concurrent.h
    final void q(Set set) {
        sc.p.o(set);
        if (isCancelled()) {
            return;
        }
        Throwable thTryInternalFastPathGetFailure = tryInternalFastPathGetFailure();
        Objects.requireNonNull(thTryInternalFastPathGetFailure);
        w(set, thTryInternalFastPathGetFailure);
    }

    abstract void x(int i10, Object obj);
}
