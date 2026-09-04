package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class wu extends View {
    private static int qor = 50;
    private ObjectAnimator gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12511hn;
    private Paint hnj;

    public wu(Context context) {
        this(context, null);
    }

    private void qor() {
        Paint paint = new Paint();
        this.hnj = paint;
        paint.setAntiAlias(true);
        this.hnj.setColor(Color.parseColor("#FFFFFFFF"));
        this.hnj.setStyle(Paint.Style.STROKE);
        this.hnj.setStrokeWidth(18.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.gjv = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
    }

    public void hn() {
        clearAnimation();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.hnj.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.f12511hn, this.hnj);
    }

    public wu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public wu(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12511hn = 10;
        qor();
    }

    public void hnj() {
        int iMin = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        qor = iMin;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(10, iMin);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.wu.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                wu.this.f12511hn = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wu.this.invalidate();
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.wu.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                wu.this.gjv.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                wu.this.setVisibility(0);
                wu.this.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        valueAnimatorOfInt.start();
    }
}
