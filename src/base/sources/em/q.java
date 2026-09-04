package em;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class q extends a1 implements o, kotlin.coroutines.jvm.internal.e, d3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f38039f = AtomicIntegerFieldUpdater.newUpdater(q.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f38040g = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f38041h = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kl.f f38042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kl.j f38043e;

    public q(kl.f fVar, int i10) {
        super(i10);
        this.f38042d = fVar;
        this.f38043e = fVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d.f37971a;
    }

    private final e1 A() {
        return (e1) f38041h.get(this);
    }

    private final String D() {
        Object objC = C();
        if (objC instanceof m2) {
            return "Active";
        }
        return objC instanceof t ? "Cancelled" : "Completed";
    }

    private final e1 I() {
        z1 z1Var = (z1) getContext().get(z1.f38078x2);
        if (z1Var == null) {
            return null;
        }
        e1 e1VarK = c2.k(z1Var, false, new u(this), 1, null);
        androidx.concurrent.futures.b.a(f38041h, this, null, e1VarK);
        return e1VarK;
    }

    private final void J(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38040g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d) {
                if (androidx.concurrent.futures.b.a(f38040g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof n) || (obj2 instanceof jm.a0)) {
                N(obj, obj2);
            } else {
                if (obj2 instanceof d0) {
                    d0 d0Var = (d0) obj2;
                    if (!d0Var.c()) {
                        N(obj, obj2);
                    }
                    if (obj2 instanceof t) {
                        Throwable th2 = d0Var.f37973a;
                        if (obj instanceof n) {
                            l((n) obj, th2);
                            return;
                        } else {
                            kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            q((jm.a0) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof c0) {
                    c0 c0Var = (c0) obj2;
                    if (c0Var.f37963b != null) {
                        N(obj, obj2);
                    }
                    if (obj instanceof jm.a0) {
                        return;
                    }
                    kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    n nVar = (n) obj;
                    if (c0Var.c()) {
                        l(nVar, c0Var.f37966e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f38040g, this, obj2, c0.b(c0Var, null, nVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof jm.a0) {
                        return;
                    }
                    kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f38040g, this, obj2, new c0(obj2, (n) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean M() {
        if (!b1.c(this.f37958c)) {
            return false;
        }
        kl.f fVar = this.f38042d;
        kotlin.jvm.internal.s.f(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((jm.h) fVar).q();
    }

    private final void N(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 T(Function1 function1, Throwable th2, Object obj, kl.j jVar) {
        function1.invoke(th2);
        return fl.g0.f38750a;
    }

    public static /* synthetic */ void V(q qVar, Object obj, int i10, Function3 function3, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            function3 = null;
        }
        qVar.U(obj, i10, function3);
    }

    private final Object W(m2 m2Var, Object obj, int i10, Function3 function3, Object obj2) {
        if (obj instanceof d0) {
            return obj;
        }
        if ((b1.b(i10) || obj2 != null) && !(function3 == null && !(m2Var instanceof n) && obj2 == null)) {
            return new c0(obj, m2Var instanceof n ? (n) m2Var : null, function3, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean X() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38039f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f38039f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final jm.d0 Y(Object obj, Object obj2, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38040g;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof m2)) {
                Object obj4 = obj2;
                if ((obj3 instanceof c0) && obj4 != null && ((c0) obj3).f37965d == obj4) {
                    return r.f38054a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            Function3 function4 = function3;
            if (androidx.concurrent.futures.b.a(f38040g, this, obj3, W((m2) obj3, obj5, this.f37958c, function4, obj6))) {
                t();
                return r.f38054a;
            }
            obj = obj5;
            function3 = function4;
            obj2 = obj6;
        }
    }

    private final boolean Z() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38039f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f38039f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void q(jm.a0 a0Var, Throwable th2) {
        int i10 = f38039f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            a0Var.s(i10, th2, getContext());
        } catch (Throwable th3) {
            m0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final boolean r(Throwable th2) {
        if (!M()) {
            return false;
        }
        kl.f fVar = this.f38042d;
        kotlin.jvm.internal.s.f(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((jm.h) fVar).r(th2);
    }

    private final void t() {
        if (M()) {
            return;
        }
        s();
    }

    private final void w(int i10) {
        if (X()) {
            return;
        }
        b1.a(this, i10);
    }

    public final Object B() {
        z1 z1Var;
        boolean zM = M();
        if (Z()) {
            if (A() == null) {
                I();
            }
            if (zM) {
                Q();
            }
            return ll.b.f();
        }
        if (zM) {
            Q();
        }
        Object objC = C();
        if (objC instanceof d0) {
            throw ((d0) objC).f37973a;
        }
        if (!b1.b(this.f37958c) || (z1Var = (z1) getContext().get(z1.f38078x2)) == null || z1Var.isActive()) {
            return e(objC);
        }
        CancellationException cancellationExceptionL = z1Var.l();
        b(objC, cancellationExceptionL);
        throw cancellationExceptionL;
    }

    public final Object C() {
        return f38040g.get(this);
    }

    public void H() {
        e1 e1VarI = I();
        if (e1VarI != null && h()) {
            e1VarI.d();
            f38041h.set(this, l2.f38029a);
        }
    }

    public final void K(n nVar) {
        J(nVar);
    }

    public boolean L() {
        return C() instanceof m2;
    }

    protected String O() {
        return "CancellableContinuation";
    }

    public final void P(Throwable th2) {
        if (r(th2)) {
            return;
        }
        n(th2);
        t();
    }

    public final void Q() {
        Throwable thT;
        kl.f fVar = this.f38042d;
        jm.h hVar = fVar instanceof jm.h ? (jm.h) fVar : null;
        if (hVar == null || (thT = hVar.t(this)) == null) {
            return;
        }
        s();
        n(thT);
    }

    public final boolean R() {
        Object obj = f38040g.get(this);
        if ((obj instanceof c0) && ((c0) obj).f37965d != null) {
            s();
            return false;
        }
        f38039f.set(this, 536870911);
        f38040g.set(this, d.f37971a);
        return true;
    }

    public void S(Object obj, final Function1 function1) {
        U(obj, this.f37958c, function1 != null ? new Function3() { // from class: em.p
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return q.T(function1, (Throwable) obj2, obj3, (kl.j) obj4);
            }
        } : null);
    }

    public final void U(Object obj, int i10, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38040g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof m2)) {
                Object obj3 = obj;
                Function3 function4 = function3;
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (tVar.e()) {
                        if (function4 != null) {
                            o(function4, tVar.f37973a, obj3);
                            return;
                        }
                        return;
                    }
                }
                k(obj3);
                throw new KotlinNothingValueException();
            }
            Object obj4 = obj;
            int i11 = i10;
            Function3 function5 = function3;
            if (androidx.concurrent.futures.b.a(f38040g, this, obj2, W((m2) obj2, obj4, i11, function5, null))) {
                t();
                w(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                function3 = function5;
            }
        }
    }

    @Override // em.d3
    public void a(jm.a0 a0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38039f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        J(a0Var);
    }

    @Override // em.a1
    public void b(Object obj, Throwable th2) {
        Throwable th3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38040g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof m2) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof d0) {
                return;
            }
            if (obj2 instanceof c0) {
                c0 c0Var = (c0) obj2;
                if (c0Var.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th4 = th2;
                th3 = th4;
                if (androidx.concurrent.futures.b.a(f38040g, this, obj2, c0.b(c0Var, null, null, null, null, th4, 15, null))) {
                    c0Var.d(this, th3);
                    return;
                }
            } else {
                th3 = th2;
                if (androidx.concurrent.futures.b.a(f38040g, this, obj2, new c0(obj2, null, null, null, th3, 14, null))) {
                    return;
                }
            }
            th2 = th3;
        }
    }

    @Override // em.a1
    public final kl.f c() {
        return this.f38042d;
    }

    @Override // em.a1
    public Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // em.a1
    public Object e(Object obj) {
        return obj instanceof c0 ? ((c0) obj).f37962a : obj;
    }

    @Override // em.a1
    public Object g() {
        return C();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kl.f fVar = this.f38042d;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // kl.f
    public kl.j getContext() {
        return this.f38043e;
    }

    @Override // em.o
    public boolean h() {
        return !(C() instanceof m2);
    }

    @Override // em.o
    public void i(Function1 function1) {
        s.c(this, new n.a(function1));
    }

    public final void l(n nVar, Throwable th2) {
        try {
            nVar.a(th2);
        } catch (Throwable th3) {
            m0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // em.o
    public Object m(Throwable th2) {
        return Y(new d0(th2, false, 2, null), null, null);
    }

    @Override // em.o
    public boolean n(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38040g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof m2)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f38040g, this, obj, new t(this, th2, (obj instanceof n) || (obj instanceof jm.a0))));
        m2 m2Var = (m2) obj;
        if (m2Var instanceof n) {
            l((n) obj, th2);
        } else if (m2Var instanceof jm.a0) {
            q((jm.a0) obj, th2);
        }
        t();
        w(this.f37958c);
        return true;
    }

    public final void o(Function3 function3, Throwable th2, Object obj) {
        try {
            function3.invoke(th2, obj, getContext());
        } catch (Throwable th3) {
            m0.a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // em.o
    public void p(Object obj, Function3 function3) {
        U(obj, this.f37958c, function3);
    }

    @Override // kl.f
    public void resumeWith(Object obj) {
        V(this, e0.c(obj, this), this.f37958c, null, 4, null);
    }

    public final void s() {
        e1 e1VarA = A();
        if (e1VarA == null) {
            return;
        }
        e1VarA.d();
        f38041h.set(this, l2.f38029a);
    }

    public String toString() {
        return O() + '(' + s0.c(this.f38042d) + "){" + D() + "}@" + s0.b(this);
    }

    @Override // em.o
    public void u(k0 k0Var, Object obj) {
        kl.f fVar = this.f38042d;
        jm.h hVar = fVar instanceof jm.h ? (jm.h) fVar : null;
        V(this, obj, (hVar != null ? hVar.f42648d : null) == k0Var ? 4 : this.f37958c, null, 4, null);
    }

    @Override // em.o
    public Object x(Object obj, Object obj2, Function3 function3) {
        return Y(obj, obj2, function3);
    }

    public Throwable y(z1 z1Var) {
        return z1Var.l();
    }

    @Override // em.o
    public void z(Object obj) {
        w(this.f37958c);
    }
}
