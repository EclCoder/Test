package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class CropOverlayView extends View {
    private final Rect A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScaleGestureDetector f35647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f35649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f35650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f35651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f35652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f35653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f35654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f35655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Path f35656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f35657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f35658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f35659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35660n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35661o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f35662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f35663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f35665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private h f35666t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f35667u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f35669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f35670x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CropImageView.d f35671y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CropImageView.c f35672z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF rectFH = CropOverlayView.this.f35649c.h();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f10 = focusY - currentSpanY;
            float f11 = focusX - currentSpanX;
            float f12 = focusX + currentSpanX;
            float f13 = focusY + currentSpanY;
            if (f11 >= f12 || f10 > f13 || f11 < 0.0f || f12 > CropOverlayView.this.f35649c.c() || f10 < 0.0f || f13 > CropOverlayView.this.f35649c.b()) {
                return true;
            }
            rectFH.set(f11, f10, f12, f13);
            CropOverlayView.this.f35649c.r(rectFH);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35649c = new g();
        this.f35651e = new RectF();
        this.f35656j = new Path();
        this.f35657k = new float[8];
        this.f35658l = new RectF();
        this.f35670x = this.f35668v / this.f35669w;
        this.A = new Rect();
    }

    private boolean b(RectF rectF) {
        float f10;
        float f11;
        float fU = com.theartofdev.edmodo.cropper.c.u(this.f35657k);
        float fW = com.theartofdev.edmodo.cropper.c.w(this.f35657k);
        float fV = com.theartofdev.edmodo.cropper.c.v(this.f35657k);
        float fP = com.theartofdev.edmodo.cropper.c.p(this.f35657k);
        if (!n()) {
            this.f35658l.set(fU, fW, fV, fP);
            return false;
        }
        float[] fArr = this.f35657k;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        if (f17 < f13) {
            float f18 = fArr[3];
            if (f13 < f18) {
                f14 = fArr[2];
                f12 = f14;
                f13 = f15;
                f11 = f16;
                f15 = f18;
                f10 = f17;
            } else {
                f12 = fArr[2];
                f11 = f14;
                f14 = f12;
                f15 = f13;
                f13 = f18;
                f10 = f15;
            }
        } else {
            f10 = fArr[3];
            if (f13 > f10) {
                f11 = fArr[2];
                f14 = f16;
                f15 = f17;
            } else {
                f11 = f12;
                f10 = f13;
                f12 = f16;
                f13 = f17;
            }
        }
        float f19 = (f13 - f10) / (f12 - f11);
        float f20 = (-1.0f) / f19;
        float f21 = f10 - (f19 * f11);
        float f22 = f10 - (f11 * f20);
        float f23 = f15 - (f19 * f14);
        float f24 = f15 - (f14 * f20);
        float fCenterY = rectF.centerY() - rectF.top;
        float fCenterX = rectF.centerX();
        float f25 = rectF.left;
        float f26 = fCenterY / (fCenterX - f25);
        float f27 = -f26;
        float f28 = rectF.top;
        float f29 = f28 - (f25 * f26);
        float f30 = rectF.right;
        float f31 = f28 - (f27 * f30);
        float f32 = f19 - f26;
        float f33 = (f29 - f21) / f32;
        float fMax = Math.max(fU, f33 < f30 ? f33 : fU);
        float f34 = (f29 - f22) / (f20 - f26);
        if (f34 >= rectF.right) {
            f34 = fMax;
        }
        float fMax2 = Math.max(fMax, f34);
        float f35 = f20 - f27;
        float f36 = (f31 - f24) / f35;
        float fMax3 = Math.max(fMax2, f36 < rectF.right ? f36 : fMax2);
        float f37 = (f31 - f22) / f35;
        if (f37 <= rectF.left) {
            f37 = fV;
        }
        float fMin = Math.min(fV, f37);
        float f38 = (f31 - f23) / (f19 - f27);
        if (f38 <= rectF.left) {
            f38 = fMin;
        }
        float fMin2 = Math.min(fMin, f38);
        float f39 = (f29 - f23) / f32;
        if (f39 <= rectF.left) {
            f39 = fMin2;
        }
        float fMin3 = Math.min(fMin2, f39);
        float fMax4 = Math.max(fW, Math.max((f19 * fMax3) + f21, (f20 * fMin3) + f22));
        float fMin4 = Math.min(fP, Math.min((f20 * fMax3) + f24, (f19 * fMin3) + f23));
        RectF rectF2 = this.f35658l;
        rectF2.left = fMax3;
        rectF2.top = fMax4;
        rectF2.right = fMin3;
        rectF2.bottom = fMin4;
        return true;
    }

    private void c(boolean z10) {
        try {
            b bVar = this.f35650d;
            if (bVar != null) {
                bVar.a(z10);
            }
        } catch (Exception e10) {
            Log.e("AIC", "Exception in crop window changed", e10);
        }
    }

    private void d(Canvas canvas) {
        RectF rectFH = this.f35649c.h();
        float fMax = Math.max(com.theartofdev.edmodo.cropper.c.u(this.f35657k), 0.0f);
        float fMax2 = Math.max(com.theartofdev.edmodo.cropper.c.w(this.f35657k), 0.0f);
        float fMin = Math.min(com.theartofdev.edmodo.cropper.c.v(this.f35657k), getWidth());
        float fMin2 = Math.min(com.theartofdev.edmodo.cropper.c.p(this.f35657k), getHeight());
        if (this.f35672z != CropImageView.c.RECTANGLE) {
            this.f35656j.reset();
            int i10 = Build.VERSION.SDK_INT;
            this.f35651e.set(rectFH.left, rectFH.top, rectFH.right, rectFH.bottom);
            this.f35656j.addOval(this.f35651e, Path.Direction.CW);
            canvas.save();
            if (i10 >= 26) {
                canvas.clipOutPath(this.f35656j);
            } else {
                canvas.clipPath(this.f35656j, Region.Op.XOR);
            }
            canvas.drawRect(fMax, fMax2, fMin, fMin2, this.f35655i);
            canvas.restore();
            return;
        }
        if (!n()) {
            canvas.drawRect(fMax, fMax2, fMin, rectFH.top, this.f35655i);
            canvas.drawRect(fMax, rectFH.bottom, fMin, fMin2, this.f35655i);
            canvas.drawRect(fMax, rectFH.top, rectFH.left, rectFH.bottom, this.f35655i);
            canvas.drawRect(rectFH.right, rectFH.top, fMin, rectFH.bottom, this.f35655i);
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f35656j.reset();
        Path path = this.f35656j;
        float[] fArr = this.f35657k;
        path.moveTo(fArr[0], fArr[1]);
        Path path2 = this.f35656j;
        float[] fArr2 = this.f35657k;
        path2.lineTo(fArr2[2], fArr2[3]);
        Path path3 = this.f35656j;
        float[] fArr3 = this.f35657k;
        path3.lineTo(fArr3[4], fArr3[5]);
        Path path4 = this.f35656j;
        float[] fArr4 = this.f35657k;
        path4.lineTo(fArr4[6], fArr4[7]);
        this.f35656j.close();
        canvas.save();
        if (i11 >= 26) {
            canvas.clipOutPath(this.f35656j);
        } else {
            canvas.clipPath(this.f35656j, Region.Op.INTERSECT);
        }
        canvas.clipRect(rectFH, Region.Op.XOR);
        canvas.drawRect(fMax, fMax2, fMin, fMin2, this.f35655i);
        canvas.restore();
    }

    private void e(Canvas canvas) {
        Paint paint = this.f35652f;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF rectFH = this.f35649c.h();
            float f10 = strokeWidth / 2.0f;
            rectFH.inset(f10, f10);
            if (this.f35672z == CropImageView.c.RECTANGLE) {
                canvas.drawRect(rectFH, this.f35652f);
            } else {
                canvas.drawOval(rectFH, this.f35652f);
            }
        }
    }

    private void f(Canvas canvas) {
        if (this.f35653g != null) {
            Paint paint = this.f35652f;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            float strokeWidth2 = this.f35653g.getStrokeWidth();
            float f10 = strokeWidth2 / 2.0f;
            float f11 = (this.f35672z == CropImageView.c.RECTANGLE ? this.f35661o : 0.0f) + f10;
            RectF rectFH = this.f35649c.h();
            rectFH.inset(f11, f11);
            float f12 = (strokeWidth2 - strokeWidth) / 2.0f;
            float f13 = f10 + f12;
            float f14 = rectFH.left;
            float f15 = rectFH.top;
            canvas.drawLine(f14 - f12, f15 - f13, f14 - f12, f15 + this.f35662p, this.f35653g);
            float f16 = rectFH.left;
            float f17 = rectFH.top;
            canvas.drawLine(f16 - f13, f17 - f12, f16 + this.f35662p, f17 - f12, this.f35653g);
            float f18 = rectFH.right;
            float f19 = rectFH.top;
            canvas.drawLine(f18 + f12, f19 - f13, f18 + f12, f19 + this.f35662p, this.f35653g);
            float f20 = rectFH.right;
            float f21 = rectFH.top;
            canvas.drawLine(f20 + f13, f21 - f12, f20 - this.f35662p, f21 - f12, this.f35653g);
            float f22 = rectFH.left;
            float f23 = rectFH.bottom;
            canvas.drawLine(f22 - f12, f23 + f13, f22 - f12, f23 - this.f35662p, this.f35653g);
            float f24 = rectFH.left;
            float f25 = rectFH.bottom;
            canvas.drawLine(f24 - f13, f25 + f12, f24 + this.f35662p, f25 + f12, this.f35653g);
            float f26 = rectFH.right;
            float f27 = rectFH.bottom;
            canvas.drawLine(f26 + f12, f27 + f13, f26 + f12, f27 - this.f35662p, this.f35653g);
            float f28 = rectFH.right;
            float f29 = rectFH.bottom;
            canvas.drawLine(f28 + f13, f29 + f12, f28 - this.f35662p, f29 + f12, this.f35653g);
        }
    }

    private void g(Canvas canvas) {
        if (this.f35654h != null) {
            Paint paint = this.f35652f;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF rectFH = this.f35649c.h();
            rectFH.inset(strokeWidth, strokeWidth);
            float fWidth = rectFH.width() / 3.0f;
            float fHeight = rectFH.height() / 3.0f;
            if (this.f35672z != CropImageView.c.OVAL) {
                float f10 = rectFH.left + fWidth;
                float f11 = rectFH.right - fWidth;
                canvas.drawLine(f10, rectFH.top, f10, rectFH.bottom, this.f35654h);
                canvas.drawLine(f11, rectFH.top, f11, rectFH.bottom, this.f35654h);
                float f12 = rectFH.top + fHeight;
                float f13 = rectFH.bottom - fHeight;
                canvas.drawLine(rectFH.left, f12, rectFH.right, f12, this.f35654h);
                canvas.drawLine(rectFH.left, f13, rectFH.right, f13, this.f35654h);
                return;
            }
            float fWidth2 = (rectFH.width() / 2.0f) - strokeWidth;
            float fHeight2 = (rectFH.height() / 2.0f) - strokeWidth;
            float f14 = rectFH.left + fWidth;
            float f15 = rectFH.right - fWidth;
            float fSin = (float) (((double) fHeight2) * Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)));
            canvas.drawLine(f14, (rectFH.top + fHeight2) - fSin, f14, (rectFH.bottom - fHeight2) + fSin, this.f35654h);
            canvas.drawLine(f15, (rectFH.top + fHeight2) - fSin, f15, (rectFH.bottom - fHeight2) + fSin, this.f35654h);
            float f16 = rectFH.top + fHeight;
            float f17 = rectFH.bottom - fHeight;
            float fCos = (float) (((double) fWidth2) * Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)));
            canvas.drawLine((rectFH.left + fWidth2) - fCos, f16, (rectFH.right - fWidth2) + fCos, f16, this.f35654h);
            canvas.drawLine((rectFH.left + fWidth2) - fCos, f17, (rectFH.right - fWidth2) + fCos, f17, this.f35654h);
        }
    }

    private void h(RectF rectF) {
        if (rectF.width() < this.f35649c.e()) {
            float fE = (this.f35649c.e() - rectF.width()) / 2.0f;
            rectF.left -= fE;
            rectF.right += fE;
        }
        if (rectF.height() < this.f35649c.d()) {
            float fD = (this.f35649c.d() - rectF.height()) / 2.0f;
            rectF.top -= fD;
            rectF.bottom += fD;
        }
        if (rectF.width() > this.f35649c.c()) {
            float fWidth = (rectF.width() - this.f35649c.c()) / 2.0f;
            rectF.left += fWidth;
            rectF.right -= fWidth;
        }
        if (rectF.height() > this.f35649c.b()) {
            float fHeight = (rectF.height() - this.f35649c.b()) / 2.0f;
            rectF.top += fHeight;
            rectF.bottom -= fHeight;
        }
        b(rectF);
        if (this.f35658l.width() > 0.0f && this.f35658l.height() > 0.0f) {
            float fMax = Math.max(this.f35658l.left, 0.0f);
            float fMax2 = Math.max(this.f35658l.top, 0.0f);
            float fMin = Math.min(this.f35658l.right, getWidth());
            float fMin2 = Math.min(this.f35658l.bottom, getHeight());
            if (rectF.left < fMax) {
                rectF.left = fMax;
            }
            if (rectF.top < fMax2) {
                rectF.top = fMax2;
            }
            if (rectF.right > fMin) {
                rectF.right = fMin;
            }
            if (rectF.bottom > fMin2) {
                rectF.bottom = fMin2;
            }
        }
        if (!this.f35667u || Math.abs(rectF.width() - (rectF.height() * this.f35670x)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.f35670x) {
            float fAbs = Math.abs((rectF.height() * this.f35670x) - rectF.width()) / 2.0f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        } else {
            float fAbs2 = Math.abs((rectF.width() / this.f35670x) - rectF.height()) / 2.0f;
            rectF.top += fAbs2;
            rectF.bottom -= fAbs2;
        }
    }

    private static Paint j(int i10) {
        Paint paint = new Paint();
        paint.setColor(i10);
        return paint;
    }

    private static Paint k(float f10, int i10) {
        if (f10 <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i10);
        paint.setStrokeWidth(f10);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    private void l() {
        float fMax = Math.max(com.theartofdev.edmodo.cropper.c.u(this.f35657k), 0.0f);
        float fMax2 = Math.max(com.theartofdev.edmodo.cropper.c.w(this.f35657k), 0.0f);
        float fMin = Math.min(com.theartofdev.edmodo.cropper.c.v(this.f35657k), getWidth());
        float fMin2 = Math.min(com.theartofdev.edmodo.cropper.c.p(this.f35657k), getHeight());
        if (fMin <= fMax || fMin2 <= fMax2) {
            return;
        }
        RectF rectF = new RectF();
        this.B = true;
        float f10 = this.f35663q;
        float f11 = fMin - fMax;
        float f12 = f10 * f11;
        float f13 = fMin2 - fMax2;
        float f14 = f10 * f13;
        if (this.A.width() > 0 && this.A.height() > 0) {
            rectF.left = (this.A.left / this.f35649c.k()) + fMax;
            rectF.top = (this.A.top / this.f35649c.j()) + fMax2;
            rectF.right = rectF.left + (this.A.width() / this.f35649c.k());
            rectF.bottom = rectF.top + (this.A.height() / this.f35649c.j());
            rectF.left = Math.max(fMax, rectF.left);
            rectF.top = Math.max(fMax2, rectF.top);
            rectF.right = Math.min(fMin, rectF.right);
            rectF.bottom = Math.min(fMin2, rectF.bottom);
        } else if (!this.f35667u || fMin <= fMax || fMin2 <= fMax2) {
            rectF.left = fMax + f12;
            rectF.top = fMax2 + f14;
            rectF.right = fMin - f12;
            rectF.bottom = fMin2 - f14;
        } else if (f11 / f13 > this.f35670x) {
            rectF.top = fMax2 + f14;
            rectF.bottom = fMin2 - f14;
            float width = getWidth() / 2.0f;
            this.f35670x = this.f35668v / this.f35669w;
            float fMax3 = Math.max(this.f35649c.e(), rectF.height() * this.f35670x) / 2.0f;
            rectF.left = width - fMax3;
            rectF.right = width + fMax3;
        } else {
            rectF.left = fMax + f12;
            rectF.right = fMin - f12;
            float height = getHeight() / 2.0f;
            float fMax4 = Math.max(this.f35649c.d(), rectF.width() / this.f35670x) / 2.0f;
            rectF.top = height - fMax4;
            rectF.bottom = height + fMax4;
        }
        h(rectF);
        this.f35649c.r(rectF);
    }

    private boolean n() {
        float[] fArr = this.f35657k;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    private void o(float f10, float f11) {
        h hVarF = this.f35649c.f(f10, f11, this.f35664r, this.f35672z);
        this.f35666t = hVarF;
        if (hVarF != null) {
            invalidate();
        }
    }

    private void p(float f10, float f11) {
        if (this.f35666t != null) {
            float f12 = this.f35665s;
            RectF rectFH = this.f35649c.h();
            if (b(rectFH)) {
                f12 = 0.0f;
            }
            this.f35666t.m(rectFH, f10, f11, this.f35658l, this.f35659m, this.f35660n, f12, this.f35667u, this.f35670x);
            this.f35649c.r(rectFH);
            c(true);
            invalidate();
        }
    }

    private void q() {
        if (this.f35666t != null) {
            this.f35666t = null;
            c(false);
            invalidate();
        }
    }

    public int getAspectRatioX() {
        return this.f35668v;
    }

    public int getAspectRatioY() {
        return this.f35669w;
    }

    public CropImageView.c getCropShape() {
        return this.f35672z;
    }

    public RectF getCropWindowRect() {
        return this.f35649c.h();
    }

    public CropImageView.d getGuidelines() {
        return this.f35671y;
    }

    public Rect getInitialCropWindowRect() {
        return this.A;
    }

    public void i() {
        RectF cropWindowRect = getCropWindowRect();
        h(cropWindowRect);
        this.f35649c.r(cropWindowRect);
    }

    public boolean m() {
        return this.f35667u;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
        if (this.f35649c.s()) {
            CropImageView.d dVar = this.f35671y;
            if (dVar == CropImageView.d.ON) {
                g(canvas);
            } else if (dVar == CropImageView.d.ON_TOUCH && this.f35666t != null) {
                g(canvas);
            }
        }
        e(canvas);
        f(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f35648b) {
            this.f35647a.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            o(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                p(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        q();
        return true;
    }

    public void r() {
        if (this.B) {
            setCropWindowRect(com.theartofdev.edmodo.cropper.c.f35709b);
            l();
            invalidate();
        }
    }

    public void s(float[] fArr, int i10, int i11) {
        if (fArr == null || !Arrays.equals(this.f35657k, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f35657k, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f35657k, 0, fArr.length);
            }
            this.f35659m = i10;
            this.f35660n = i11;
            RectF rectFH = this.f35649c.h();
            if (rectFH.width() == 0.0f || rectFH.height() == 0.0f) {
                l();
            }
        }
    }

    public void setAspectRatioX(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f35668v != i10) {
            this.f35668v = i10;
            this.f35670x = i10 / this.f35669w;
            if (this.B) {
                l();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f35669w != i10) {
            this.f35669w = i10;
            this.f35670x = this.f35668v / i10;
            if (this.B) {
                l();
                invalidate();
            }
        }
    }

    public void setCropShape(CropImageView.c cVar) {
        if (this.f35672z != cVar) {
            this.f35672z = cVar;
            invalidate();
        }
    }

    public void setCropWindowChangeListener(b bVar) {
        this.f35650d = bVar;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f35649c.r(rectF);
    }

    public void setFixedAspectRatio(boolean z10) {
        if (this.f35667u != z10) {
            this.f35667u = z10;
            if (this.B) {
                l();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.d dVar) {
        if (this.f35671y != dVar) {
            this.f35671y = dVar;
            if (this.B) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(f fVar) {
        this.f35649c.q(fVar);
        setCropShape(fVar.f35730a);
        setSnapRadius(fVar.f35731b);
        setGuidelines(fVar.f35733d);
        setFixedAspectRatio(fVar.f35741l);
        setAspectRatioX(fVar.f35742m);
        setAspectRatioY(fVar.f35743n);
        u(fVar.f35738i);
        this.f35664r = fVar.f35732c;
        this.f35663q = fVar.f35740k;
        this.f35652f = k(fVar.f35744o, fVar.f35745p);
        this.f35661o = fVar.f35747r;
        this.f35662p = fVar.f35748s;
        this.f35653g = k(fVar.f35746q, fVar.f35749t);
        this.f35654h = k(fVar.f35750u, fVar.f35751v);
        this.f35655i = j(fVar.f35752w);
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.A;
        if (rect == null) {
            rect = com.theartofdev.edmodo.cropper.c.f35708a;
        }
        rect2.set(rect);
        if (this.B) {
            l();
            invalidate();
            c(false);
        }
    }

    public void setSnapRadius(float f10) {
        this.f35665s = f10;
    }

    public void t(float f10, float f11, float f12, float f13) {
        this.f35649c.p(f10, f11, f12, f13);
    }

    public boolean u(boolean z10) {
        if (this.f35648b == z10) {
            return false;
        }
        this.f35648b = z10;
        if (!z10 || this.f35647a != null) {
            return true;
        }
        this.f35647a = new ScaleGestureDetector(getContext(), new c());
        return true;
    }
}
