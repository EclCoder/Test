package em;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e2 implements z1, x, n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37984a = AtomicReferenceFieldUpdater.newUpdater(e2.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37985b = AtomicReferenceFieldUpdater.newUpdater(e2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends q {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final e2 f37986i;

        public a(kl.f fVar, e2 e2Var) {
            super(fVar, 1);
            this.f37986i = e2Var;
        }

        @Override // em.q
        protected String O() {
            return "AwaitContinuation";
        }

        @Override // em.q
        public Throwable y(z1 z1Var) {
            Throwable thE;
            Object objZ = this.f37986i.Z();
            if (!(objZ instanceof c) || (thE = ((c) objZ).e()) == null) {
                return objZ instanceof d0 ? ((d0) objZ).f37973a : z1Var.l();
            }
            return thE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends d2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e2 f37987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c f37988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final w f37989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Object f37990h;

        public b(e2 e2Var, c cVar, w wVar, Object obj) {
            this.f37987e = e2Var;
            this.f37988f = cVar;
            this.f37989g = wVar;
            this.f37990h = obj;
        }

        @Override // em.d2
        public boolean v() {
            return false;
        }

        @Override // em.d2
        public void w(Throwable th2) {
            this.f37987e.O(this.f37988f, this.f37989g, this.f37990h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f37991b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f37992c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f37993d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j2 f37994a;

        public c(j2 j2Var, boolean z10, Throwable th2) {
            this.f37994a = j2Var;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object d() {
            return f37993d.get(this);
        }

        private final void n(Object obj) {
            f37993d.set(this, obj);
        }

        public final void a(Throwable th2) {
            Throwable thE = e();
            if (thE == null) {
                o(th2);
                return;
            }
            if (th2 == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                n(th2);
                return;
            }
            if (objD instanceof Throwable) {
                if (th2 == objD) {
                    return;
                }
                ArrayList arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th2);
                n(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        @Override // em.u1
        public j2 b() {
            return this.f37994a;
        }

        public final Throwable e() {
            return (Throwable) f37992c.get(this);
        }

        public final boolean i() {
            return e() != null;
        }

        @Override // em.u1
        public boolean isActive() {
            return e() == null;
        }

        public final boolean j() {
            return f37991b.get(this) == 1;
        }

        public final boolean k() {
            return d() == f2.f38001e;
        }

        public final List l(Throwable th2) {
            ArrayList arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (th2 != null && !kotlin.jvm.internal.s.c(th2, thE)) {
                arrayListC.add(th2);
            }
            n(f2.f38001e);
            return arrayListC;
        }

        public final void m(boolean z10) {
            f37991b.set(this, z10 ? 1 : 0);
        }

        public final void o(Throwable th2) {
            f37992c.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + i() + ", completing=" + j() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + b() + ']';
        }
    }

    public e2(boolean z10) {
        this._state$volatile = z10 ? f2.f38003g : f2.f38002f;
    }

    private final void A0(d2 d2Var) {
        d2Var.f(new j2());
        androidx.concurrent.futures.b.a(f37984a, this, d2Var, d2Var.l());
    }

    private final void C(Throwable th2, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                fl.e.a(th2, th3);
            }
        }
    }

    private final int D0(Object obj) {
        if (obj instanceof h1) {
            if (((h1) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f37984a, this, obj, f2.f38003g)) {
                return -1;
            }
            y0();
            return 1;
        }
        if (!(obj instanceof t1)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f37984a, this, obj, ((t1) obj).b())) {
            return -1;
        }
        y0();
        return 1;
    }

    private final String E0(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof u1) {
                return ((u1) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof d0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.i()) {
            return "Cancelling";
        }
        return cVar.j() ? "Completing" : "Active";
    }

    private final Object F(kl.f fVar) {
        a aVar = new a(ll.b.c(fVar), this);
        aVar.H();
        s.a(aVar, c2.k(this, false, new o2(aVar), 1, null));
        Object objB = aVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB;
    }

    public static /* synthetic */ CancellationException H0(e2 e2Var, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return e2Var.G0(th2, str);
    }

    private final Object J(Object obj) {
        Object objM0;
        do {
            Object objZ = Z();
            if (!(objZ instanceof u1) || ((objZ instanceof c) && ((c) objZ).j())) {
                return f2.f37997a;
            }
            objM0 = M0(objZ, new d0(P(obj), false, 2, null));
        } while (objM0 == f2.f37999c);
        return objM0;
    }

    private final boolean J0(u1 u1Var, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f37984a, this, u1Var, f2.g(obj))) {
            return false;
        }
        w0(null);
        x0(obj);
        N(u1Var, obj);
        return true;
    }

    private final boolean K(Throwable th2) {
        if (k0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        v vVarY = Y();
        if (vVarY == null || vVarY == l2.f38029a) {
            return z10;
        }
        return vVarY.a(th2) || z10;
    }

    private final boolean L0(u1 u1Var, Throwable th2) throws Throwable {
        j2 j2VarW = W(u1Var);
        if (j2VarW == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f37984a, this, u1Var, new c(j2VarW, false, th2))) {
            return false;
        }
        u0(j2VarW, th2);
        return true;
    }

    private final Object M0(Object obj, Object obj2) {
        if (!(obj instanceof u1)) {
            return f2.f37997a;
        }
        if ((!(obj instanceof h1) && !(obj instanceof d2)) || (obj instanceof w) || (obj2 instanceof d0)) {
            return O0((u1) obj, obj2);
        }
        return J0((u1) obj, obj2) ? obj2 : f2.f37999c;
    }

    private final void N(u1 u1Var, Object obj) throws Throwable {
        v vVarY = Y();
        if (vVarY != null) {
            vVarY.d();
            C0(l2.f38029a);
        }
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        Throwable th2 = d0Var != null ? d0Var.f37973a : null;
        if (!(u1Var instanceof d2)) {
            j2 j2VarB = u1Var.b();
            if (j2VarB != null) {
                v0(j2VarB, th2);
                return;
            }
            return;
        }
        try {
            ((d2) u1Var).w(th2);
        } catch (Throwable th3) {
            f0(new CompletionHandlerException("Exception in completion handler " + u1Var + " for " + this, th3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(c cVar, w wVar, Object obj) {
        w wVarT0 = t0(wVar);
        if (wVarT0 == null || !P0(cVar, wVarT0, obj)) {
            cVar.b().g(2);
            w wVarT1 = t0(wVar);
            if (wVarT1 == null || !P0(cVar, wVarT1, obj)) {
                D(Q(cVar, obj));
            }
        }
    }

    private final Object O0(u1 u1Var, Object obj) throws Throwable {
        j2 j2VarW = W(u1Var);
        if (j2VarW == null) {
            return f2.f37999c;
        }
        c cVar = u1Var instanceof c ? (c) u1Var : null;
        if (cVar == null) {
            cVar = new c(j2VarW, false, null);
        }
        kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        synchronized (cVar) {
            if (cVar.j()) {
                return f2.f37997a;
            }
            cVar.m(true);
            if (cVar != u1Var && !androidx.concurrent.futures.b.a(f37984a, this, u1Var, cVar)) {
                return f2.f37999c;
            }
            boolean zI = cVar.i();
            d0 d0Var = obj instanceof d0 ? (d0) obj : null;
            if (d0Var != null) {
                cVar.a(d0Var.f37973a);
            }
            Throwable thE = zI ? null : cVar.e();
            k0Var.f43597a = thE;
            fl.g0 g0Var = fl.g0.f38750a;
            if (thE != null) {
                u0(j2VarW, thE);
            }
            w wVarT0 = t0(j2VarW);
            if (wVarT0 != null && P0(cVar, wVarT0, obj)) {
                return f2.f37998b;
            }
            j2VarW.g(2);
            w wVarT1 = t0(j2VarW);
            return (wVarT1 == null || !P0(cVar, wVarT1, obj)) ? Q(cVar, obj) : f2.f37998b;
        }
    }

    private final Throwable P(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(L(), null, this) : th2;
        }
        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((n2) obj).t();
    }

    private final boolean P0(c cVar, w wVar, Object obj) {
        while (b2.j(wVar.f38064e, false, new b(this, cVar, wVar, obj)) == l2.f38029a) {
            wVar = t0(wVar);
            if (wVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Object Q(c cVar, Object obj) throws Throwable {
        boolean zI;
        Throwable thT;
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        Throwable th2 = d0Var != null ? d0Var.f37973a : null;
        synchronized (cVar) {
            zI = cVar.i();
            List listL = cVar.l(th2);
            thT = T(cVar, listL);
            if (thT != null) {
                C(thT, listL);
            }
        }
        if (thT != null && thT != th2) {
            obj = new d0(thT, false, 2, null);
        }
        if (thT != null && (K(thT) || e0(thT))) {
            kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((d0) obj).c();
        }
        if (!zI) {
            w0(thT);
        }
        x0(obj);
        androidx.concurrent.futures.b.a(f37984a, this, cVar, f2.g(obj));
        N(cVar, obj);
        return obj;
    }

    private final Throwable S(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var != null) {
            return d0Var.f37973a;
        }
        return null;
    }

    private final Throwable T(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.i()) {
                return new JobCancellationException(L(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) list.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            for (Object obj2 : list2) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final j2 W(u1 u1Var) {
        j2 j2VarB = u1Var.b();
        if (j2VarB != null) {
            return j2VarB;
        }
        if (u1Var instanceof h1) {
            return new j2();
        }
        if (u1Var instanceof d2) {
            A0((d2) u1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + u1Var).toString());
    }

    private final boolean l0() {
        Object objZ;
        do {
            objZ = Z();
            if (!(objZ instanceof u1)) {
                return false;
            }
        } while (D0(objZ) < 0);
        return true;
    }

    private final Object n0(kl.f fVar) {
        q qVar = new q(ll.b.c(fVar), 1);
        qVar.H();
        s.a(qVar, c2.k(this, false, new p2(qVar), 1, null));
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB == ll.b.f() ? objB : fl.g0.f38750a;
    }

    private final Object o0(Object obj) throws Throwable {
        Throwable thP = null;
        while (true) {
            Object objZ = Z();
            if (objZ instanceof c) {
                synchronized (objZ) {
                    if (((c) objZ).k()) {
                        return f2.f38000d;
                    }
                    boolean zI = ((c) objZ).i();
                    if (obj != null || !zI) {
                        if (thP == null) {
                            thP = P(obj);
                        }
                        ((c) objZ).a(thP);
                    }
                    Throwable thE = zI ? null : ((c) objZ).e();
                    if (thE != null) {
                        u0(((c) objZ).b(), thE);
                    }
                    return f2.f37997a;
                }
            }
            if (!(objZ instanceof u1)) {
                return f2.f38000d;
            }
            if (thP == null) {
                thP = P(obj);
            }
            u1 u1Var = (u1) objZ;
            if (!u1Var.isActive()) {
                Object objM0 = M0(objZ, new d0(thP, false, 2, null));
                if (objM0 == f2.f37997a) {
                    throw new IllegalStateException(("Cannot happen in " + objZ).toString());
                }
                if (objM0 != f2.f37999c) {
                    return objM0;
                }
            } else if (L0(u1Var, thP)) {
                return f2.f37997a;
            }
        }
    }

    private final w t0(jm.o oVar) {
        while (oVar.q()) {
            oVar = oVar.m();
        }
        while (true) {
            oVar = oVar.l();
            if (!oVar.q()) {
                if (oVar instanceof w) {
                    return (w) oVar;
                }
                if (oVar instanceof j2) {
                    return null;
                }
            }
        }
    }

    private final void u0(j2 j2Var, Throwable th2) throws Throwable {
        w0(th2);
        j2Var.g(4);
        Object objK = j2Var.k();
        kotlin.jvm.internal.s.f(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (jm.o oVarL = (jm.o) objK; !kotlin.jvm.internal.s.c(oVarL, j2Var); oVarL = oVarL.l()) {
            if ((oVarL instanceof d2) && ((d2) oVarL).v()) {
                try {
                    ((d2) oVarL).w(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        fl.e.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + oVarL + " for " + this, th3);
                        fl.g0 g0Var = fl.g0.f38750a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            f0(completionHandlerException);
        }
        K(th2);
    }

    private final void v0(j2 j2Var, Throwable th2) throws Throwable {
        j2Var.g(1);
        Object objK = j2Var.k();
        kotlin.jvm.internal.s.f(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (jm.o oVarL = (jm.o) objK; !kotlin.jvm.internal.s.c(oVarL, j2Var); oVarL = oVarL.l()) {
            if (oVarL instanceof d2) {
                try {
                    ((d2) oVarL).w(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        fl.e.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + oVarL + " for " + this, th3);
                        fl.g0 g0Var = fl.g0.f38750a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            f0(completionHandlerException);
        }
    }

    private final void z0(h1 h1Var) {
        j2 j2Var = new j2();
        Object t1Var = j2Var;
        if (!h1Var.isActive()) {
            t1Var = new t1(j2Var);
        }
        androidx.concurrent.futures.b.a(f37984a, this, h1Var, t1Var);
    }

    public final void B0(d2 d2Var) {
        Object objZ;
        do {
            objZ = Z();
            if (!(objZ instanceof d2)) {
                if (!(objZ instanceof u1) || ((u1) objZ).b() == null) {
                    return;
                }
                d2Var.r();
                return;
            }
            if (objZ != d2Var) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f37984a, this, objZ, f2.f38003g));
    }

    public final void C0(v vVar) {
        f37985b.set(this, vVar);
    }

    protected final Object E(kl.f fVar) throws Throwable {
        Object objZ;
        do {
            objZ = Z();
            if (!(objZ instanceof u1)) {
                if (objZ instanceof d0) {
                    throw ((d0) objZ).f37973a;
                }
                return f2.h(objZ);
            }
        } while (D0(objZ) < 0);
        return F(fVar);
    }

    public final boolean G(Throwable th2) {
        return H(th2);
    }

    protected final CancellationException G0(Throwable th2, String str) {
        CancellationException jobCancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = L();
            }
            jobCancellationException = new JobCancellationException(str, th2, this);
        }
        return jobCancellationException;
    }

    public final boolean H(Object obj) throws Throwable {
        Object objO0 = f2.f37997a;
        if (V() && (objO0 = J(obj)) == f2.f37998b) {
            return true;
        }
        if (objO0 == f2.f37997a) {
            objO0 = o0(obj);
        }
        if (objO0 == f2.f37997a || objO0 == f2.f37998b) {
            return true;
        }
        if (objO0 == f2.f38000d) {
            return false;
        }
        D(objO0);
        return true;
    }

    public void I(Throwable th2) throws Throwable {
        H(th2);
    }

    public final String I0() {
        return s0() + '{' + E0(Z()) + '}';
    }

    @Override // em.z1
    public final v K0(x xVar) {
        w wVar = new w(xVar);
        wVar.x(this);
        while (true) {
            Object objZ = Z();
            if (objZ instanceof h1) {
                h1 h1Var = (h1) objZ;
                if (!h1Var.isActive()) {
                    z0(h1Var);
                } else if (androidx.concurrent.futures.b.a(f37984a, this, objZ, wVar)) {
                    return wVar;
                }
            } else {
                Throwable thE = null;
                if (!(objZ instanceof u1)) {
                    Object objZ2 = Z();
                    d0 d0Var = objZ2 instanceof d0 ? (d0) objZ2 : null;
                    wVar.w(d0Var != null ? d0Var.f37973a : null);
                    return l2.f38029a;
                }
                j2 j2VarB = ((u1) objZ).b();
                if (j2VarB != null) {
                    if (!j2VarB.c(wVar, 7)) {
                        boolean zC = j2VarB.c(wVar, 3);
                        Object objZ3 = Z();
                        if (objZ3 instanceof c) {
                            thE = ((c) objZ3).e();
                        } else {
                            d0 d0Var2 = objZ3 instanceof d0 ? (d0) objZ3 : null;
                            if (d0Var2 != null) {
                                thE = d0Var2.f37973a;
                            }
                        }
                        wVar.w(thE);
                        if (!zC) {
                            return l2.f38029a;
                        }
                    }
                    return wVar;
                }
                kotlin.jvm.internal.s.f(objZ, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                A0((d2) objZ);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String L() {
        return "Job was cancelled";
    }

    public boolean M(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return H(th2) && U();
    }

    public final Object R() throws Throwable {
        Object objZ = Z();
        if (objZ instanceof u1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objZ instanceof d0) {
            throw ((d0) objZ).f37973a;
        }
        return f2.h(objZ);
    }

    public boolean U() {
        return true;
    }

    public boolean V() {
        return false;
    }

    public z1 X() {
        v vVarY = Y();
        if (vVarY != null) {
            return vVarY.getParent();
        }
        return null;
    }

    public final v Y() {
        return (v) f37985b.get(this);
    }

    public final Object Z() {
        return f37984a.get(this);
    }

    @Override // em.z1
    public void a(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(L(), null, this);
        }
        I(cancellationException);
    }

    @Override // em.z1
    public final Object c(kl.f fVar) {
        if (l0()) {
            Object objN0 = n0(fVar);
            return objN0 == ll.b.f() ? objN0 : fl.g0.f38750a;
        }
        b2.h(fVar.getContext());
        return fl.g0.f38750a;
    }

    protected boolean e0(Throwable th2) {
        return false;
    }

    @Override // kl.j
    public /* bridge */ Object fold(Object obj, tl.o oVar) {
        return z1.a.b(this, obj, oVar);
    }

    @Override // kl.j.b, kl.j
    public /* bridge */ kl.j.b get(kl.j.c cVar) {
        return z1.a.c(this, cVar);
    }

    @Override // kl.j.b
    public final kl.j.c getKey() {
        return z1.f38078x2;
    }

    @Override // em.z1
    public final boolean h() {
        return !(Z() instanceof u1);
    }

    protected final void h0(z1 z1Var) {
        if (z1Var == null) {
            C0(l2.f38029a);
            return;
        }
        z1Var.start();
        v vVarK0 = z1Var.K0(this);
        C0(vVarK0);
        if (h()) {
            vVarK0.d();
            C0(l2.f38029a);
        }
    }

    @Override // em.z1
    public boolean isActive() {
        Object objZ = Z();
        return (objZ instanceof u1) && ((u1) objZ).isActive();
    }

    @Override // em.z1
    public final boolean isCancelled() {
        Object objZ = Z();
        if (objZ instanceof d0) {
            return true;
        }
        return (objZ instanceof c) && ((c) objZ).i();
    }

    @Override // em.z1
    public final e1 j(boolean z10, boolean z11, Function1 function1) {
        return j0(z11, z10 ? new x1(function1) : new y1(function1));
    }

    public final e1 j0(boolean z10, d2 d2Var) {
        boolean z11;
        boolean zC;
        d2Var.x(this);
        while (true) {
            Object objZ = Z();
            z11 = true;
            if (!(objZ instanceof h1)) {
                if (!(objZ instanceof u1)) {
                    z11 = false;
                    break;
                }
                u1 u1Var = (u1) objZ;
                j2 j2VarB = u1Var.b();
                if (j2VarB == null) {
                    kotlin.jvm.internal.s.f(objZ, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    A0((d2) objZ);
                } else {
                    if (d2Var.v()) {
                        c cVar = u1Var instanceof c ? (c) u1Var : null;
                        Throwable thE = cVar != null ? cVar.e() : null;
                        if (thE != null) {
                            if (z10) {
                                d2Var.w(thE);
                            }
                            return l2.f38029a;
                        }
                        zC = j2VarB.c(d2Var, 5);
                    } else {
                        zC = j2VarB.c(d2Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                h1 h1Var = (h1) objZ;
                if (!h1Var.isActive()) {
                    z0(h1Var);
                } else if (androidx.concurrent.futures.b.a(f37984a, this, objZ, d2Var)) {
                    break;
                }
            }
        }
        if (z11) {
            return d2Var;
        }
        if (z10) {
            Object objZ2 = Z();
            d0 d0Var = objZ2 instanceof d0 ? (d0) objZ2 : null;
            d2Var.w(d0Var != null ? d0Var.f37973a : null);
        }
        return l2.f38029a;
    }

    protected boolean k0() {
        return false;
    }

    @Override // em.z1
    public final CancellationException l() {
        Object objZ = Z();
        if (!(objZ instanceof c)) {
            if (objZ instanceof u1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objZ instanceof d0) {
                return H0(this, ((d0) objZ).f37973a, null, 1, null);
            }
            return new JobCancellationException(s0.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objZ).e();
        if (thE != null) {
            CancellationException cancellationExceptionG0 = G0(thE, s0.a(this) + " is cancelling");
            if (cancellationExceptionG0 != null) {
                return cancellationExceptionG0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kl.j
    public /* bridge */ kl.j minusKey(kl.j.c cVar) {
        return z1.a.d(this, cVar);
    }

    @Override // em.x
    public final void p0(n2 n2Var) throws Throwable {
        H(n2Var);
    }

    @Override // kl.j
    public /* bridge */ kl.j plus(kl.j jVar) {
        return z1.a.e(this, jVar);
    }

    @Override // em.z1
    public final e1 q(Function1 function1) {
        return j0(true, new y1(function1));
    }

    public final boolean q0(Object obj) {
        Object objM0;
        do {
            objM0 = M0(Z(), obj);
            if (objM0 == f2.f37997a) {
                return false;
            }
            if (objM0 == f2.f37998b) {
                return true;
            }
        } while (objM0 == f2.f37999c);
        D(objM0);
        return true;
    }

    public final Object r0(Object obj) {
        Object objM0;
        do {
            objM0 = M0(Z(), obj);
            if (objM0 == f2.f37997a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, S(obj));
            }
        } while (objM0 == f2.f37999c);
        return objM0;
    }

    public String s0() {
        return s0.a(this);
    }

    @Override // em.z1
    public final boolean start() {
        int iD0;
        do {
            iD0 = D0(Z());
            if (iD0 == 0) {
                return false;
            }
        } while (iD0 != 1);
        return true;
    }

    @Override // em.n2
    public CancellationException t() {
        Throwable thE;
        Object objZ = Z();
        if (objZ instanceof c) {
            thE = ((c) objZ).e();
        } else if (objZ instanceof d0) {
            thE = ((d0) objZ).f37973a;
        } else {
            if (objZ instanceof u1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objZ).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + E0(objZ), thE, this);
    }

    public String toString() {
        return I0() + '@' + s0.b(this);
    }

    protected void y0() {
    }

    protected void D(Object obj) {
    }

    public void f0(Throwable th2) throws Throwable {
        throw th2;
    }

    protected void w0(Throwable th2) {
    }

    protected void x0(Object obj) {
    }
}
