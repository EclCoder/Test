package com.bytedance.sdk.component.adexpress.dynamic.animation.hnj;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends gjv {
    public aq(View view, com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj hnjVar) {
        super(view, hnjVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.gjv
    List<ObjectAnimator> hnj() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.qor, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        ((ViewGroup) this.qor.getParent()).setClipChildren(false);
        ((ViewGroup) this.qor.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.qor.getParent().getParent().getParent()).setClipChildren(false);
        this.qor.setTag(2097610712, this.f12512hn.aq());
        ArrayList arrayList = new ArrayList();
        arrayList.add(hnj(duration));
        return arrayList;
    }
}
