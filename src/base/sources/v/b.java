package v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f54893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double[] f54894b;

        a(double d10, double[] dArr) {
            this.f54893a = d10;
            this.f54894b = dArr;
        }

        @Override // v.b
        public double c(double d10, int i10) {
            return this.f54894b[i10];
        }

        @Override // v.b
        public void d(double d10, double[] dArr) {
            double[] dArr2 = this.f54894b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // v.b
        public void e(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f54894b;
                if (i10 >= dArr.length) {
                    return;
                }
                fArr[i10] = (float) dArr[i10];
                i10++;
            }
        }

        @Override // v.b
        public double f(double d10, int i10) {
            return 0.0d;
        }

        @Override // v.b
        public void g(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f54894b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        @Override // v.b
        public double[] h() {
            return new double[]{this.f54893a};
        }
    }

    public static b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        if (i10 != 0) {
            return i10 != 2 ? new f(dArr, dArr2) : new a(dArr[0], dArr2[0]);
        }
        return new g(dArr, dArr2);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new v.a(iArr, dArr, dArr2);
    }

    public abstract double c(double d10, int i10);

    public abstract void d(double d10, double[] dArr);

    public abstract void e(double d10, float[] fArr);

    public abstract double f(double d10, int i10);

    public abstract void g(double d10, double[] dArr);

    public abstract double[] h();
}
