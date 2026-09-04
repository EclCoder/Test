package com.bytedance.adsdk.ugeno.ojm.gjv;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import b6.a;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends Drawable {
    private ImageView.ScaleType apu;
    private final RectF aq;
    private Shader.TileMode bug;
    private final int dkl;
    private final RectF dnm;
    private final int dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private float f12354fc;
    private final Bitmap gjv;
    private final boolean[] jip;
    private boolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private float f12356oj;
    private final Paint ojm;
    private Shader.TileMode orl;
    private final RectF qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final Paint f12357sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final Matrix f12358ta;
    private boolean uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private ColorStateList f12359xn;
    private final RectF hnj = new RectF();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final RectF f12355hn = new RectF();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ojm.gjv.hn$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            hnj = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hnj[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hnj[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hnj[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hnj[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                hnj[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public hn(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.qor = rectF;
        this.aq = new RectF();
        this.f12358ta = new Matrix();
        this.dnm = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.bug = tileMode;
        this.orl = tileMode;
        this.mjg = true;
        this.f12354fc = 0.0f;
        this.jip = new boolean[]{true, true, true, true};
        this.uua = false;
        this.f12356oj = 0.0f;
        this.f12359xn = ColorStateList.valueOf(-16777216);
        this.apu = ImageView.ScaleType.FIT_CENTER;
        this.gjv = bitmap;
        int width = bitmap.getWidth();
        this.dkl = width;
        int height = bitmap.getHeight();
        this.dse = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f12357sk = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.ojm = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f12359xn.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.f12356oj);
    }

    public static Bitmap hn(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public static hn hnj(Bitmap bitmap) {
        if (bitmap != null) {
            return new hn(bitmap);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mjg) {
            BitmapShader bitmapShader = new BitmapShader(this.gjv, this.bug, this.orl);
            Shader.TileMode tileMode = this.bug;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.orl == tileMode2) {
                bitmapShader.setLocalMatrix(this.f12358ta);
            }
            this.f12357sk.setShader(bitmapShader);
            this.mjg = false;
        }
        if (this.uua) {
            if (this.f12356oj <= 0.0f) {
                canvas.drawOval(this.f12355hn, this.f12357sk);
                return;
            } else {
                canvas.drawOval(this.f12355hn, this.f12357sk);
                canvas.drawOval(this.aq, this.ojm);
                return;
            }
        }
        if (!hnj(this.jip)) {
            canvas.drawRect(this.f12355hn, this.f12357sk);
            if (this.f12356oj > 0.0f) {
                canvas.drawRect(this.aq, this.ojm);
                return;
            }
            return;
        }
        float f10 = this.f12354fc;
        if (this.f12356oj <= 0.0f) {
            canvas.drawRoundRect(this.f12355hn, f10, f10, this.f12357sk);
            hnj(canvas);
        } else {
            canvas.drawRoundRect(this.f12355hn, f10, f10, this.f12357sk);
            canvas.drawRoundRect(this.aq, f10, f10, this.ojm);
            hnj(canvas);
            hn(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f12357sk.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f12357sk.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.dse;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.dkl;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f12359xn.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.hnj.set(rect);
        hnj();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.f12359xn.getColorForState(iArr, 0);
        if (this.ojm.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.ojm.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f12357sk.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12357sk.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f12357sk.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f12357sk.setFilterBitmap(z10);
        invalidateSelf();
    }

    public static Drawable hnj(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof hn) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), hnj(layerDrawable.getDrawable(i10)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapHn = hn(drawable);
        return bitmapHn != null ? new hn(bitmapHn) : drawable;
    }

    private void hn(Canvas canvas) {
        float f10;
        float f11;
        if (hn(this.jip) || this.f12354fc == 0.0f) {
            return;
        }
        RectF rectF = this.f12355hn;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float fWidth = rectF.width() + f12;
        float fHeight = f13 + this.f12355hn.height();
        float f14 = this.f12354fc;
        float f15 = this.f12356oj / 2.0f;
        if (this.jip[0]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine(f12 - f15, f13, f12 + f14, f10, this.ojm);
            canvas.drawLine(f12, f10 - f15, f12, f10 + f14, this.ojm);
        }
        if (!this.jip[1]) {
            float f16 = f10;
            canvas.drawLine((fWidth - f14) - f15, f16, fWidth, f10, this.ojm);
            canvas.drawLine(fWidth, f16 - f15, fWidth, f16 + f14, this.ojm);
            fWidth = fWidth;
        }
        if (this.jip[2]) {
            f11 = fHeight;
        } else {
            canvas.drawLine((fWidth - f14) - f15, fHeight, fWidth + f15, fHeight, this.ojm);
            float f17 = fWidth;
            canvas.drawLine(f17, fHeight - f14, fWidth, fHeight, this.ojm);
            f11 = fHeight;
        }
        if (this.jip[3]) {
            return;
        }
        canvas.drawLine(f12 - f15, f11, f12 + f14, f11, this.ojm);
        canvas.drawLine(f12, f11 - f14, f12, f11, this.ojm);
    }

    private void hnj() {
        float fWidth;
        float fHeight;
        int i10 = AnonymousClass1.hnj[this.apu.ordinal()];
        if (i10 == 1) {
            this.aq.set(this.hnj);
            RectF rectF = this.aq;
            float f10 = this.f12356oj;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.f12358ta.reset();
            this.f12358ta.setTranslate((int) (((this.aq.width() - this.dkl) * 0.5f) + 0.5f), (int) (((this.aq.height() - this.dse) * 0.5f) + 0.5f));
        } else if (i10 == 2) {
            this.aq.set(this.hnj);
            RectF rectF2 = this.aq;
            float f11 = this.f12356oj;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.f12358ta.reset();
            float fWidth2 = 0.0f;
            if (this.dkl * this.aq.height() > this.aq.width() * this.dse) {
                fWidth = this.aq.height() / this.dse;
                fHeight = 0.0f;
                fWidth2 = (this.aq.width() - (this.dkl * fWidth)) * 0.5f;
            } else {
                fWidth = this.aq.width() / this.dkl;
                fHeight = (this.aq.height() - (this.dse * fWidth)) * 0.5f;
            }
            this.f12358ta.setScale(fWidth, fWidth);
            Matrix matrix = this.f12358ta;
            float f12 = this.f12356oj;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f12 / 2.0f), ((int) (fHeight + 0.5f)) + (f12 / 2.0f));
        } else if (i10 == 3) {
            this.f12358ta.reset();
            float fMin = (((float) this.dkl) > this.hnj.width() || ((float) this.dse) > this.hnj.height()) ? Math.min(this.hnj.width() / this.dkl, this.hnj.height() / this.dse) : 1.0f;
            float fWidth3 = (int) (((this.hnj.width() - (this.dkl * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.hnj.height() - (this.dse * fMin)) * 0.5f) + 0.5f);
            this.f12358ta.setScale(fMin, fMin);
            this.f12358ta.postTranslate(fWidth3, fHeight2);
            this.aq.set(this.qor);
            this.f12358ta.mapRect(this.aq);
            RectF rectF3 = this.aq;
            float f13 = this.f12356oj;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.f12358ta.setRectToRect(this.qor, this.aq, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.aq.set(this.qor);
            this.f12358ta.setRectToRect(this.qor, this.hnj, Matrix.ScaleToFit.END);
            this.f12358ta.mapRect(this.aq);
            RectF rectF4 = this.aq;
            float f14 = this.f12356oj;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.f12358ta.setRectToRect(this.qor, this.aq, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.aq.set(this.qor);
            this.f12358ta.setRectToRect(this.qor, this.hnj, Matrix.ScaleToFit.START);
            this.f12358ta.mapRect(this.aq);
            RectF rectF5 = this.aq;
            float f15 = this.f12356oj;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.f12358ta.setRectToRect(this.qor, this.aq, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.aq.set(this.qor);
            this.f12358ta.setRectToRect(this.qor, this.hnj, Matrix.ScaleToFit.CENTER);
            this.f12358ta.mapRect(this.aq);
            RectF rectF6 = this.aq;
            float f16 = this.f12356oj;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.f12358ta.setRectToRect(this.qor, this.aq, Matrix.ScaleToFit.FILL);
        } else {
            this.aq.set(this.hnj);
            RectF rectF7 = this.aq;
            float f17 = this.f12356oj;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.f12358ta.reset();
            this.f12358ta.setRectToRect(this.qor, this.aq, Matrix.ScaleToFit.FILL);
        }
        this.f12355hn.set(this.aq);
        this.mjg = true;
    }

    public hn hn(Shader.TileMode tileMode) {
        if (this.orl != tileMode) {
            this.orl = tileMode;
            this.mjg = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean hn(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private void hnj(Canvas canvas) {
        if (hn(this.jip) || this.f12354fc == 0.0f) {
            return;
        }
        RectF rectF = this.f12355hn;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f12355hn.height() + f11;
        float f12 = this.f12354fc;
        if (!this.jip[0]) {
            this.dnm.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.dnm, this.f12357sk);
        }
        if (!this.jip[1]) {
            this.dnm.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.dnm, this.f12357sk);
        }
        if (!this.jip[2]) {
            this.dnm.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.dnm, this.f12357sk);
        }
        if (this.jip[3]) {
            return;
        }
        this.dnm.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.dnm, this.f12357sk);
    }

    public hn hnj(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.f12354fc = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.f12354fc = 0.0f;
            }
            boolean[] zArr = this.jip;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public hn hnj(float f10) {
        this.f12356oj = f10;
        this.ojm.setStrokeWidth(f10);
        return this;
    }

    public hn hnj(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f12359xn = colorStateList;
        this.ojm.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public hn hnj(boolean z10) {
        this.uua = z10;
        return this;
    }

    public hn hnj(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.apu != scaleType) {
            this.apu = scaleType;
            hnj();
        }
        return this;
    }

    public hn hnj(Shader.TileMode tileMode) {
        if (this.bug != tileMode) {
            this.bug = tileMode;
            this.mjg = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean hnj(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
