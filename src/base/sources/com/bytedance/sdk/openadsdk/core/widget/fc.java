package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc extends com.bytedance.sdk.openadsdk.core.dkl.aq {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private RectF f14264hn;
    private Paint hnj;
    private int qor;

    public fc(Context context) {
        this(context, null);
    }

    private void hnj() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.hnj = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.hnj.setColor(Color.parseColor("#99333333"));
        this.hnj.setAntiAlias(true);
        this.hnj.setStrokeWidth(0.0f);
        this.f14264hn = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f14264hn;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.hnj);
        canvas.translate((this.f14264hn.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.dkl.aq, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f14264hn.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.qor = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i12 = measuredWidth + ((measuredHeight / 2) * 2);
        setMeasuredDimension(i12, measuredHeight);
        this.f14264hn.set(0.0f, 0.0f, i12, measuredHeight);
    }

    public fc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fc(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.qor = 0;
        hnj();
    }
}
