package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.Cdo;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj extends LinearLayout {
    private LinearLayout aq;
    private JSONObject bug;
    private TextView dkl;
    private int dnm;
    private hnj dse;
    private Cdo gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private TextView f12492hn;
    private TextView hnj;
    private int ojm;
    private ImageView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private TextView f12493sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f12494ta;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dkl.oj$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (oj.this.qor != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new hn(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.dkl.oj.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        oj.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.oj.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                oj.this.qor.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                oj.this.qor.startAnimation(rotateAnimation);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn implements Interpolator {
        private hn() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 <= 0.25f) {
                return (f10 * (-2.0f)) + 0.5f;
            }
            if (f10 <= 0.5f) {
                return (f10 * 4.0f) - 1.0f;
            }
            return f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }

        /* synthetic */ hn(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
    }

    public oj(Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        this.ojm = i10;
        this.f12494ta = i11;
        this.dnm = i12;
        this.bug = jSONObject;
        hnj(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.aq;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.gjv == null) {
                this.gjv = new Cdo(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.dkl.oj.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setOnShakeViewListener(hnj hnjVar) {
        this.dse = hnjVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f12493sk.setText(str);
        } else {
            this.f12493sk.setVisibility(8);
            this.dkl.setVisibility(8);
        }
    }

    protected void hnj(Context context, View view) {
        addView(view);
        this.aq = (LinearLayout) findViewById(2097610727);
        this.qor = (ImageView) findViewById(2097610725);
        this.hnj = (TextView) findViewById(2097610724);
        this.f12492hn = (TextView) findViewById(2097610726);
        this.f12493sk = (TextView) findViewById(2097610723);
        this.dkl = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.aq.setBackground(gradientDrawable);
    }

    public void hnj() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }
}
