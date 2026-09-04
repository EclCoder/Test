package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BallZigZagIndicator extends Indicator {
    float[] translateX = new float[2];
    float[] translateY = new float[2];

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        for (int i10 = 0; i10 < 2; i10++) {
            canvas.save();
            canvas.translate(this.translateX[i10], this.translateY[i10]);
            canvas.drawCircle(0.0f, 0.0f, getWidth() / 10, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = getWidth() / 6;
        float width2 = getWidth() / 6;
        for (final int i10 = 0; i10 < 2; i10++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(width, getWidth() - width, getWidth() / 2, width);
            if (i10 == 1) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(getWidth() - width, width, getWidth() / 2, getWidth() - width);
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(width2, width2, getHeight() / 2, width2);
            if (i10 == 1) {
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getHeight() - width2, getHeight() - width2, getHeight() / 2, getHeight() - width2);
            }
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallZigZagIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallZigZagIndicator.this.translateX[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallZigZagIndicator.this.postInvalidate();
                }
            });
            valueAnimatorOfFloat2.setDuration(1000L);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat2, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallZigZagIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallZigZagIndicator.this.translateY[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallZigZagIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfFloat2);
        }
        return arrayList;
    }
}
