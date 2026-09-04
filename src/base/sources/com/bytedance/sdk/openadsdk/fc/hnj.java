package com.bytedance.sdk.openadsdk.fc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends View {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f14344hn;
    private final Paint hnj;
    private float qor;

    public hnj(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.hnj = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.qor;
        if (f10 > 0.0f) {
            float f11 = this.f14344hn;
            canvas.drawLine(0.0f, f11, f10, f11, this.hnj);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i11;
        this.f14344hn = (1.0f * f10) / 2.0f;
        this.hnj.setStrokeWidth(f10);
    }

    public void setProgress(float f10) {
        this.qor = getWidth() * f10;
        invalidate();
    }
}
