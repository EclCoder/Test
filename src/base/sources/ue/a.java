package ue;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f54411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54412b;

    public a() {
        this.f54412b = 0;
        this.f54411a = new int[1];
    }

    private void f(int i10) {
        if (i10 > (this.f54411a.length << 5)) {
            int[] iArrK = k(i10);
            int[] iArr = this.f54411a;
            System.arraycopy(iArr, 0, iArrK, 0, iArr.length);
            this.f54411a = iArrK;
        }
    }

    private static int[] k(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void b(boolean z10) {
        f(this.f54412b + 1);
        if (z10) {
            int[] iArr = this.f54411a;
            int i10 = this.f54412b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f54412b++;
    }

    public void c(a aVar) {
        int i10 = aVar.f54412b;
        f(this.f54412b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            b(aVar.g(i11));
        }
    }

    public void d(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        f(this.f54412b + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            b(z10);
            i11--;
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f54411a.clone(), this.f54412b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f54412b == aVar.f54412b && Arrays.equals(this.f54411a, aVar.f54411a);
    }

    public boolean g(int i10) {
        return ((1 << (i10 & 31)) & this.f54411a[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f54412b * 31) + Arrays.hashCode(this.f54411a);
    }

    public int i() {
        return this.f54412b;
    }

    public int j() {
        return (this.f54412b + 7) / 8;
    }

    public void l(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (g(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void m(a aVar) {
        if (this.f54412b != aVar.f54412b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f54411a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ aVar.f54411a[i10];
            i10++;
        }
    }

    public String toString() {
        int i10 = this.f54412b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f54412b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(g(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    a(int[] iArr, int i10) {
        this.f54411a = iArr;
        this.f54412b = i10;
    }
}
