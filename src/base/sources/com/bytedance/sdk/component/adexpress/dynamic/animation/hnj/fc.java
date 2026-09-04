package com.bytedance.sdk.component.adexpress.dynamic.animation.hnj;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc extends gjv {
    public fc(View view, com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj hnjVar) {
        super(view, hnjVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.gjv
    List<ObjectAnimator> hnj() {
        float f10;
        float fHnj = com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.f12512hn.dkl());
        float fHnj2 = com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.f12512hn.dse());
        float f11 = 0.0f;
        if ("reverse".equals(this.f12512hn.jip())) {
            f10 = fHnj2;
            fHnj2 = 0.0f;
            f11 = fHnj;
            fHnj = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.gjv.hn.hnj(this.qor.getContext())) {
            fHnj = -fHnj;
            f11 = -f11;
        }
        this.qor.setTranslationX(fHnj);
        this.qor.setTranslationY(fHnj2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.qor, "translationX", fHnj, f11).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.qor, "translationY", fHnj2, f10).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hnj(duration));
        arrayList.add(hnj(duration2));
        return arrayList;
    }
}
