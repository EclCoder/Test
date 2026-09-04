package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import m0.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f7296g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f7297h = new m1.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f7298i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f7299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f7300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Resources f7301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f7302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f7303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f7304f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f7305a;

        a(c cVar) {
            this.f7305a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f7305a);
            b.this.b(fFloatValue, this.f7305a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f7309a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f7310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f7311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f7312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f7313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f7314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f7315g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f7316h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f7317i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f7318j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f7319k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f7320l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f7321m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f7322n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f7323o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f7324p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f7325q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f7326r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f7327s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f7328t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f7329u;

        c() {
            Paint paint = new Paint();
            this.f7310b = paint;
            Paint paint2 = new Paint();
            this.f7311c = paint2;
            Paint paint3 = new Paint();
            this.f7312d = paint3;
            this.f7313e = 0.0f;
            this.f7314f = 0.0f;
            this.f7315g = 0.0f;
            this.f7316h = 5.0f;
            this.f7324p = 1.0f;
            this.f7328t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f7319k = this.f7313e;
            this.f7320l = this.f7314f;
            this.f7321m = this.f7315g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f7309a;
            float f10 = this.f7325q;
            float fMin = (this.f7316h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f7326r * this.f7324p) / 2.0f, this.f7316h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f7313e;
            float f12 = this.f7315g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f7314f + f12) * 360.0f) - f13;
            this.f7310b.setColor(this.f7329u);
            this.f7310b.setAlpha(this.f7328t);
            float f15 = this.f7316h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f7312d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f7310b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f7322n) {
                Path path = this.f7323o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f7323o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f7326r * this.f7324p) / 2.0f;
                this.f7323o.moveTo(0.0f, 0.0f);
                this.f7323o.lineTo(this.f7326r * this.f7324p, 0.0f);
                Path path3 = this.f7323o;
                float f13 = this.f7326r;
                float f14 = this.f7324p;
                path3.lineTo((f13 * f14) / 2.0f, this.f7327s * f14);
                this.f7323o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f7316h / 2.0f));
                this.f7323o.close();
                this.f7311c.setColor(this.f7329u);
                this.f7311c.setAlpha(this.f7328t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f7323o, this.f7311c);
                canvas.restore();
            }
        }

        int c() {
            return this.f7328t;
        }

        float d() {
            return this.f7314f;
        }

        int e() {
            return this.f7317i[f()];
        }

        int f() {
            return (this.f7318j + 1) % this.f7317i.length;
        }

        float g() {
            return this.f7313e;
        }

        int h() {
            return this.f7317i[this.f7318j];
        }

        float i() {
            return this.f7320l;
        }

        float j() {
            return this.f7321m;
        }

        float k() {
            return this.f7319k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f7319k = 0.0f;
            this.f7320l = 0.0f;
            this.f7321m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f7328t = i10;
        }

        void o(float f10, float f11) {
            this.f7326r = (int) f10;
            this.f7327s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f7324p) {
                this.f7324p = f10;
            }
        }

        void q(float f10) {
            this.f7325q = f10;
        }

        void r(int i10) {
            this.f7329u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f7310b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f7318j = i10;
            this.f7329u = this.f7317i[i10];
        }

        void u(int[] iArr) {
            this.f7317i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f7314f = f10;
        }

        void w(float f10) {
            this.f7315g = f10;
        }

        void x(boolean z10) {
            if (this.f7322n != z10) {
                this.f7322n = z10;
            }
        }

        void y(float f10) {
            this.f7313e = f10;
        }

        void z(float f10) {
            this.f7316h = f10;
            this.f7310b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f7301c = ((Context) g.g(context)).getResources();
        c cVar = new c();
        this.f7299a = cVar;
        cVar.u(f7298i);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    private void h(float f10) {
        this.f7300b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f7299a;
        float f14 = this.f7301c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f7299a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f7296g);
        valueAnimatorOfFloat.addListener(new C0092b(cVar));
        this.f7302d = valueAnimatorOfFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f7304f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f7297h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f7297h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f7303e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public void d(boolean z10) {
        this.f7299a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f7300b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f7299a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f7299a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f7299a.u(iArr);
        this.f7299a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f7299a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7299a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f7302d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f7299a.y(f10);
        this.f7299a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f7299a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f7299a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7299a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f7302d.cancel();
        this.f7299a.A();
        if (this.f7299a.d() != this.f7299a.g()) {
            this.f7304f = true;
            this.f7302d.setDuration(666L);
            this.f7302d.start();
        } else {
            this.f7299a.t(0);
            this.f7299a.m();
            this.f7302d.setDuration(1332L);
            this.f7302d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f7302d.cancel();
        h(0.0f);
        this.f7299a.x(false);
        this.f7299a.t(0);
        this.f7299a.m();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0092b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f7307a;

        C0092b(c cVar) {
            this.f7307a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f7307a, true);
            this.f7307a.A();
            this.f7307a.l();
            b bVar = b.this;
            if (!bVar.f7304f) {
                bVar.f7303e += 1.0f;
                return;
            }
            bVar.f7304f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f7307a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f7303e = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
