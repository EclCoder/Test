package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f1875a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f1877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f1878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1879e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f1882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f1883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f1884j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1880f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1881g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f1885k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f1876b = new Paint(5);

    d(ColorStateList colorStateList, float f10) {
        this.f1875a = f10;
        e(colorStateList);
        this.f1877c = new RectF();
        this.f1878d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1882h = colorStateList;
        this.f1876b.setColor(colorStateList.getColorForState(getState(), this.f1882h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1877c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1878d.set(rect);
        if (this.f1880f) {
            this.f1878d.inset((int) Math.ceil(e.a(this.f1879e, this.f1875a, this.f1881g)), (int) Math.ceil(e.b(this.f1879e, this.f1875a, this.f1881g)));
            this.f1877c.set(this.f1878d);
        }
    }

    public ColorStateList b() {
        return this.f1882h;
    }

    float c() {
        return this.f1879e;
    }

    public float d() {
        return this.f1875a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f1876b;
        if (this.f1883i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f1883i);
            z10 = true;
        }
        RectF rectF = this.f1877c;
        float f10 = this.f1875a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f1879e && this.f1880f == z10 && this.f1881g == z11) {
            return;
        }
        this.f1879e = f10;
        this.f1880f = z10;
        this.f1881g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1878d, this.f1875a);
    }

    void h(float f10) {
        if (f10 == this.f1875a) {
            return;
        }
        this.f1875a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1884j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f1882h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1882h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f1876b.getColor();
        if (z10) {
            this.f1876b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1884j;
        if (colorStateList2 == null || (mode = this.f1885k) == null) {
            return z10;
        }
        this.f1883i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f1876b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1876b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1884j = colorStateList;
        this.f1883i = a(colorStateList, this.f1885k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1885k = mode;
        this.f1883i = a(this.f1884j, mode);
        invalidateSelf();
    }
}
