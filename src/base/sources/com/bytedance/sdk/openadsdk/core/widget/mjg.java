package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg extends com.bytedance.sdk.openadsdk.core.dkl.gjv {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private RectF f14294hn;
    private Paint hnj;

    public mjg(Context context) {
        super(context);
        hnj();
    }

    private void hnj() {
        Paint paint = new Paint();
        this.hnj = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.hnj.setColor(Color.parseColor("#99333333"));
        this.hnj.setAntiAlias(true);
        this.hnj.setStrokeWidth(0.0f);
        this.f14294hn = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f14294hn;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.hnj);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.dkl.gjv, android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f14294hn.right == getMeasuredWidth() && this.f14294hn.bottom == getMeasuredHeight()) {
            return;
        }
        this.f14294hn.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
