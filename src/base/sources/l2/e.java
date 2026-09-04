package l2;

import java.util.Arrays;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f43799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f43801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f43805g;

    public e(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // l2.b
    public synchronized void a(a aVar) {
        a[] aVarArr = this.f43805g;
        int i10 = this.f43804f;
        this.f43804f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f43803e--;
        notifyAll();
    }

    @Override // l2.b
    public synchronized a allocate() {
        a aVar;
        try {
            this.f43803e++;
            int i10 = this.f43804f;
            if (i10 > 0) {
                a[] aVarArr = this.f43805g;
                int i11 = i10 - 1;
                this.f43804f = i11;
                aVar = (a) w1.a.e(aVarArr[i11]);
                this.f43805g[this.f43804f] = null;
            } else {
                aVar = new a(new byte[this.f43800b], 0);
                int i12 = this.f43803e;
                a[] aVarArr2 = this.f43805g;
                if (i12 > aVarArr2.length) {
                    this.f43805g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // l2.b
    public synchronized void b(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f43805g;
                int i10 = this.f43804f;
                this.f43804f = i10 + 1;
                aVarArr[i10] = aVar.a();
                this.f43803e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public synchronized int c() {
        return this.f43803e * this.f43800b;
    }

    public synchronized void d() {
        if (this.f43799a) {
            e(0);
        }
    }

    public synchronized void e(int i10) {
        boolean z10 = i10 < this.f43802d;
        this.f43802d = i10;
        if (z10) {
            trim();
        }
    }

    @Override // l2.b
    public int getIndividualAllocationLength() {
        return this.f43800b;
    }

    @Override // l2.b
    public synchronized void trim() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, c0.j(this.f43802d, this.f43800b) - this.f43803e);
            int i11 = this.f43804f;
            if (iMax >= i11) {
                return;
            }
            if (this.f43801c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) w1.a.e(this.f43805g[i10]);
                    if (aVar.f43789a == this.f43801c) {
                        i10++;
                    } else {
                        a aVar2 = (a) w1.a.e(this.f43805g[i12]);
                        if (aVar2.f43789a != this.f43801c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f43805g;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f43804f) {
                    return;
                }
            }
            Arrays.fill(this.f43805g, iMax, this.f43804f, (Object) null);
            this.f43804f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public e(boolean z10, int i10, int i11) {
        w1.a.a(i10 > 0);
        w1.a.a(i11 >= 0);
        this.f43799a = z10;
        this.f43800b = i10;
        this.f43804f = i11;
        this.f43805g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f43801c = null;
            return;
        }
        this.f43801c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f43805g[i12] = new a(this.f43801c, i12 * i10);
        }
    }
}
