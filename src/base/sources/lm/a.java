package lm;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import em.s0;
import fl.g0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jm.d0;
import jm.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0681a f44651h = new C0681a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f44652i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f44653j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44654k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d0 f44655l = new d0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44658c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm.d f44660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lm.d f44661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f44662g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: lm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0681a {
        public /* synthetic */ C0681a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0681a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44663a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f44663a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ ml.a f44679g = ml.b.a(d());
    }

    public a(int i10, int i11, long j10, String str) {
        this.f44656a = i10;
        this.f44657b = i11;
        this.f44658c = j10;
        this.f44659d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f44660e = new lm.d();
            this.f44661f = new lm.d();
            this.f44662g = new y((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    private final void N0(long j10) {
        if (X0() || V0(j10)) {
            return;
        }
        X0();
    }

    private final h U0(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f44667c) == d.TERMINATED) {
            return hVar;
        }
        if (!hVar.f44690b && dVar == d.BLOCKING) {
            return hVar;
        }
        cVar.f44671g = true;
        return cVar.f44665a.a(hVar, z10);
    }

    private final boolean V0(long j10) {
        if (yl.g.d(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f44656a) {
            int iK = k();
            if (iK == 1 && this.f44656a > 1) {
                k();
            }
            if (iK > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean W0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f44653j.get(aVar);
        }
        return aVar.V0(j10);
    }

    private final boolean X0() {
        c cVarI0;
        do {
            cVarI0 = i0();
            if (cVarI0 == null) {
                return false;
            }
        } while (!c.f44664i.compareAndSet(cVarI0, -1, 0));
        LockSupport.unpark(cVarI0);
        return true;
    }

    private final int g0(c cVar) {
        Object objG = cVar.g();
        while (objG != f44655l) {
            if (objG == null) {
                return 0;
            }
            c cVar2 = (c) objG;
            int iF = cVar2.f();
            if (iF != 0) {
                return iF;
            }
            objG = cVar2.g();
        }
        return -1;
    }

    private final boolean i(h hVar) {
        return hVar.f44690b ? this.f44661f.a(hVar) : this.f44660e.a(hVar);
    }

    private final c i0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44652i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f44662g.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j10) & (-2097152);
            int iG0 = g0(cVar);
            if (iG0 >= 0 && f44652i.compareAndSet(this, j10, ((long) iG0) | j11)) {
                cVar.o(f44655l);
                return cVar;
            }
        }
    }

    private final int k() {
        synchronized (this.f44662g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f44653j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iD = yl.g.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iD >= this.f44656a) {
                    return 0;
                }
                if (i10 >= this.f44657b) {
                    return 0;
                }
                int i11 = ((int) (t().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f44662g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f44662g.c(i11, cVar);
                if (i11 != ((int) (2097151 & f44653j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iD + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final c q() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !s.c(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void s(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.r(runnable, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater t() {
        return f44653j;
    }

    public final void F0(h hVar) {
        try {
            hVar.run();
            em.c.a();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                em.c.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void K0(long j10) throws InterruptedException {
        int i10;
        h hVarE;
        if (f44654k.compareAndSet(this, 0, 1)) {
            c cVarQ = q();
            synchronized (this.f44662g) {
                i10 = (int) (t().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objB = this.f44662g.b(i11);
                    s.e(objB);
                    c cVar = (c) objB;
                    if (cVar != cVarQ) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f44665a.j(this.f44661f);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f44661f.b();
            this.f44660e.b();
            while (true) {
                if (cVarQ == null) {
                    hVarE = (h) this.f44660e.e();
                    if (hVarE == null && (hVarE = (h) this.f44661f.e()) == null) {
                        break;
                    }
                } else {
                    hVarE = cVarQ.e(true);
                    if (hVarE == null) {
                        hVarE = (h) this.f44660e.e();
                        if (hVarE == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                F0(hVarE);
            }
            if (cVarQ != null) {
                cVarQ.r(d.TERMINATED);
            }
            f44652i.set(this, 0L);
            f44653j.set(this, 0L);
        }
    }

    public final void T0() {
        if (X0() || W0(this, 0L, 1, null)) {
            return;
        }
        X0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        K0(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        s(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return f44654k.get(this) == 1;
    }

    public final h l(Runnable runnable, boolean z10) {
        long jA = j.f44697f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z10);
        }
        h hVar = (h) runnable;
        hVar.f44689a = jA;
        hVar.f44690b = z10;
        return hVar;
    }

    public final boolean m0(c cVar) {
        long j10;
        long j11;
        int iF;
        if (cVar.g() != f44655l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44652i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j10) & (-2097152);
            iF = cVar.f();
            cVar.o(this.f44662g.b((int) (2097151 & j10)));
        } while (!f44652i.compareAndSet(this, j10, j11 | ((long) iF)));
        return true;
    }

    public final void p0(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44652i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iG0 = (int) (2097151 & j10);
            long j11 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j10) & (-2097152);
            if (iG0 == i10) {
                iG0 = i11 == 0 ? g0(cVar) : i11;
            }
            if (iG0 >= 0) {
                if (f44652i.compareAndSet(this, j10, j11 | ((long) iG0))) {
                    return;
                }
            }
        }
    }

    public final void r(Runnable runnable, boolean z10, boolean z11) {
        em.c.a();
        h hVarL = l(runnable, z10);
        boolean z12 = hVarL.f44690b;
        long jAddAndGet = z12 ? f44653j.addAndGet(this, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) : 0L;
        h hVarU0 = U0(q(), hVarL, z11);
        if (hVarU0 != null && !i(hVarU0)) {
            throw new RejectedExecutionException(this.f44659d + " was terminated");
        }
        if (z12) {
            N0(jAddAndGet);
        } else {
            T0();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f44662g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVar = (c) this.f44662g.b(i15);
            if (cVar != null) {
                int i16 = cVar.f44665a.i();
                int i17 = b.f44663a[cVar.f44667c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14++;
                }
            }
        }
        long j10 = f44653j.get(this);
        return this.f44659d + '@' + s0.b(this) + "[Pool Size {core = " + this.f44656a + ", max = " + this.f44657b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f44660e.c() + ", global blocking queue size = " + this.f44661f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f44656a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f44664i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f44665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k0 f44666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f44667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f44668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f44669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f44670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f44671g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f44665a = new l();
            this.f44666b = new k0();
            this.f44667c = d.DORMANT;
            this.nextParkedWorker = a.f44655l;
            int iNanoTime = (int) System.nanoTime();
            this.f44670f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(h hVar) {
            this.f44668d = 0L;
            if (this.f44667c == d.PARKING) {
                this.f44667c = d.BLOCKING;
            }
            if (!hVar.f44690b) {
                a.this.F0(hVar);
                return;
            }
            if (r(d.BLOCKING)) {
                a.this.T0();
            }
            a.this.F0(hVar);
            a.t().addAndGet(a.this, -2097152L);
            if (this.f44667c != d.TERMINATED) {
                this.f44667c = d.DORMANT;
            }
        }

        private final h c(boolean z10) {
            h hVarL;
            h hVarL2;
            if (z10) {
                boolean z11 = j(a.this.f44656a * 2) == 0;
                if (z11 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.f44665a.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z11 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        private final h d() {
            h hVarL = this.f44665a.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVar = (h) a.this.f44661f.e();
            return hVar == null ? s(1) : hVar;
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f44655l;
        }

        private final void k() {
            if (this.f44668d == 0) {
                this.f44668d = System.nanoTime() + a.this.f44658c;
            }
            LockSupport.parkNanos(a.this.f44658c);
            if (System.nanoTime() - this.f44668d >= 0) {
                this.f44668d = 0L;
                t();
            }
        }

        private final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.f44660e.e();
                return hVar != null ? hVar : (h) a.this.f44661f.e();
            }
            h hVar2 = (h) a.this.f44661f.e();
            return hVar2 != null ? hVar2 : (h) a.this.f44660e.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (a.this.isTerminated() || this.f44667c == d.TERMINATED) {
                        break loop0;
                    }
                    h hVarE = e(this.f44671g);
                    if (hVarE != null) {
                        this.f44669e = 0L;
                        b(hVarE);
                        break;
                    }
                    this.f44671g = false;
                    if (this.f44669e == 0) {
                        q();
                    } else {
                        if (z10) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f44669e);
                            this.f44669e = 0L;
                            break;
                        }
                        z10 = true;
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            long j10;
            if (this.f44667c == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterT = a.t();
            do {
                j10 = atomicLongFieldUpdaterT.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.t().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f44667c = d.CPU_ACQUIRED;
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.m0(this);
                return;
            }
            f44664i.set(this, -1);
            while (i() && f44664i.get(this) == -1 && !a.this.isTerminated() && this.f44667c != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final h s(int i10) {
            int i11 = (int) (a.t().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iJ = j(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iJ++;
                if (iJ > i11) {
                    iJ = 1;
                }
                c cVar = (c) aVar.f44662g.b(iJ);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f44665a.r(i10, this.f44666b);
                    if (jR == -1) {
                        k0 k0Var = this.f44666b;
                        h hVar = (h) k0Var.f43597a;
                        k0Var.f43597a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f44669e = jMin;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f44662g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.t().get(aVar) & 2097151)) <= aVar.f44656a) {
                        return;
                    }
                    if (f44664i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.p0(this, i10, 0);
                        int andDecrement = (int) (a.t().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            Object objB = aVar.f44662g.b(andDecrement);
                            s.e(objB);
                            c cVar = (c) objB;
                            aVar.f44662g.c(i10, cVar);
                            cVar.n(i10);
                            aVar.p0(cVar, andDecrement, i10);
                        }
                        aVar.f44662g.c(andDecrement, null);
                        g0 g0Var = g0.f38750a;
                        this.f44667c = d.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final h e(boolean z10) {
            return p() ? c(z10) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i10) {
            int i11 = this.f44670f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f44670f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f44659d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f44667c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.t().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f44667c = dVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
