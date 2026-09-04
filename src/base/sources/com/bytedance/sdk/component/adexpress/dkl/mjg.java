package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg extends FrameLayout {
    private AnimatorSet gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private ImageView f12490hn;
    private Context hnj;
    private wu qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12491sk;

    public mjg(Context context) {
        super(context);
        this.f12491sk = true;
        this.hnj = context;
        this.gjv = new AnimatorSet();
        qor();
        gjv();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.mjg.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mjg.this.f12490hn.getLayoutParams();
                layoutParams.topMargin = (int) ((mjg.this.qor.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.gjv.dse.hnj(mjg.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((mjg.this.qor.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.gjv.dse.hnj(mjg.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-mjg.this.qor.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.gjv.dse.hnj(mjg.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-mjg.this.qor.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.gjv.dse.hnj(mjg.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                mjg.this.f12490hn.setLayoutParams(layoutParams);
            }
        });
    }

    private void gjv() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f12490hn, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.mjg.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (mjg.this.f12491sk) {
                    mjg.this.qor.hnj();
                }
                mjg mjgVar = mjg.this;
                mjgVar.f12491sk = !mjgVar.f12491sk;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(mjg.this.f12490hn, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                mjg.this.f12490hn.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f12490hn, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.gjv.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void qor() {
        this.qor = new wu(this.hnj);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 40.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.qor, layoutParams);
        this.f12490hn = new ImageView(this.hnj);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 62.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 62.0f));
        layoutParams2.gravity = 16;
        this.f12490hn.setImageResource(com.bytedance.sdk.component.utils.wu.gjv(this.hnj, "tt_splash_hand"));
        addView(this.f12490hn, layoutParams2);
    }

    public void hn() {
        AnimatorSet animatorSet = this.gjv;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        wu wuVar = this.qor;
        if (wuVar != null) {
            wuVar.hn();
        }
        ImageView imageView = this.f12490hn;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void hnj() {
        this.gjv.start();
    }
}
