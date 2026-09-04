package hm;

import em.e1;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a0 extends im.a implements v, e, im.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f40474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final gm.a f40475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f40476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f40477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f40478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f40480l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f40481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f40482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f40483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final kl.f f40484d;

        public a(a0 a0Var, long j10, Object obj, kl.f fVar) {
            this.f40481a = a0Var;
            this.f40482b = j10;
            this.f40483c = obj;
            this.f40484d = fVar;
        }

        @Override // em.e1
        public void d() {
            this.f40481a.z(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40485a;

        static {
            int[] iArr = new int[gm.a.values().length];
            try {
                iArr[gm.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gm.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gm.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40485a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40486r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f40487s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f40488t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f40489u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f40490v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f40491w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f40493y;

        c(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40491w = obj;
            this.f40493y |= Integer.MIN_VALUE;
            return a0.B(a0.this, null, this);
        }
    }

    public a0(int i10, int i11, gm.a aVar) {
        this.f40473e = i10;
        this.f40474f = i11;
        this.f40475g = aVar;
    }

    private final void A() {
        if (this.f40474f != 0 || this.f40480l > 1) {
            Object[] objArr = this.f40476h;
            kotlin.jvm.internal.s.e(objArr);
            while (this.f40480l > 0 && b0.f(objArr, (L() + ((long) Q())) - 1) == b0.f40499a) {
                this.f40480l--;
                b0.g(objArr, L() + ((long) Q()), null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00b3, B:39:0x00b6, B:22:0x005d), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00b3, B:39:0x00b6, B:22:0x005d), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [hm.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [im.a] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [hm.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [hm.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [im.c] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [hm.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [hm.c0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ca -> B:16:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object B(hm.a0 r8, hm.f r9, kl.f r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.a0.B(hm.a0, hm.f, kl.f):java.lang.Object");
    }

    private final void C(long j10) {
        im.c[] cVarArr;
        if (((im.a) this).f41481b != 0 && (cVarArr = ((im.a) this).f41480a) != null) {
            for (im.c cVar : cVarArr) {
                if (cVar != null) {
                    c0 c0Var = (c0) cVar;
                    long j11 = c0Var.f40501a;
                    if (0 <= j11 && j11 < j10) {
                        c0Var.f40501a = j10;
                    }
                }
            }
        }
        this.f40478j = j10;
    }

    private final void F() {
        Object[] objArr = this.f40476h;
        kotlin.jvm.internal.s.e(objArr);
        b0.g(objArr, L(), null);
        this.f40479k--;
        long jL = L() + 1;
        if (this.f40477i < jL) {
            this.f40477i = jL;
        }
        if (this.f40478j < jL) {
            C(jL);
        }
    }

    static /* synthetic */ Object G(a0 a0Var, Object obj, kl.f fVar) throws Throwable {
        if (a0Var.b(obj)) {
            return fl.g0.f38750a;
        }
        Object objH = a0Var.H(obj, fVar);
        return objH == ll.b.f() ? objH : fl.g0.f38750a;
    }

    private final Object H(Object obj, kl.f fVar) throws Throwable {
        Throwable th2;
        kl.f[] fVarArrJ;
        a aVar;
        em.q qVar = new em.q(ll.b.c(fVar), 1);
        qVar.H();
        kl.f[] fVarArrJ2 = im.b.f41484a;
        synchronized (this) {
            try {
                if (S(obj)) {
                    try {
                        fl.r.a aVar2 = fl.r.f38769b;
                        qVar.resumeWith(fl.r.b(fl.g0.f38750a));
                        fVarArrJ = J(fVarArrJ2);
                        aVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        aVar = new a(this, L() + ((long) Q()), obj, qVar);
                        I(aVar);
                        this.f40480l++;
                        if (this.f40474f == 0) {
                            fVarArrJ2 = J(fVarArrJ2);
                        }
                        fVarArrJ = fVarArrJ2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    em.s.a(qVar, aVar);
                }
                for (kl.f fVar2 : fVarArrJ) {
                    if (fVar2 != null) {
                        fl.r.a aVar3 = fl.r.f38769b;
                        fVar2.resumeWith(fl.r.b(fl.g0.f38750a));
                    }
                }
                Object objB = qVar.B();
                if (objB == ll.b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(fVar);
                }
                return objB == ll.b.f() ? objB : fl.g0.f38750a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(Object obj) {
        int iQ = Q();
        Object[] objArrR = this.f40476h;
        if (objArrR == null) {
            objArrR = R(null, 0, 2);
        } else if (iQ >= objArrR.length) {
            objArrR = R(objArrR, iQ, objArrR.length * 2);
        }
        b0.g(objArrR, L() + ((long) iQ), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kl.f[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final kl.f[] J(kl.f[] fVarArr) {
        im.c[] cVarArr;
        c0 c0Var;
        kl.f fVar;
        int length = fVarArr.length;
        if (((im.a) this).f41481b != 0 && (cVarArr = ((im.a) this).f41480a) != null) {
            int length2 = cVarArr.length;
            int i10 = 0;
            while (i10 < length2) {
                im.c cVar = cVarArr[i10];
                if (cVar == null || (fVar = (c0Var = (c0) cVar).f40502b) == null || U(c0Var) < 0) {
                    fVarArr = fVarArr;
                } else {
                    if (length >= fVarArr.length) {
                        fVarArr = fVarArr;
                        fVarArr = fVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) fVarArr, Math.max(2, fVarArr.length * 2));
                        kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
                        fVarArr = objArrCopyOf;
                    }
                    fVarArr = fVarArr;
                    fVarArr = fVarArr;
                    ((kl.f[]) fVarArr)[length] = fVar;
                    c0Var.f40502b = null;
                    length++;
                }
                i10++;
                fVarArr = fVarArr;
            }
            fVarArr = fVarArr;
        }
        return (kl.f[]) fVarArr;
    }

    private final long K() {
        return L() + ((long) this.f40479k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long L() {
        return Math.min(this.f40478j, this.f40477i);
    }

    private final Object N(long j10) {
        Object[] objArr = this.f40476h;
        kotlin.jvm.internal.s.e(objArr);
        Object objF = b0.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f40483c : objF;
    }

    private final long O() {
        return L() + ((long) this.f40479k) + ((long) this.f40480l);
    }

    private final int P() {
        return (int) ((L() + ((long) this.f40479k)) - this.f40477i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q() {
        return this.f40479k + this.f40480l;
    }

    private final Object[] R(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f40476h = objArr2;
        if (objArr != null) {
            long jL = L();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jL;
                b0.g(objArr2, j10, b0.f(objArr, j10));
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S(Object obj) {
        if (m() == 0) {
            return T(obj);
        }
        if (this.f40479k >= this.f40474f && this.f40478j <= this.f40477i) {
            int i10 = b.f40485a[this.f40475g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        I(obj);
        int i11 = this.f40479k + 1;
        this.f40479k = i11;
        if (i11 > this.f40474f) {
            F();
        }
        if (P() > this.f40473e) {
            W(this.f40477i + 1, this.f40478j, K(), O());
        }
        return true;
    }

    private final boolean T(Object obj) {
        if (this.f40473e == 0) {
            return true;
        }
        I(obj);
        int i10 = this.f40479k + 1;
        this.f40479k = i10;
        if (i10 > this.f40473e) {
            F();
        }
        this.f40478j = L() + ((long) this.f40479k);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long U(c0 c0Var) {
        long j10 = c0Var.f40501a;
        if (j10 >= K() && (this.f40474f > 0 || j10 > L() || this.f40480l == 0)) {
            return -1L;
        }
        return j10;
    }

    private final Object V(c0 c0Var) {
        Object obj;
        kl.f[] fVarArrX = im.b.f41484a;
        synchronized (this) {
            try {
                long jU = U(c0Var);
                if (jU < 0) {
                    obj = b0.f40499a;
                } else {
                    long j10 = c0Var.f40501a;
                    Object objN = N(jU);
                    c0Var.f40501a = jU + 1;
                    fVarArrX = X(j10);
                    obj = objN;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (kl.f fVar : fVarArrX) {
            if (fVar != null) {
                fl.r.a aVar = fl.r.f38769b;
                fVar.resumeWith(fl.r.b(fl.g0.f38750a));
            }
        }
        return obj;
    }

    private final void W(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jL = L(); jL < jMin; jL++) {
            Object[] objArr = this.f40476h;
            kotlin.jvm.internal.s.e(objArr);
            b0.g(objArr, jL, null);
        }
        this.f40477i = j10;
        this.f40478j = j11;
        this.f40479k = (int) (j12 - jMin);
        this.f40480l = (int) (j13 - j12);
    }

    private final Object y(c0 c0Var, kl.f fVar) {
        em.q qVar = new em.q(ll.b.c(fVar), 1);
        qVar.H();
        synchronized (this) {
            try {
                if (U(c0Var) < 0) {
                    c0Var.f40502b = qVar;
                } else {
                    fl.r.a aVar = fl.r.f38769b;
                    qVar.resumeWith(fl.r.b(fl.g0.f38750a));
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB == ll.b.f() ? objB : fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f40482b >= L()) {
                    Object[] objArr = this.f40476h;
                    kotlin.jvm.internal.s.e(objArr);
                    if (b0.f(objArr, aVar.f40482b) == aVar) {
                        b0.g(objArr, aVar.f40482b, b0.f40499a);
                        A();
                    }
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c0 i() {
        return new c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public c0[] k(int i10) {
        return new c0[i10];
    }

    protected final Object M() {
        Object[] objArr = this.f40476h;
        kotlin.jvm.internal.s.e(objArr);
        return b0.f(objArr, (this.f40477i + ((long) P())) - 1);
    }

    public final kl.f[] X(long j10) {
        long j11;
        long j12;
        kl.f[] fVarArr;
        kl.f[] fVarArr2;
        im.c[] cVarArr;
        if (j10 > this.f40478j) {
            return im.b.f41484a;
        }
        long jL = L();
        long j13 = ((long) this.f40479k) + jL;
        if (this.f40474f == 0 && this.f40480l > 0) {
            j13++;
        }
        if (((im.a) this).f41481b != 0 && (cVarArr = ((im.a) this).f41480a) != null) {
            for (im.c cVar : cVarArr) {
                if (cVar != null) {
                    long j14 = ((c0) cVar).f40501a;
                    if (0 <= j14 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.f40478j) {
            return im.b.f41484a;
        }
        long jK = K();
        int iMin = m() > 0 ? Math.min(this.f40480l, this.f40474f - ((int) (jK - j13))) : this.f40480l;
        kl.f[] fVarArr3 = im.b.f41484a;
        long j15 = ((long) this.f40480l) + jK;
        if (iMin > 0) {
            kl.f[] fVarArr4 = new kl.f[iMin];
            Object[] objArr = this.f40476h;
            kotlin.jvm.internal.s.e(objArr);
            j12 = 1;
            long j16 = jK;
            int i10 = 0;
            while (true) {
                if (jK >= j15) {
                    j11 = j13;
                    fVarArr2 = fVarArr4;
                    break;
                }
                Object objF = b0.f(objArr, jK);
                j11 = j13;
                jm.d0 d0Var = b0.f40499a;
                if (objF != d0Var) {
                    kotlin.jvm.internal.s.f(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    fVarArr2 = fVarArr4;
                    fVarArr2[i10] = aVar.f40484d;
                    b0.g(objArr, jK, d0Var);
                    b0.g(objArr, j16, aVar.f40483c);
                    j16++;
                    if (i11 >= iMin) {
                        break;
                    }
                    i10 = i11;
                } else {
                    fVarArr2 = fVarArr4;
                }
                jK++;
                j13 = j11;
                fVarArr4 = fVarArr2;
            }
            jK = j16;
            fVarArr = fVarArr2;
        } else {
            j11 = j13;
            j12 = 1;
            fVarArr = fVarArr3;
        }
        long jMax = Math.max(this.f40477i, Math.max(jL, jK - ((long) this.f40473e)));
        if (this.f40474f == 0 && jMax < j15) {
            Object[] objArr2 = this.f40476h;
            kotlin.jvm.internal.s.e(objArr2);
            if (kotlin.jvm.internal.s.c(b0.f(objArr2, jMax), b0.f40499a)) {
                jK += j12;
                jMax += j12;
            }
        }
        long j17 = jK;
        W(jMax, m() == 0 ? j17 : j11, j17, j15);
        A();
        return !(fVarArr.length == 0) ? J(fVarArr) : fVarArr;
    }

    public final long Y() {
        long j10 = this.f40477i;
        if (j10 < this.f40478j) {
            this.f40478j = j10;
        }
        return j10;
    }

    @Override // im.k
    public e a(kl.j jVar, int i10, gm.a aVar) {
        return b0.e(this, jVar, i10, aVar);
    }

    @Override // hm.v
    public boolean b(Object obj) {
        int i10;
        boolean z10;
        kl.f[] fVarArrJ = im.b.f41484a;
        synchronized (this) {
            if (S(obj)) {
                fVarArrJ = J(fVarArrJ);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (kl.f fVar : fVarArrJ) {
            if (fVar != null) {
                fl.r.a aVar = fl.r.f38769b;
                fVar.resumeWith(fl.r.b(fl.g0.f38750a));
            }
        }
        return z10;
    }

    @Override // hm.z, hm.e
    public Object collect(f fVar, kl.f fVar2) {
        return B(this, fVar, fVar2);
    }

    @Override // hm.v, hm.f
    public Object emit(Object obj, kl.f fVar) {
        return G(this, obj, fVar);
    }

    @Override // hm.v
    public void j() throws Throwable {
        synchronized (this) {
            try {
                try {
                    W(K(), this.f40478j, K(), O());
                    fl.g0 g0Var = fl.g0.f38750a;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
