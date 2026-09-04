package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class AudioEqualizerIndicator extends Indicator {
    private static final int BAR_COUNT = 4;
    private float[] scaleFloats = new float[4];

    public AudioEqualizerIndicator() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.scaleFloats[i10] = 0.5f;
        }
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 9.0f;
        float f10 = width / 2.0f;
        float width2 = (getWidth() - ((4.0f * width) + (3.0f * f10))) / 2.0f;
        float height = getHeight() * 0.8f;
        float height2 = getHeight() - (getHeight() * 0.1f);
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = width2 + (i10 * (width + f10));
            canvas.drawRect(f11, height2 - (this.scaleFloats[i10] * height), f11 + width, height2, paint);
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {4300, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 1700, 3100};
        float[] fArr = {0.0f, 0.7f, 0.4f, 0.05f, 0.95f, 0.3f, 0.9f, 0.4f, 0.15f, 0.18f, 0.75f, 0.01f};
        for (final int i10 = 0; i10 < 4; i10++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            valueAnimatorOfFloat.setDuration(iArr[i10]);
            valueAnimatorOfFloat.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.AudioEqualizerIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AudioEqualizerIndicator.this.scaleFloats[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    AudioEqualizerIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
