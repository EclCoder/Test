package com.bytedance.sdk.component.adexpress.dkl;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends eum {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private View f12473hn;
    private TextView hnj;
    private AnimatorSet qor;

    public dse(Context context) {
        super(context);
        this.qor = new AnimatorSet();
        hn(context);
    }

    private void gjv() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f12473hn, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f12473hn, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.qor.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.qor.setDuration(1000L);
        this.qor.start();
    }

    private void hn(Context context) {
        View viewHnj = com.bytedance.sdk.component.adexpress.qor.hnj.hnj(context);
        this.f12473hn = viewHnj;
        addView(viewHnj);
        setClipChildren(false);
        this.hnj = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.dkl.eum
    protected void hnj(Context context) {
    }

    public void setButtonText(String str) {
        if (this.hnj == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.hnj.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.dkl.eum
    public void hnj() {
        gjv();
    }

    @Override // com.bytedance.sdk.component.adexpress.dkl.eum
    public void hn() {
        this.qor.cancel();
    }
}
