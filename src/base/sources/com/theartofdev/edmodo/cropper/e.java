package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class e extends Animation implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f35719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CropOverlayView f35720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f35721c = new float[8];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f35722d = new float[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f35723e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f35724f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f35725g = new float[9];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f35726h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f35727i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f35728j = new float[8];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f35729k = new float[9];

    public e(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f35719a = imageView;
        this.f35720b = cropOverlayView;
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.f35727i;
        RectF rectF2 = this.f35723e;
        float f11 = rectF2.left;
        RectF rectF3 = this.f35724f;
        rectF.left = f11 + ((rectF3.left - f11) * f10);
        float f12 = rectF2.top;
        rectF.top = f12 + ((rectF3.top - f12) * f10);
        float f13 = rectF2.right;
        rectF.right = f13 + ((rectF3.right - f13) * f10);
        float f14 = rectF2.bottom;
        rectF.bottom = f14 + ((rectF3.bottom - f14) * f10);
        this.f35720b.setCropWindowRect(rectF);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            fArr = this.f35728j;
            if (i11 >= fArr.length) {
                break;
            }
            float f15 = this.f35721c[i11];
            fArr[i11] = f15 + ((this.f35722d[i11] - f15) * f10);
            i11++;
        }
        this.f35720b.s(fArr, this.f35719a.getWidth(), this.f35719a.getHeight());
        while (true) {
            float[] fArr2 = this.f35729k;
            if (i10 >= fArr2.length) {
                Matrix imageMatrix = this.f35719a.getImageMatrix();
                imageMatrix.setValues(this.f35729k);
                this.f35719a.setImageMatrix(imageMatrix);
                this.f35719a.invalidate();
                this.f35720b.invalidate();
                return;
            }
            float f16 = this.f35725g[i10];
            fArr2[i10] = f16 + ((this.f35726h[i10] - f16) * f10);
            i10++;
        }
    }

    public void b(float[] fArr, Matrix matrix) {
        System.arraycopy(fArr, 0, this.f35722d, 0, 8);
        this.f35724f.set(this.f35720b.getCropWindowRect());
        matrix.getValues(this.f35726h);
    }

    public void c(float[] fArr, Matrix matrix) {
        reset();
        System.arraycopy(fArr, 0, this.f35721c, 0, 8);
        this.f35723e.set(this.f35720b.getCropWindowRect());
        matrix.getValues(this.f35725g);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f35719a.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
