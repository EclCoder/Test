package o2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class x implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f48169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48170b;

    public x(y yVar, long j10) {
        this.f48169a = yVar;
        this.f48170b = j10;
    }

    private k0 b(long j10, long j11) {
        return new k0((j10 * 1000000) / ((long) this.f48169a.f48175e), this.f48170b + j11);
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f48169a.f();
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        w1.a.i(this.f48169a.f48181k);
        y yVar = this.f48169a;
        y.a aVar = yVar.f48181k;
        long[] jArr = aVar.f48183a;
        long[] jArr2 = aVar.f48184b;
        int iG = w1.c0.g(jArr, yVar.i(j10), true, false);
        k0 k0VarB = b(iG == -1 ? 0L : jArr[iG], iG != -1 ? jArr2[iG] : 0L);
        if (k0VarB.f48082a == j10 || iG == jArr.length - 1) {
            return new j0.a(k0VarB);
        }
        int i10 = iG + 1;
        return new j0.a(k0VarB, b(jArr[i10], jArr2[i10]));
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return true;
    }
}
