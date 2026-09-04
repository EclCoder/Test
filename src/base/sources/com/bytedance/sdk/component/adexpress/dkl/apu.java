package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu extends FrameLayout {
    private AnimatorSet aq;
    private AnimatorSet dkl;
    private AnimatorSet dse;
    private ImageView gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private ImageView f12459hn;
    private Context hnj;
    private AnimatorSet ojm;
    private ImageView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private TextView f12460sk;

    public apu(Context context) {
        super(context);
        this.dkl = new AnimatorSet();
        this.dse = new AnimatorSet();
        this.aq = new AnimatorSet();
        this.ojm = new AnimatorSet();
        this.hnj = context;
        qor();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setGuideText(String str) {
        this.f12460sk.setText(str);
    }

    private void gjv() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f12459hn, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.qor, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.qor, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.gjv, "alpha", 0.0f, 1.0f);
        this.aq.setDuration(300L);
        this.aq.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f12459hn, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.apu.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) apu.this.gjv.getLayoutParams();
                layoutParams.width = num.intValue();
                apu.this.gjv.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.qor, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.ojm.setDuration(1500L);
        this.ojm.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f12459hn, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.gjv, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.qor, "alpha", 1.0f, 0.0f);
        this.dse.setDuration(50L);
        this.dse.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.dkl.playSequentially(this.aq, this.ojm, this.dse);
    }

    private void qor() {
        ImageView imageView = new ImageView(this.hnj);
        this.gjv = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.wu.gjv(this.hnj, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 30.0f);
        addView(this.gjv, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.hnj);
        this.qor = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.wu.gjv(this.hnj, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 50.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 30.0f);
        addView(this.qor, layoutParams2);
        ImageView imageView3 = new ImageView(this.hnj);
        this.f12459hn = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.wu.gjv(this.hnj, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 80.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 30.0f);
        addView(this.f12459hn, layoutParams3);
        TextView textView = new TextView(this.hnj);
        this.f12460sk = textView;
        textView.setTextColor(-1);
        this.f12460sk.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.f12460sk, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.apu.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) apu.this.f12459hn.getLayoutParams();
                layoutParams5.topMargin = (int) ((apu.this.qor.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.gjv.dse.hnj(apu.this.getContext(), 7.0f));
                int iHnj = (-apu.this.qor.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(apu.this.hnj, 30.0f));
                layoutParams5.leftMargin = iHnj;
                layoutParams5.setMarginStart(iHnj);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                apu.this.f12459hn.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) apu.this.gjv.getLayoutParams();
                layoutParams6.topMargin = (int) ((apu.this.qor.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.gjv.dse.hnj(apu.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((apu.this.qor.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(apu.this.hnj, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                apu.this.gjv.setLayoutParams(layoutParams6);
            }
        });
    }

    public void hn() {
        try {
            AnimatorSet animatorSet = this.dkl;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.aq;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.ojm;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.dse;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void hnj() {
        gjv();
        this.dkl.start();
        this.dkl.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.dkl.apu.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                apu.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.apu.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        apu.this.dkl.start();
                    }
                }, 200L);
            }
        });
    }
}
