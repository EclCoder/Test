package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BallScaleIndicator extends Indicator {
    float scale = 1.0f;
    int alpha = 255;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        paint.setAlpha(this.alpha);
        float f10 = this.scale;
        canvas.scale(f10, f10, getWidth() / 2, getHeight() / 2);
        paint.setAlpha(this.alpha);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - 4.0f, paint);
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallScaleIndicator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BallScaleIndicator.this.scale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallScaleIndicator.this.postInvalidate();
            }
        });
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallScaleIndicator.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BallScaleIndicator.this.alpha = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                BallScaleIndicator.this.postInvalidate();
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfInt);
        return arrayList;
    }
}
