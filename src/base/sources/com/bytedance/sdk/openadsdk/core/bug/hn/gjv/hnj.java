package com.bytedance.sdk.openadsdk.core.bug.hn.gjv;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.gjv;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends View {
    private int aq;
    private ValueAnimator bug;
    private float dkl;
    private gjv dnm;
    private float dse;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Paint f13633hn;
    private Paint hnj;
    private float mjg;
    private int ojm;
    private int orl;
    private RectF qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f13634sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f13635ta;

    public hnj(Context context) {
        super(context);
        this.gjv = com.bytedance.adsdk.ugeno.dse.hnj.hnj("#FFD813");
        this.f13634sk = com.bytedance.adsdk.ugeno.dse.hnj.hnj("rgba(0, 0, 0, 0.5)");
        this.dkl = 3.0f;
        this.dse = 0.0f;
        this.aq = 0;
        this.ojm = 100;
        this.f13635ta = "line";
        this.orl = 1000;
        setBackgroundColor(0);
        hnj();
    }

    private void hn(Canvas canvas) {
        Paint paint = this.hnj;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f10 = this.dkl;
        float f11 = this.dse;
        canvas.drawRoundRect(0.0f, 0.0f, width, f10, f11, f11, this.hnj);
        float width2 = (getWidth() * this.mjg) / this.ojm;
        this.f13633hn.setStyle(style);
        if (!TextUtils.equals(this.f13635ta, "line_reverse")) {
            float f12 = this.dkl;
            float f13 = this.dse;
            canvas.drawRoundRect(0.0f, 0.0f, width2, f12, f13, f13, this.f13633hn);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f14 = this.dkl;
            float f15 = this.dse;
            canvas.drawRoundRect(width3, 0.0f, width4, f14, f15, f15, this.f13633hn);
        }
    }

    public int getMaxProgress() {
        return this.ojm;
    }

    public int getProgress() {
        return this.aq;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.bug;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.f13635ta, "ring") || TextUtils.equals(this.f13635ta, "ring_reverse")) {
            hnj(canvas);
        } else {
            hn(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        gjv gjvVar = this.dnm;
        if (gjvVar != null) {
            int[] iArrHnj = gjvVar.hnj(i10, i11);
            super.onMeasure(iArrHnj[0], iArrHnj[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        if (TextUtils.equals(this.f13635ta, "ring") || TextUtils.equals(this.f13635ta, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.dkl);
        }
        gjv gjvVar2 = this.dnm;
        if (gjvVar2 != null) {
            gjvVar2.sk();
        }
    }

    public void setAnimationDuration(int i10) {
        this.orl = i10;
        this.bug.setDuration(i10);
    }

    public void setMaxProgress(int i10) {
        this.ojm = i10;
        invalidate();
    }

    public void setProgress(int i10) {
        int iMin = Math.min(i10, this.ojm);
        this.aq = iMin;
        if (iMin < 0) {
            this.aq = 0;
        }
        ValueAnimator valueAnimator = this.bug;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.bug.setFloatValues(this.mjg, this.aq);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.mjg + " progress=" + i10);
            this.bug.start();
        }
    }

    private void hnj() {
        Paint paint = new Paint(1);
        this.hnj = paint;
        paint.setColor(this.f13634sk);
        Paint paint2 = this.hnj;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f13633hn = paint3;
        paint3.setColor(this.gjv);
        this.f13633hn.setStyle(style);
        this.qor = new RectF();
        this.mjg = this.aq;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.bug = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.orl);
        this.bug.setInterpolator(new LinearInterpolator());
        this.bug.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                hnj.this.mjg = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hnj.this.invalidate();
            }
        });
    }

    public hnj hn(int i10) {
        this.hnj.setColor(i10);
        return this;
    }

    public hnj hn(float f10) {
        this.dse = f10;
        return this;
    }

    private void hnj(Canvas canvas) {
        float f10;
        int i10;
        float f11 = this.dkl / 2.0f;
        this.qor.set(f11, f11, getWidth() - f11, getHeight() - f11);
        Paint paint = this.hnj;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.hnj.setStrokeWidth(this.dkl);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f11, this.hnj);
        if (TextUtils.equals(this.f13635ta, "ring_reverse")) {
            f10 = this.mjg * (-360.0f);
            i10 = this.ojm;
        } else {
            f10 = this.mjg * 360.0f;
            i10 = this.ojm;
        }
        float f12 = f10 / i10;
        this.f13633hn.setStyle(style);
        this.f13633hn.setStrokeWidth(this.dkl);
        if (this.dse <= 0.0f) {
            this.f13633hn.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.f13633hn.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.qor, -90.0f, f12, false, this.f13633hn);
    }

    public hnj hnj(int i10) {
        this.f13633hn.setColor(i10);
        return this;
    }

    public hnj hnj(float f10) {
        this.dkl = f10;
        invalidate();
        return this;
    }

    public hnj hnj(String str) {
        this.f13635ta = str;
        return this;
    }

    public void hnj(gjv gjvVar) {
        this.dnm = gjvVar;
    }
}
