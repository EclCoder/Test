package com.bytedance.sdk.component.adexpress.dynamic.animation.hnj;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends gjv {
    private float dkl;
    private hnj gjv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f12516sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private View f12518hn;

        public hnj(View view) {
            this.f12518hn = view;
        }

        public void hnj(int i10) {
            if (!"top".equals(ta.this.f12512hn.hnj())) {
                ViewGroup.LayoutParams layoutParams = this.f12518hn.getLayoutParams();
                layoutParams.height = i10;
                this.f12518hn.setLayoutParams(layoutParams);
                this.f12518hn.requestLayout();
                return;
            }
            if (ta.this.qor instanceof ViewGroup) {
                for (int i11 = 0; i11 < ((ViewGroup) ta.this.qor).getChildCount(); i11++) {
                    ((ViewGroup) ta.this.qor).getChildAt(i11).setTranslationY(i10 - ta.this.f12516sk);
                }
            }
            ta taVar = ta.this;
            taVar.qor.setTranslationY(taVar.f12516sk - i10);
        }
    }

    public ta(View view, com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj hnjVar) {
        super(view, hnjVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.gjv
    List<ObjectAnimator> hnj() {
        int i10;
        String str;
        View view = this.qor;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk)) {
            this.qor = (View) this.qor.getParent();
        }
        this.qor.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.qor, "alpha", 0.0f, 1.0f).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        this.gjv = new hnj(this.qor);
        final int i11 = this.qor.getLayoutParams().height;
        this.f12516sk = i11;
        this.dkl = this.qor.getLayoutParams().width;
        if (TtmlNode.LEFT.equals(this.f12512hn.hnj()) || TtmlNode.RIGHT.equals(this.f12512hn.hnj())) {
            i10 = (int) this.dkl;
            str = "width";
        } else {
            str = "height";
            i10 = i11;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.gjv, str, 0, i10).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hnj(duration));
        arrayList.add(hnj(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.ta.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ta.this.gjv.hnj(i11);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        return arrayList;
    }
}
