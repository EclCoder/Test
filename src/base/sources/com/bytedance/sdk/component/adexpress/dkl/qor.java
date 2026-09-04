package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.hqh;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends FrameLayout {
    private AnimatorSet dkl;
    private TextView gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private ImageView f12500hn;
    private Context hnj;
    private ImageView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private jip f12501sk;

    public qor(Context context) {
        super(context);
        this.dkl = new AnimatorSet();
        this.hnj = context;
        sk();
        dkl();
    }

    private void dkl() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.qor, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.qor, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.dkl.setDuration(800L);
        this.dkl.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void sk() {
        FrameLayout frameLayout = new FrameLayout(this.hnj);
        this.f12501sk = new jip(this.hnj);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 95.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.f12501sk, layoutParams);
        this.f12500hn = new ImageView(this.hnj);
        int iHnj = hqh.hnj(this.hnj, 60.0f);
        this.f12500hn.setImageDrawable(com.bytedance.sdk.component.adexpress.gjv.aq.hnj(1, null, null, new int[]{iHnj, iHnj}, Integer.valueOf(hqh.hnj(this.hnj, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 75.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f12500hn, layoutParams2);
        this.qor = new ImageView(this.hnj);
        int iHnj2 = hqh.hnj(this.hnj, 50.0f);
        this.qor.setImageDrawable(com.bytedance.sdk.component.adexpress.gjv.aq.hnj(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iHnj2, iHnj2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 63.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.hnj, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.qor, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.hnj);
        this.gjv = textView;
        textView.setTextColor(-1);
        this.gjv.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.gjv, layoutParams4);
    }

    public void gjv() {
        this.f12501sk.hn();
        this.f12501sk.qor();
    }

    public void hn() {
        this.dkl.cancel();
    }

    public void hnj() {
        this.dkl.start();
    }

    public void qor() {
        this.f12501sk.hnj();
    }

    public void setGuideText(String str) {
        this.gjv.setText(str);
    }
}
