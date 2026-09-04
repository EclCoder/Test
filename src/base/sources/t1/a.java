package t1;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f52480g = new a(null, new C0805a[0], 0, C.TIME_UNSET, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C0805a f52481h = new C0805a(0).i(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f52482i = w1.c0.s0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52483j = w1.c0.s0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f52484k = w1.c0.s0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52485l = w1.c0.s0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f52490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0805a[] f52491f;

    /* JADX INFO: renamed from: t1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0805a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f52492j = w1.c0.s0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f52493k = w1.c0.s0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f52494l = w1.c0.s0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f52495m = w1.c0.s0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f52496n = w1.c0.s0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f52497o = w1.c0.s0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f52498p = w1.c0.s0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f52499q = w1.c0.s0(7);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final String f52500r = w1.c0.s0(8);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f52501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f52502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f52503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri[] f52504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final r[] f52505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f52506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f52507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f52508h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f52509i;

        public C0805a(long j10) {
            this(j10, -1, -1, new int[0], new r[0], new long[0], 0L, false);
        }

        private static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }

        private static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            return this.f52509i && this.f52501a == Long.MIN_VALUE && this.f52502b == -1;
        }

        public int d() {
            return e(-1);
        }

        public int e(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f52506f;
                if (i12 >= iArr.length || this.f52509i || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0805a.class == obj.getClass()) {
                C0805a c0805a = (C0805a) obj;
                if (this.f52501a == c0805a.f52501a && this.f52502b == c0805a.f52502b && this.f52503c == c0805a.f52503c && Arrays.equals(this.f52505e, c0805a.f52505e) && Arrays.equals(this.f52506f, c0805a.f52506f) && Arrays.equals(this.f52507g, c0805a.f52507g) && this.f52508h == c0805a.f52508h && this.f52509i == c0805a.f52509i) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            if (this.f52502b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f52502b; i10++) {
                int i11 = this.f52506f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean h() {
            return this.f52502b == -1 || d() < this.f52502b;
        }

        public int hashCode() {
            int i10 = ((this.f52502b * 31) + this.f52503c) * 31;
            long j10 = this.f52501a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f52505e)) * 31) + Arrays.hashCode(this.f52506f)) * 31) + Arrays.hashCode(this.f52507g)) * 31;
            long j11 = this.f52508h;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f52509i ? 1 : 0);
        }

        public C0805a i(int i10) {
            int[] iArrC = c(this.f52506f, i10);
            long[] jArrB = b(this.f52507g, i10);
            return new C0805a(this.f52501a, i10, this.f52503c, iArrC, (r[]) Arrays.copyOf(this.f52505e, i10), jArrB, this.f52508h, this.f52509i);
        }

        private C0805a(long j10, int i10, int i11, int[] iArr, r[] rVarArr, long[] jArr, long j11, boolean z10) {
            int i12 = 0;
            w1.a.a(iArr.length == rVarArr.length);
            this.f52501a = j10;
            this.f52502b = i10;
            this.f52503c = i11;
            this.f52506f = iArr;
            this.f52505e = rVarArr;
            this.f52507g = jArr;
            this.f52508h = j11;
            this.f52509i = z10;
            this.f52504d = new Uri[rVarArr.length];
            while (true) {
                Uri[] uriArr = this.f52504d;
                if (i12 >= uriArr.length) {
                    return;
                }
                r rVar = rVarArr[i12];
                uriArr[i12] = rVar == null ? null : ((r.h) w1.a.e(rVar.f52818b)).f52910a;
                i12++;
            }
        }
    }

    private a(Object obj, C0805a[] c0805aArr, long j10, long j11, int i10) {
        this.f52486a = obj;
        this.f52488c = j10;
        this.f52489d = j11;
        this.f52487b = c0805aArr.length + i10;
        this.f52491f = c0805aArr;
        this.f52490e = i10;
    }

    private boolean e(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        C0805a c0805aA = a(i10);
        long j12 = c0805aA.f52501a;
        if (j12 == Long.MIN_VALUE) {
            return j11 == C.TIME_UNSET || (c0805aA.f52509i && c0805aA.f52502b == -1) || j10 < j11;
        }
        return j10 < j12;
    }

    public C0805a a(int i10) {
        int i11 = this.f52490e;
        return i10 < i11 ? f52481h : this.f52491f[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == C.TIME_UNSET || j10 < j11)) {
            int i10 = this.f52490e;
            while (i10 < this.f52487b && ((a(i10).f52501a != Long.MIN_VALUE && a(i10).f52501a <= j10) || !a(i10).h())) {
                i10++;
            }
            if (i10 < this.f52487b) {
                return i10;
            }
        }
        return -1;
    }

    public int c(long j10, long j11) {
        int i10 = this.f52487b - 1;
        int i11 = i10 - (d(i10) ? 1 : 0);
        while (i11 >= 0) {
            long j12 = j10;
            long j13 = j11;
            if (!e(j12, j13, i11)) {
                break;
            }
            i11--;
            j10 = j12;
            j11 = j13;
        }
        if (i11 < 0 || !a(i11).f()) {
            return -1;
        }
        return i11;
    }

    public boolean d(int i10) {
        return i10 == this.f52487b - 1 && a(i10).g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (w1.c0.c(this.f52486a, aVar.f52486a) && this.f52487b == aVar.f52487b && this.f52488c == aVar.f52488c && this.f52489d == aVar.f52489d && this.f52490e == aVar.f52490e && Arrays.equals(this.f52491f, aVar.f52491f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f52487b * 31;
        Object obj = this.f52486a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f52488c)) * 31) + ((int) this.f52489d)) * 31) + this.f52490e) * 31) + Arrays.hashCode(this.f52491f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f52486a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f52488c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f52491f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f52491f[i10].f52501a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f52491f[i10].f52506f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f52491f[i10].f52506f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f52491f[i10].f52507g[i11]);
                sb2.append(')');
                if (i11 < this.f52491f[i10].f52506f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f52491f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
