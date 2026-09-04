package h8;

import i8.f;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f40261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f40262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f40265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f40266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f40270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String[] f40272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f40273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f40274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f40275o;

    private a(int i10, boolean z10, int i11, boolean z11) {
        this.f40261a = null;
        this.f40263c = i11;
        this.f40264d = z10;
        this.f40265e = z11;
        int i12 = 16;
        if (i10 < 16) {
            i10 = i12;
        } else if (((i10 - 1) & i10) != 0) {
            while (i12 < i10) {
                i12 += i12;
            }
            i10 = i12;
        }
        this.f40262b = new AtomicReference(C0605a.a(i10));
    }

    public static a B() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return C((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static a C(int i10) {
        return new a(64, true, i10, true);
    }

    private void J(C0605a c0605a) {
        int i10 = c0605a.f40277b;
        C0605a c0605a2 = (C0605a) this.f40262b.get();
        if (i10 == c0605a2.f40277b) {
            return;
        }
        if (i10 > 6000) {
            c0605a = C0605a.a(64);
        }
        androidx.lifecycle.b.a(this.f40262b, c0605a2, c0605a);
    }

    private void K(boolean z10) {
        this.f40271k = 0;
        this.f40273m = l();
        this.f40274n = this.f40267g << 3;
        if (z10) {
            Arrays.fill(this.f40266f, 0);
            Arrays.fill(this.f40272l, (Object) null);
        }
    }

    private void M() {
        this.f40275o = false;
        int[] iArr = this.f40266f;
        String[] strArr = this.f40272l;
        int i10 = this.f40267g;
        int i11 = this.f40271k;
        int i12 = i10 + i10;
        int i13 = this.f40273m;
        if (i12 > 65536) {
            K(true);
            return;
        }
        this.f40266f = new int[iArr.length + (i10 << 3)];
        this.f40267g = i12;
        int i14 = i12 << 2;
        this.f40268h = i14;
        this.f40269i = i14 + (i14 >> 1);
        this.f40270j = c(i12);
        this.f40272l = new String[strArr.length << 1];
        K(false);
        int[] iArr2 = new int[16];
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16 += 4) {
            int i17 = iArr[i16 + 3];
            if (i17 != 0) {
                i15++;
                String str = strArr[i16 >> 2];
                if (i17 == 1) {
                    iArr2[0] = iArr[i16];
                    w(str, iArr2, 1);
                } else if (i17 == 2) {
                    iArr2[0] = iArr[i16];
                    iArr2[1] = iArr[i16 + 1];
                    w(str, iArr2, 2);
                } else if (i17 != 3) {
                    if (i17 > iArr2.length) {
                        iArr2 = new int[i17];
                    }
                    System.arraycopy(iArr, iArr[i16 + 1], iArr2, 0, i17);
                    w(str, iArr2, i17);
                } else {
                    iArr2[0] = iArr[i16];
                    iArr2[1] = iArr[i16 + 1];
                    iArr2[2] = iArr[i16 + 2];
                    w(str, iArr2, 3);
                }
            }
        }
        if (i15 == i11) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i11 + ", copyCount=" + i15);
    }

    private int a(int[] iArr, int i10) {
        int i11 = this.f40274n;
        int i12 = i11 + i10;
        int[] iArr2 = this.f40266f;
        if (i12 > iArr2.length) {
            this.f40266f = Arrays.copyOf(this.f40266f, this.f40266f.length + Math.max(i12 - iArr2.length, Math.min(4096, this.f40267g)));
        }
        System.arraycopy(iArr, 0, this.f40266f, i11, i10);
        this.f40274n += i10;
        return i11;
    }

    private final int b(int i10) {
        return (i10 & (this.f40267g - 1)) << 2;
    }

    static int c(int i10) {
        int i11 = i10 >> 2;
        if (i11 < 64) {
            return 4;
        }
        if (i11 <= 256) {
            return 5;
        }
        return i11 <= 1024 ? 6 : 7;
    }

    private boolean d() {
        if (this.f40271k <= (this.f40267g >> 1)) {
            return false;
        }
        int iL = (this.f40273m - l()) >> 2;
        int i10 = this.f40271k;
        return iL > ((i10 + 1) >> 7) || ((double) i10) > ((double) this.f40267g) * 0.8d;
    }

    private int e(int i10) {
        int iB = b(i10);
        int[] iArr = this.f40266f;
        if (iArr[iB + 3] == 0) {
            return iB;
        }
        if (d()) {
            return k(i10);
        }
        int i11 = this.f40268h + ((iB >> 3) << 2);
        if (iArr[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this.f40269i;
        int i13 = this.f40270j;
        int i14 = i12 + ((iB >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this.f40273m;
        int i17 = i16 + 4;
        this.f40273m = i17;
        if (i17 < (this.f40267g << 3)) {
            return i16;
        }
        if (this.f40265e) {
            j();
        }
        return k(i10);
    }

    private String f(int i10, int i11) {
        int i12 = this.f40269i;
        int i13 = this.f40270j;
        int i14 = i12 + ((i10 >> (i13 + 2)) << i13);
        int[] iArr = this.f40266f;
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            int i16 = iArr[i14 + 3];
            if (i11 == iArr[i14] && 1 == i16) {
                return this.f40272l[i14 >> 2];
            }
            if (i16 == 0) {
                return null;
            }
            i14 += 4;
        }
        for (int iL = l(); iL < this.f40273m; iL += 4) {
            if (i11 == iArr[iL] && 1 == iArr[iL + 3]) {
                return this.f40272l[iL >> 2];
            }
        }
        return null;
    }

    private String g(int i10, int i11, int i12) {
        int i13 = this.f40269i;
        int i14 = this.f40270j;
        int i15 = i13 + ((i10 >> (i14 + 2)) << i14);
        int[] iArr = this.f40266f;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr[i15 + 3];
            if (i11 == iArr[i15] && i12 == iArr[i15 + 1] && 2 == i17) {
                return this.f40272l[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int iL = l(); iL < this.f40273m; iL += 4) {
            if (i11 == iArr[iL] && i12 == iArr[iL + 1] && 2 == iArr[iL + 3]) {
                return this.f40272l[iL >> 2];
            }
        }
        return null;
    }

    private String h(int i10, int i11, int i12, int i13) {
        int i14 = this.f40269i;
        int i15 = this.f40270j;
        int i16 = i14 + ((i10 >> (i15 + 2)) << i15);
        int[] iArr = this.f40266f;
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            int i18 = iArr[i16 + 3];
            if (i11 == iArr[i16] && i12 == iArr[i16 + 1] && i13 == iArr[i16 + 2] && 3 == i18) {
                return this.f40272l[i16 >> 2];
            }
            if (i18 == 0) {
                return null;
            }
            i16 += 4;
        }
        for (int iL = l(); iL < this.f40273m; iL += 4) {
            if (i11 == iArr[iL] && i12 == iArr[iL + 1] && i13 == iArr[iL + 2] && 3 == iArr[iL + 3]) {
                return this.f40272l[iL >> 2];
            }
        }
        return null;
    }

    private String i(int i10, int i11, int[] iArr, int i12) {
        int i13 = this.f40269i;
        int i14 = this.f40270j;
        int i15 = i13 + ((i10 >> (i14 + 2)) << i14);
        int[] iArr2 = this.f40266f;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr2[i15 + 3];
            if (i11 == iArr2[i15] && i12 == i17 && m(iArr, i12, iArr2[i15 + 1])) {
                return this.f40272l[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int iL = l(); iL < this.f40273m; iL += 4) {
            if (i11 == iArr2[iL] && i12 == iArr2[iL + 3] && m(iArr, i12, iArr2[iL + 1])) {
                return this.f40272l[iL >> 2];
            }
        }
        return null;
    }

    private int k(int i10) {
        M();
        int iB = b(i10);
        int[] iArr = this.f40266f;
        if (iArr[iB + 3] == 0) {
            return iB;
        }
        int i11 = this.f40268h + ((iB >> 3) << 2);
        if (iArr[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this.f40269i;
        int i13 = this.f40270j;
        int i14 = i12 + ((iB >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this.f40273m;
        this.f40273m = i16 + 4;
        return i16;
    }

    private final int l() {
        int i10 = this.f40267g;
        return (i10 << 3) - i10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:23:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    private boolean m(int[] iArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int[] iArr2 = this.f40266f;
        switch (i10) {
            case 4:
                i12 = 0;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                return iArr[i18] != iArr2[i19] && iArr[i12 + 3] == iArr2[i11 + 3];
            case 5:
                i13 = 0;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            case 6:
                i14 = 0;
                i13 = i14 + 1;
                i21 = i11 + 1;
                if (iArr[i14] != iArr2[i11]) {
                    return false;
                }
                i11 = i21;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            case 7:
                i15 = 0;
                i14 = i15 + 1;
                i22 = i11 + 1;
                if (iArr[i15] != iArr2[i11]) {
                    return false;
                }
                i11 = i22;
                i13 = i14 + 1;
                i21 = i11 + 1;
                if (iArr[i14] != iArr2[i11]) {
                    return false;
                }
                i11 = i21;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            case 8:
                int i23 = i11 + 1;
                if (iArr[0] != iArr2[i11]) {
                    return false;
                }
                i15 = 1;
                i11 = i23;
                i14 = i15 + 1;
                i22 = i11 + 1;
                if (iArr[i15] != iArr2[i11]) {
                    return false;
                }
                i11 = i22;
                i13 = i14 + 1;
                i21 = i11 + 1;
                if (iArr[i14] != iArr2[i11]) {
                    return false;
                }
                i11 = i21;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            default:
                return n(iArr, i10, i11);
        }
    }

    private boolean n(int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            if (iArr[i12] != this.f40266f[i11]) {
                return false;
            }
            if (i13 >= i10) {
                return true;
            }
            i12 = i13;
            i11 = i14;
        }
    }

    private void o() {
        if (this.f40275o) {
            int[] iArr = this.f40266f;
            this.f40266f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f40272l;
            this.f40272l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f40275o = false;
        }
    }

    public int A(int[] iArr, int i10) {
        if (i10 < 4) {
            throw new IllegalArgumentException();
        }
        int i11 = iArr[0] ^ this.f40263c;
        int i12 = i11 + (i11 >>> 9) + iArr[1];
        int i13 = ((i12 + (i12 >>> 15)) * 33) ^ iArr[2];
        int i14 = i13 + (i13 >>> 4);
        for (int i15 = 3; i15 < i10; i15++) {
            int i16 = iArr[i15];
            i14 += i16 ^ (i16 >> 21);
        }
        int i17 = i14 * 65599;
        int i18 = i17 + (i17 >>> 19);
        return (i18 << 5) ^ i18;
    }

    public String D(int i10) {
        int iB = b(x(i10));
        int[] iArr = this.f40266f;
        int i11 = iArr[iB + 3];
        if (i11 == 1) {
            if (iArr[iB] == i10) {
                return this.f40272l[iB >> 2];
            }
        } else if (i11 == 0) {
            return null;
        }
        int i12 = this.f40268h + ((iB >> 3) << 2);
        int i13 = iArr[i12 + 3];
        if (i13 == 1) {
            if (iArr[i12] == i10) {
                return this.f40272l[i12 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        return f(iB, i10);
    }

    public String E(int i10, int i11) {
        int iB = b(y(i10, i11));
        int[] iArr = this.f40266f;
        int i12 = iArr[iB + 3];
        if (i12 == 2) {
            if (i10 == iArr[iB] && i11 == iArr[iB + 1]) {
                return this.f40272l[iB >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        int i13 = this.f40268h + ((iB >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 2) {
            if (i10 == iArr[i13] && i11 == iArr[i13 + 1]) {
                return this.f40272l[i13 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        return g(iB, i10, i11);
    }

    public String F(int i10, int i11, int i12) {
        int iB = b(z(i10, i11, i12));
        int[] iArr = this.f40266f;
        int i13 = iArr[iB + 3];
        if (i13 == 3) {
            if (i10 == iArr[iB] && iArr[iB + 1] == i11 && iArr[iB + 2] == i12) {
                return this.f40272l[iB >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this.f40268h + ((iB >> 3) << 2);
        int i15 = iArr[i14 + 3];
        if (i15 == 3) {
            if (i10 == iArr[i14] && iArr[i14 + 1] == i11 && iArr[i14 + 2] == i12) {
                return this.f40272l[i14 >> 2];
            }
        } else if (i15 == 0) {
            return null;
        }
        return h(iB, i10, i11, i12);
    }

    public String G(int[] iArr, int i10) {
        if (i10 < 4) {
            if (i10 == 1) {
                return D(iArr[0]);
            }
            if (i10 != 2) {
                return i10 != 3 ? "" : F(iArr[0], iArr[1], iArr[2]);
            }
            return E(iArr[0], iArr[1]);
        }
        int iA = A(iArr, i10);
        int iB = b(iA);
        int[] iArr2 = this.f40266f;
        int i11 = iArr2[iB + 3];
        if (iA == iArr2[iB] && i11 == i10 && m(iArr, i10, iArr2[iB + 1])) {
            return this.f40272l[iB >> 2];
        }
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f40268h + ((iB >> 3) << 2);
        return (iA == iArr2[i12] && iArr2[i12 + 3] == i10 && m(iArr, i10, iArr2[i12 + 1])) ? this.f40272l[i12 >> 2] : i(iB, iA, iArr, i10);
    }

    public a H(int i10) {
        return new a(this, com.fasterxml.jackson.core.b.a.INTERN_FIELD_NAMES.h(i10), this.f40263c, com.fasterxml.jackson.core.b.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.h(i10), (C0605a) this.f40262b.get());
    }

    public boolean I() {
        return !this.f40275o;
    }

    public int L() {
        int i10 = this.f40268h;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f40266f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public void N() {
        if (this.f40261a == null || !I()) {
            return;
        }
        this.f40261a.J(new C0605a(this));
        this.f40275o = true;
    }

    public int O() {
        int i10 = this.f40269i;
        int i11 = 0;
        for (int i12 = this.f40268h + 3; i12 < i10; i12 += 4) {
            if (this.f40266f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int P() {
        return (this.f40273m - l()) >> 2;
    }

    public int Q() {
        int i10 = this.f40269i + 3;
        int i11 = this.f40267g + i10;
        int i12 = 0;
        while (i10 < i11) {
            if (this.f40266f[i10] != 0) {
                i12++;
            }
            i10 += 4;
        }
        return i12;
    }

    public int R() {
        int i10 = this.f40267g << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f40266f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    protected void j() {
        if (this.f40267g <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this.f40271k + " entries, hash area of " + this.f40267g + " slots is now full (all " + (this.f40267g >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    public String toString() {
        int iL = L();
        int iO = O();
        int iQ = Q();
        int iP = P();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", a.class.getName(), Integer.valueOf(this.f40271k), Integer.valueOf(this.f40267g), Integer.valueOf(iL), Integer.valueOf(iO), Integer.valueOf(iQ), Integer.valueOf(iP), Integer.valueOf(iL + iO + iQ + iP), Integer.valueOf(R()));
    }

    public String w(String str, int[] iArr, int i10) {
        int iE;
        o();
        if (this.f40264d) {
            str = f.f41202b.a(str);
        }
        if (i10 == 1) {
            iE = e(x(iArr[0]));
            int[] iArr2 = this.f40266f;
            iArr2[iE] = iArr[0];
            iArr2[iE + 3] = 1;
        } else if (i10 == 2) {
            iE = e(y(iArr[0], iArr[1]));
            int[] iArr3 = this.f40266f;
            iArr3[iE] = iArr[0];
            iArr3[iE + 1] = iArr[1];
            iArr3[iE + 3] = 2;
        } else if (i10 != 3) {
            int iA = A(iArr, i10);
            iE = e(iA);
            this.f40266f[iE] = iA;
            int iA2 = a(iArr, i10);
            int[] iArr4 = this.f40266f;
            iArr4[iE + 1] = iA2;
            iArr4[iE + 3] = i10;
        } else {
            int iE2 = e(z(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this.f40266f;
            iArr5[iE2] = iArr[0];
            iArr5[iE2 + 1] = iArr[1];
            iArr5[iE2 + 2] = iArr[2];
            iArr5[iE2 + 3] = 3;
            iE = iE2;
        }
        this.f40272l[iE >> 2] = str;
        this.f40271k++;
        return str;
    }

    public int x(int i10) {
        int i11 = i10 ^ this.f40263c;
        int i12 = i11 + (i11 >>> 16);
        int i13 = i12 ^ (i12 << 3);
        return i13 + (i13 >>> 12);
    }

    public int y(int i10, int i11) {
        int i12 = i10 + (i10 >>> 15);
        int i13 = ((i12 ^ (i12 >>> 9)) + (i11 * 33)) ^ this.f40263c;
        int i14 = i13 + (i13 >>> 16);
        int i15 = i14 ^ (i14 >>> 4);
        return i15 + (i15 << 3);
    }

    public int z(int i10, int i11, int i12) {
        int i13 = i10 ^ this.f40263c;
        int i14 = (((i13 + (i13 >>> 9)) * 31) + i11) * 33;
        int i15 = (i14 + (i14 >>> 15)) ^ i12;
        int i16 = i15 + (i15 >>> 4);
        int i17 = i16 + (i16 >>> 15);
        return i17 ^ (i17 << 9);
    }

    private a(a aVar, boolean z10, int i10, boolean z11, C0605a c0605a) {
        this.f40261a = aVar;
        this.f40263c = i10;
        this.f40264d = z10;
        this.f40265e = z11;
        this.f40262b = null;
        this.f40271k = c0605a.f40277b;
        int i11 = c0605a.f40276a;
        this.f40267g = i11;
        int i12 = i11 << 2;
        this.f40268h = i12;
        this.f40269i = i12 + (i12 >> 1);
        this.f40270j = c0605a.f40278c;
        this.f40266f = c0605a.f40279d;
        this.f40272l = c0605a.f40280e;
        this.f40273m = c0605a.f40281f;
        this.f40274n = c0605a.f40282g;
        this.f40275o = true;
    }

    /* JADX INFO: renamed from: h8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0605a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f40279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f40280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f40281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f40282g;

        public C0605a(int i10, int i11, int i12, int[] iArr, String[] strArr, int i13, int i14) {
            this.f40276a = i10;
            this.f40277b = i11;
            this.f40278c = i12;
            this.f40279d = iArr;
            this.f40280e = strArr;
            this.f40281f = i13;
            this.f40282g = i14;
        }

        public static C0605a a(int i10) {
            int i11 = i10 << 3;
            return new C0605a(i10, 0, a.c(i10), new int[i11], new String[i10 << 1], i11 - i10, i11);
        }

        public C0605a(a aVar) {
            this.f40276a = aVar.f40267g;
            this.f40277b = aVar.f40271k;
            this.f40278c = aVar.f40270j;
            this.f40279d = aVar.f40266f;
            this.f40280e = aVar.f40272l;
            this.f40281f = aVar.f40273m;
            this.f40282g = aVar.f40274n;
        }
    }
}
