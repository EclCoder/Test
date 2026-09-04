package ve;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f55416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f55417b;

    b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f55416a = aVar;
        int length = iArr.length;
        int i10 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f55417b = iArr;
            return;
        }
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f55417b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f55417b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    b a(b bVar) {
        if (!this.f55416a.equals(bVar.f55416a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f()) {
            return bVar;
        }
        if (bVar.f()) {
            return this;
        }
        int[] iArr = this.f55417b;
        int[] iArr2 = bVar.f55417b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = a.a(iArr2[i10 - length], iArr[i10]);
        }
        return new b(this.f55416a, iArr3);
    }

    b[] b(b bVar) {
        if (!this.f55416a.equals(bVar.f55416a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b bVarE = this.f55416a.e();
        int iF = this.f55416a.f(bVar.c(bVar.e()));
        b bVarA = this;
        while (bVarA.e() >= bVar.e() && !bVarA.f()) {
            int iE = bVarA.e() - bVar.e();
            int iH = this.f55416a.h(bVarA.c(bVarA.e()), iF);
            b bVarH = bVar.h(iE, iH);
            bVarE = bVarE.a(this.f55416a.b(iE, iH));
            bVarA = bVarA.a(bVarH);
        }
        return new b[]{bVarE, bVarA};
    }

    int c(int i10) {
        int[] iArr = this.f55417b;
        return iArr[(iArr.length - 1) - i10];
    }

    int[] d() {
        return this.f55417b;
    }

    int e() {
        return this.f55417b.length - 1;
    }

    boolean f() {
        return this.f55417b[0] == 0;
    }

    b g(b bVar) {
        if (!this.f55416a.equals(bVar.f55416a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f() || bVar.f()) {
            return this.f55416a.e();
        }
        int[] iArr = this.f55417b;
        int length = iArr.length;
        int[] iArr2 = bVar.f55417b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = a.a(iArr3[i13], this.f55416a.h(i11, iArr2[i12]));
            }
        }
        return new b(this.f55416a, iArr3);
    }

    b h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f55416a.e();
        }
        int length = this.f55417b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f55416a.h(this.f55417b[i12], i11);
        }
        return new b(this.f55416a, iArr);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(e() * 8);
        for (int iE = e(); iE >= 0; iE--) {
            int iC = c(iE);
            if (iC != 0) {
                if (iC < 0) {
                    sb2.append(" - ");
                    iC = -iC;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iE == 0 || iC != 1) {
                    int iG = this.f55416a.g(iC);
                    if (iG == 0) {
                        sb2.append('1');
                    } else if (iG == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(iG);
                    }
                }
                if (iE != 0) {
                    if (iE == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iE);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
