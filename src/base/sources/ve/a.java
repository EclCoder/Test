package ve;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f55401h = new a(4201, 4096, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f55402i = new a(1033, UserVerificationMethods.USER_VERIFY_ALL, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f55403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f55404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f55405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f55406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f55407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f55408o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f55409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f55410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f55411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f55412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f55413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f55414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f55415g;

    static {
        a aVar = new a(67, 64, 1);
        f55403j = aVar;
        f55404k = new a(19, 16, 1);
        f55405l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f55406m = aVar2;
        f55407n = aVar2;
        f55408o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f55414f = i10;
        this.f55413e = i11;
        this.f55415g = i12;
        this.f55409a = new int[i11];
        this.f55410b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f55409a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f55410b[this.f55409a[i15]] = i15;
        }
        this.f55411c = new b(this, new int[]{0});
        this.f55412d = new b(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f55411c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    int c(int i10) {
        return this.f55409a[i10];
    }

    public int d() {
        return this.f55415g;
    }

    b e() {
        return this.f55411c;
    }

    int f(int i10) {
        if (i10 != 0) {
            return this.f55409a[(this.f55413e - this.f55410b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    int g(int i10) {
        if (i10 != 0) {
            return this.f55410b[i10];
        }
        throw new IllegalArgumentException();
    }

    int h(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f55409a;
        int[] iArr2 = this.f55410b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f55413e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f55414f) + ',' + this.f55413e + ')';
    }
}
