package zk;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import wk.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f58979i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f58980j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f58982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f58983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f58984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    AtomicReferenceArray f58985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f58986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    AtomicReferenceArray f58987g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicLong f58981a = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final AtomicLong f58988h = new AtomicLong();

    public a(int i10) {
        int iA = bl.c.a(Math.max(8, i10));
        int i11 = iA - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iA + 1);
        this.f58985e = atomicReferenceArray;
        this.f58984d = i11;
        b(iA);
        this.f58987g = atomicReferenceArray;
        this.f58986f = i11;
        this.f58983c = iA - 2;
        p(0L);
    }

    private void b(int i10) {
        this.f58982b = Math.min(i10 / 4, f58979i);
    }

    private static int d(long j10, int i10) {
        return c(((int) j10) & i10);
    }

    private long e() {
        return this.f58988h.get();
    }

    private long f() {
        return this.f58981a.get();
    }

    private long g() {
        return this.f58988h.get();
    }

    private static Object h(AtomicReferenceArray atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    private AtomicReferenceArray i(AtomicReferenceArray atomicReferenceArray, int i10) {
        int iC = c(i10);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) h(atomicReferenceArray, iC);
        n(atomicReferenceArray, iC, null);
        return atomicReferenceArray2;
    }

    private long j() {
        return this.f58981a.get();
    }

    private Object k(AtomicReferenceArray atomicReferenceArray, long j10, int i10) {
        this.f58987g = atomicReferenceArray;
        int iD = d(j10, i10);
        Object objH = h(atomicReferenceArray, iD);
        if (objH != null) {
            n(atomicReferenceArray, iD, null);
            m(j10 + 1);
        }
        return objH;
    }

    private void l(AtomicReferenceArray atomicReferenceArray, long j10, int i10, Object obj, long j11) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f58985e = atomicReferenceArray2;
        this.f58983c = (j11 + j10) - 1;
        n(atomicReferenceArray2, i10, obj);
        o(atomicReferenceArray, atomicReferenceArray2);
        n(atomicReferenceArray, i10, f58980j);
        p(j10 + 1);
    }

    private void m(long j10) {
        this.f58988h.lazySet(j10);
    }

    private static void n(AtomicReferenceArray atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    private void o(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        n(atomicReferenceArray, c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void p(long j10) {
        this.f58981a.lazySet(j10);
    }

    private boolean q(AtomicReferenceArray atomicReferenceArray, Object obj, long j10, int i10) {
        n(atomicReferenceArray, i10, obj);
        p(j10 + 1);
        return true;
    }

    @Override // wk.c
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // wk.c
    public boolean isEmpty() {
        return j() == g();
    }

    @Override // wk.c
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f58985e;
        long jF = f();
        int i10 = this.f58984d;
        int iD = d(jF, i10);
        if (jF < this.f58983c) {
            return q(atomicReferenceArray, obj, jF, iD);
        }
        long j10 = ((long) this.f58982b) + jF;
        if (h(atomicReferenceArray, d(j10, i10)) == null) {
            this.f58983c = j10 - 1;
            return q(atomicReferenceArray, obj, jF, iD);
        }
        if (h(atomicReferenceArray, d(jF + 1, i10)) == null) {
            return q(atomicReferenceArray, obj, jF, iD);
        }
        l(atomicReferenceArray, jF, iD, obj, i10);
        return true;
    }

    @Override // wk.c
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f58987g;
        long jE = e();
        int i10 = this.f58986f;
        int iD = d(jE, i10);
        Object objH = h(atomicReferenceArray, iD);
        boolean z10 = objH == f58980j;
        if (objH == null || z10) {
            if (z10) {
                return k(i(atomicReferenceArray, i10 + 1), jE, i10);
            }
            return null;
        }
        n(atomicReferenceArray, iD, null);
        m(jE + 1);
        return objH;
    }

    private static int c(int i10) {
        return i10;
    }
}
