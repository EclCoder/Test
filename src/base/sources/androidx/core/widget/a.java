package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f3397r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f3400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f3401d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3405h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f3409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f3410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f3411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f3412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f3413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f3414q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0031a f3398a = new C0031a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f3399b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f3402e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f3403f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f3406i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f3407j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f3408k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0031a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f3417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f3418d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f3424j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f3425k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f3419e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f3423i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f3420f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f3421g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f3422h = 0;

        C0031a() {
        }

        private float e(long j10) {
            long j11 = this.f3419e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f3423i;
            if (j12 < 0 || j10 < j12) {
                return a.e((j10 - j11) / this.f3415a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f3424j;
            return (1.0f - f10) + (f10 * a.e((j10 - j12) / this.f3425k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f3420f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f3420f;
            this.f3420f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f3421g = (int) (this.f3417c * f10);
            this.f3422h = (int) (f10 * this.f3418d);
        }

        public int b() {
            return this.f3421g;
        }

        public int c() {
            return this.f3422h;
        }

        public int d() {
            float f10 = this.f3417c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f3418d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f3423i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3423i + ((long) this.f3425k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3425k = a.f((int) (jCurrentAnimationTimeMillis - this.f3419e), 0, this.f3416b);
            this.f3424j = e(jCurrentAnimationTimeMillis);
            this.f3423i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f3416b = i10;
        }

        public void k(int i10) {
            this.f3415a = i10;
        }

        public void l(float f10, float f11) {
            this.f3417c = f10;
            this.f3418d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3419e = jCurrentAnimationTimeMillis;
            this.f3423i = -1L;
            this.f3420f = jCurrentAnimationTimeMillis;
            this.f3424j = 0.5f;
            this.f3421g = 0;
            this.f3422h = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f3412o) {
                if (aVar.f3410m) {
                    aVar.f3410m = false;
                    aVar.f3398a.m();
                }
                C0031a c0031a = a.this.f3398a;
                if (c0031a.h() || !a.this.u()) {
                    a.this.f3412o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f3411n) {
                    aVar2.f3411n = false;
                    aVar2.c();
                }
                c0031a.a();
                a.this.j(c0031a.b(), c0031a.c());
                q0.e0(a.this.f3400c, this);
            }
        }
    }

    public a(View view) {
        this.f3400c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f3397r);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f3402e[i10], f11, this.f3403f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f3406i[i10];
        float f14 = this.f3407j[i10];
        float f15 = this.f3408k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f3404g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f3412o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f3399b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f3399b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f3410m) {
            this.f3412o = false;
        } else {
            this.f3398a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f3401d == null) {
            this.f3401d = new b();
        }
        this.f3412o = true;
        this.f3410m = true;
        if (this.f3409l || (i10 = this.f3405h) <= 0) {
            this.f3401d.run();
        } else {
            q0.f0(this.f3400c, this.f3401d, i10);
        }
        this.f3409l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3400c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f3405h = i10;
        return this;
    }

    public a l(int i10) {
        this.f3404g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f3413p && !z10) {
            i();
        }
        this.f3413p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f3403f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f3408k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f3413p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return !this.f3414q && this.f3412o;
        }
        this.f3411n = true;
        this.f3409l = false;
        this.f3398a.l(d(0, motionEvent.getX(), view.getWidth(), this.f3400c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f3400c.getHeight()));
        if (!this.f3412o && u()) {
            v();
        }
        if (this.f3414q) {
        }
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f3407j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f3398a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f3398a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f3402e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f3406i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0031a c0031a = this.f3398a;
        int iF = c0031a.f();
        int iD = c0031a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }
}
