package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BallSpinFadeLoaderIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    float[] scaleFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class Point {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f35911x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f35912y;

        public Point(float f10, float f11) {
            this.f35911x = f10;
            this.f35912y = f11;
        }
    }

    Point circleAt(int i10, int i11, float f10, double d10) {
        double d11 = f10;
        return new Point((float) (((double) (i10 / 2)) + (Math.cos(d10) * d11)), (float) (((double) (i11 / 2)) + (d11 * Math.sin(d10))));
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        for (int i10 = 0; i10 < 8; i10++) {
            canvas.save();
            Point pointCircleAt = circleAt(getWidth(), getHeight(), (getWidth() / 2) - width, 0.7853981633974483d * ((double) i10));
            canvas.translate(pointCircleAt.f35911x, pointCircleAt.f35912y);
            float f10 = this.scaleFloats[i10];
            canvas.scale(f10, f10);
            paint.setAlpha(this.alphas[i10]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {0, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, PsExtractor.VIDEO_STREAM_MASK, 360, 480, Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE, 720, 780, 840};
        for (final int i10 = 0; i10 < 8; i10++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.4f, 1.0f);
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i10]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallSpinFadeLoaderIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallSpinFadeLoaderIndicator.this.scaleFloats[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallSpinFadeLoaderIndicator.this.postInvalidate();
                }
            });
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 77, 255);
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr[i10]);
            addUpdateListener(valueAnimatorOfInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallSpinFadeLoaderIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallSpinFadeLoaderIndicator.this.alphas[i10] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallSpinFadeLoaderIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
