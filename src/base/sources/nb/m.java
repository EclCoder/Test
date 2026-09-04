package nb;

import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f46984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f46986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f46990g;

    public m(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // nb.b
    public synchronized void a(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f46990g;
                int i10 = this.f46989f;
                this.f46989f = i10 + 1;
                aVarArr[i10] = aVar.a();
                this.f46988e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // nb.b
    public synchronized a allocate() {
        a aVar;
        try {
            this.f46988e++;
            int i10 = this.f46989f;
            if (i10 > 0) {
                a[] aVarArr = this.f46990g;
                int i11 = i10 - 1;
                this.f46989f = i11;
                aVar = (a) ob.a.e(aVarArr[i11]);
                this.f46990g[this.f46989f] = null;
            } else {
                aVar = new a(new byte[this.f46985b], 0);
                int i12 = this.f46988e;
                a[] aVarArr2 = this.f46990g;
                if (i12 > aVarArr2.length) {
                    this.f46990g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // nb.b
    public synchronized void b(a aVar) {
        a[] aVarArr = this.f46990g;
        int i10 = this.f46989f;
        this.f46989f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f46988e--;
        notifyAll();
    }

    public synchronized int c() {
        return this.f46988e * this.f46985b;
    }

    public synchronized void d() {
        if (this.f46984a) {
            e(0);
        }
    }

    public synchronized void e(int i10) {
        boolean z10 = i10 < this.f46987d;
        this.f46987d = i10;
        if (z10) {
            trim();
        }
    }

    @Override // nb.b
    public int getIndividualAllocationLength() {
        return this.f46985b;
    }

    @Override // nb.b
    public synchronized void trim() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, r0.l(this.f46987d, this.f46985b) - this.f46988e);
            int i11 = this.f46989f;
            if (iMax >= i11) {
                return;
            }
            if (this.f46986c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) ob.a.e(this.f46990g[i10]);
                    if (aVar.f46960a == this.f46986c) {
                        i10++;
                    } else {
                        a aVar2 = (a) ob.a.e(this.f46990g[i12]);
                        if (aVar2.f46960a != this.f46986c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f46990g;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f46989f) {
                    return;
                }
            }
            Arrays.fill(this.f46990g, iMax, this.f46989f, (Object) null);
            this.f46989f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public m(boolean z10, int i10, int i11) {
        ob.a.a(i10 > 0);
        ob.a.a(i11 >= 0);
        this.f46984a = z10;
        this.f46985b = i10;
        this.f46989f = i11;
        this.f46990g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f46986c = null;
            return;
        }
        this.f46986c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f46990g[i12] = new a(this.f46986c, i12 * i10);
        }
    }
}
