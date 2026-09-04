package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends FrameLayout {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private AnimatorSet f12502hn;
    private ImageView hnj;

    public sk(Context context) {
        super(context);
        qor();
        gjv();
    }

    private void gjv() {
        this.f12502hn = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.hnj, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.hnj, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f12502hn.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void qor() {
        ImageView imageView = new ImageView(getContext());
        this.hnj = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.wu.gjv(getContext(), "tt_white_hand"));
        int iHnj = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iHnj, iHnj);
        layoutParams.gravity = 17;
        addView(this.hnj, layoutParams);
    }

    public void hn() {
        AnimatorSet animatorSet = this.f12502hn;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void hnj() {
        AnimatorSet animatorSet = this.f12502hn;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
