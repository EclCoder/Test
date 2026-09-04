package i3;

import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f40992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f40994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f40995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f40997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f40998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f40999h;

    public v(s sVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        w1.a.a(iArr.length == jArr2.length);
        w1.a.a(jArr.length == jArr2.length);
        w1.a.a(iArr2.length == jArr2.length);
        this.f40992a = sVar;
        this.f40994c = jArr;
        this.f40995d = iArr;
        this.f40996e = i10;
        this.f40997f = jArr2;
        this.f40998g = iArr2;
        this.f40999h = j10;
        this.f40993b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iG = c0.g(this.f40997f, j10, true, false); iG >= 0; iG--) {
            if ((this.f40998g[iG] & 1) != 0) {
                return iG;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iD = c0.d(this.f40997f, j10, true, false); iD < this.f40997f.length; iD++) {
            if ((this.f40998g[iD] & 1) != 0) {
                return iD;
            }
        }
        return -1;
    }
}
