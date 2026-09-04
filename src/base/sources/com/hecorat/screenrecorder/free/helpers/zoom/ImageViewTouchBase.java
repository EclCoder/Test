package com.hecorat.screenrecorder.free.helpers.zoom;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ImageViewTouchBase extends AppCompatImageView implements View.OnTouchListener {
    public static final /* synthetic */ int D = 0;
    protected int A;
    protected int B;
    private float C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Matrix f23015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Matrix f23016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Matrix f23017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Matrix f23018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Runnable f23019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f23020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected float f23021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f23022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f23023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f23024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final float[] f23025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected c f23026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f23027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f23028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f23029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f23030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f23031q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected PointF f23032r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected RectF f23033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected RectF f23034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected RectF f23035u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected PointF f23036v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected RectF f23037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected RectF f23038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final RectF f23039y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Animator f23040z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f23041a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f23042b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f23043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f23044d;

        a(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
            this.f23043c = valueAnimator;
            this.f23044d = valueAnimator2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) this.f23043c.getAnimatedValue()).floatValue();
            float fFloatValue2 = ((Float) this.f23044d.getAnimatedValue()).floatValue();
            ImageViewTouchBase.this.C(fFloatValue - this.f23041a, fFloatValue2 - this.f23042b);
            this.f23041a = fFloatValue;
            this.f23042b = fFloatValue2;
            ImageViewTouchBase.this.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER,
        FIT_HEIGHT,
        FIT_WIDTH
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ void c(ImageViewTouchBase imageViewTouchBase, float f10, float f11, ValueAnimator valueAnimator) {
        imageViewTouchBase.getClass();
        imageViewTouchBase.P(((Float) valueAnimator.getAnimatedValue()).floatValue(), f10, f11);
        imageViewTouchBase.postInvalidateOnAnimation();
    }

    private boolean f() {
        RectF rectFN = n(getImageViewMatrix());
        if (rectFN == null) {
            return false;
        }
        rectFN.height();
        float fWidth = rectFN.width();
        o(this);
        float fQ = q(this);
        if (fWidth <= fQ) {
            this.A = 2;
        } else if (rectFN.left >= 0.0f) {
            this.A = 0;
        } else if (rectFN.right <= fQ) {
            this.A = 1;
        } else {
            this.A = -1;
        }
        return true;
    }

    private RectF n(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f23039y.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f23039y);
        return this.f23039y;
    }

    private int o(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    private int q(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    protected void A(float f10, float f11, float f12, float f13) {
        this.f23037w.set(f10, f11, f12, f13);
        this.f23032r.x = this.f23037w.centerX();
        this.f23032r.y = this.f23037w.centerY();
    }

    protected void C(double d10, double d11) {
        RectF bitmapRect = getBitmapRect();
        this.f23036v.set((float) d10, (float) d11);
        N(bitmapRect, this.f23036v);
        PointF pointF = this.f23036v;
        float f10 = pointF.x;
        if (f10 == 0.0f && pointF.y == 0.0f) {
            return;
        }
        E(f10, pointF.y);
        e(true, true);
    }

    protected void D(float f10, float f11, float f12) {
        this.f23016b.postScale(f10, f10, f11, f12);
        setImageMatrix(getImageViewMatrix());
    }

    protected void E(float f10, float f11) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        this.f23016b.postTranslate(f10, f11);
        setImageMatrix(getImageViewMatrix());
    }

    public void F(Matrix matrix) {
        t(matrix, 0);
        t(matrix, 4);
        t(matrix, 2);
        t(matrix, 5);
    }

    public void G(float f10, float f11) {
        C(f10, f11);
    }

    protected void H(float f10, float f11, long j10) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, f10).setDuration(j10);
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, f11).setDuration(j10);
        L();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f23040z = animatorSet;
        animatorSet.playTogether(duration, duration2);
        this.f23040z.setDuration(j10);
        this.f23040z.setInterpolator(new DecelerateInterpolator());
        this.f23040z.start();
        duration2.addUpdateListener(new a(duration, duration2));
        this.f23040z.addListener(new b());
    }

    public void I(Bitmap bitmap, Matrix matrix, float f10, float f11) {
        if (bitmap != null) {
            J(new rg.a(bitmap), matrix, f10, f11);
        } else {
            J(null, matrix, f10, f11);
        }
    }

    public void J(final Drawable drawable, final Matrix matrix, final float f10, final float f11) {
        if (getWidth() <= 0) {
            this.f23019e = new Runnable() { // from class: com.hecorat.screenrecorder.free.helpers.zoom.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23056a.J(drawable, matrix, f10, f11);
                }
            };
        } else {
            K(drawable, matrix, f10, f11);
        }
    }

    protected void K(Drawable drawable, Matrix matrix, float f10, float f11) {
        this.f23015a.reset();
        super.setImageDrawable(drawable);
        if (f10 == -1.0f || f11 == -1.0f) {
            this.f23022h = -1.0f;
            this.f23021g = -1.0f;
            this.f23024j = false;
            this.f23023i = false;
        } else {
            float fMin = Math.min(f10, f11);
            float fMax = Math.max(fMin, f11);
            this.f23022h = fMin;
            this.f23021g = fMax;
            this.f23024j = true;
            this.f23023i = true;
            if (getDisplayType() == c.FIT_TO_SCREEN || getDisplayType() == c.FIT_IF_BIGGER) {
                if (this.f23022h >= 1.0f) {
                    this.f23024j = false;
                    this.f23022h = -1.0f;
                }
                if (this.f23021g <= 1.0f) {
                    this.f23023i = true;
                    this.f23021g = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.f23018d = new Matrix(matrix);
        }
        this.f23028n = true;
        M(drawable);
        requestLayout();
    }

    protected void L() {
        Animator animator = this.f23040z;
        if (animator != null) {
            animator.cancel();
            this.f23040z = null;
        }
    }

    protected void M(Drawable drawable) {
        if (drawable != null) {
            this.f23033s.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            this.f23033s.setEmpty();
        }
    }

    protected void O(float f10) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        if (f10 < getMinScale()) {
            f10 = getMinScale();
        }
        PointF center = getCenter();
        P(f10, center.x, center.y);
    }

    protected void P(float f10, float f11, float f12) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        D(f10 / getScale(), f11, f12);
        B(getScale());
        e(true, true);
    }

    protected void Q(float f10, float f11, float f12, long j10) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        float scale = getScale();
        Matrix matrix = new Matrix(this.f23016b);
        matrix.postScale(f10, f10, f11, f12);
        RectF rectFL = l(matrix, true, true);
        final float f13 = f11 + (rectFL.left * f10);
        final float f14 = f12 + (rectFL.top * f10);
        L();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(scale, f10);
        valueAnimatorOfFloat.setDuration(j10);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.hecorat.screenrecorder.free.helpers.zoom.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ImageViewTouchBase.c(this.f23053a, f13, f14, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public void R(float f10, long j10) {
        PointF center = getCenter();
        Q(f10, center.x, center.y, j10);
    }

    protected void e(boolean z10, boolean z11) {
        if (getDrawable() == null) {
            return;
        }
        RectF rectFL = l(this.f23016b, z10, z11);
        float f10 = rectFL.left;
        if (f10 == 0.0f && rectFL.top == 0.0f) {
            return;
        }
        E(f10, rectFL.top);
    }

    protected float g() {
        if (getDrawable() == null) {
            return 1.0f;
        }
        return Math.max(this.f23033s.width() / this.f23037w.width(), this.f23033s.height() / this.f23037w.height()) * 4.0f;
    }

    public float getBaseScale() {
        return s(this.f23015a);
    }

    public boolean getBitmapChanged() {
        return this.f23028n;
    }

    public RectF getBitmapRect() {
        return k(this.f23016b);
    }

    protected PointF getCenter() {
        return this.f23032r;
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.f23016b);
    }

    public c getDisplayType() {
        return this.f23026l;
    }

    public Matrix getImageViewMatrix() {
        return p(this.f23016b);
    }

    public float getMaxScale() {
        if (this.f23021g == -1.0f) {
            this.f23021g = g();
        }
        return this.f23021g;
    }

    public float getMinScale() {
        if (this.f23022h == -1.0f) {
            this.f23022h = h();
        }
        return this.f23022h;
    }

    @Override // android.view.View
    public float getRotation() {
        return 0.0f;
    }

    public float getScale() {
        return s(this.f23016b);
    }

    protected float h() {
        if (getDrawable() == null) {
            return 1.0f;
        }
        return Math.min(1.0f, 1.0f / s(this.f23015a));
    }

    protected RectF k(Matrix matrix) {
        p(matrix).mapRect(this.f23034t, this.f23033s);
        return this.f23034t;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    protected RectF l(Matrix matrix, boolean z10, boolean z11) {
        float fHeight;
        float f10;
        float f11;
        float fWidth;
        if (getDrawable() == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.f23035u.set(0.0f, 0.0f, 0.0f, 0.0f);
        RectF rectFK = k(matrix);
        float fHeight2 = rectFK.height();
        float fWidth2 = rectFK.width();
        if (!z11) {
            fHeight = 0.0f;
        } else if (fHeight2 < this.f23037w.height()) {
            fHeight = ((this.f23037w.height() - fHeight2) / 2.0f) - (rectFK.top - this.f23037w.top);
        } else {
            float f12 = rectFK.top;
            RectF rectF = this.f23037w;
            float f13 = rectF.top;
            if (f12 > f13) {
                fHeight = -(f12 - f13);
            } else {
                float f14 = rectFK.bottom;
                float f15 = rectF.bottom;
                if (f14 < f15) {
                    fHeight = f15 - f14;
                } else {
                    fHeight = 0.0f;
                }
            }
        }
        if (z10) {
            if (fWidth2 < this.f23037w.width()) {
                fWidth = (this.f23037w.width() - fWidth2) / 2.0f;
                f11 = rectFK.left - this.f23037w.left;
            } else {
                float f16 = rectFK.left;
                RectF rectF2 = this.f23037w;
                float f17 = rectF2.left;
                if (f16 > f17) {
                    f10 = -(f16 - f17);
                } else {
                    f11 = rectFK.right;
                    fWidth = rectF2.right;
                    if (f11 >= fWidth) {
                        f10 = 0.0f;
                    }
                }
            }
            f10 = fWidth - f11;
        } else {
            f10 = 0.0f;
        }
        this.f23035u.set(f10, fHeight, 0.0f, 0.0f);
        return this.f23035u;
    }

    protected float m(c cVar) {
        if (cVar == c.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (cVar == c.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / s(this.f23015a));
        }
        if (cVar == c.FIT_HEIGHT) {
            return getHeight() / (v(this.f23015a) * this.f23033s.height());
        }
        return cVar == c.FIT_WIDTH ? getWidth() / (u(this.f23015a) * this.f23033s.width()) : 1.0f / s(this.f23015a);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f23020f) {
            this.f23020f = Math.abs(getScale() - getMinScale()) > 0.1f;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (getScaleType() != ImageView.ScaleType.FIT_XY) {
            super.onDraw(canvas);
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float fWidth;
        float fHeight;
        float fM;
        float f10;
        if (z10) {
            this.f23038x.set(this.f23037w);
            A(i10, i11, i12, i13);
            fWidth = this.f23037w.width() - this.f23038x.width();
            fHeight = this.f23037w.height() - this.f23038x.height();
        } else {
            fWidth = 0.0f;
            fHeight = 0.0f;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.f23019e;
        if (runnable != null) {
            this.f23019e = null;
            runnable.run();
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            if (this.f23028n) {
                x(drawable);
            }
            if (z10 || this.f23028n || this.f23027m) {
                z(i10, i11, i12, i13);
            }
            if (this.f23028n) {
                this.f23028n = false;
            }
            if (this.f23027m) {
                this.f23027m = false;
                return;
            }
            return;
        }
        if (z10 || this.f23027m || this.f23028n) {
            if (this.f23028n) {
                this.f23020f = false;
                this.f23015a.reset();
                if (!this.f23024j) {
                    this.f23022h = -1.0f;
                }
                if (!this.f23023i) {
                    this.f23021g = -1.0f;
                }
            }
            m(getDisplayType());
            float fS = s(this.f23015a);
            float scale = getScale();
            float fMin = Math.min(1.0f, 1.0f / fS);
            r(drawable, this.f23015a, this.f23037w);
            float fS2 = s(this.f23015a);
            if (this.f23028n || this.f23027m) {
                Matrix matrix = this.f23018d;
                if (matrix != null) {
                    this.f23016b.set(matrix);
                    this.f23018d = null;
                    fM = getScale();
                } else {
                    this.f23016b.reset();
                    fM = m(getDisplayType());
                }
                f10 = fM;
                setImageMatrix(getImageViewMatrix());
                if (f10 != getScale()) {
                    O(f10);
                }
            } else if (z10) {
                if (!this.f23024j) {
                    this.f23022h = -1.0f;
                }
                if (!this.f23023i) {
                    this.f23021g = -1.0f;
                }
                setImageMatrix(getImageViewMatrix());
                E(-fWidth, -fHeight);
                if (this.f23020f) {
                    f10 = Math.abs(scale - fMin) > 0.1f ? (fS / fS2) * scale : 1.0f;
                    O(f10);
                } else {
                    float fM2 = m(getDisplayType());
                    O(fM2);
                    f10 = fM2;
                }
            } else {
                f10 = 1.0f;
            }
            if (f10 > getMaxScale() || f10 < getMinScale()) {
                O(f10);
            }
            e(true, true);
            if (this.f23028n) {
                x(drawable);
            }
            if (z10 || this.f23028n || this.f23027m) {
                z(i10, i11, i12, i13);
            }
            if (this.f23027m) {
                this.f23027m = false;
            }
            if (this.f23028n) {
                this.f23028n = false;
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float f10 = x10 - this.C;
        if (f10 > 0.0f) {
            this.B = 0;
        } else if (f10 < 0.0f) {
            this.B = 1;
        }
        ViewParent parent = view.getParent();
        int i10 = this.A;
        if (i10 == 2 || ((i10 == 0 && this.B == 0) || (i10 == 1 && this.B == 1))) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        } else if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.C = x10;
        return false;
    }

    public Matrix p(Matrix matrix) {
        this.f23017c.set(this.f23015a);
        this.f23017c.postConcat(matrix);
        return this.f23017c;
    }

    protected void r(Drawable drawable, Matrix matrix, RectF rectF) {
        float fWidth = this.f23033s.width();
        float fHeight = this.f23033s.height();
        matrix.reset();
        float fMin = Math.min(rectF.width() / fWidth, rectF.height() / fHeight);
        matrix.postScale(fMin, fMin);
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.postTranslate((rectF.width() - (fWidth * fMin)) / 2.0f, (rectF.height() - (fHeight * fMin)) / 2.0f);
        F(matrix);
    }

    protected float s(Matrix matrix) {
        return t(matrix, 0);
    }

    public void setDisplayType(c cVar) {
        if (cVar != this.f23026l) {
            this.f23020f = false;
            this.f23026l = cVar;
            this.f23027m = true;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        I(bitmap, null, -1.0f, -1.0f);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        J(drawable, null, -1.0f, -1.0f);
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        boolean z10 = (matrix == null && !imageMatrix.isIdentity()) || !(matrix == null || imageMatrix.equals(matrix));
        super.setImageMatrix(matrix);
        if (z10) {
            f();
            y();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        setImageDrawable(getContext().getResources().getDrawable(i10));
    }

    protected void setMaxScale(float f10) {
        this.f23021g = f10;
    }

    protected void setMinScale(float f10) {
        this.f23022h = f10;
    }

    protected float t(Matrix matrix, int i10) {
        matrix.getValues(this.f23025k);
        return this.f23025k[i10];
    }

    protected float u(Matrix matrix) {
        return t(matrix, 0);
    }

    protected float v(Matrix matrix) {
        return t(matrix, 4);
    }

    protected void w(Context context, AttributeSet attributeSet, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f23030p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f23031q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23029o = getResources().getInteger(R.integer.config_shortAnimTime);
        setOnTouchListener(this);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    protected void x(Drawable drawable) {
        i(drawable);
    }

    protected void z(int i10, int i11, int i12, int i13) {
        j(i10, i11, i12, i13);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23015a = new Matrix();
        this.f23016b = new Matrix();
        this.f23017c = new Matrix();
        this.f23019e = null;
        this.f23020f = false;
        this.f23021g = -1.0f;
        this.f23022h = -1.0f;
        this.f23025k = new float[9];
        this.f23026l = c.FIT_IF_BIGGER;
        this.f23032r = new PointF();
        this.f23033s = new RectF();
        this.f23034t = new RectF();
        this.f23035u = new RectF();
        this.f23036v = new PointF();
        this.f23037w = new RectF();
        this.f23038x = new RectF();
        this.f23039y = new RectF();
        this.A = 2;
        this.B = -1;
        w(context, attributeSet, i10);
    }

    protected void y() {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ImageViewTouchBase imageViewTouchBase = ImageViewTouchBase.this;
            RectF rectFL = imageViewTouchBase.l(imageViewTouchBase.f23016b, true, true);
            float f10 = rectFL.left;
            if (f10 == 0.0f && rectFL.top == 0.0f) {
                return;
            }
            ImageViewTouchBase.this.G(f10, rectFL.top);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    protected void B(float f10) {
    }

    protected void i(Drawable drawable) {
    }

    public void setOnDrawableChangedListener(d dVar) {
    }

    public void setOnLayoutChangeListener(e eVar) {
    }

    protected void N(RectF rectF, PointF pointF) {
    }

    protected void j(int i10, int i11, int i12, int i13) {
    }
}
