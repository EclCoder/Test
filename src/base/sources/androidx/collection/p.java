package androidx.collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class p extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1925e;

    public p(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            s.d.a("Capacity must be a positive value.");
        }
        g(t.d(i10));
    }

    private final void e() {
        this.f1925e = t.a(b()) - this.f1914d;
    }

    private final void f(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = t.f1932a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            gl.j.w(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f1911a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        e();
    }

    private final void g(int i10) {
        int iMax = i10 > 0 ? Math.max(7, t.c(i10)) : 0;
        this.f1913c = iMax;
        f(iMax);
        this.f1912b = new float[iMax];
    }
}
