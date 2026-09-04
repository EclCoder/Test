package ob;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f48404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f48405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48407d;

    public m0() {
        this(10);
    }

    private void b(long j10, Object obj) {
        int i10 = this.f48406c;
        int i11 = this.f48407d;
        Object[] objArr = this.f48405b;
        int length = (i10 + i11) % objArr.length;
        this.f48404a[length] = j10;
        objArr[length] = obj;
        this.f48407d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f48407d;
        if (i10 > 0) {
            if (j10 <= this.f48404a[((this.f48406c + i10) - 1) % this.f48405b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f48405b.length;
        if (this.f48407d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArrF = f(i10);
        int i11 = this.f48406c;
        int i12 = length - i11;
        System.arraycopy(this.f48404a, i11, jArr, 0, i12);
        System.arraycopy(this.f48405b, this.f48406c, objArrF, 0, i12);
        int i13 = this.f48406c;
        if (i13 > 0) {
            System.arraycopy(this.f48404a, 0, jArr, i12, i13);
            System.arraycopy(this.f48405b, 0, objArrF, i12, this.f48406c);
        }
        this.f48404a = jArr;
        this.f48405b = objArrF;
        this.f48406c = 0;
    }

    private static Object[] f(int i10) {
        return new Object[i10];
    }

    private Object h(long j10, boolean z10) {
        Object objK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f48407d > 0) {
            long j12 = j10 - this.f48404a[this.f48406c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            objK = k();
            j11 = j12;
        }
        return objK;
    }

    private Object k() {
        a.g(this.f48407d > 0);
        Object[] objArr = this.f48405b;
        int i10 = this.f48406c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f48406c = (i10 + 1) % objArr.length;
        this.f48407d--;
        return obj;
    }

    public synchronized void a(long j10, Object obj) {
        d(j10);
        e();
        b(j10, obj);
    }

    public synchronized void c() {
        this.f48406c = 0;
        this.f48407d = 0;
        Arrays.fill(this.f48405b, (Object) null);
    }

    public synchronized Object g(long j10) {
        return h(j10, false);
    }

    public synchronized Object i() {
        return this.f48407d == 0 ? null : k();
    }

    public synchronized Object j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f48407d;
    }

    public m0(int i10) {
        this.f48404a = new long[i10];
        this.f48405b = f(i10);
    }
}
