package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class LineScaleIndicator extends Indicator {
    public static final float SCALE = 1.0f;
    float[] scaleYFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 11;
        float height = getHeight() / 2;
        for (int i10 = 0; i10 < 5; i10++) {
            canvas.save();
            float f10 = width / 2.0f;
            canvas.translate((((i10 * 2) + 2) * width) - f10, height);
            canvas.scale(1.0f, this.scaleYFloats[i10]);
            canvas.drawRoundRect(new RectF((-width) / 2.0f, (-getHeight()) / 2.5f, f10, getHeight() / 2.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        long[] jArr = {100, 200, 300, 400, 500};
        for (final int i10 = 0; i10 < 5; i10++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.4f, 1.0f);
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(jArr[i10]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.LineScaleIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LineScaleIndicator.this.scaleYFloats[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    LineScaleIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
