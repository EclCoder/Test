package w1;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f55823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f55824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f55826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55827e;

    public p() {
        this(16);
    }

    public void a() {
        this.f55823a = 0;
        this.f55824b = -1;
        this.f55825c = 0;
    }

    public long b() {
        if (this.f55825c != 0) {
            return this.f55826d[this.f55823a];
        }
        throw new NoSuchElementException();
    }

    public boolean c() {
        return this.f55825c == 0;
    }

    public long d() {
        int i10 = this.f55825c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f55826d;
        int i11 = this.f55823a;
        long j10 = jArr[i11];
        this.f55823a = this.f55827e & (i11 + 1);
        this.f55825c = i10 - 1;
        return j10;
    }

    public p(int i10) {
        a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f55823a = 0;
        this.f55824b = -1;
        this.f55825c = 0;
        long[] jArr = new long[i10];
        this.f55826d = jArr;
        this.f55827e = jArr.length - 1;
    }
}
