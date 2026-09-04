package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg {
    private com.bytedance.sdk.openadsdk.core.widget.dse dkl;
    private AnimatorSet dse;
    private final int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final as f13492hn;
    com.bytedance.sdk.openadsdk.core.widget.aq hnj;
    private final Context qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final hnj f13493sk;

    public mjg(hnj hnjVar) {
        this.qor = hnjVar.jbd;
        this.f13492hn = hnjVar.f13456hn;
        this.gjv = hnjVar.lu;
        this.f13493sk = hnjVar;
    }

    public View gjv() {
        return this.dkl;
    }

    public void hn() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.mjg.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.aq aqVar = mjg.this.hnj;
                if (aqVar != null) {
                    aqVar.setProgress(iIntValue);
                }
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
        valueAnimatorOfInt2.setDuration(3000L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.mjg.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.aq aqVar = mjg.this.hnj;
                if (aqVar != null) {
                    aqVar.setProgress(iIntValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.dse = animatorSet;
        animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
        this.dse.start();
    }

    public void hnj() {
        try {
            if (hqh.qor(this.f13492hn)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.dse dseVar = new com.bytedance.sdk.openadsdk.core.widget.dse(this.qor);
            this.dkl = dseVar;
            this.hnj = dseVar.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.dkl.aq downloadButton = this.dkl.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.f13493sk.tgn.sk());
            }
            this.dkl.hnj(this.f13492hn, this.gjv);
        } catch (Throwable unused) {
        }
    }

    public void qor() {
        AnimatorSet animatorSet = this.dse;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
