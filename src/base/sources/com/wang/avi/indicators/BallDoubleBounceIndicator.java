package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BallDoubleBounceIndicator extends Indicator {
    public static final float SCALE = 1.0f;
    private float[] scaleFloats = {1.0f, 1.0f};

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float fMin = Math.min(getWidth(), getHeight()) / 2.5f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Paint paint2 = new Paint(paint);
        paint2.setAlpha(153);
        for (int i10 = 0; i10 < 2; i10++) {
            canvas.save();
            canvas.translate(width, height);
            float f10 = this.scaleFloats[i10];
            canvas.scale(f10, f10);
            canvas.drawCircle(0.0f, 0.0f, fMin, paint2);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {0, 1000};
        for (final int i10 = 0; i10 < 2; i10++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(2000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i10]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallDoubleBounceIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallDoubleBounceIndicator.this.scaleFloats[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallDoubleBounceIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
