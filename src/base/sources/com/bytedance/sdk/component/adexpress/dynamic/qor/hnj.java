package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements dse {
    private com.bytedance.sdk.component.adexpress.dkl.hn hnj;

    public hnj(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        double dGn = dseVar.gn();
        dGn = dGn == 0.0d ? 1.0d : dGn;
        double dDy = dseVar.dy();
        double d10 = dDy != 0.0d ? dDy : 1.0d;
        int dynamicWidth = (int) (((double) skVar.getDynamicWidth()) * 0.32d * dGn);
        int dynamicWidth2 = (int) (((double) skVar.getDynamicWidth()) * 0.32d * d10);
        this.hnj = new com.bytedance.sdk.component.adexpress.dkl.hn(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, dseVar.qb() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, dseVar.fr() - 3);
        this.hnj.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hn() {
        this.hnj.hn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hnj() {
        this.hnj.hnj();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public ViewGroup qor() {
        return this.hnj;
    }
}
