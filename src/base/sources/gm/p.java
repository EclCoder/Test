package gm;

import em.d3;
import fl.g0;
import jm.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class p extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f39403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f39404n;

    public p(int i10, a aVar, Function1 function1) {
        super(i10, function1);
        this.f39403m = i10;
        this.f39404n = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + l0.b(e.class).k() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ Object d1(p pVar, Object obj, kl.f fVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionC;
        Object objG1 = pVar.g1(obj, true);
        if (!(objG1 instanceof k.a)) {
            return g0.f38750a;
        }
        k.e(objG1);
        Function1 function1 = pVar.f39362b;
        if (function1 == null || (undeliveredElementExceptionC = w.c(function1, obj, null, 2, null)) == null) {
            throw pVar.d0();
        }
        fl.e.a(undeliveredElementExceptionC, pVar.d0());
        throw undeliveredElementExceptionC;
    }

    private final Object e1(Object obj, boolean z10) {
        Function1 function1;
        UndeliveredElementException undeliveredElementExceptionC;
        Object objE = super.e(obj);
        if (k.i(objE) || k.h(objE)) {
            return objE;
        }
        if (!z10 || (function1 = this.f39362b) == null || (undeliveredElementExceptionC = w.c(function1, obj, null, 2, null)) == null) {
            return k.f39391b.c(g0.f38750a);
        }
        throw undeliveredElementExceptionC;
    }

    private final Object f1(Object obj) {
        l lVarS;
        Object obj2 = f.f39370d;
        l lVar = (l) e.e0().get(this);
        while (true) {
            long andIncrement = e.f0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zQ0 = q0(andIncrement);
            int i10 = f.f39368b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (lVar.f42636c != j11) {
                lVarS = S(j11, lVar);
                if (lVarS == null) {
                    if (zQ0) {
                        return k.f39391b.a(d0());
                    }
                }
            } else {
                lVarS = lVar;
            }
            Object obj3 = obj;
            int iY0 = Y0(lVarS, i11, obj3, j10, obj2, zQ0);
            lVar = lVarS;
            if (iY0 == 0) {
                lVar.c();
                return k.f39391b.c(g0.f38750a);
            }
            if (iY0 == 1) {
                return k.f39391b.c(g0.f38750a);
            }
            if (iY0 == 2) {
                if (zQ0) {
                    lVar.t();
                    return k.f39391b.a(d0());
                }
                d3 d3Var = obj2 instanceof d3 ? (d3) obj2 : null;
                if (d3Var != null) {
                    I0(d3Var, lVar, i11);
                }
                O((lVar.f42636c * ((long) i10)) + ((long) i11));
                return k.f39391b.c(g0.f38750a);
            }
            if (iY0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iY0 == 4) {
                if (j10 < c0()) {
                    lVar.c();
                }
                return k.f39391b.a(d0());
            }
            if (iY0 == 5) {
                lVar.c();
            }
            obj = obj3;
        }
    }

    private final Object g1(Object obj, boolean z10) {
        return this.f39404n == a.DROP_LATEST ? e1(obj, z10) : f1(obj);
    }

    @Override // gm.e, gm.u
    public Object e(Object obj) {
        return g1(obj, false);
    }

    @Override // gm.e, gm.u
    public Object o(Object obj, kl.f fVar) {
        return d1(this, obj, fVar);
    }

    @Override // gm.e
    protected boolean r0() {
        return this.f39404n == a.DROP_OLDEST;
    }
}
