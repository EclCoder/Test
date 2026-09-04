package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BallGridBeatIndicator extends Indicator {
    public static final int ALPHA = 255;
    int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255, 255};

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
                paint.setAlpha(this.alphas[(i10 * 3) + i11]);
                canvas.drawCircle(0.0f, 0.0f, width, paint);
                canvas.restore();
            }
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {960, 930, 1190, 1130, 1340, 940, 1200, 820, 1190};
        int[] iArr2 = {360, 400, 680, TTAdConstant.IMAGE_LIST_SIZE_CODE, 710, -150, -120, 10, Sdk$SDKError.b.WEBVIEW_ERROR_VALUE};
        for (final int i10 = 0; i10 < 9; i10++) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 168, 255);
            valueAnimatorOfInt.setDuration(iArr[i10]);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr2[i10]);
            addUpdateListener(valueAnimatorOfInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallGridBeatIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallGridBeatIndicator.this.alphas[i10] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallGridBeatIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
