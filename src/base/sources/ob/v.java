package ob;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f48462b;

    public v() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f48461a;
        long[] jArr = this.f48462b;
        if (i10 == jArr.length) {
            this.f48462b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f48462b;
        int i11 = this.f48461a;
        this.f48461a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f48461a) {
            return this.f48462b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f48461a);
    }

    public int c() {
        return this.f48461a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f48462b, this.f48461a);
    }

    public v(int i10) {
        this.f48462b = new long[i10];
    }
}
