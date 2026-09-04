package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class eum extends RelativeLayout {
    private AnimatorSet aq;
    private AnimatorSet dkl;
    private int dnm;
    private AnimatorSet dse;
    private TextView gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private ImageView f12474hn;
    private ImageView hnj;
    private AnimatorSet ojm;
    private ImageView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private TextView f12475sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f12476ta;

    public eum(Context context) {
        super(context);
        this.dkl = new AnimatorSet();
        this.dse = new AnimatorSet();
        this.aq = new AnimatorSet();
        this.ojm = new AnimatorSet();
        this.dnm = 100;
        hnj(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.dkl;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hn();
    }

    public void qor() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.hnj, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.hnj, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.hnj, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), -this.dnm));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), this.dnm));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.eum.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (eum.this.qor != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) eum.this.qor.getLayoutParams();
                    layoutParams.height = num.intValue();
                    eum.this.qor.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.qor, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.qor, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f12474hn, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f12474hn, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f12474hn, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.f12474hn, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.f12474hn, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), -this.dnm));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.dse.setDuration(50L);
        this.ojm.setDuration(1500L);
        this.aq.setDuration(50L);
        this.dse.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.aq.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.ojm.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.dkl.playSequentially(this.aq, this.ojm, this.dse);
    }

    public void setGuideText(String str) {
        TextView textView = this.gjv;
        if (textView != null) {
            textView.setText(str);
        }
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
            AnimatorSet animatorSet3 = this.dse;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.ojm;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    protected void hnj(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.gjv.hnj();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.f12476ta)) {
            addView(com.bytedance.sdk.component.adexpress.qor.hnj.dkl(context));
            this.dnm = (int) (((double) this.dnm) * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.qor.hnj.sk(context));
        }
        this.hnj = (ImageView) findViewById(2097610734);
        this.f12474hn = (ImageView) findViewById(2097610735);
        this.gjv = (TextView) findViewById(2097610730);
        this.qor = (ImageView) findViewById(2097610733);
        this.f12475sk = (TextView) findViewById(2097610731);
    }

    public void setSlideText(String str) {
        if (this.f12475sk != null) {
            if (TextUtils.isEmpty(str)) {
                this.f12475sk.setText(dmHT.gDnYdfEpZ);
            } else {
                this.f12475sk.setText(str);
            }
        }
    }

    public eum(Context context, String str) {
        super(context);
        this.dkl = new AnimatorSet();
        this.dse = new AnimatorSet();
        this.aq = new AnimatorSet();
        this.ojm = new AnimatorSet();
        this.dnm = 100;
        setClipChildren(false);
        this.f12476ta = str;
        hnj(context);
    }

    public void hnj() {
        qor();
        this.dkl.start();
        this.dkl.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.dkl.eum.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                eum.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.eum.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        eum.this.dkl.start();
                    }
                }, 200L);
            }
        });
    }
}
