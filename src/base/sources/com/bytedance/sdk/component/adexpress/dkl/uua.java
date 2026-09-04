package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua extends View {
    private float aq;
    private long dkl;
    private float dse;
    private ValueAnimator gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12508hn;
    private float hnj;
    private Animator.AnimatorListener ojm;
    private ValueAnimator qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Paint f12509sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f12510ta;

    public uua(Context context, int i10) {
        super(context);
        this.dkl = 300L;
        this.dse = 0.0f;
        this.f12510ta = i10;
        hnj();
    }

    public void hn() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.aq);
        this.qor = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.dkl);
        this.qor.setInterpolator(new LinearInterpolator());
        this.qor.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.uua.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                uua.this.dse = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uua.this.invalidate();
            }
        });
        this.qor.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.hnj, this.f12508hn, this.dse, this.f12509sk);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.hnj = i10 / 2.0f;
        this.f12508hn = i11 / 2.0f;
        this.aq = (float) (Math.hypot(i10, i11) / 2.0d);
    }

    public void qor() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.aq, 0.0f);
        this.gjv = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.dkl);
        this.gjv.setInterpolator(new LinearInterpolator());
        this.gjv.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.uua.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                uua.this.dse = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uua.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.ojm;
        if (animatorListener != null) {
            this.gjv.addListener(animatorListener);
        }
        this.gjv.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.ojm = animatorListener;
    }

    public void hnj() {
        Paint paint = new Paint(1);
        this.f12509sk = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f12509sk.setColor(this.f12510ta);
    }
}
