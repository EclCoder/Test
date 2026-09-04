package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip extends View {
    private int dkl;
    private boolean dse;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Paint f12488hn;
    private Context hnj;
    private RectF qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private ValueAnimator f12489sk;

    public jip(Context context) {
        super(context);
        this.dkl = 1500;
        this.hnj = context;
        Paint paint = new Paint();
        this.f12488hn = paint;
        paint.setAntiAlias(true);
        this.f12488hn.setStyle(Paint.Style.STROKE);
        this.f12488hn.setStrokeWidth(10.0f);
        this.f12488hn.setColor(Color.parseColor("#80FFFFFF"));
        this.qor = new RectF();
    }

    public void hn() {
        ValueAnimator valueAnimator = this.f12489sk;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.dse) {
            return;
        }
        canvas.drawArc(this.qor, 270.0f, this.gjv, false, this.f12488hn);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.qor.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }

    public void qor() {
        this.dse = true;
        invalidate();
    }

    public void setDuration(int i10) {
        this.dkl = i10;
    }

    public void hnj() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f12489sk = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.dkl);
        this.f12489sk.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.jip.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                jip.this.gjv = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jip.this.requestLayout();
            }
        });
        this.f12489sk.start();
    }
}
