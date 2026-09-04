package t1;

import android.net.Uri;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f52510a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f52511b = w1.c0.s0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52512c = w1.c0.s0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f52513d = w1.c0.s0(2);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends a0 {
        a() {
        }

        @Override // t1.a0
        public int b(Object obj) {
            return -1;
        }

        @Override // t1.a0
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // t1.a0
        public int i() {
            return 0;
        }

        @Override // t1.a0
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // t1.a0
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // t1.a0
        public int p() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f52514h = w1.c0.s0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f52515i = w1.c0.s0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f52516j = w1.c0.s0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f52517k = w1.c0.s0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f52518l = w1.c0.s0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f52519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f52520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f52521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f52522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f52523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f52524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private t1.a f52525g = t1.a.f52480g;

        public int a(int i10) {
            return this.f52525g.a(i10).f52502b;
        }

        public long b(int i10, int i11) {
            t1.a.C0805a c0805aA = this.f52525g.a(i10);
            return c0805aA.f52502b != -1 ? c0805aA.f52507g[i11] : C.TIME_UNSET;
        }

        public int c() {
            return this.f52525g.f52487b;
        }

        public int d(long j10) {
            return this.f52525g.b(j10, this.f52522d);
        }

        public int e(long j10) {
            return this.f52525g.c(j10, this.f52522d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (w1.c0.c(this.f52519a, bVar.f52519a) && w1.c0.c(this.f52520b, bVar.f52520b) && this.f52521c == bVar.f52521c && this.f52522d == bVar.f52522d && this.f52523e == bVar.f52523e && this.f52524f == bVar.f52524f && w1.c0.c(this.f52525g, bVar.f52525g)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int i10) {
            return this.f52525g.a(i10).f52501a;
        }

        public long g() {
            return this.f52525g.f52488c;
        }

        public int h(int i10, int i11) {
            t1.a.C0805a c0805aA = this.f52525g.a(i10);
            if (c0805aA.f52502b != -1) {
                return c0805aA.f52506f[i11];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f52519a;
            int iHashCode = (Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f52520b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f52521c) * 31;
            long j10 = this.f52522d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f52523e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f52524f ? 1 : 0)) * 31) + this.f52525g.hashCode();
        }

        public long i(int i10) {
            return this.f52525g.a(i10).f52508h;
        }

        public long j() {
            return this.f52522d;
        }

        public int k(int i10) {
            return this.f52525g.a(i10).d();
        }

        public int l(int i10, int i11) {
            return this.f52525g.a(i10).e(i11);
        }

        public long m() {
            return w1.c0.c1(this.f52523e);
        }

        public long n() {
            return this.f52523e;
        }

        public int o() {
            return this.f52525g.f52490e;
        }

        public boolean p(int i10) {
            return !this.f52525g.a(i10).f();
        }

        public boolean q(int i10) {
            return i10 == c() - 1 && this.f52525g.d(i10);
        }

        public boolean r(int i10) {
            return this.f52525g.a(i10).f52509i;
        }

        public b s(Object obj, Object obj2, int i10, long j10, long j11) {
            return t(obj, obj2, i10, j10, j11, t1.a.f52480g, false);
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11, t1.a aVar, boolean z10) {
            this.f52519a = obj;
            this.f52520b = obj2;
            this.f52521c = i10;
            this.f52522d = j10;
            this.f52523e = j11;
            this.f52525g = aVar;
            this.f52524f = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f52537b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f52539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f52540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f52541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f52542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f52543h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f52544i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public r.g f52545j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f52546k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f52547l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f52548m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f52549n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f52550o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f52551p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f52526q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Object f52527r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final r f52528s = new r.c().d("androidx.media3.common.Timeline").g(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f52529t = w1.c0.s0(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f52530u = w1.c0.s0(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f52531v = w1.c0.s0(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f52532w = w1.c0.s0(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f52533x = w1.c0.s0(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f52534y = w1.c0.s0(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f52535z = w1.c0.s0(7);
        private static final String A = w1.c0.s0(8);
        private static final String B = w1.c0.s0(9);
        private static final String C = w1.c0.s0(10);
        private static final String D = w1.c0.s0(11);
        private static final String E = w1.c0.s0(12);
        private static final String F = w1.c0.s0(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f52536a = f52526q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r f52538c = f52528s;

        public long a() {
            return w1.c0.a0(this.f52542g);
        }

        public long b() {
            return w1.c0.c1(this.f52547l);
        }

        public long c() {
            return this.f52547l;
        }

        public long d() {
            return w1.c0.c1(this.f52548m);
        }

        public long e() {
            return this.f52551p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (w1.c0.c(this.f52536a, cVar.f52536a) && w1.c0.c(this.f52538c, cVar.f52538c) && w1.c0.c(this.f52539d, cVar.f52539d) && w1.c0.c(this.f52545j, cVar.f52545j) && this.f52540e == cVar.f52540e && this.f52541f == cVar.f52541f && this.f52542g == cVar.f52542g && this.f52543h == cVar.f52543h && this.f52544i == cVar.f52544i && this.f52546k == cVar.f52546k && this.f52547l == cVar.f52547l && this.f52548m == cVar.f52548m && this.f52549n == cVar.f52549n && this.f52550o == cVar.f52550o && this.f52551p == cVar.f52551p) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f52545j != null;
        }

        public c g(Object obj, r rVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, r.g gVar, long j13, long j14, int i10, int i11, long j15) {
            r.h hVar;
            this.f52536a = obj;
            this.f52538c = rVar != null ? rVar : f52528s;
            this.f52537b = (rVar == null || (hVar = rVar.f52818b) == null) ? null : hVar.f52917h;
            this.f52539d = obj2;
            this.f52540e = j10;
            this.f52541f = j11;
            this.f52542g = j12;
            this.f52543h = z10;
            this.f52544i = z11;
            this.f52545j = gVar;
            this.f52547l = j13;
            this.f52548m = j14;
            this.f52549n = i10;
            this.f52550o = i11;
            this.f52551p = j15;
            this.f52546k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + this.f52536a.hashCode()) * 31) + this.f52538c.hashCode()) * 31;
            Object obj = this.f52539d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            r.g gVar = this.f52545j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f52540e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f52541f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f52542g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f52543h ? 1 : 0)) * 31) + (this.f52544i ? 1 : 0)) * 31) + (this.f52546k ? 1 : 0)) * 31;
            long j13 = this.f52547l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f52548m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f52549n) * 31) + this.f52550o) * 31;
            long j15 = this.f52551p;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    protected a0() {
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f52521c;
        if (n(i12, cVar).f52550o != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).f52549n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (a0Var.p() != p() || a0Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(a0Var.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(a0Var.g(i11, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != a0Var.a(true) || (iC = c(true)) != a0Var.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != a0Var.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + p();
        for (int i10 = 0; i10 < p(); i10++) {
            iP = (iP * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (iP * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i11 = (i11 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair j(c cVar, b bVar, int i10, long j10) {
        return (Pair) w1.a.e(k(cVar, bVar, i10, j10, 0L));
    }

    public final Pair k(c cVar, b bVar, int i10, long j10, long j11) {
        w1.a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == C.TIME_UNSET) {
            j10 = cVar.c();
            if (j10 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = cVar.f52549n;
        f(i11, bVar);
        while (i11 < cVar.f52550o && bVar.f52523e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f52523e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long jMin = j10 - bVar.f52523e;
        long j12 = bVar.f52522d;
        if (j12 != C.TIME_UNSET) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(w1.a.e(bVar.f52520b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
