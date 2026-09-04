package v;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double[] f54946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f54947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f54948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f54949f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float[] f54944a = new float[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double[] f54945b = new double[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    double f54950g = 6.283185307179586d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54951h = false;

    public void a(double d10, float f10) {
        int length = this.f54944a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f54945b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f54945b = Arrays.copyOf(this.f54945b, length);
        this.f54944a = Arrays.copyOf(this.f54944a, length);
        this.f54946c = new double[length];
        double[] dArr = this.f54945b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f54945b[iBinarySearch] = d10;
        this.f54944a[iBinarySearch] = f10;
        this.f54951h = false;
    }

    double b(double d10) {
        if (d10 <= 0.0d) {
            return 0.0d;
        }
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f54945b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f54944a;
        float f10 = fArr[iBinarySearch];
        int i10 = iBinarySearch - 1;
        float f11 = fArr[i10];
        double d11 = f10 - f11;
        double[] dArr = this.f54945b;
        double d12 = dArr[iBinarySearch];
        double d13 = dArr[i10];
        double d14 = d11 / (d12 - d13);
        return (d10 * d14) + (((double) f11) - (d14 * d13));
    }

    double c(double d10) {
        if (d10 <= 0.0d) {
            return 0.0d;
        }
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f54945b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f54944a;
        float f10 = fArr[iBinarySearch];
        int i10 = iBinarySearch - 1;
        float f11 = fArr[i10];
        double d11 = f10 - f11;
        double[] dArr = this.f54945b;
        double d12 = dArr[iBinarySearch];
        double d13 = dArr[i10];
        double d14 = d11 / (d12 - d13);
        return this.f54946c[i10] + ((((double) f11) - (d14 * d13)) * (d10 - d13)) + ((d14 * ((d10 * d10) - (d13 * d13))) / 2.0d);
    }

    public double d(double d10, double d11, double d12) {
        double dC = d11 + c(d10);
        double dB = b(d10) + d12;
        switch (this.f54949f) {
            case 1:
                return 0.0d;
            case 2:
                return dB * 4.0d * Math.signum((((dC * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dB * 2.0d;
            case 4:
                return (-dB) * 2.0d;
            case 5:
                double d13 = this.f54950g;
                return (-d13) * dB * Math.sin(d13 * dC);
            case 6:
                return dB * 4.0d * ((((dC * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f54948e.f(dC % 1.0d, 0);
            default:
                double d14 = this.f54950g;
                return dB * d14 * Math.cos(d14 * dC);
        }
    }

    public double e(double d10, double d11) {
        double dAbs;
        double dC = c(d10) + d11;
        switch (this.f54949f) {
            case 1:
                return Math.signum(0.5d - (dC % 1.0d));
            case 2:
                dAbs = Math.abs((((dC * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dC * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dC * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f54950g * (d11 + dC));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dC * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f54948e.c(dC % 1.0d, 0);
            default:
                return Math.sin(this.f54950g * dC);
        }
        return 1.0d - dAbs;
    }

    public void f() {
        double d10 = 0.0d;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f54944a;
            if (i10 >= fArr.length) {
                break;
            }
            d10 += (double) fArr[i10];
            i10++;
        }
        double d11 = 0.0d;
        int i11 = 1;
        while (true) {
            float[] fArr2 = this.f54944a;
            if (i11 >= fArr2.length) {
                break;
            }
            int i12 = i11 - 1;
            float f10 = (fArr2[i12] + fArr2[i11]) / 2.0f;
            double[] dArr = this.f54945b;
            d11 += (dArr[i11] - dArr[i12]) * ((double) f10);
            i11++;
        }
        int i13 = 0;
        while (true) {
            float[] fArr3 = this.f54944a;
            if (i13 >= fArr3.length) {
                break;
            }
            fArr3[i13] = fArr3[i13] * ((float) (d10 / d11));
            i13++;
        }
        this.f54946c[0] = 0.0d;
        int i14 = 1;
        while (true) {
            float[] fArr4 = this.f54944a;
            if (i14 >= fArr4.length) {
                this.f54951h = true;
                return;
            }
            int i15 = i14 - 1;
            float f11 = (fArr4[i15] + fArr4[i14]) / 2.0f;
            double[] dArr2 = this.f54945b;
            double d12 = dArr2[i14] - dArr2[i15];
            double[] dArr3 = this.f54946c;
            dArr3[i14] = dArr3[i15] + (d12 * ((double) f11));
            i14++;
        }
    }

    public void g(int i10, String str) {
        this.f54949f = i10;
        this.f54947d = str;
        if (str != null) {
            this.f54948e = g.i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f54945b) + " period=" + Arrays.toString(this.f54944a);
    }
}
