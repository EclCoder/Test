package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BallPulseSyncIndicator extends Indicator {
    float[] translateYFloats = new float[3];

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = (getWidth() - 8.0f) / 6.0f;
        float f10 = 2.0f * width;
        float width2 = (getWidth() / 2) - (f10 + 4.0f);
        for (int i10 = 0; i10 < 3; i10++) {
            canvas.save();
            float f11 = i10;
            canvas.translate((f10 * f11) + width2 + (f11 * 4.0f), this.translateYFloats[i10]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = (getWidth() - 8.0f) / 6.0f;
        int[] iArr = {70, 140, Sdk$SDKError.b.AD_NOT_LOADED_VALUE};
        for (final int i10 = 0; i10 < 3; i10++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getHeight() / 2, (getHeight() / 2) - (2.0f * width), getHeight() / 2);
            valueAnimatorOfFloat.setDuration(600L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i10]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallPulseSyncIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallPulseSyncIndicator.this.translateYFloats[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallPulseSyncIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
