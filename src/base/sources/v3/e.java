package v3;

import o2.j0;
import o2.k0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f55153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f55155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f55156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f55157e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f55153a = cVar;
        this.f55154b = i10;
        this.f55155c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f55148e);
        this.f55156d = j12;
        this.f55157e = b(j12);
    }

    private long b(long j10) {
        return c0.N0(j10 * ((long) this.f55154b), 1000000L, this.f55153a.f55146c);
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f55157e;
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        long jP = c0.p((((long) this.f55153a.f55146c) * j10) / (((long) this.f55154b) * 1000000), 0L, this.f55156d - 1);
        long j11 = this.f55155c + (((long) this.f55153a.f55148e) * jP);
        long jB = b(jP);
        k0 k0Var = new k0(jB, j11);
        if (jB >= j10 || jP == this.f55156d - 1) {
            return new j0.a(k0Var);
        }
        long j12 = jP + 1;
        return new j0.a(k0Var, new k0(b(j12), this.f55155c + (((long) this.f55153a.f55148e) * j12)));
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return true;
    }
}
