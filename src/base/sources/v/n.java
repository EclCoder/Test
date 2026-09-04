package v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f54972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f54973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f54974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f54975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f54976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f54977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f54978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f54979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f54981k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f54983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f54984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f54985o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f54982l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f54986p = false;

    private float c(float f10) {
        this.f54986p = false;
        float f11 = this.f54974d;
        if (f10 <= f11) {
            float f12 = this.f54971a;
            return (f12 * f10) + ((((this.f54972b - f12) * f10) * f10) / (f11 * 2.0f));
        }
        int i10 = this.f54980j;
        if (i10 == 1) {
            return this.f54977g;
        }
        float f13 = f10 - f11;
        float f14 = this.f54975e;
        if (f13 < f14) {
            float f15 = this.f54977g;
            float f16 = this.f54972b;
            return f15 + (f16 * f13) + ((((this.f54973c - f16) * f13) * f13) / (f14 * 2.0f));
        }
        if (i10 == 2) {
            return this.f54978h;
        }
        float f17 = f13 - f14;
        float f18 = this.f54976f;
        if (f17 > f18) {
            this.f54986p = true;
            return this.f54979i;
        }
        float f19 = this.f54978h;
        float f20 = this.f54973c;
        return (f19 + (f20 * f17)) - (((f20 * f17) * f17) / (f18 * 2.0f));
    }

    private void f(float f10, float f11, float f12, float f13, float f14) {
        this.f54986p = false;
        this.f54979i = f11;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f54981k = "backward accelerate, decelerate";
                this.f54980j = 2;
                this.f54971a = f10;
                this.f54972b = fSqrt;
                this.f54973c = 0.0f;
                float f17 = (fSqrt - f10) / f12;
                this.f54974d = f17;
                this.f54975e = fSqrt / f12;
                this.f54977g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f54978h = f11;
                this.f54979i = f11;
                return;
            }
            this.f54981k = "backward accelerate cruse decelerate";
            this.f54980j = 3;
            this.f54971a = f10;
            this.f54972b = f13;
            this.f54973c = f13;
            float f18 = (f13 - f10) / f12;
            this.f54974d = f18;
            float f19 = f13 / f12;
            this.f54976f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f54975e = ((f11 - f20) - f21) / f13;
            this.f54977g = f20;
            this.f54978h = f11 - f21;
            this.f54979i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f54981k = "hard stop";
            this.f54980j = 1;
            this.f54971a = f10;
            this.f54972b = 0.0f;
            this.f54977g = f11;
            this.f54974d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.f54981k = "cruse decelerate";
            this.f54980j = 2;
            this.f54971a = f10;
            this.f54972b = f10;
            this.f54973c = 0.0f;
            this.f54977g = f22;
            this.f54978h = f11;
            this.f54974d = f23;
            this.f54975e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f12 * f11) + ((f10 * f10) / 2.0f));
        float f24 = (fSqrt2 - f10) / f12;
        this.f54974d = f24;
        float f25 = fSqrt2 / f12;
        this.f54975e = f25;
        if (fSqrt2 < f13) {
            this.f54981k = "accelerate decelerate";
            this.f54980j = 2;
            this.f54971a = f10;
            this.f54972b = fSqrt2;
            this.f54973c = 0.0f;
            this.f54974d = f24;
            this.f54975e = f25;
            this.f54977g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f54978h = f11;
            return;
        }
        this.f54981k = "accelerate cruse decelerate";
        this.f54980j = 3;
        this.f54971a = f10;
        this.f54972b = f13;
        this.f54973c = f13;
        float f26 = (f13 - f10) / f12;
        this.f54974d = f26;
        float f27 = f13 / f12;
        this.f54976f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f54975e = ((f11 - f28) - f29) / f13;
        this.f54977g = f28;
        this.f54978h = f11 - f29;
        this.f54979i = f11;
    }

    @Override // v.m
    public float a() {
        return this.f54982l ? -e(this.f54985o) : e(this.f54985o);
    }

    @Override // v.m
    public boolean b() {
        return a() < 1.0E-5f && Math.abs(this.f54979i - this.f54984n) < 1.0E-5f;
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f54986p = false;
        this.f54983m = f10;
        boolean z10 = f10 > f11;
        this.f54982l = z10;
        if (z10) {
            f(-f12, f10 - f11, f14, f15, f13);
        } else {
            f(f12, f11 - f10, f14, f15, f13);
        }
    }

    public float e(float f10) {
        float f11 = this.f54974d;
        if (f10 <= f11) {
            float f12 = this.f54971a;
            return f12 + (((this.f54972b - f12) * f10) / f11);
        }
        int i10 = this.f54980j;
        if (i10 == 1) {
            return 0.0f;
        }
        float f13 = f10 - f11;
        float f14 = this.f54975e;
        if (f13 < f14) {
            float f15 = this.f54972b;
            return f15 + (((this.f54973c - f15) * f13) / f14);
        }
        if (i10 == 2) {
            return 0.0f;
        }
        float f16 = f13 - f14;
        float f17 = this.f54976f;
        if (f16 >= f17) {
            return 0.0f;
        }
        float f18 = this.f54973c;
        return f18 - ((f16 * f18) / f17);
    }

    @Override // v.m
    public float getInterpolation(float f10) {
        float fC = c(f10);
        this.f54984n = fC;
        this.f54985o = f10;
        return this.f54982l ? this.f54983m - fC : this.f54983m + fC;
    }
}
