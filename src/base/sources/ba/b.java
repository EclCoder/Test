package ba;

import ob.r0;
import ob.v;
import u9.a0;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f8694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f8695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f8696d;

    public b(long j10, long j11, long j12) {
        this.f8696d = j10;
        this.f8693a = j12;
        v vVar = new v();
        this.f8694b = vVar;
        v vVar2 = new v();
        this.f8695c = vVar2;
        vVar.a(0L);
        vVar2.a(j11);
    }

    @Override // ba.g
    public long a() {
        return this.f8693a;
    }

    public boolean b(long j10) {
        v vVar = this.f8694b;
        return j10 - vVar.b(vVar.c() - 1) < 100000;
    }

    public void c(long j10, long j11) {
        if (b(j10)) {
            return;
        }
        this.f8694b.a(j10);
        this.f8695c.a(j11);
    }

    void d(long j10) {
        this.f8696d = j10;
    }

    @Override // u9.z
    public long getDurationUs() {
        return this.f8696d;
    }

    @Override // u9.z
    public z.a getSeekPoints(long j10) {
        int iG = r0.g(this.f8694b, j10, true, true);
        a0 a0Var = new a0(this.f8694b.b(iG), this.f8695c.b(iG));
        if (a0Var.f54231a == j10 || iG == this.f8694b.c() - 1) {
            return new z.a(a0Var);
        }
        int i10 = iG + 1;
        return new z.a(a0Var, new a0(this.f8694b.b(i10), this.f8695c.b(i10)));
    }

    @Override // ba.g
    public long getTimeUs(long j10) {
        return this.f8694b.b(r0.g(this.f8695c, j10, true, true));
    }

    @Override // u9.z
    public boolean isSeekable() {
        return true;
    }
}
