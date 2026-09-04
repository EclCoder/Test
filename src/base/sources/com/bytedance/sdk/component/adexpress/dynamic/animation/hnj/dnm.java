package com.bytedance.sdk.component.adexpress.dynamic.animation.hnj;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm extends gjv {
    public dnm(View view, com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj hnjVar) {
        super(view, hnjVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.gjv
    List<ObjectAnimator> hnj() {
        float f10;
        float fDnm = (float) this.f12512hn.dnm();
        float fBug = (float) this.f12512hn.bug();
        String strJip = this.f12512hn.jip();
        float f11 = 1.0f;
        if ("reverse".equals(strJip) || "alternate-reverse".equals(strJip)) {
            f10 = 1.0f;
        } else {
            f10 = fBug;
            fBug = 1.0f;
            f11 = fDnm;
            fDnm = 1.0f;
        }
        this.qor.setTag(2097610710, this.f12512hn.hn());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.qor, "scaleX", fDnm, f11).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.qor, "scaleY", fBug, f10).setDuration((int) (this.f12512hn.ta() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hnj(duration));
        arrayList.add(hnj(duration2));
        return arrayList;
    }
}
