package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import jc.c;
import mc.i;
import mc.p;
import mc.q;
import mc.s;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class ShapeableImageView extends AppCompatImageView implements s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f20228s = l.X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f20229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f20230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f20231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f20232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f20233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f20234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f20235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i f20236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f20237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f20238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f20239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f20242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f20244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20246r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f20247a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f20237i == null) {
                return;
            }
            if (ShapeableImageView.this.f20236h == null) {
                ShapeableImageView.this.f20236h = new i(ShapeableImageView.this.f20237i);
            }
            ShapeableImageView.this.f20230b.round(this.f20247a);
            ShapeableImageView.this.f20236h.setBounds(this.f20247a);
            ShapeableImageView.this.f20236h.getOutline(outline);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20228s;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20229a = q.l();
        this.f20234f = new Path();
        this.f20246r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f20233e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f20230b = new RectF();
        this.f20231c = new RectF();
        this.f20239k = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, m.f52183ta, i10, i11);
        setLayerType(2, null);
        this.f20235g = c.a(context2, typedArrayObtainStyledAttributes, m.Ba);
        this.f20238j = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.Ca, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f52198ua, 0);
        this.f20240l = dimensionPixelSize;
        this.f20241m = dimensionPixelSize;
        this.f20242n = dimensionPixelSize;
        this.f20243o = dimensionPixelSize;
        this.f20240l = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f52243xa, dimensionPixelSize);
        this.f20241m = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.Aa, dimensionPixelSize);
        this.f20242n = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f52258ya, dimensionPixelSize);
        this.f20243o = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f52213va, dimensionPixelSize);
        this.f20244p = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f52273za, Integer.MIN_VALUE);
        this.f20245q = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f52228wa, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f20232d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f20237i = p.k(context2, attributeSet, i10, i11).m();
        setOutlineProvider(new a());
    }

    private void g(Canvas canvas) {
        if (this.f20235g == null) {
            return;
        }
        this.f20232d.setStrokeWidth(this.f20238j);
        int colorForState = this.f20235g.getColorForState(getDrawableState(), this.f20235g.getDefaultColor());
        if (this.f20238j <= 0.0f || colorForState == 0) {
            return;
        }
        this.f20232d.setColor(colorForState);
        canvas.drawPath(this.f20234f, this.f20232d);
    }

    private boolean h() {
        return (this.f20244p == Integer.MIN_VALUE && this.f20245q == Integer.MIN_VALUE) ? false : true;
    }

    private boolean i() {
        return getLayoutDirection() == 1;
    }

    private void j(int i10, int i11) {
        this.f20230b.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f20229a.d(this.f20237i, 1.0f, this.f20230b, this.f20234f);
        this.f20239k.rewind();
        this.f20239k.addPath(this.f20234f);
        this.f20231c.set(0.0f, 0.0f, i10, i11);
        this.f20239k.addRect(this.f20231c, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f20243o;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f20245q;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return i() ? this.f20240l : this.f20242n;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f20245q) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f20244p) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f20240l;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f20244p) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f20245q) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f20242n;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f20244p;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return i() ? this.f20242n : this.f20240l;
    }

    public int getContentPaddingTop() {
        return this.f20241m;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public p getShapeAppearanceModel() {
        return this.f20237i;
    }

    public ColorStateList getStrokeColor() {
        return this.f20235g;
    }

    public float getStrokeWidth() {
        return this.f20238j;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f20239k, this.f20233e);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f20246r && isLayoutDirectionResolved()) {
            this.f20246r = true;
            if (isPaddingRelative() || h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        j(i10, i11);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    @Override // mc.s
    public void setShapeAppearanceModel(p pVar) {
        this.f20237i = pVar;
        i iVar = this.f20236h;
        if (iVar != null) {
            iVar.setShapeAppearanceModel(pVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f20235g = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(i.a.a(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f20238j != f10) {
            this.f20238j = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }
}
