package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends FrameLayout {
    private int aq;
    private View dkl;
    private ImageView dse;
    private View gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private ObjectAnimator f12482hn;
    private AnimatorSet hnj;
    private int ojm;
    private boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private View f12483sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private Context f12484ta;

    public hn(Context context, int i10, int i11) {
        super(context);
        this.qor = false;
        this.hnj = new AnimatorSet();
        this.aq = i10;
        this.ojm = i11;
        this.f12484ta = context;
        qor();
        gjv();
    }

    private void gjv() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.gjv, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.gjv, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f12483sk, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f12483sk, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.dkl, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.dkl, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.dse, "rotation", 0.0f, -20.0f, 0.0f);
        this.f12482hn = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.hnj.setDuration(1500L);
        this.hnj.setInterpolator(new AccelerateDecelerateInterpolator());
        this.hnj.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.hnj.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.hn.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                hn.this.qor = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (hn.this.qor) {
                    return;
                }
                hn.this.f12482hn.start();
                hn.this.hnj.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void qor() {
        View view = new View(this.f12484ta);
        this.gjv = view;
        view.setBackground(hnj("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.aq) * 0.45d), (int) (((double) this.ojm) * 0.45d));
        layoutParams.gravity = 17;
        this.gjv.setLayoutParams(layoutParams);
        addView(this.gjv);
        View view2 = new View(this.f12484ta);
        this.f12483sk = view2;
        view2.setBackground(hnj("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.aq) * 0.25d), (int) (((double) this.ojm) * 0.25d));
        layoutParams2.gravity = 17;
        this.f12483sk.setLayoutParams(layoutParams2);
        addView(this.f12483sk);
        View view3 = new View(this.f12484ta);
        this.dkl = view3;
        view3.setBackground(hnj("#807BBEFF", "#FF7BBEFF"));
        int i10 = this.aq;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i10) * 0.25d), (int) (((double) i10) * 0.25d));
        layoutParams3.gravity = 17;
        this.dkl.setLayoutParams(layoutParams3);
        addView(this.dkl);
        ImageView imageView = new ImageView(this.f12484ta);
        this.dse = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.wu.gjv(getContext(), "tt_blue_hand"));
        this.dse.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.aq) * 0.62d), (int) (((double) this.ojm) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.dse.setLayoutParams(layoutParams4);
        addView(this.dse);
    }

    public void hn() {
        this.qor = true;
        ObjectAnimator objectAnimator = this.f12482hn;
        if (objectAnimator == null || this.hnj == null) {
            return;
        }
        objectAnimator.cancel();
        this.hnj.cancel();
    }

    private GradientDrawable hnj(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void hnj() {
        this.qor = false;
        ObjectAnimator objectAnimator = this.f12482hn;
        if (objectAnimator == null || this.hnj == null) {
            return;
        }
        objectAnimator.start();
        this.hnj.start();
    }
}
