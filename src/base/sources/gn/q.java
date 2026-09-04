package gn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f39752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f39753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f39754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f39755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f39756g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f39757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f39758b;

        public a(List callsToExecute, Runnable runnable) {
            kotlin.jvm.internal.s.h(callsToExecute, "callsToExecute");
            this.f39757a = callsToExecute;
            this.f39758b = runnable;
        }

        public final List a() {
            return this.f39757a;
        }

        public final Runnable b() {
            return this.f39758b;
        }
    }

    public q() {
        this.f39750a = 64;
        this.f39751b = 5;
        this.f39754e = new ArrayDeque();
        this.f39755f = new ArrayDeque();
        this.f39756g = new ArrayDeque();
    }

    private final ln.m.a d(String str) {
        Iterator it = this.f39755f.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            ln.m.a aVar = (ln.m.a) it.next();
            if (kotlin.jvm.internal.s.c(aVar.f(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f39754e.iterator();
        kotlin.jvm.internal.s.g(it2, "iterator(...)");
        while (it2.hasNext()) {
            ln.m.a aVar2 = (ln.m.a) it2.next();
            if (kotlin.jvm.internal.s.c(aVar2.f(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void g(ln.m.a aVar, ln.m mVar, ln.m.a aVar2) {
        a aVar3;
        ln.m.a aVarD;
        hn.p.e(this);
        boolean zIsShutdown = c().isShutdown();
        synchronized (this) {
            if (mVar != null) {
                try {
                    if (!this.f39756g.remove(mVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (aVar2 != null) {
                aVar2.e().decrementAndGet();
                if (!this.f39755f.remove(aVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (aVar != null) {
                this.f39754e.add(aVar);
                if (!aVar.d().m() && (aVarD = d(aVar.f())) != null) {
                    aVar.g(aVarD);
                }
            }
            Runnable runnable = (!(mVar == null && aVar2 == null) && (zIsShutdown || this.f39755f.isEmpty()) && this.f39756g.isEmpty()) ? this.f39752c : null;
            if (zIsShutdown) {
                List listI0 = gl.r.I0(this.f39754e);
                this.f39754e.clear();
                aVar3 = new a(listI0, runnable);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f39754e.iterator();
                kotlin.jvm.internal.s.g(it, "iterator(...)");
                while (it.hasNext()) {
                    ln.m.a aVar4 = (ln.m.a) it.next();
                    if (this.f39755f.size() >= this.f39750a) {
                        break;
                    }
                    if (aVar4.e().get() < this.f39751b) {
                        it.remove();
                        aVar4.e().incrementAndGet();
                        kotlin.jvm.internal.s.e(aVar4);
                        arrayList.add(aVar4);
                        this.f39755f.add(aVar4);
                    }
                }
                aVar3 = new a(arrayList, runnable);
            }
        }
        int size = aVar3.a().size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            ln.m.a aVar5 = (ln.m.a) aVar3.a().get(i10);
            if (aVar5 == aVar) {
                z10 = false;
            } else {
                aVar5.d().l().m(aVar5.d(), this);
            }
            if (zIsShutdown) {
                ln.m.a.c(aVar5, null, 1, null);
            } else {
                aVar5.a(c());
            }
        }
        if (z10 && aVar != null) {
            aVar.d().l().n(aVar.d(), this);
        }
        Runnable runnableB = aVar3.b();
        if (runnableB != null) {
            runnableB.run();
        }
    }

    static /* synthetic */ void h(q qVar, ln.m.a aVar, ln.m mVar, ln.m.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        if ((i10 & 2) != 0) {
            mVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        qVar.g(aVar, mVar, aVar2);
    }

    public final void a(ln.m.a call) {
        kotlin.jvm.internal.s.h(call, "call");
        h(this, call, null, null, 6, null);
    }

    public final synchronized boolean b(ln.m call) {
        kotlin.jvm.internal.s.h(call, "call");
        return this.f39756g.add(call);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f39753d == null) {
                this.f39753d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), hn.p.p(hn.p.f40723c + " Dispatcher", false));
            }
            executorService = this.f39753d;
            kotlin.jvm.internal.s.e(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final void e(ln.m.a call) {
        kotlin.jvm.internal.s.h(call, "call");
        h(this, null, null, call, 3, null);
    }

    public final void f(ln.m call) {
        kotlin.jvm.internal.s.h(call, "call");
        h(this, null, call, null, 5, null);
    }

    public final void i(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.f39750a = i10;
            fl.g0 g0Var = fl.g0.f38750a;
        }
        h(this, null, null, null, 7, null);
    }

    public q(ExecutorService executorService) {
        this();
        this.f39753d = executorService;
    }
}
