package nm;

import em.d3;
import fl.g0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jm.a0;
import jm.b0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f47842c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f47843d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f47844e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f47845f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f47846g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function3 f47848b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final /* synthetic */ class a extends p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47849a = new a();

        a() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final k b(long j10, k kVar) {
            return j.h(j10, kVar);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (k) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final /* synthetic */ class b extends p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47850a = new b();

        b() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final k b(long j10, k kVar) {
            return j.h(j10, kVar);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (k) obj2);
        }
    }

    public i(int i10, int i11) {
        this.f47847a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i10 - i11;
        this.f47848b = new Function3() { // from class: nm.h
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return i.s(this.f47841a, (Throwable) obj, (g0) obj2, (kl.j) obj3);
            }
        };
    }

    private final boolean j(d3 d3Var) {
        Object objC;
        k kVar = (k) f47844e.get(this);
        long andIncrement = f47845f.getAndIncrement(this);
        a aVar = a.f47849a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47844e;
        long j10 = andIncrement / ((long) j.f47856f);
        loop0: while (true) {
            objC = jm.b.c(kVar, j10, aVar);
            if (!b0.c(objC)) {
                a0 a0VarB = b0.b(objC);
                while (true) {
                    a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
                    if (a0Var.f42636c >= a0VarB.f42636c) {
                        break loop0;
                    }
                    if (!a0VarB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a0Var, a0VarB)) {
                        if (!a0Var.p()) {
                            break loop0;
                        }
                        a0Var.n();
                        break loop0;
                    }
                    if (a0VarB.p()) {
                        a0VarB.n();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) b0.b(objC);
        int i10 = (int) (andIncrement % ((long) j.f47856f));
        if (com.google.android.gms.internal.measurement.a.a(kVar2.v(), i10, null, d3Var)) {
            d3Var.a(kVar2, i10);
            return true;
        }
        if (!com.google.android.gms.internal.measurement.a.a(kVar2.v(), i10, j.f47852b, j.f47853c)) {
            return false;
        }
        if (d3Var instanceof em.o) {
            s.f(d3Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((em.o) d3Var).p(g0.f38750a, this.f47848b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + d3Var).toString());
    }

    private final void k() {
        int i10;
        do {
            i10 = f47846g.get(this);
            if (i10 <= this.f47847a) {
                return;
            }
        } while (!f47846g.compareAndSet(this, i10, this.f47847a));
    }

    private final int l() {
        int andDecrement;
        do {
            andDecrement = f47846g.getAndDecrement(this);
        } while (andDecrement > this.f47847a);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 s(i iVar, Throwable th2, g0 g0Var, kl.j jVar) {
        iVar.t();
        return g0.f38750a;
    }

    private final boolean v(Object obj) {
        if (!(obj instanceof em.o)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        em.o oVar = (em.o) obj;
        Object objX = oVar.x(g0.f38750a, null, this.f47848b);
        if (objX == null) {
            return false;
        }
        oVar.z(objX);
        return true;
    }

    private final boolean w() {
        Object objC;
        k kVar = (k) f47842c.get(this);
        long andIncrement = f47843d.getAndIncrement(this);
        long j10 = andIncrement / ((long) j.f47856f);
        b bVar = b.f47850a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47842c;
        loop0: while (true) {
            objC = jm.b.c(kVar, j10, bVar);
            if (b0.c(objC)) {
                break;
            }
            a0 a0VarB = b0.b(objC);
            while (true) {
                a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
                if (a0Var.f42636c >= a0VarB.f42636c) {
                    break loop0;
                }
                if (!a0VarB.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a0Var, a0VarB)) {
                    if (!a0Var.p()) {
                        break loop0;
                    }
                    a0Var.n();
                    break loop0;
                }
                if (a0VarB.p()) {
                    a0VarB.n();
                }
            }
        }
        k kVar2 = (k) b0.b(objC);
        kVar2.c();
        if (kVar2.f42636c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) j.f47856f));
        Object andSet = kVar2.v().getAndSet(i10, j.f47852b);
        if (andSet != null) {
            if (andSet == j.f47855e) {
                return false;
            }
            return v(andSet);
        }
        int i11 = j.f47851a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (kVar2.v().get(i10) == j.f47853c) {
                return true;
            }
        }
        return !com.google.android.gms.internal.measurement.a.a(kVar2.v(), i10, j.f47852b, j.f47854d);
    }

    protected final void i(em.o oVar) {
        while (l() <= 0) {
            s.f(oVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (j((d3) oVar)) {
                return;
            }
        }
        oVar.p(g0.f38750a, this.f47848b);
    }

    public final int m() {
        return Math.max(f47846g.get(this), 0);
    }

    public final void t() {
        do {
            int andIncrement = f47846g.getAndIncrement(this);
            if (andIncrement >= this.f47847a) {
                k();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f47847a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!w());
    }

    public final boolean u() {
        while (true) {
            int i10 = f47846g.get(this);
            if (i10 > this.f47847a) {
                k();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f47846g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
