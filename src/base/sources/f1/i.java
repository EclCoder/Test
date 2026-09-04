package f1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f38209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f38210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f38212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f38213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f38214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f38215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f38216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f38217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e.o f38218j;

    public i() {
        this.f38209a = Math.sqrt(1500.0d);
        this.f38210b = 0.5d;
        this.f38211c = false;
        this.f38217i = Double.MAX_VALUE;
        this.f38218j = new e.o();
    }

    private void d() {
        if (this.f38211c) {
            return;
        }
        if (this.f38217i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f38210b;
        if (d10 > 1.0d) {
            double d11 = this.f38209a;
            this.f38214f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f38210b;
            double d13 = this.f38209a;
            this.f38215g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f38216h = this.f38209a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f38211c = true;
    }

    public float a() {
        return (float) this.f38210b;
    }

    public float b() {
        return (float) this.f38217i;
    }

    public float c() {
        double d10 = this.f38209a;
        return (float) (d10 * d10);
    }

    public boolean e(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f38213e && ((double) Math.abs(f10 - b())) < this.f38212d;
    }

    public i f(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f38210b = f10;
        this.f38211c = false;
        return this;
    }

    public i g(float f10) {
        this.f38217i = f10;
        return this;
    }

    public i h(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f38209a = Math.sqrt(f10);
        this.f38211c = false;
        return this;
    }

    void i(double d10) {
        double dAbs = Math.abs(d10);
        this.f38212d = dAbs;
        this.f38213e = dAbs * 62.5d;
    }

    e.o j(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        d();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f38217i;
        double d14 = this.f38210b;
        if (d14 > 1.0d) {
            double d15 = this.f38215g;
            double d16 = this.f38214f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f38214f * d12) * d18);
            double d19 = this.f38215g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f38214f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f38209a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f38209a) * d12);
            double d24 = this.f38209a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f38216h;
            double d26 = this.f38209a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f38216h * d12) * d13) + (Math.sin(this.f38216h * d12) * d27));
            double d28 = this.f38209a;
            double d29 = this.f38210b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f38216h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f38216h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        e.o oVar = this.f38218j;
        oVar.f38206a = (float) (dPow + this.f38217i);
        oVar.f38207b = (float) dCos;
        return oVar;
    }

    public i(float f10) {
        this.f38209a = Math.sqrt(1500.0d);
        this.f38210b = 0.5d;
        this.f38211c = false;
        this.f38217i = Double.MAX_VALUE;
        this.f38218j = new e.o();
        this.f38217i = f10;
    }
}
