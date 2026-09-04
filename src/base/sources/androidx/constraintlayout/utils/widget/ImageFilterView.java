package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f2458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f2460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f2461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f2463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f2464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f2465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ViewOutlineProvider f2466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    RectF f2467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Drawable[] f2468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    LayerDrawable f2469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f2470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f2471n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f2472o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f2473p;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterView.this.f2463f) / 2.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2464g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float[] f2476a = new float[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ColorMatrix f2477b = new ColorMatrix();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorMatrix f2478c = new ColorMatrix();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f2479d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f2480e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f2481f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f2482g = 1.0f;

        c() {
        }

        private void a(float f10) {
            float[] fArr = this.f2476a;
            fArr[0] = f10;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f10;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void b(float f10) {
            float f11 = 1.0f - f10;
            float f12 = 0.2999f * f11;
            float f13 = 0.587f * f11;
            float f14 = f11 * 0.114f;
            float[] fArr = this.f2476a;
            fArr[0] = f12 + f10;
            fArr[1] = f13;
            fArr[2] = f14;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f12;
            fArr[6] = f13 + f10;
            fArr[7] = f14;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f12;
            fArr[11] = f13;
            fArr[12] = f14 + f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void d(float f10) {
            float fLog;
            float fPow;
            float fLog2;
            if (f10 <= 0.0f) {
                f10 = 0.01f;
            }
            float f11 = (5000.0f / f10) / 100.0f;
            if (f11 > 66.0f) {
                double d10 = f11 - 60.0f;
                fPow = ((float) Math.pow(d10, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d10, 0.07551485300064087d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f11)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f11 < 66.0f) {
                fLog2 = f11 > 19.0f ? (((float) Math.log(f11 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
            } else {
                fLog2 = 255.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f2476a;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        void c(ImageView imageView) {
            boolean z10;
            this.f2477b.reset();
            float f10 = this.f2480e;
            boolean z11 = true;
            if (f10 != 1.0f) {
                b(f10);
                this.f2477b.set(this.f2476a);
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = this.f2481f;
            if (f11 != 1.0f) {
                this.f2478c.setScale(f11, f11, f11, 1.0f);
                this.f2477b.postConcat(this.f2478c);
                z10 = true;
            }
            float f12 = this.f2482g;
            if (f12 != 1.0f) {
                d(f12);
                this.f2478c.set(this.f2476a);
                this.f2477b.postConcat(this.f2478c);
                z10 = true;
            }
            float f13 = this.f2479d;
            if (f13 != 1.0f) {
                a(f13);
                this.f2478c.set(this.f2476a);
                this.f2477b.postConcat(this.f2478c);
            } else {
                z11 = z10;
            }
            if (z11) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f2477b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2458a = new c();
        this.f2459b = true;
        this.f2460c = null;
        this.f2461d = null;
        this.f2462e = 0.0f;
        this.f2463f = 0.0f;
        this.f2464g = Float.NaN;
        this.f2468k = new Drawable[2];
        this.f2470m = Float.NaN;
        this.f2471n = Float.NaN;
        this.f2472o = Float.NaN;
        this.f2473p = Float.NaN;
        e(context, attributeSet);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f3109y5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f2460c = typedArrayObtainStyledAttributes.getDrawable(f.f3122z5);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.C5) {
                    this.f2462e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == f.L5) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.K5) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.B5) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.A5) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.I5) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.J5) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.H5) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f2459b));
                } else if (index == f.D5) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f2470m));
                } else if (index == f.E5) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f2471n));
                } else if (index == f.F5) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f2473p));
                } else if (index == f.G5) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f2472o));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2461d = drawable;
            if (this.f2460c == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2461d = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2468k;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f2461d = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2468k;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f2461d = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f2468k[1] = this.f2460c.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2468k);
            this.f2469l = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2462e * 255.0f));
            if (!this.f2459b) {
                this.f2469l.getDrawable(0).setAlpha((int) ((1.0f - this.f2462e) * 255.0f));
            }
            super.setImageDrawable(this.f2469l);
        }
    }

    private void f() {
        if (Float.isNaN(this.f2470m) && Float.isNaN(this.f2471n) && Float.isNaN(this.f2472o) && Float.isNaN(this.f2473p)) {
            return;
        }
        float f10 = Float.isNaN(this.f2470m) ? 0.0f : this.f2470m;
        float f11 = Float.isNaN(this.f2471n) ? 0.0f : this.f2471n;
        float f12 = Float.isNaN(this.f2472o) ? 1.0f : this.f2472o;
        float f13 = Float.isNaN(this.f2473p) ? 0.0f : this.f2473p;
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

    private void g() {
        if (Float.isNaN(this.f2470m) && Float.isNaN(this.f2471n) && Float.isNaN(this.f2472o) && Float.isNaN(this.f2473p)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            f();
        }
    }

    private void setOverlay(boolean z10) {
        this.f2459b = z10;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f2458a.f2479d;
    }

    public float getContrast() {
        return this.f2458a.f2481f;
    }

    public float getCrossfade() {
        return this.f2462e;
    }

    public float getImagePanX() {
        return this.f2470m;
    }

    public float getImagePanY() {
        return this.f2471n;
    }

    public float getImageRotate() {
        return this.f2473p;
    }

    public float getImageZoom() {
        return this.f2472o;
    }

    public float getRound() {
        return this.f2464g;
    }

    public float getRoundPercent() {
        return this.f2463f;
    }

    public float getSaturation() {
        return this.f2458a.f2480e;
    }

    public float getWarmth() {
        return this.f2458a.f2482g;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        f();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.f2460c = drawableMutate;
        Drawable[] drawableArr = this.f2468k;
        drawableArr[0] = this.f2461d;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2468k);
        this.f2469l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2462e);
    }

    public void setAltImageResource(int i10) {
        Drawable drawableB = i.a.b(getContext(), i10);
        this.f2460c = drawableB;
        setAltImageDrawable(drawableB);
    }

    public void setBrightness(float f10) {
        c cVar = this.f2458a;
        cVar.f2479d = f10;
        cVar.c(this);
    }

    public void setContrast(float f10) {
        c cVar = this.f2458a;
        cVar.f2481f = f10;
        cVar.c(this);
    }

    public void setCrossfade(float f10) {
        this.f2462e = f10;
        if (this.f2468k != null) {
            if (!this.f2459b) {
                this.f2469l.getDrawable(0).setAlpha((int) ((1.0f - this.f2462e) * 255.0f));
            }
            this.f2469l.getDrawable(1).setAlpha((int) (this.f2462e * 255.0f));
            super.setImageDrawable(this.f2469l);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f2460c == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f2461d = drawableMutate;
        Drawable[] drawableArr = this.f2468k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f2460c;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2468k);
        this.f2469l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2462e);
    }

    public void setImagePanX(float f10) {
        this.f2470m = f10;
        g();
    }

    public void setImagePanY(float f10) {
        this.f2471n = f10;
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f2460c == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable drawableMutate = i.a.b(getContext(), i10).mutate();
        this.f2461d = drawableMutate;
        Drawable[] drawableArr = this.f2468k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f2460c;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2468k);
        this.f2469l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2462e);
    }

    public void setImageRotate(float f10) {
        this.f2473p = f10;
        g();
    }

    public void setImageZoom(float f10) {
        this.f2472o = f10;
        g();
    }

    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f2464g = f10;
            float f11 = this.f2463f;
            this.f2463f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f2464g != f10;
        this.f2464g = f10;
        if (f10 != 0.0f) {
            if (this.f2465h == null) {
                this.f2465h = new Path();
            }
            if (this.f2467j == null) {
                this.f2467j = new RectF();
            }
            if (this.f2466i == null) {
                b bVar = new b();
                this.f2466i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2467j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2465h.reset();
            Path path = this.f2465h;
            RectF rectF = this.f2467j;
            float f12 = this.f2464g;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10 = this.f2463f != f10;
        this.f2463f = f10;
        if (f10 != 0.0f) {
            if (this.f2465h == null) {
                this.f2465h = new Path();
            }
            if (this.f2467j == null) {
                this.f2467j = new RectF();
            }
            if (this.f2466i == null) {
                a aVar = new a();
                this.f2466i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f2463f) / 2.0f;
            this.f2467j.set(0.0f, 0.0f, width, height);
            this.f2465h.reset();
            this.f2465h.addRoundRect(this.f2467j, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        c cVar = this.f2458a;
        cVar.f2480e = f10;
        cVar.c(this);
    }

    public void setWarmth(float f10) {
        c cVar = this.f2458a;
        cVar.f2482g = f10;
        cVar.c(this);
    }
}
