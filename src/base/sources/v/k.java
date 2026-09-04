package v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class k implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f54961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f54962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f54963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f54964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f54965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f54966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f54967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f54968j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f54959a = 0.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54960b = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f54969k = 0;

    private void c(double d10) {
        if (d10 <= 0.0d) {
            return;
        }
        double d11 = this.f54961c;
        double d12 = this.f54959a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.f54967i)) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / ((double) iSqrt);
        int i10 = 0;
        while (i10 < iSqrt) {
            float f10 = this.f54965g;
            double d14 = this.f54962d;
            float f11 = this.f54966h;
            double d15 = d11;
            double d16 = ((-d11) * (((double) f10) - d14)) - (((double) f11) * d12);
            float f12 = this.f54967i;
            double d17 = d12;
            double d18 = ((double) f11) + (((d16 / ((double) f12)) * d13) / 2.0d);
            double d19 = ((((-((((double) f10) + ((d13 * d18) / 2.0d)) - d14)) * d15) - (d18 * d17)) / ((double) f12)) * d13;
            double d20 = ((double) f11) + (d19 / 2.0d);
            float f13 = f11 + ((float) d19);
            this.f54966h = f13;
            float f14 = f10 + ((float) (d20 * d13));
            this.f54965g = f14;
            int i11 = this.f54969k;
            if (i11 > 0) {
                if (f14 < 0.0f && (i11 & 1) == 1) {
                    this.f54965g = -f14;
                    this.f54966h = -f13;
                }
                float f15 = this.f54965g;
                if (f15 > 1.0f && (i11 & 2) == 2) {
                    this.f54965g = 2.0f - f15;
                    this.f54966h = -this.f54966h;
                }
            }
            i10++;
            d11 = d15;
            d12 = d17;
        }
    }

    @Override // v.m
    public float a() {
        return 0.0f;
    }

    @Override // v.m
    public boolean b() {
        double d10 = ((double) this.f54965g) - this.f54962d;
        double d11 = this.f54961c;
        double d12 = this.f54966h;
        return Math.sqrt((((d12 * d12) * ((double) this.f54967i)) + ((d11 * d10) * d10)) / d11) <= ((double) this.f54968j);
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        this.f54962d = f11;
        this.f54959a = f15;
        this.f54960b = false;
        this.f54965g = f10;
        this.f54963e = f12;
        this.f54961c = f14;
        this.f54967i = f13;
        this.f54968j = f16;
        this.f54969k = i10;
        this.f54964f = 0.0f;
    }

    @Override // v.m
    public float getInterpolation(float f10) {
        c(f10 - this.f54964f);
        this.f54964f = f10;
        if (b()) {
            this.f54965g = (float) this.f54962d;
        }
        return this.f54965g;
    }
}
