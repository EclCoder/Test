package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import mc.p;
import mc.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class c extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f20111b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f20117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20122m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p f20124o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f20125p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f20110a = q.l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f20112c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f20113d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f20114e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f20115f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f20116g = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20123n = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return c.this;
        }
    }

    c(p pVar) {
        this.f20124o = pVar;
        Paint paint = new Paint(1);
        this.f20111b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        Rect rect = this.f20113d;
        copyBounds(rect);
        float fHeight = this.f20117h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{e0.a.g(this.f20118i, this.f20122m), e0.a.g(this.f20119j, this.f20122m), e0.a.g(e0.a.k(this.f20119j, 0), this.f20122m), e0.a.g(e0.a.k(this.f20121l, 0), this.f20122m), e0.a.g(this.f20121l, this.f20122m), e0.a.g(this.f20120k, this.f20122m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    protected RectF b() {
        this.f20115f.set(getBounds());
        return this.f20115f;
    }

    void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f20122m = colorStateList.getColorForState(getState(), this.f20122m);
        }
        this.f20125p = colorStateList;
        this.f20123n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f20117h != f10) {
            this.f20117h = f10;
            this.f20111b.setStrokeWidth(f10 * 1.3333f);
            this.f20123n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f20123n) {
            this.f20111b.setShader(a());
            this.f20123n = false;
        }
        float strokeWidth = this.f20111b.getStrokeWidth() / 2.0f;
        copyBounds(this.f20113d);
        this.f20114e.set(this.f20113d);
        float fMin = Math.min(this.f20124o.A().a(b()), this.f20114e.width() / 2.0f);
        if (this.f20124o.E(b())) {
            this.f20114e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f20114e, fMin, fMin, this.f20111b);
        }
    }

    void e(int i10, int i11, int i12, int i13) {
        this.f20118i = i10;
        this.f20119j = i11;
        this.f20120k = i12;
        this.f20121l = i13;
    }

    public void f(p pVar) {
        this.f20124o = pVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f20116g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f20117h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f20124o.E(b())) {
            outline.setRoundRect(getBounds(), this.f20124o.A().a(b()));
        } else {
            copyBounds(this.f20113d);
            this.f20114e.set(this.f20113d);
            this.f20110a.d(this.f20124o, 1.0f, this.f20114e, this.f20112c);
            com.google.android.material.drawable.c.l(outline, this.f20112c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f20124o.E(b())) {
            return true;
        }
        int iRound = Math.round(this.f20117h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f20125p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f20123n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f20125p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f20122m)) != this.f20122m) {
            this.f20123n = true;
            this.f20122m = colorForState;
        }
        if (this.f20123n) {
            invalidateSelf();
        }
        return this.f20123n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f20111b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20111b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
