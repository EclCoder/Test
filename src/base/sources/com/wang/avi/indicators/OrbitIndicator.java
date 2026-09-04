package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class OrbitIndicator extends Indicator {
    private float ring1Scale = 0.0f;
    private float ring1Alpha = 1.0f;
    private float ring2Scale = 0.0f;
    private float ring2Alpha = 1.0f;
    private float coreScale = 1.0f;
    private float satelliteRotation = 0.0f;
    private final float satelliteCoreRatio = 0.25f;
    private final float distanceRatio = 1.5f;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float fMin = Math.min(getWidth(), getHeight());
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = fMin / 2.75f;
        float f11 = 0.25f * f10;
        Paint paint2 = new Paint(paint);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setAlpha((int) (this.ring1Alpha * 255.0f * 0.6f));
        canvas.save();
        canvas.translate(width, height);
        float f12 = this.ring1Scale;
        canvas.scale(f12, f12);
        float f13 = f10 / 2.0f;
        canvas.drawCircle(0.0f, 0.0f, f13, paint2);
        canvas.restore();
        Paint paint3 = new Paint(paint);
        paint3.setStyle(style);
        paint3.setAlpha((int) (this.ring2Alpha * 255.0f * 0.6f));
        canvas.save();
        canvas.translate(width, height);
        float f14 = this.ring2Scale;
        canvas.scale(f14, f14);
        canvas.drawCircle(0.0f, 0.0f, f13, paint3);
        canvas.restore();
        canvas.save();
        canvas.translate(width, height);
        float f15 = this.coreScale;
        canvas.scale(f15, f15);
        canvas.drawCircle(0.0f, 0.0f, f13, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width, height);
        canvas.rotate(this.satelliteRotation);
        canvas.translate((fMin - f11) / 2.0f, 0.0f);
        canvas.drawCircle(0.0f, 0.0f, f11 / 2.0f, paint);
        canvas.restore();
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        long j10 = 1900;
        valueAnimatorOfFloat.setDuration(j10);
        valueAnimatorOfFloat.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.OrbitIndicator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue <= 0.45f) {
                    OrbitIndicator.this.ring1Scale = 0.0f;
                    OrbitIndicator.this.ring1Alpha = 1.0f;
                } else {
                    float f10 = (fFloatValue - 0.45f) / 0.55f;
                    OrbitIndicator.this.ring1Scale = 2.5f * f10;
                    OrbitIndicator.this.ring1Alpha = 1.0f - f10;
                }
                OrbitIndicator.this.postInvalidate();
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(j10);
        valueAnimatorOfFloat2.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat2, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.OrbitIndicator.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue <= 0.55f) {
                    OrbitIndicator.this.ring2Scale = 0.0f;
                    OrbitIndicator.this.ring2Alpha = 1.0f;
                } else {
                    OrbitIndicator.this.ring2Scale = ((fFloatValue - 0.55f) / 0.45f) * 2.6f;
                    if (fFloatValue <= 0.65f) {
                        OrbitIndicator.this.ring2Alpha = 1.0f;
                    } else {
                        OrbitIndicator.this.ring2Alpha = 1.0f - ((fFloatValue - 0.65f) / 0.35f);
                    }
                }
                OrbitIndicator.this.postInvalidate();
            }
        });
        arrayList.add(valueAnimatorOfFloat2);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(j10);
        valueAnimatorOfFloat3.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat3, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.OrbitIndicator.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue <= 0.45f) {
                    OrbitIndicator.this.coreScale = ((fFloatValue / 0.45f) * 0.3f) + 1.0f;
                } else if (fFloatValue <= 0.55f) {
                    OrbitIndicator.this.coreScale = 1.3f;
                } else {
                    OrbitIndicator.this.coreScale = 1.3f - (((fFloatValue - 0.55f) / 0.45f) * 0.3f);
                }
                OrbitIndicator.this.postInvalidate();
            }
        });
        arrayList.add(valueAnimatorOfFloat3);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 360.0f);
        valueAnimatorOfFloat4.setDuration(j10);
        valueAnimatorOfFloat4.setRepeatCount(-1);
        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        addUpdateListener(valueAnimatorOfFloat4, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.OrbitIndicator.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                OrbitIndicator.this.satelliteRotation = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                OrbitIndicator.this.postInvalidate();
            }
        });
        arrayList.add(valueAnimatorOfFloat4);
        return arrayList;
    }
}
