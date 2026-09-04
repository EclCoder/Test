package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class pty extends dkl {
    private int apu;
    private boolean eum;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    ObjectAnimator f12541hn;
    ObjectAnimator hnj;
    private Runnable wu;

    public pty(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        this.apu = 0;
        this.eum = false;
        this.wu = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pty.1
            @Override // java.lang.Runnable
            public void run() {
                pty.this.hnj();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ua
    public void hn() {
        removeCallbacks(this.wu);
        ObjectAnimator objectAnimator = this.hnj;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.hnj.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f12541hn;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f12541hn.cancel();
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
        postDelayed(this.wu, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj() {
        final View childAt;
        final View childAt2 = getChildAt(this.apu);
        int i10 = this.apu;
        if (i10 == 0) {
            this.eum = false;
        }
        boolean z10 = i10 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.apu + 1)).getChildCount() <= 0;
        if (this.orl.ta().sk().hnj() || !z10) {
            View childAt3 = z10 ? getChildAt((this.apu + 2) % getChildCount()) : getChildAt((this.apu + 1) % getChildCount());
            this.hnj = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (-(this.aq + getChildAt(this.apu).getHeight())) / 2);
            if (z10) {
                this.apu++;
            }
            childAt = childAt3;
        } else {
            this.eum = true;
            childAt = getChildAt(this.apu - 1);
            this.hnj = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (this.aq + getChildAt(this.apu).getHeight()) / 2);
        }
        this.hnj.setInterpolator(new LinearInterpolator());
        this.hnj.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pty.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
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
        if (this.eum) {
            this.f12541hn = ObjectAnimator.ofFloat(childAt, "translationY", (-(this.aq + childAt.getHeight())) / 2, 0.0f);
        } else {
            this.f12541hn = ObjectAnimator.ofFloat(childAt, "translationY", (this.aq + childAt.getHeight()) / 2, 0.0f);
        }
        this.f12541hn.setInterpolator(new LinearInterpolator());
        this.f12541hn.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pty.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt.setVisibility(0);
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
        this.f12541hn.setDuration(500L);
        this.hnj.start();
        this.f12541hn.start();
        if (this.eum) {
            this.apu--;
        } else {
            int i11 = this.apu + 1;
            this.apu = i11;
            this.apu = i11 % getChildCount();
        }
        postDelayed(this.wu, 3000L);
    }
}
