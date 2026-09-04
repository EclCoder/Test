package com.bytedance.sdk.component.adexpress.dynamic.animation.hnj;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl extends gjv {
    public orl(View view, com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj hnjVar) {
        super(view, hnjVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.gjv
    List<ObjectAnimator> hnj() {
        View view = this.qor;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dnm)) {
            View view2 = (View) this.qor.getParent();
            this.qor = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.qor.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.qor, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hnj(duration));
        return arrayList;
    }
}
