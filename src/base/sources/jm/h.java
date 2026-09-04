package jm;

import em.a1;
import em.i1;
import em.s0;
import em.w2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends a1 implements kotlin.coroutines.jvm.internal.e, kl.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42647h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final em.k0 f42648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kl.f f42649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f42650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f42651g;

    public h(em.k0 k0Var, kl.f fVar) {
        super(-1);
        this.f42648d = k0Var;
        this.f42649e = fVar;
        this.f42650f = i.f42652a;
        this.f42651g = k0.g(getContext());
    }

    private final em.q l() {
        Object obj = f42647h.get(this);
        if (obj instanceof em.q) {
            return (em.q) obj;
        }
        return null;
    }

    @Override // em.a1
    public Object g() {
        Object obj = this.f42650f;
        this.f42650f = i.f42652a;
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kl.f fVar = this.f42649e;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // kl.f
    public kl.j getContext() {
        return this.f42649e.getContext();
    }

    public final void j() {
        while (f42647h.get(this) == i.f42653b) {
        }
    }

    public final em.q k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42647h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f42647h.set(this, i.f42653b);
                return null;
            }
            if (obj instanceof em.q) {
                if (androidx.concurrent.futures.b.a(f42647h, this, obj, i.f42653b)) {
                    return (em.q) obj;
                }
            } else if (obj != i.f42653b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean q() {
        return f42647h.get(this) != null;
    }

    public final boolean r(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42647h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            d0 d0Var = i.f42653b;
            if (kotlin.jvm.internal.s.c(obj, d0Var)) {
                if (androidx.concurrent.futures.b.a(f42647h, this, d0Var, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f42647h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // kl.f
    public void resumeWith(Object obj) throws DispatchException {
        Object objB = em.e0.b(obj);
        if (i.d(this.f42648d, getContext())) {
            this.f42650f = objB;
            this.f37958c = 0;
            i.c(this.f42648d, getContext(), this);
            return;
        }
        i1 i1VarB = w2.f38068a.b();
        if (i1VarB.e1()) {
            this.f42650f = objB;
            this.f37958c = 0;
            i1VarB.a1(this);
            return;
        }
        i1VarB.c1(true);
        try {
            kl.j context = getContext();
            Object objI = k0.i(context, this.f42651g);
            try {
                this.f42649e.resumeWith(obj);
                fl.g0 g0Var = fl.g0.f38750a;
                k0.f(context, objI);
                while (i1VarB.h1()) {
                }
            } catch (Throwable th2) {
                k0.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                f(th3);
            } finally {
                i1VarB.X0(true);
            }
        }
    }

    public final void s() {
        j();
        em.q qVarL = l();
        if (qVarL != null) {
            qVarL.s();
        }
    }

    public final Throwable t(em.o oVar) {
        d0 d0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42647h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            d0Var = i.f42653b;
            if (obj != d0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f42647h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f42647h, this, d0Var, oVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f42648d + ", " + s0.c(this.f42649e) + ']';
    }

    @Override // em.a1
    public kl.f c() {
        return this;
    }
}
