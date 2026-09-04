package u9;

import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f54329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f54330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f54332d;

    public x(long[] jArr, long[] jArr2, long j10) {
        ob.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f54332d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f54329a = jArr;
            this.f54330b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f54329a = jArr3;
            long[] jArr4 = new long[i10];
            this.f54330b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f54331c = j10;
    }

    @Override // u9.z
    public long getDurationUs() {
        return this.f54331c;
    }

    @Override // u9.z
    public z.a getSeekPoints(long j10) {
        if (!this.f54332d) {
            return new z.a(a0.f54230c);
        }
        int i10 = r0.i(this.f54330b, j10, true, true);
        a0 a0Var = new a0(this.f54330b[i10], this.f54329a[i10]);
        if (a0Var.f54231a == j10 || i10 == this.f54330b.length - 1) {
            return new z.a(a0Var);
        }
        int i11 = i10 + 1;
        return new z.a(a0Var, new a0(this.f54330b[i11], this.f54329a[i11]));
    }

    @Override // u9.z
    public boolean isSeekable() {
        return this.f54332d;
    }
}
