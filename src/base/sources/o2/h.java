package o2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f48065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f48066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f48067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f48068g;

    public h(long j10, long j11, int i10, int i11, boolean z10) {
        this.f48062a = j10;
        this.f48063b = j11;
        this.f48064c = i11 == -1 ? 1 : i11;
        this.f48066e = i10;
        this.f48068g = z10;
        if (j10 == -1) {
            this.f48065d = -1L;
            this.f48067f = C.TIME_UNSET;
        } else {
            this.f48065d = j10 - j11;
            this.f48067f = d(j10, j11, i10);
        }
    }

    private long b(long j10) {
        long j11 = (j10 * ((long) this.f48066e)) / 8000000;
        int i10 = this.f48064c;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f48065d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f48063b + Math.max(jMin, 0L);
    }

    private static long d(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    public long c(long j10) {
        return d(j10, this.f48063b, this.f48066e);
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f48067f;
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        if (this.f48065d == -1 && !this.f48068g) {
            return new j0.a(new k0(0L, this.f48063b));
        }
        long jB = b(j10);
        long jC = c(jB);
        k0 k0Var = new k0(jC, jB);
        if (this.f48065d != -1 && jC < j10) {
            int i10 = this.f48064c;
            if (((long) i10) + jB < this.f48062a) {
                long j11 = jB + ((long) i10);
                return new j0.a(k0Var, new k0(c(j11), j11));
            }
        }
        return new j0.a(k0Var);
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return this.f48065d != -1 || this.f48068g;
    }
}
