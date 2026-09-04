package ba;

import ob.d0;
import ob.r0;
import ob.u;
import q9.t;
import u9.a0;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f8731f;

    private i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public static i b(long j10, long j11, t.a aVar, d0 d0Var) {
        int iL;
        int i10 = aVar.f50507g;
        int i11 = aVar.f50504d;
        int iQ = d0Var.q();
        if ((iQ & 1) != 1 || (iL = d0Var.L()) == 0) {
            return null;
        }
        long jU0 = r0.U0(iL, ((long) i10) * 1000000, i11);
        if ((iQ & 6) != 6) {
            return new i(j11, aVar.f50503c, jU0);
        }
        long J = d0Var.J();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = d0Var.H();
        }
        if (j10 != -1) {
            long j12 = j11 + J;
            if (j10 != j12) {
                u.i("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new i(j11, aVar.f50503c, jU0, J, jArr);
    }

    private long c(int i10) {
        return (this.f8728c * ((long) i10)) / 100;
    }

    @Override // ba.g
    public long a() {
        return this.f8730e;
    }

    @Override // u9.z
    public long getDurationUs() {
        return this.f8728c;
    }

    @Override // u9.z
    public z.a getSeekPoints(long j10) {
        if (!isSeekable()) {
            return new z.a(new a0(0L, this.f8726a + ((long) this.f8727b)));
        }
        long jR = r0.r(j10, 0L, this.f8728c);
        double d10 = (jR * 100.0d) / this.f8728c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = (long[]) ob.a.i(this.f8731f);
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        return new z.a(new a0(jR, this.f8726a + r0.r(Math.round((d11 / 256.0d) * this.f8729d), this.f8727b, this.f8729d - 1)));
    }

    @Override // ba.g
    public long getTimeUs(long j10) {
        long j11 = j10 - this.f8726a;
        if (!isSeekable() || j11 <= this.f8727b) {
            return 0L;
        }
        long[] jArr = (long[]) ob.a.i(this.f8731f);
        double d10 = (j11 * 256.0d) / this.f8729d;
        int i10 = r0.i(jArr, (long) d10, true, true);
        long jC = c(i10);
        long j12 = jArr[i10];
        int i11 = i10 + 1;
        long jC2 = c(i11);
        long j13 = i10 == 99 ? 256L : jArr[i11];
        return jC + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jC2 - jC));
    }

    @Override // u9.z
    public boolean isSeekable() {
        return this.f8731f != null;
    }

    private i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f8726a = j10;
        this.f8727b = i10;
        this.f8728c = j11;
        this.f8731f = jArr;
        this.f8729d = j12;
        this.f8730e = j12 != -1 ? j10 + j12 : -1L;
    }
}
