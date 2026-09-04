package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug implements dse {
    private com.bytedance.sdk.component.adexpress.dkl.orl hnj;

    public bug(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        this.hnj = new com.bytedance.sdk.component.adexpress.dkl.orl(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, 180.0f));
        layoutParams.gravity = 17;
        this.hnj.setLayoutParams(layoutParams);
        this.hnj.setGuideText(dseVar.eta());
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
