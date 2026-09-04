package com.bytedance.sdk.component.adexpress.dynamic.animation.hnj;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends gjv {
    public sk(View view, com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj hnjVar) {
        super(view, hnjVar);
    }

    private void gjv(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.qor, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.f12512hn.apu())).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(hnj(duration));
    }

    private void hn(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.qor, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.f12512hn.apu())).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.sk.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                sk.this.qor.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(hnj(duration));
    }

    private void qor(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.qor, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.f12512hn.apu())).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.sk.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                sk.this.qor.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(hnj(duration));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.gjv
    List<ObjectAnimator> hnj() {
        ArrayList arrayList = new ArrayList();
        String strEum = this.f12512hn.eum();
        switch (strEum.hashCode()) {
            case 3029889:
                if (strEum.equals("both")) {
                    hnj(arrayList);
                    return arrayList;
                }
                break;
            case 3387192:
                strEum.equals(DevicePublicKeyStringDef.NONE);
                break;
            case 483313230:
                if (strEum.equals("forwards")) {
                    gjv(arrayList);
                    return arrayList;
                }
                break;
            case 1356771568:
                if (strEum.equals("backwards")) {
                    hn(arrayList);
                    return arrayList;
                }
                break;
        }
        qor(arrayList);
        return arrayList;
    }

    private void hnj(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.qor, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.f12512hn.apu())).setDuration(((int) (this.f12512hn.ta() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj hnjVar = this.f12512hn;
        hnjVar.dkl(hnjVar.fc() * 2);
        list.add(hnj(duration));
    }
}
