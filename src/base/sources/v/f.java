package v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f54934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[][] f54935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f54936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54937d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double[] f54938e;

    public f(double[] dArr, double[][] dArr2) {
        this.f54936c = Double.NaN;
        int length = dArr2[0].length;
        this.f54938e = new double[length];
        this.f54934a = dArr;
        this.f54935b = dArr2;
        if (length <= 2) {
            return;
        }
        int i10 = 0;
        double d10 = 0.0d;
        while (true) {
            double d11 = d10;
            if (i10 >= dArr.length) {
                this.f54936c = 0.0d;
                return;
            }
            double d12 = dArr2[i10][0];
            if (i10 > 0) {
                Math.hypot(d12 - d10, d12 - d11);
            }
            i10++;
            d10 = d12;
        }
    }

    @Override // v.b
    public double c(double d10, int i10) {
        double d11;
        double d12;
        double dF;
        double[] dArr = this.f54934a;
        int length = dArr.length;
        int i11 = 0;
        if (this.f54937d) {
            double d13 = dArr[0];
            if (d10 <= d13) {
                d11 = this.f54935b[0][i10];
                d12 = d10 - d13;
                dF = f(d13, i10);
            } else {
                int i12 = length - 1;
                double d14 = dArr[i12];
                if (d10 >= d14) {
                    d11 = this.f54935b[i12][i10];
                    d12 = d10 - d14;
                    dF = f(d14, i10);
                }
            }
            return d11 + (d12 * dF);
        }
        if (d10 <= dArr[0]) {
            return this.f54935b[0][i10];
        }
        int i13 = length - 1;
        if (d10 >= dArr[i13]) {
            return this.f54935b[i13][i10];
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f54934a;
            double d15 = dArr2[i11];
            if (d10 == d15) {
                return this.f54935b[i11][i10];
            }
            int i14 = i11 + 1;
            double d16 = dArr2[i14];
            if (d10 < d16) {
                double d17 = (d10 - d15) / (d16 - d15);
                double[][] dArr3 = this.f54935b;
                return (dArr3[i11][i10] * (1.0d - d17)) + (dArr3[i14][i10] * d17);
            }
            i11 = i14;
        }
        return 0.0d;
    }

    @Override // v.b
    public void d(double d10, double[] dArr) {
        double[] dArr2 = this.f54934a;
        int length = dArr2.length;
        int i10 = 0;
        int length2 = this.f54935b[0].length;
        if (this.f54937d) {
            double d11 = dArr2[0];
            if (d10 <= d11) {
                g(d11, this.f54938e);
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = this.f54935b[0][i11] + ((d10 - this.f54934a[0]) * this.f54938e[i11]);
                }
                return;
            }
            int i12 = length - 1;
            double d12 = dArr2[i12];
            if (d10 >= d12) {
                g(d12, this.f54938e);
                while (i10 < length2) {
                    dArr[i10] = this.f54935b[i12][i10] + ((d10 - this.f54934a[i12]) * this.f54938e[i10]);
                    i10++;
                }
                return;
            }
        } else {
            if (d10 <= dArr2[0]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = this.f54935b[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            if (d10 >= dArr2[i14]) {
                while (i10 < length2) {
                    dArr[i10] = this.f54935b[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d10 == this.f54934a[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    dArr[i16] = this.f54935b[i15][i16];
                }
            }
            double[] dArr3 = this.f54934a;
            int i17 = i15 + 1;
            double d13 = dArr3[i17];
            if (d10 < d13) {
                double d14 = dArr3[i15];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    double[][] dArr4 = this.f54935b;
                    dArr[i10] = (dArr4[i15][i10] * (1.0d - d15)) + (dArr4[i17][i10] * d15);
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    @Override // v.b
    public void e(double d10, float[] fArr) {
        double[] dArr = this.f54934a;
        int length = dArr.length;
        int i10 = 0;
        int length2 = this.f54935b[0].length;
        if (this.f54937d) {
            double d11 = dArr[0];
            if (d10 <= d11) {
                g(d11, this.f54938e);
                for (int i11 = 0; i11 < length2; i11++) {
                    fArr[i11] = (float) (this.f54935b[0][i11] + ((d10 - this.f54934a[0]) * this.f54938e[i11]));
                }
                return;
            }
            int i12 = length - 1;
            double d12 = dArr[i12];
            if (d10 >= d12) {
                g(d12, this.f54938e);
                while (i10 < length2) {
                    fArr[i10] = (float) (this.f54935b[i12][i10] + ((d10 - this.f54934a[i12]) * this.f54938e[i10]));
                    i10++;
                }
                return;
            }
        } else {
            if (d10 <= dArr[0]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) this.f54935b[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            if (d10 >= dArr[i14]) {
                while (i10 < length2) {
                    fArr[i10] = (float) this.f54935b[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d10 == this.f54934a[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    fArr[i16] = (float) this.f54935b[i15][i16];
                }
            }
            double[] dArr2 = this.f54934a;
            int i17 = i15 + 1;
            double d13 = dArr2[i17];
            if (d10 < d13) {
                double d14 = dArr2[i15];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    double[][] dArr3 = this.f54935b;
                    fArr[i10] = (float) ((dArr3[i15][i10] * (1.0d - d15)) + (dArr3[i17][i10] * d15));
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v.b
    public double f(double d10, int i10) {
        double[] dArr = this.f54934a;
        int length = dArr.length;
        int i11 = 0;
        double d11 = dArr[0];
        if (d10 < d11) {
            d10 = d11;
        } else {
            d11 = dArr[length - 1];
            if (d10 >= d11) {
                d10 = d11;
            }
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f54934a;
            int i12 = i11 + 1;
            double d12 = dArr2[i12];
            if (d10 <= d12) {
                double d13 = d12 - dArr2[i11];
                double[][] dArr3 = this.f54935b;
                return (dArr3[i12][i10] - dArr3[i11][i10]) / d13;
            }
            i11 = i12;
        }
        return 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v.b
    public void g(double d10, double[] dArr) {
        double[] dArr2 = this.f54934a;
        int length = dArr2.length;
        int length2 = this.f54935b[0].length;
        double d11 = dArr2[0];
        if (d10 <= d11) {
            d10 = d11;
        } else {
            d11 = dArr2[length - 1];
            if (d10 >= d11) {
                d10 = d11;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            double[] dArr3 = this.f54934a;
            int i11 = i10 + 1;
            double d12 = dArr3[i11];
            if (d10 <= d12) {
                double d13 = d12 - dArr3[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    double[][] dArr4 = this.f54935b;
                    dArr[i12] = (dArr4[i11][i12] - dArr4[i10][i12]) / d13;
                }
                return;
            }
            i10 = i11;
        }
    }

    @Override // v.b
    public double[] h() {
        return this.f54934a;
    }
}
