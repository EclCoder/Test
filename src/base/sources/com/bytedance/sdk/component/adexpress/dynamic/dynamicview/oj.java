package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj extends dkl {
    public hn hnj;

    public oj(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    protected GradientDrawable getDrawable() {
        hn hnVar = new hn();
        this.hnj = hnVar;
        return hnVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    protected hn hnj(Bitmap bitmap) {
        hnj hnjVar = new hnj(bitmap, this.hnj);
        this.hnj = hnjVar;
        return hnjVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        return super.ojm();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    protected GradientDrawable hnj(GradientDrawable.Orientation orientation, int[] iArr) {
        hn hnVar = new hn(orientation, iArr);
        this.hnj = hnVar;
        return hnVar;
    }
}
