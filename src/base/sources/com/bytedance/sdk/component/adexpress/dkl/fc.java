package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc extends FrameLayout {
    private TextView dkl;
    private AnimatorSet gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private ImageView f12477hn;
    private Context hnj;
    private wu qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12478sk;

    public fc(Context context) {
        super(context);
        this.f12478sk = true;
        this.hnj = context;
        this.gjv = new AnimatorSet();
        qor();
        gjv();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.fc.1
            @Override // java.lang.Runnable
            public void run() {
                int iHnj = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(fc.this.hnj, 50.0f);
                int iHnj2 = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(fc.this.hnj, 50.0f);
                if (fc.this.qor.getMeasuredHeight() > 0) {
                    iHnj = fc.this.qor.getMeasuredHeight();
                }
                if (fc.this.qor.getMeasuredWidth() > 0) {
                    iHnj2 = fc.this.qor.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fc.this.f12477hn.getLayoutParams();
                layoutParams.topMargin = ((int) ((iHnj / 2.0f) - com.bytedance.sdk.component.adexpress.gjv.dse.hnj(fc.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(fc.this.hnj, 40.0f));
                layoutParams.leftMargin = ((int) ((iHnj2 / 2.0f) - com.bytedance.sdk.component.adexpress.gjv.dse.hnj(fc.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(fc.this.hnj, 20.0f));
                layoutParams.bottomMargin = (int) (((-iHnj) / 2.0f) + com.bytedance.sdk.component.adexpress.gjv.dse.hnj(fc.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-iHnj2) / 2.0f) + com.bytedance.sdk.component.adexpress.gjv.dse.hnj(fc.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                fc.this.f12477hn.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.dkl.setVisibility(0);
        this.dkl.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.dkl.setTextColor(i10);
    }

    private void gjv() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f12477hn, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.fc.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (fc.this.f12478sk) {
                    fc.this.qor.hnj();
                }
                fc fcVar = fc.this;
                fcVar.f12478sk = !fcVar.f12478sk;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(fc.this.f12477hn, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                fc.this.f12477hn.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f12477hn, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.gjv.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void qor() {
        this.qor = new wu(this.hnj);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 50.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 40.0f);
        int iHnj = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 20.0f);
        layoutParams.leftMargin = iHnj;
        layoutParams.setMarginStart(iHnj);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.qor, layoutParams);
        this.f12477hn = new ImageView(this.hnj);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 78.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 78.0f));
        this.f12477hn.setImageResource(com.bytedance.sdk.component.utils.wu.gjv(this.hnj, "tt_splash_hand"));
        addView(this.f12477hn, layoutParams2);
        TextView textView = new TextView(this.hnj);
        this.dkl = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 10.0f);
        addView(this.dkl, layoutParams3);
        this.dkl.setVisibility(8);
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
        ImageView imageView = this.f12477hn;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void hnj() {
        this.gjv.start();
    }
}
