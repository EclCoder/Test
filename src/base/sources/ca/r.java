package ca;

import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f9857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f9859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f9860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f9862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f9863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9864h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        ob.a.a(iArr.length == jArr2.length);
        ob.a.a(jArr.length == jArr2.length);
        ob.a.a(iArr2.length == jArr2.length);
        this.f9857a = oVar;
        this.f9859c = jArr;
        this.f9860d = iArr;
        this.f9861e = i10;
        this.f9862f = jArr2;
        this.f9863g = iArr2;
        this.f9864h = j10;
        this.f9858b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int i10 = r0.i(this.f9862f, j10, true, false); i10 >= 0; i10--) {
            if ((this.f9863g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iE = r0.e(this.f9862f, j10, true, false); iE < this.f9862f.length; iE++) {
            if ((this.f9863g[iE] & 1) != 0) {
                return iE;
            }
        }
        return -1;
    }
}
