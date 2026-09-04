package va;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i f55366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f55367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f55368c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f55369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f55370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List f55371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f55372g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f55373h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final long f55374i;

        public a(i iVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f55369d = j12;
            this.f55370e = j13;
            this.f55371f = list;
            this.f55374i = j14;
            this.f55372g = j15;
            this.f55373h = j16;
        }

        public long c(long j10, long j11) {
            long jG = g(j10);
            return jG != -1 ? jG : (int) (i((j11 - this.f55373h) + this.f55374i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f55372g;
                if (j12 != C.TIME_UNSET) {
                    return Math.max(e(), i((j11 - this.f55373h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f55369d;
        }

        public long f(long j10, long j11) {
            if (this.f55371f != null) {
                return C.TIME_UNSET;
            }
            long jD = d(j10, j11) + c(j10, j11);
            return (j(jD) + h(jD, j10)) - this.f55374i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List list = this.f55371f;
            if (list != null) {
                return (((d) list.get((int) (j10 - this.f55369d))).f55380b * 1000000) / this.f55367b;
            }
            long jG = g(j11);
            return (jG == -1 || j10 != (e() + jG) - 1) ? (this.f55370e * 1000000) / this.f55367b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long jE = e();
            long jG = g(j11);
            if (jG != 0) {
                if (this.f55371f != null) {
                    long j12 = (jG + jE) - 1;
                    long j13 = jE;
                    while (j13 <= j12) {
                        long j14 = ((j12 - j13) / 2) + j13;
                        long j15 = j(j14);
                        if (j15 < j10) {
                            j13 = j14 + 1;
                        } else {
                            if (j15 <= j10) {
                                return j14;
                            }
                            j12 = j14 - 1;
                        }
                    }
                    return j13 == jE ? j13 : j12;
                }
                long j16 = this.f55369d + (j10 / ((this.f55370e * 1000000) / this.f55367b));
                if (j16 >= jE) {
                    return jG == -1 ? j16 : Math.min(j16, (jE + jG) - 1);
                }
            }
            return jE;
        }

        public final long j(long j10) {
            List list = this.f55371f;
            return r0.U0(list != null ? ((d) list.get((int) (j10 - this.f55369d))).f55379a - this.f55368c : (j10 - this.f55369d) * this.f55370e, 1000000L, this.f55367b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f55371f != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final List f55375j;

        public b(i iVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f55375j = list2;
        }

        @Override // va.k.a
        public long g(long j10) {
            return this.f55375j.size();
        }

        @Override // va.k.a
        public i k(j jVar, long j10) {
            return (i) this.f55375j.get((int) (j10 - this.f55369d));
        }

        @Override // va.k.a
        public boolean l() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final n f55376j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final n f55377k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final long f55378l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f55376j = nVar;
            this.f55377k = nVar2;
            this.f55378l = j13;
        }

        @Override // va.k
        public i a(j jVar) {
            n nVar = this.f55376j;
            if (nVar == null) {
                return super.a(jVar);
            }
            v0 v0Var = jVar.f55353b;
            return new i(nVar.a(v0Var.f18857a, 0L, v0Var.f18864h, 0L), 0L, -1L);
        }

        @Override // va.k.a
        public long g(long j10) {
            List list = this.f55371f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f55378l;
            if (j11 != -1) {
                return (j11 - this.f55369d) + 1;
            }
            if (j10 != C.TIME_UNSET) {
                return wc.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f55367b)), BigInteger.valueOf(this.f55370e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // va.k.a
        public i k(j jVar, long j10) {
            List list = this.f55371f;
            long j11 = list != null ? ((d) list.get((int) (j10 - this.f55369d))).f55379a : (j10 - this.f55369d) * this.f55370e;
            n nVar = this.f55377k;
            v0 v0Var = jVar.f55353b;
            return new i(nVar.a(v0Var.f18857a, j10, v0Var.f18864h, j11), 0L, -1L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f55379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f55380b;

        public d(long j10, long j11) {
            this.f55379a = j10;
            this.f55380b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f55379a == dVar.f55379a && this.f55380b == dVar.f55380b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f55379a) * 31) + ((int) this.f55380b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f55366a = iVar;
        this.f55367b = j10;
        this.f55368c = j11;
    }

    public i a(j jVar) {
        return this.f55366a;
    }

    public long b() {
        return r0.U0(this.f55368c, 1000000L, this.f55367b);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f55381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f55382e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f55381d = j12;
            this.f55382e = j13;
        }

        public i c() {
            long j10 = this.f55382e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f55381d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
