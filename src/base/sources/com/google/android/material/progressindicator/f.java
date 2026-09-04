package com.google.android.material.progressindicator;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import com.google.android.material.progressindicator.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends g {
    private static final f1.f B = new a("indicatorLevel");
    private TimeInterpolator A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h f20788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final f1.h f20789s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final h.a f20790t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f20791u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f20792v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ValueAnimator f20793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ValueAnimator f20794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TimeInterpolator f20795y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TimeInterpolator f20796z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends f1.f {
        a(String str) {
            super(str);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(f fVar) {
            return fVar.F() * 10000.0f;
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f10) {
            fVar.M(f10 / 10000.0f);
            fVar.H((int) f10);
        }
    }

    f(Context context, final b bVar, h hVar) {
        super(context, bVar);
        this.f20792v = false;
        K(hVar);
        h.a aVar = new h.a();
        this.f20790t = aVar;
        aVar.f20828h = true;
        f1.h hVar2 = new f1.h(this, B);
        this.f20789s = hVar2;
        hVar2.x(new f1.i().f(1.0f).h(50.0f));
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f20793w = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ic.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                f.v(this.f41322a, bVar, valueAnimator2);
            }
        });
        if (bVar.b(true) && bVar.f20742m != 0) {
            valueAnimator.start();
        }
        p(1.0f);
    }

    static f B(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, c cVar) {
        return new f(context, circularProgressIndicatorSpec, cVar);
    }

    static f C(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, k kVar) {
        return new f(context, linearProgressIndicatorSpec, kVar);
    }

    private float D(int i10) {
        float f10 = i10;
        b bVar = this.f20799b;
        return (f10 < bVar.f20744o * 10000.0f || f10 > bVar.f20745p * 10000.0f) ? 0.0f : 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float F() {
        return this.f20790t.f20822b;
    }

    private void G() {
        if (this.f20794x != null) {
            return;
        }
        Context context = this.f20798a;
        int i10 = sb.c.Z;
        TimeInterpolator timeInterpolator = tb.b.f53275a;
        this.f20796z = gc.j.g(context, i10, timeInterpolator);
        this.A = gc.j.g(this.f20798a, sb.c.S, timeInterpolator);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f20794x = valueAnimator;
        valueAnimator.setDuration(500L);
        this.f20794x.setFloatValues(0.0f, 1.0f);
        this.f20794x.setInterpolator(null);
        this.f20794x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ic.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                f fVar = this.f41324a;
                fVar.f20790t.f20825e = fVar.f20795y.getInterpolation(fVar.f20794x.getAnimatedFraction());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i10) {
        if (this.f20799b.b(true)) {
            G();
            float fD = D(i10);
            if (fD == this.f20791u) {
                if (this.f20794x.isRunning()) {
                    return;
                }
                J(fD);
                return;
            }
            if (this.f20794x.isRunning()) {
                this.f20794x.cancel();
            }
            this.f20791u = fD;
            if (fD == 1.0f) {
                this.f20795y = this.f20796z;
                this.f20794x.start();
            } else {
                this.f20795y = this.A;
                this.f20794x.reverse();
            }
        }
    }

    private void J(float f10) {
        this.f20790t.f20825e = f10;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(float f10) {
        this.f20790t.f20822b = f10;
        invalidateSelf();
    }

    private void Q() {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth <= 0 || iHeight <= 0) {
            return;
        }
        if (this.f20788r instanceof k) {
            this.f20789s.l(10000.0f / iWidth);
        } else {
            this.f20789s.l((float) (10000.0d / (((double) Math.min(iHeight, iWidth)) * 3.141592653589793d)));
        }
    }

    public static /* synthetic */ void v(f fVar, b bVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        if (bVar.b(true) && bVar.f20742m != 0 && fVar.isVisible()) {
            fVar.invalidateSelf();
        }
    }

    public void A(f1.e.p pVar) {
        this.f20789s.b(pVar);
    }

    h E() {
        return this.f20788r;
    }

    public void I(f1.e.p pVar) {
        this.f20789s.i(pVar);
    }

    void K(h hVar) {
        this.f20788r = hVar;
    }

    void L(boolean z10) {
        if (z10 && !this.f20793w.isRunning()) {
            this.f20793w.start();
        } else {
            if (z10 || !this.f20793w.isRunning()) {
                return;
            }
            this.f20793w.cancel();
        }
    }

    void N(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    void O(float f10) {
        this.f20799b.f20745p = f10;
        invalidateSelf();
    }

    void P(float f10) {
        this.f20799b.f20744o = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f20813p)) {
            canvas.save();
            this.f20788r.h(canvas, getBounds(), h(), m(), l());
            this.f20790t.f20826f = i();
            this.f20811n.setStyle(Paint.Style.FILL);
            this.f20811n.setAntiAlias(true);
            h.a aVar = this.f20790t;
            b bVar = this.f20799b;
            aVar.f20823c = bVar.f20734e[0];
            int iA = bVar.f20738i;
            if (iA > 0) {
                if (!(this.f20788r instanceof k)) {
                    iA = (int) ((iA * h0.a.a(F(), 0.0f, 0.01f)) / 0.01f);
                }
                this.f20788r.d(canvas, this.f20811n, F(), 1.0f, this.f20799b.f20735f, getAlpha(), iA);
            } else {
                this.f20788r.d(canvas, this.f20811n, 0.0f, 1.0f, bVar.f20735f, getAlpha(), 0);
            }
            this.f20788r.c(canvas, this.f20811n, this.f20790t, getAlpha());
            this.f20788r.b(canvas, this.f20811n, this.f20799b.f20734e[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f20788r.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20788r.f();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f20789s.y();
        M(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ void o(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.o(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        float fD = D(i10);
        if (this.f20792v) {
            this.f20789s.y();
            M(i10 / 10000.0f);
            J(fD);
            return true;
        }
        Q();
        this.f20789s.n(F() * 10000.0f);
        this.f20789s.s(i10);
        return true;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean s(boolean z10, boolean z11, boolean z12) {
        return super.s(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.g
    boolean t(boolean z10, boolean z11, boolean z12) {
        boolean zT = super.t(z10, z11, z12);
        float fA = this.f20800c.a(this.f20798a.getContentResolver());
        if (fA == 0.0f) {
            this.f20792v = true;
            return zT;
        }
        this.f20792v = false;
        this.f20789s.u().h(50.0f / fA);
        return zT;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean u(androidx.vectordrawable.graphics.drawable.b bVar) {
        return super.u(bVar);
    }
}
