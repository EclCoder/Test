package cm;

import bm.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import yl.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0139a f10121b = new C0139a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f10122c = h(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f10123d = c.j(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f10124e = c.j(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f10125a;

    /* JADX INFO: renamed from: cm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0139a {
        public /* synthetic */ C0139a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f10123d;
        }

        public final long b() {
            return a.f10122c;
        }

        public final long c(String value) {
            s.h(value, "value");
            try {
                return c.p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        private C0139a() {
        }
    }

    private /* synthetic */ a(long j10) {
        this.f10125a = j10;
    }

    public static final boolean A(long j10) {
        return j10 > 0;
    }

    public static final long B(long j10, long j11) {
        if (y(j10)) {
            if (v(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (y(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return w(j10) ? c(j10, t(j10), t(j11)) : c(j10, t(j11), t(j10));
        }
        long jT = t(j10) + t(j11);
        return x(j10) ? c.m(jT) : c.k(jT);
    }

    public static final String C(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (z(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long j11 = j(j10);
        long jM = m(j11);
        int iP = p(j11);
        int iR = r(j11);
        int iQ = q(j11);
        long j12 = y(j10) ? 9999999999999L : jM;
        boolean z10 = false;
        boolean z11 = j12 != 0;
        boolean z12 = (iR == 0 && iQ == 0) ? false : true;
        if (iP != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iP);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            d(j10, sb2, iR, iQ, 9, "S", true);
        }
        return sb2.toString();
    }

    public static final long D(long j10, d unit) {
        s.h(unit, "unit");
        if (j10 == f10123d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f10124e) {
            return Long.MIN_VALUE;
        }
        return e.b(t(j10), s(j10), unit);
    }

    public static String E(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f10123d) {
            return "Infinity";
        }
        if (j10 == f10124e) {
            return "-Infinity";
        }
        boolean z10 = z(j10);
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        long j11 = j(j10);
        long jL = l(j11);
        int iK = k(j11);
        int iP = p(j11);
        int iR = r(j11);
        int iQ = q(j11);
        int i10 = 0;
        boolean z11 = jL != 0;
        boolean z12 = iK != 0;
        boolean z13 = iP != 0;
        boolean z14 = (iR == 0 && iQ == 0) ? false : true;
        if (z11) {
            sb2.append(jL);
            sb2.append('d');
            i10 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iK);
            sb2.append('h');
            i10 = i11;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iP);
            sb2.append('m');
            i10 = i12;
        }
        if (z14) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iR != 0 || z11 || z12 || z13) {
                d(j10, sb2, iR, iQ, 9, "s", false);
            } else if (iQ >= 1000000) {
                d(j10, sb2, iQ / 1000000, iQ % 1000000, 6, "ms", false);
            } else if (iQ >= 1000) {
                d(j10, sb2, iQ / 1000, iQ % 1000, 3, "us", false);
            } else {
                sb2.append(iQ);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (z10 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long F(long j10) {
        return c.i(-t(j10), ((int) j10) & 1);
    }

    private static final long c(long j10, long j11, long j12) {
        long jO = c.o(j12);
        long j13 = j11 + jO;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return c.j(g.j(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j13) + (j12 - c.n(jO)));
    }

    private static final void d(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strQ0 = r.q0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strQ0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strQ0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strQ0, 0, ((i13 + 3) / 3) * 3);
                s.g(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strQ0, 0, i15);
                s.g(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ a e(long j10) {
        return new a(j10);
    }

    public static int g(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return s.j(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return z(j10) ? -i10 : i10;
    }

    public static long h(long j10) {
        if (!b.a()) {
            return j10;
        }
        if (x(j10)) {
            long jT = t(j10);
            if (-4611686018426999999L <= jT && jT < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(t(j10) + " ns is out of nanoseconds range");
        }
        long jT2 = t(j10);
        if (-4611686018427387903L > jT2 || jT2 >= 4611686018427387904L) {
            throw new AssertionError(t(j10) + " ms is out of milliseconds range");
        }
        long jT3 = t(j10);
        if (-4611686018426L > jT3 || jT3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(t(j10) + " ms is denormalized");
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).G();
    }

    public static final long j(long j10) {
        return z(j10) ? F(j10) : j10;
    }

    public static final int k(long j10) {
        if (y(j10)) {
            return 0;
        }
        return (int) (m(j10) % ((long) 24));
    }

    public static final long l(long j10) {
        return D(j10, d.DAYS);
    }

    public static final long m(long j10) {
        return D(j10, d.HOURS);
    }

    public static final long n(long j10) {
        return D(j10, d.MINUTES);
    }

    public static final long o(long j10) {
        return D(j10, d.SECONDS);
    }

    public static final int p(long j10) {
        if (y(j10)) {
            return 0;
        }
        return (int) (n(j10) % ((long) 60));
    }

    public static final int q(long j10) {
        if (y(j10)) {
            return 0;
        }
        return (int) (w(j10) ? c.n(t(j10) % ((long) 1000)) : t(j10) % ((long) 1000000000));
    }

    public static final int r(long j10) {
        if (y(j10)) {
            return 0;
        }
        return (int) (o(j10) % ((long) 60));
    }

    private static final d s(long j10) {
        return x(j10) ? d.NANOSECONDS : d.MILLISECONDS;
    }

    private static final long t(long j10) {
        return j10 >> 1;
    }

    public static int u(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean v(long j10) {
        return !y(j10);
    }

    private static final boolean w(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean x(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean y(long j10) {
        return j10 == f10123d || j10 == f10124e;
    }

    public static final boolean z(long j10) {
        return j10 < 0;
    }

    public final /* synthetic */ long G() {
        return this.f10125a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((a) obj).G());
    }

    public boolean equals(Object obj) {
        return i(this.f10125a, obj);
    }

    public int f(long j10) {
        return g(this.f10125a, j10);
    }

    public int hashCode() {
        return u(this.f10125a);
    }

    public String toString() {
        return E(this.f10125a);
    }
}
