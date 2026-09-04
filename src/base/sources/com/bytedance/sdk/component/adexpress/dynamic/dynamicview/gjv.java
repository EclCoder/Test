package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends dkl {
    private int apu;
    private Runnable eum;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    ObjectAnimator f12535hn;
    ObjectAnimator hnj;

    public gjv(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        this.apu = 0;
        this.eum = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gjv.1
            @Override // java.lang.Runnable
            public void run() {
                gjv.this.hnj();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ua
    public void hn() {
        removeCallbacks(this.eum);
        ObjectAnimator objectAnimator = this.hnj;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.hnj.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f12535hn;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f12535hn.cancel();
        }
        super.hn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.aq - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i10 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.eum, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj() {
        final View childAt = getChildAt(this.apu);
        final View childAt2 = getChildAt((this.apu + 1) % getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(this.aq + getChildAt(this.apu).getHeight())) / 2);
        this.hnj = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.hnj.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gjv.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (this.aq + childAt2.getHeight()) / 2, 0.0f);
        this.f12535hn = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.f12535hn.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gjv.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        this.hnj.setDuration(500L);
        this.f12535hn.setDuration(500L);
        this.hnj.start();
        this.f12535hn.start();
        int i10 = this.apu + 1;
        this.apu = i10;
        this.apu = i10 % getChildCount();
        postDelayed(this.eum, 2000L);
    }
}
