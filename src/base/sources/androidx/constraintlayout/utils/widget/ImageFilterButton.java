package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageFilterView.c f2440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f2442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f2443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f2444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ViewOutlineProvider f2445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    RectF f2446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Drawable[] f2447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    LayerDrawable f2448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f2450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f2451o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f2452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f2453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f2454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f2455s;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterButton.this.f2442f) / 2.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2443g);
        }
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2440d = new ImageFilterView.c();
        this.f2441e = 0.0f;
        this.f2442f = 0.0f;
        this.f2443g = Float.NaN;
        this.f2447k = new Drawable[2];
        this.f2449m = true;
        this.f2450n = null;
        this.f2451o = null;
        this.f2452p = Float.NaN;
        this.f2453q = Float.NaN;
        this.f2454r = Float.NaN;
        this.f2455s = Float.NaN;
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f3109y5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f2450n = typedArrayObtainStyledAttributes.getDrawable(f.f3122z5);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.C5) {
                    this.f2441e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == f.L5) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.K5) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.B5) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.I5) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.J5) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.H5) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f2449m));
                } else if (index == f.D5) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f2452p));
                } else if (index == f.E5) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f2453q));
                } else if (index == f.F5) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f2455s));
                } else if (index == f.G5) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f2454r));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2451o = drawable;
            if (this.f2450n == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2451o = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2447k;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f2451o = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2447k;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f2451o = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f2447k[1] = this.f2450n.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2447k);
            this.f2448l = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2441e * 255.0f));
            if (!this.f2449m) {
                this.f2448l.getDrawable(0).setAlpha((int) ((1.0f - this.f2441e) * 255.0f));
            }
            super.setImageDrawable(this.f2448l);
        }
    }

    private void d() {
        if (Float.isNaN(this.f2452p) && Float.isNaN(this.f2453q) && Float.isNaN(this.f2454r) && Float.isNaN(this.f2455s)) {
            return;
        }
        float f10 = Float.isNaN(this.f2452p) ? 0.0f : this.f2452p;
        float f11 = Float.isNaN(this.f2453q) ? 0.0f : this.f2453q;
        float f12 = Float.isNaN(this.f2454r) ? 1.0f : this.f2454r;
        float f13 = Float.isNaN(this.f2455s) ? 0.0f : this.f2455s;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f14 = f12 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f14, f14);
        float f15 = intrinsicWidth * f14;
        float f16 = f14 * intrinsicHeight;
        matrix.postTranslate((((f10 * (width - f15)) + width) - f15) * 0.5f, (((f11 * (height - f16)) + height) - f16) * 0.5f);
        matrix.postRotate(f13, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void e() {
        if (Float.isNaN(this.f2452p) && Float.isNaN(this.f2453q) && Float.isNaN(this.f2454r) && Float.isNaN(this.f2455s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    private void setOverlay(boolean z10) {
        this.f2449m = z10;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f2440d.f2481f;
    }

    public float getCrossfade() {
        return this.f2441e;
    }

    public float getImagePanX() {
        return this.f2452p;
    }

    public float getImagePanY() {
        return this.f2453q;
    }

    public float getImageRotate() {
        return this.f2455s;
    }

    public float getImageZoom() {
        return this.f2454r;
    }

    public float getRound() {
        return this.f2443g;
    }

    public float getRoundPercent() {
        return this.f2442f;
    }

    public float getSaturation() {
        return this.f2440d.f2480e;
    }

    public float getWarmth() {
        return this.f2440d.f2482g;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        d();
    }

    public void setAltImageResource(int i10) {
        Drawable drawableMutate = i.a.b(getContext(), i10).mutate();
        this.f2450n = drawableMutate;
        Drawable[] drawableArr = this.f2447k;
        drawableArr[0] = this.f2451o;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2447k);
        this.f2448l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2441e);
    }

    public void setBrightness(float f10) {
        ImageFilterView.c cVar = this.f2440d;
        cVar.f2479d = f10;
        cVar.c(this);
    }

    public void setContrast(float f10) {
        ImageFilterView.c cVar = this.f2440d;
        cVar.f2481f = f10;
        cVar.c(this);
    }

    public void setCrossfade(float f10) {
        this.f2441e = f10;
        if (this.f2447k != null) {
            if (!this.f2449m) {
                this.f2448l.getDrawable(0).setAlpha((int) ((1.0f - this.f2441e) * 255.0f));
            }
            this.f2448l.getDrawable(1).setAlpha((int) (this.f2441e * 255.0f));
            super.setImageDrawable(this.f2448l);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f2450n == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f2451o = drawableMutate;
        Drawable[] drawableArr = this.f2447k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f2450n;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2447k);
        this.f2448l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2441e);
    }

    public void setImagePanX(float f10) {
        this.f2452p = f10;
        e();
    }

    public void setImagePanY(float f10) {
        this.f2453q = f10;
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f2450n == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable drawableMutate = i.a.b(getContext(), i10).mutate();
        this.f2451o = drawableMutate;
        Drawable[] drawableArr = this.f2447k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f2450n;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2447k);
        this.f2448l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2441e);
    }

    public void setImageRotate(float f10) {
        this.f2455s = f10;
        e();
    }

    public void setImageZoom(float f10) {
        this.f2454r = f10;
        e();
    }

    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f2443g = f10;
            float f11 = this.f2442f;
            this.f2442f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f2443g != f10;
        this.f2443g = f10;
        if (f10 != 0.0f) {
            if (this.f2444h == null) {
                this.f2444h = new Path();
            }
            if (this.f2446j == null) {
                this.f2446j = new RectF();
            }
            if (this.f2445i == null) {
                b bVar = new b();
                this.f2445i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2446j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2444h.reset();
            Path path = this.f2444h;
            RectF rectF = this.f2446j;
            float f12 = this.f2443g;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10 = this.f2442f != f10;
        this.f2442f = f10;
        if (f10 != 0.0f) {
            if (this.f2444h == null) {
                this.f2444h = new Path();
            }
            if (this.f2446j == null) {
                this.f2446j = new RectF();
            }
            if (this.f2445i == null) {
                a aVar = new a();
                this.f2445i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f2442f) / 2.0f;
            this.f2446j.set(0.0f, 0.0f, width, height);
            this.f2444h.reset();
            this.f2444h.addRoundRect(this.f2446j, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        ImageFilterView.c cVar = this.f2440d;
        cVar.f2480e = f10;
        cVar.c(this);
    }

    public void setWarmth(float f10) {
        ImageFilterView.c cVar = this.f2440d;
        cVar.f2482g = f10;
        cVar.c(this);
    }
}
