package gm;

import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import em.d3;
import fl.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jm.a0;
import jm.b0;
import jm.c0;
import jm.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f39352d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f39353e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f39354f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f39355g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f39356h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f39357i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f39358j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f39359k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f39360l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f39362b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function3 f39363c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a implements i, d3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f39364a = f.f39382p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private em.q f39365b;

        public a() {
        }

        private final Object f(l lVar, int i10, long j10, kl.f fVar) throws Throwable {
            Boolean boolA;
            Function1 function1;
            l lVarR;
            e eVar = e.this;
            em.q qVarB = em.s.b(ll.b.c(fVar));
            try {
                this.f39365b = qVarB;
                try {
                    Object objW0 = eVar.W0(lVar, i10, j10, this);
                    if (objW0 == f.f39379m) {
                        eVar.H0(this, lVar, i10);
                    } else {
                        Function3 function3D = null;
                        if (objW0 == f.f39381o) {
                            if (j10 < eVar.g0()) {
                                lVar.c();
                            }
                            l lVar2 = (l) e.a0().get(eVar);
                            while (true) {
                                if (eVar.o0()) {
                                    h();
                                } else {
                                    long andIncrement = e.b0().getAndIncrement(eVar);
                                    int i11 = f.f39368b;
                                    long j11 = andIncrement / ((long) i11);
                                    int i12 = (int) (andIncrement % ((long) i11));
                                    if (lVar2.f42636c != j11) {
                                        lVarR = eVar.R(j11, lVar2);
                                        if (lVarR == null) {
                                        }
                                    } else {
                                        lVarR = lVar2;
                                    }
                                    objW0 = eVar.W0(lVarR, i12, andIncrement, this);
                                    if (objW0 == f.f39379m) {
                                        eVar.H0(this, lVarR, i12);
                                    } else if (objW0 == f.f39381o) {
                                        if (andIncrement < eVar.g0()) {
                                            lVarR.c();
                                        }
                                        lVar2 = lVarR;
                                    } else {
                                        if (objW0 == f.f39380n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        lVarR.c();
                                        this.f39364a = objW0;
                                        this.f39365b = null;
                                        boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                        function1 = eVar.f39362b;
                                        if (function1 != null) {
                                            function3D = eVar.D(function1, objW0);
                                        }
                                        qVarB.p(boolA, function3D);
                                    }
                                }
                            }
                        } else {
                            lVar.c();
                            this.f39364a = objW0;
                            this.f39365b = null;
                            boolA = kotlin.coroutines.jvm.internal.b.a(true);
                            function1 = eVar.f39362b;
                            if (function1 != null) {
                                function3D = eVar.D(function1, objW0);
                            }
                            qVarB.p(boolA, function3D);
                        }
                    }
                    Object objB = qVarB.B();
                    if (objB == ll.b.f()) {
                        kotlin.coroutines.jvm.internal.h.c(fVar);
                    }
                    return objB;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    qVarB.Q();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        private final boolean g() throws Throwable {
            this.f39364a = f.z();
            Throwable thW = e.this.W();
            if (thW == null) {
                return false;
            }
            throw c0.a(thW);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            em.q qVar = this.f39365b;
            kotlin.jvm.internal.s.e(qVar);
            this.f39365b = null;
            this.f39364a = f.z();
            Throwable thW = e.this.W();
            if (thW == null) {
                fl.r.a aVar = fl.r.f38769b;
                qVar.resumeWith(fl.r.b(Boolean.FALSE));
            } else {
                fl.r.a aVar2 = fl.r.f38769b;
                qVar.resumeWith(fl.r.b(fl.s.a(thW)));
            }
        }

        @Override // em.d3
        public void a(a0 a0Var, int i10) {
            em.q qVar = this.f39365b;
            if (qVar != null) {
                qVar.a(a0Var, i10);
            }
        }

        @Override // gm.i
        public Object b(kl.f fVar) throws Throwable {
            l lVarR;
            boolean zG = true;
            if (this.f39364a == f.f39382p || this.f39364a == f.z()) {
                e eVar = e.this;
                l lVar = (l) e.a0().get(eVar);
                while (!eVar.o0()) {
                    long andIncrement = e.b0().getAndIncrement(eVar);
                    int i10 = f.f39368b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (lVar.f42636c != j10) {
                        lVarR = eVar.R(j10, lVar);
                        if (lVarR == null) {
                            continue;
                        }
                    } else {
                        lVarR = lVar;
                    }
                    Object objW0 = eVar.W0(lVarR, i11, andIncrement, null);
                    if (objW0 == f.f39379m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objW0 == f.f39381o) {
                        if (andIncrement < eVar.g0()) {
                            lVarR.c();
                        }
                        lVar = lVarR;
                    } else {
                        if (objW0 == f.f39380n) {
                            return f(lVarR, i11, andIncrement, fVar);
                        }
                        lVarR.c();
                        this.f39364a = objW0;
                    }
                }
                zG = g();
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }

        public final boolean i(Object obj) {
            em.q qVar = this.f39365b;
            kotlin.jvm.internal.s.e(qVar);
            this.f39365b = null;
            this.f39364a = obj;
            Boolean bool = Boolean.TRUE;
            e eVar = e.this;
            Function1 function1 = eVar.f39362b;
            return f.B(qVar, bool, function1 != null ? eVar.D(function1, obj) : null);
        }

        public final void j() {
            em.q qVar = this.f39365b;
            kotlin.jvm.internal.s.e(qVar);
            this.f39365b = null;
            this.f39364a = f.z();
            Throwable thW = e.this.W();
            if (thW == null) {
                fl.r.a aVar = fl.r.f38769b;
                qVar.resumeWith(fl.r.b(Boolean.FALSE));
            } else {
                fl.r.a aVar2 = fl.r.f38769b;
                qVar.resumeWith(fl.r.b(fl.s.a(thW)));
            }
        }

        @Override // gm.i
        public Object next() throws Throwable {
            Object obj = this.f39364a;
            if (obj == f.f39382p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f39364a = f.f39382p;
            if (obj != f.z()) {
                return obj;
            }
            throw c0.a(e.this.Z());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final /* synthetic */ class b extends kotlin.jvm.internal.p implements Function3 {
        b(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void b(Throwable th2, Object obj, kl.j jVar) {
            ((e) this.receiver).y0(th2, obj, jVar);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((Throwable) obj, obj2, (kl.j) obj3);
            return g0.f38750a;
        }
    }

    public e(int i10, Function1 function1) {
        this.f39361a = i10;
        this.f39362b = function1;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = f.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = U();
        l lVar = new l(0L, null, this, 3);
        this.sendSegment$volatile = lVar;
        this.receiveSegment$volatile = lVar;
        if (s0()) {
            lVar = f.f39367a;
            kotlin.jvm.internal.s.f(lVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = lVar;
        this.f39363c = function1 != null ? new Function3() { // from class: gm.b
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                e eVar = this.f39347a;
                android.support.v4.media.session.b.a(obj);
                return e.F0(eVar, null, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = f.f39385s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(em.o oVar) {
        fl.r.a aVar = fl.r.f38769b;
        oVar.resumeWith(fl.r.b(fl.s.a(Z())));
    }

    private final Object B0(Object obj, kl.f fVar) {
        UndeliveredElementException undeliveredElementExceptionC;
        em.q qVar = new em.q(ll.b.c(fVar), 1);
        qVar.H();
        Function1 function1 = this.f39362b;
        if (function1 == null || (undeliveredElementExceptionC = w.c(function1, obj, null, 2, null)) == null) {
            Throwable thD0 = d0();
            fl.r.a aVar = fl.r.f38769b;
            qVar.resumeWith(fl.r.b(fl.s.a(thD0)));
        } else {
            fl.e.a(undeliveredElementExceptionC, d0());
            fl.r.a aVar2 = fl.r.f38769b;
            qVar.resumeWith(fl.r.b(fl.s.a(undeliveredElementExceptionC)));
        }
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB == ll.b.f() ? objB : g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(Object obj, em.o oVar) {
        Function1 function1 = this.f39362b;
        if (function1 != null) {
            w.a(function1, obj, oVar.getContext());
        }
        Throwable thD0 = d0();
        fl.r.a aVar = fl.r.f38769b;
        oVar.resumeWith(fl.r.b(fl.s.a(thD0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function3 D(final Function1 function1, final Object obj) {
        return new Function3() { // from class: gm.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return e.F(function1, obj, (Throwable) obj2, obj3, (kl.j) obj4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zl.f E(Function1 function1) {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 F(Function1 function1, Object obj, Throwable th2, Object obj2, kl.j jVar) {
        w.a(function1, obj, jVar);
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 F0(final e eVar, final mm.a aVar, Object obj, final Object obj2) {
        return new Function3(obj2, eVar, aVar) { // from class: gm.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f39350a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f39351b;

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return e.G0(this.f39350a, this.f39351b, null, (Throwable) obj3, obj4, (kl.j) obj5);
            }
        };
    }

    private final boolean G(long j10) {
        return j10 < U() || j10 < c0() + ((long) this.f39361a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 G0(Object obj, e eVar, mm.a aVar, Throwable th2, Object obj2, kl.j jVar) {
        if (obj != f.z()) {
            w.a(eVar.f39362b, obj, aVar.getContext());
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(d3 d3Var, l lVar, int i10) {
        E0();
        d3Var.a(lVar, i10);
    }

    private final void I(l lVar, long j10) {
        Object objB = jm.j.b(null, 1, null);
        loop0: while (lVar != null) {
            for (int i10 = f.f39368b - 1; -1 < i10; i10--) {
                if ((lVar.f42636c * ((long) f.f39368b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = lVar.B(i10);
                    if (objB2 != null && objB2 != f.f39371e) {
                        if (!(objB2 instanceof v)) {
                            if (!(objB2 instanceof d3)) {
                                break;
                            }
                            if (lVar.v(i10, objB2, f.z())) {
                                objB = jm.j.c(objB, objB2);
                                lVar.C(i10, true);
                                break;
                            }
                        } else {
                            if (lVar.v(i10, objB2, f.z())) {
                                objB = jm.j.c(objB, ((v) objB2).f39411a);
                                lVar.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (lVar.v(i10, objB2, f.z())) {
                            lVar.t();
                            break;
                        }
                    }
                }
            }
            lVar = (l) lVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                M0((d3) objB);
                return;
            }
            kotlin.jvm.internal.s.f(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                M0((d3) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(d3 d3Var, l lVar, int i10) {
        d3Var.a(lVar, i10 + f.f39368b);
    }

    private final l J() {
        Object obj = f39358j.get(this);
        l lVar = (l) f39356h.get(this);
        if (lVar.f42636c > ((l) obj).f42636c) {
            obj = lVar;
        }
        l lVar2 = (l) f39357i.get(this);
        if (lVar2.f42636c > ((l) obj).f42636c) {
            obj = lVar2;
        }
        return (l) jm.b.b((jm.c) obj);
    }

    static /* synthetic */ Object J0(e eVar, kl.f fVar) throws Throwable {
        l lVar;
        l lVar2 = (l) a0().get(eVar);
        while (!eVar.o0()) {
            long andIncrement = b0().getAndIncrement(eVar);
            int i10 = f.f39368b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (lVar2.f42636c != j10) {
                l lVarR = eVar.R(j10, lVar2);
                if (lVarR == null) {
                    continue;
                } else {
                    lVar = lVarR;
                }
            } else {
                lVar = lVar2;
            }
            e eVar2 = eVar;
            Object objW0 = eVar2.W0(lVar, i11, andIncrement, null);
            if (objW0 == f.f39379m) {
                throw new IllegalStateException("unexpected");
            }
            if (objW0 != f.f39381o) {
                if (objW0 == f.f39380n) {
                    return eVar2.K0(lVar, i11, andIncrement, fVar);
                }
                lVar.c();
                return objW0;
            }
            if (andIncrement < eVar2.g0()) {
                lVar.c();
            }
            eVar = eVar2;
            lVar2 = lVar;
        }
        throw c0.a(eVar.Z());
    }

    private final Object K0(l lVar, int i10, long j10, kl.f fVar) {
        l lVar2;
        em.q qVarB = em.s.b(ll.b.c(fVar));
        try {
            Object objW0 = W0(lVar, i10, j10, qVarB);
            if (objW0 != f.f39379m) {
                zl.f fVarE = null;
                fVarE = null;
                if (objW0 == f.f39381o) {
                    if (j10 < g0()) {
                        lVar.c();
                    }
                    l lVar3 = (l) a0().get(this);
                    while (true) {
                        if (o0()) {
                            A0(qVarB);
                            break;
                        }
                        long andIncrement = b0().getAndIncrement(this);
                        int i11 = f.f39368b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (lVar3.f42636c != j11) {
                            l lVarR = R(j11, lVar3);
                            if (lVarR != null) {
                                lVar2 = lVarR;
                            }
                        } else {
                            lVar2 = lVar3;
                        }
                        objW0 = W0(lVar2, i12, andIncrement, qVarB);
                        l lVar4 = lVar2;
                        if (objW0 == f.f39379m) {
                            em.q qVar = qVarB != null ? qVarB : null;
                            if (qVar == null) {
                                break;
                            }
                            H0(qVar, lVar4, i12);
                            break;
                        }
                        if (objW0 == f.f39381o) {
                            if (andIncrement < g0()) {
                                lVar4.c();
                            }
                            lVar3 = lVar4;
                        } else {
                            if (objW0 == f.f39380n) {
                                throw new IllegalStateException("unexpected");
                            }
                            lVar4.c();
                            Function1 function1 = this.f39362b;
                            if (function1 != null) {
                                fVarE = E(function1);
                            }
                        }
                    }
                } else {
                    lVar.c();
                    Function1 function2 = this.f39362b;
                    if (function2 != null) {
                        fVarE = E(function2);
                    }
                }
                qVarB.p(objW0, (Function3) fVarE);
                break;
            }
            H0(qVarB, lVar, i10);
            Object objB = qVarB.B();
            if (objB == ll.b.f()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objB;
        } catch (Throwable th2) {
            qVarB.Q();
            throw th2;
        }
    }

    private final void L(long j10) {
        L0(M(j10));
    }

    private final void L0(l lVar) {
        Function1 function1 = this.f39362b;
        UndeliveredElementException undeliveredElementExceptionB = null;
        Object objB = jm.j.b(null, 1, null);
        loop0: do {
            for (int i10 = f.f39368b - 1; -1 < i10; i10--) {
                long j10 = (lVar.f42636c * ((long) f.f39368b)) + ((long) i10);
                while (true) {
                    Object objB2 = lVar.B(i10);
                    if (objB2 == f.f39375i) {
                        break loop0;
                    }
                    if (objB2 != f.f39370d) {
                        if (objB2 != f.f39371e && objB2 != null) {
                            if (!(objB2 instanceof d3) && !(objB2 instanceof v)) {
                                if (objB2 != f.f39373g && objB2 != f.f39372f) {
                                    if (objB2 != f.f39373g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j10 < c0()) {
                                    break loop0;
                                }
                                d3 d3Var = objB2 instanceof v ? ((v) objB2).f39411a : (d3) objB2;
                                if (lVar.v(i10, objB2, f.z())) {
                                    if (function1 != null) {
                                        undeliveredElementExceptionB = w.b(function1, lVar.A(i10), undeliveredElementExceptionB);
                                    }
                                    objB = jm.j.c(objB, d3Var);
                                    lVar.w(i10);
                                    lVar.t();
                                    break;
                                }
                            }
                        } else {
                            if (lVar.v(i10, objB2, f.z())) {
                                lVar.t();
                                break;
                            }
                        }
                    } else {
                        if (j10 < c0()) {
                            break loop0;
                        }
                        if (lVar.v(i10, objB2, f.z())) {
                            if (function1 != null) {
                                undeliveredElementExceptionB = w.b(function1, lVar.A(i10), undeliveredElementExceptionB);
                            }
                            lVar.w(i10);
                            lVar.t();
                            break;
                        }
                    }
                }
            }
            lVar = (l) lVar.h();
        } while (lVar != null);
        if (objB != null) {
            if (objB instanceof ArrayList) {
                kotlin.jvm.internal.s.f(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    N0((d3) arrayList.get(size));
                }
            } else {
                N0((d3) objB);
            }
        }
        if (undeliveredElementExceptionB != null) {
            throw undeliveredElementExceptionB;
        }
    }

    private final l M(long j10) {
        l lVarJ = J();
        if (r0()) {
            long jT0 = t0(lVarJ);
            if (jT0 != -1) {
                O(jT0);
            }
        }
        I(lVarJ, j10);
        return lVarJ;
    }

    private final void M0(d3 d3Var) {
        O0(d3Var, true);
    }

    private final void N() {
        y();
    }

    private final void N0(d3 d3Var) {
        O0(d3Var, false);
    }

    private final void O0(d3 d3Var, boolean z10) {
        if (d3Var instanceof em.o) {
            kl.f fVar = (kl.f) d3Var;
            fl.r.a aVar = fl.r.f38769b;
            fVar.resumeWith(fl.r.b(fl.s.a(z10 ? Z() : d0())));
        } else {
            if (d3Var instanceof a) {
                ((a) d3Var).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + d3Var).toString());
        }
    }

    private final void P() {
        if (s0()) {
            return;
        }
        l lVar = (l) f39358j.get(this);
        while (true) {
            long andIncrement = f39354f.getAndIncrement(this);
            int i10 = f.f39368b;
            long j10 = andIncrement / ((long) i10);
            if (g0() <= andIncrement) {
                if (lVar.f42636c < j10 && lVar.f() != null) {
                    x0(j10, lVar);
                }
                k0(this, 0L, 1, null);
                return;
            }
            if (lVar.f42636c != j10) {
                l lVarQ = Q(j10, lVar, andIncrement);
                if (lVarQ == null) {
                    continue;
                } else {
                    lVar = lVarQ;
                }
            }
            if (U0(lVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                k0(this, 0L, 1, null);
                return;
            }
            k0(this, 0L, 1, null);
        }
    }

    static /* synthetic */ Object P0(e eVar, Object obj, kl.f fVar) {
        l lVar;
        l lVar2 = (l) e0().get(eVar);
        while (true) {
            long andIncrement = f0().getAndIncrement(eVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zQ0 = eVar.q0(andIncrement);
            int i10 = f.f39368b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (lVar2.f42636c != j11) {
                l lVarS = eVar.S(j11, lVar2);
                if (lVarS != null) {
                    lVar = lVarS;
                } else if (zQ0) {
                    Object objB0 = eVar.B0(obj, fVar);
                    if (objB0 != ll.b.f()) {
                        break;
                    }
                    return objB0;
                }
            } else {
                lVar = lVar2;
            }
            e eVar2 = eVar;
            Object obj2 = obj;
            int iY0 = eVar2.Y0(lVar, i11, obj2, j10, null, zQ0);
            if (iY0 == 0) {
                lVar.c();
                break;
            }
            if (iY0 != 1) {
                if (iY0 == 2) {
                    if (!zQ0) {
                        break;
                    }
                    lVar.t();
                    Object objB1 = eVar2.B0(obj2, fVar);
                    if (objB1 != ll.b.f()) {
                        break;
                    }
                    return objB1;
                }
                if (iY0 == 3) {
                    Object objQ0 = eVar2.Q0(lVar, i11, obj2, j10, fVar);
                    if (objQ0 != ll.b.f()) {
                        break;
                    }
                    return objQ0;
                }
                if (iY0 == 4) {
                    if (j10 < eVar2.c0()) {
                        lVar.c();
                    }
                    Object objB2 = eVar2.B0(obj2, fVar);
                    if (objB2 != ll.b.f()) {
                        break;
                    }
                    return objB2;
                }
                if (iY0 == 5) {
                    lVar.c();
                }
                eVar = eVar2;
                lVar2 = lVar;
                obj = obj2;
            } else {
                break;
            }
        }
        return g0.f38750a;
    }

    private final l Q(long j10, l lVar, long j11) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39358j;
        tl.o oVar = (tl.o) f.y();
        loop0: while (true) {
            objC = jm.b.c(lVar, j10, oVar);
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
        if (b0.c(objC)) {
            N();
            x0(j10, lVar);
            k0(this, 0L, 1, null);
            return null;
        }
        l lVar2 = (l) b0.b(objC);
        if (lVar2.f42636c <= j10) {
            return lVar2;
        }
        long j12 = lVar2.f42636c;
        int i10 = f.f39368b;
        if (f39354f.compareAndSet(this, j11 + 1, j12 * ((long) i10))) {
            j0((lVar2.f42636c * ((long) i10)) - j11);
        } else {
            k0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    private final Object Q0(l lVar, int i10, Object obj, long j10, kl.f fVar) {
        g0 g0Var;
        Object objB;
        l lVarS;
        em.q qVarB = em.s.b(ll.b.c(fVar));
        try {
            int iY0 = Y0(lVar, i10, obj, j10, qVarB, false);
            if (iY0 == 0) {
                lVar.c();
                fl.r.a aVar = fl.r.f38769b;
                g0Var = g0.f38750a;
            } else {
                if (iY0 != 1) {
                    if (iY0 != 2) {
                        if (iY0 != 4) {
                            String str = "unexpected";
                            if (iY0 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            lVar.c();
                            l lVar2 = (l) e0().get(this);
                            while (true) {
                                long andIncrement = f0().getAndIncrement(this);
                                long j11 = 1152921504606846975L & andIncrement;
                                boolean zQ0 = q0(andIncrement);
                                int i11 = f.f39368b;
                                long j12 = j11 / ((long) i11);
                                int i12 = (int) (j11 % ((long) i11));
                                str = str;
                                if (lVar2.f42636c != j12) {
                                    lVarS = S(j12, lVar2);
                                    if (lVarS == null) {
                                        if (zQ0) {
                                        }
                                    }
                                } else {
                                    lVarS = lVar2;
                                }
                                int iY1 = Y0(lVarS, i12, obj, j11, qVarB, zQ0);
                                if (iY1 == 0) {
                                    lVarS.c();
                                    fl.r.a aVar2 = fl.r.f38769b;
                                    g0Var = g0.f38750a;
                                } else if (iY1 == 1) {
                                    fl.r.a aVar3 = fl.r.f38769b;
                                    g0Var = g0.f38750a;
                                } else if (iY1 == 2) {
                                    if (!zQ0) {
                                        em.q qVar = qVarB != null ? qVarB : null;
                                        if (qVar == null) {
                                            break;
                                        }
                                        I0(qVar, lVarS, i12);
                                        break;
                                    }
                                    lVarS.t();
                                } else {
                                    if (iY1 == 3) {
                                        throw new IllegalStateException(str);
                                    }
                                    if (iY1 != 4) {
                                        if (iY1 == 5) {
                                            lVarS.c();
                                        }
                                        lVar2 = lVarS;
                                    } else if (j11 < c0()) {
                                        lVarS.c();
                                    }
                                }
                            }
                        } else if (j10 < c0()) {
                            lVar.c();
                        }
                        C0(obj, qVarB);
                        break;
                    } else {
                        I0(qVarB, lVar, i10);
                    }
                    objB = qVarB.B();
                    if (objB == ll.b.f()) {
                        kotlin.coroutines.jvm.internal.h.c(fVar);
                    }
                    if (objB == ll.b.f()) {
                        return objB;
                    }
                    return g0.f38750a;
                }
                fl.r.a aVar4 = fl.r.f38769b;
                g0Var = g0.f38750a;
            }
            qVarB.resumeWith(fl.r.b(g0Var));
            objB = qVarB.B();
            if (objB == ll.b.f()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            if (objB == ll.b.f()) {
                return objB;
            }
            return g0.f38750a;
        } catch (Throwable th2) {
            qVarB.Q();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l R(long j10, l lVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39357i;
        tl.o oVar = (tl.o) f.y();
        loop0: while (true) {
            objC = jm.b.c(lVar, j10, oVar);
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
        if (b0.c(objC)) {
            N();
            if (lVar.f42636c * ((long) f.f39368b) < g0()) {
                lVar.c();
            }
            return null;
        }
        l lVar2 = (l) b0.b(objC);
        if (!s0() && j10 <= U() / ((long) f.f39368b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f39358j;
            while (true) {
                a0 a0Var2 = (a0) atomicReferenceFieldUpdater2.get(this);
                if (a0Var2.f42636c >= lVar2.f42636c || !lVar2.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, a0Var2, lVar2)) {
                    if (!a0Var2.p()) {
                        break;
                    }
                    a0Var2.n();
                    break;
                }
                if (lVar2.p()) {
                    lVar2.n();
                }
            }
        }
        long j11 = lVar2.f42636c;
        if (j11 <= j10) {
            return lVar2;
        }
        int i10 = f.f39368b;
        a1(j11 * ((long) i10));
        if (lVar2.f42636c * ((long) i10) < g0()) {
            lVar2.c();
        }
        return null;
    }

    private final boolean R0(long j10) {
        if (q0(j10)) {
            return false;
        }
        return !G(j10 & 1152921504606846975L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l S(long j10, l lVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39356h;
        tl.o oVar = (tl.o) f.y();
        loop0: while (true) {
            objC = jm.b.c(lVar, j10, oVar);
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
        if (b0.c(objC)) {
            N();
            if (lVar.f42636c * ((long) f.f39368b) < c0()) {
                lVar.c();
            }
            return null;
        }
        l lVar2 = (l) b0.b(objC);
        long j11 = lVar2.f42636c;
        if (j11 <= j10) {
            return lVar2;
        }
        int i10 = f.f39368b;
        b1(j11 * ((long) i10));
        if (lVar2.f42636c * ((long) i10) < c0()) {
            lVar2.c();
        }
        return null;
    }

    private final boolean S0(Object obj, Object obj2) {
        if (obj instanceof a) {
            kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof em.o) {
            kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            em.o oVar = (em.o) obj;
            Function1 function1 = this.f39362b;
            return f.B(oVar, obj2, (Function3) (function1 != null ? E(function1) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final long U() {
        return f39354f.get(this);
    }

    private final boolean U0(l lVar, int i10, long j10) {
        Object objB = lVar.B(i10);
        if (!(objB instanceof d3) || j10 < f39353e.get(this) || !lVar.v(i10, objB, f.f39373g)) {
            return V0(lVar, i10, j10);
        }
        if (T0(objB, lVar, i10)) {
            lVar.F(i10, f.f39370d);
            return true;
        }
        lVar.F(i10, f.f39376j);
        lVar.C(i10, false);
        return false;
    }

    private final boolean V0(l lVar, int i10, long j10) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB instanceof d3) {
                if (j10 < f39353e.get(this)) {
                    if (lVar.v(i10, objB, new v((d3) objB))) {
                        return true;
                    }
                } else if (lVar.v(i10, objB, f.f39373g)) {
                    if (T0(objB, lVar, i10)) {
                        lVar.F(i10, f.f39370d);
                        return true;
                    }
                    lVar.F(i10, f.f39376j);
                    lVar.C(i10, false);
                    return false;
                }
            } else {
                if (objB == f.f39376j) {
                    return false;
                }
                if (objB == null) {
                    if (lVar.v(i10, objB, f.f39371e)) {
                        return true;
                    }
                } else {
                    if (objB == f.f39370d || objB == f.f39374h || objB == f.f39375i || objB == f.f39377k || objB == f.z()) {
                        return true;
                    }
                    if (objB != f.f39372f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W0(l lVar, int i10, long j10, Object obj) {
        Object objB = lVar.B(i10);
        if (objB == null) {
            if (j10 >= (f39352d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f39380n;
                }
                if (lVar.v(i10, objB, obj)) {
                    P();
                    return f.f39379m;
                }
            }
        } else if (objB == f.f39370d && lVar.v(i10, objB, f.f39375i)) {
            P();
            return lVar.D(i10);
        }
        return X0(lVar, i10, j10, obj);
    }

    private final Object X0(l lVar, int i10, long j10, Object obj) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB == null || objB == f.f39371e) {
                if (j10 < (f39352d.get(this) & 1152921504606846975L)) {
                    if (lVar.v(i10, objB, f.f39374h)) {
                        P();
                        return f.f39381o;
                    }
                } else {
                    if (obj == null) {
                        return f.f39380n;
                    }
                    if (lVar.v(i10, objB, obj)) {
                        P();
                        return f.f39379m;
                    }
                }
            } else {
                if (objB != f.f39370d) {
                    if (objB != f.f39376j && objB != f.f39374h) {
                        if (objB == f.z()) {
                            P();
                            return f.f39381o;
                        }
                        if (objB != f.f39373g && lVar.v(i10, objB, f.f39372f)) {
                            boolean z10 = objB instanceof v;
                            if (z10) {
                                objB = ((v) objB).f39411a;
                            }
                            if (T0(objB, lVar, i10)) {
                                lVar.F(i10, f.f39375i);
                                P();
                                return lVar.D(i10);
                            }
                            lVar.F(i10, f.f39376j);
                            lVar.C(i10, false);
                            if (z10) {
                                P();
                            }
                            return f.f39381o;
                        }
                    }
                    return f.f39381o;
                }
                if (lVar.v(i10, objB, f.f39375i)) {
                    P();
                    return lVar.D(i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Y0(l lVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        lVar.G(i10, obj);
        if (z10) {
            return Z0(lVar, i10, obj, j10, obj2, z10);
        }
        Object objB = lVar.B(i10);
        if (objB == null) {
            if (G(j10)) {
                if (lVar.v(i10, null, f.f39370d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (lVar.v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objB instanceof d3) {
            lVar.w(i10);
            if (S0(objB, obj)) {
                lVar.F(i10, f.f39375i);
                D0();
                return 0;
            }
            if (lVar.x(i10, f.f39377k) == f.f39377k) {
                return 5;
            }
            lVar.C(i10, true);
            return 5;
        }
        return Z0(lVar, i10, obj, j10, obj2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable Z() {
        Throwable thW = W();
        return thW == null ? new ClosedReceiveChannelException("Channel was closed") : thW;
    }

    private final int Z0(l lVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB == null) {
                if (!G(j10) || z10) {
                    if (z10) {
                        if (lVar.v(i10, null, f.f39376j)) {
                            lVar.C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (lVar.v(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (lVar.v(i10, null, f.f39370d)) {
                    return 1;
                }
            } else {
                if (objB != f.f39371e) {
                    if (objB == f.f39377k) {
                        lVar.w(i10);
                        return 5;
                    }
                    if (objB == f.f39374h) {
                        lVar.w(i10);
                        return 5;
                    }
                    if (objB == f.z()) {
                        lVar.w(i10);
                        N();
                        return 4;
                    }
                    lVar.w(i10);
                    if (objB instanceof v) {
                        objB = ((v) objB).f39411a;
                    }
                    if (S0(objB, obj)) {
                        lVar.F(i10, f.f39375i);
                        D0();
                        return 0;
                    }
                    if (lVar.x(i10, f.f39377k) != f.f39377k) {
                        lVar.C(i10, true);
                    }
                    return 5;
                }
                if (lVar.v(i10, objB, f.f39370d)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater a0() {
        return f39357i;
    }

    private final void a1(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39353e;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            long j12 = j10;
            if (f39353e.compareAndSet(this, j11, j12)) {
                return;
            } else {
                j10 = j12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater b0() {
        return f39353e;
    }

    private final void b1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39352d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f39352d.compareAndSet(this, j11, f.w(j12, (int) (j11 >> 60))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater e0() {
        return f39356h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater f0() {
        return f39352d;
    }

    private final void j0(long j10) {
        if ((f39355g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((f39355g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void k0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.j0(j10);
    }

    private final void l0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39360l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f.f39383q : f.f39384r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(W());
    }

    private final boolean m0(l lVar, int i10, long j10) {
        Object objB;
        do {
            objB = lVar.B(i10);
            if (objB != null && objB != f.f39371e) {
                if (objB == f.f39370d) {
                    return true;
                }
                if (objB == f.f39376j || objB == f.z() || objB == f.f39375i || objB == f.f39374h) {
                    return false;
                }
                if (objB == f.f39373g) {
                    return true;
                }
                return objB != f.f39372f && j10 == c0();
            }
        } while (!lVar.v(i10, objB, f.f39374h));
        P();
        return false;
    }

    private final boolean n0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            M(j10 & 1152921504606846975L);
            return (z10 && i0()) ? false : true;
        }
        if (i10 == 3) {
            L(j10 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    private final boolean p0(long j10) {
        return n0(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q0(long j10) {
        return n0(j10, false);
    }

    private final boolean s0() {
        long jU = U();
        return jU == 0 || jU == Long.MAX_VALUE;
    }

    private final long t0(l lVar) {
        do {
            int i10 = f.f39368b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (lVar.f42636c * ((long) f.f39368b)) + ((long) i10);
                    if (j10 >= c0()) {
                        while (true) {
                            Object objB = lVar.B(i10);
                            if (objB != null && objB != f.f39371e) {
                                if (objB != f.f39370d) {
                                    break;
                                }
                                return j10;
                            }
                            if (lVar.v(i10, objB, f.z())) {
                                lVar.t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lVar = (l) lVar.h();
        } while (lVar != null);
        return -1L;
    }

    private final void u0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39352d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 1)));
    }

    private final void v0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39352d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 3)));
    }

    private final void w0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39352d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = f.w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = f.w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    private final void x0(long j10, l lVar) {
        l lVar2;
        l lVar3;
        while (lVar.f42636c < j10 && (lVar3 = (l) lVar.f()) != null) {
            lVar = lVar3;
        }
        while (true) {
            if (!lVar.k() || (lVar2 = (l) lVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39358j;
                while (true) {
                    a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
                    if (a0Var.f42636c >= lVar.f42636c) {
                        return;
                    }
                    if (!lVar.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a0Var, lVar)) {
                        if (a0Var.p()) {
                            a0Var.n();
                            return;
                        }
                        return;
                    } else if (lVar.p()) {
                        lVar.n();
                    }
                }
            } else {
                lVar = lVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(Throwable th2, Object obj, kl.j jVar) {
        Function1 function1 = this.f39362b;
        kotlin.jvm.internal.s.e(function1);
        w.a(function1, obj, jVar);
    }

    protected void D0() {
    }

    protected void E0() {
    }

    public boolean H(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return K(th2, true);
    }

    protected boolean K(Throwable th2, boolean z10) {
        if (z10) {
            u0();
        }
        boolean zA = androidx.concurrent.futures.b.a(f39359k, this, f.f39385s, th2);
        if (z10) {
            v0();
        } else {
            w0();
        }
        N();
        z0();
        if (zA) {
            l0();
        }
        return zA;
    }

    protected final void O(long j10) {
        l lVarR;
        UndeliveredElementException undeliveredElementExceptionC;
        l lVar = (l) f39357i.get(this);
        while (true) {
            long j11 = f39353e.get(this);
            if (j10 < Math.max(((long) this.f39361a) + j11, U())) {
                return;
            }
            if (f39353e.compareAndSet(this, j11, 1 + j11)) {
                int i10 = f.f39368b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (lVar.f42636c != j12) {
                    lVarR = R(j12, lVar);
                    if (lVarR == null) {
                        continue;
                    }
                } else {
                    lVarR = lVar;
                }
                Object objW0 = W0(lVarR, i11, j11, null);
                if (objW0 != f.f39381o) {
                    lVarR.c();
                    Function1 function1 = this.f39362b;
                    if (function1 != null && (undeliveredElementExceptionC = w.c(function1, objW0, null, 2, null)) != null) {
                        throw undeliveredElementExceptionC;
                    }
                } else if (j11 < g0()) {
                    lVarR.c();
                }
                lVar = lVarR;
            }
        }
    }

    protected final Throwable W() {
        return (Throwable) f39359k.get(this);
    }

    @Override // gm.t
    public final void a(CancellationException cancellationException) {
        H(cancellationException);
    }

    @Override // gm.t
    public Object b(kl.f fVar) {
        return J0(this, fVar);
    }

    public final long c0() {
        return f39353e.get(this);
    }

    public final void c1(long j10) {
        e eVar = this;
        if (eVar.s0()) {
            return;
        }
        while (eVar.U() <= j10) {
            eVar = this;
        }
        int i10 = f.f39369c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jU = eVar.U();
            if (jU == (4611686018427387903L & f39355g.get(eVar)) && jU == eVar.U()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39355g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(eVar);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j11, f.v(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long jU2 = eVar.U();
            long j12 = f39355g.get(eVar);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (jU2 == j13 && jU2 == eVar.U()) {
                break;
            }
            if (z10) {
                eVar = this;
            } else {
                eVar = this;
                f39355g.compareAndSet(eVar, j12, f.v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f39355g;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(eVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(eVar, j14, f.v(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            eVar = this;
        }
    }

    @Override // gm.u
    public void d(Function1 function1) {
        if (androidx.concurrent.futures.b.a(f39360l, this, null, function1)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39360l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != f.f39383q) {
                if (obj == f.f39384r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f39360l, this, f.f39383q, f.f39384r));
        function1.invoke(W());
    }

    protected final Throwable d0() {
        Throwable thW = W();
        return thW == null ? new ClosedSendChannelException("Channel was closed") : thW;
    }

    @Override // gm.u
    public Object e(Object obj) {
        l lVar;
        if (R0(f39352d.get(this))) {
            return k.f39391b.b();
        }
        Object obj2 = f.f39376j;
        l lVar2 = (l) e0().get(this);
        while (true) {
            long andIncrement = f0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zQ0 = q0(andIncrement);
            int i10 = f.f39368b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (lVar2.f42636c != j11) {
                l lVarS = S(j11, lVar2);
                if (lVarS != null) {
                    lVar = lVarS;
                } else if (zQ0) {
                    return k.f39391b.a(d0());
                }
            } else {
                lVar = lVar2;
            }
            int iY0 = Y0(lVar, i11, obj, j10, obj2, zQ0);
            lVar2 = lVar;
            if (iY0 == 0) {
                lVar2.c();
                return k.f39391b.c(g0.f38750a);
            }
            if (iY0 == 1) {
                return k.f39391b.c(g0.f38750a);
            }
            if (iY0 == 2) {
                if (zQ0) {
                    lVar2.t();
                    return k.f39391b.a(d0());
                }
                d3 d3Var = obj2 instanceof d3 ? (d3) obj2 : null;
                if (d3Var != null) {
                    I0(d3Var, lVar2, i11);
                }
                lVar2.t();
                return k.f39391b.b();
            }
            if (iY0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iY0 == 4) {
                if (j10 < c0()) {
                    lVar2.c();
                }
                return k.f39391b.a(d0());
            }
            if (iY0 == 5) {
                lVar2.c();
            }
            obj = obj;
        }
    }

    @Override // gm.t
    public Object g() {
        l lVarR;
        long j10 = f39353e.get(this);
        long j11 = f39352d.get(this);
        if (p0(j11)) {
            return k.f39391b.a(W());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.f39391b.b();
        }
        Object obj = f.f39377k;
        l lVar = (l) a0().get(this);
        while (!o0()) {
            long andIncrement = b0().getAndIncrement(this);
            int i10 = f.f39368b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (lVar.f42636c != j12) {
                lVarR = R(j12, lVar);
                if (lVarR == null) {
                    continue;
                }
            } else {
                lVarR = lVar;
            }
            Object objW0 = W0(lVarR, i11, andIncrement, obj);
            if (objW0 == f.f39379m) {
                d3 d3Var = obj instanceof d3 ? (d3) obj : null;
                if (d3Var != null) {
                    H0(d3Var, lVarR, i11);
                }
                c1(andIncrement);
                lVarR.t();
                return k.f39391b.b();
            }
            if (objW0 != f.f39381o) {
                if (objW0 == f.f39380n) {
                    throw new IllegalStateException("unexpected");
                }
                lVarR.c();
                return k.f39391b.c(objW0);
            }
            if (andIncrement < g0()) {
                lVarR.c();
            }
            lVar = lVarR;
        }
        return k.f39391b.a(W());
    }

    public final long g0() {
        return f39352d.get(this) & 1152921504606846975L;
    }

    public final boolean i0() {
        while (true) {
            l lVarR = (l) f39357i.get(this);
            long jC0 = c0();
            if (g0() <= jC0) {
                return false;
            }
            int i10 = f.f39368b;
            long j10 = jC0 / ((long) i10);
            if (lVarR.f42636c == j10 || (lVarR = R(j10, lVarR)) != null) {
                lVarR.c();
                if (m0(lVarR, (int) (jC0 % ((long) i10)), jC0)) {
                    return true;
                }
                f39353e.compareAndSet(this, jC0, 1 + jC0);
            } else if (((l) f39357i.get(this)).f42636c < j10) {
                return false;
            }
        }
    }

    @Override // gm.t
    public i iterator() {
        return new a();
    }

    @Override // gm.u
    public Object o(Object obj, kl.f fVar) {
        return P0(this, obj, fVar);
    }

    public boolean o0() {
        return p0(f39352d.get(this));
    }

    protected boolean r0() {
        return false;
    }

    @Override // gm.u
    public boolean w(Throwable th2) {
        return K(th2, false);
    }

    @Override // gm.u
    public boolean y() {
        return q0(f39352d.get(this));
    }

    protected void z0() {
    }

    private final boolean T0(Object obj, l lVar, int i10) {
        if (obj instanceof em.o) {
            kotlin.jvm.internal.s.f(obj, SVWsZyNSAChGIA.uiZ);
            return f.C((em.o) obj, g0.f38750a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f39352d.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f39361a + ',');
        sb2.append("data=[");
        int i11 = 0;
        boolean z10 = true;
        List listO = gl.r.o(f39357i.get(this), f39356h.get(this), f39358j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((l) obj) != f.f39367a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((l) next).f42636c;
            do {
                Object next2 = it.next();
                long j11 = ((l) next2).f42636c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        l lVar = (l) next;
        long jC0 = c0();
        long jG0 = g0();
        loop2: while (true) {
            int i12 = f.f39368b;
            int i13 = i11;
            while (i13 < i12) {
                long j12 = (lVar.f42636c * ((long) f.f39368b)) + ((long) i13);
                if (j12 >= jG0 && j12 >= jC0) {
                    break loop2;
                }
                Object objB = lVar.B(i13);
                Object objA = lVar.A(i13);
                boolean z11 = z10;
                if (objB instanceof em.o) {
                    string = (jG0 > j12 || j12 >= jC0) ? (jC0 > j12 || j12 >= jG0) ? "cont" : "send" : KPtaxpyICj.vrgYLdsQYX;
                } else if (objB instanceof v) {
                    string = "EB(" + objB + ')';
                } else if (kotlin.jvm.internal.s.c(objB, f.f39372f) || kotlin.jvm.internal.s.c(objB, f.f39373g)) {
                    string = "resuming_sender";
                } else {
                    if (objB != null && !kotlin.jvm.internal.s.c(objB, f.f39371e) && !kotlin.jvm.internal.s.c(objB, f.f39375i) && !kotlin.jvm.internal.s.c(objB, f.f39374h) && !kotlin.jvm.internal.s.c(objB, f.f39377k) && !kotlin.jvm.internal.s.c(objB, f.f39376j) && !kotlin.jvm.internal.s.c(objB, f.z())) {
                        string = objB.toString();
                    }
                    i13++;
                    z10 = z11;
                }
                if (objA != null) {
                    sb2.append('(' + string + ',' + objA + "),");
                } else {
                    sb2.append(string + ',');
                }
                i13++;
                z10 = z11;
            }
            boolean z12 = z10;
            lVar = (l) lVar.f();
            if (lVar == null) {
                break;
            }
            z10 = z12;
            i11 = 0;
        }
        if (bm.r.b1(sb2) == ',') {
            kotlin.jvm.internal.s.g(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }
}
