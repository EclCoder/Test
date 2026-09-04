package com.bytedance.sdk.openadsdk.core.dkl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends FrameLayout {
    private boolean aq;
    private boolean dkl;
    private ValueAnimator dse;
    private Drawable gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13697hn;
    private int hnj;
    private Drawable qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Drawable f13698sk;

    public dkl(Context context) {
        super(context);
        this.hnj = 100;
    }

    private void hnj() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.dse = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.dse.setRepeatCount(-1);
        this.dse.setInterpolator(new LinearInterpolator());
        this.dse.setRepeatMode(1);
        this.dse.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.dkl.dkl.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                dkl.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.dse.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.dkl = true;
        if (this.f13698sk != null) {
            hnj();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.dkl = false;
        ValueAnimator valueAnimator = this.dse;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.dse.removeAllUpdateListeners();
            this.dse = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            ValueAnimator valueAnimator = this.dse;
            if (valueAnimator == null || this.aq) {
                return;
            }
            this.aq = true;
            valueAnimator.pause();
            return;
        }
        if (this.aq) {
            this.aq = false;
            ValueAnimator valueAnimator2 = this.dse;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                hnj();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.f13698sk = drawable;
        setProgressDrawable(drawable);
        if (this.dkl && this.dse == null) {
            hnj();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(ojm.hnj(this, layoutParams));
    }

    public void setMax(int i10) {
        this.hnj = i10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setProgress(int i10) {
        this.f13697hn = i10;
        Drawable drawable = this.qor;
        if (drawable != null) {
            drawable.setLevel((int) ((i10 * 10000.0f) / this.hnj));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.gjv = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.gjv;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable3 = ((LayerDrawable) this.gjv).getDrawable(i10);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.qor = drawable3;
                }
            }
        }
        Drawable drawable4 = this.gjv;
        if (drawable4 instanceof RotateDrawable) {
            this.qor = drawable4;
        }
    }

    public dkl(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.hnj = 100;
    }
}
