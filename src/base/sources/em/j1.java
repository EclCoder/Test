package em;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j1 extends k1 implements x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f38016f = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f38017g = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f38018h = AtomicIntegerFieldUpdater.newUpdater(j1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o f38019c;

        public a(long j10, o oVar) {
            super(j10);
            this.f38019c = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38019c.u(j1.this, fl.g0.f38750a);
        }

        @Override // em.j1.c
        public String toString() {
            return super.toString() + this.f38019c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f38021c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f38021c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38021c.run();
        }

        @Override // em.j1.c
        public String toString() {
            return super.toString() + this.f38021c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class c implements Runnable, Comparable, e1, jm.n0 {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f38022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38023b = -1;

        public c(long j10) {
            this.f38022a = j10;
        }

        @Override // jm.n0
        public jm.m0 b() {
            Object obj = this._heap;
            if (obj instanceof jm.m0) {
                return (jm.m0) obj;
            }
            return null;
        }

        @Override // jm.n0
        public void c(jm.m0 m0Var) {
            if (this._heap == m1.f38031a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = m0Var;
        }

        @Override // em.e1
        public final void d() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == m1.f38031a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = m1.f38031a;
                    fl.g0 g0Var = fl.g0.f38750a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f38022a - cVar.f38022a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final int f(long j10, d dVar, j1 j1Var) {
            synchronized (this) {
                if (this._heap == m1.f38031a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (j1Var.h()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f38024c = j10;
                        } else {
                            long j11 = cVar.f38022a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f38024c > 0) {
                                dVar.f38024c = j10;
                            }
                        }
                        long j12 = this.f38022a;
                        long j13 = dVar.f38024c;
                        if (j12 - j13 < 0) {
                            this.f38022a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final boolean g(long j10) {
            return j10 - this.f38022a >= 0;
        }

        @Override // jm.n0
        public int getIndex() {
            return this.f38023b;
        }

        @Override // jm.n0
        public void setIndex(int i10) {
            this.f38023b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f38022a + ']';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends jm.m0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f38024c;

        public d(long j10) {
            this.f38024c = j10;
        }
    }

    private final void A1(boolean z10) {
        f38018h.set(this, z10 ? 1 : 0);
    }

    private final boolean B1(c cVar) {
        d dVar = (d) f38017g.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        return f38018h.get(this) == 1;
    }

    private final void m1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38016f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f38016f, this, null, m1.f38032b)) {
                    return;
                }
            } else if (obj instanceof jm.q) {
                ((jm.q) obj).d();
                return;
            } else {
                if (obj == m1.f38032b) {
                    return;
                }
                jm.q qVar = new jm.q(8, true);
                kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f38016f, this, obj, qVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable n1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38016f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof jm.q) {
                kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                jm.q qVar = (jm.q) obj;
                Object objM = qVar.m();
                if (objM != jm.q.f42681h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f38016f, this, obj, qVar.l());
            } else {
                if (obj == m1.f38032b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f38016f, this, obj, null)) {
                    kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void p1() {
        jm.n0 n0VarI;
        d dVar = (d) f38017g.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        em.c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    jm.n0 n0VarB = dVar.b();
                    n0VarI = null;
                    if (n0VarB != null) {
                        c cVar = (c) n0VarB;
                        if (cVar.g(jNanoTime) ? q1(cVar) : false) {
                            n0VarI = dVar.i(0);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (((c) n0VarI) != null);
    }

    private final boolean q1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38016f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (h()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f38016f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof jm.q) {
                kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                jm.q qVar = (jm.q) obj;
                int iA = qVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f38016f, this, obj, qVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == m1.f38032b) {
                    return false;
                }
                jm.q qVar2 = new jm.q(8, true);
                kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f38016f, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    private final void v1() {
        c cVar;
        em.c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f38017g.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                j1(jNanoTime, cVar);
            }
        }
    }

    private final int y1(long j10, c cVar) {
        if (h()) {
            return 1;
        }
        d dVar = (d) f38017g.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f38017g, this, null, new d(j10));
            Object obj = f38017g.get(this);
            kotlin.jvm.internal.s.e(obj);
            dVar = (d) obj;
        }
        return cVar.f(j10, dVar, this);
    }

    @Override // em.k0
    public final void T0(kl.j jVar, Runnable runnable) {
        o1(runnable);
    }

    @Override // em.i1
    protected long b1() {
        c cVar;
        if (super.b1() == 0) {
            return 0L;
        }
        Object obj = f38016f.get(this);
        if (obj != null) {
            if (!(obj instanceof jm.q)) {
                return obj == m1.f38032b ? Long.MAX_VALUE : 0L;
            }
            if (!((jm.q) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f38017g.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f38022a;
        em.c.a();
        return yl.g.e(j10 - System.nanoTime(), 0L);
    }

    @Override // em.i1
    public long g1() {
        if (h1()) {
            return 0L;
        }
        p1();
        Runnable runnableN1 = n1();
        if (runnableN1 == null) {
            return b1();
        }
        runnableN1.run();
        return 0L;
    }

    @Override // em.x0
    public /* bridge */ e1 i(long j10, Runnable runnable, kl.j jVar) {
        return super.i(j10, runnable, jVar);
    }

    @Override // em.x0
    public void i0(long j10, o oVar) {
        long jC = m1.c(j10);
        if (jC < 4611686018427387903L) {
            em.c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, oVar);
            x1(jNanoTime, aVar);
            s.a(oVar, aVar);
        }
    }

    public void o1(Runnable runnable) {
        p1();
        if (q1(runnable)) {
            k1();
        } else {
            t0.f38057i.o1(runnable);
        }
    }

    @Override // em.i1
    public void shutdown() {
        w2.f38068a.c();
        A1(true);
        m1();
        while (g1() <= 0) {
        }
        v1();
    }

    protected boolean u1() {
        if (!f1()) {
            return false;
        }
        d dVar = (d) f38017g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f38016f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof jm.q) {
            return ((jm.q) obj).j();
        }
        return obj == m1.f38032b;
    }

    protected final void w1() {
        f38016f.set(this, null);
        f38017g.set(this, null);
    }

    public final void x1(long j10, c cVar) {
        int iY1 = y1(j10, cVar);
        if (iY1 == 0) {
            if (B1(cVar)) {
                k1();
            }
        } else if (iY1 == 1) {
            j1(j10, cVar);
        } else if (iY1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    protected final e1 z1(long j10, Runnable runnable) {
        long jC = m1.c(j10);
        if (jC >= 4611686018427387903L) {
            return l2.f38029a;
        }
        em.c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        x1(jNanoTime, bVar);
        return bVar;
    }
}
