package o2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f48038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f48039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f48041d;

    public e0(long[] jArr, long[] jArr2, long j10) {
        w1.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f48041d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f48038a = jArr;
            this.f48039b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f48038a = jArr3;
            long[] jArr4 = new long[i10];
            this.f48039b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f48040c = j10;
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f48040c;
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        if (!this.f48041d) {
            return new j0.a(k0.f48081c);
        }
        int iG = w1.c0.g(this.f48039b, j10, true, true);
        k0 k0Var = new k0(this.f48039b[iG], this.f48038a[iG]);
        if (k0Var.f48082a == j10 || iG == this.f48039b.length - 1) {
            return new j0.a(k0Var);
        }
        int i10 = iG + 1;
        return new j0.a(k0Var, new k0(this.f48039b[i10], this.f48038a[i10]));
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return this.f48041d;
    }
}
