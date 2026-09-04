package u9;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f54250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f54253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f54254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f54255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f54256g;

    public d(long j10, long j11, int i10, int i11, boolean z10) {
        this.f54250a = j10;
        this.f54251b = j11;
        this.f54252c = i11 == -1 ? 1 : i11;
        this.f54254e = i10;
        this.f54256g = z10;
        if (j10 == -1) {
            this.f54253d = -1L;
            this.f54255f = C.TIME_UNSET;
        } else {
            this.f54253d = j10 - j11;
            this.f54255f = d(j10, j11, i10);
        }
    }

    private long b(long j10) {
        long j11 = (j10 * ((long) this.f54254e)) / 8000000;
        int i10 = this.f54252c;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f54253d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f54251b + Math.max(jMin, 0L);
    }

    private static long d(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    public long c(long j10) {
        return d(j10, this.f54251b, this.f54254e);
    }

    @Override // u9.z
    public long getDurationUs() {
        return this.f54255f;
    }

    @Override // u9.z
    public z.a getSeekPoints(long j10) {
        if (this.f54253d == -1 && !this.f54256g) {
            return new z.a(new a0(0L, this.f54251b));
        }
        long jB = b(j10);
        long jC = c(jB);
        a0 a0Var = new a0(jC, jB);
        if (this.f54253d != -1 && jC < j10) {
            int i10 = this.f54252c;
            if (((long) i10) + jB < this.f54250a) {
                long j11 = jB + ((long) i10);
                return new z.a(a0Var, new a0(c(j11), j11));
            }
        }
        return new z.a(a0Var);
    }

    @Override // u9.z
    public boolean isSeekable() {
        return this.f54253d != -1 || this.f54256g;
    }
}
