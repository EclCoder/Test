package com.wang.avi.indicators;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class LineSpinFadeLoaderIndicator extends BallSpinFadeLoaderIndicator {
    @Override // com.wang.avi.indicators.BallSpinFadeLoaderIndicator, com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        for (int i10 = 0; i10 < 8; i10++) {
            canvas.save();
            BallSpinFadeLoaderIndicator.Point pointCircleAt = circleAt(getWidth(), getHeight(), (getWidth() / 2.5f) - width, 0.7853981633974483d * ((double) i10));
            canvas.translate(pointCircleAt.f35911x, pointCircleAt.f35912y);
            float f10 = this.scaleFloats[i10];
            canvas.scale(f10, f10);
            canvas.rotate(i10 * 45);
            paint.setAlpha(this.alphas[i10]);
            float f11 = -width;
            canvas.drawRoundRect(new RectF(f11, f11 / 1.5f, width * 1.5f, width / 1.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }
}
