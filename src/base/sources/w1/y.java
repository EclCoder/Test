package w1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f55855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f55856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55858d;

    public y() {
        this(10);
    }

    private void b(long j10, Object obj) {
        int i10 = this.f55857c;
        int i11 = this.f55858d;
        Object[] objArr = this.f55856b;
        int length = (i10 + i11) % objArr.length;
        this.f55855a[length] = j10;
        objArr[length] = obj;
        this.f55858d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f55858d;
        if (i10 > 0) {
            if (j10 <= this.f55855a[((this.f55857c + i10) - 1) % this.f55856b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f55856b.length;
        if (this.f55858d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArrF = f(i10);
        int i11 = this.f55857c;
        int i12 = length - i11;
        System.arraycopy(this.f55855a, i11, jArr, 0, i12);
        System.arraycopy(this.f55856b, this.f55857c, objArrF, 0, i12);
        int i13 = this.f55857c;
        if (i13 > 0) {
            System.arraycopy(this.f55855a, 0, jArr, i12, i13);
            System.arraycopy(this.f55856b, 0, objArrF, i12, this.f55857c);
        }
        this.f55855a = jArr;
        this.f55856b = objArrF;
        this.f55857c = 0;
    }

    private static Object[] f(int i10) {
        return new Object[i10];
    }

    private Object g(long j10, boolean z10) {
        Object objJ = null;
        long j11 = Long.MAX_VALUE;
        while (this.f55858d > 0) {
            long j12 = j10 - this.f55855a[this.f55857c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            objJ = j();
            j11 = j12;
        }
        return objJ;
    }

    private Object j() {
        a.g(this.f55858d > 0);
        Object[] objArr = this.f55856b;
        int i10 = this.f55857c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f55857c = (i10 + 1) % objArr.length;
        this.f55858d--;
        return obj;
    }

    public synchronized void a(long j10, Object obj) {
        d(j10);
        e();
        b(j10, obj);
    }

    public synchronized void c() {
        this.f55857c = 0;
        this.f55858d = 0;
        Arrays.fill(this.f55856b, (Object) null);
    }

    public synchronized Object h() {
        return this.f55858d == 0 ? null : j();
    }

    public synchronized Object i(long j10) {
        return g(j10, true);
    }

    public synchronized int k() {
        return this.f55858d;
    }

    public y(int i10) {
        this.f55855a = new long[i10];
        this.f55856b = f(i10);
    }
}
