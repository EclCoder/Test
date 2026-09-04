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
public class orl extends FrameLayout {
    private TextView dkl;
    private AnimatorSet gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private ImageView f12498hn;
    private Context hnj;
    private gjv qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12499sk;

    public orl(Context context) {
        super(context);
        this.f12499sk = true;
        this.hnj = context;
        this.gjv = new AnimatorSet();
        qor();
        gjv();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.orl.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) orl.this.f12498hn.getLayoutParams();
                layoutParams.topMargin = ((int) ((orl.this.qor.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.gjv.dse.hnj(orl.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(orl.this.hnj, 20.0f));
                layoutParams.leftMargin = ((int) ((orl.this.qor.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.gjv.dse.hnj(orl.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(orl.this.hnj, 20.0f));
                layoutParams.bottomMargin = (int) (((-orl.this.qor.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.gjv.dse.hnj(orl.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-orl.this.qor.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.gjv.dse.hnj(orl.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                orl.this.f12498hn.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.dkl.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.dkl.setTextColor(i10);
    }

    private void gjv() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f12498hn, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.orl.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (orl.this.f12499sk) {
                    orl.this.qor.hnj();
                    orl.this.qor.setAlpha(1.0f);
                } else {
                    orl.this.qor.hn();
                    orl.this.qor.setAlpha(0.0f);
                }
                orl orlVar = orl.this;
                orlVar.f12499sk = !orlVar.f12499sk;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(orl.this.f12498hn, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                orl.this.f12498hn.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f12498hn, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.gjv.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void qor() {
        this.qor = new gjv(this.hnj);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 80.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 20.0f);
        int iHnj = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 20.0f);
        layoutParams.leftMargin = iHnj;
        layoutParams.setMarginStart(iHnj);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.qor, layoutParams);
        this.qor.hnj();
        this.f12498hn = new ImageView(this.hnj);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 80.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 80.0f));
        this.f12498hn.setImageResource(com.bytedance.sdk.component.utils.wu.gjv(this.hnj, "tt_splash_hand"));
        addView(this.f12498hn, layoutParams2);
        TextView textView = new TextView(this.hnj);
        this.dkl = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 10.0f);
        addView(this.dkl, layoutParams3);
    }

    public void hn() {
        AnimatorSet animatorSet = this.gjv;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        gjv gjvVar = this.qor;
        if (gjvVar != null) {
            gjvVar.hn();
        }
    }

    public void hnj() {
        this.gjv.start();
    }
}
