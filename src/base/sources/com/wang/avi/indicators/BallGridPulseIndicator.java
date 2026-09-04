package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BallGridPulseIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255, 255};
    float[] scaleFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = (getWidth() - 16.0f) / 6.0f;
        float f10 = 2.0f * width;
        float f11 = f10 + 4.0f;
        float width2 = (getWidth() / 2) - f11;
        float width3 = (getWidth() / 2) - f11;
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                canvas.save();
                float f12 = i11;
                float f13 = (f10 * f12) + width2 + (f12 * 4.0f);
                float f14 = i10;
                canvas.translate(f13, (f10 * f14) + width3 + (f14 * 4.0f));
                int i12 = (i10 * 3) + i11;
                float f15 = this.scaleFloats[i12];
                canvas.scale(f15, f15);
                paint.setAlpha(this.alphas[i12]);
                canvas.drawCircle(0.0f, 0.0f, width, paint);
                canvas.restore();
            }
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {720, 1020, 1280, 1420, 1450, 1180, 870, 1450, 1060};
        int[] iArr2 = {-60, 250, -170, 480, Sdk$SDKError.b.AD_HTML_FAILED_TO_LOAD_VALUE, 30, 460, 780, 450};
        for (final int i10 = 0; i10 < 9; i10++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.5f, 1.0f);
            valueAnimatorOfFloat.setDuration(iArr[i10]);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr2[i10]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallGridPulseIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallGridPulseIndicator.this.scaleFloats[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallGridPulseIndicator.this.postInvalidate();
                }
            });
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, Sdk$SDKError.b.AD_NOT_LOADED_VALUE, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE, 255);
            valueAnimatorOfInt.setDuration(iArr[i10]);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr2[i10]);
            addUpdateListener(valueAnimatorOfInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallGridPulseIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallGridPulseIndicator.this.alphas[i10] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallGridPulseIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
