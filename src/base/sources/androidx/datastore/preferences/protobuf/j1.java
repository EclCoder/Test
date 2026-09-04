package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j1 f3586f = new j1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f3588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f3589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3591e;

    private j1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f3588b;
        if (i10 > iArr.length) {
            int i11 = this.f3587a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f3588b = Arrays.copyOf(iArr, i10);
            this.f3589c = Arrays.copyOf(this.f3589c, i10);
        }
    }

    public static j1 c() {
        return f3586f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static j1 j(j1 j1Var, j1 j1Var2) {
        int i10 = j1Var.f3587a + j1Var2.f3587a;
        int[] iArrCopyOf = Arrays.copyOf(j1Var.f3588b, i10);
        System.arraycopy(j1Var2.f3588b, 0, iArrCopyOf, j1Var.f3587a, j1Var2.f3587a);
        Object[] objArrCopyOf = Arrays.copyOf(j1Var.f3589c, i10);
        System.arraycopy(j1Var2.f3589c, 0, objArrCopyOf, j1Var.f3587a, j1Var2.f3587a);
        return new j1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static j1 k() {
        return new j1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, o1 o1Var) {
        int iA = n1.a(i10);
        int iB = n1.b(i10);
        if (iB == 0) {
            o1Var.writeInt64(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            o1Var.writeFixed64(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            o1Var.b(iA, (g) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.j());
            }
            o1Var.writeFixed32(iA, ((Integer) obj).intValue());
        } else if (o1Var.fieldOrder() == o1.a.ASCENDING) {
            o1Var.writeStartGroup(iA);
            ((j1) obj).r(o1Var);
            o1Var.writeEndGroup(iA);
        } else {
            o1Var.writeEndGroup(iA);
            ((j1) obj).r(o1Var);
            o1Var.writeStartGroup(iA);
        }
    }

    void a() {
        if (!this.f3591e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iR;
        int i10 = this.f3590d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f3587a; i12++) {
            int i13 = this.f3588b[i12];
            int iA = n1.a(i13);
            int iB = n1.b(i13);
            if (iB == 0) {
                iR = CodedOutputStream.R(iA, ((Long) this.f3589c[i12]).longValue());
            } else if (iB == 1) {
                iR = CodedOutputStream.n(iA, ((Long) this.f3589c[i12]).longValue());
            } else if (iB == 2) {
                iR = CodedOutputStream.f(iA, (g) this.f3589c[i12]);
            } else if (iB == 3) {
                iR = (CodedOutputStream.O(iA) * 2) + ((j1) this.f3589c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.j());
                }
                iR = CodedOutputStream.l(iA, ((Integer) this.f3589c[i12]).intValue());
            }
            i11 += iR;
        }
        this.f3590d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f3590d;
        if (i10 != -1) {
            return i10;
        }
        int iD = 0;
        for (int i11 = 0; i11 < this.f3587a; i11++) {
            iD += CodedOutputStream.D(n1.a(this.f3588b[i11]), (g) this.f3589c[i11]);
        }
        this.f3590d = iD;
        return iD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        int i10 = this.f3587a;
        return i10 == j1Var.f3587a && o(this.f3588b, j1Var.f3588b, i10) && l(this.f3589c, j1Var.f3589c, this.f3587a);
    }

    public void h() {
        if (this.f3591e) {
            this.f3591e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f3587a;
        return ((((527 + i10) * 31) + f(this.f3588b, i10)) * 31) + g(this.f3589c, this.f3587a);
    }

    j1 i(j1 j1Var) {
        if (j1Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f3587a + j1Var.f3587a;
        b(i10);
        System.arraycopy(j1Var.f3588b, 0, this.f3588b, this.f3587a, j1Var.f3587a);
        System.arraycopy(j1Var.f3589c, 0, this.f3589c, this.f3587a, j1Var.f3587a);
        this.f3587a = i10;
        return this;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f3587a; i11++) {
            p0.d(sb2, i10, String.valueOf(n1.a(this.f3588b[i11])), this.f3589c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f3587a + 1);
        int[] iArr = this.f3588b;
        int i11 = this.f3587a;
        iArr[i11] = i10;
        this.f3589c[i11] = obj;
        this.f3587a = i11 + 1;
    }

    void p(o1 o1Var) {
        if (o1Var.fieldOrder() == o1.a.DESCENDING) {
            for (int i10 = this.f3587a - 1; i10 >= 0; i10--) {
                o1Var.writeMessageSetItem(n1.a(this.f3588b[i10]), this.f3589c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f3587a; i11++) {
            o1Var.writeMessageSetItem(n1.a(this.f3588b[i11]), this.f3589c[i11]);
        }
    }

    public void r(o1 o1Var) {
        if (this.f3587a == 0) {
            return;
        }
        if (o1Var.fieldOrder() == o1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f3587a; i10++) {
                q(this.f3588b[i10], this.f3589c[i10], o1Var);
            }
            return;
        }
        for (int i11 = this.f3587a - 1; i11 >= 0; i11--) {
            q(this.f3588b[i11], this.f3589c[i11], o1Var);
        }
    }

    private j1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f3590d = -1;
        this.f3587a = i10;
        this.f3588b = iArr;
        this.f3589c = objArr;
        this.f3591e = z10;
    }
}
