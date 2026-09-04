package com.bytedance.adsdk.ugeno.ojm.gjv;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.gjv;
import com.bytedance.adsdk.ugeno.hnj.aq;
import com.bytedance.adsdk.ugeno.hnj.dse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends ImageView implements IAnimation, dse {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    static final /* synthetic */ boolean f12360hn = true;
    private gjv apu;
    private float aq;
    private boolean bug;
    private Drawable dkl;
    private Drawable dnm;
    private ColorStateList dse;
    private aq eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f12361fc;
    private int jip;
    private boolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private Shader.TileMode f12362oj;
    private ColorFilter ojm;
    private boolean orl;
    private float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final float[] f12363sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f12364ta;
    private ImageView.ScaleType uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private Shader.TileMode f12365xn;
    public static final Shader.TileMode hnj = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] gjv = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ojm.gjv.hnj$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            hnj = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hnj[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hnj[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hnj[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hnj[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                hnj[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public hnj(Context context) {
        super(context);
        this.f12363sk = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.dse = ColorStateList.valueOf(-16777216);
        this.aq = 0.0f;
        this.ojm = null;
        this.f12364ta = false;
        this.bug = false;
        this.orl = false;
        this.mjg = false;
        Shader.TileMode tileMode = hnj;
        this.f12362oj = tileMode;
        this.f12365xn = tileMode;
        this.eum = new aq(this);
    }

    private void gjv() {
        Drawable drawable = this.dnm;
        if (drawable == null || !this.f12364ta) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.dnm = drawableMutate;
        if (this.bug) {
            drawableMutate.setColorFilter(this.ojm);
        }
    }

    private Drawable hn() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.jip;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.jip, e10);
                this.jip = 0;
            }
        }
        return hn.hnj(drawable);
    }

    private Drawable hnj() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.f12361fc;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f12361fc, e10);
                this.f12361fc = 0;
            }
        }
        return hn.hnj(drawable);
    }

    private void qor() {
        hnj(this.dnm, this.uua);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        gjv gjvVar = this.apu;
        if (gjvVar != null) {
            gjvVar.hn(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.dse.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.dse;
    }

    public float getBorderRadius() {
        return this.eum.hnj();
    }

    public float getBorderWidth() {
        return this.aq;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f10 : this.f12363sk) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.hnj.dse
    public float getRipple() {
        return this.qor;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getRubIn() {
        return this.eum.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.uua;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getShine() {
        return this.eum.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getStretch() {
        return this.eum.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.f12362oj;
    }

    public Shader.TileMode getTileModeY() {
        return this.f12365xn;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        gjv gjvVar = this.apu;
        if (gjvVar != null) {
            gjvVar.dse();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gjv gjvVar = this.apu;
        if (gjvVar != null) {
            gjvVar.aq();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gjv gjvVar = this.apu;
        if (gjvVar != null) {
            gjvVar.hnj(canvas, this);
            this.apu.hnj(canvas);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gjv gjvVar = this.apu;
        if (gjvVar != null) {
            gjvVar.hnj(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        gjv gjvVar = this.apu;
        if (gjvVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrHnj = gjvVar.hnj(i10, i11);
            super.onMeasure(iArrHnj[0], iArrHnj[1]);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        gjv gjvVar = this.apu;
        if (gjvVar != null) {
            gjvVar.hn(i10, i11, i12, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.dkl = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.dkl = drawable;
        hnj(true);
        super.setBackgroundDrawable(this.dkl);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (this.jip != i10) {
            this.jip = i10;
            Drawable drawableHn = hn();
            this.dkl = drawableHn;
            setBackgroundDrawable(drawableHn);
        }
    }

    public void setBorderColor(int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        aq aqVar = this.eum;
        if (aqVar != null) {
            aqVar.hnj(f10);
        }
    }

    public void setBorderWidth(int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.ojm != colorFilter) {
            this.ojm = colorFilter;
            this.bug = true;
            this.f12364ta = true;
            gjv();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        hnj(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i10) {
        float dimension = getResources().getDimension(i10);
        hnj(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f12361fc = 0;
        this.dnm = hn.hnj(bitmap);
        qor();
        super.setImageDrawable(this.dnm);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f12361fc = 0;
        this.dnm = hn.hnj(drawable);
        qor();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f12361fc != i10) {
            this.f12361fc = i10;
            this.dnm = hnj();
            qor();
            super.setImageDrawable(this.dnm);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z10) {
        this.orl = z10;
        qor();
        hnj(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.qor = f10;
        aq aqVar = this.eum;
        if (aqVar != null) {
            aqVar.hn(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        aq aqVar = this.eum;
        if (aqVar != null) {
            aqVar.sk(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f12360hn && scaleType == null) {
            throw new AssertionError();
        }
        if (this.uua != scaleType) {
            this.uua = scaleType;
            int i10 = AnonymousClass1.hnj[scaleType.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            qor();
            hnj(false);
            invalidate();
        }
    }

    public void setShine(float f10) {
        aq aqVar = this.eum;
        if (aqVar != null) {
            aqVar.qor(f10);
        }
    }

    public void setStretch(float f10) {
        aq aqVar = this.eum;
        if (aqVar != null) {
            aqVar.gjv(f10);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f12362oj == tileMode) {
            return;
        }
        this.f12362oj = tileMode;
        qor();
        hnj(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f12365xn == tileMode) {
            return;
        }
        this.f12365xn = tileMode;
        qor();
        hnj(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.dse.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.dse = colorStateList;
        qor();
        hnj(false);
        if (this.aq > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.aq == f10) {
            return;
        }
        this.aq = f10;
        qor();
        hnj(false);
        invalidate();
    }

    private void hnj(boolean z10) {
        if (this.mjg) {
            if (z10) {
                this.dkl = hn.hnj(this.dkl);
            }
            hnj(this.dkl, ImageView.ScaleType.FIT_XY);
        }
    }

    private void hnj(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof hn) {
            hn hnVar = (hn) drawable;
            hnVar.hnj(scaleType).hnj(this.aq).hnj(this.dse).hnj(this.orl).hnj(this.f12362oj).hn(this.f12365xn);
            float[] fArr = this.f12363sk;
            if (fArr != null) {
                hnVar.hnj(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            gjv();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                hnj(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public void hnj(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f12363sk;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        qor();
        hnj(false);
        invalidate();
    }

    public void hnj(gjv gjvVar) {
        this.apu = gjvVar;
    }
}
