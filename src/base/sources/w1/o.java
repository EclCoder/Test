package w1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f55821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f55822b;

    public o() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f55821a;
        long[] jArr = this.f55822b;
        if (i10 == jArr.length) {
            this.f55822b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f55822b;
        int i11 = this.f55821a;
        this.f55821a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f55821a) {
            return this.f55822b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f55821a);
    }

    public int c() {
        return this.f55821a;
    }

    public o(int i10) {
        this.f55822b = new long[i10];
    }
}
