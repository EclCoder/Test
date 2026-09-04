package com.bytedance.sdk.component.adexpress.dynamic.animation.hnj;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug extends gjv {
    public bug(View view, com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj hnjVar) {
        super(view, hnjVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.gjv
    List<ObjectAnimator> hnj() {
        int i10;
        int i11;
        this.qor.setTag(2097610711, Integer.valueOf(this.f12512hn.gjv()));
        View view = this.qor;
        if (view == null || !com.bytedance.sdk.component.adexpress.gjv.hn.hnj(view.getContext())) {
            i10 = 0;
            i11 = 1;
        } else {
            i11 = 0;
            i10 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.qor, "shineValue", i10, i11).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hnj(duration));
        return arrayList;
    }
}
