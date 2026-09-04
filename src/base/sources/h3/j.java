package h3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.f0;
import o2.j0;
import o2.k0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f40215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f40217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f40219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f40220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f40221g;

    private j(long j10, int i10, long j11, int i11) {
        this(j10, i10, j11, i11, -1L, null);
    }

    public static j b(i iVar, long j10) {
        long[] jArr;
        long jA = iVar.a();
        if (jA == C.TIME_UNSET) {
            return null;
        }
        long j11 = iVar.f40211c;
        if (j11 == -1 || (jArr = iVar.f40214f) == null) {
            f0.a aVar = iVar.f40209a;
            return new j(j10, aVar.f48051c, jA, aVar.f48054f);
        }
        f0.a aVar2 = iVar.f40209a;
        return new j(j10, aVar2.f48051c, jA, aVar2.f48054f, j11, jArr);
    }

    private long c(int i10) {
        return (this.f40217c * ((long) i10)) / 100;
    }

    @Override // h3.g
    public long a() {
        return this.f40220f;
    }

    @Override // h3.g
    public int g() {
        return this.f40218d;
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f40217c;
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        if (!isSeekable()) {
            return new j0.a(new k0(0L, this.f40215a + ((long) this.f40216b)));
        }
        long jP = c0.p(j10, 0L, this.f40217c);
        double d10 = (jP * 100.0d) / this.f40217c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = (long[]) w1.a.i(this.f40221g);
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        return new j0.a(new k0(jP, this.f40215a + c0.p(Math.round((d11 / 256.0d) * this.f40219e), this.f40216b, this.f40219e - 1)));
    }

    @Override // h3.g
    public long getTimeUs(long j10) {
        long j11 = j10 - this.f40215a;
        if (!isSeekable() || j11 <= this.f40216b) {
            return 0L;
        }
        long[] jArr = (long[]) w1.a.i(this.f40221g);
        double d10 = (j11 * 256.0d) / this.f40219e;
        int iG = c0.g(jArr, (long) d10, true, true);
        long jC = c(iG);
        long j12 = jArr[iG];
        int i10 = iG + 1;
        long jC2 = c(i10);
        long j13 = iG == 99 ? 256L : jArr[i10];
        return jC + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jC2 - jC));
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return this.f40221g != null;
    }

    private j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f40215a = j10;
        this.f40216b = i10;
        this.f40217c = j11;
        this.f40218d = i11;
        this.f40219e = j12;
        this.f40221g = jArr;
        this.f40220f = j12 != -1 ? j10 + j12 : -1L;
    }
}
