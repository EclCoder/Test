package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class CubeTransitionIndicator extends Indicator {
    float degrees;
    float[] translateX = new float[2];
    float[] translateY = new float[2];
    float scaleFloat = 1.0f;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 5;
        float height = getHeight() / 5;
        for (int i10 = 0; i10 < 2; i10++) {
            canvas.save();
            canvas.translate(this.translateX[i10], this.translateY[i10]);
            canvas.rotate(this.degrees);
            float f10 = this.scaleFloat;
            canvas.scale(f10, f10);
            canvas.drawRect(new RectF((-width) / 2.0f, (-height) / 2.0f, width / 2.0f, height / 2.0f), paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        char c10;
        char c11;
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = getWidth() / 5;
        float height = getHeight() / 5;
        char c12 = 0;
        final int i10 = 0;
        while (i10 < 2) {
            this.translateX[i10] = width;
            float width2 = getWidth() - width;
            float width3 = getWidth() - width;
            float[] fArr = new float[5];
            fArr[c12] = width;
            fArr[1] = width2;
            fArr[2] = width3;
            fArr[3] = width;
            fArr[4] = width;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            if (i10 == 1) {
                float width4 = getWidth() - width;
                float width5 = getWidth() - width;
                c10 = c12;
                float width6 = getWidth() - width;
                c11 = 2;
                float[] fArr2 = new float[5];
                fArr2[c10] = width4;
                fArr2[1] = width;
                fArr2[2] = width;
                fArr2[3] = width5;
                fArr2[4] = width6;
                valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr2);
            } else {
                c10 = c12;
                c11 = 2;
            }
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(1600L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.CubeTransitionIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CubeTransitionIndicator.this.translateX[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CubeTransitionIndicator.this.postInvalidate();
                }
            });
            this.translateY[i10] = height;
            float height2 = getHeight() - height;
            float height3 = getHeight() - height;
            float[] fArr3 = new float[5];
            fArr3[c10] = height;
            fArr3[1] = height;
            fArr3[c11] = height2;
            fArr3[3] = height3;
            fArr3[4] = height;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr3);
            if (i10 == 1) {
                float height4 = getHeight() - height;
                float height5 = getHeight() - height;
                float height6 = getHeight() - height;
                float[] fArr4 = new float[5];
                fArr4[c10] = height4;
                fArr4[1] = height5;
                fArr4[c11] = height;
                fArr4[3] = height;
                fArr4[4] = height6;
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr4);
            }
            valueAnimatorOfFloat2.setDuration(1600L);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat2, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.CubeTransitionIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CubeTransitionIndicator.this.translateY[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CubeTransitionIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfFloat2);
            i10++;
            c12 = c10;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.5f, 1.0f, 0.5f, 1.0f);
        valueAnimatorOfFloat3.setDuration(1600L);
        valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat3.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat3, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.CubeTransitionIndicator.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CubeTransitionIndicator.this.scaleFloat = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CubeTransitionIndicator.this.postInvalidate();
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f, 540.0f, 720.0f);
        valueAnimatorOfFloat4.setDuration(1600L);
        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat4.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat4, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.CubeTransitionIndicator.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CubeTransitionIndicator.this.degrees = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CubeTransitionIndicator.this.postInvalidate();
            }
        });
        arrayList.add(valueAnimatorOfFloat3);
        arrayList.add(valueAnimatorOfFloat4);
        return arrayList;
    }
}
